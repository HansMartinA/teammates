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
threadMonitoringController.enterService("_cD5sELvVEeyr6avTgCRLkQ", EmailGenerator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cD7hQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailGenerator longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023408001925882400996194 = instance;
threadMonitoringController.exitInternalAction("_cD7hQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023408001925882400996194;
}
finally {
threadMonitoringController.exitService("_cD5sELvVEeyr6avTgCRLkQ");
}
}

public  List<EmailWrapper> generateFeedbackSessionOpeningEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_cD99gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cFeZYrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023422007100505651373801 = generateFeedbackSessionOpeningOrClosingEmails(session, EmailType.FEEDBACK_OPENING);
threadMonitoringController.exitInternalAction("_cFeZYrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023422007100505651373801;
}
finally {
threadMonitoringController.exitService("_cD99gLvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_cFiq0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cGRqprvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023436008552807742166345 = generateFeedbackSessionOpeningSoonOrClosedEmails(session, EmailType.FEEDBACK_OPENING_SOON);
threadMonitoringController.exitInternalAction("_cGRqprvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023436008552807742166345;
}
finally {
threadMonitoringController.exitService("_cFiq0LvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_cGgUILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.setExternalCallId("_cGj-gLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cGj-gbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes course = coursesLogic.getCourse(session.getCourseId());
String template = EmailTemplates.USER_FEEDBACK_SESSION.replace("${status}", FEEDBACK_STATUS_SESSION_OPEN);
List<InstructorAttributes> instructorToNotifyAsList = new  ArrayList<>();
if (instructorToNotify != null)
{
instructorToNotifyAsList.add(instructorToNotify);
}
threadMonitoringController.exitInternalAction("_cGj-gbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_cIBXF7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130234590011510452073240218 = generateFeedbackSessionEmailBases(course, session, students, instructorsToRemind, instructorToNotifyAsList, template, EmailType.FEEDBACK_SESSION_REMINDER, FEEDBACK_ACTION_SUBMIT_EDIT_OR_VIEW);
threadMonitoringController.exitInternalAction("_cIBXF7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130234590011510452073240218;
}
finally {
threadMonitoringController.exitService("_cGgUILvVEeyr6avTgCRLkQ");
}
}

public  EmailWrapper generateFeedbackSessionSummaryOfCourse(String courseId, String userEmail, EmailType emailType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("userEmail", userEmail);
monitoringServiceParameters.addValue("emailType", emailType);
threadMonitoringController.enterService("_cIHdsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cIJS4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.exitInternalAction("_cIJS4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cIOLYLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIOLYbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIOycLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIOycbvVEeyr6avTgCRLkQ");
String joinUrl = Config.getFrontEndAppUrl(isInstructor ? instructor.getRegistrationUrl() : student.getRegistrationUrl()).toAbsoluteString();
threadMonitoringController.enterInternalAction("_cIUSArvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_cIVgIrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean isYetToJoinCourse = isInstructor ? isYetToJoinCourse(instructor) : isYetToJoinCourse(student);
threadMonitoringController.exitInternalAction("_cIVgIrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_cIUSArvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_cIVgI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String joinFragmentTemplate = isInstructor ? EmailTemplates.FRAGMENT_INSTRUCTOR_COURSE_REJOIN_AFTER_REGKEY_RESET : emailType == EmailType.STUDENT_EMAIL_CHANGED ? EmailTemplates.FRAGMENT_STUDENT_COURSE_JOIN : EmailTemplates.FRAGMENT_STUDENT_COURSE_REJOIN_AFTER_REGKEY_RESET;
threadMonitoringController.exitInternalAction("_cIVgI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cIbmwLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIcN0LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cIeDBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cIeDBbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIeDBrvVEeyr6avTgCRLkQ");
String joinFragmentValue = isYetToJoinCourse ? Templates.populateTemplate(joinFragmentTemplate, "${joinUrl}", joinUrl, "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${coOwnersEmails}", generateCoOwnersEmailsLine(course.getId()), "${supportEmail}", Config.SUPPORT_EMAIL) : "";
threadMonitoringController.exitInternalAction("_cIeDBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
for (FeedbackSessionAttributes fsa : sessions)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_cIml47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String submitUrlHtml = "(Feedback session is not yet opened)";
threadMonitoringController.exitInternalAction("_cIml47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String reportUrlHtml = "(Feedback session is not yet published)";
threadMonitoringController.setExternalCallId("_cIml5LvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cInM8LvVEeyr6avTgCRLkQ");
String userKey = isInstructor ? instructor.getKey() : student.getKey();
if (fsa.isOpened() || fsa.isClosed())
{
threadMonitoringController.enterBranch("_cInM8bvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIn0ALvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIn0AbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIobELvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIobEbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIpCILvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIpCIbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIppMLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIq3ULvVEeyr6avTgCRLkQ");
String submitUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_SUBMISSION_PAGE).withCourseId(course.getId()).withSessionName(fsa.getFeedbackSessionName()).withRegistrationKey(userKey).withEntityType(isInstructor ? Const.EntityType.INSTRUCTOR : "").toAbsoluteString();
threadMonitoringController.enterInternalAction("_cIq3UbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
submitUrlHtml = "<a href=\"" + submitUrl + "\">" + submitUrl + "</a>";
threadMonitoringController.exitInternalAction("_cIq3UbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (fsa.isPublished())
{
threadMonitoringController.enterBranch("_cIq3U7vVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIreY7vVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIreZLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIsFcLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIsFcbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIssgLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIssgbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cItTkLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cItTkbvVEeyr6avTgCRLkQ");
String reportUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_RESULTS_PAGE).withCourseId(course.getId()).withSessionName(fsa.getFeedbackSessionName()).withRegistrationKey(userKey).withEntityType(isInstructor ? Const.EntityType.INSTRUCTOR : "").toAbsoluteString();
threadMonitoringController.enterInternalAction("_cIt6oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
reportUrlHtml = "<a href=\"" + reportUrl + "\">" + reportUrl + "</a>";
threadMonitoringController.exitInternalAction("_cIt6oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
threadMonitoringController.setExternalCallId("_cIt6orvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIt6o7vVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIuhsLvVEeyr6avTgCRLkQ");
Instant endTime = TimeHelper.getMidnightAdjustedInstantBasedOnZone(fsa.getEndTime(), fsa.getTimeZone(), false);
threadMonitoringController.setExternalCallId("_cIuhsbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIvIwLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIvIwbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIvv0LvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cIvv0bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cIwW4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
linksFragmentValue.append(Templates.populateTemplate(EmailTemplates.FRAGMENT_SINGLE_FEEDBACK_SESSION_LINKS, "${feedbackSessionName}", fsa.getFeedbackSessionName(), "${deadline}", TimeHelper.formatInstant(endTime, fsa.getTimeZone(), DATETIME_DISPLAY_FORMAT) + (fsa.isClosed() ? " (Passed)" : ""), "${submitUrl}", submitUrlHtml, "${reportUrl}", reportUrlHtml));
threadMonitoringController.exitInternalAction("_cIwW4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
threadMonitoringController.exitLoop("_cIml4LvVEeyr6avTgCRLkQ", loopIterationCounter1.get());
threadMonitoringController.enterInternalAction("_cIw98LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (linksFragmentValue.length() == 0)
{
linksFragmentValue.append("No links found.");
}
threadMonitoringController.exitInternalAction("_cIw98LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_cI0oUbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String additionalContactInformation = getAdditionalContactInformationFragment(course, isInstructor);
threadMonitoringController.exitInternalAction("_cI0oUbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_cI0oUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String resendLinksTemplate = emailType == EmailType.STUDENT_EMAIL_CHANGED ? Templates.EmailTemplates.USER_FEEDBACK_SESSION_RESEND_ALL_LINKS : Templates.EmailTemplates.USER_REGKEY_REGENERATION_RESEND_ALL_COURSE_LINKS;
threadMonitoringController.exitInternalAction("_cI0oUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cI1PYLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cI1PYbvVEeyr6avTgCRLkQ");
String userName = isInstructor ? instructor.getName() : student.getName();
threadMonitoringController.setExternalCallId("_cI3roLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cI3robvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cI4SsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cI4SsbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cI45wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cI45wbvVEeyr6avTgCRLkQ");
String emailBody = Templates.populateTemplate(resendLinksTemplate, "${userName}", SanitizationHelper.sanitizeForHtml(userName), "${userEmail}", userEmail, "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${courseId}", course.getId(), "${joinFragment}", joinFragmentValue, "${linksFragment}", linksFragmentValue.toString(), "${additionalContactInformation}", additionalContactInformation);
threadMonitoringController.exitInternalAction("_cI45wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_cI8kI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(userEmail);
threadMonitoringController.exitInternalAction("_cI8kI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cI9LMLvVEeyr6avTgCRLkQ");
email.setContent(emailBody);
threadMonitoringController.setExternalCallId("_cI9yQLvVEeyr6avTgCRLkQ");
email.setType(emailType);
threadMonitoringController.setExternalCallId("_cI_AYLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cJCDsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cJCDsbvVEeyr6avTgCRLkQ");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.enterInternalAction("_cJCqwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023847004190868542086492 = email;
threadMonitoringController.exitInternalAction("_cJCqwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023847004190868542086492;
}
finally {
threadMonitoringController.exitService("_cIHdsLvVEeyr6avTgCRLkQ");
}
}

public  EmailWrapper generateSessionLinksRecoveryEmailForStudent(String recoveryEmailAddress) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("recoveryEmailAddress", recoveryEmailAddress);
threadMonitoringController.enterService("_cJG8MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cJJ_gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> studentsForEmail = studentsLogic.getAllStudentsForEmail(recoveryEmailAddress);
threadMonitoringController.exitInternalAction("_cJJ_gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (studentsForEmail.isEmpty())
{
threadMonitoringController.enterBranch("_cJhL4LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cJmrcrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023879003687946846475232 = generateSessionLinksRecoveryEmailForNonExistentStudent(recoveryEmailAddress);
threadMonitoringController.exitInternalAction("_cJmrcrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023879003687946846475232;
}
else
{
threadMonitoringController.enterInternalAction("_cJzfwrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302387900029571008903273355 = generateSessionLinksRecoveryEmailForExistingStudent(recoveryEmailAddress, studentsForEmail);
threadMonitoringController.exitInternalAction("_cJzfwrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302387900029571008903273355;
}
}
finally {
threadMonitoringController.exitService("_cJG8MLvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_cJ60gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cK4d1rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130238950014600997517025072 = generateFeedbackSessionOpeningOrClosingEmails(session, EmailType.FEEDBACK_CLOSING);
threadMonitoringController.exitInternalAction("_cK4d1rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130238950014600997517025072;
}
finally {
threadMonitoringController.exitService("_cJ60gLvVEeyr6avTgCRLkQ");
}
}

public  List<EmailWrapper> generateFeedbackSessionClosedEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_cK8vQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cLrIBbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023909008772469221814165 = generateFeedbackSessionOpeningSoonOrClosedEmails(session, EmailType.FEEDBACK_CLOSED);
threadMonitoringController.exitInternalAction("_cLrIBbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023909008772469221814165;
}
finally {
threadMonitoringController.exitService("_cK8vQLvVEeyr6avTgCRLkQ");
}
}

public  List<EmailWrapper> generateFeedbackSessionPublishedEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_cLwAgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cNBL07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130239260006685859641993142 = generateFeedbackSessionPublishedOrUnpublishedEmails(session, EmailType.FEEDBACK_PUBLISHED);
threadMonitoringController.exitInternalAction("_cNBL07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130239260006685859641993142;
}
finally {
threadMonitoringController.exitService("_cLwAgLvVEeyr6avTgCRLkQ");
}
}

public  List<EmailWrapper> generateFeedbackSessionPublishedEmails(FeedbackSessionAttributes session, List<StudentAttributes> students, List<InstructorAttributes> instructors, List<InstructorAttributes> instructorsToNotify) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
monitoringServiceParameters.addValue("students", students);
monitoringServiceParameters.addValue("instructors", instructors);
monitoringServiceParameters.addValue("instructorsToNotify", instructorsToNotify);
threadMonitoringController.enterService("_cNE2MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cN8Y4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023942009418445611351046 = generateFeedbackSessionPublishedOrUnpublishedEmails(session, students, instructors, instructorsToNotify, EmailType.FEEDBACK_PUBLISHED);
threadMonitoringController.exitInternalAction("_cN8Y4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023942009418445611351046;
}
finally {
threadMonitoringController.exitService("_cNE2MLvVEeyr6avTgCRLkQ");
}
}

public  List<EmailWrapper> generateFeedbackSessionUnpublishedEmails(FeedbackSessionAttributes session) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("session", session);
threadMonitoringController.enterService("_cN-1ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cO73Z7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<EmailWrapper> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302395900814813954671783 = generateFeedbackSessionPublishedOrUnpublishedEmails(session, EmailType.FEEDBACK_UNPUBLISHED);
threadMonitoringController.exitInternalAction("_cO73Z7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302395900814813954671783;
}
finally {
threadMonitoringController.exitService("_cN-1ILvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_cPPZYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.setExternalCallId("_cPScsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cPTq0LvVEeyr6avTgCRLkQ");
String emailBody = Templates.populateTemplate(EmailTemplates.NEW_INSTRUCTOR_ACCOUNT_WELCOME, "${userName}", SanitizationHelper.sanitizeForHtml(instructorName), "${joinUrl}", joinUrl);
threadMonitoringController.enterInternalAction("_cPaYg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(instructorEmail);
threadMonitoringController.exitInternalAction("_cPaYg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cPa_kLvVEeyr6avTgCRLkQ");
email.setBcc(Config.SUPPORT_EMAIL);
threadMonitoringController.setExternalCallId("_cPbmoLvVEeyr6avTgCRLkQ");
email.setType(EmailType.NEW_INSTRUCTOR_ACCOUNT);
threadMonitoringController.setExternalCallId("_cPc0wLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cPdb0LvVEeyr6avTgCRLkQ");
email.setSubjectFromType(SanitizationHelper.sanitizeForHtml(instructorName));
threadMonitoringController.setExternalCallId("_cPeC4LvVEeyr6avTgCRLkQ");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_cPeC4bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024024007317120522318297 = email;
threadMonitoringController.exitInternalAction("_cPeC4bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024024007317120522318297;
}
finally {
threadMonitoringController.exitService("_cPPZYLvVEeyr6avTgCRLkQ");
}
}

public  EmailWrapper generateStudentCourseJoinEmail(CourseAttributes course, StudentAttributes student) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("course", course);
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_cPhtQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cPssYrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cPssY7vVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cPtTcLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cPtTcbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cPt6gLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cPvvsrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cPvvs7vVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cPvvtLvVEeyr6avTgCRLkQ");
String emailBody = Templates.populateTemplate(fillUpStudentJoinFragment(student), "${userName}", SanitizationHelper.sanitizeForHtml(student.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${coOwnersEmails}", generateCoOwnersEmailsLine(course.getId()), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_cPvvsrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_cPssYrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cP0oMLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cP3rg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(student.getEmail());
threadMonitoringController.exitInternalAction("_cP3rg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cP4SkLvVEeyr6avTgCRLkQ");
email.setType(EmailType.STUDENT_COURSE_JOIN);
threadMonitoringController.setExternalCallId("_cP5gsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cP6HwLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cP6u0LvVEeyr6avTgCRLkQ");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_cP7V4LvVEeyr6avTgCRLkQ");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_cP788LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130241290013329098458627575 = email;
threadMonitoringController.exitInternalAction("_cP788LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130241290013329098458627575;
}
finally {
threadMonitoringController.exitService("_cPhtQLvVEeyr6avTgCRLkQ");
}
}

public  EmailWrapper generateStudentCourseRejoinEmailAfterGoogleIdReset(CourseAttributes course, StudentAttributes student) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("course", course);
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_cP_AQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cQMbobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQMborvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQNCsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQNCsbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQNpwLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cQQGBrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQQGB7vVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQQtELvVEeyr6avTgCRLkQ");
String emailBody = Templates.populateTemplate(fillUpStudentRejoinAfterGoogleIdResetFragment(student), "${userName}", SanitizationHelper.sanitizeForHtml(student.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${coOwnersEmails}", generateCoOwnersEmailsLine(course.getId()), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_cQQGBrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_cQMbobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQTJULvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cQVlkrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(student.getEmail());
threadMonitoringController.exitInternalAction("_cQVlkrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQVlk7vVEeyr6avTgCRLkQ");
email.setType(EmailType.STUDENT_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET);
threadMonitoringController.setExternalCallId("_cQWzsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQWzsbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQXawLvVEeyr6avTgCRLkQ");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_cQYB0LvVEeyr6avTgCRLkQ");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_cQYo4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024245006345696535557847 = email;
threadMonitoringController.exitInternalAction("_cQYo4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024245006345696535557847;
}
finally {
threadMonitoringController.exitService("_cP_AQLvVEeyr6avTgCRLkQ");
}
}

public  EmailWrapper generateInstructorCourseJoinEmail(AccountAttributes inviter, InstructorAttributes instructor, CourseAttributes course) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("inviter", inviter);
monitoringServiceParameters.addValue("instructor", instructor);
monitoringServiceParameters.addValue("course", course);
threadMonitoringController.enterService("_cQbsMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cQldMbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQldMrvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQldM7vVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQmEQLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQmEQbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQmrULvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQmrUbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQnSYLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQnSYbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQn5cLvVEeyr6avTgCRLkQ");
String emailBody = Templates.populateTemplate(fillUpInstructorJoinFragment(instructor), "${userName}", SanitizationHelper.sanitizeForHtml(instructor.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${inviterName}", SanitizationHelper.sanitizeForHtml(inviter.getName()), "${inviterEmail}", SanitizationHelper.sanitizeForHtml(inviter.getEmail()), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_cQldMbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQpuoLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cQsK4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(instructor.getEmail());
threadMonitoringController.exitInternalAction("_cQsK4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQsK47vVEeyr6avTgCRLkQ");
email.setType(EmailType.INSTRUCTOR_COURSE_JOIN);
threadMonitoringController.setExternalCallId("_cQuAELvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQuAEbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQunILvVEeyr6avTgCRLkQ");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_cQvOMLvVEeyr6avTgCRLkQ");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_cQvOMbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130243740041868628463640156 = email;
threadMonitoringController.exitInternalAction("_cQvOMbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130243740041868628463640156;
}
finally {
threadMonitoringController.exitService("_cQbsMLvVEeyr6avTgCRLkQ");
}
}

public  EmailWrapper generateInstructorCourseRejoinEmailAfterGoogleIdReset(InstructorAttributes instructor, CourseAttributes course) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
monitoringServiceParameters.addValue("course", course);
threadMonitoringController.enterService("_cQyRgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cQ5mQrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQ5mQ7vVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQ6NULvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQ6NUbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQ60YLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cQ7bcLvVEeyr6avTgCRLkQ");
String emailBody = Templates.populateTemplate(fillUpInstructorRejoinAfterGoogleIdResetFragment(instructor), "${userName}", SanitizationHelper.sanitizeForHtml(instructor.getName()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_cQ5mQrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQ9QoLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cQ_s4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(instructor.getEmail());
threadMonitoringController.exitInternalAction("_cQ_s4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cQ_s47vVEeyr6avTgCRLkQ");
email.setType(EmailType.INSTRUCTOR_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET);
threadMonitoringController.setExternalCallId("_cRA7ALvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRBiELvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRBiEbvVEeyr6avTgCRLkQ");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_cRCJILvVEeyr6avTgCRLkQ");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_cRCwMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024467009377612440919044 = email;
threadMonitoringController.exitInternalAction("_cRCwMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024467009377612440919044;
}
finally {
threadMonitoringController.exitService("_cQyRgLvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_cRFzgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.setExternalCallId("_cRKsALvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRKsAbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRLTELvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRL6ILvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRL6IbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRMhMLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRMhMbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRNIQLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRNIQbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRNvULvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cROWYLvVEeyr6avTgCRLkQ");
String emailBody = Templates.populateTemplate(EmailTemplates.USER_COURSE_REGISTER, "${userName}", SanitizationHelper.sanitizeForHtml(name), "${userType}", isInstructor ? "an instructor" : "a student", "${courseId}", SanitizationHelper.sanitizeForHtml(course.getId()), "${courseName}", SanitizationHelper.sanitizeForHtml(course.getName()), "${googleId}", SanitizationHelper.sanitizeForHtml(googleId), "${appUrl}", isInstructor ? Config.getFrontEndAppUrl(Const.WebPageURIs.INSTRUCTOR_HOME_PAGE).toAbsoluteString() : Config.getFrontEndAppUrl(Const.WebPageURIs.STUDENT_HOME_PAGE).toAbsoluteString(), "${supportEmail}", Config.SUPPORT_EMAIL);
threadMonitoringController.enterInternalAction("_cRSn0rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(emailAddress);
threadMonitoringController.exitInternalAction("_cRSn0rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cRSn07vVEeyr6avTgCRLkQ");
email.setType(EmailType.USER_COURSE_REGISTER);
threadMonitoringController.setExternalCallId("_cRT18LvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRT18bvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cRUdALvVEeyr6avTgCRLkQ");
email.setSubjectFromType(course.getName(), course.getId());
threadMonitoringController.setExternalCallId("_cRVEELvVEeyr6avTgCRLkQ");
email.setContent(emailBody);
threadMonitoringController.enterInternalAction("_cRVrILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130245880036833628996058687 = email;
threadMonitoringController.exitInternalAction("_cRVrILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130245880036833628996058687;
}
finally {
threadMonitoringController.exitService("_cRFzgLvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_cRkUoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cRmw4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder emailBody = new  StringBuilder();
threadMonitoringController.exitInternalAction("_cRmw4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
for (int i = 0 ; i < logs.size() ; i++)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_cRsQdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_cRsQdrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cRs3gLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cRs3gbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cRs3grvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cRtekLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cRtekbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_cRtekrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
emailBody.append(generateSevereErrorLogLine(i, logs.get(i).getMessage(), logs.get(i).getSeverity(), logs.get(i).getTraceId()));
threadMonitoringController.exitInternalAction("_cRtekrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_cRtekLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_cRs3gbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_cRsQdrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_cRsQdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
threadMonitoringController.exitLoop("_cRrpYLvVEeyr6avTgCRLkQ", loopIterationCounter1.get());
threadMonitoringController.enterInternalAction("_cRxI8rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper email = getEmptyEmailAddressedToEmail(Config.SUPPORT_EMAIL);
threadMonitoringController.exitInternalAction("_cRxI8rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cRxI87vVEeyr6avTgCRLkQ");
email.setType(EmailType.SEVERE_LOGS_COMPILATION);
threadMonitoringController.setExternalCallId("_cRyXELvVEeyr6avTgCRLkQ");
email.setSubjectFromType(Config.APP_VERSION);
threadMonitoringController.enterInternalAction("_cRzlMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cRzlMbvVEeyr6avTgCRLkQ");
email.setContent(emailBody.toString());
threadMonitoringController.exitInternalAction("_cRzlMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_cR0zULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailWrapper longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302469700798900709614747 = email;
threadMonitoringController.exitInternalAction("_cR0zULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302469700798900709614747;
}
finally {
threadMonitoringController.exitService("_cRkUoLvVEeyr6avTgCRLkQ");
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
