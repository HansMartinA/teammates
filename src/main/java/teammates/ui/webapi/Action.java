package teammates.ui.webapi;

import java.lang.reflect.Type;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import teammates.common.datatransfer.InstructorPermissionSet;
import teammates.common.datatransfer.UserInfo;
import teammates.common.datatransfer.UserInfoCookie;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.logs.RequestLogUser;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.HttpRequestHelper;
import teammates.common.util.JsonUtils;
import teammates.common.util.StringHelper;
import teammates.logic.api.EmailGenerator;
import teammates.logic.api.EmailSender;
import teammates.logic.api.FileStorage;
import teammates.logic.api.Logic;
import teammates.logic.api.LogsProcessor;
import teammates.logic.api.RecaptchaVerifier;
import teammates.logic.api.TaskQueuer;
import teammates.logic.api.UserProvision;
import teammates.ui.request.BasicRequest;
import teammates.ui.request.InvalidHttpRequestBodyException;
public abstract class Action {
Logic logic = Logic.inst();

UserProvision userProvision = UserProvision.inst();

GateKeeper gateKeeper = GateKeeper.inst();

EmailGenerator emailGenerator = EmailGenerator.inst();

TaskQueuer taskQueuer = TaskQueuer.inst();

EmailSender emailSender = EmailSender.inst();

FileStorage fileStorage = FileStorage.inst();

RecaptchaVerifier recaptchaVerifier = RecaptchaVerifier.inst();

LogsProcessor logsProcessor = LogsProcessor.inst();

HttpServletRequest req;

UserInfo userInfo;

AuthType authType;

private StudentAttributes unregisteredStudent;

private InstructorAttributes unregisteredInstructor;

private String requestBody;

public  void init(HttpServletRequest req) {
this.req = req;
initAuthInfo();
}

public  void setUserProvision(UserProvision userProvision) {
this.userProvision = userProvision;
}

public  void setTaskQueuer(TaskQueuer taskQueuer) {
this.taskQueuer = taskQueuer;
}

public  void setEmailSender(EmailSender emailSender) {
this.emailSender = emailSender;
}

public  void setFileStorage(FileStorage fileStorage) {
this.fileStorage = fileStorage;
}

public  void setRecaptchaVerifier(RecaptchaVerifier recaptchaVerifier) {
this.recaptchaVerifier = recaptchaVerifier;
}

public  void setLogsProcessor(LogsProcessor logsProcessor) {
this.logsProcessor = logsProcessor;
}

public  void checkAccessControl()throws UnauthorizedAccessException {
String userParam = getRequestParamValue(Const.ParamsNames.USER_ID);
if (userInfo != null && userParam != null && !userInfo.isAdmin && !userInfo.id.equals(userParam))
{
throw new  UnauthorizedAccessException("User " + userInfo.id + " is trying to masquerade as " + userParam + " without admin permission.");
}
if (authType.getLevel() < getMinAuthLevel().getLevel())
{
throw new  UnauthorizedAccessException("Not authorized to access this resource.");
}
if (authType == AuthType.ALL_ACCESS)
{
return;
}
checkSpecificAccessControl();
}

public  RequestLogUser getUserInfoForLogging() {
RequestLogUser user = new  RequestLogUser();
String googleId = userInfo == null ? null : userInfo.getId();
user.setGoogleId(googleId);
if (unregisteredStudent == null && unregisteredInstructor == null)
{
user.setRegkey(getRequestParamValue(Const.ParamsNames.REGKEY));
}
else
if (unregisteredStudent != null)
{
user.setRegkey(unregisteredStudent.getKey());
user.setEmail(unregisteredStudent.getEmail());
}
else
{
user.setRegkey(unregisteredInstructor.getKey());
user.setEmail(unregisteredInstructor.getEmail());
}
return user;
}

private  void initAuthInfo() {
if (Config.BACKDOOR_KEY.equals(req.getHeader(Const.HeaderNames.BACKDOOR_KEY)))
{
authType = AuthType.ALL_ACCESS;
userInfo = userProvision.getAdminOnlyUser(getRequestParamValue(Const.ParamsNames.USER_ID));
userInfo.isStudent = true;
userInfo.isInstructor = true;
return;
}
String queueNameHeader = req.getHeader("X-AppEngine-QueueName");
boolean isRequestFromAppEngineQueue = queueNameHeader != null;
if (isRequestFromAppEngineQueue)
{
userInfo = userProvision.getAdminOnlyUser("AppEngine-" + queueNameHeader);
}
else
{
String cookie = HttpRequestHelper.getCookieValueFromRequest(req, Const.SecurityConfig.AUTH_COOKIE_NAME);
UserInfoCookie uic = UserInfoCookie.fromCookie(cookie);
userInfo = userProvision.getCurrentUser(uic);
}
authType = userInfo == null ? AuthType.PUBLIC : AuthType.LOGGED_IN;
String userParam = getRequestParamValue(Const.ParamsNames.USER_ID);
if (userInfo != null && userParam != null && userInfo.isAdmin)
{
userInfo = userProvision.getMasqueradeUser(userParam);
authType = AuthType.MASQUERADE;
}
}

