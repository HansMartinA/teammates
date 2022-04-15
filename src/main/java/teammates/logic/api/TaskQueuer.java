package teammates.logic.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import teammates.common.util.Config;
import teammates.common.util.Const.ParamsNames;
import teammates.common.util.Const.TaskQueue;
import teammates.common.util.EmailWrapper;
import teammates.common.util.Logger;
import teammates.common.util.TaskWrapper;
import teammates.logic.core.GoogleCloudTasksService;
import teammates.logic.core.LocalTaskQueueService;
import teammates.logic.core.TaskQueueService;
import teammates.ui.request.FeedbackSessionRemindRequest;
import teammates.ui.request.SendEmailRequest;
public class TaskQueuer {
private static final Logger log = Logger.getLogger();

private static final TaskQueuer instance = new  TaskQueuer();

private final TaskQueueService service;

 TaskQueuer(){
if (Config.isDevServer())
{
service = new  LocalTaskQueueService();
}
else
{
service = new  GoogleCloudTasksService();
}
}
public static  TaskQueuer inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_c6tYQLvVEeyr6avTgCRLkQ", TaskQueuer.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c6v0gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
TaskQueuer longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130265480003202918240985708 = instance;
threadMonitoringController.exitInternalAction("_c6v0gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130265480003202918240985708;
}
finally {
threadMonitoringController.exitService("_c6tYQLvVEeyr6avTgCRLkQ");
}
}

private  void addTask(String queueName, String workerUrl, Map<String, String> paramMap, Object requestBody) {
addDeferredTask(queueName, workerUrl, paramMap, requestBody, 0);
}

 void addDeferredTask(String queueName, String workerUrl, Map<String, String> paramMap, Object requestBody, long countdownTime) {
TaskWrapper task = new  TaskWrapper(queueName, workerUrl, paramMap, requestBody);
service.addDeferredTask(task, countdownTime);
}

public  void scheduleFeedbackSessionReminders(String courseId, String feedbackSessionName, String googleIdOfRequestingInstructor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("googleIdOfRequestingInstructor", googleIdOfRequestingInstructor);
threadMonitoringController.enterService("_c63wULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c66MkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.INSTRUCTOR_ID, googleIdOfRequestingInstructor);
paramMap.put(ParamsNames.FEEDBACK_SESSION_NAME, feedbackSessionName);
paramMap.put(ParamsNames.COURSE_ID, courseId);
threadMonitoringController.exitInternalAction("_c66MkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c6_sI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_REMIND_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_REMIND_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_c6_sI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c63wULvVEeyr6avTgCRLkQ");
}
}

public  void scheduleFeedbackSessionRemindersForParticularUsers(String courseId, String feedbackSessionName, String[]  usersToRemind, String requestingInstructorId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("usersToRemind", usersToRemind);
monitoringServiceParameters.addValue("requestingInstructorId", requestingInstructorId);
threadMonitoringController.enterService("_c7DWgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c7FLsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionRemindRequest remindRequest = new  FeedbackSessionRemindRequest(courseId, feedbackSessionName, requestingInstructorId, usersToRemind);
threadMonitoringController.exitInternalAction("_c7FLsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c7I2FrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_REMIND_PARTICULAR_USERS_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_REMIND_PARTICULAR_USERS_EMAIL_WORKER_URL, new  HashMap<>(), remindRequest);
threadMonitoringController.exitInternalAction("_c7I2FrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c7DWgLvVEeyr6avTgCRLkQ");
}
}

public  void scheduleFeedbackSessionPublishedEmail(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_c7MgcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c7O8sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.FEEDBACK_SESSION_NAME, feedbackSessionName);
threadMonitoringController.exitInternalAction("_c7O8sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c7T1NrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_PUBLISHED_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_PUBLISHED_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_c7T1NrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c7MgcLvVEeyr6avTgCRLkQ");
}
}

public  void scheduleFeedbackSessionResendPublishedEmail(String courseId, String feedbackSessionName, String[]  usersToEmail, String requestingInstructorId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("usersToEmail", usersToEmail);
monitoringServiceParameters.addValue("requestingInstructorId", requestingInstructorId);
threadMonitoringController.enterService("_c7XfkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c7Z70LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionRemindRequest remindRequest = new  FeedbackSessionRemindRequest(courseId, feedbackSessionName, requestingInstructorId, usersToEmail);
threadMonitoringController.exitInternalAction("_c7Z70LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c7eNRrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_RESEND_PUBLISHED_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_RESEND_PUBLISHED_EMAIL_WORKER_URL, new  HashMap<>(), remindRequest);
threadMonitoringController.exitInternalAction("_c7eNRrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c7XfkLvVEeyr6avTgCRLkQ");
}
}

public  void scheduleFeedbackSessionUnpublishedEmail(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_c7jFwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c7liALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.FEEDBACK_SESSION_NAME, feedbackSessionName);
threadMonitoringController.exitInternalAction("_c7liALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c7qahrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_UNPUBLISHED_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_UNPUBLISHED_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_c7qahrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c7jFwLvVEeyr6avTgCRLkQ");
}
}

