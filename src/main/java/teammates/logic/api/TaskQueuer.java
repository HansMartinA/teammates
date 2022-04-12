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
threadMonitoringController.enterService("_uV9b0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uV_RALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
TaskQueuer longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826850025910688550343297 = instance;
threadMonitoringController.exitInternalAction("_uV_RALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826850025910688550343297;
}
finally {
threadMonitoringController.exitService("_uV9b0LngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_uWGlwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uWIa8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.INSTRUCTOR_ID, googleIdOfRequestingInstructor);
paramMap.put(ParamsNames.FEEDBACK_SESSION_NAME, feedbackSessionName);
paramMap.put(ParamsNames.COURSE_ID, courseId);
threadMonitoringController.exitInternalAction("_uWIa8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uWN6hrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_REMIND_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_REMIND_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_uWN6hrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uWGlwLngEeyIw-dB1KCaVA");
}
}

public  void scheduleFeedbackSessionRemindersForParticularUsers(String courseId, String feedbackSessionName, String[]  usersToRemind, String requestingInstructorId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("usersToRemind", usersToRemind);
monitoringServiceParameters.addValue("requestingInstructorId", requestingInstructorId);
threadMonitoringController.enterService("_uWRk4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uWTaELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionRemindRequest remindRequest = new  FeedbackSessionRemindRequest(courseId, feedbackSessionName, requestingInstructorId, usersToRemind);
threadMonitoringController.exitInternalAction("_uWTaELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uWXEdrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_REMIND_PARTICULAR_USERS_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_REMIND_PARTICULAR_USERS_EMAIL_WORKER_URL, new  HashMap<>(), remindRequest);
threadMonitoringController.exitInternalAction("_uWXEdrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uWRk4LngEeyIw-dB1KCaVA");
}
}

public  void scheduleFeedbackSessionPublishedEmail(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_uWaHwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uWckALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.FEEDBACK_SESSION_NAME, feedbackSessionName);
threadMonitoringController.exitInternalAction("_uWckALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uWhchrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_PUBLISHED_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_PUBLISHED_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_uWhchrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uWaHwLngEeyIw-dB1KCaVA");
}
}

public  void scheduleFeedbackSessionResendPublishedEmail(String courseId, String feedbackSessionName, String[]  usersToEmail, String requestingInstructorId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("usersToEmail", usersToEmail);
monitoringServiceParameters.addValue("requestingInstructorId", requestingInstructorId);
threadMonitoringController.enterService("_uWpYULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uWr0kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionRemindRequest remindRequest = new  FeedbackSessionRemindRequest(courseId, feedbackSessionName, requestingInstructorId, usersToEmail);
threadMonitoringController.exitInternalAction("_uWr0kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uWwGBrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_RESEND_PUBLISHED_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_RESEND_PUBLISHED_EMAIL_WORKER_URL, new  HashMap<>(), remindRequest);
threadMonitoringController.exitInternalAction("_uWwGBrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uWpYULngEeyIw-dB1KCaVA");
}
}

public  void scheduleFeedbackSessionUnpublishedEmail(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_uWzJULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uW1lkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.FEEDBACK_SESSION_NAME, feedbackSessionName);
threadMonitoringController.exitInternalAction("_uW1lkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uW6eFrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.FEEDBACK_SESSION_UNPUBLISHED_EMAIL_QUEUE_NAME, TaskQueue.FEEDBACK_SESSION_UNPUBLISHED_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_uW6eFrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uWzJULngEeyIw-dB1KCaVA");
}
}

public  void scheduleCourseRegistrationInviteToInstructor(String inviterGoogleId, String instructorEmail, String courseId, boolean isRejoining) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("inviterGoogleId", inviterGoogleId);
monitoringServiceParameters.addValue("instructorEmail", instructorEmail);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("isRejoining", isRejoining);
threadMonitoringController.enterService("_uW9hYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uW_9oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
if (inviterGoogleId != null)
{
paramMap.put(ParamsNames.INVITER_ID, inviterGoogleId);
}
paramMap.put(ParamsNames.INSTRUCTOR_EMAIL, instructorEmail);
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.IS_INSTRUCTOR_REJOINING, String.valueOf(isRejoining));
threadMonitoringController.exitInternalAction("_uW_9oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uXGERrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.INSTRUCTOR_COURSE_JOIN_EMAIL_QUEUE_NAME, TaskQueue.INSTRUCTOR_COURSE_JOIN_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_uXGERrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uW9hYLngEeyIw-dB1KCaVA");
}
}

