package teammates.logic.api;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import teammates.common.datatransfer.ErrorLogEntry;
import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.attributes.CourseAttributes;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.EmailType;
import teammates.common.util.EmailWrapper;
import teammates.common.util.RequestTracer;
import teammates.common.util.SanitizationHelper;
import teammates.common.util.Templates;
import teammates.common.util.Templates.EmailTemplates;
import teammates.common.util.TimeHelper;
import teammates.logic.core.CoursesLogic;
import teammates.logic.core.FeedbackSessionsLogic;
import teammates.logic.core.InstructorsLogic;
import teammates.logic.core.StudentsLogic;
public final class EmailGenerator {
private static final String FEEDBACK_STATUS_SESSION_OPEN = "is still open for submissions";

private static final String FEEDBACK_STATUS_SESSION_OPENING = "is now open";

private static final String FEEDBACK_STATUS_SESSION_CLOSING = "is closing soon";

private static final String FEEDBACK_STATUS_SESSION_CLOSED = "is now closed for submission";

private static final String FEEDBACK_STATUS_SESSION_OPENING_SOON = "is due to open soon";

private static final String FEEDBACK_ACTION_SUBMIT_EDIT_OR_VIEW = "submit, edit or view";

private static final String FEEDBACK_ACTION_VIEW = "view";

private static final String HTML_NO_ACTION_REQUIRED = "<p>No action is required if you have already submitted.</p>" + System.lineSeparator();

private static final String DATETIME_DISPLAY_FORMAT = "EEE, dd MMM yyyy, hh:mm a z";

private static final long SESSION_LINK_RECOVERY_DURATION_IN_DAYS = 90;

private static final EmailGenerator instance = new  EmailGenerator();

private final CoursesLogic coursesLogic = CoursesLogic.inst();

private final FeedbackSessionsLogic fsLogic = FeedbackSessionsLogic.inst();

private final InstructorsLogic instructorsLogic = InstructorsLogic.inst();

private final StudentsLogic studentsLogic = StudentsLogic.inst();

private  EmailGenerator(){
}
public static  EmailGenerator inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tghBkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tgiPsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailGenerator longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681952009498671903799654 = instance;
threadMonitoringController.exitInternalAction("_tgiPsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681952009498671903799654;
}
finally {
threadMonitoringController.exitService("_tghBkLngEeyIw-dB1KCaVA");
}
}

public  List<EmailWrapper> generateFeedbackSessionOpeningEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_tgkr8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_thYkRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819540030189900060499875 = generateFeedbackSessionOpeningOrClosingEmails(session, EmailType.FEEDBACK_OPENING);
threadMonitoringController.exitInternalAction("_thYkRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819540030189900060499875;
}
finally {
threadMonitoringController.exitService("_tgkr8LngEeyIw-dB1KCaVA");
}
}

private  List<EmailWrapper> generateFeedbackSessionOpeningOrClosingEmails(FeedbackSessionAttributes session, EmailType emailType) {
CourseAttributes course = coursesLogic.getCourse(session.getCourseId());
boolean isEmailNeededForStudents = fsLogic.isFeedbackSessionForUserTypeToAnswer(session, false);
boolean isEmailNeededForInstructors = fsLogic.isFeedbackSessionForUserTypeToAnswer(session, true);
List<InstructorAttributes> instructorsToNotify = isEmailNeededForStudents ? instructorsLogic.getCoOwnersForCourse(session.getCourseId()) : new  ArrayList<>();
List<StudentAttributes> students = isEmailNeededForStudents ? studentsLogic.getStudentsForCourse(session.getCourseId()) : new  ArrayList<>();
List<InstructorAttributes> instructors = isEmailNeededForInstructors ? instructorsLogic.getInstructorsForCourse(session.getCourseId()) : new  ArrayList<>();
String status = emailType == EmailType.FEEDBACK_OPENING ? FEEDBACK_STATUS_SESSION_OPENING : FEEDBACK_STATUS_SESSION_CLOSING;
String template = EmailTemplates.USER_FEEDBACK_SESSION.replace("${status}", status);
return generateFeedbackSessionEmailBases(course, session, students, instructors, instructorsToNotify, template, emailType, FEEDBACK_ACTION_SUBMIT_EDIT_OR_VIEW);
}

public  List<EmailWrapper> generateFeedbackSessionOpeningSoonEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_thdcwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tiLOdrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681957001881108711633075 = generateFeedbackSessionOpeningSoonOrClosedEmails(session, EmailType.FEEDBACK_OPENING_SOON);
threadMonitoringController.exitInternalAction("_tiLOdrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681957001881108711633075;
}
finally {
threadMonitoringController.exitService("_thdcwLngEeyIw-dB1KCaVA");
}
}

private  List<EmailWrapper> generateFeedbackSessionOpeningSoonOrClosedEmails(FeedbackSessionAttributes session, EmailType emailType) {
CourseAttributes course = coursesLogic.getCourse(session.getCourseId());
List<InstructorAttributes> coOwners = instructorsLogic.getCoOwnersForCourse(session.getCourseId());
return coOwners.stream().map(coOwner -> generateFeedbackSessionEmailBaseForCoowner(course, session, coOwner, emailType)).collect(Collectors.toList());
}

