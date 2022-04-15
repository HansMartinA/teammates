package teammates.logic.api;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import teammates.common.datatransfer.DataBundle;
import teammates.common.datatransfer.SessionResultsBundle;
import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.attributes.AccountRequestAttributes;
import teammates.common.datatransfer.attributes.CourseAttributes;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.attributes.StudentProfileAttributes;
import teammates.common.exception.EnrollException;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InstructorUpdateException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.exception.SearchServiceException;
import teammates.logic.core.AccountRequestsLogic;
import teammates.logic.core.AccountsLogic;
import teammates.logic.core.CoursesLogic;
import teammates.logic.core.DataBundleLogic;
import teammates.logic.core.FeedbackQuestionsLogic;
import teammates.logic.core.FeedbackResponseCommentsLogic;
import teammates.logic.core.FeedbackResponsesLogic;
import teammates.logic.core.FeedbackSessionsLogic;
import teammates.logic.core.InstructorsLogic;
import teammates.logic.core.ProfilesLogic;
import teammates.logic.core.StudentsLogic;
public class Logic {
private static final Logic instance = new  Logic();

final AccountsLogic accountsLogic = AccountsLogic.inst();

final AccountRequestsLogic accountRequestsLogic = AccountRequestsLogic.inst();

final StudentsLogic studentsLogic = StudentsLogic.inst();

final InstructorsLogic instructorsLogic = InstructorsLogic.inst();

final CoursesLogic coursesLogic = CoursesLogic.inst();

final FeedbackSessionsLogic feedbackSessionsLogic = FeedbackSessionsLogic.inst();

final FeedbackQuestionsLogic feedbackQuestionsLogic = FeedbackQuestionsLogic.inst();

final FeedbackResponsesLogic feedbackResponsesLogic = FeedbackResponsesLogic.inst();

final FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = FeedbackResponseCommentsLogic.inst();

final ProfilesLogic profilesLogic = ProfilesLogic.inst();

final DataBundleLogic dataBundleLogic = DataBundleLogic.inst();

 Logic(){
}
public static  Logic inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_cec6ELvVEeyr6avTgCRLkQ", Logic.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cefWULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Logic longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302495200141291515297034 = instance;
threadMonitoringController.exitInternalAction("_cefWULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302495200141291515297034;
}
finally {
threadMonitoringController.exitService("_cec6ELvVEeyr6avTgCRLkQ");
}
}

public  AccountAttributes getAccount(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_ceiZoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cekO0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024966007857383842192076 = accountsLogic.getAccount(googleId);
threadMonitoringController.exitInternalAction("_cekO0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024966007857383842192076;
}
finally {
threadMonitoringController.exitService("_ceiZoLvVEeyr6avTgCRLkQ");
}
}

public  String getCourseInstitute(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cen5MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ceqVcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024979009116830486365675 = coursesLogic.getCourseInstitute(courseId);
threadMonitoringController.exitInternalAction("_ceqVcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024979009116830486365675;
}
finally {
threadMonitoringController.exitService("_cen5MLvVEeyr6avTgCRLkQ");
}
}

public  StudentProfileAttributes updateOrCreateStudentProfile(StudentProfileAttributes.UpdateOptions updateOptions)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_cetYwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cevN8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024992004807746624098034 = profilesLogic.updateOrCreateStudentProfile(updateOptions);
threadMonitoringController.exitInternalAction("_cevN8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024992004807746624098034;
}
finally {
threadMonitoringController.exitService("_cetYwLvVEeyr6avTgCRLkQ");
}
}