public  void scheduleCourseRegistrationInviteToStudent(String courseId, String studentEmail, boolean isRejoining) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("studentEmail", studentEmail);
monitoringServiceParameters.addValue("isRejoining", isRejoining);
threadMonitoringController.enterService("_uXJHkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uXLj0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.STUDENT_EMAIL, studentEmail);
paramMap.put(ParamsNames.IS_STUDENT_REJOINING, String.valueOf(isRejoining));
threadMonitoringController.exitInternalAction("_uXLj0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uXRqdrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.STUDENT_COURSE_JOIN_EMAIL_QUEUE_NAME, TaskQueue.STUDENT_COURSE_JOIN_EMAIL_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_uXRqdrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uXJHkLngEeyIw-dB1KCaVA");
}
}

public  void scheduleEmailsForSending(List<EmailWrapper> emails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("emails", emails);
threadMonitoringController.enterService("_uXVU0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uXXxELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (emails.isEmpty())
{
return;
}
int oneHourInMillis = 60 * 60 * 1000;
int emailIntervalMillis = Math.min(5000, oneHourInMillis / emails.size());
int numberOfEmailsSent = 0;
threadMonitoringController.exitInternalAction("_uXXxELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
for (EmailWrapper email : emails)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_uXdQo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
long emailDelayTimer = (long) numberOfEmailsSent * (long) emailIntervalMillis;
threadMonitoringController.exitInternalAction("_uXdQo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uXfF1rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
scheduleEmailForSending(email, emailDelayTimer);
threadMonitoringController.exitInternalAction("_uXfF1rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uXfF17ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
numberOfEmailsSent++;
threadMonitoringController.exitInternalAction("_uXfF17ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
threadMonitoringController.exitLoop("_uXdQoLngEeyIw-dB1KCaVA", loopIterationCounter1.get());
}
finally {
threadMonitoringController.exitService("_uXVU0LngEeyIw-dB1KCaVA");
}
}

public  void scheduleInstructorForSearchIndexing(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_uXiwMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uXklYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.INSTRUCTOR_EMAIL, email);
threadMonitoringController.exitInternalAction("_uXklYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uXqE9rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.SEARCH_INDEXING_QUEUE_NAME, TaskQueue.INSTRUCTOR_SEARCH_INDEXING_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_uXqE9rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uXiwMLngEeyIw-dB1KCaVA");
}
}

public  void scheduleAccountRequestForSearchIndexing(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_uXtvULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uXwLkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.INSTRUCTOR_EMAIL, email);
paramMap.put(ParamsNames.INSTRUCTOR_INSTITUTION, institute);
threadMonitoringController.exitInternalAction("_uXwLkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uX1rJrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.SEARCH_INDEXING_QUEUE_NAME, TaskQueue.ACCOUNT_REQUEST_SEARCH_INDEXING_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_uX1rJrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uXtvULngEeyIw-dB1KCaVA");
}
}

public  void scheduleStudentForSearchIndexing(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_uX4ucLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uX6joLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> paramMap = new  HashMap<>();
paramMap.put(ParamsNames.COURSE_ID, courseId);
paramMap.put(ParamsNames.STUDENT_EMAIL, email);
threadMonitoringController.exitInternalAction("_uX6joLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uYAqRrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addTask(TaskQueue.SEARCH_INDEXING_QUEUE_NAME, TaskQueue.STUDENT_SEARCH_INDEXING_WORKER_URL, paramMap, null);
threadMonitoringController.exitInternalAction("_uYAqRrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uX4ucLngEeyIw-dB1KCaVA");
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
