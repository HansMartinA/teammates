package teammates.common.datatransfer.attributes;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import teammates.common.util.Const;
import teammates.common.util.FieldValidator;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.FeedbackSession;
public class FeedbackSessionAttributes extends EntityAttributes<FeedbackSession> {
private String feedbackSessionName;

private String courseId;

private String creatorEmail;

private String instructions;

private Instant createdTime;

private Instant deletedTime;

private Instant startTime;

private Instant endTime;

private Instant sessionVisibleFromTime;

private Instant resultsVisibleFromTime;

private String timeZone;

private Duration gracePeriod;

private boolean sentOpeningSoonEmail;

private boolean sentOpenEmail;

private boolean sentClosingEmail;

private boolean sentClosedEmail;

private boolean sentPublishedEmail;

private boolean isOpeningEmailEnabled;

private boolean isClosingEmailEnabled;

private boolean isPublishedEmailEnabled;

private  FeedbackSessionAttributes(String feedbackSessionName, String courseId){
this.feedbackSessionName = feedbackSessionName;
this.courseId = courseId;
this.instructions = "";
this.createdTime = Instant.now();
this.isOpeningEmailEnabled = true;
this.isClosingEmailEnabled = true;
this.isPublishedEmailEnabled = true;
this.timeZone = Const.DEFAULT_TIME_ZONE;
this.gracePeriod = Duration.ZERO;
}
public static  FeedbackSessionAttributes valueOf(FeedbackSession fs) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fs", fs);
threadMonitoringController.enterService("_rwDwkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwEXoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes feedbackSessionAttributes = new  FeedbackSessionAttributes(fs.getFeedbackSessionName(), fs.getCourseId());
feedbackSessionAttributes.creatorEmail = fs.getCreatorEmail();
if (fs.getInstructions() != null)
{
feedbackSessionAttributes.instructions = fs.getInstructions();
}
feedbackSessionAttributes.createdTime = fs.getCreatedTime();
feedbackSessionAttributes.deletedTime = fs.getDeletedTime();
feedbackSessionAttributes.startTime = fs.getStartTime();
feedbackSessionAttributes.endTime = fs.getEndTime();
feedbackSessionAttributes.sessionVisibleFromTime = fs.getSessionVisibleFromTime();
feedbackSessionAttributes.resultsVisibleFromTime = fs.getResultsVisibleFromTime();
feedbackSessionAttributes.timeZone = fs.getTimeZone();
feedbackSessionAttributes.gracePeriod = Duration.ofMinutes(fs.getGracePeriod());
feedbackSessionAttributes.sentOpeningSoonEmail = fs.isSentOpeningSoonEmail();
feedbackSessionAttributes.sentOpenEmail = fs.isSentOpenEmail();
feedbackSessionAttributes.sentClosingEmail = fs.isSentClosingEmail();
feedbackSessionAttributes.sentClosedEmail = fs.isSentClosedEmail();
feedbackSessionAttributes.sentPublishedEmail = fs.isSentPublishedEmail();
feedbackSessionAttributes.isOpeningEmailEnabled = fs.isOpeningEmailEnabled();
feedbackSessionAttributes.isClosingEmailEnabled = fs.isClosingEmailEnabled();
feedbackSessionAttributes.isPublishedEmailEnabled = fs.isPublishedEmailEnabled();
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679655007364215283753197 = feedbackSessionAttributes;
threadMonitoringController.exitInternalAction("_rwEXoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679655007364215283753197;
}
finally {
threadMonitoringController.exitService("_rwDwkLngEeyIw-dB1KCaVA");
}
}

public static  Builder builder(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_rwICAbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwIpELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136796580023388675057339658 = new  Builder(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_rwIpELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136796580023388675057339658;
}
finally {
threadMonitoringController.exitService("_rwICAbngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rwJQIbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwNhmLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367966100008834006281964624 = valueOf(toEntity());
threadMonitoringController.exitInternalAction("_rwNhmLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367966100008834006281964624;
}
finally {
threadMonitoringController.exitService("_rwJQIbngEeyIw-dB1KCaVA");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rwOvsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwPWwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679664009501473302737082 = courseId;
threadMonitoringController.exitInternalAction("_rwPWwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679664009501473302737082;
}
finally {
threadMonitoringController.exitService("_rwOvsLngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rwP90LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwQk4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679666000064919640313282345 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_rwQk4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679666000064919640313282345;
}
finally {
threadMonitoringController.exitService("_rwP90LngEeyIw-dB1KCaVA");
}
}

public  String getInstructionsString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rwRzALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwSaELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instructions == null)
{
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136796700035919674515870637 = null;
threadMonitoringController.exitInternalAction("_rwSaELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136796700035919674515870637;
}
return SanitizationHelper.sanitizeForRichText(instructions);
}
finally {
threadMonitoringController.exitService("_rwRzALngEeyIw-dB1KCaVA");
}
}

@Override
public  FeedbackSession toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rwUPQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwU2VLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSession longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367967400016410226646451864 = new  FeedbackSession(feedbackSessionName, courseId, creatorEmail, instructions, createdTime, deletedTime, startTime, endTime, sessionVisibleFromTime, resultsVisibleFromTime, timeZone, getGracePeriodMinutes(), sentOpeningSoonEmail, sentOpenEmail, sentClosingEmail, sentClosedEmail, sentPublishedEmail, isOpeningEmailEnabled, isClosingEmailEnabled, isPublishedEmailEnabled);
threadMonitoringController.exitInternalAction("_rwU2VLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367967400016410226646451864;
}
finally {
threadMonitoringController.exitService("_rwUPQLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rwWEcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwWEcbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_rwWEcbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwXSlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwXSmbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField(FieldValidator.FEEDBACK_SESSION_NAME_FIELD_NAME, feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_rwXSmbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwXSlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwX5o7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwX5p7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField(FieldValidator.COURSE_ID_FIELD_NAME, courseId), errors);
threadMonitoringController.exitInternalAction("_rwX5p7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwX5o7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwYgs7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwYgt7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("instructions to students", instructions), errors);
threadMonitoringController.exitInternalAction("_rwYgt7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwYgs7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwZHw7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwZHx7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("time for the session to become visible", sessionVisibleFromTime), errors);
threadMonitoringController.exitInternalAction("_rwZHx7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwZHw7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwZu07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwZu17ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("session time zone", timeZone), errors);
threadMonitoringController.exitInternalAction("_rwZu17ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwZu07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwaV47ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwaV57ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("creator's email", creatorEmail), errors);
threadMonitoringController.exitInternalAction("_rwaV57ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwaV47ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwbkA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwcLE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("session creation time", createdTime), errors);
threadMonitoringController.exitInternalAction("_rwcLE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwbkA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwcLFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!errors.isEmpty())
{
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679718007216831407480757 = errors;
threadMonitoringController.exitInternalAction("_rwcLFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679718007216831407480757;
}
threadMonitoringController.enterInternalAction("_rwhDk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForFeedbackSessionName(feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_rwhDk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwiRs7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_rwiRs7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwjf07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(creatorEmail), errors);
threadMonitoringController.exitInternalAction("_rwjf07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwjf2LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwkG47ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForGracePeriod(gracePeriod), errors);
threadMonitoringController.exitInternalAction("_rwkG47ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwjf2LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwkt87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwkt97ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("submission opening time", startTime), errors);
threadMonitoringController.exitInternalAction("_rwkt97ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwkt87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwlVA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwlVB7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("submission closing time", endTime), errors);
threadMonitoringController.exitInternalAction("_rwlVB7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwlVA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwmjI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwmjJ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("time for the responses to become visible", resultsVisibleFromTime), errors);
threadMonitoringController.exitInternalAction("_rwmjJ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwmjI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwmjKLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!errors.isEmpty())
{
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679719005162461847808749 = errors;
threadMonitoringController.exitInternalAction("_rwmjKLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679719005162461847808749;
}
threadMonitoringController.enterInternalAction("_rwnKOLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwnxQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForTimeForSessionStartAndEnd(startTime, endTime), errors);
threadMonitoringController.exitInternalAction("_rwnxQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwnKOLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwoYV7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwoYW7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForTimeForVisibilityStartAndSessionStart(sessionVisibleFromTime, startTime), errors);
threadMonitoringController.exitInternalAction("_rwoYW7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwoYV7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwoYXLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant actualSessionVisibleFromTime = sessionVisibleFromTime;
if (actualSessionVisibleFromTime.equals(Const.TIME_REPRESENTS_FOLLOW_OPENING))
{
actualSessionVisibleFromTime = startTime;
}
threadMonitoringController.exitInternalAction("_rwoYXLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwpmdbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwpmebngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForTimeForVisibilityStartAndResultsPublish(actualSessionVisibleFromTime, resultsVisibleFromTime), errors);
threadMonitoringController.exitInternalAction("_rwpmebngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rwpmdbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rwpmerngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679719005418697107024494 = errors;
threadMonitoringController.exitInternalAction("_rwpmerngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679719005418697107024494;
}
finally {
threadMonitoringController.exitService("_rwWEcLngEeyIw-dB1KCaVA");
}
}

public  boolean isOpeningInHours(long hours) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hours", hours);
threadMonitoringController.enterService("_rwrboLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwspwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679723006636674639456687 = startTime.isAfter(Instant.now()) && Instant.now().plus(Duration.ofHours(hours)).isAfter(startTime);
threadMonitoringController.exitInternalAction("_rwspwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679723006636674639456687;
}
finally {
threadMonitoringController.exitService("_rwrboLngEeyIw-dB1KCaVA");
}
}

public  boolean isClosedAfter(long hours) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hours", hours);
threadMonitoringController.enterService("_rwtQ0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwue8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367972600284818615456225 = Instant.now().plus(Duration.ofHours(hours)).isAfter(endTime);
threadMonitoringController.exitInternalAction("_rwue8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367972600284818615456225;
}
finally {
threadMonitoringController.exitService("_rwtQ0LngEeyIw-dB1KCaVA");
}
}

public  boolean isClosingWithinTimeLimit(long hours) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hours", hours);
threadMonitoringController.enterService("_rwvGAbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwvtELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
Duration difference = Duration.between(now, endTime);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679729006282470373819875 = now.isAfter(startTime) && difference.compareTo(Duration.ofHours(hours - 1)) >= 0 && difference.compareTo(Duration.ofHours(hours)) < 0;
threadMonitoringController.exitInternalAction("_rwvtELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679729006282470373819875;
}
finally {
threadMonitoringController.exitService("_rwvGAbngEeyIw-dB1KCaVA");
}
}

public  boolean isOpeningWithinTimeLimit(long hours) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hours", hours);
threadMonitoringController.enterService("_rwyJULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rwywYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
Duration difference = Duration.between(now, startTime);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679732007738105760460519 = now.isBefore(startTime) && difference.compareTo(Duration.ofHours(hours - 1)) >= 0 && difference.compareTo(Duration.ofHours(hours)) < 0;
threadMonitoringController.exitInternalAction("_rwywYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679732007738105760460519;
}
finally {
threadMonitoringController.exitService("_rwyJULngEeyIw-dB1KCaVA");
}
}

public  boolean isClosedWithinPastHour() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rw0lkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rw1MoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
Instant given = endTime.plus(gracePeriod);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679734008457225332203174 = given.isBefore(now) && Duration.between(given, now).compareTo(Duration.ofHours(1)) < 0;
threadMonitoringController.exitInternalAction("_rw1MoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679734008457225332203174;
}
finally {
threadMonitoringController.exitService("_rw0lkLngEeyIw-dB1KCaVA");
}
}

public  boolean isClosed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rw2awbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rw3o4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679737005312872807962014 = Instant.now().isAfter(endTime.plus(gracePeriod));
threadMonitoringController.exitInternalAction("_rw3o4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679737005312872807962014;
}
finally {
threadMonitoringController.exitService("_rw2awbngEeyIw-dB1KCaVA");
}
}

public  boolean isOpened() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rw4P8bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rw43ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136797400035401850016563985 = !now.isBefore(startTime) && now.isBefore(endTime);
threadMonitoringController.exitInternalAction("_rw43ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136797400035401850016563985;
}
finally {
threadMonitoringController.exitService("_rw4P8bngEeyIw-dB1KCaVA");
}
}

public  boolean isInGracePeriod() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rw6sMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rw7TQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
Instant gracedEnd = endTime.plus(gracePeriod);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679743003623736530525514 = (now.isAfter(endTime) || now.equals(endTime)) && (now.isBefore(gracedEnd) || now.equals(gracedEnd));
threadMonitoringController.exitInternalAction("_rw7TQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679743003623736530525514;
}
finally {
threadMonitoringController.exitService("_rw6sMLngEeyIw-dB1KCaVA");
}
}

public  boolean isWaitingToOpen() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rw9IcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rw9vgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679746006985905893739143 = Instant.now().isBefore(startTime);
threadMonitoringController.exitInternalAction("_rw9vgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679746006985905893739143;
}
finally {
threadMonitoringController.exitService("_rw9IcLngEeyIw-dB1KCaVA");
}
}

public  boolean isVisible() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rw-WkbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rw-9oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant visibleTime = this.sessionVisibleFromTime;
if (visibleTime.equals(Const.TIME_REPRESENTS_FOLLOW_OPENING))
{
visibleTime = this.startTime;
}
Instant now = Instant.now();
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367975000024657953635484176 = now.isAfter(visibleTime) || now.equals(visibleTime);
threadMonitoringController.exitInternalAction("_rw-9oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367975000024657953635484176;
}
finally {
threadMonitoringController.exitService("_rw-WkbngEeyIw-dB1KCaVA");
}
}

public  boolean isPublished() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxALwbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxAy0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant publishTime = this.resultsVisibleFromTime;
if (publishTime.equals(Const.TIME_REPRESENTS_FOLLOW_VISIBLE))
{
return isVisible();
}
if (publishTime.equals(Const.TIME_REPRESENTS_LATER))
{
return false;
}
if (publishTime.equals(Const.TIME_REPRESENTS_NOW))
{
return true;
}
Instant now = Instant.now();
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679755003083194953450604 = now.isAfter(publishTime) || now.equals(publishTime);
threadMonitoringController.exitInternalAction("_rxAy0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679755003083194953450604;
}
finally {
threadMonitoringController.exitService("_rxALwbngEeyIw-dB1KCaVA");
}
}

public  boolean isCreator(String instructorEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorEmail", instructorEmail);
threadMonitoringController.enterService("_rxCoALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxDPELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136797620025735442854452795 = creatorEmail.equals(instructorEmail);
threadMonitoringController.exitInternalAction("_rxDPELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136797620025735442854452795;
}
finally {
threadMonitoringController.exitService("_rxCoALngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxD2IbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
this.instructions = SanitizationHelper.sanitizeForRichText(instructions);
}
finally {
threadMonitoringController.exitService("_rxD2IbngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxGSYbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxHghLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679768007199022084614554 = "FeedbackSessionAttributes [feedbackSessionName=" + feedbackSessionName + ", courseId=" + courseId + ", creatorEmail=" + creatorEmail + ", instructions=" + instructions + ", createdTime=" + createdTime + ", deletedTime=" + deletedTime + ", startTime=" + startTime + ", endTime=" + endTime + ", sessionVisibleFromTime=" + sessionVisibleFromTime + ", resultsVisibleFromTime=" + resultsVisibleFromTime + ", timeZone=" + timeZone + ", gracePeriod=" + getGracePeriodMinutes() + "min" + ", sentOpeningSoonEmail=" + sentOpeningSoonEmail + ", sentOpenEmail=" + sentOpenEmail + ", sentClosingEmail=" + sentClosingEmail + ", sentClosedEmail=" + sentClosedEmail + ", sentPublishedEmail=" + sentPublishedEmail + ", isOpeningEmailEnabled=" + isOpeningEmailEnabled + ", isClosingEmailEnabled=" + isClosingEmailEnabled + ", isPublishedEmailEnabled=" + isPublishedEmailEnabled + "]";
threadMonitoringController.exitInternalAction("_rxHghLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679768007199022084614554;
}
finally {
threadMonitoringController.exitService("_rxGSYbngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxIuoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxIuobngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.feedbackSessionName).append(this.courseId).append(this.instructions).append(this.creatorEmail);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679771008988489017421726 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_rxIuobngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679771008988489017421726;
}
finally {
threadMonitoringController.exitService("_rxIuoLngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_rxKj0bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxLx8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679775009366194449782017 = false;
threadMonitoringController.exitInternalAction("_rxLx8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679775009366194449782017;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679775004611580027013691 = true;
threadMonitoringController.exitInternalAction("_rxLx8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679775004611580027013691;
}
else
if (this.getClass() == other.getClass())
{
FeedbackSessionAttributes otherFeedbackSession = (FeedbackSessionAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679775005552937271290992 = Objects.equals(this.feedbackSessionName, otherFeedbackSession.feedbackSessionName) && Objects.equals(this.courseId, otherFeedbackSession.courseId) && Objects.equals(this.instructions, otherFeedbackSession.instructions) && Objects.equals(this.creatorEmail, otherFeedbackSession.creatorEmail);
threadMonitoringController.exitInternalAction("_rxLx8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679775005552937271290992;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679775007758687926944915 = false;
threadMonitoringController.exitInternalAction("_rxLx8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679775007758687926944915;
}
}
finally {
threadMonitoringController.exitService("_rxKj0bngEeyIw-dB1KCaVA");
}
}

public  void setFeedbackSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_rxNAELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxNAEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackSessionName = feedbackSessionName;
threadMonitoringController.exitInternalAction("_rxNAEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxNAELngEeyIw-dB1KCaVA");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_rxOOMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxO1QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_rxO1QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxOOMLngEeyIw-dB1KCaVA");
}
}

public  String getCreatorEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxQDYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxQqcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679785009826033383885415 = creatorEmail;
threadMonitoringController.exitInternalAction("_rxQqcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679785009826033383885415;
}
finally {
threadMonitoringController.exitService("_rxQDYLngEeyIw-dB1KCaVA");
}
}

public  void setCreatorEmail(String creatorEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("creatorEmail", creatorEmail);
threadMonitoringController.enterService("_rxR4kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxSfoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.creatorEmail = creatorEmail;
threadMonitoringController.exitInternalAction("_rxSfoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxR4kLngEeyIw-dB1KCaVA");
}
}

public  String getInstructions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxTGsbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxTtwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136797930011714540247202987 = instructions;
threadMonitoringController.exitInternalAction("_rxTtwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136797930011714540247202987;
}
finally {
threadMonitoringController.exitService("_rxTGsbngEeyIw-dB1KCaVA");
}
}

public  void setInstructions(String instructions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructions", instructions);
threadMonitoringController.enterService("_rxUU0bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxU74LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.instructions = instructions;
threadMonitoringController.exitInternalAction("_rxU74LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxUU0bngEeyIw-dB1KCaVA");
}
}

public  Instant getCreatedTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxWKALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxWxELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136797990012872403603412386 = createdTime;
threadMonitoringController.exitInternalAction("_rxWxELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136797990012872403603412386;
}
finally {
threadMonitoringController.exitService("_rxWKALngEeyIw-dB1KCaVA");
}
}

public  void setCreatedTime(Instant createdTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdTime", createdTime);
threadMonitoringController.enterService("_rxXYILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxX_MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdTime = createdTime;
threadMonitoringController.exitInternalAction("_rxX_MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxXYILngEeyIw-dB1KCaVA");
}
}

public  Instant getDeletedTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxZNUbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxZ0YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798050024749315700527352 = deletedTime;
threadMonitoringController.exitInternalAction("_rxZ0YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798050024749315700527352;
}
finally {
threadMonitoringController.exitService("_rxZNUbngEeyIw-dB1KCaVA");
}
}

public  void setDeletedTime(Instant deletedTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("deletedTime", deletedTime);
threadMonitoringController.enterService("_rxbCgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxbpkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.deletedTime = deletedTime;
threadMonitoringController.exitInternalAction("_rxbpkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxbCgLngEeyIw-dB1KCaVA");
}
}

public  boolean isSessionDeleted() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxcQoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxc3sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367981200843197525817924 = this.deletedTime != null;
threadMonitoringController.exitInternalAction("_rxc3sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367981200843197525817924;
}
finally {
threadMonitoringController.exitService("_rxcQoLngEeyIw-dB1KCaVA");
}
}

public  Instant getStartTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxeF0bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxes4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367981500840885385228649 = startTime;
threadMonitoringController.exitInternalAction("_rxes4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367981500840885385228649;
}
finally {
threadMonitoringController.exitService("_rxeF0bngEeyIw-dB1KCaVA");
}
}

public  void setStartTime(Instant startTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("startTime", startTime);
threadMonitoringController.enterService("_rxf7ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxgiELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.startTime = startTime;
threadMonitoringController.exitInternalAction("_rxgiELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxf7ALngEeyIw-dB1KCaVA");
}
}

public  Instant getEndTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxhwMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxhwMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798210011625994431897202 = endTime;
threadMonitoringController.exitInternalAction("_rxhwMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798210011625994431897202;
}
finally {
threadMonitoringController.exitService("_rxhwMLngEeyIw-dB1KCaVA");
}
}

public  void setEndTime(Instant endTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("endTime", endTime);
threadMonitoringController.enterService("_rxi-ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxjlYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.endTime = endTime;
threadMonitoringController.exitInternalAction("_rxjlYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxi-ULngEeyIw-dB1KCaVA");
}
}

public  Instant getSessionVisibleFromTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxkzgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxlakLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367982800700935851320017 = sessionVisibleFromTime;
threadMonitoringController.exitInternalAction("_rxlakLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367982800700935851320017;
}
finally {
threadMonitoringController.exitService("_rxkzgLngEeyIw-dB1KCaVA");
}
}

public  void setSessionVisibleFromTime(Instant sessionVisibleFromTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sessionVisibleFromTime", sessionVisibleFromTime);
threadMonitoringController.enterService("_rxmBobngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxmosLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sessionVisibleFromTime = sessionVisibleFromTime;
threadMonitoringController.exitInternalAction("_rxmosLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxmBobngEeyIw-dB1KCaVA");
}
}

public  Instant getResultsVisibleFromTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxn20LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxn20bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679834006705218821333423 = resultsVisibleFromTime;
threadMonitoringController.exitInternalAction("_rxn20bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679834006705218821333423;
}
finally {
threadMonitoringController.exitService("_rxn20LngEeyIw-dB1KCaVA");
}
}

public  void setResultsVisibleFromTime(Instant resultsVisibleFromTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("resultsVisibleFromTime", resultsVisibleFromTime);
threadMonitoringController.enterService("_rxpE8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxpsALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.resultsVisibleFromTime = resultsVisibleFromTime;
threadMonitoringController.exitInternalAction("_rxpsALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxpE8LngEeyIw-dB1KCaVA");
}
}

public  String getTimeZone() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxqTEbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxq6ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679842006100163925349966 = timeZone;
threadMonitoringController.exitInternalAction("_rxq6ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679842006100163925349966;
}
finally {
threadMonitoringController.exitService("_rxqTEbngEeyIw-dB1KCaVA");
}
}

public  void setTimeZone(String timeZone) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("timeZone", timeZone);
threadMonitoringController.enterService("_rxsIQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxsvULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.timeZone = timeZone;
threadMonitoringController.exitInternalAction("_rxsvULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxsIQLngEeyIw-dB1KCaVA");
}
}

public  long getGracePeriodMinutes() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxtWYbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxukgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798490011541160654619254 = gracePeriod.toMinutes();
threadMonitoringController.exitInternalAction("_rxukgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798490011541160654619254;
}
finally {
threadMonitoringController.exitService("_rxtWYbngEeyIw-dB1KCaVA");
}
}

public  void setGracePeriodMinutes(long gracePeriodMinutes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("gracePeriodMinutes", gracePeriodMinutes);
threadMonitoringController.enterService("_rxvyoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxwZsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.gracePeriod = Duration.ofMinutes(gracePeriodMinutes);
threadMonitoringController.exitInternalAction("_rxwZsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxvyoLngEeyIw-dB1KCaVA");
}
}

public  boolean isSentOpeningSoonEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rxxAwbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxxn0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679858007851769397385273 = sentOpeningSoonEmail;
threadMonitoringController.exitInternalAction("_rxxn0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679858007851769397385273;
}
finally {
threadMonitoringController.exitService("_rxxAwbngEeyIw-dB1KCaVA");
}
}

public  void setSentOpeningSoonEmail(boolean sentOpeningSoonEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentOpeningSoonEmail", sentOpeningSoonEmail);
threadMonitoringController.enterService("_rxy18LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rxzdALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentOpeningSoonEmail = sentOpeningSoonEmail;
threadMonitoringController.exitInternalAction("_rxzdALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rxy18LngEeyIw-dB1KCaVA");
}
}

public  boolean isSentOpenEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rx0EELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rx0rILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679865008233376372003905 = sentOpenEmail;
threadMonitoringController.exitInternalAction("_rx0rILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679865008233376372003905;
}
finally {
threadMonitoringController.exitService("_rx0EELngEeyIw-dB1KCaVA");
}
}

public  void setSentOpenEmail(boolean sentOpenEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentOpenEmail", sentOpenEmail);
threadMonitoringController.enterService("_rx1SMbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rx15QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentOpenEmail = sentOpenEmail;
threadMonitoringController.exitInternalAction("_rx15QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rx1SMbngEeyIw-dB1KCaVA");
}
}

public  boolean isSentClosingEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rx3HYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rx3ucLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798720006064922839238818 = sentClosingEmail;
threadMonitoringController.exitInternalAction("_rx3ucLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798720006064922839238818;
}
finally {
threadMonitoringController.exitService("_rx3HYLngEeyIw-dB1KCaVA");
}
}

public  void setSentClosingEmail(boolean sentClosingEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentClosingEmail", sentClosingEmail);
threadMonitoringController.enterService("_rx48kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rx5joLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentClosingEmail = sentClosingEmail;
threadMonitoringController.exitInternalAction("_rx5joLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rx48kLngEeyIw-dB1KCaVA");
}
}

public  boolean isSentClosedEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rx6xwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rx7Y0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798790024588830274238616 = sentClosedEmail;
threadMonitoringController.exitInternalAction("_rx7Y0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136798790024588830274238616;
}
finally {
threadMonitoringController.exitService("_rx6xwLngEeyIw-dB1KCaVA");
}
}

public  void setSentClosedEmail(boolean sentClosedEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentClosedEmail", sentClosedEmail);
threadMonitoringController.enterService("_rx8m8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rx9OALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentClosedEmail = sentClosedEmail;
threadMonitoringController.exitInternalAction("_rx9OALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rx8m8LngEeyIw-dB1KCaVA");
}
}

public  boolean isSentPublishedEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rx91ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rx-cILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679884006124600999607027 = sentPublishedEmail;
threadMonitoringController.exitInternalAction("_rx-cILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679884006124600999607027;
}
finally {
threadMonitoringController.exitService("_rx91ELngEeyIw-dB1KCaVA");
}
}

public  void setSentPublishedEmail(boolean sentPublishedEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentPublishedEmail", sentPublishedEmail);
threadMonitoringController.enterService("_rx_DMbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rx_qQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentPublishedEmail = sentPublishedEmail;
threadMonitoringController.exitInternalAction("_rx_qQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rx_DMbngEeyIw-dB1KCaVA");
}
}

public  boolean isOpeningEmailEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ryA4YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryCGgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679892005449750577263358 = isOpeningEmailEnabled;
threadMonitoringController.exitInternalAction("_ryCGgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679892005449750577263358;
}
finally {
threadMonitoringController.exitService("_ryA4YLngEeyIw-dB1KCaVA");
}
}

public  void setOpeningEmailEnabled(boolean isOpeningEmailEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isOpeningEmailEnabled", isOpeningEmailEnabled);
threadMonitoringController.enterService("_ryCtkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryDUoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.isOpeningEmailEnabled = isOpeningEmailEnabled;
threadMonitoringController.exitInternalAction("_ryDUoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ryCtkLngEeyIw-dB1KCaVA");
}
}

public  boolean isClosingEmailEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ryEiwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryFJ0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679897003517180707297589 = isClosingEmailEnabled;
threadMonitoringController.exitInternalAction("_ryFJ0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679897003517180707297589;
}
finally {
threadMonitoringController.exitService("_ryEiwLngEeyIw-dB1KCaVA");
}
}

public  void setClosingEmailEnabled(boolean isClosingEmailEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isClosingEmailEnabled", isClosingEmailEnabled);
threadMonitoringController.enterService("_ryGX8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryGX8bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.isClosingEmailEnabled = isClosingEmailEnabled;
threadMonitoringController.exitInternalAction("_ryGX8bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ryGX8LngEeyIw-dB1KCaVA");
}
}

public  boolean isPublishedEmailEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ryHmELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryINILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679902003326838165057746 = isPublishedEmailEnabled;
threadMonitoringController.exitInternalAction("_ryINILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679902003326838165057746;
}
finally {
threadMonitoringController.exitService("_ryHmELngEeyIw-dB1KCaVA");
}
}

public  void setPublishedEmailEnabled(boolean isPublishedEmailEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isPublishedEmailEnabled", isPublishedEmailEnabled);
threadMonitoringController.enterService("_ryJbQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryKCULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.isPublishedEmailEnabled = isPublishedEmailEnabled;
threadMonitoringController.exitInternalAction("_ryKCULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ryJbQLngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_ryLQcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryL3gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.instructionsOption.ifPresent(s -> instructions = s);
updateOptions.startTimeOption.ifPresent(s -> startTime = s);
updateOptions.endTimeOption.ifPresent(s -> endTime = s);
updateOptions.sessionVisibleFromTimeOption.ifPresent(s -> sessionVisibleFromTime = s);
updateOptions.resultsVisibleFromTimeOption.ifPresent(s -> resultsVisibleFromTime = s);
updateOptions.timeZoneOption.ifPresent(s -> timeZone = s);
updateOptions.gracePeriodOption.ifPresent(s -> gracePeriod = s);
updateOptions.sentOpeningSoonEmailOption.ifPresent(s -> sentOpeningSoonEmail = s);
updateOptions.sentOpenEmailOption.ifPresent(s -> sentOpenEmail = s);
updateOptions.sentClosingEmailOption.ifPresent(s -> sentClosingEmail = s);
updateOptions.sentClosedEmailOption.ifPresent(s -> sentClosedEmail = s);
updateOptions.sentPublishedEmailOption.ifPresent(s -> sentPublishedEmail = s);
updateOptions.isClosingEmailEnabledOption.ifPresent(s -> isClosingEmailEnabled = s);
updateOptions.isPublishedEmailEnabledOption.ifPresent(s -> isPublishedEmailEnabled = s);
threadMonitoringController.exitInternalAction("_ryL3gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ryLQcLngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ryPh4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryQI8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679912008685738527469844 = new  UpdateOptions.Builder(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_ryQI8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679912008685738527469844;
}
finally {
threadMonitoringController.exitService("_ryPh4LngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_ryQwAbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ryRXELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367991500550388189523848 = new  UpdateOptions.Builder(updateOptions);
threadMonitoringController.exitInternalAction("_ryRXELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367991500550388189523848;
}
finally {
threadMonitoringController.exitService("_ryQwAbngEeyIw-dB1KCaVA");
}
}

public static class Builder extends BasicBuilder<FeedbackSessionAttributes, Builder> {
private final FeedbackSessionAttributes feedbackSessionAttributes;

private  Builder(String feedbackSessionName, String courseId){
super(new  UpdateOptions(feedbackSessionName, courseId));
thisBuilder = this;
feedbackSessionAttributes = new  FeedbackSessionAttributes(feedbackSessionName, courseId);
}
public  Builder withCreatorEmail(String creatorEmail) {
assert creatorEmail != null;
feedbackSessionAttributes.creatorEmail = creatorEmail;
return this;
}

@Override
public  FeedbackSessionAttributes build() {
feedbackSessionAttributes.update(updateOptions);
return feedbackSessionAttributes;
}

}
public static class UpdateOptions {
private String courseId;

private String feedbackSessionName;

private UpdateOption<String> instructionsOption = UpdateOption.empty();

private UpdateOption<Instant> startTimeOption = UpdateOption.empty();

private UpdateOption<Instant> endTimeOption = UpdateOption.empty();

private UpdateOption<Instant> sessionVisibleFromTimeOption = UpdateOption.empty();

private UpdateOption<Instant> resultsVisibleFromTimeOption = UpdateOption.empty();

private UpdateOption<String> timeZoneOption = UpdateOption.empty();

private UpdateOption<Duration> gracePeriodOption = UpdateOption.empty();

private UpdateOption<Boolean> sentOpeningSoonEmailOption = UpdateOption.empty();

private UpdateOption<Boolean> sentOpenEmailOption = UpdateOption.empty();

private UpdateOption<Boolean> sentClosingEmailOption = UpdateOption.empty();

private UpdateOption<Boolean> sentClosedEmailOption = UpdateOption.empty();

private UpdateOption<Boolean> sentPublishedEmailOption = UpdateOption.empty();

private UpdateOption<Boolean> isClosingEmailEnabledOption = UpdateOption.empty();

private UpdateOption<Boolean> isPublishedEmailEnabledOption = UpdateOption.empty();

private  UpdateOptions(String feedbackSessionName, String courseId){
assert feedbackSessionName != null;
assert courseId != null;
this.feedbackSessionName = feedbackSessionName;
this.courseId = courseId;
}
public  String getCourseId() {
return courseId;
}

public  String getFeedbackSessionName() {
return feedbackSessionName;
}

@Override
public  String toString() {
return "StudentAttributes.UpdateOptions [" + "feedbackSessionName = " + feedbackSessionName + ", courseId = " + courseId + ", instructions = " + instructionsOption + ", startTime = " + startTimeOption + ", endTime = " + endTimeOption + ", sessionVisibleFromTime = " + sessionVisibleFromTimeOption + ", resultsVisibleFromTime = " + resultsVisibleFromTimeOption + ", timeZone = " + timeZoneOption + ", gracePeriod = " + gracePeriodOption + ", sentOpeningSoonEmail = " + sentOpeningSoonEmailOption + ", sentOpenEmail = " + sentOpenEmailOption + ", sentClosingEmail = " + sentClosingEmailOption + ", sentClosedEmail = " + sentClosedEmailOption + ", sentPublishedEmail = " + sentPublishedEmailOption + ", isClosingEmailEnabled = " + isClosingEmailEnabledOption + ", isPublishedEmailEnabled = " + isPublishedEmailEnabledOption + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(UpdateOptions updateOptions){
super(updateOptions);
assert updateOptions != null;
thisBuilder = this;
}
private  Builder(String feedbackSessionName, String courseId){
super(new  UpdateOptions(feedbackSessionName, courseId));
thisBuilder = this;
}
public  Builder withSentOpeningSoonEmail(boolean sentOpeningSoonEmailOption) {
updateOptions.sentOpeningSoonEmailOption = UpdateOption.of(sentOpeningSoonEmailOption);
return this;
}

public  Builder withSentOpenEmail(boolean sentOpenEmail) {
updateOptions.sentOpenEmailOption = UpdateOption.of(sentOpenEmail);
return this;
}

public  Builder withSentClosingEmail(boolean sentClosingEmail) {
updateOptions.sentClosingEmailOption = UpdateOption.of(sentClosingEmail);
return this;
}

public  Builder withSentClosedEmail(boolean sentClosedEmail) {
updateOptions.sentClosedEmailOption = UpdateOption.of(sentClosedEmail);
return this;
}

public  Builder withSentPublishedEmail(boolean sentPublishedEmail) {
updateOptions.sentPublishedEmailOption = UpdateOption.of(sentPublishedEmail);
return this;
}

@Override
public  UpdateOptions build() {
return updateOptions;
}

}
}
private abstract static class BasicBuilder<T, B extends BasicBuilder<T, B>>  {
UpdateOptions updateOptions;

B thisBuilder;

 BasicBuilder(UpdateOptions updateOptions){
this.updateOptions = updateOptions;
}
public  B withInstructions(String instruction) {
assert instruction != null;
updateOptions.instructionsOption = UpdateOption.of(instruction);
return thisBuilder;
}

public  B withStartTime(Instant startTime) {
assert startTime != null;
updateOptions.startTimeOption = UpdateOption.of(startTime);
return thisBuilder;
}

public  B withEndTime(Instant endTime) {
assert endTime != null;
updateOptions.endTimeOption = UpdateOption.of(endTime);
return thisBuilder;
}

public  B withSessionVisibleFromTime(Instant sessionVisibleFromTime) {
assert sessionVisibleFromTime != null;
updateOptions.sessionVisibleFromTimeOption = UpdateOption.of(sessionVisibleFromTime);
return thisBuilder;
}

public  B withResultsVisibleFromTime(Instant resultsVisibleFromTime) {
assert resultsVisibleFromTime != null;
updateOptions.resultsVisibleFromTimeOption = UpdateOption.of(resultsVisibleFromTime);
return thisBuilder;
}

public  B withTimeZone(String timeZone) {
assert timeZone != null;
updateOptions.timeZoneOption = UpdateOption.of(timeZone);
return thisBuilder;
}

public  B withGracePeriod(Duration gracePeriod) {
assert gracePeriod != null;
updateOptions.gracePeriodOption = UpdateOption.of(gracePeriod);
return thisBuilder;
}

public  B withIsClosingEmailEnabled(boolean isClosingEmailEnabled) {
updateOptions.isClosingEmailEnabledOption = UpdateOption.of(isClosingEmailEnabled);
return thisBuilder;
}

public  B withIsPublishedEmailEnabled(boolean isPublishedEmailEnabled) {
updateOptions.isPublishedEmailEnabledOption = UpdateOption.of(isPublishedEmailEnabled);
return thisBuilder;
}

public abstract  T build() ;

}
}