public  void scheduleCourseRegistrationInviteToInstructor(String inviterGoogleId, String instructorEmail, String courseId, boolean isRejoining) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("inviterGoogleId", inviterGoogleId);
monitoringServiceParameters.addValue("instructorEmail", instructorEmail);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("isRejoining", isRejoining);
threadMonitoringController.enterService("_c7uE4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c7xIMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
if (inviterGoogleId != null)
{
paramMap.put(ParamsNames.INVITER_ID, inviterGoogleId);
}
paramMap.put(ParamsNames.INSTRUCTOR_EMAIL, instructorEmail);
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.IS_INSTRUCTOR_REJOINING, String.valueOf(isRejoining));
threadMonitoringController.exitInternalAction("_c7xIMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c7315rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.INSTRUCTOR_COURSE_JOIN_EMAIL_QUEUE_NAME, TaskQueue.INSTRUCTOR_COURSE_JOIN_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_c7315rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c7uE4LvVEeyr6avTgCRLkQ");
}
}

public  void scheduleCourseRegistrationInviteToStudent(String courseId, String studentEmail, boolean isRejoining) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("studentEmail", studentEmail);
monitoringServiceParameters.addValue("isRejoining", isRejoining);
threadMonitoringController.enterService("_c77gQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c798gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.STUDENT_EMAIL, studentEmail);
paramMap.put(ParamsNames.IS_STUDENT_REJOINING, String.valueOf(isRejoining));
threadMonitoringController.exitInternalAction("_c798gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c8EDJrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.STUDENT_COURSE_JOIN_EMAIL_QUEUE_NAME, TaskQueue.STUDENT_COURSE_JOIN_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_c8EDJrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c77gQLvVEeyr6avTgCRLkQ");
}
}

public  void scheduleEmailsForSending(List<EmailWrapper> emails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("emails", emails);
threadMonitoringController.enterService("_c8HGcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c8JisLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (emails.isEmpty())
{
return;
}
int oneHourInMillis = 60 * 60 * 1000;
int emailIntervalMillis = Math.min(5000, oneHourInMillis / emails.size());
int numberOfEmailsSent = 0;
threadMonitoringController.exitInternalAction("_c8JisLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
for (EmailWrapper email : emails)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_c8PpU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long emailDelayTimer = (long) numberOfEmailsSent * (long) emailIntervalMillis;
threadMonitoringController.exitInternalAction("_c8PpU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c8RehLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
scheduleEmailForSending(email, emailDelayTimer);
threadMonitoringController.exitInternalAction("_c8RehLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c8RehbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
numberOfEmailsSent++;
threadMonitoringController.exitInternalAction("_c8RehbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
threadMonitoringController.exitLoop("_c8PpULvVEeyr6avTgCRLkQ", loopIterationCounter1.get());
}
finally {
threadMonitoringController.exitService("_c8HGcLvVEeyr6avTgCRLkQ");
}
}

public  void scheduleInstructorForSearchIndexing(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_c8Uh0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c8W-ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.INSTRUCTOR_EMAIL, email);
threadMonitoringController.exitInternalAction("_c8W-ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c8cdprvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.SEARCH_INDEXING_QUEUE_NAME, TaskQueue.INSTRUCTOR_SEARCH_INDEXING_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_c8cdprvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c8Uh0LvVEeyr6avTgCRLkQ");
}
}

public  void scheduleAccountRequestForSearchIndexing(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_c8gvELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c8jLULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.INSTRUCTOR_EMAIL, email);
paramMap.put(ParamsNames.INSTRUCTOR_INSTITUTION, institute);
threadMonitoringController.exitInternalAction("_c8jLULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c8rHJrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.SEARCH_INDEXING_QUEUE_NAME, TaskQueue.ACCOUNT_REQUEST_SEARCH_INDEXING_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_c8rHJrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c8gvELvVEeyr6avTgCRLkQ");
}
}

public  void scheduleStudentForSearchIndexing(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_c8yb4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c80RELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.STUDENT_EMAIL, email);
threadMonitoringController.exitInternalAction("_c80RELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c85wprvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.SEARCH_INDEXING_QUEUE_NAME, TaskQueue.STUDENT_SEARCH_INDEXING_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_c85wprvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c8yb4LvVEeyr6avTgCRLkQ");
}
}

private  void scheduleEmailForSending(EmailWrapper email, long emailDelayTimer) {
try {
SendEmailRequest request = new  SendEmailRequest(email);
addDeferredTask(TaskQueue.SEND_EMAIL_QUEUE_NAME, TaskQueue.SEND_EMAIL_WORKER_URL, new  HashMap<>(), request, emailDelayTimer);
}
catch(Exception e){
String emailSubject = email.getSubject();
String emailSenderName = email.getSenderName();
String emailSender = email.getSenderEmail();
String emailReceiver = email.getRecipient();
String emailReplyToAddress = email.getReplyTo();
log.severe("Error when adding email to task queue: " + e.getMessage() + "\n" + "Email sender: " + emailSender + "\n" + "Email sender name: " + emailSenderName + "\n" + "Email receiver: " + emailReceiver + "\n" + "Email subject: " + emailSubject + "\n" + "Email reply-to address: " + emailReplyToAddress);
}
}

}
