package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import teammates.common.datatransfer.questions.FeedbackQuestionType;
import teammates.common.datatransfer.questions.FeedbackResponseDetails;
import teammates.common.datatransfer.questions.FeedbackTextResponseDetails;
import teammates.common.util.Const;
import teammates.common.util.FieldValidator;
import teammates.common.util.JsonUtils;
import teammates.storage.entity.FeedbackResponse;
public class FeedbackResponseAttributes extends EntityAttributes<FeedbackResponse> {
private String feedbackQuestionId;

private String giver;

private String recipient;

private String feedbackSessionName;

private String courseId;

private FeedbackResponseDetails responseDetails;

private String giverSection;

private String recipientSection;

private transient Instant createdAt;

private transient Instant updatedAt;

private transient String feedbackResponseId;

private  FeedbackResponseAttributes(String feedbackQuestionId, String giver, String recipient){
this.feedbackQuestionId = feedbackQuestionId;
this.giver = giver;
this.recipient = recipient;
this.giverSection = Const.DEFAULT_SECTION;
this.recipientSection = Const.DEFAULT_SECTION;
this.feedbackResponseId = FeedbackResponse.generateId(feedbackQuestionId, giver, recipient);
}
public  FeedbackResponseAttributes(FeedbackResponseAttributes copy){
this.feedbackResponseId = copy.getId();
this.feedbackSessionName = copy.feedbackSessionName;
this.courseId = copy.courseId;
this.feedbackQuestionId = copy.feedbackQuestionId;
this.giver = copy.giver;
this.giverSection = copy.giverSection;
this.recipient = copy.recipient;
this.recipientSection = copy.recipientSection;
this.createdAt = copy.createdAt;
this.updatedAt = copy.updatedAt;
this.responseDetails = copy.getResponseDetailsCopy();
}
public static  FeedbackResponseAttributes valueOf(FeedbackResponse fr) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fr", fr);
threadMonitoringController.enterService("_aEq_QLvVEeyr6avTgCRLkQ", FeedbackResponseAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aErmULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes fra = new  FeedbackResponseAttributes(fr.getFeedbackQuestionId(), fr.getGiverEmail(), fr.getRecipientEmail());
fra.feedbackResponseId = fr.getId();
fra.feedbackSessionName = fr.getFeedbackSessionName();
fra.courseId = fr.getCourseId();
if (fr.getGiverSection() != null)
{
fra.giverSection = fr.getGiverSection();
}
if (fr.getRecipientSection() != null)
{
fra.recipientSection = fr.getRecipientSection();
}
threadMonitoringController.enterInternalAction("_aEuCkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
fra.responseDetails = deserializeResponseFromSerializedString(fr.getAnswer(), fr.getFeedbackQuestionType());
threadMonitoringController.exitInternalAction("_aEuCkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aErmULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aEuCkrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
fra.createdAt = fr.getCreatedAt();
fra.updatedAt = fr.getUpdatedAt();
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130159660017537789891262046 = fra;
threadMonitoringController.exitInternalAction("_aEuCkrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130159660017537789891262046;
}
finally {
threadMonitoringController.exitService("_aEq_QLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionType getFeedbackQuestionType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aEvQsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aEv3xLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015975005270421523654334 = responseDetails.getQuestionType();
threadMonitoringController.exitInternalAction("_aEv3xLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015975005270421523654334;
}
finally {
threadMonitoringController.exitService("_aEvQsLvVEeyr6avTgCRLkQ");
}
}

public  String getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aEwe0bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aExF4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015982009067749268239738 = feedbackResponseId;
threadMonitoringController.exitInternalAction("_aExF4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015982009067749268239738;
}
finally {
threadMonitoringController.exitService("_aEwe0bvVEeyr6avTgCRLkQ");
}
}

public  void setId(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_aExs8bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aEyUALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackResponseId = feedbackResponseId;
threadMonitoringController.exitInternalAction("_aEyUALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aExs8bvVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aEziILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE0JMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015996009342591592116053 = createdAt;
threadMonitoringController.exitInternalAction("_aE0JMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015996009342591592116053;
}
finally {
threadMonitoringController.exitService("_aEziILvVEeyr6avTgCRLkQ");
}
}

public  Instant getUpdatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aE1XULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE1-YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016004006501280937340201 = updatedAt;
threadMonitoringController.exitInternalAction("_aE1-YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016004006501280937340201;
}
finally {
threadMonitoringController.exitService("_aE1XULvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aE2lcbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE3MgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016013002936893664387258 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_aE3MgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016013002936893664387258;
}
finally {
threadMonitoringController.exitService("_aE2lcbvVEeyr6avTgCRLkQ");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aE3zkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE4aoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016021006085184471781168 = courseId;
threadMonitoringController.exitInternalAction("_aE4aoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016021006085184471781168;
}
finally {
threadMonitoringController.exitService("_aE3zkLvVEeyr6avTgCRLkQ");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_aE5BsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE5owLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_aE5owLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aE5BsLvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackQuestionId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aE6P0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE6P0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130160350033214510435597144 = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_aE6P0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130160350033214510435597144;
}
finally {
threadMonitoringController.exitService("_aE6P0LvVEeyr6avTgCRLkQ");
}
}

public  void setFeedbackQuestionId(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_aE7d8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE8FALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackQuestionId = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_aE8FALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aE7d8LvVEeyr6avTgCRLkQ");
}
}

public  String getGiver() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aE8sELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE8sEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130160490026369717417818184 = giver;
threadMonitoringController.exitInternalAction("_aE8sEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130160490026369717417818184;
}
finally {
threadMonitoringController.exitService("_aE8sELvVEeyr6avTgCRLkQ");
}
}

public  void setGiver(String giver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("giver", giver);
threadMonitoringController.enterService("_aE96MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE96MbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.giver = giver;
threadMonitoringController.exitInternalAction("_aE96MbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aE96MLvVEeyr6avTgCRLkQ");
}
}

public  String getRecipient() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aE-hQbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aE_IULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130160620021004107536959515 = recipient;
threadMonitoringController.exitInternalAction("_aE_IULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130160620021004107536959515;
}
finally {
threadMonitoringController.exitService("_aE-hQbvVEeyr6avTgCRLkQ");
}
}

public  void setRecipient(String recipient) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("recipient", recipient);
threadMonitoringController.enterService("_aFAWcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFA9gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.recipient = recipient;
threadMonitoringController.exitInternalAction("_aFA9gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aFAWcLvVEeyr6avTgCRLkQ");
}
}

public  String getGiverSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFBkkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFCLoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130160760024484421496550623 = giverSection;
threadMonitoringController.exitInternalAction("_aFCLoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130160760024484421496550623;
}
finally {
threadMonitoringController.exitService("_aFBkkLvVEeyr6avTgCRLkQ");
}
}

public  String getRecipientSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFEA0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFFO8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016082001126856984388871 = recipientSection;
threadMonitoringController.exitInternalAction("_aFFO8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016082001126856984388871;
}
finally {
threadMonitoringController.exitService("_aFEA0LvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFGdELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFHrMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_aFHrMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aFSDRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForFeedbackSessionName(feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_aFSDRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aFTRY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_aFTRY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aFTRZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016101008289515532246257 = errors;
threadMonitoringController.exitInternalAction("_aFTRZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016101008289515532246257;
}
finally {
threadMonitoringController.exitService("_aFGdELvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isValid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFUfgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFbNMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130161080021518407580554155 = getInvalidityInfo().isEmpty();
threadMonitoringController.exitInternalAction("_aFbNMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130161080021518407580554155;
}
finally {
threadMonitoringController.exitService("_aFUfgLvVEeyr6avTgCRLkQ");
}
}

@Override
public  FeedbackResponse toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFcbULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFe3lrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponse longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016115009598287154158839 = new  FeedbackResponse(feedbackSessionName, courseId, feedbackQuestionId, getFeedbackQuestionType(), giver, giverSection, recipient, recipientSection, getSerializedFeedbackResponseDetail());
threadMonitoringController.exitInternalAction("_aFe3lrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016115009598287154158839;
}
finally {
threadMonitoringController.exitService("_aFcbULvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFgFsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFh66LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016122003691868061282775 = "FeedbackResponseAttributes [feedbackSessionName=" + feedbackSessionName + ", courseId=" + courseId + ", feedbackQuestionId=" + feedbackQuestionId + ", feedbackQuestionType=" + getFeedbackQuestionType() + ", giver=" + giver + ", recipient=" + recipient + ", answer=" + getSerializedFeedbackResponseDetail() + "]";
threadMonitoringController.exitInternalAction("_aFh66LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016122003691868061282775;
}
finally {
threadMonitoringController.exitService("_aFgFsLvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFjJALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFjJAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.feedbackSessionName).append(this.courseId).append(this.feedbackQuestionId).append(this.giver).append(this.recipient);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016129003304465534450428 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_aFjJAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016129003304465534450428;
}
finally {
threadMonitoringController.exitService("_aFjJALvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_aFk-MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFmMULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016138006799442148164145 = false;
threadMonitoringController.exitInternalAction("_aFmMULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016138006799442148164145;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016138009723260988775023 = true;
threadMonitoringController.exitInternalAction("_aFmMULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016138009723260988775023;
}
else
if (this.getClass() == other.getClass())
{
FeedbackResponseAttributes otherFeedbackResponse = (FeedbackResponseAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016138009521565538254222 = Objects.equals(this.feedbackSessionName, otherFeedbackResponse.feedbackSessionName) && Objects.equals(this.courseId, otherFeedbackResponse.courseId) && Objects.equals(this.feedbackQuestionId, otherFeedbackResponse.feedbackQuestionId) && Objects.equals(this.giver, otherFeedbackResponse.giver) && Objects.equals(this.recipient, otherFeedbackResponse.recipient);
threadMonitoringController.exitInternalAction("_aFmMULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016138009521565538254222;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016138005306683131556608 = false;
threadMonitoringController.exitInternalAction("_aFmMULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016138005306683131556608;
}
}
finally {
threadMonitoringController.exitService("_aFk-MLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFmzYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
}
finally {
threadMonitoringController.exitService("_aFmzYLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseDetails getResponseDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFoBgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFookLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301614800729239794136626 = responseDetails;
threadMonitoringController.exitInternalAction("_aFookLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301614800729239794136626;
}
finally {
threadMonitoringController.exitService("_aFoBgLvVEeyr6avTgCRLkQ");
}
}

public  void setResponseDetails(FeedbackResponseDetails newFeedbackResponseDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newFeedbackResponseDetails", newFeedbackResponseDetails);
threadMonitoringController.enterService("_aFqdwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFuIJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
responseDetails = newFeedbackResponseDetails.getDeepCopy();
threadMonitoringController.exitInternalAction("_aFuIJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aFqdwLvVEeyr6avTgCRLkQ");
}
}

public  String getSerializedFeedbackResponseDetail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFvWQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aFxyhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016162008352601093667497 = responseDetails.getJsonString();
threadMonitoringController.exitInternalAction("_aFxyhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016162008352601093667497;
}
finally {
threadMonitoringController.exitService("_aFvWQLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseDetails getResponseDetailsCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aFznsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aF3SFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016169001697642915965698 = responseDetails.getDeepCopy();
threadMonitoringController.exitInternalAction("_aF3SFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016169001697642915965698;
}
finally {
threadMonitoringController.exitService("_aFznsLvVEeyr6avTgCRLkQ");
}
}

private static  FeedbackResponseDetails deserializeResponseFromSerializedString(String serializedResponseDetails, FeedbackQuestionType questionType) {
if (questionType == FeedbackQuestionType.TEXT)
{
return new  FeedbackTextResponseDetails(serializedResponseDetails);
}
return JsonUtils.fromJson(serializedResponseDetails, questionType.getResponseDetailsClass());
}

public static  Builder builder(String feedbackQuestionId, String giver, String recipient) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("giver", giver);
monitoringServiceParameters.addValue("recipient", recipient);
threadMonitoringController.enterService("_aF5uULvVEeyr6avTgCRLkQ", FeedbackResponseAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aF5uUbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016176008808574795074532 = new  Builder(feedbackQuestionId, giver, recipient);
threadMonitoringController.exitInternalAction("_aF5uUbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016176008808574795074532;
}
finally {
threadMonitoringController.exitService("_aF5uULvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aF68cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aF7jgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.giverOption.ifPresent(s -> giver = s);
updateOptions.giverSectionOption.ifPresent(s -> giverSection = s);
updateOptions.recipientOption.ifPresent(s -> recipient = s);
updateOptions.recipientSectionOption.ifPresent(s -> recipientSection = s);
updateOptions.responseDetailsUpdateOption.ifPresent(this::setResponseDetails);
threadMonitoringController.exitInternalAction("_aF7jgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aF68cLvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_aF9_wLvVEeyr6avTgCRLkQ", FeedbackResponseAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aF-m0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016188002745112683937114 = new  UpdateOptions.Builder(feedbackResponseId);
threadMonitoringController.exitInternalAction("_aF-m0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016188002745112683937114;
}
finally {
threadMonitoringController.exitService("_aF9_wLvVEeyr6avTgCRLkQ");
}
}

public static class Builder extends BasicBuilder<FeedbackResponseAttributes, Builder> {
private FeedbackResponseAttributes fra;

private  Builder(String feedbackQuestionId, String giver, String recipient){
super(new  UpdateOptions(""));
thisBuilder = this;
assert feedbackQuestionId != null;
assert giver != null;
assert recipient != null;
fra = new  FeedbackResponseAttributes(feedbackQuestionId, giver, recipient);
}
public  Builder withCourseId(String courseId) {
assert courseId != null;
fra.courseId = courseId;
return this;
}

public  Builder withFeedbackSessionName(String feedbackSessionName) {
assert feedbackSessionName != null;
fra.feedbackSessionName = feedbackSessionName;
return this;
}

@Override
public  FeedbackResponseAttributes build() {
fra.update(updateOptions);
return fra;
}

}
public static class UpdateOptions {
private String feedbackResponseId;

private UpdateOption<String> giverOption = UpdateOption.empty();

private UpdateOption<String> giverSectionOption = UpdateOption.empty();

private UpdateOption<String> recipientOption = UpdateOption.empty();

private UpdateOption<String> recipientSectionOption = UpdateOption.empty();

private UpdateOption<FeedbackResponseDetails> responseDetailsUpdateOption = UpdateOption.empty();

private  UpdateOptions(String feedbackResponseId){
assert feedbackResponseId != null;
this.feedbackResponseId = feedbackResponseId;
}
public  String getFeedbackResponseId() {
return feedbackResponseId;
}

@Override
public  String toString() {
return "FeedbackResponseAttributes.UpdateOptions [" + "feedbackResponseId = " + feedbackResponseId + ", giver = " + giverOption + ", giverSection = " + giverSectionOption + ", recipient = " + recipientOption + ", recipientSection = " + recipientSectionOption + ", responseDetails = " + JsonUtils.toJson(responseDetailsUpdateOption) + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(String feedbackResponseId){
super(new  UpdateOptions(feedbackResponseId));
thisBuilder = this;
}
public  Builder withGiver(String giver) {
assert giver != null;
updateOptions.giverOption = UpdateOption.of(giver);
return thisBuilder;
}

public  Builder withRecipient(String recipient) {
assert recipient != null;
updateOptions.recipientOption = UpdateOption.of(recipient);
return thisBuilder;
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
public  B withGiverSection(String giverSection) {
assert giverSection != null;
updateOptions.giverSectionOption = UpdateOption.of(giverSection);
return thisBuilder;
}

public  B withRecipientSection(String recipientSection) {
assert recipientSection != null;
updateOptions.recipientSectionOption = UpdateOption.of(recipientSection);
return thisBuilder;
}

public  B withResponseDetails(FeedbackResponseDetails responseDetails) {
assert responseDetails != null;
updateOptions.responseDetailsUpdateOption = UpdateOption.of(responseDetails.getDeepCopy());
return thisBuilder;
}

public abstract  T build() ;

}
}