 String getRequestParamValue(String paramName) {
return req.getParameter(paramName);
}

 String getNonNullRequestParamValue(String paramName) {
String value = req.getParameter(paramName);
if (value == null)
{
throw new  InvalidHttpParameterException(String.format("The [%s] HTTP parameter is null.", paramName));
}
return value;
}

 boolean getBooleanRequestParamValue(String paramName) {
String value = getNonNullRequestParamValue(paramName);
try {
return Boolean.parseBoolean(value);
}
catch(IllegalArgumentException e){
throw new  InvalidHttpParameterException("Expected boolean value for " + paramName + " parameter, but found: [" + value + "]", e);
}
}

 long getLongRequestParamValue(String paramName) {
String value = getNonNullRequestParamValue(paramName);
try {
return Long.parseLong(value);
}
catch(IllegalArgumentException e){
throw new  InvalidHttpParameterException("Expected long value for " + paramName + " parameter, but found: [" + value + "]", e);
}
}

public  String getRequestBody() {
if (!hasDefinedRequestBody())
{
requestBody = HttpRequestHelper.getRequestBody(req);
}
return requestBody;
}

public  boolean hasDefinedRequestBody() {
return requestBody != null;
}

 FeedbackSessionAttributes getNonNullFeedbackSession(String feedbackSessionName, String courseId) {
FeedbackSessionAttributes feedbackSession = logic.getFeedbackSession(feedbackSessionName, courseId);
if (feedbackSession == null)
{
throw new  EntityNotFoundException("Feedback session not found");
}
return feedbackSession;
}

<T extends BasicRequest>  T getAndValidateRequestBody(Type typeOfBody)throws InvalidHttpRequestBodyException {
T requestBody = JsonUtils.fromJson(getRequestBody(), typeOfBody);
if (requestBody == null)
{
throw new  InvalidHttpRequestBodyException("The request body is null");
}
requestBody.validate();
return requestBody;
}

 Optional<StudentAttributes> getUnregisteredStudent() {
String key = getRequestParamValue(Const.ParamsNames.REGKEY);
if (!StringHelper.isEmpty(key))
{
StudentAttributes studentAttributes = logic.getStudentForRegistrationKey(key);
if (studentAttributes == null)
{
return Optional.empty();
}
unregisteredStudent = studentAttributes;
return Optional.of(studentAttributes);
}
return Optional.empty();
}

 Optional<InstructorAttributes> getUnregisteredInstructor() {
String key = getRequestParamValue(Const.ParamsNames.REGKEY);
if (!StringHelper.isEmpty(key))
{
InstructorAttributes instructorAttributes = logic.getInstructorForRegistrationKey(key);
if (instructorAttributes == null)
{
return Optional.empty();
}
unregisteredInstructor = instructorAttributes;
return Optional.of(instructorAttributes);
}
return Optional.empty();
}

 InstructorPermissionSet constructInstructorPrivileges(InstructorAttributes instructor, String feedbackSessionName) {
InstructorPermissionSet privilege = instructor.getPrivileges().getCourseLevelPrivileges();
if (feedbackSessionName != null)
{
privilege.setCanSubmitSessionInSections(instructor.isAllowedForPrivilege(Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS) || instructor.isAllowedForPrivilegeAnySection(feedbackSessionName, Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS));
privilege.setCanViewSessionInSections(instructor.isAllowedForPrivilege(Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS) || instructor.isAllowedForPrivilegeAnySection(feedbackSessionName, Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS));
privilege.setCanModifySessionCommentsInSections(instructor.isAllowedForPrivilege(Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS) || instructor.isAllowedForPrivilegeAnySection(feedbackSessionName, Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS));
}
return privilege;
}

abstract  AuthType getMinAuthLevel() ;

abstract  void checkSpecificAccessControl()throws UnauthorizedAccessException ;

public abstract  ActionResult execute()throws InvalidHttpRequestBodyException, InvalidOperationException ;

}
