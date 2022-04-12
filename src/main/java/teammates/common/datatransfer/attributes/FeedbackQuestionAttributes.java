package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.questions.FeedbackQuestionDetails;
import teammates.common.datatransfer.questions.FeedbackQuestionType;
import teammates.common.util.FieldValidator;
import teammates.common.util.JsonUtils;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.FeedbackQuestion;
public class FeedbackQuestionAttributes extends EntityAttributes<FeedbackQuestion> implements Comparable<FeedbackQuestionAttributes> {
private String feedbackSessionName;

private String courseId;

private FeedbackQuestionDetails questionDetails;

private String questionDescription;

private int questionNumber;

private FeedbackParticipantType giverType;

private FeedbackParticipantType recipientType;

private int numberOfEntitiesToGiveFeedbackTo;

private List<FeedbackParticipantType> showResponsesTo;

private List<FeedbackParticipantType> showGiverNameTo;

private List<FeedbackParticipantType> showRecipientNameTo;

private transient Instant createdAt;

private transient Instant updatedAt;

private transient String feedbackQuestionId;

private  FeedbackQuestionAttributes(){
this.showResponsesTo = new  ArrayList<>();
this.showGiverNameTo = new  ArrayList<>();
this.showRecipientNameTo = new  ArrayList<>();
}
public static  Builder builder() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rlv-AbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rlv-ArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679181008808705559589761 = new  Builder();
threadMonitoringController.exitInternalAction("_rlv-ArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679181008808705559589761;
}
finally {
threadMonitoringController.exitService("_rlv-AbngEeyIw-dB1KCaVA");
}
}

public static  FeedbackQuestionAttributes valueOf(FeedbackQuestion fq) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fq", fq);
threadMonitoringController.enterService("_rlwlE7ngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rlxMILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes faq = new  FeedbackQuestionAttributes();
faq.feedbackSessionName = fq.getFeedbackSessionName();
faq.courseId = fq.getCourseId();
threadMonitoringController.enterInternalAction("_rlxzObngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
faq.questionDetails = deserializeFeedbackQuestionDetails(fq.getQuestionText(), fq.getQuestionType());
threadMonitoringController.exitInternalAction("_rlxzObngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rlxMILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rlxzOrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
faq.questionDescription = fq.getQuestionDescription();
faq.questionNumber = fq.getQuestionNumber();
faq.giverType = fq.getGiverType();
faq.recipientType = fq.getRecipientType();
faq.numberOfEntitiesToGiveFeedbackTo = fq.getNumberOfEntitiesToGiveFeedbackTo();
if (fq.getShowResponsesTo() != null)
{
faq.showResponsesTo = new  ArrayList<>(fq.getShowResponsesTo());
}
if (fq.getShowGiverNameTo() != null)
{
faq.showGiverNameTo = new  ArrayList<>(fq.getShowGiverNameTo());
}
if (fq.getShowRecipientNameTo() != null)
{
faq.showRecipientNameTo = new  ArrayList<>(fq.getShowRecipientNameTo());
}
faq.createdAt = fq.getCreatedAt();
faq.updatedAt = fq.getUpdatedAt();
faq.feedbackQuestionId = fq.getId();
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679186004331012088493008 = faq;
threadMonitoringController.exitInternalAction("_rlxzOrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679186004331012088493008;
}
finally {
threadMonitoringController.exitService("_rlwlE7ngEeyIw-dB1KCaVA");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rlzoYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rlzoYbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791900019197675566556027 = createdAt;
threadMonitoringController.exitInternalAction("_rlzoYbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791900019197675566556027;
}
finally {
threadMonitoringController.exitService("_rlzoYLngEeyIw-dB1KCaVA");
}
}

public  Instant getUpdatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rl0PcbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rl0PcrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367919200190816167172984 = updatedAt;
threadMonitoringController.exitInternalAction("_rl0PcrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367919200190816167172984;
}
finally {
threadMonitoringController.exitService("_rl0PcbngEeyIw-dB1KCaVA");
}
}

public  String getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rl02gbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rl02grngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791950018059173195053735 = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_rl02grngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791950018059173195053735;
}
finally {
threadMonitoringController.exitService("_rl02gbngEeyIw-dB1KCaVA");
}
}

@Deprecated
public  void setId(String id) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("id", id);
threadMonitoringController.enterService("_rl1dk7ngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rl2EoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackQuestionId = id;
threadMonitoringController.exitInternalAction("_rl2EoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rl1dk7ngEeyIw-dB1KCaVA");
}
}

