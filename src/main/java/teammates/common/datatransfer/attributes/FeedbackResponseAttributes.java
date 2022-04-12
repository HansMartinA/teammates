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
threadMonitoringController.enterService("_rqAL4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqAy8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.enterInternalAction("_rqCBFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
fra.responseDetails = deserializeResponseFromSerializedString(fr.getAnswer(), fr.getFeedbackQuestionType());
threadMonitoringController.exitInternalAction("_rqCBFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rqAy8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rqCBFbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
fra.createdAt = fr.getCreatedAt();
fra.updatedAt = fr.getUpdatedAt();
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679420003575877301667937 = fra;
threadMonitoringController.exitInternalAction("_rqCBFbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679420003575877301667937;
}
finally {
threadMonitoringController.exitService("_rqAL4LngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionType getFeedbackQuestionType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqDPMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqEdUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679426008087046513274209 = responseDetails.getQuestionType();
threadMonitoringController.exitInternalAction("_rqEdUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679426008087046513274209;
}
finally {
threadMonitoringController.exitService("_rqDPMLngEeyIw-dB1KCaVA");
}
}

public  String getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqFEYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqFrcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679430007154728679462687 = feedbackResponseId;
threadMonitoringController.exitInternalAction("_rqFrcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679430007154728679462687;
}
finally {
threadMonitoringController.exitService("_rqFEYLngEeyIw-dB1KCaVA");
}
}

public  void setId(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_rqGSgbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqG5kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackResponseId = feedbackResponseId;
threadMonitoringController.exitInternalAction("_rqG5kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rqGSgbngEeyIw-dB1KCaVA");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqHgobngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqIHsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794360006061275293935908 = createdAt;
threadMonitoringController.exitInternalAction("_rqIHsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794360006061275293935908;
}
finally {
threadMonitoringController.exitService("_rqHgobngEeyIw-dB1KCaVA");
}
}

public  Instant getUpdatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqIuwbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqJV0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794390013054102303923631 = updatedAt;
threadMonitoringController.exitInternalAction("_rqJV0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794390013054102303923631;
}
finally {
threadMonitoringController.exitService("_rqIuwbngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqJ84bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqKj8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679443004079562158120178 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_rqKj8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679443004079562158120178;
}
finally {
threadMonitoringController.exitService("_rqJ84bngEeyIw-dB1KCaVA");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqLLALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqLyELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679447006758291728073401 = courseId;
threadMonitoringController.exitInternalAction("_rqLyELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679447006758291728073401;
}
finally {
threadMonitoringController.exitService("_rqLLALngEeyIw-dB1KCaVA");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_rqMZILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqNAMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_rqNAMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rqMZILngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackQuestionId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqNnQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqO1YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794560043508242829726884 = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_rqO1YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794560043508242829726884;
}
finally {
threadMonitoringController.exitService("_rqNnQLngEeyIw-dB1KCaVA");
}
}

public  void setFeedbackQuestionId(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_rqQDgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqQqkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackQuestionId = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_rqQqkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rqQDgLngEeyIw-dB1KCaVA");
}
}

public  String getGiver() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqR4sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqR4sbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679462005938956188034002 = giver;
threadMonitoringController.exitInternalAction("_rqR4sbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679462005938956188034002;
}
finally {
threadMonitoringController.exitService("_rqR4sLngEeyIw-dB1KCaVA");
}
}

public  void setGiver(String giver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("giver", giver);
threadMonitoringController.enterService("_rqSfwbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqTG0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.giver = giver;
threadMonitoringController.exitInternalAction("_rqTG0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rqSfwbngEeyIw-dB1KCaVA");
}
}

public  String getRecipient() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqTt4bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqUU8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679470002957354944094327 = recipient;
threadMonitoringController.exitInternalAction("_rqUU8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679470002957354944094327;
}
finally {
threadMonitoringController.exitService("_rqTt4bngEeyIw-dB1KCaVA");
}
}

public  void setRecipient(String recipient) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("recipient", recipient);
threadMonitoringController.enterService("_rqU8AbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqVjELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.recipient = recipient;
threadMonitoringController.exitInternalAction("_rqVjELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rqU8AbngEeyIw-dB1KCaVA");
}
}

public  String getGiverSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqWKIbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqWxMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794770001225890023557541 = giverSection;
threadMonitoringController.exitInternalAction("_rqWxMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794770001225890023557541;
}
finally {
threadMonitoringController.exitService("_rqWKIbngEeyIw-dB1KCaVA");
}
}

