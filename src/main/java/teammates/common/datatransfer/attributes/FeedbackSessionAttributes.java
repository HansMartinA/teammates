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
threadMonitoringController.enterService("_aLc8sbvVEeyr6avTgCRLkQ", FeedbackSessionAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aLeK0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016592005599657851954712 = feedbackSessionAttributes;
threadMonitoringController.exitInternalAction("_aLeK0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016592005599657851954712;
}
finally {
threadMonitoringController.exitService("_aLc8sbvVEeyr6avTgCRLkQ");
}
}

public static  Builder builder(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_aLjDULvVEeyr6avTgCRLkQ", FeedbackSessionAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aLjqYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016602001214043148500713 = new  Builder(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_aLjqYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016602001214043148500713;
}
finally {
threadMonitoringController.exitService("_aLjDULvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aLkRcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aLoi6LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016610007491151754808302 = valueOf(toEntity());
threadMonitoringController.exitInternalAction("_aLoi6LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016610007491151754808302;
}
finally {
threadMonitoringController.exitService("_aLkRcLvVEeyr6avTgCRLkQ");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aLqYELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aLq_ILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016618005987827132314367 = courseId;
threadMonitoringController.exitInternalAction("_aLq_ILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016618005987827132314367;
}
finally {
threadMonitoringController.exitService("_aLqYELvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aLsNQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aLs0ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016627007146599353549444 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_aLs0ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016627007146599353549444;
}
finally {
threadMonitoringController.exitService("_aLsNQLvVEeyr6avTgCRLkQ");
}
}

public  String getInstructionsString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aLuCcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aLupgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instructions == null)
{
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016635007051211925756027 = null;
threadMonitoringController.exitInternalAction("_aLupgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016635007051211925756027;
}
return SanitizationHelper.sanitizeForRichText(instructions);
}
finally {
threadMonitoringController.exitService("_aLuCcLvVEeyr6avTgCRLkQ");
}
}

@Override
public  FeedbackSession toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aLv3obvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aLxFxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSession longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130166430040984746247648296 = new  FeedbackSession(feedbackSessionName, courseId, creatorEmail, instructions, createdTime, deletedTime, startTime, endTime, sessionVisibleFromTime, resultsVisibleFromTime, timeZone, getGracePeriodMinutes(), sentOpeningSoonEmail, sentOpenEmail, sentClosingEmail, sentClosedEmail, sentPublishedEmail, isOpeningEmailEnabled, isClosingEmailEnabled, isPublishedEmailEnabled);
threadMonitoringController.exitInternalAction("_aLxFxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130166430040984746247648296;
}
finally {
threadMonitoringController.exitService("_aLv3obvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aLyT4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aLy68LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_aLy68LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aLziBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL0JFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField(FieldValidator.FEEDBACK_SESSION_NAME_FIELD_NAME, feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_aL0JFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aLziBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL0wI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL0wJ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField(FieldValidator.COURSE_ID_FIELD_NAME, courseId), errors);
threadMonitoringController.exitInternalAction("_aL0wJ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aL0wI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL1-Q7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL1-R7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("instructions to students", instructions), errors);
threadMonitoringController.exitInternalAction("_aL1-R7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aL1-Q7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL2lU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL2lV7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("time for the session to become visible", sessionVisibleFromTime), errors);
threadMonitoringController.exitInternalAction("_aL2lV7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aL2lU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL3MY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL3zc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("session time zone", timeZone), errors);
threadMonitoringController.exitInternalAction("_aL3zc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aL3MY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL3zd7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL4ag7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("creator's email", creatorEmail), errors);
threadMonitoringController.exitInternalAction("_aL4ag7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aL3zd7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL5Bk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL5Bl7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("session creation time", createdTime), errors);
threadMonitoringController.exitInternalAction("_aL5Bl7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aL5Bk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aL5BmLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!errors.isEmpty())
{
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016773008162195164977671 = errors;
threadMonitoringController.exitInternalAction("_aL5BmLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016773008162195164977671;
}
threadMonitoringController.enterInternalAction("_aL-hI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForFeedbackSessionName(feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_aL-hI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMAWU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_aMAWU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMBkc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(creatorEmail), errors);
threadMonitoringController.exitInternalAction("_aMBkc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMCLhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMCLiLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForGracePeriod(gracePeriod), errors);
threadMonitoringController.exitInternalAction("_aMCLiLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aMCLhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMCyk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMCyl7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("submission opening time", startTime), errors);
threadMonitoringController.exitInternalAction("_aMCyl7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aMCyk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMDZo7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMDZp7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("submission closing time", endTime), errors);
threadMonitoringController.exitInternalAction("_aMDZp7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aMDZo7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMEAs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMEAt7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getValidityInfoForNonNullField("time for the responses to become visible", resultsVisibleFromTime), errors);
threadMonitoringController.exitInternalAction("_aMEAt7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aMEAs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMEAuLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!errors.isEmpty())
{
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016773004404312022478598 = errors;
threadMonitoringController.exitInternalAction("_aMEAuLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016773004404312022478598;
}
threadMonitoringController.enterInternalAction("_aMFO1rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMF14LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForTimeForSessionStartAndEnd(startTime, endTime), errors);
threadMonitoringController.exitInternalAction("_aMF14LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aMFO1rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMGc97vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMGc-7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForTimeForVisibilityStartAndSessionStart(sessionVisibleFromTime, startTime), errors);
threadMonitoringController.exitInternalAction("_aMGc-7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aMGc97vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMGc_LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant actualSessionVisibleFromTime = sessionVisibleFromTime;
if (actualSessionVisibleFromTime.equals(Const.TIME_REPRESENTS_FOLLOW_OPENING))
{
actualSessionVisibleFromTime = startTime;
}
threadMonitoringController.exitInternalAction("_aMGc_LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMHrFbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMHrGbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForTimeForVisibilityStartAndResultsPublish(actualSessionVisibleFromTime, resultsVisibleFromTime), errors);
threadMonitoringController.exitInternalAction("_aMHrGbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aMHrFbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aMHrGrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016773001344178412065038 = errors;
threadMonitoringController.exitInternalAction("_aMHrGrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016773001344178412065038;
}
finally {
threadMonitoringController.exitService("_aLyT4LvVEeyr6avTgCRLkQ");
}
}

public  boolean isOpeningInHours(long hours) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hours", hours);
threadMonitoringController.enterService("_aMJgQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMLVcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016780008516969997644737 = startTime.isAfter(Instant.now()) && Instant.now().plus(Duration.ofHours(hours)).isAfter(startTime);
threadMonitoringController.exitInternalAction("_aMLVcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016780008516969997644737;
}
finally {
threadMonitoringController.exitService("_aMJgQLvVEeyr6avTgCRLkQ");
}
}

public  boolean isClosedAfter(long hours) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hours", hours);
threadMonitoringController.enterService("_aML8gbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMNKoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301678800635116271446323 = Instant.now().plus(Duration.ofHours(hours)).isAfter(endTime);
threadMonitoringController.exitInternalAction("_aMNKoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301678800635116271446323;
}
finally {
threadMonitoringController.exitService("_aML8gbvVEeyr6avTgCRLkQ");
}
}

public  boolean isClosingWithinTimeLimit(long hours) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hours", hours);
threadMonitoringController.enterService("_aMOYwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMPm4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
Duration difference = Duration.between(now, endTime);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016795003588559935552642 = now.isAfter(startTime) && difference.compareTo(Duration.ofHours(hours - 1)) >= 0 && difference.compareTo(Duration.ofHours(hours)) < 0;
threadMonitoringController.exitInternalAction("_aMPm4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016795003588559935552642;
}
finally {
threadMonitoringController.exitService("_aMOYwLvVEeyr6avTgCRLkQ");
}
}

public  boolean isOpeningWithinTimeLimit(long hours) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hours", hours);
threadMonitoringController.enterService("_aMSqMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMTRQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
Duration difference = Duration.between(now, startTime);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130168030042919771112828065 = now.isBefore(startTime) && difference.compareTo(Duration.ofHours(hours - 1)) >= 0 && difference.compareTo(Duration.ofHours(hours)) < 0;
threadMonitoringController.exitInternalAction("_aMTRQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130168030042919771112828065;
}
finally {
threadMonitoringController.exitService("_aMSqMLvVEeyr6avTgCRLkQ");
}
}

public  boolean isClosedWithinPastHour() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMVtgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMWUkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
Instant given = endTime.plus(gracePeriod);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301681000553601348287183 = given.isBefore(now) && Duration.between(given, now).compareTo(Duration.ofHours(1)) < 0;
threadMonitoringController.exitInternalAction("_aMWUkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301681000553601348287183;
}
finally {
threadMonitoringController.exitService("_aMVtgLvVEeyr6avTgCRLkQ");
}
}

public  boolean isClosed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMYJwbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMZX4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016818009456206636425593 = Instant.now().isAfter(endTime.plus(gracePeriod));
threadMonitoringController.exitInternalAction("_aMZX4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016818009456206636425593;
}
finally {
threadMonitoringController.exitService("_aMYJwbvVEeyr6avTgCRLkQ");
}
}

public  boolean isOpened() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMamALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMbNELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016828009573065446857715 = !now.isBefore(startTime) && now.isBefore(endTime);
threadMonitoringController.exitInternalAction("_aMbNELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016828009573065446857715;
}
finally {
threadMonitoringController.exitService("_aMamALvVEeyr6avTgCRLkQ");
}
}

public  boolean isInGracePeriod() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMcbMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMdCQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant now = Instant.now();
Instant gracedEnd = endTime.plus(gracePeriod);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016837002578249668185547 = (now.isAfter(endTime) || now.equals(endTime)) && (now.isBefore(gracedEnd) || now.equals(gracedEnd));
threadMonitoringController.exitInternalAction("_aMdCQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016837002578249668185547;
}
finally {
threadMonitoringController.exitService("_aMcbMLvVEeyr6avTgCRLkQ");
}
}

public  boolean isWaitingToOpen() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMgFkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMgsoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016844009293782801076277 = Instant.now().isBefore(startTime);
threadMonitoringController.exitInternalAction("_aMgsoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016844009293782801076277;
}
finally {
threadMonitoringController.exitService("_aMgFkLvVEeyr6avTgCRLkQ");
}
}

public  boolean isVisible() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMh6wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMih0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant visibleTime = this.sessionVisibleFromTime;
if (visibleTime.equals(Const.TIME_REPRESENTS_FOLLOW_OPENING))
{
visibleTime = this.startTime;
}
Instant now = Instant.now();
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016853007403901790811634 = now.isAfter(visibleTime) || now.equals(visibleTime);
threadMonitoringController.exitInternalAction("_aMih0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016853007403901790811634;
}
finally {
threadMonitoringController.exitService("_aMh6wLvVEeyr6avTgCRLkQ");
}
}

public  boolean isPublished() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMkXALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMk-ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016860007927042549401916 = now.isAfter(publishTime) || now.equals(publishTime);
threadMonitoringController.exitInternalAction("_aMk-ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016860007927042549401916;
}
finally {
threadMonitoringController.exitService("_aMkXALvVEeyr6avTgCRLkQ");
}
}

public  boolean isCreator(String instructorEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorEmail", instructorEmail);
threadMonitoringController.enterService("_aMmzQbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMoBYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130168680012770510537146518 = creatorEmail.equals(instructorEmail);
threadMonitoringController.exitInternalAction("_aMoBYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130168680012770510537146518;
}
finally {
threadMonitoringController.exitService("_aMmzQbvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMpPgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
this.instructions = SanitizationHelper.sanitizeForRichText(instructions);
}
finally {
threadMonitoringController.exitService("_aMpPgLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMsS0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMuIBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016880009126216052093534 = "FeedbackSessionAttributes [feedbackSessionName=" + feedbackSessionName + ", courseId=" + courseId + ", creatorEmail=" + creatorEmail + ", instructions=" + instructions + ", createdTime=" + createdTime + ", deletedTime=" + deletedTime + ", startTime=" + startTime + ", endTime=" + endTime + ", sessionVisibleFromTime=" + sessionVisibleFromTime + ", resultsVisibleFromTime=" + resultsVisibleFromTime + ", timeZone=" + timeZone + ", gracePeriod=" + getGracePeriodMinutes() + "min" + ", sentOpeningSoonEmail=" + sentOpeningSoonEmail + ", sentOpenEmail=" + sentOpenEmail + ", sentClosingEmail=" + sentClosingEmail + ", sentClosedEmail=" + sentClosedEmail + ", sentPublishedEmail=" + sentPublishedEmail + ", isOpeningEmailEnabled=" + isOpeningEmailEnabled + ", isClosingEmailEnabled=" + isClosingEmailEnabled + ", isPublishedEmailEnabled=" + isPublishedEmailEnabled + "]";
threadMonitoringController.exitInternalAction("_aMuIBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016880009126216052093534;
}
finally {
threadMonitoringController.exitService("_aMsS0LvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aMvWILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMv9MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.feedbackSessionName).append(this.courseId).append(this.instructions).append(this.creatorEmail);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130168870004897436845453651 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_aMv9MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130168870004897436845453651;
}
finally {
threadMonitoringController.exitService("_aMvWILvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_aMxyYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aMznkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016895003076629755910246 = false;
threadMonitoringController.exitInternalAction("_aMznkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016895003076629755910246;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016895005940550309827661 = true;
threadMonitoringController.exitInternalAction("_aMznkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016895005940550309827661;
}
else
if (this.getClass() == other.getClass())
{
FeedbackSessionAttributes otherFeedbackSession = (FeedbackSessionAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301689500016428290182573968 = Objects.equals(this.feedbackSessionName, otherFeedbackSession.feedbackSessionName) && Objects.equals(this.courseId, otherFeedbackSession.courseId) && Objects.equals(this.instructions, otherFeedbackSession.instructions) && Objects.equals(this.creatorEmail, otherFeedbackSession.creatorEmail);
threadMonitoringController.exitInternalAction("_aMznkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301689500016428290182573968;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130168950029836075083156466 = false;
threadMonitoringController.exitInternalAction("_aMznkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130168950029836075083156466;
}
}
finally {
threadMonitoringController.exitService("_aMxyYLvVEeyr6avTgCRLkQ");
}
}

public  void setFeedbackSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_aM0OoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aM1cwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackSessionName = feedbackSessionName;
threadMonitoringController.exitInternalAction("_aM1cwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aM0OoLvVEeyr6avTgCRLkQ");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_aM2q4bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aM3R8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_aM3R8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aM2q4bvVEeyr6avTgCRLkQ");
}
}

public  String getCreatorEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aM5HILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aM5uMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130169190037282150821443905 = creatorEmail;
threadMonitoringController.exitInternalAction("_aM5uMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130169190037282150821443905;
}
finally {
threadMonitoringController.exitService("_aM5HILvVEeyr6avTgCRLkQ");
}
}

public  void setCreatorEmail(String creatorEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("creatorEmail", creatorEmail);
threadMonitoringController.enterService("_aM6VQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aM68ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.creatorEmail = creatorEmail;
threadMonitoringController.exitInternalAction("_aM68ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aM6VQLvVEeyr6avTgCRLkQ");
}
}

public  String getInstructions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aM8KcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aM9YkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301693300763992706821289 = instructions;
threadMonitoringController.exitInternalAction("_aM9YkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301693300763992706821289;
}
finally {
threadMonitoringController.exitService("_aM8KcLvVEeyr6avTgCRLkQ");
}
}

public  void setInstructions(String instructions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructions", instructions);
threadMonitoringController.enterService("_aM9_oLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aM-msLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.instructions = instructions;
threadMonitoringController.exitInternalAction("_aM-msLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aM9_oLvVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aM_00LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNAb4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130169470041974553328360575 = createdTime;
threadMonitoringController.exitInternalAction("_aNAb4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130169470041974553328360575;
}
finally {
threadMonitoringController.exitService("_aM_00LvVEeyr6avTgCRLkQ");
}
}

public  void setCreatedTime(Instant createdTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdTime", createdTime);
threadMonitoringController.enterService("_aNBqALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNBqAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdTime = createdTime;
threadMonitoringController.exitInternalAction("_aNBqAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNBqALvVEeyr6avTgCRLkQ");
}
}

public  Instant getDeletedTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNC4ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNDfMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016964006155840507861712 = deletedTime;
threadMonitoringController.exitInternalAction("_aNDfMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016964006155840507861712;
}
finally {
threadMonitoringController.exitService("_aNC4ILvVEeyr6avTgCRLkQ");
}
}

public  void setDeletedTime(Instant deletedTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("deletedTime", deletedTime);
threadMonitoringController.enterService("_aNEGQbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNEtULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.deletedTime = deletedTime;
threadMonitoringController.exitInternalAction("_aNEtULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNEGQbvVEeyr6avTgCRLkQ");
}
}

public  boolean isSessionDeleted() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNF7cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNGigLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130169800042795506772339087 = this.deletedTime != null;
threadMonitoringController.exitInternalAction("_aNGigLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130169800042795506772339087;
}
finally {
threadMonitoringController.exitService("_aNF7cLvVEeyr6avTgCRLkQ");
}
}

public  Instant getStartTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNHwoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNI-wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016989005459279242794481 = startTime;
threadMonitoringController.exitInternalAction("_aNI-wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016989005459279242794481;
}
finally {
threadMonitoringController.exitService("_aNHwoLvVEeyr6avTgCRLkQ");
}
}

public  void setStartTime(Instant startTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("startTime", startTime);
threadMonitoringController.enterService("_aNJl0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNKM4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.startTime = startTime;
threadMonitoringController.exitInternalAction("_aNKM4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNJl0LvVEeyr6avTgCRLkQ");
}
}

public  Instant getEndTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNLbALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNMCELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017003002815403781067455 = endTime;
threadMonitoringController.exitInternalAction("_aNMCELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017003002815403781067455;
}
finally {
threadMonitoringController.exitService("_aNLbALvVEeyr6avTgCRLkQ");
}
}

public  void setEndTime(Instant endTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("endTime", endTime);
threadMonitoringController.enterService("_aNNQMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNN3QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.endTime = endTime;
threadMonitoringController.exitInternalAction("_aNN3QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNNQMLvVEeyr6avTgCRLkQ");
}
}

public  Instant getSessionVisibleFromTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNOeULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNPFYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017020002767749293124282 = sessionVisibleFromTime;
threadMonitoringController.exitInternalAction("_aNPFYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017020002767749293124282;
}
finally {
threadMonitoringController.exitService("_aNOeULvVEeyr6avTgCRLkQ");
}
}

public  void setSessionVisibleFromTime(Instant sessionVisibleFromTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sessionVisibleFromTime", sessionVisibleFromTime);
threadMonitoringController.enterService("_aNQTgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNQ6kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sessionVisibleFromTime = sessionVisibleFromTime;
threadMonitoringController.exitInternalAction("_aNQ6kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNQTgLvVEeyr6avTgCRLkQ");
}
}

public  Instant getResultsVisibleFromTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNSIsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNSvwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017040008844936272328571 = resultsVisibleFromTime;
threadMonitoringController.exitInternalAction("_aNSvwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017040008844936272328571;
}
finally {
threadMonitoringController.exitService("_aNSIsLvVEeyr6avTgCRLkQ");
}
}

public  void setResultsVisibleFromTime(Instant resultsVisibleFromTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("resultsVisibleFromTime", resultsVisibleFromTime);
threadMonitoringController.enterService("_aNT94LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNUk8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.resultsVisibleFromTime = resultsVisibleFromTime;
threadMonitoringController.exitInternalAction("_aNUk8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNT94LvVEeyr6avTgCRLkQ");
}
}

public  String getTimeZone() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNVMAbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNVzELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017058005483377837901308 = timeZone;
threadMonitoringController.exitInternalAction("_aNVzELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017058005483377837901308;
}
finally {
threadMonitoringController.exitService("_aNVMAbvVEeyr6avTgCRLkQ");
}
}

public  void setTimeZone(String timeZone) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("timeZone", timeZone);
threadMonitoringController.enterService("_aNXBMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNXoQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.timeZone = timeZone;
threadMonitoringController.exitInternalAction("_aNXoQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNXBMLvVEeyr6avTgCRLkQ");
}
}

public  long getGracePeriodMinutes() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNY2YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNZdcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017073006646577237129239 = gracePeriod.toMinutes();
threadMonitoringController.exitInternalAction("_aNZdcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017073006646577237129239;
}
finally {
threadMonitoringController.exitService("_aNY2YLvVEeyr6avTgCRLkQ");
}
}

public  void setGracePeriodMinutes(long gracePeriodMinutes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("gracePeriodMinutes", gracePeriodMinutes);
threadMonitoringController.enterService("_aNarkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNb5sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.gracePeriod = Duration.ofMinutes(gracePeriodMinutes);
threadMonitoringController.exitInternalAction("_aNb5sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNarkLvVEeyr6avTgCRLkQ");
}
}

public  boolean isSentOpeningSoonEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNcgwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNdH0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017089009767512249187912 = sentOpeningSoonEmail;
threadMonitoringController.exitInternalAction("_aNdH0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017089009767512249187912;
}
finally {
threadMonitoringController.exitService("_aNcgwLvVEeyr6avTgCRLkQ");
}
}

public  void setSentOpeningSoonEmail(boolean sentOpeningSoonEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentOpeningSoonEmail", sentOpeningSoonEmail);
threadMonitoringController.enterService("_aNeV8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNe9ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentOpeningSoonEmail = sentOpeningSoonEmail;
threadMonitoringController.exitInternalAction("_aNe9ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNeV8LvVEeyr6avTgCRLkQ");
}
}

public  boolean isSentOpenEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNgLILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNgyMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130171040027336430350768737 = sentOpenEmail;
threadMonitoringController.exitInternalAction("_aNgyMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130171040027336430350768737;
}
finally {
threadMonitoringController.exitService("_aNgLILvVEeyr6avTgCRLkQ");
}
}

public  void setSentOpenEmail(boolean sentOpenEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentOpenEmail", sentOpenEmail);
threadMonitoringController.enterService("_aNhZQbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNiAULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentOpenEmail = sentOpenEmail;
threadMonitoringController.exitInternalAction("_aNiAULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNhZQbvVEeyr6avTgCRLkQ");
}
}

public  boolean isSentClosingEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNjOcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNj1gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130171190026736136817912715 = sentClosingEmail;
threadMonitoringController.exitInternalAction("_aNj1gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130171190026736136817912715;
}
finally {
threadMonitoringController.exitService("_aNjOcLvVEeyr6avTgCRLkQ");
}
}

public  void setSentClosingEmail(boolean sentClosingEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentClosingEmail", sentClosingEmail);
threadMonitoringController.enterService("_aNlDoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNlqsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentClosingEmail = sentClosingEmail;
threadMonitoringController.exitInternalAction("_aNlqsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNlDoLvVEeyr6avTgCRLkQ");
}
}

public  boolean isSentClosedEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNm40LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNnf4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017133001631479196279101 = sentClosedEmail;
threadMonitoringController.exitInternalAction("_aNnf4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017133001631479196279101;
}
finally {
threadMonitoringController.exitService("_aNm40LvVEeyr6avTgCRLkQ");
}
}

public  void setSentClosedEmail(boolean sentClosedEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentClosedEmail", sentClosedEmail);
threadMonitoringController.enterService("_aNouALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNpVELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentClosedEmail = sentClosedEmail;
threadMonitoringController.exitInternalAction("_aNpVELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNouALvVEeyr6avTgCRLkQ");
}
}

public  boolean isSentPublishedEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNp8ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNqjMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017148008442306260037983 = sentPublishedEmail;
threadMonitoringController.exitInternalAction("_aNqjMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017148008442306260037983;
}
finally {
threadMonitoringController.exitService("_aNp8ILvVEeyr6avTgCRLkQ");
}
}

public  void setSentPublishedEmail(boolean sentPublishedEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sentPublishedEmail", sentPublishedEmail);
threadMonitoringController.enterService("_aNrxULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNsYYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.sentPublishedEmail = sentPublishedEmail;
threadMonitoringController.exitInternalAction("_aNsYYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNrxULvVEeyr6avTgCRLkQ");
}
}

public  boolean isOpeningEmailEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNtmgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNuNkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130171620047461421921901514 = isOpeningEmailEnabled;
threadMonitoringController.exitInternalAction("_aNuNkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130171620047461421921901514;
}
finally {
threadMonitoringController.exitService("_aNtmgLvVEeyr6avTgCRLkQ");
}
}

public  void setOpeningEmailEnabled(boolean isOpeningEmailEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isOpeningEmailEnabled", isOpeningEmailEnabled);
threadMonitoringController.enterService("_aNwCwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNwp0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.isOpeningEmailEnabled = isOpeningEmailEnabled;
threadMonitoringController.exitInternalAction("_aNwp0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNwCwLvVEeyr6avTgCRLkQ");
}
}

public  boolean isClosingEmailEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aNx38LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aNyfALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301717600219250014263087 = isClosingEmailEnabled;
threadMonitoringController.exitInternalAction("_aNyfALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301717600219250014263087;
}
finally {
threadMonitoringController.exitService("_aNx38LvVEeyr6avTgCRLkQ");
}
}

public  void setClosingEmailEnabled(boolean isClosingEmailEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isClosingEmailEnabled", isClosingEmailEnabled);
threadMonitoringController.enterService("_aNztILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aN0UMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.isClosingEmailEnabled = isClosingEmailEnabled;
threadMonitoringController.exitInternalAction("_aN0UMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aNztILvVEeyr6avTgCRLkQ");
}
}

public  boolean isPublishedEmailEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aN1iULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aN2JYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017191005700080642073552 = isPublishedEmailEnabled;
threadMonitoringController.exitInternalAction("_aN2JYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017191005700080642073552;
}
finally {
threadMonitoringController.exitService("_aN1iULvVEeyr6avTgCRLkQ");
}
}

public  void setPublishedEmailEnabled(boolean isPublishedEmailEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isPublishedEmailEnabled", isPublishedEmailEnabled);
threadMonitoringController.enterService("_aN3XgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aN3-kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.isPublishedEmailEnabled = isPublishedEmailEnabled;
threadMonitoringController.exitInternalAction("_aN3-kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aN3XgLvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aN5MsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aN6a0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.exitInternalAction("_aN6a0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aN5MsLvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_aN-FMLvVEeyr6avTgCRLkQ", FeedbackSessionAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aN-sQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130172120015997113747325764 = new  UpdateOptions.Builder(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_aN-sQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130172120015997113747325764;
}
finally {
threadMonitoringController.exitService("_aN-FMLvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aN_6YLvVEeyr6avTgCRLkQ", FeedbackSessionAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aOAhcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130172200024905924883982955 = new  UpdateOptions.Builder(updateOptions);
threadMonitoringController.exitInternalAction("_aOAhcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130172200024905924883982955;
}
finally {
threadMonitoringController.exitService("_aN_6YLvVEeyr6avTgCRLkQ");
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