public  void deleteAccountCascade(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_cezfYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ce1UkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
accountsLogic.deleteAccountCascade(googleId);
threadMonitoringController.exitInternalAction("_ce1UkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cezfYLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes createInstructor(InstructorAttributes instructor)throws InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_ce4-8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ce60ILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructor != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025017006191749597719972 = instructorsLogic.createInstructor(instructor);
threadMonitoringController.exitInternalAction("_ce60ILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025017006191749597719972;
}
finally {
threadMonitoringController.exitService("_ce4-8LvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> searchInstructorsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_ce-egLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfA6wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert queryString != null;
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302503100029782976112405657 = instructorsLogic.searchInstructorsInWholeSystem(queryString);
threadMonitoringController.exitInternalAction("_cfA6wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302503100029782976112405657;
}
finally {
threadMonitoringController.exitService("_ce-egLvVEeyr6avTgCRLkQ");
}
}

public  void putInstructorDocument(InstructorAttributes instructor)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_cfElILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfHBYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructorsLogic.putDocument(instructor);
threadMonitoringController.exitInternalAction("_cfHBYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cfElILvVEeyr6avTgCRLkQ");
}
}

public  void updateToEnsureValidityOfInstructorsForTheCourse(String courseId, InstructorAttributes instructorToEdit) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("instructorToEdit", instructorToEdit);
threadMonitoringController.enterService("_cfKEsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfMg8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert instructorToEdit != null;
instructorsLogic.updateToEnsureValidityOfInstructorsForTheCourse(courseId, instructorToEdit);
threadMonitoringController.exitInternalAction("_cfMg8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cfKEsLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorForEmail(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_cfQLULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfSAgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130250710008560040182478812 = instructorsLogic.getInstructorForEmail(courseId, email);
threadMonitoringController.exitInternalAction("_cfSAgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130250710008560040182478812;
}
finally {
threadMonitoringController.exitService("_cfQLULvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorById(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_cfVq4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfXgELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302508400024077741107009665 = instructorsLogic.getInstructorById(courseId, email);
threadMonitoringController.exitInternalAction("_cfXgELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302508400024077741107009665;
}
finally {
threadMonitoringController.exitService("_cfVq4LvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorForGoogleId(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_cfbKcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfc_oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert courseId != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302509800393073611316923 = instructorsLogic.getInstructorForGoogleId(courseId, googleId);
threadMonitoringController.exitInternalAction("_cfc_oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302509800393073611316923;
}
finally {
threadMonitoringController.exitService("_cfbKcLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_cfhRELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfjGQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130251110030523937948667557 = instructorsLogic.getInstructorForRegistrationKey(registrationKey);
threadMonitoringController.exitInternalAction("_cfjGQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130251110030523937948667557;
}
finally {
threadMonitoringController.exitService("_cfhRELvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> getInstructorsForGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_cfnXsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfpz8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130251230012024258831595236 = instructorsLogic.getInstructorsForGoogleId(googleId);
threadMonitoringController.exitInternalAction("_cfpz8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130251230012024258831595236;
}
finally {
threadMonitoringController.exitService("_cfnXsLvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> getInstructorsForGoogleId(String googleId, boolean omitArchived) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
monitoringServiceParameters.addValue("omitArchived", omitArchived);
threadMonitoringController.enterService("_cfxIsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cfy94LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130251370034961736774591234 = instructorsLogic.getInstructorsForGoogleId(googleId, omitArchived);
threadMonitoringController.exitInternalAction("_cfy94LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130251370034961736774591234;
}
finally {
threadMonitoringController.exitService("_cfxIsLvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> getInstructorsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cf3PULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cf5EgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130251500004842607856646797 = instructorsLogic.getInstructorsForCourse(courseId);
threadMonitoringController.exitInternalAction("_cf5EgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130251500004842607856646797;
}
finally {
threadMonitoringController.exitService("_cf3PULvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getAllOngoingSessions(Instant rangeStart, Instant rangeEnd) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rangeStart", rangeStart);
monitoringServiceParameters.addValue("rangeEnd", rangeEnd);
threadMonitoringController.enterService("_cf8u4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cf_LILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025162007388546895921874 = feedbackSessionsLogic.getAllOngoingSessions(rangeStart, rangeEnd);
threadMonitoringController.exitInternalAction("_cf_LILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025162007388546895921874;
}
finally {
threadMonitoringController.exitService("_cf8u4LvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes updateInstructorCascade(InstructorAttributes.UpdateOptionsWithGoogleId updateOptions)throws InstructorUpdateException, InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_cgC1gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cgFRwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025178007092690055477613 = instructorsLogic.updateInstructorByGoogleIdCascade(updateOptions);
threadMonitoringController.exitInternalAction("_cgFRwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025178007092690055477613;
}
finally {
threadMonitoringController.exitService("_cgC1gLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes updateInstructor(InstructorAttributes.UpdateOptionsWithEmail updateOptions)throws InstructorUpdateException, InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_cgJjMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cgLYYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025190006204261268483703 = instructorsLogic.updateInstructorByEmail(updateOptions);
threadMonitoringController.exitInternalAction("_cgLYYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025190006204261268483703;
}
finally {
threadMonitoringController.exitService("_cgJjMLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes joinCourseForInstructor(String regkey, String googleId)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("regkey", regkey);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_cgPCwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cgQ38LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert regkey != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130252040041242987994419356 = accountsLogic.joinCourseForInstructor(regkey, googleId);
threadMonitoringController.exitInternalAction("_cgQ38LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130252040041242987994419356;
}
finally {
threadMonitoringController.exitService("_cgPCwLvVEeyr6avTgCRLkQ");
}
}

public  void downgradeInstructorToStudentCascade(String googleId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_cgVwcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cgXloLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
accountsLogic.downgradeInstructorToStudentCascade(googleId);
threadMonitoringController.exitInternalAction("_cgXloLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cgVwcLvVEeyr6avTgCRLkQ");
}
}

public  void deleteInstructorCascade(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_cgbQALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cgdFMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
instructorsLogic.deleteInstructorCascade(courseId, email);
threadMonitoringController.exitInternalAction("_cgdFMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cgbQALvVEeyr6avTgCRLkQ");
}
}

public  void createCourseAndInstructor(String instructorGoogleId, CourseAttributes courseAttributes)throws EntityAlreadyExistsException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorGoogleId", instructorGoogleId);
monitoringServiceParameters.addValue("courseAttributes", courseAttributes);
threadMonitoringController.enterService("_cghWoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cgjL0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorGoogleId != null;
assert courseAttributes != null;
coursesLogic.createCourseAndInstructor(instructorGoogleId, courseAttributes);
threadMonitoringController.exitInternalAction("_cgjL0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cghWoLvVEeyr6avTgCRLkQ");
}
}

public  CourseAttributes getCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cgorYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cgrHoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130252540029747637078447886 = coursesLogic.getCourse(courseId);
threadMonitoringController.exitInternalAction("_cgrHoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130252540029747637078447886;
}
finally {
threadMonitoringController.exitService("_cgorYLvVEeyr6avTgCRLkQ");
}
}

public  List<CourseAttributes> getCoursesForStudentAccount(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_cgvZELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cgx1ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025266004512357333948712 = coursesLogic.getCoursesForStudentAccount(googleId);
threadMonitoringController.exitInternalAction("_cgx1ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025266004512357333948712;
}
finally {
threadMonitoringController.exitService("_cgvZELvVEeyr6avTgCRLkQ");
}
}

public  List<CourseAttributes> getCoursesForInstructor(List<InstructorAttributes> instructorList) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorList", instructorList);
threadMonitoringController.enterService("_cg2t0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cg4jALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorList != null;
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130252790044564654291976347 = coursesLogic.getCoursesForInstructor(instructorList);
threadMonitoringController.exitInternalAction("_cg4jALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130252790044564654291976347;
}
finally {
threadMonitoringController.exitService("_cg2t0LvVEeyr6avTgCRLkQ");
}
}

public  List<CourseAttributes> getSoftDeletedCoursesForInstructors(List<InstructorAttributes> instructorList) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorList", instructorList);
threadMonitoringController.enterService("_cg80cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cg-poLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorList != null;
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025293003262419543576853 = coursesLogic.getSoftDeletedCoursesForInstructors(instructorList);
threadMonitoringController.exitInternalAction("_cg-poLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025293003262419543576853;
}
finally {
threadMonitoringController.exitService("_cg80cLvVEeyr6avTgCRLkQ");
}
}

public  CourseAttributes updateCourseCascade(CourseAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_chDiILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_chF-YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025306008901893691547819 = coursesLogic.updateCourseCascade(updateOptions);
threadMonitoringController.exitInternalAction("_chF-YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025306008901893691547819;
}
finally {
threadMonitoringController.exitService("_chDiILvVEeyr6avTgCRLkQ");
}
}

public  void setArchiveStatusOfInstructor(String googleId, String courseId, boolean archiveStatus)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("archiveStatus", archiveStatus);
threadMonitoringController.enterService("_chJowLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_chLd8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert courseId != null;
instructorsLogic.setArchiveStatusOfInstructor(googleId, courseId, archiveStatus);
threadMonitoringController.exitInternalAction("_chLd8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_chJowLvVEeyr6avTgCRLkQ");
}
}

public  void deleteCourseCascade(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_chPIULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_chQ9gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
coursesLogic.deleteCourseCascade(courseId);
threadMonitoringController.exitInternalAction("_chQ9gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_chPIULvVEeyr6avTgCRLkQ");
}
}

public  Instant moveCourseToRecycleBin(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_chVO8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_chXrMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025342007318811325759149 = coursesLogic.moveCourseToRecycleBin(courseId);
threadMonitoringController.exitInternalAction("_chXrMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025342007318811325759149;
}
finally {
threadMonitoringController.exitService("_chVO8LvVEeyr6avTgCRLkQ");
}
}

public  void restoreCourseFromRecycleBin(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_chcjsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cheY4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
coursesLogic.restoreCourseFromRecycleBin(courseId);
threadMonitoringController.exitInternalAction("_cheY4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_chcjsLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> searchStudents(String queryString, List<InstructorAttributes> instructors)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
monitoringServiceParameters.addValue("instructors", instructors);
threadMonitoringController.enterService("_chiDQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_chkfgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert queryString != null;
assert instructors != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130253650035922113045842896 = studentsLogic.searchStudents(queryString, instructors);
threadMonitoringController.exitInternalAction("_chkfgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130253650035922113045842896;
}
finally {
threadMonitoringController.exitService("_chiDQLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> searchStudentsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_chow8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_chqmILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert queryString != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130253770004116562582260952 = studentsLogic.searchStudentsInWholeSystem(queryString);
threadMonitoringController.exitInternalAction("_chqmILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130253770004116562582260952;
}
finally {
threadMonitoringController.exitService("_chow8LvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes getStudentForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_chu3kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_chwswLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130253910039379360088626214 = studentsLogic.getStudentForRegistrationKey(registrationKey);
threadMonitoringController.exitInternalAction("_chwswLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130253910039379360088626214;
}
finally {
threadMonitoringController.exitService("_chu3kLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes getStudentForEmail(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_ch0-MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ch2zYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025404003096366130996989 = studentsLogic.getStudentForEmail(courseId, email);
threadMonitoringController.exitInternalAction("_ch2zYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025404003096366130996989;
}
finally {
threadMonitoringController.exitService("_ch0-MLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes getStudentForGoogleId(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_ch7E0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ch9hELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert googleId != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302541700393569090336634 = studentsLogic.getStudentForCourseIdAndGoogleId(courseId, googleId);
threadMonitoringController.exitInternalAction("_ch9hELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302541700393569090336634;
}
finally {
threadMonitoringController.exitService("_ch7E0LvVEeyr6avTgCRLkQ");
}
}

public  StudentProfileAttributes getStudentProfile(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_ciDnsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ciFc4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025428007549674156298339 = profilesLogic.getStudentProfile(googleId);
threadMonitoringController.exitInternalAction("_ciFc4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025428007549674156298339;
}
finally {
threadMonitoringController.exitService("_ciDnsLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getStudentsForGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_ciJHQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ciK8cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130254400012484638549707539 = studentsLogic.getStudentsForGoogleId(googleId);
threadMonitoringController.exitInternalAction("_ciK8cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130254400012484638549707539;
}
finally {
threadMonitoringController.exitService("_ciJHQLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getStudentsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ciPN4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ciRDELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302545200995994652601782 = studentsLogic.getStudentsForCourse(courseId);
threadMonitoringController.exitInternalAction("_ciRDELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302545200995994652601782;
}
finally {
threadMonitoringController.exitService("_ciPN4LvVEeyr6avTgCRLkQ");
}
}

public  List<String> getSectionNamesForCourse(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ciVUgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ciXwwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130254640044774363320900423 = coursesLogic.getSectionsNameForCourse(courseId);
threadMonitoringController.exitInternalAction("_ciXwwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130254640044774363320900423;
}
finally {
threadMonitoringController.exitService("_ciVUgLvVEeyr6avTgCRLkQ");
}
}

public  void populateFieldsToGenerateInQuestion(FeedbackQuestionAttributes feedbackQuestionAttributes, String emailOfEntityDoingQuestion, String teamOfEntityDoingQuestion) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
monitoringServiceParameters.addValue("emailOfEntityDoingQuestion", emailOfEntityDoingQuestion);
monitoringServiceParameters.addValue("teamOfEntityDoingQuestion", teamOfEntityDoingQuestion);
threadMonitoringController.enterService("_cicCMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cieecLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionAttributes != null;
assert emailOfEntityDoingQuestion != null;
feedbackQuestionsLogic.populateFieldsToGenerateInQuestion(feedbackQuestionAttributes, emailOfEntityDoingQuestion, teamOfEntityDoingQuestion);
threadMonitoringController.exitInternalAction("_cieecLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cicCMLvVEeyr6avTgCRLkQ");
}
}

public  void resetStudentGoogleId(String originalEmail, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("originalEmail", originalEmail);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ciiv4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cilMILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert originalEmail != null;
assert courseId != null;
studentsLogic.resetStudentGoogleId(originalEmail, courseId);
threadMonitoringController.exitInternalAction("_cilMILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ciiv4LvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes regenerateInstructorRegistrationKey(String courseId, String email)throws EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_cipdkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cirSwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025501004382569119152959 = instructorsLogic.regenerateInstructorRegistrationKey(courseId, email);
threadMonitoringController.exitInternalAction("_cirSwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025501004382569119152959;
}
finally {
threadMonitoringController.exitService("_cipdkLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes regenerateStudentRegistrationKey(String courseId, String email)throws EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_civkMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ciwyULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025513003293449083152509 = studentsLogic.regenerateStudentRegistrationKey(courseId, email);
threadMonitoringController.exitInternalAction("_ciwyULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025513003293449083152509;
}
finally {
threadMonitoringController.exitService("_civkMLvVEeyr6avTgCRLkQ");
}
}

public  void resetInstructorGoogleId(String originalEmail, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("originalEmail", originalEmail);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ci1DwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ci248LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert originalEmail != null;
assert courseId != null;
instructorsLogic.resetInstructorGoogleId(originalEmail, courseId);
threadMonitoringController.exitInternalAction("_ci248LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ci1DwLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes createStudent(StudentAttributes student)throws InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_ci6jULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.setExternalCallId("_ci8_kLvVEeyr6avTgCRLkQ");
assert student.getCourse() != null;
threadMonitoringController.setExternalCallId("_ci-NsLvVEeyr6avTgCRLkQ");
assert student.getEmail() != null;
threadMonitoringController.enterInternalAction("_ci-0wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130255530034678005286151503 = studentsLogic.createStudent(student);
threadMonitoringController.exitInternalAction("_ci-0wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130255530034678005286151503;
}
finally {
threadMonitoringController.exitService("_ci6jULvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes updateStudentCascade(StudentAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_cjCfILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cjEUULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302556400713039399012906 = studentsLogic.updateStudentCascade(updateOptions);
threadMonitoringController.exitInternalAction("_cjEUULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302556400713039399012906;
}
finally {
threadMonitoringController.exitService("_cjCfILvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes joinCourseForStudent(String key, String googleId)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("key", key);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_cjH-sLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cjJz4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert key != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025577007659013578846208 = accountsLogic.joinCourseForStudent(key, googleId);
threadMonitoringController.exitInternalAction("_cjJz4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025577007659013578846208;
}
finally {
threadMonitoringController.exitService("_cjH-sLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getUnregisteredStudentsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cjNeQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cjPTcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025589005902258116095308 = studentsLogic.getUnregisteredStudentsForCourse(courseId);
threadMonitoringController.exitInternalAction("_cjPTcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025589005902258116095308;
}
finally {
threadMonitoringController.exitService("_cjNeQLvVEeyr6avTgCRLkQ");
}
}

public  boolean isFeedbackSessionAttemptedByInstructor(FeedbackSessionAttributes fsa, String userEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fsa", fsa);
monitoringServiceParameters.addValue("userEmail", userEmail);
threadMonitoringController.enterService("_cjTk4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cjWBILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert fsa != null;
assert userEmail != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025603003360348960756355 = feedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor(fsa, userEmail);
threadMonitoringController.exitInternalAction("_cjWBILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025603003360348960756355;
}
finally {
threadMonitoringController.exitService("_cjTk4LvVEeyr6avTgCRLkQ");
}
}

public  boolean isFeedbackSessionAttemptedByStudent(FeedbackSessionAttributes fsa, String userEmail, String userTeam) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fsa", fsa);
monitoringServiceParameters.addValue("userEmail", userEmail);
monitoringServiceParameters.addValue("userTeam", userTeam);
threadMonitoringController.enterService("_cjZrgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cjbgsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert fsa != null;
assert userEmail != null;
assert userTeam != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025618007637467354026811 = feedbackSessionsLogic.isFeedbackSessionAttemptedByStudent(fsa, userEmail, userTeam);
threadMonitoringController.exitInternalAction("_cjbgsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025618007637467354026811;
}
finally {
threadMonitoringController.exitService("_cjZrgLvVEeyr6avTgCRLkQ");
}
}

public  void deleteStudentCascade(String courseId, String studentEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("studentEmail", studentEmail);
threadMonitoringController.enterService("_cjfyILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cjhnULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert studentEmail != null;
studentsLogic.deleteStudentCascade(courseId, studentEmail);
threadMonitoringController.exitInternalAction("_cjhnULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cjfyILvVEeyr6avTgCRLkQ");
}
}

public  void deleteStudentsInCourseCascade(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cjmf0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cjoVALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
studentsLogic.deleteStudentsInCourseCascade(courseId);
threadMonitoringController.exitInternalAction("_cjoVALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cjmf0LvVEeyr6avTgCRLkQ");
}
}

public  void validateSectionsAndTeams(List<StudentAttributes> studentList, String courseId)throws EnrollException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentList", studentList);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cjt0kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cjw34LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert studentList != null;
assert courseId != null;
studentsLogic.validateSectionsAndTeams(studentList, courseId);
threadMonitoringController.exitInternalAction("_cjw34LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cjt0kLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getStudentsForTeam(String teamName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("teamName", teamName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cj1wYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cj4MoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert teamName != null;
assert courseId != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025664006647361651751754 = studentsLogic.getStudentsForTeam(teamName, courseId);
threadMonitoringController.exitInternalAction("_cj4MoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025664006647361651751754;
}
finally {
threadMonitoringController.exitService("_cj1wYLvVEeyr6avTgCRLkQ");
}
}

public  void putStudentDocument(StudentAttributes student)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_cj73ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckB9oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
studentsLogic.putDocument(student);
threadMonitoringController.exitInternalAction("_ckB9oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cj73ALvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes createFeedbackSession(FeedbackSessionAttributes feedbackSession)throws EntityAlreadyExistsException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSession", feedbackSession);
threadMonitoringController.enterService("_ckFoALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckHdMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSession != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025689006632103979083609 = feedbackSessionsLogic.createFeedbackSession(feedbackSession);
threadMonitoringController.exitInternalAction("_ckHdMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025689006632103979083609;
}
finally {
threadMonitoringController.exitService("_ckFoALvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes getFeedbackSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ckLuoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckNj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025702005711412700861954 = feedbackSessionsLogic.getFeedbackSession(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_ckNj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025702005711412700861954;
}
finally {
threadMonitoringController.exitService("_ckLuoLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes getFeedbackSessionFromRecycleBin(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ckROMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckTDYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130257140004672592548985599 = feedbackSessionsLogic.getFeedbackSessionFromRecycleBin(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_ckTDYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130257140004672592548985599;
}
finally {
threadMonitoringController.exitService("_ckROMLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ckXU0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckZKALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025727007163710819424036 = feedbackSessionsLogic.getFeedbackSessionsForCourse(courseId);
threadMonitoringController.exitInternalAction("_ckZKALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025727007163710819424036;
}
finally {
threadMonitoringController.exitService("_ckXU0LvVEeyr6avTgCRLkQ");
}
}

public  int getExpectedTotalSubmission(FeedbackSessionAttributes fsa) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fsa", fsa);
threadMonitoringController.enterService("_ckc0YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckfQoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert fsa != null;
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025740001431257699610271 = feedbackSessionsLogic.getExpectedTotalSubmission(fsa);
threadMonitoringController.exitInternalAction("_ckfQoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025740001431257699610271;
}
finally {
threadMonitoringController.exitService("_ckc0YLvVEeyr6avTgCRLkQ");
}
}

public  int getActualTotalSubmission(FeedbackSessionAttributes fsa) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fsa", fsa);
threadMonitoringController.enterService("_cki7ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckkwMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert fsa != null;
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025751007259701234387089 = feedbackSessionsLogic.getActualTotalSubmission(fsa);
threadMonitoringController.exitInternalAction("_ckkwMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025751007259701234387089;
}
finally {
threadMonitoringController.exitService("_cki7ALvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsListForInstructor(List<InstructorAttributes> instructorList) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorList", instructorList);
threadMonitoringController.enterService("_ckpBoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckq20LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorList != null;
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130257630041070100863739456 = feedbackSessionsLogic.getFeedbackSessionsListForInstructor(instructorList);
threadMonitoringController.exitInternalAction("_ckq20LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130257630041070100863739456;
}
finally {
threadMonitoringController.exitService("_ckpBoLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getSoftDeletedFeedbackSessionsListForInstructors(List<InstructorAttributes> instructorList) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorList", instructorList);
threadMonitoringController.enterService("_ckvIQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ckxkgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorList != null;
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025776004126817049265149 = feedbackSessionsLogic.getSoftDeletedFeedbackSessionsListForInstructors(instructorList);
threadMonitoringController.exitInternalAction("_ckxkgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025776004126817049265149;
}
finally {
threadMonitoringController.exitService("_ckvIQLvVEeyr6avTgCRLkQ");
}
}

public  Map<String, String> getRecipientsOfQuestion(FeedbackQuestionAttributes question, @Nullable
InstructorAttributes instructorGiver, @Nullable
StudentAttributes studentGiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
monitoringServiceParameters.addValue("instructorGiver", instructorGiver);
monitoringServiceParameters.addValue("studentGiver", studentGiver);
threadMonitoringController.enterService("_ck1O4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ck3rILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert question != null;
Map<String, String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025789005356833672398731 = feedbackQuestionsLogic.getRecipientsOfQuestion(question, instructorGiver, studentGiver, null);
threadMonitoringController.exitInternalAction("_ck3rILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025789005356833672398731;
}
finally {
threadMonitoringController.exitService("_ck1O4LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionAttributes getFeedbackQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_ck78kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ck9xwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130258010051825876731709 = feedbackQuestionsLogic.getFeedbackQuestion(feedbackQuestionId);
threadMonitoringController.exitInternalAction("_ck9xwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130258010051825876731709;
}
finally {
threadMonitoringController.exitService("_ck78kLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForStudents(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_clBcILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_clEfcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302581300004649453364968026 = feedbackQuestionsLogic.getFeedbackQuestionsForStudents(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_clEfcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302581300004649453364968026;
}
finally {
threadMonitoringController.exitService("_clBcILvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForInstructors(String feedbackSessionName, String courseId, String instructorEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("instructorEmail", instructorEmail);
threadMonitoringController.enterService("_clKmELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_clNCULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025826000516136956996045 = feedbackQuestionsLogic.getFeedbackQuestionsForInstructors(feedbackSessionName, courseId, instructorEmail);
threadMonitoringController.exitInternalAction("_clNCULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025826000516136956996045;
}
finally {
threadMonitoringController.exitService("_clKmELvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes updateFeedbackSession(FeedbackSessionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_clR60LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_clUXELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025839007637982938679085 = feedbackSessionsLogic.updateFeedbackSession(updateOptions);
threadMonitoringController.exitInternalAction("_clUXELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025839007637982938679085;
}
finally {
threadMonitoringController.exitService("_clR60LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes publishFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_clYBcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cladsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025852007380832789431274 = feedbackSessionsLogic.publishFeedbackSession(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_cladsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025852007380832789431274;
}
finally {
threadMonitoringController.exitService("_clYBcLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes unpublishFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cleIELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_clf9QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025863003443901865303892 = feedbackSessionsLogic.unpublishFeedbackSession(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_clf9QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025863003443901865303892;
}
finally {
threadMonitoringController.exitService("_cleIELvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackSessionCascade(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_clkOsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_clmD4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
feedbackSessionsLogic.deleteFeedbackSessionCascade(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_clmD4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_clkOsLvVEeyr6avTgCRLkQ");
}
}

public  void moveFeedbackSessionToRecycleBin(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_clpuQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_clrjcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
feedbackSessionsLogic.moveFeedbackSessionToRecycleBin(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_clrjcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_clpuQLvVEeyr6avTgCRLkQ");
}
}

public  void restoreFeedbackSessionFromRecycleBin(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_clv04LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_clxqELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
feedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_clxqELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_clv04LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionAttributes createFeedbackQuestion(FeedbackQuestionAttributes feedbackQuestion)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestion", feedbackQuestion);
threadMonitoringController.enterService("_cl17gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cl3wsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestion != null;
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025912008822177334242809 = feedbackQuestionsLogic.createFeedbackQuestion(feedbackQuestion);
threadMonitoringController.exitInternalAction("_cl3wsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025912008822177334242809;
}
finally {
threadMonitoringController.exitService("_cl17gLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionAttributes updateFeedbackQuestionCascade(FeedbackQuestionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_cl8CILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cl93ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025923008728841368704494 = feedbackQuestionsLogic.updateFeedbackQuestionCascade(updateOptions);
threadMonitoringController.exitInternalAction("_cl93ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025923008728841368704494;
}
finally {
threadMonitoringController.exitService("_cl8CILvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackQuestionCascade(String questionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionId", questionId);
threadMonitoringController.enterService("_cmBhsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cmDW4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionId != null;
feedbackQuestionsLogic.deleteFeedbackQuestionCascade(questionId);
threadMonitoringController.exitInternalAction("_cmDW4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cmBhsLvVEeyr6avTgCRLkQ");
}
}

public  boolean areThereResponsesForQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_cmHoULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cmKEkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025948005462064975270194 = feedbackResponsesLogic.areThereResponsesForQuestion(feedbackQuestionId);
threadMonitoringController.exitInternalAction("_cmKEkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025948005462064975270194;
}
finally {
threadMonitoringController.exitService("_cmHoULvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cmNH4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cmO9ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025960005974498777782541 = feedbackQuestionsLogic.getFeedbackQuestionsForSession(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_cmO9ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025960005974498777782541;
}
finally {
threadMonitoringController.exitService("_cmNH4LvVEeyr6avTgCRLkQ");
}
}

public  Set<String> getGiverSetThatAnswerFeedbackSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_cmT1kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cmVqwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
Set<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025972009603709642095545 = feedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession(courseId, feedbackSessionName);
threadMonitoringController.exitInternalAction("_cmVqwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025972009603709642095545;
}
finally {
threadMonitoringController.exitService("_cmT1kLvVEeyr6avTgCRLkQ");
}
}

public  SessionResultsBundle getSessionResultsForCourse(String feedbackSessionName, String courseId, String userEmail, @Nullable
String questionId, @Nullable
String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("userEmail", userEmail);
monitoringServiceParameters.addValue("questionId", questionId);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_cmZVILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cmbxYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert userEmail != null;
SessionResultsBundle longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025985007161598387856088 = feedbackResponsesLogic.getSessionResultsForCourse(feedbackSessionName, courseId, userEmail, questionId, section);
threadMonitoringController.exitInternalAction("_cmbxYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025985007161598387856088;
}
finally {
threadMonitoringController.exitService("_cmZVILvVEeyr6avTgCRLkQ");
}
}

public  SessionResultsBundle getSessionResultsForUser(String feedbackSessionName, String courseId, String userEmail, boolean isInstructor, @Nullable
String questionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("userEmail", userEmail);
monitoringServiceParameters.addValue("isInstructor", isInstructor);
monitoringServiceParameters.addValue("questionId", questionId);
threadMonitoringController.enterService("_cmgC0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cmh4ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert userEmail != null;
SessionResultsBundle longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025997005042460982073479 = feedbackResponsesLogic.getSessionResultsForUser(feedbackSessionName, courseId, userEmail, isInstructor, questionId);
threadMonitoringController.exitInternalAction("_cmh4ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013025997005042460982073479;
}
finally {
threadMonitoringController.exitService("_cmgC0LvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromStudentOrTeamForQuestion(FeedbackQuestionAttributes question, StudentAttributes student) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_cmliYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cmnXkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert question != null;
assert student != null;
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130260100016851280844776007 = feedbackResponsesLogic.getFeedbackResponsesFromStudentOrTeamForQuestion(question, student);
threadMonitoringController.exitInternalAction("_cmnXkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130260100016851280844776007;
}
finally {
threadMonitoringController.exitService("_cmliYLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromInstructorForQuestion(FeedbackQuestionAttributes question, InstructorAttributes instructorAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
monitoringServiceParameters.addValue("instructorAttributes", instructorAttributes);
threadMonitoringController.enterService("_cmrB8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cmteMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert question != null;
assert instructorAttributes != null;
threadMonitoringController.exitInternalAction("_cmteMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cmusULvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cmvTYLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cmvTYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302604600060430556922908885 = feedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion(question.getFeedbackQuestionId(), instructorAttributes.getEmail());
threadMonitoringController.exitInternalAction("_cmvTYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302604600060430556922908885;
}
finally {
threadMonitoringController.exitService("_cmrB8LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseAttributes getFeedbackResponse(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_cmy9wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cm0y8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026061006988564526359211 = feedbackResponsesLogic.getFeedbackResponse(feedbackResponseId);
threadMonitoringController.exitInternalAction("_cm0y8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026061006988564526359211;
}
finally {
threadMonitoringController.exitService("_cmy9wLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseAttributes createFeedbackResponse(FeedbackResponseAttributes feedbackResponse)throws InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponse", feedbackResponse);
threadMonitoringController.enterService("_cm4dULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cm6SgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponse != null;
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026075005730214545074215 = feedbackResponsesLogic.createFeedbackResponse(feedbackResponse);
threadMonitoringController.exitInternalAction("_cm6SgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026075005730214545074215;
}
finally {
threadMonitoringController.exitService("_cm4dULvVEeyr6avTgCRLkQ");
}
}

public  boolean hasResponsesForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_cm-j8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cnBAMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130260870048123721752694837 = feedbackResponsesLogic.hasResponsesForCourse(courseId);
threadMonitoringController.exitInternalAction("_cnBAMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130260870048123721752694837;
}
finally {
threadMonitoringController.exitService("_cm-j8LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseAttributes updateFeedbackResponseCascade(FeedbackResponseAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_cnEDgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cnF4sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026099009031037731617952 = feedbackResponsesLogic.updateFeedbackResponseCascade(updateOptions);
threadMonitoringController.exitInternalAction("_cnF4sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026099009031037731617952;
}
finally {
threadMonitoringController.exitService("_cnEDgLvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackResponseCascade(String responseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responseId", responseId);
threadMonitoringController.enterService("_cnKKILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cnMmYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert responseId != null;
feedbackResponsesLogic.deleteFeedbackResponseCascade(responseId);
threadMonitoringController.exitInternalAction("_cnMmYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cnKKILvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseCommentAttributes createFeedbackResponseComment(FeedbackResponseCommentAttributes feedbackResponseComment)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseComment", feedbackResponseComment);
threadMonitoringController.enterService("_cnQ30LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cnStALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseComment != null;
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130261250023931305982365758 = feedbackResponseCommentsLogic.createFeedbackResponseComment(feedbackResponseComment);
threadMonitoringController.exitInternalAction("_cnStALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130261250023931305982365758;
}
finally {
threadMonitoringController.exitService("_cnQ30LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseComment(Long feedbackResponseCommentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseCommentId", feedbackResponseCommentId);
threadMonitoringController.enterService("_cnW-cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cnYzoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseCommentId != null;
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026137006211019255032572 = feedbackResponseCommentsLogic.getFeedbackResponseComment(feedbackResponseCommentId);
threadMonitoringController.exitInternalAction("_cnYzoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026137006211019255032572;
}
finally {
threadMonitoringController.exitService("_cnW-cLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseCommentForResponseFromParticipant(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_cnceALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cneTMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026152004469468097260262 = feedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant(feedbackResponseId);
threadMonitoringController.exitInternalAction("_cneTMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026152004469468097260262;
}
finally {
threadMonitoringController.exitService("_cnceALvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseCommentAttributes updateFeedbackResponseComment(FeedbackResponseCommentAttributes.UpdateOptions updateOptions)throws EntityDoesNotExistException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_cnh9kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cnjywLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026164009061078225903437 = feedbackResponseCommentsLogic.updateFeedbackResponseComment(updateOptions);
threadMonitoringController.exitInternalAction("_cnjywLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026164009061078225903437;
}
finally {
threadMonitoringController.exitService("_cnh9kLvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackResponseComment(long commentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentId", commentId);
threadMonitoringController.enterService("_cnoEMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cnqgcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackResponseCommentsLogic.deleteFeedbackResponseComment(commentId);
threadMonitoringController.exitInternalAction("_cnqgcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cnoEMLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsClosedWithinThePastHour() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_cntjwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cnwAALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026196004653034432177511 = feedbackSessionsLogic.getFeedbackSessionsClosedWithinThePastHour();
threadMonitoringController.exitInternalAction("_cnwAALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026196004653034432177511;
}
finally {
threadMonitoringController.exitService("_cntjwLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsClosingWithinTimeLimit() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_cnzqYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cn2GoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026211008224933516872457 = feedbackSessionsLogic.getFeedbackSessionsClosingWithinTimeLimit();
threadMonitoringController.exitInternalAction("_cn2GoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026211008224933516872457;
}
finally {
threadMonitoringController.exitService("_cnzqYLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsOpeningWithinTimeLimit() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_cn5J8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cn8NQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130262240048668347017806124 = feedbackSessionsLogic.getFeedbackSessionsOpeningWithinTimeLimit();
threadMonitoringController.exitInternalAction("_cn8NQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130262240048668347017806124;
}
finally {
threadMonitoringController.exitService("_cn5J8LvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_cn_3oLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_coC68LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026237006417324639671165 = feedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent();
threadMonitoringController.exitInternalAction("_coC68LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026237006417324639671165;
}
finally {
threadMonitoringController.exitService("_cn_3oLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsWhichNeedOpenEmailsToBeSent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_coHMYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_coJooLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026252008055355963416607 = feedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent();
threadMonitoringController.exitInternalAction("_coJooLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026252008055355963416607;
}
finally {
threadMonitoringController.exitService("_coHMYLvVEeyr6avTgCRLkQ");
}
}

public  String getSectionForTeam(String courseId, String teamName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("teamName", teamName);
threadMonitoringController.enterService("_coNTALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_coQWULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert teamName != null;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130262680069056360049637 = studentsLogic.getSectionForTeam(courseId, teamName);
threadMonitoringController.exitInternalAction("_coQWULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130262680069056360049637;
}
finally {
threadMonitoringController.exitService("_coNTALvVEeyr6avTgCRLkQ");
}
}

public  DataBundle persistDataBundle(DataBundle dataBundle)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("dataBundle", dataBundle);
threadMonitoringController.enterService("_coUnwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_coXrELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
DataBundle longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026282001303327591964566 = dataBundleLogic.persistDataBundle(dataBundle);
threadMonitoringController.exitInternalAction("_coXrELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026282001303327591964566;
}
finally {
threadMonitoringController.exitService("_coUnwLvVEeyr6avTgCRLkQ");
}
}

public  void removeDataBundle(DataBundle dataBundle) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("dataBundle", dataBundle);
threadMonitoringController.enterService("_cobVcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_coeYwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
dataBundleLogic.removeDataBundle(dataBundle);
threadMonitoringController.exitInternalAction("_coeYwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cobVcLvVEeyr6avTgCRLkQ");
}
}

public  void putDocuments(DataBundle dataBundle)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("dataBundle", dataBundle);
threadMonitoringController.enterService("_cojRQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_comUkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
dataBundleLogic.putDocuments(dataBundle);
threadMonitoringController.exitInternalAction("_comUkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cojRQLvVEeyr6avTgCRLkQ");
}
}

public  boolean isStudentsInSameTeam(String courseId, String student1Email, String student2Email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("student1Email", student1Email);
monitoringServiceParameters.addValue("student2Email", student2Email);
threadMonitoringController.enterService("_cop-8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cotCQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert student1Email != null;
assert student2Email != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130263280019420651724721638 = studentsLogic.isStudentsInSameTeam(courseId, student1Email, student2Email);
threadMonitoringController.exitInternalAction("_cotCQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130263280019420651724721638;
}
finally {
threadMonitoringController.exitService("_cop-8LvVEeyr6avTgCRLkQ");
}
}

public  AccountRequestAttributes createAccountRequest(AccountRequestAttributes accountRequest)throws InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequest", accountRequest);
threadMonitoringController.enterService("_coxTsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cozv8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert accountRequest != null;
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026343005591186149450879 = accountRequestsLogic.createAccountRequest(accountRequest);
threadMonitoringController.exitInternalAction("_cozv8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026343005591186149450879;
}
finally {
threadMonitoringController.exitService("_coxTsLvVEeyr6avTgCRLkQ");
}
}

public  AccountRequestAttributes updateAccountRequest(AccountRequestAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_co4BYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_co52kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026357003947221176663316 = accountRequestsLogic.updateAccountRequest(updateOptions);
threadMonitoringController.exitInternalAction("_co52kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026357003947221176663316;
}
finally {
threadMonitoringController.exitService("_co4BYLvVEeyr6avTgCRLkQ");
}
}

public  void deleteAccountRequest(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_co-IALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_co_9MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
accountRequestsLogic.deleteAccountRequest(email, institute);
threadMonitoringController.exitInternalAction("_co_9MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_co-IALvVEeyr6avTgCRLkQ");
}
}

public  AccountRequestAttributes getAccountRequestForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_cpEOoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cpGD0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130263840015501146733757498 = accountRequestsLogic.getAccountRequestForRegistrationKey(registrationKey);
threadMonitoringController.exitInternalAction("_cpGD0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130263840015501146733757498;
}
finally {
threadMonitoringController.exitService("_cpEOoLvVEeyr6avTgCRLkQ");
}
}

public  AccountRequestAttributes getAccountRequest(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_cpKVQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cpMxgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert institute != null;
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026400006498092725785776 = accountRequestsLogic.getAccountRequest(email, institute);
threadMonitoringController.exitInternalAction("_cpMxgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026400006498092725785776;
}
finally {
threadMonitoringController.exitService("_cpKVQLvVEeyr6avTgCRLkQ");
}
}

public  List<AccountRequestAttributes> searchAccountRequestsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_cpRC8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cpTfMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert queryString != null;
List<AccountRequestAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130264130022989262148809553 = accountRequestsLogic.searchAccountRequestsInWholeSystem(queryString);
threadMonitoringController.exitInternalAction("_cpTfMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130264130022989262148809553;
}
finally {
threadMonitoringController.exitService("_cpRC8LvVEeyr6avTgCRLkQ");
}
}

public  void putAccountRequestDocument(AccountRequestAttributes accountRequest)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequest", accountRequest);
threadMonitoringController.enterService("_cpXJkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cpaM4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
accountRequestsLogic.putDocument(accountRequest);
threadMonitoringController.exitInternalAction("_cpaM4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cpXJkLvVEeyr6avTgCRLkQ");
}
}

}