public  String getRecipientSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqX_ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqYmYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794800048899003527976004 = recipientSection;
threadMonitoringController.exitInternalAction("_rqYmYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794800048899003527976004;
}
finally {
threadMonitoringController.exitService("_rqX_ULngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqZ0gbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqZ0grngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_rqZ0grngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rqeF9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForFeedbackSessionName(feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_rqeF9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rqfUE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_rqfUE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rqfUFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367948500547237210159484 = errors;
threadMonitoringController.exitInternalAction("_rqfUFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367948500547237210159484;
}
finally {
threadMonitoringController.exitService("_rqZ0gbngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isValid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqf7IbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqmo0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679488008158174546992768 = getInvalidityInfo().isEmpty();
threadMonitoringController.exitInternalAction("_rqmo0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679488008158174546992768;
}
finally {
threadMonitoringController.exitService("_rqf7IbngEeyIw-dB1KCaVA");
}
}

@Override
public  FeedbackResponse toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqnP4bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqpsIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponse longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679491006371155896935908 = new  FeedbackResponse(feedbackSessionName, courseId, feedbackQuestionId, getFeedbackQuestionType(), giver, giverSection, recipient, recipientSection, getSerializedFeedbackResponseDetail());
threadMonitoringController.exitInternalAction("_rqpsIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679491006371155896935908;
}
finally {
threadMonitoringController.exitService("_rqnP4bngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqqTMbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqsveLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794930008770566218895826 = "FeedbackResponseAttributes [feedbackSessionName=" + feedbackSessionName + ", courseId=" + courseId + ", feedbackQuestionId=" + feedbackQuestionId + ", feedbackQuestionType=" + getFeedbackQuestionType() + ", giver=" + giver + ", recipient=" + recipient + ", answer=" + getSerializedFeedbackResponseDetail() + "]";
threadMonitoringController.exitInternalAction("_rqsveLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794930008770566218895826;
}
finally {
threadMonitoringController.exitService("_rqqTMbngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqt9kbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqt9krngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.feedbackSessionName).append(this.courseId).append(this.feedbackQuestionId).append(this.giver).append(this.recipient);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367949600941360270875021 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_rqt9krngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367949600941360270875021;
}
finally {
threadMonitoringController.exitService("_rqt9kbngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_rqvywLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rqxn8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679498004454695758557209 = false;
threadMonitoringController.exitInternalAction("_rqxn8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679498004454695758557209;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794980024196955166479284 = true;
threadMonitoringController.exitInternalAction("_rqxn8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794980024196955166479284;
}
else
if (this.getClass() == other.getClass())
{
FeedbackResponseAttributes otherFeedbackResponse = (FeedbackResponseAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367949800964905392037162 = Objects.equals(this.feedbackSessionName, otherFeedbackResponse.feedbackSessionName) && Objects.equals(this.courseId, otherFeedbackResponse.courseId) && Objects.equals(this.feedbackQuestionId, otherFeedbackResponse.feedbackQuestionId) && Objects.equals(this.giver, otherFeedbackResponse.giver) && Objects.equals(this.recipient, otherFeedbackResponse.recipient);
threadMonitoringController.exitInternalAction("_rqxn8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367949800964905392037162;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679498006275968822991896 = false;
threadMonitoringController.exitInternalAction("_rqxn8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679498006275968822991896;
}
}
finally {
threadMonitoringController.exitService("_rqvywLngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqy2ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
}
finally {
threadMonitoringController.exitService("_rqy2ELngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseDetails getResponseDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rqzdIbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rq0EMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679502004444212102845361 = responseDetails;
threadMonitoringController.exitInternalAction("_rq0EMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679502004444212102845361;
}
finally {
threadMonitoringController.exitService("_rqzdIbngEeyIw-dB1KCaVA");
}
}

public  void setResponseDetails(FeedbackResponseDetails newFeedbackResponseDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newFeedbackResponseDetails", newFeedbackResponseDetails);
threadMonitoringController.enterService("_rq0rQbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rq3HhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
responseDetails = newFeedbackResponseDetails.getDeepCopy();
threadMonitoringController.exitInternalAction("_rq3HhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rq0rQbngEeyIw-dB1KCaVA");
}
}

public  String getSerializedFeedbackResponseDetail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rq4VoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rq5jxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367950700988034323079572 = responseDetails.getJsonString();
threadMonitoringController.exitInternalAction("_rq5jxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367950700988034323079572;
}
finally {
threadMonitoringController.exitService("_rq4VoLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseDetails getResponseDetailsCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rq6x4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rq8nFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795100039700775704377533 = responseDetails.getDeepCopy();
threadMonitoringController.exitInternalAction("_rq8nFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795100039700775704377533;
}
finally {
threadMonitoringController.exitService("_rq6x4LngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_rq91MLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rq-cQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679513009188531841265736 = new  Builder(feedbackQuestionId, giver, recipient);
threadMonitoringController.exitInternalAction("_rq-cQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679513009188531841265736;
}
finally {
threadMonitoringController.exitService("_rq91MLngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_rq_DULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rq_qYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.giverOption.ifPresent(s -> giver = s);
updateOptions.giverSectionOption.ifPresent(s -> giverSection = s);
updateOptions.recipientOption.ifPresent(s -> recipient = s);
updateOptions.recipientSectionOption.ifPresent(s -> recipientSection = s);
updateOptions.responseDetailsUpdateOption.ifPresent(this::setResponseDetails);
threadMonitoringController.exitInternalAction("_rq_qYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rq_DULngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_rrA4gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rrBfkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679519007043111828206542 = new  UpdateOptions.Builder(feedbackResponseId);
threadMonitoringController.exitInternalAction("_rrBfkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679519007043111828206542;
}
finally {
threadMonitoringController.exitService("_rrA4gLngEeyIw-dB1KCaVA");
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