@Override
public  FeedbackQuestion toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rl2rsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rl3SyLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestion longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367920300490861562278331 = new  FeedbackQuestion(feedbackSessionName, courseId, getSerializedQuestionDetails(), questionDescription, questionNumber, getQuestionType(), giverType, recipientType, numberOfEntitiesToGiveFeedbackTo, showResponsesTo, showGiverNameTo, showRecipientNameTo);
threadMonitoringController.exitInternalAction("_rl3SyLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rl3S0bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestion longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679204009540507096083911 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367920300490861562278331;
threadMonitoringController.exitInternalAction("_rl3S0bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679204009540507096083911;
}
finally {
threadMonitoringController.exitService("_rl2rsLngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rl4g4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rl4g4bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes faq = new  FeedbackQuestionAttributes();
faq.feedbackSessionName = this.feedbackSessionName;
faq.courseId = this.courseId;
threadMonitoringController.exitInternalAction("_rl4g4bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rl5vCLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
faq.questionDetails = this.getQuestionDetailsCopy();
threadMonitoringController.exitInternalAction("_rl5vCLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rl5vCbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
faq.questionDescription = this.questionDescription;
faq.questionNumber = this.questionNumber;
faq.giverType = this.giverType;
faq.recipientType = this.recipientType;
faq.numberOfEntitiesToGiveFeedbackTo = this.numberOfEntitiesToGiveFeedbackTo;
faq.showResponsesTo = new  ArrayList<>(this.showResponsesTo);
faq.showGiverNameTo = new  ArrayList<>(this.showGiverNameTo);
faq.showRecipientNameTo = new  ArrayList<>(this.showRecipientNameTo);
faq.createdAt = this.createdAt;
faq.updatedAt = this.updatedAt;
faq.feedbackQuestionId = this.feedbackQuestionId;
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679210002518519197868476 = faq;
threadMonitoringController.exitInternalAction("_rl5vCbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679210002518519197868476;
}
finally {
threadMonitoringController.exitService("_rl4g4LngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rl6WE7ngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rl7kOLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679218008687379952692049 = "FeedbackQuestionAttributes [feedbackSessionName=" + feedbackSessionName + ", courseId=" + courseId + ", questionText=" + getSerializedQuestionDetails() + ", questionDescription=" + questionDescription + ", questionNumber=" + questionNumber + ", questionType=" + getQuestionType() + ", giverType=" + giverType + ", recipientType=" + recipientType + ", numberOfEntitiesToGiveFeedbackTo=" + numberOfEntitiesToGiveFeedbackTo + ", showResponsesTo=" + showResponsesTo + ", showGiverNameTo=" + showGiverNameTo + ", showRecipientNameTo=" + showRecipientNameTo + "]";
threadMonitoringController.exitInternalAction("_rl7kOLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rl8LSLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679218008077617416192564 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679218008687379952692049;
threadMonitoringController.exitInternalAction("_rl8LSLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679218008077617416192564;
}
finally {
threadMonitoringController.exitService("_rl6WE7ngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rl8yULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rl8yUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_rl8yUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rl_1p7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rl_1rLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForFeedbackSessionName(feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_rl_1rLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rl_1p7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmAcs7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_rmAcs7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmBDxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmBDxbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
errors.addAll(FieldValidator.getValidityInfoForFeedbackParticipantType(giverType, recipientType));
threadMonitoringController.exitInternalAction("_rmBDxbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rmBDxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmC49LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmC49bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
errors.addAll(FieldValidator.getValidityInfoForFeedbackResponseVisibility(showResponsesTo, showGiverNameTo, showRecipientNameTo));
threadMonitoringController.exitInternalAction("_rmC49LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679232006091565737747372 = errors;
threadMonitoringController.exitInternalAction("_rmC49bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679232006091565737747372;
}
finally {
threadMonitoringController.exitService("_rl8yULngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isValid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmEHELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmJmoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679235007281787963269069 = getInvalidityInfo().isEmpty();
threadMonitoringController.exitInternalAction("_rmJmoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679235007281787963269069;
}
finally {
threadMonitoringController.exitService("_rmEHELngEeyIw-dB1KCaVA");
}
}

public  boolean isResponseVisibleTo(FeedbackParticipantType userType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("userType", userType);
threadMonitoringController.enterService("_rmKNsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmKNsbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679239006222115225664185 = showResponsesTo.contains(userType);
threadMonitoringController.exitInternalAction("_rmKNsbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679239006222115225664185;
}
finally {
threadMonitoringController.exitService("_rmKNsLngEeyIw-dB1KCaVA");
}
}

public  boolean areResponseDeletionsRequiredForChanges(FeedbackQuestionAttributes newAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newAttributes", newAttributes);
threadMonitoringController.enterService("_rmK0wbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmLb0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!newAttributes.giverType.equals(this.giverType) || !newAttributes.recipientType.equals(this.recipientType))
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679246003767035590345428 = true;
threadMonitoringController.exitInternalAction("_rmLb0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679246003767035590345428;
}
threadMonitoringController.enterInternalAction("_rmMp-LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679246005542329807783292 = this.getQuestionDetailsCopy().shouldChangesRequireResponseDeletion(newAttributes.getQuestionDetailsCopy());
threadMonitoringController.exitInternalAction("_rmMp-LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmMp_LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136792460036435315765398746 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679246005542329807783292;
threadMonitoringController.exitInternalAction("_rmMp_LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmMqALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136792460021912799041253384 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136792460036435315765398746;
threadMonitoringController.exitInternalAction("_rmMqALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136792460021912799041253384;
}
finally {
threadMonitoringController.exitService("_rmK0wbngEeyIw-dB1KCaVA");
}
}

@Override
public  int compareTo(FeedbackQuestionAttributes o) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("o", o);
threadMonitoringController.enterService("_rmNRAbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmN4ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (o == null)
{
return 1;
}
if (this.questionNumber != o.questionNumber)
{
return Integer.compare(this.questionNumber, o.questionNumber);
}
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679251005552293231896774 = this.feedbackQuestionId.compareTo(o.feedbackQuestionId);
threadMonitoringController.exitInternalAction("_rmN4ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679251005552293231896774;
}
finally {
threadMonitoringController.exitService("_rmNRAbngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmOfILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmOfIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int prime = 31;
int result = 1;
result = prime * result + (courseId == null ? 0 : courseId.hashCode());
result = prime * result + (feedbackSessionName == null ? 0 : feedbackSessionName.hashCode());
result = prime * result + (giverType == null ? 0 : giverType.hashCode());
result = prime * result + numberOfEntitiesToGiveFeedbackTo;
result = prime * result + questionNumber;
threadMonitoringController.exitInternalAction("_rmOfIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmPtSbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
result = prime * result + (questionDetails == null ? 0 : questionDetails.hashCode());
threadMonitoringController.exitInternalAction("_rmPtSbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rmPtSrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
result = prime * result + (questionDescription == null ? 0 : questionDescription.hashCode());
result = prime * result + (recipientType == null ? 0 : recipientType.hashCode());
result = prime * result + (showGiverNameTo == null ? 0 : showGiverNameTo.hashCode());
result = prime * result + (showRecipientNameTo == null ? 0 : showRecipientNameTo.hashCode());
result = prime * result + (showResponsesTo == null ? 0 : showResponsesTo.hashCode());
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367926100193498236566655 = result;
threadMonitoringController.exitInternalAction("_rmPtSrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367926100193498236566655;
}
finally {
threadMonitoringController.exitService("_rmOfILngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object obj) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("obj", obj);
threadMonitoringController.enterService("_rmRicLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmRicbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (this == obj)
{
return true;
}
if (obj == null)
{
return false;
}
if (getClass() != obj.getClass())
{
return false;
}
FeedbackQuestionAttributes other = (FeedbackQuestionAttributes) obj;
if (courseId == null)
{
if (other.courseId != null)
{
return false;
}
}
else
if (!courseId.equals(other.courseId))
{
return false;
}
if (feedbackSessionName == null)
{
if (other.feedbackSessionName != null)
{
return false;
}
}
else
if (!feedbackSessionName.equals(other.feedbackSessionName))
{
return false;
}
if (giverType != other.giverType)
{
return false;
}
if (numberOfEntitiesToGiveFeedbackTo != other.numberOfEntitiesToGiveFeedbackTo)
{
return false;
}
if (questionNumber != other.questionNumber)
{
return false;
}
if (questionDetails == null)
{
if (other.questionDetails != null)
{
return false;
}
}
else
if (!questionDetails.equals(other.questionDetails))
{
return false;
}
if (questionDescription == null)
{
if (other.questionDescription != null)
{
return false;
}
}
else
if (!questionDescription.equals(other.questionDescription))
{
return false;
}
if (recipientType != other.recipientType)
{
return false;
}
if (showGiverNameTo == null)
{
if (other.showGiverNameTo != null)
{
return false;
}
}
else
if (!showGiverNameTo.equals(other.showGiverNameTo))
{
return false;
}
if (showRecipientNameTo == null)
{
if (other.showRecipientNameTo != null)
{
return false;
}
}
else
if (!showRecipientNameTo.equals(other.showRecipientNameTo))
{
return false;
}
if (showResponsesTo == null)
{
if (other.showResponsesTo != null)
{
return false;
}
}
else
if (!showResponsesTo.equals(other.showResponsesTo))
{
return false;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679265005297294547153388 = true;
threadMonitoringController.exitInternalAction("_rmRicbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679265005297294547153388;
}
finally {
threadMonitoringController.exitService("_rmRicLngEeyIw-dB1KCaVA");
}
}

public  void removeIrrelevantVisibilityOptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmSwkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmSwkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> optionsToRemove = new  ArrayList<>();
if (recipientType != null)
{
switch (recipientType) {
case NONE: optionsToRemove.add(FeedbackParticipantType.RECEIVER);
optionsToRemove.add(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS);
break;
case TEAMS: case INSTRUCTORS: case OWN_TEAM: case OWN_TEAM_MEMBERS: optionsToRemove.add(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS);
break;
default: break;

}
}
if (giverType != null)
{
switch (giverType) {
case TEAMS: case INSTRUCTORS: optionsToRemove.add(FeedbackParticipantType.OWN_TEAM_MEMBERS);
break;
default: break;

}
}
if (showRecipientNameTo != null)
{
showResponsesTo.removeAll(optionsToRemove);
}
if (showGiverNameTo != null)
{
showGiverNameTo.removeAll(optionsToRemove);
}
if (showRecipientNameTo != null)
{
showRecipientNameTo.removeAll(optionsToRemove);
}
threadMonitoringController.exitInternalAction("_rmSwkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmSwkLngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmUlwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmVM1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionDescription = SanitizationHelper.sanitizeForRichText(this.questionDescription);
threadMonitoringController.exitInternalAction("_rmVM1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmUlwLngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionDetails getQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmVz4bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmWa8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136792770010831905433744649 = questionDetails;
threadMonitoringController.exitInternalAction("_rmWa8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136792770010831905433744649;
}
finally {
threadMonitoringController.exitService("_rmVz4bngEeyIw-dB1KCaVA");
}
}

public  void setQuestionDetails(FeedbackQuestionDetails newQuestionDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newQuestionDetails", newQuestionDetails);
threadMonitoringController.enterService("_rmWa9LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmXpFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionDetails = newQuestionDetails.getDeepCopy();
threadMonitoringController.exitInternalAction("_rmXpFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmWa9LngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionDetails getQuestionDetailsCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmYQIbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmaFUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136792830047750928076032595 = questionDetails.getDeepCopy();
threadMonitoringController.exitInternalAction("_rmaFUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136792830047750928076032595;
}
finally {
threadMonitoringController.exitService("_rmYQIbngEeyIw-dB1KCaVA");
}
}

public  String getSerializedQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmbTcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmchlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367928700072196660781217 = questionDetails.getJsonString();
threadMonitoringController.exitInternalAction("_rmchlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367928700072196660781217;
}
finally {
threadMonitoringController.exitService("_rmbTcLngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackQuestionId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmdvsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmeWwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679290003401570526634323 = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_rmeWwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679290003401570526634323;
}
finally {
threadMonitoringController.exitService("_rmdvsLngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmfk4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmgL8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679293009192809619794168 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_rmgL8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679293009192809619794168;
}
finally {
threadMonitoringController.exitService("_rmfk4LngEeyIw-dB1KCaVA");
}
}

public  void setFeedbackSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_rmhaELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmiBILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackSessionName = feedbackSessionName;
threadMonitoringController.exitInternalAction("_rmiBILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmhaELngEeyIw-dB1KCaVA");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmjPQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmj2ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679299007546522615506309 = courseId;
threadMonitoringController.exitInternalAction("_rmj2ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679299007546522615506309;
}
finally {
threadMonitoringController.exitService("_rmjPQLngEeyIw-dB1KCaVA");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_rmlEcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmlrgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_rmlrgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmlEcLngEeyIw-dB1KCaVA");
}
}

public  String getQuestionDescription() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmmSkbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmm5oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679307003922124212028444 = questionDescription;
threadMonitoringController.exitInternalAction("_rmm5oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679307003922124212028444;
}
finally {
threadMonitoringController.exitService("_rmmSkbngEeyIw-dB1KCaVA");
}
}

public  void setQuestionDescription(String questionDescription) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionDescription", questionDescription);
threadMonitoringController.enterService("_rmngsbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmoHwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionDescription = questionDescription;
threadMonitoringController.exitInternalAction("_rmoHwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmngsbngEeyIw-dB1KCaVA");
}
}

public  int getQuestionNumber() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmou0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmou0bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679314004563217277575171 = questionNumber;
threadMonitoringController.exitInternalAction("_rmou0bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679314004563217277575171;
}
finally {
threadMonitoringController.exitService("_rmou0LngEeyIw-dB1KCaVA");
}
}

public  void setQuestionNumber(int questionNumber) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionNumber", questionNumber);
threadMonitoringController.enterService("_rmp88LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmp88bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionNumber = questionNumber;
threadMonitoringController.exitInternalAction("_rmp88bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmp88LngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionType getQuestionType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmqkAbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmryILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793210022924989100287385 = questionDetails.getQuestionType();
threadMonitoringController.exitInternalAction("_rmryILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793210022924989100287385;
}
finally {
threadMonitoringController.exitService("_rmqkAbngEeyIw-dB1KCaVA");
}
}

public  FeedbackParticipantType getGiverType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmsZMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmsZMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793240041796015826916255 = giverType;
threadMonitoringController.exitInternalAction("_rmsZMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793240041796015826916255;
}
finally {
threadMonitoringController.exitService("_rmsZMLngEeyIw-dB1KCaVA");
}
}

public  void setGiverType(FeedbackParticipantType giverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("giverType", giverType);
threadMonitoringController.enterService("_rmtAQbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmtnULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.giverType = giverType;
threadMonitoringController.exitInternalAction("_rmtnULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmtAQbngEeyIw-dB1KCaVA");
}
}

public  FeedbackParticipantType getRecipientType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmu1cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmvcgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679330009728137543127717 = recipientType;
threadMonitoringController.exitInternalAction("_rmvcgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679330009728137543127717;
}
finally {
threadMonitoringController.exitService("_rmu1cLngEeyIw-dB1KCaVA");
}
}

public  void setRecipientType(FeedbackParticipantType recipientType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("recipientType", recipientType);
threadMonitoringController.enterService("_rmwDkbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmwqoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.recipientType = recipientType;
threadMonitoringController.exitInternalAction("_rmwqoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmwDkbngEeyIw-dB1KCaVA");
}
}

public  int getNumberOfEntitiesToGiveFeedbackTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmxRsbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmx4wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793350015446474547329392 = numberOfEntitiesToGiveFeedbackTo;
threadMonitoringController.exitInternalAction("_rmx4wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793350015446474547329392;
}
finally {
threadMonitoringController.exitService("_rmxRsbngEeyIw-dB1KCaVA");
}
}

public  void setNumberOfEntitiesToGiveFeedbackTo(int numberOfEntitiesToGiveFeedbackTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("numberOfEntitiesToGiveFeedbackTo", numberOfEntitiesToGiveFeedbackTo);
threadMonitoringController.enterService("_rmx4xLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmyf0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.numberOfEntitiesToGiveFeedbackTo = numberOfEntitiesToGiveFeedbackTo;
threadMonitoringController.exitInternalAction("_rmyf0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rmx4xLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackParticipantType> getShowResponsesTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rmzG4bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rmzt8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793440021756145803610616 = showResponsesTo;
threadMonitoringController.exitInternalAction("_rmzt8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793440021756145803610616;
}
finally {
threadMonitoringController.exitService("_rmzG4bngEeyIw-dB1KCaVA");
}
}

public  void setShowResponsesTo(List<FeedbackParticipantType> showResponsesTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showResponsesTo", showResponsesTo);
threadMonitoringController.enterService("_rm0VALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rm0VAbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showResponsesTo = showResponsesTo;
threadMonitoringController.exitInternalAction("_rm0VAbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rm0VALngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackParticipantType> getShowGiverNameTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rm08ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rm1jILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679349004747857518097347 = showGiverNameTo;
threadMonitoringController.exitInternalAction("_rm1jILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679349004747857518097347;
}
finally {
threadMonitoringController.exitService("_rm08ELngEeyIw-dB1KCaVA");
}
}

public  void setShowGiverNameTo(List<FeedbackParticipantType> showGiverNameTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showGiverNameTo", showGiverNameTo);
threadMonitoringController.enterService("_rm1jJLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rm2KMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showGiverNameTo = showGiverNameTo;
threadMonitoringController.exitInternalAction("_rm2KMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rm1jJLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackParticipantType> getShowRecipientNameTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rm2xQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rm2xQbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679355007988918942087252 = showRecipientNameTo;
threadMonitoringController.exitInternalAction("_rm2xQbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679355007988918942087252;
}
finally {
threadMonitoringController.exitService("_rm2xQLngEeyIw-dB1KCaVA");
}
}

public  void setShowRecipientNameTo(List<FeedbackParticipantType> showRecipientNameTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showRecipientNameTo", showRecipientNameTo);
threadMonitoringController.enterService("_rm3YU7ngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rm3_YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showRecipientNameTo = showRecipientNameTo;
threadMonitoringController.exitInternalAction("_rm3_YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rm3YU7ngEeyIw-dB1KCaVA");
}
}

private static  FeedbackQuestionDetails deserializeFeedbackQuestionDetails(String questionDetailsInJson, FeedbackQuestionType questionType) {
return JsonUtils.fromJson(questionDetailsInJson, questionType.getQuestionDetailsClass());
}

public  void update(FeedbackQuestionAttributes.UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_rm50kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rm6boLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.questionNumberOption.ifPresent(s -> questionNumber = s);
threadMonitoringController.exitInternalAction("_rm6boLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rm7pxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rm7pxbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.questionDetailsOption.ifPresent(s -> questionDetails = s.getDeepCopy());
threadMonitoringController.exitInternalAction("_rm7pxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.questionDescriptionOption.ifPresent(s -> questionDescription = s);
updateOptions.giverTypeOption.ifPresent(s -> giverType = s);
updateOptions.recipientTypeOption.ifPresent(s -> recipientType = s);
updateOptions.numberOfEntitiesToGiveFeedbackToOption.ifPresent(s -> numberOfEntitiesToGiveFeedbackTo = s);
updateOptions.showResponsesToOption.ifPresent(s -> showResponsesTo = s);
updateOptions.showGiverNameToOption.ifPresent(s -> showGiverNameTo = s);
updateOptions.showRecipientNameToOption.ifPresent(s -> showRecipientNameTo = s);
threadMonitoringController.exitInternalAction("_rm7pxbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
removeIrrelevantVisibilityOptions();
}
finally {
threadMonitoringController.exitService("_rm50kLngEeyIw-dB1KCaVA");
}
}

public static  FeedbackQuestionAttributes.UpdateOptions.Builder updateOptionsBuilder(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_rm-tELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rm_UILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes.UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793660007087791108575603 = new  FeedbackQuestionAttributes.UpdateOptions.Builder(feedbackQuestionId);
threadMonitoringController.exitInternalAction("_rm_UILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793660007087791108575603;
}
finally {
threadMonitoringController.exitService("_rm-tELngEeyIw-dB1KCaVA");
}
}

public static class Builder extends BasicBuilder<FeedbackQuestionAttributes, Builder> {
private final FeedbackQuestionAttributes feedbackQuestionAttributes;

private  Builder(){
super(new  UpdateOptions(""));
thisBuilder = this;
feedbackQuestionAttributes = new  FeedbackQuestionAttributes();
}
public  Builder withFeedbackSessionName(String feedbackSessionName) {
assert feedbackSessionName != null;
feedbackQuestionAttributes.feedbackSessionName = feedbackSessionName;
return this;
}

public  Builder withCourseId(String courseId) {
assert courseId != null;
feedbackQuestionAttributes.courseId = courseId;
return this;
}

@Override
public  FeedbackQuestionAttributes build() {
feedbackQuestionAttributes.update(updateOptions);
feedbackQuestionAttributes.removeIrrelevantVisibilityOptions();
return feedbackQuestionAttributes;
}

}
public static class UpdateOptions {
private String feedbackQuestionId;

private UpdateOption<FeedbackQuestionDetails> questionDetailsOption = UpdateOption.empty();

private UpdateOption<String> questionDescriptionOption = UpdateOption.empty();

private UpdateOption<Integer> questionNumberOption = UpdateOption.empty();

private UpdateOption<FeedbackParticipantType> giverTypeOption = UpdateOption.empty();

private UpdateOption<FeedbackParticipantType> recipientTypeOption = UpdateOption.empty();

private UpdateOption<Integer> numberOfEntitiesToGiveFeedbackToOption = UpdateOption.empty();

private UpdateOption<List<FeedbackParticipantType>> showResponsesToOption = UpdateOption.empty();

private UpdateOption<List<FeedbackParticipantType>> showGiverNameToOption = UpdateOption.empty();

private UpdateOption<List<FeedbackParticipantType>> showRecipientNameToOption = UpdateOption.empty();

private  UpdateOptions(String feedbackQuestionId){
assert feedbackQuestionId != null;
this.feedbackQuestionId = feedbackQuestionId;
}
public  String getFeedbackQuestionId() {
return feedbackQuestionId;
}

@Override
public  String toString() {
return "FeedbackQuestionAttributes.UpdateOptions [" + "feedbackQuestionId = " + feedbackQuestionId + ", questionDetails = " + JsonUtils.toJson(questionDetailsOption) + ", questionDescription = " + questionDescriptionOption + ", questionNumber = " + questionNumberOption + ", giverType = " + giverTypeOption + ", recipientType = " + recipientTypeOption + ", numberOfEntitiesToGiveFeedbackTo = " + numberOfEntitiesToGiveFeedbackToOption + ", showResponsesTo = " + showResponsesToOption + ", showGiverNameTo = " + showGiverNameToOption + ", showRecipientNameTo = " + showRecipientNameToOption + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(String feedbackQuestionId){
super(new  UpdateOptions(feedbackQuestionId));
thisBuilder = this;
}
@Override
public  UpdateOptions build() {
return updateOptions;
}

}
}
private abstract static class BasicBuilder<T, B extends BasicBuilder<T, B>>  {
FeedbackQuestionAttributes.UpdateOptions updateOptions;

B thisBuilder;

 BasicBuilder(UpdateOptions updateOptions){
this.updateOptions = updateOptions;
}
public  B withQuestionDetails(FeedbackQuestionDetails questionDetails) {
assert questionDetails != null;
updateOptions.questionDetailsOption = UpdateOption.of(questionDetails.getDeepCopy());
return thisBuilder;
}

public  B withQuestionDescription(String questionDescription) {
updateOptions.questionDescriptionOption = UpdateOption.of(questionDescription);
return thisBuilder;
}

public  B withQuestionNumber(int questionNumber) {
updateOptions.questionNumberOption = UpdateOption.of(questionNumber);
return thisBuilder;
}

public  B withGiverType(FeedbackParticipantType giverType) {
assert giverType != null;
updateOptions.giverTypeOption = UpdateOption.of(giverType);
return thisBuilder;
}

public  B withRecipientType(FeedbackParticipantType recipientType) {
assert recipientType != null;
updateOptions.recipientTypeOption = UpdateOption.of(recipientType);
return thisBuilder;
}

public  B withNumberOfEntitiesToGiveFeedbackTo(int numberOfEntitiesToGiveFeedbackTo) {
updateOptions.numberOfEntitiesToGiveFeedbackToOption = UpdateOption.of(numberOfEntitiesToGiveFeedbackTo);
return thisBuilder;
}

public  B withShowResponsesTo(List<FeedbackParticipantType> showResponsesTo) {
assert showResponsesTo != null;
assert !showResponsesTo.contains(null);
updateOptions.showResponsesToOption = UpdateOption.of(new  ArrayList<>(showResponsesTo));
return thisBuilder;
}

public  B withShowGiverNameTo(List<FeedbackParticipantType> showGiverNameTo) {
assert showGiverNameTo != null;
assert !showGiverNameTo.contains(null);
updateOptions.showGiverNameToOption = UpdateOption.of(new  ArrayList<>(showGiverNameTo));
return thisBuilder;
}

public  B withShowRecipientNameTo(List<FeedbackParticipantType> showRecipientNameTo) {
assert showRecipientNameTo != null;
assert !showRecipientNameTo.contains(null);
updateOptions.showRecipientNameToOption = UpdateOption.of(new  ArrayList<>(showRecipientNameTo));
return thisBuilder;
}

public abstract  T build() ;

}
}