private  EmailWrapper generateFeedbackSessionEmailBaseForCoowner(CourseAttributes course, FeedbackSessionAttributes session, InstructorAttributes coOwner, EmailType emailType) {
String additionalNotes;
String status;
if (emailType == EmailType.FEEDBACK_OPENING_SOON)
{
String editUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.INSTRUCTOR_SESSION_EDIT_PAGE).withCourseId(course.getId()).withSessionName(session.getFeedbackSessionName()).toAbsoluteString();
if (coOwner.isRegistered())
{
additionalNotes = fillUpEditFeedbackSessionDetailsFragment(editUrl);
}
else
{
additionalNotes = fillUpJoinCourseBeforeEditFeedbackSessionDetailsFragment(editUrl, getInstructorCourseJoinUrl(coOwner));
}
status = FEEDBACK_STATUS_SESSION_OPENING_SOON;
}
else
{
String reportUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.INSTRUCTOR_SESSION_REPORT_PAGE).withCourseId(course.getId()).withSessionName(session.getFeedbackSessionName()).toAbsoluteString();
additionalNotes = fillUpViewResponsesDetailsFragment(reportUrl);
status = FEEDBACK_STATUS_SESSION_CLOSED;
}
Instant startTime = TimeHelper.getMidnightAdjustedInstantBasedOnZone(session.getStartTime(), session.getTimeZone(), false);
Instant endTime = TimeHelper.getMidnightAdjustedInstantBasedOnZone(session.getEndTime(), session.getTimeZone(), false);
String emailBody = Templates.populateTemplate(EmailTemplates.OWNER_FEEDBACK_SESSION, "${status}", status, "${userName}", SanitizationHelper.sanitizeForHtml(coOwner.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${courseId}", SanitizationHelper.sanitizeForHtml(course.getId()), "${feedbackSessionName}", SanitizationHelper.sanitizeForHtml(session.getFeedbackSessionName()), "${deadline}", SanitizationHelper.sanitizeForHtml(TimeHelper.formatInstant(endTime, session.getTimeZone(), DATETIME_DISPLAY_FORMAT)), "${sessionInstructions}", session.getInstructionsString(), "${startTime}", SanitizationHelper.sanitizeForHtml(TimeHelper.formatInstant(startTime, session.getTimeZone(), DATETIME_DISPLAY_FORMAT)), "${additionalNotes}", additionalNotes);
EmailWrapper email = getEmptyEmailAddressedToEmail(coOwner.getEmail());
email.setType(emailType);
email.setSubjectFromType(course.getName(), session.getFeedbackSessionName());
email.setContent(emailBody);
return email;
}

private  String fillUpEditFeedbackSessionDetailsFragment(String editUrl) {
return Templates.populateTemplate(EmailTemplates.FRAGMENT_OPENING_SOON_EDIT_DETAILS, "${sessionEditUrl}", editUrl);
}

private  String fillUpViewResponsesDetailsFragment(String reportUrl) {
return Templates.populateTemplate(EmailTemplates.FRAGMENT_CLOSED_VIEW_RESPONSES, "${reportUrl}", reportUrl);
}

private  String fillUpJoinCourseBeforeEditFeedbackSessionDetailsFragment(String editUrl, String joinUrl) {
return Templates.populateTemplate(EmailTemplates.FRAGMENT_OPENING_SOON_JOIN_COURSE_BEFORE_EDIT_DETAILS, "${sessionEditUrl}", editUrl, "${joinUrl}", joinUrl);
}

public  List<EmailWrapper> generateFeedbackSessionReminderEmails(FeedbackSessionAttributes session, List<StudentAttributes> students, List<InstructorAttributes> instructorsToRemind, InstructorAttributes instructorToNotify) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
monitoringServiceParameters.addValue("students", students);
monitoringServiceParameters.addValue("instructorsToRemind", instructorsToRemind);
monitoringServiceParameters.addValue("instructorToNotify", instructorToNotify);
threadMonitoringController.enterService("_tiZQ4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.setExternalCallId("_tibtILngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_ticUMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes course = coursesLogic.getCourse(session.getCourseId());
String template = EmailTemplates.USER_FEEDBACK_SESSION.replace("${status}", FEEDBACK_STATUS_SESSION_OPEN);
List<InstructorAttributes> instructorToNotifyAsList = new  ArrayList<>();
if (instructorToNotify != null)
{
instructorToNotifyAsList.add(instructorToNotify);
}
threadMonitoringController.exitInternalAction("_ticUMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tj5sxrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681963009956568422791369 = generateFeedbackSessionEmailBases(course, session, students, instructorsToRemind, instructorToNotifyAsList, template, EmailType.FEEDBACK_SESSION_REMINDER, FEEDBACK_ACTION_SUBMIT_EDIT_OR_VIEW);
threadMonitoringController.exitInternalAction("_tj5sxrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681963009956568422791369;
}
finally {
threadMonitoringController.exitService("_tiZQ4LngEeyIw-dB1KCaVA");
}
}

public  EmailWrapper generateFeedbackSessionSummaryOfCourse(String courseId, String userEmail, EmailType emailType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("userEmail", userEmail);
monitoringServiceParameters.addValue("emailType", emailType);
threadMonitoringController.enterService("_tkBokLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tkEr4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert emailType == EmailType.STUDENT_EMAIL_CHANGED || emailType == EmailType.STUDENT_COURSE_LINKS_REGENERATED || emailType == EmailType.INSTRUCTOR_COURSE_LINKS_REGENERATED;
CourseAttributes course = coursesLogic.getCourse(courseId);
boolean isInstructor = emailType == EmailType.INSTRUCTOR_COURSE_LINKS_REGENERATED;
StudentAttributes student = null;
InstructorAttributes instructor = null;
if (isInstructor)
{
instructor = instructorsLogic.getInstructorForEmail(courseId, userEmail);
}
else
{
student = studentsLogic.getStudentForEmail(courseId, userEmail);
}
List<FeedbackSessionAttributes> sessions = new  ArrayList<>();
List<FeedbackSessionAttributes> fsInCourse = fsLogic.getFeedbackSessionsForCourse(courseId);
for (FeedbackSessionAttributes fsa : fsInCourse)
{
if (fsa.isSentOpenEmail() || fsa.isSentPublishedEmail())
{
sessions.add(fsa);
}
}
StringBuilder linksFragmentValue = new  StringBuilder(1000);
threadMonitoringController.exitInternalAction("_tkEr4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tkIWQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkI9ULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkI9UbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkJkYLngEeyIw-dB1KCaVA");
String joinUrl = Config.getFrontEndAppUrl(isInstructor ? instructor.getRegistrationUrl() : student.getRegistrationUrl()).toAbsoluteString();
threadMonitoringController.enterInternalAction("_tkPD87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tkQSErngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean isYetToJoinCourse = isInstructor ? isYetToJoinCourse(instructor) : isYetToJoinCourse(student);
threadMonitoringController.exitInternalAction("_tkQSErngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_tkPD87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tkQ5ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String joinFragmentTemplate = isInstructor ? EmailTemplates.FRAGMENT_INSTRUCTOR_COURSE_REJOIN_AFTER_REGKEY_RESET : emailType == EmailType.STUDENT_EMAIL_CHANGED ? EmailTemplates.FRAGMENT_STUDENT_COURSE_JOIN : EmailTemplates.FRAGMENT_STUDENT_COURSE_REJOIN_AFTER_REGKEY_RESET;
threadMonitoringController.exitInternalAction("_tkQ5ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tkXm0LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkYN4LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tkaDFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tkaDFbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkaDFrngEeyIw-dB1KCaVA");
String joinFragmentValue = isYetToJoinCourse ? Templates.populateTemplate(joinFragmentTemplate, "${joinUrl}", joinUrl, "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${coOwnersEmails}", generateCoOwnersEmailsLine(course.getId()), "${supportEmail}", Config.SUPPORT_EMAIL) : "";
threadMonitoringController.exitInternalAction("_tkaDFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
for (FeedbackSessionAttributes fsa : sessions)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_tkhX07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String submitUrlHtml = "(Feedback session is not yet opened)";
threadMonitoringController.exitInternalAction("_tkhX07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String reportUrlHtml = "(Feedback session is not yet published)";
threadMonitoringController.setExternalCallId("_tkhX1LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkhX1bngEeyIw-dB1KCaVA");
String userKey = isInstructor ? instructor.getKey() : student.getKey();
if (fsa.isOpened() || fsa.isClosed())
{
threadMonitoringController.enterBranch("_tkh-4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkh-5LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkh-5bngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkil8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkil8bngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkjNALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkjNAbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkjNArngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkj0ELngEeyIw-dB1KCaVA");
String submitUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_SUBMISSION_PAGE).withCourseId(course.getId()).withSessionName(fsa.getFeedbackSessionName()).withRegistrationKey(userKey).withEntityType(isInstructor ? Const.EntityType.INSTRUCTOR : "").toAbsoluteString();
threadMonitoringController.enterInternalAction("_tkj0EbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
submitUrlHtml = "<a href=\"" + submitUrl + "\">" + submitUrl + "</a>";
threadMonitoringController.exitInternalAction("_tkj0EbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (fsa.isPublished())
{
threadMonitoringController.enterBranch("_tkkbILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkkbJLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkkbJbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tklCMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tklCMbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tklCMrngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tklpQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tklpQbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkmQULngEeyIw-dB1KCaVA");
String reportUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_RESULTS_PAGE).withCourseId(course.getId()).withSessionName(fsa.getFeedbackSessionName()).withRegistrationKey(userKey).withEntityType(isInstructor ? Const.EntityType.INSTRUCTOR : "").toAbsoluteString();
threadMonitoringController.enterInternalAction("_tkmQUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
reportUrlHtml = "<a href=\"" + reportUrl + "\">" + reportUrl + "</a>";
threadMonitoringController.exitInternalAction("_tkmQUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
threadMonitoringController.setExternalCallId("_tkmQU7ngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkm3YLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tknecLngEeyIw-dB1KCaVA");
Instant endTime = TimeHelper.getMidnightAdjustedInstantBasedOnZone(fsa.getEndTime(), fsa.getTimeZone(), false);
threadMonitoringController.setExternalCallId("_tknecbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkoFgLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkoFgbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkoFgrngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkoskLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tkpToLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
linksFragmentValue.append(Templates.populateTemplate(EmailTemplates.FRAGMENT_SINGLE_FEEDBACK_SESSION_LINKS, "${feedbackSessionName}", fsa.getFeedbackSessionName(), "${deadline}", TimeHelper.formatInstant(endTime, fsa.getTimeZone(), DATETIME_DISPLAY_FORMAT) + (fsa.isClosed() ? " (Passed)" : ""), "${submitUrl}", submitUrlHtml, "${reportUrl}", reportUrlHtml));
threadMonitoringController.exitInternalAction("_tkpToLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
threadMonitoringController.exitLoop("_tkhX0LngEeyIw-dB1KCaVA", loopIterationCounter1.get());
threadMonitoringController.enterInternalAction("_tkp6sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (linksFragmentValue.length() == 0)
{
linksFragmentValue.append("No links found.");
}
threadMonitoringController.exitInternalAction("_tkp6sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tktlELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String additionalContactInformation = getAdditionalContactInformationFragment(course, isInstructor);
threadMonitoringController.exitInternalAction("_tktlELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tktlEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String resendLinksTemplate = emailType == EmailType.STUDENT_EMAIL_CHANGED ? Templates.EmailTemplates.USER_FEEDBACK_SESSION_RESEND_ALL_LINKS : Templates.EmailTemplates.USER_REGKEY_REGENERATION_RESEND_ALL_COURSE_LINKS;
threadMonitoringController.exitInternalAction("_tktlEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tktlErngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkuMILngEeyIw-dB1KCaVA");
String userName = isInstructor ? instructor.getName() : student.getName();
threadMonitoringController.setExternalCallId("_tkwBULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkwBUbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkwoYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tkwoYbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tkxPcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tkxPcbngEeyIw-dB1KCaVA");
String emailBody = Templates.populateTemplate(resendLinksTemplate, "${userName}", SanitizationHelper.sanitizeForHtml(userName), "${userEmail}", userEmail, "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${courseId}", course.getId(), "${joinFragment}", joinFragmentValue, "${linksFragment}", linksFragmentValue.toString(), "${additionalContactInformation}", additionalContactInformation);
threadMonitoringController.exitInternalAction("_tkxPcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tk051LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(userEmail);
threadMonitoringController.exitInternalAction("_tk051LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tk1g4LngEeyIw-dB1KCaVA");
email.setContent(emailBody);
threadMonitoringController.setExternalCallId("_tk2H8LngEeyIw-dB1KCaVA");
email.setType(emailType);
threadMonitoringController.setExternalCallId("_tk2vALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tk3WELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tk3WEbngEeyIw-dB1KCaVA");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.enterInternalAction("_tk39ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682054007682002068369504 = email;
threadMonitoringController.exitInternalAction("_tk39ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682054007682002068369504;
}
finally {
threadMonitoringController.exitService("_tkBokLngEeyIw-dB1KCaVA");
}
}

public  EmailWrapper generateSessionLinksRecoveryEmailForStudent(String recoveryEmailAddress) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("recoveryEmailAddress", recoveryEmailAddress);
threadMonitoringController.enterService("_tk6ZYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tk-DwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> studentsForEmail = studentsLogic.getAllStudentsForEmail(recoveryEmailAddress);
threadMonitoringController.exitInternalAction("_tk-DwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (studentsForEmail.isEmpty())
{
threadMonitoringController.enterBranch("_tlSM0LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tlXFUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136820610020328021536512142 = generateSessionLinksRecoveryEmailForNonExistentStudent(recoveryEmailAddress);
threadMonitoringController.exitInternalAction("_tlXFUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136820610020328021536512142;
}
else
{
threadMonitoringController.enterInternalAction("_tloyIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136820610042327108793215584 = generateSessionLinksRecoveryEmailForExistingStudent(recoveryEmailAddress, studentsForEmail);
threadMonitoringController.exitInternalAction("_tloyIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136820610042327108793215584;
}
}
finally {
threadMonitoringController.exitService("_tk6ZYLngEeyIw-dB1KCaVA");
}
}

private  EmailWrapper generateSessionLinksRecoveryEmailForNonExistentStudent(String recoveryEmailAddress) {
String recoveryUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSIONS_LINK_RECOVERY_PAGE).toAbsoluteString();
String emailBody = Templates.populateTemplate(EmailTemplates.SESSION_LINKS_RECOVERY_EMAIL_NOT_FOUND, "${userEmail}", SanitizationHelper.sanitizeForHtml(recoveryEmailAddress), "${supportEmail}", Config.SUPPORT_EMAIL, "${teammateHomePageLink}", Config.getFrontEndAppUrl("/").toAbsoluteString(), "${sessionsRecoveryLink}", recoveryUrl);
EmailWrapper email = getEmptyEmailAddressedToEmail(recoveryEmailAddress);
email.setType(EmailType.SESSION_LINKS_RECOVERY);
email.setSubjectFromType();
email.setContent(emailBody);
return email;
}

private  EmailWrapper generateSessionLinksRecoveryEmailForExistingStudent(String recoveryEmailAddress, List<StudentAttributes> studentsForEmail) {
String emailBody;
var searchStartTime = TimeHelper.getInstantDaysOffsetBeforeNow(SESSION_LINK_RECOVERY_DURATION_IN_DAYS);
Map<String, StringBuilder> linkFragmentsMap = new  HashMap<>();
String studentName = null;
for (var student : studentsForEmail)
{
RequestTracer.checkRemainingTime();
var course = coursesLogic.getCourse(student.getCourse());
var courseId = course.getId();
StringBuilder linksFragmentValue;
if (linkFragmentsMap.containsKey(courseId))
{
linksFragmentValue = linkFragmentsMap.get(courseId);
}
else
{
linksFragmentValue = new  StringBuilder(5000);
}
studentName = student.getName();
for (var session : fsLogic.getFeedbackSessionsForCourseStartingAfter(courseId, searchStartTime))
{
RequestTracer.checkRemainingTime();
var submitUrlHtml = "";
var reportUrlHtml = "";
if (session.isOpened() || session.isClosed())
{
var submitUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_SUBMISSION_PAGE).withCourseId(course.getId()).withSessionName(session.getFeedbackSessionName()).withRegistrationKey(student.getKey()).toAbsoluteString();
submitUrlHtml = "[<a href=\"" + submitUrl + "\">submission link</a>]";
}
if (session.isPublished())
{
var reportUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_RESULTS_PAGE).withCourseId(course.getId()).withSessionName(session.getFeedbackSessionName()).withRegistrationKey(student.getKey()).toAbsoluteString();
reportUrlHtml = "[<a href=\"" + reportUrl + "\">result link</a>]";
}
if (submitUrlHtml.isEmpty() && reportUrlHtml.isEmpty())
{
continue;
}
linksFragmentValue.append(Templates.populateTemplate(EmailTemplates.FRAGMENT_SESSION_LINKS_RECOVERY_ACCESS_LINKS_BY_SESSION, "${sessionName}", session.getFeedbackSessionName(), "${submitUrl}", submitUrlHtml, "${reportUrl}", reportUrlHtml));
linkFragmentsMap.putIfAbsent(courseId, linksFragmentValue);
}
}
var recoveryUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSIONS_LINK_RECOVERY_PAGE).toAbsoluteString();
if (linkFragmentsMap.isEmpty())
{
emailBody = Templates.populateTemplate(EmailTemplates.SESSION_LINKS_RECOVERY_ACCESS_LINKS_NONE, "${teammateHomePageLink}", Config.getFrontEndAppUrl("/").toAbsoluteString(), "${userEmail}", SanitizationHelper.sanitizeForHtml(recoveryEmailAddress), "${supportEmail}", Config.SUPPORT_EMAIL, "${sessionsRecoveryLink}", recoveryUrl);
}
else
{
var courseFragments = new  StringBuilder(10000);
linkFragmentsMap.forEach((courseId, linksFragments) -> {
String courseBody = Templates.populateTemplate(EmailTemplates.FRAGMENT_SESSION_LINKS_RECOVERY_ACCESS_LINKS_BY_COURSE, "${sessionFragment}", linksFragments.toString(), "${courseName}", coursesLogic.getCourse(courseId).getName());
courseFragments.append(courseBody);
}
);
emailBody = Templates.populateTemplate(EmailTemplates.SESSION_LINKS_RECOVERY_ACCESS_LINKS, "${userName}", SanitizationHelper.sanitizeForHtml(studentName), "${linksFragment}", courseFragments.toString(), "${userEmail}", SanitizationHelper.sanitizeForHtml(recoveryEmailAddress), "${teammateHomePageLink}", Config.getFrontEndAppUrl("/").toAbsoluteString(), "${supportEmail}", Config.SUPPORT_EMAIL, "${sessionsRecoveryLink}", recoveryUrl);
}
var email = getEmptyEmailAddressedToEmail(recoveryEmailAddress);
email.setType(EmailType.SESSION_LINKS_RECOVERY);
email.setSubjectFromType();
email.setContent(emailBody);
return email;
}

public  List<EmailWrapper> generateFeedbackSessionClosingEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_tlu4wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tmoQorngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682064002703708559102942 = generateFeedbackSessionOpeningOrClosingEmails(session, EmailType.FEEDBACK_CLOSING);
threadMonitoringController.exitInternalAction("_tmoQorngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682064002703708559102942;
}
finally {
threadMonitoringController.exitService("_tlu4wLngEeyIw-dB1KCaVA");
}
}

public  List<EmailWrapper> generateFeedbackSessionClosedEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_tmqs4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tnS_B7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136820670038042806499804716 = generateFeedbackSessionOpeningSoonOrClosedEmails(session, EmailType.FEEDBACK_CLOSED);
threadMonitoringController.exitInternalAction("_tnS_B7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136820670038042806499804716;
}
finally {
threadMonitoringController.exitService("_tmqs4LngEeyIw-dB1KCaVA");
}
}

public  List<EmailWrapper> generateFeedbackSessionPublishedEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_tna60LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_toTrpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682069007830445915851749 = generateFeedbackSessionPublishedOrUnpublishedEmails(session, EmailType.FEEDBACK_PUBLISHED);
threadMonitoringController.exitInternalAction("_toTrpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682069007830445915851749;
}
finally {
threadMonitoringController.exitService("_tna60LngEeyIw-dB1KCaVA");
}
}

public  List<EmailWrapper> generateFeedbackSessionPublishedEmails(FeedbackSessionAttributes session, List<StudentAttributes> students, List<InstructorAttributes> instructors, List<InstructorAttributes> instructorsToNotify) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
monitoringServiceParameters.addValue("students", students);
monitoringServiceParameters.addValue("instructors", instructors);
monitoringServiceParameters.addValue("instructorsToNotify", instructorsToNotify);
threadMonitoringController.enterService("_toWH4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tpHj8rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682072007281453496000907 = generateFeedbackSessionPublishedOrUnpublishedEmails(session, students, instructors, instructorsToNotify, EmailType.FEEDBACK_PUBLISHED);
threadMonitoringController.exitInternalAction("_tpHj8rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682072007281453496000907;
}
finally {
threadMonitoringController.exitService("_toWH4LngEeyIw-dB1KCaVA");
}
}

public  List<EmailWrapper> generateFeedbackSessionUnpublishedEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_tpL1YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tqAUx7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682075003689663899463178 = generateFeedbackSessionPublishedOrUnpublishedEmails(session, EmailType.FEEDBACK_UNPUBLISHED);
threadMonitoringController.exitInternalAction("_tqAUx7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682075003689663899463178;
}
finally {
threadMonitoringController.exitService("_tpL1YLngEeyIw-dB1KCaVA");
}
}

private  List<EmailWrapper> generateFeedbackSessionPublishedOrUnpublishedEmails(FeedbackSessionAttributes session, EmailType emailType) {
boolean isEmailNeededForStudents = fsLogic.isFeedbackSessionViewableToUserType(session, false);
boolean isEmailNeededForInstructors = fsLogic.isFeedbackSessionViewableToUserType(session, true);
List<InstructorAttributes> instructorsToNotify = isEmailNeededForStudents ? instructorsLogic.getCoOwnersForCourse(session.getCourseId()) : new  ArrayList<>();
List<StudentAttributes> students = isEmailNeededForStudents ? studentsLogic.getStudentsForCourse(session.getCourseId()) : new  ArrayList<>();
List<InstructorAttributes> instructors = isEmailNeededForInstructors ? instructorsLogic.getInstructorsForCourse(session.getCourseId()) : new  ArrayList<>();
return generateFeedbackSessionPublishedOrUnpublishedEmails(session, students, instructors, instructorsToNotify, emailType);
}

private  List<EmailWrapper> generateFeedbackSessionPublishedOrUnpublishedEmails(FeedbackSessionAttributes session, List<StudentAttributes> students, List<InstructorAttributes> instructors, List<InstructorAttributes> instructorsToNotify, EmailType emailType) {
CourseAttributes course = coursesLogic.getCourse(session.getCourseId());
String template;
String action;
if (emailType == EmailType.FEEDBACK_PUBLISHED)
{
template = EmailTemplates.USER_FEEDBACK_SESSION_PUBLISHED;
action = FEEDBACK_ACTION_VIEW;
}
else
{
template = EmailTemplates.USER_FEEDBACK_SESSION_UNPUBLISHED;
action = FEEDBACK_ACTION_SUBMIT_EDIT_OR_VIEW;
}
return generateFeedbackSessionEmailBases(course, session, students, instructors, instructorsToNotify, template, emailType, action);
}

private  List<EmailWrapper> generateFeedbackSessionEmailBases(CourseAttributes course, FeedbackSessionAttributes session, List<StudentAttributes> students, List<InstructorAttributes> instructors, List<InstructorAttributes> instructorsToNotify, String template, EmailType type, String feedbackAction) {
StringBuilder studentAdditionalContactBuilder = new  StringBuilder();
StringBuilder instructorAdditionalContactBuilder = new  StringBuilder();
if (type == EmailType.FEEDBACK_CLOSING || type == EmailType.FEEDBACK_SESSION_REMINDER)
{
studentAdditionalContactBuilder.append(HTML_NO_ACTION_REQUIRED);
instructorAdditionalContactBuilder.append(HTML_NO_ACTION_REQUIRED);
}
studentAdditionalContactBuilder.append(getAdditionalContactInformationFragment(course, false));
instructorAdditionalContactBuilder.append(getAdditionalContactInformationFragment(course, true));
List<EmailWrapper> emails = new  ArrayList<>();
for (StudentAttributes student : students)
{
emails.add(generateFeedbackSessionEmailBaseForStudents(course, session, student, template, type, feedbackAction, studentAdditionalContactBuilder.toString()));
}
for (InstructorAttributes instructor : instructors)
{
emails.add(generateFeedbackSessionEmailBaseForInstructors(course, session, instructor, template, type, feedbackAction, instructorAdditionalContactBuilder.toString()));
}
for (InstructorAttributes instructor : instructorsToNotify)
{
emails.add(generateFeedbackSessionEmailBaseForNotifiedInstructors(course, session, instructor, template, type, feedbackAction, studentAdditionalContactBuilder.toString()));
}
return emails;
}

private  EmailWrapper generateFeedbackSessionEmailBaseForStudents(CourseAttributes course, FeedbackSessionAttributes session, StudentAttributes student, String template, EmailType type, String feedbackAction, String additionalContactInformation) {
String submitUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_SUBMISSION_PAGE).withCourseId(course.getId()).withSessionName(session.getFeedbackSessionName()).withRegistrationKey(student.getKey()).toAbsoluteString();
String reportUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_RESULTS_PAGE).withCourseId(course.getId()).withSessionName(session.getFeedbackSessionName()).withRegistrationKey(student.getKey()).toAbsoluteString();
Instant endTime = TimeHelper.getMidnightAdjustedInstantBasedOnZone(session.getEndTime(), session.getTimeZone(), false);
String emailBody = Templates.populateTemplate(template, "${userName}", SanitizationHelper.sanitizeForHtml(student.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${courseId}", SanitizationHelper.sanitizeForHtml(course.getId()), "${feedbackSessionName}", SanitizationHelper.sanitizeForHtml(session.getFeedbackSessionName()), "${deadline}", SanitizationHelper.sanitizeForHtml(TimeHelper.formatInstant(endTime, session.getTimeZone(), DATETIME_DISPLAY_FORMAT)), "${instructorPreamble}", "", "${sessionInstructions}", session.getInstructionsString(), "${submitUrl}", submitUrl, "${reportUrl}", reportUrl, "${feedbackAction}", feedbackAction, "${additionalContactInformation}", additionalContactInformation);
EmailWrapper email = getEmptyEmailAddressedToEmail(student.getEmail());
email.setType(type);
email.setSubjectFromType(course.getName(), session.getFeedbackSessionName());
email.setContent(emailBody);
return email;
}

private  EmailWrapper generateFeedbackSessionEmailBaseForInstructors(CourseAttributes course, FeedbackSessionAttributes session, InstructorAttributes instructor, String template, EmailType type, String feedbackAction, String additionalContactInformation) {
String submitUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_SUBMISSION_PAGE).withCourseId(course.getId()).withSessionName(session.getFeedbackSessionName()).withRegistrationKey(instructor.getKey()).withEntityType(Const.EntityType.INSTRUCTOR).toAbsoluteString();
String reportUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_RESULTS_PAGE).withCourseId(course.getId()).withSessionName(session.getFeedbackSessionName()).withRegistrationKey(instructor.getKey()).withEntityType(Const.EntityType.INSTRUCTOR).toAbsoluteString();
Instant endTime = TimeHelper.getMidnightAdjustedInstantBasedOnZone(session.getEndTime(), session.getTimeZone(), false);
String emailBody = Templates.populateTemplate(template, "${userName}", SanitizationHelper.sanitizeForHtml(instructor.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${courseId}", SanitizationHelper.sanitizeForHtml(course.getId()), "${feedbackSessionName}", SanitizationHelper.sanitizeForHtml(session.getFeedbackSessionName()), "${deadline}", SanitizationHelper.sanitizeForHtml(TimeHelper.formatInstant(endTime, session.getTimeZone(), DATETIME_DISPLAY_FORMAT)), "${instructorPreamble}", "", "${sessionInstructions}", session.getInstructionsString(), "${submitUrl}", submitUrl, "${reportUrl}", reportUrl, "${feedbackAction}", feedbackAction, "${additionalContactInformation}", additionalContactInformation);
EmailWrapper email = getEmptyEmailAddressedToEmail(instructor.getEmail());
email.setType(type);
email.setSubjectFromType(course.getName(), session.getFeedbackSessionName());
email.setContent(emailBody);
return email;
}

private  EmailWrapper generateFeedbackSessionEmailBaseForNotifiedInstructors(CourseAttributes course, FeedbackSessionAttributes session, InstructorAttributes instructor, String template, EmailType type, String feedbackAction, String additionalContactInformation) {
Instant endTime = TimeHelper.getMidnightAdjustedInstantBasedOnZone(session.getEndTime(), session.getTimeZone(), false);
String emailBody = Templates.populateTemplate(template, "${userName}", SanitizationHelper.sanitizeForHtml(instructor.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${courseId}", SanitizationHelper.sanitizeForHtml(course.getId()), "${feedbackSessionName}", SanitizationHelper.sanitizeForHtml(session.getFeedbackSessionName()), "${deadline}", SanitizationHelper.sanitizeForHtml(TimeHelper.formatInstant(endTime, session.getTimeZone(), DATETIME_DISPLAY_FORMAT)), "${instructorPreamble}", fillUpInstructorPreamble(course), "${sessionInstructions}", session.getInstructionsString(), "${submitUrl}", "{in the actual email sent to the students, this will be the unique link}", "${reportUrl}", "{in the actual email sent to the students, this will be the unique link}", "${feedbackAction}", feedbackAction, "${additionalContactInformation}", additionalContactInformation);
EmailWrapper email = getEmptyEmailAddressedToEmail(instructor.getEmail());
email.setType(type);
email.setIsCopy(true);
email.setSubjectFromType(course.getName(), session.getFeedbackSessionName());
email.setContent(emailBody);
return email;
}

private  boolean isYetToJoinCourse(StudentAttributes student) {
return student.getGoogleId() == null || student.getGoogleId().isEmpty();
}

private  boolean isYetToJoinCourse(InstructorAttributes instructor) {
return instructor.getGoogleId() == null || instructor.getGoogleId().isEmpty();
}

public  EmailWrapper generateNewInstructorAccountJoinEmail(String instructorEmail, String instructorName, String joinUrl) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorEmail", instructorEmail);
monitoringServiceParameters.addValue("instructorName", instructorName);
monitoringServiceParameters.addValue("joinUrl", joinUrl);
threadMonitoringController.enterService("_tqTPsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.setExternalCallId("_tqVE4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tqVr8LngEeyIw-dB1KCaVA");
String emailBody = Templates.populateTemplate(EmailTemplates.NEW_INSTRUCTOR_ACCOUNT_WELCOME, "${userName}", SanitizationHelper.sanitizeForHtml(instructorName), "${joinUrl}", joinUrl);
threadMonitoringController.enterInternalAction("_tqZWUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(instructorEmail);
threadMonitoringController.exitInternalAction("_tqZWUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tqZWU7ngEeyIw-dB1KCaVA");
email.setBcc(Config.SUPPORT_EMAIL);
threadMonitoringController.setExternalCallId("_tqZ9YLngEeyIw-dB1KCaVA");
email.setType(EmailType.NEW_INSTRUCTOR_ACCOUNT);
threadMonitoringController.setExternalCallId("_tqakcLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tqbLgLngEeyIw-dB1KCaVA");
email.setSubjectFromType(SanitizationHelper.sanitizeForHtml(instructorName));
threadMonitoringController.setExternalCallId("_tqbykLngEeyIw-dB1KCaVA");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_tqbykbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682088003361820299316687 = email;
threadMonitoringController.exitInternalAction("_tqbykbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682088003361820299316687;
}
finally {
threadMonitoringController.exitService("_tqTPsLngEeyIw-dB1KCaVA");
}
}

public  EmailWrapper generateStudentCourseJoinEmail(CourseAttributes course, StudentAttributes student) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("course", course);
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_tqeO0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tqrDIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tqrDIrngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tqrDI7ngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tqrqMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tqrqMbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tqtfZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tqtfZbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tqtfZrngEeyIw-dB1KCaVA");
String emailBody = Templates.populateTemplate(fillUpStudentJoinFragment(student), "${userName}", SanitizationHelper.sanitizeForHtml(student.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${coOwnersEmails}", generateCoOwnersEmailsLine(course.getId()), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_tqtfZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_tqrDIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tqv7oLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tqxw07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(student.getEmail());
threadMonitoringController.exitInternalAction("_tqxw07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tqxw1LngEeyIw-dB1KCaVA");
email.setType(EmailType.STUDENT_COURSE_JOIN);
threadMonitoringController.setExternalCallId("_tqy-8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tqzmALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tqzmAbngEeyIw-dB1KCaVA");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_tq0NELngEeyIw-dB1KCaVA");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_tq00ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682108002931410009711398 = email;
threadMonitoringController.exitInternalAction("_tq00ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682108002931410009711398;
}
finally {
threadMonitoringController.exitService("_tqeO0LngEeyIw-dB1KCaVA");
}
}

public  EmailWrapper generateStudentCourseRejoinEmailAfterGoogleIdReset(CourseAttributes course, StudentAttributes student) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("course", course);
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_tq3QYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_trEEsrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trEEs7ngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trErwLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trErwbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trErwrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_trGg9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trGg9bngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trGg9rngEeyIw-dB1KCaVA");
String emailBody = Templates.populateTemplate(fillUpStudentRejoinAfterGoogleIdResetFragment(student), "${userName}", SanitizationHelper.sanitizeForHtml(student.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${coOwnersEmails}", generateCoOwnersEmailsLine(course.getId()), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_trGg9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_trEEsrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trKLULngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_trMAg7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(student.getEmail());
threadMonitoringController.exitInternalAction("_trMAg7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trMnkLngEeyIw-dB1KCaVA");
email.setType(EmailType.STUDENT_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET);
threadMonitoringController.setExternalCallId("_trN1sLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trN1sbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trOcwLngEeyIw-dB1KCaVA");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_trPD0LngEeyIw-dB1KCaVA");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_trPq4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682130008938557201963152 = email;
threadMonitoringController.exitInternalAction("_trPq4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682130008938557201963152;
}
finally {
threadMonitoringController.exitService("_tq3QYLngEeyIw-dB1KCaVA");
}
}

public  EmailWrapper generateInstructorCourseJoinEmail(AccountAttributes inviter, InstructorAttributes instructor, CourseAttributes course) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("inviter", inviter);
monitoringServiceParameters.addValue("instructor", instructor);
monitoringServiceParameters.addValue("course", course);
threadMonitoringController.enterService("_trTVQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_trb4JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trb4JbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trdGQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trdtULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trdtUbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trdtUrngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trdtU7ngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_treUYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_treUYbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trfigLngEeyIw-dB1KCaVA");
String emailBody = Templates.populateTemplate(fillUpInstructorJoinFragment(instructor), "${userName}", SanitizationHelper.sanitizeForHtml(instructor.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${inviterName}", SanitizationHelper.sanitizeForHtml(inviter.getName()), "${inviterEmail}", SanitizationHelper.sanitizeForHtml(inviter.getEmail()), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_trb4JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trhXsLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_trjz8rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(instructor.getEmail());
threadMonitoringController.exitInternalAction("_trjz8rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trjz87ngEeyIw-dB1KCaVA");
email.setType(EmailType.INSTRUCTOR_COURSE_JOIN);
threadMonitoringController.setExternalCallId("_trlCELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trlCEbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trlpILngEeyIw-dB1KCaVA");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_trlpIbngEeyIw-dB1KCaVA");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_trmQMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682154003222414889058426 = email;
threadMonitoringController.exitInternalAction("_trmQMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682154003222414889058426;
}
finally {
threadMonitoringController.exitService("_trTVQLngEeyIw-dB1KCaVA");
}
}

public  EmailWrapper generateInstructorCourseRejoinEmailAfterGoogleIdReset(InstructorAttributes instructor, CourseAttributes course) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
monitoringServiceParameters.addValue("course", course);
threadMonitoringController.enterService("_trp6kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_trwBMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trwBMrngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trwBM7ngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trwoQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trwoQbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_trxPULngEeyIw-dB1KCaVA");
String emailBody = Templates.populateTemplate(fillUpInstructorRejoinAfterGoogleIdResetFragment(instructor), "${userName}", SanitizationHelper.sanitizeForHtml(instructor.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_trwBMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_trzrkLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tr1gw7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(instructor.getEmail());
threadMonitoringController.exitInternalAction("_tr1gw7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tr2H0LngEeyIw-dB1KCaVA");
email.setType(EmailType.INSTRUCTOR_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET);
threadMonitoringController.setExternalCallId("_tr2u4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tr3V8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tr3V8bngEeyIw-dB1KCaVA");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_tr39ALngEeyIw-dB1KCaVA");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_tr4kELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682173001952355427734036 = email;
threadMonitoringController.exitInternalAction("_tr4kELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682173001952355427734036;
}
finally {
threadMonitoringController.exitService("_trp6kLngEeyIw-dB1KCaVA");
}
}

public  EmailWrapper generateUserCourseRegisteredEmail(String name, String emailAddress, String googleId, boolean isInstructor, CourseAttributes course) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("name", name);
monitoringServiceParameters.addValue("emailAddress", emailAddress);
monitoringServiceParameters.addValue("googleId", googleId);
monitoringServiceParameters.addValue("isInstructor", isInstructor);
monitoringServiceParameters.addValue("course", course);
threadMonitoringController.enterService("_tr7AULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.setExternalCallId("_tr_40LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsAf4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsAf4bngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsAf4rngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsBG8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsBuALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsBuAbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsBuArngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsCVELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsCVEbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsC8ILngEeyIw-dB1KCaVA");
String emailBody = Templates.populateTemplate(EmailTemplates.USER_COURSE_REGISTER, "${userName}", SanitizationHelper.sanitizeForHtml(name), "${userType}", isInstructor ? "an instructor" : "a student", "${courseId}", SanitizationHelper.sanitizeForHtml(course.getId()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${googleId}", SanitizationHelper.sanitizeForHtml(googleId), "${appUrl}", isInstructor ? Config.getFrontEndAppUrl(Const.WebPageURIs.INSTRUCTOR_HOME_PAGE).toAbsoluteString() : Config.getFrontEndAppUrl(Const.WebPageURIs.STUDENT_HOME_PAGE).toAbsoluteString(), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.enterInternalAction("_tsGmgrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(emailAddress);
threadMonitoringController.exitInternalAction("_tsGmgrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tsGmg7ngEeyIw-dB1KCaVA");
email.setType(EmailType.USER_COURSE_REGISTER);
threadMonitoringController.setExternalCallId("_tsH0oLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsIbsLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_tsIbsbngEeyIw-dB1KCaVA");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_tsJCwLngEeyIw-dB1KCaVA");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_tsJCwbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682198009732290934717707 = email;
threadMonitoringController.exitInternalAction("_tsJCwbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682198009732290934717707;
}
finally {
threadMonitoringController.exitService("_tr7AULngEeyIw-dB1KCaVA");
}
}

private  String fillUpStudentJoinFragment(StudentAttributes student) {
String joinUrl = Config.getFrontEndAppUrl(student.getRegistrationUrl()).toAbsoluteString();
return Templates.populateTemplate(EmailTemplates.USER_COURSE_JOIN, "${joinFragment}", EmailTemplates.FRAGMENT_STUDENT_COURSE_JOIN, "${joinUrl}", joinUrl);
}

private  String fillUpStudentRejoinAfterGoogleIdResetFragment(StudentAttributes student) {
String joinUrl = Config.getFrontEndAppUrl(student.getRegistrationUrl()).toAbsoluteString();
return Templates.populateTemplate(EmailTemplates.USER_COURSE_JOIN, "${joinFragment}", EmailTemplates.FRAGMENT_STUDENT_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET, "${joinUrl}", joinUrl, "${supportEmail}", Config.SUPPORT_EMAIL);
}

private  String getInstructorCourseJoinUrl(InstructorAttributes instructor) {
return Config.getFrontEndAppUrl(instructor.getRegistrationUrl()).toAbsoluteString();
}

private  String fillUpInstructorJoinFragment(InstructorAttributes instructor) {
return Templates.populateTemplate(EmailTemplates.USER_COURSE_JOIN, "${joinFragment}", EmailTemplates.FRAGMENT_INSTRUCTOR_COURSE_JOIN, "${joinUrl}", getInstructorCourseJoinUrl(instructor));
}

private  String fillUpInstructorRejoinAfterGoogleIdResetFragment(InstructorAttributes instructor) {
String joinUrl = Config.getFrontEndAppUrl(instructor.getRegistrationUrl()).toAbsoluteString();
return Templates.populateTemplate(EmailTemplates.USER_COURSE_JOIN, "${joinFragment}", EmailTemplates.FRAGMENT_INSTRUCTOR_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET, "${joinUrl}", joinUrl, "${supportEmail}", Config.SUPPORT_EMAIL);
}

private  String fillUpInstructorPreamble(CourseAttributes course) {
return Templates.populateTemplate(EmailTemplates.FRAGMENT_INSTRUCTOR_COPY_PREAMBLE, "${courseId}", SanitizationHelper.sanitizeForHtml(course.getId()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()));
}

public  EmailWrapper generateCompiledLogsEmail(List<ErrorLogEntry> logs) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("logs", logs);
threadMonitoringController.enterService("_tsWeILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tsYTULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder emailBody = new  StringBuilder();
threadMonitoringController.exitInternalAction("_tsYTULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
for (int i = 0 ; i < logs.size() ; i++)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_tsfoEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tsfoErngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tsfoE7ngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tsfoFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tsfoFbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tsgPILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tsgPIbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_tsgPIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
emailBody.append(generateSevereErrorLogLine(i, logs.get(i).getMessage(), logs.get(i).getSeverity(), logs.get(i).getTraceId()));
threadMonitoringController.exitInternalAction("_tsgPIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_tsgPILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_tsfoFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_tsfoErngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_tsfoEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
threadMonitoringController.exitLoop("_tseZ8LngEeyIw-dB1KCaVA", loopIterationCounter1.get());
threadMonitoringController.enterInternalAction("_tsjSc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_tsjSc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tsj5gLngEeyIw-dB1KCaVA");
email.setType(EmailType.SEVERE_LOGS_COMPILATION);
threadMonitoringController.setExternalCallId("_tskgkLngEeyIw-dB1KCaVA");
email.setSubjectFromType(Config.APP_VERSION);
threadMonitoringController.enterInternalAction("_tsmVwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_tsmVwbngEeyIw-dB1KCaVA");
email.setContent(emailBody.toString());
threadMonitoringController.exitInternalAction("_tsmVwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tsmVwrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682220006540985895207431 = email;
threadMonitoringController.exitInternalAction("_tsmVwrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682220006540985895207431;
}
finally {
threadMonitoringController.exitService("_tsWeILngEeyIw-dB1KCaVA");
}
}

private  String generateSevereErrorLogLine(int index, String logMessage, String logLevel, String traceId) {
return Templates.populateTemplate(EmailTemplates.SEVERE_ERROR_LOG_LINE, "${index}", String.valueOf(index), "${errorType}", logLevel, "${errorMessage}", logMessage, "${traceId}", traceId);
}

private  EmailWrapper getEmptyEmailAddressedToEmail(String recipient) {
EmailWrapper email = new  EmailWrapper();
email.setRecipient(recipient);
email.setSenderEmail(Config.EMAIL_SENDEREMAIL);
email.setSenderName(Config.EMAIL_SENDERNAME);
email.setReplyTo(Config.EMAIL_REPLYTO);
return email;
}

private  String generateCoOwnersEmailsLine(String courseId) {
List<InstructorAttributes> coOwners = instructorsLogic.getCoOwnersForCourse(courseId);
if (coOwners.isEmpty())
{
return "(No contactable instructors found)";
}
StringBuilder coOwnersEmailsLine = new  StringBuilder();
for (InstructorAttributes coOwner : coOwners)
{
coOwnersEmailsLine.append(SanitizationHelper.sanitizeForHtml(coOwner.getName())).append(" (").append(coOwner.getEmail()).append("), ");
}
return coOwnersEmailsLine.substring(0, coOwnersEmailsLine.length() - 2);
}

private  String getAdditionalContactInformationFragment(CourseAttributes course, boolean isInstructor) {
String particulars = isInstructor ? "instructor data (e.g. wrong permission, misspelled name)" : "team/student data (e.g. wrong team, misspelled name)";
return Templates.populateTemplate(EmailTemplates.FRAGMENT_SESSION_ADDITIONAL_CONTACT_INFORMATION, "${particulars}", particulars, "${coOwnersEmails}", generateCoOwnersEmailsLine(course.getId()), "${supportEmail}", Config.SUPPORT_EMAIL);
}

}
