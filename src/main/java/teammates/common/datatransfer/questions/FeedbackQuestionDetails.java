package teammates.common.datatransfer.questions;

import java.util.List;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.SessionResultsBundle;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.util.JsonUtils;
public abstract class FeedbackQuestionDetails {
private FeedbackQuestionType questionType;

private String questionText;

protected  FeedbackQuestionDetails(FeedbackQuestionType questionType){
this.questionType = questionType;
}
protected  FeedbackQuestionDetails(FeedbackQuestionType questionType, String questionText){
this.questionType = questionType;
this.questionText = questionText;
}
@SuppressWarnings("PMD.EmptyMethodInAbstractClassShouldBeAbstract")
public  String getQuestionResultStatisticsJson(FeedbackQuestionAttributes question, String studentEmail, SessionResultsBundle bundle) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
monitoringServiceParameters.addValue("studentEmail", studentEmail);
monitoringServiceParameters.addValue("bundle", bundle);
threadMonitoringController.enterService("_bHrUYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bHsigLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130212350005618277459782528 = "";
threadMonitoringController.exitInternalAction("_bHsigLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130212350005618277459782528;
}
finally {
threadMonitoringController.exitService("_bHrUYLvVEeyr6avTgCRLkQ");
}
}

public abstract  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) ;

public  boolean isIndividualResponsesShownToStudents() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bHu-wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bHwM4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021245005671210255569282 = true;
threadMonitoringController.exitInternalAction("_bHwM4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021245005671210255569282;
}
finally {
threadMonitoringController.exitService("_bHu-wLvVEeyr6avTgCRLkQ");
}
}

public abstract  List<String> validateQuestionDetails() ;

public abstract  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responseDetails, int numRecipients) ;

public abstract  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) ;

public  boolean isInstructorCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bH-PULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bH_dcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021276009917898709758253 = true;
threadMonitoringController.exitInternalAction("_bH_dcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021276009917898709758253;
}
finally {
threadMonitoringController.exitService("_bH-PULvVEeyr6avTgCRLkQ");
}
}

public abstract  boolean isFeedbackParticipantCommentsOnResponsesAllowed() ;

public  boolean shouldGenerateMissingResponses(FeedbackQuestionAttributes question) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
threadMonitoringController.enterService("_bIGLILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return question.getRecipientType() != FeedbackParticipantType.STUDENTS && question.getRecipientType() != FeedbackParticipantType.TEAMS;
}
finally {
threadMonitoringController.exitService("_bIGLILvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object obj) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("obj", obj);
threadMonitoringController.enterService("_aDONwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aDONwbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (this == obj)
{
return true;
}
if (obj == null || obj.getClass() != this.getClass())
{
return false;
}
FeedbackQuestionDetails other = (FeedbackQuestionDetails) obj;
threadMonitoringController.exitInternalAction("_aDONwbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aDPb5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015893003307219995367213 = this.getJsonString().equals(other.getJsonString());
threadMonitoringController.exitInternalAction("_aDPb5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aDQC87vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015894003055607534023915 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015893003307219995367213;
threadMonitoringController.exitInternalAction("_aDQC87vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aDQC9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015894003696891982144701 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015894003055607534023915;
threadMonitoringController.exitInternalAction("_aDQC9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015894003696891982144701;
}
finally {
threadMonitoringController.exitService("_aDONwLvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aCuegbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aCvspLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301587700777624453125797 = this.getJsonString().hashCode();
threadMonitoringController.exitInternalAction("_aCvspLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aCvspbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130158770047110669579554043 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301587700777624453125797;
threadMonitoringController.exitInternalAction("_aCvspbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130158770047110669579554043;
}
finally {
threadMonitoringController.exitService("_aCuegbvVEeyr6avTgCRLkQ");
}
}

public  String getJsonString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aDfTgbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aDf6kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionType != null;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301593200553560646936147 = JsonUtils.toJson(this, questionType.getQuestionDetailsClass());
threadMonitoringController.exitInternalAction("_aDf6kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301593200553560646936147;
}
finally {
threadMonitoringController.exitService("_aDfTgbvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionDetails getDeepCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aDc3QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aDc3QbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionType != null;
threadMonitoringController.exitInternalAction("_aDc3QbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aDdeVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String serializedDetails = getJsonString();
threadMonitoringController.exitInternalAction("_aDdeVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aDeFYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130159240032240174169176716 = JsonUtils.fromJson(serializedDetails, questionType.getQuestionDetailsClass());
threadMonitoringController.exitInternalAction("_aDeFYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aDeFZbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015924009692009895500654 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130159240032240174169176716;
threadMonitoringController.exitInternalAction("_aDeFZbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015924009692009895500654;
}
finally {
threadMonitoringController.exitService("_aDc3QLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionType getQuestionType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aDlaIbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aDmBMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015939005672995446348513 = questionType;
threadMonitoringController.exitInternalAction("_aDmBMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015939005672995446348513;
}
finally {
threadMonitoringController.exitService("_aDlaIbvVEeyr6avTgCRLkQ");
}
}

public  void setQuestionType(FeedbackQuestionType questionType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionType", questionType);
threadMonitoringController.enterService("_bILqsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bIM40LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionType = questionType;
threadMonitoringController.exitInternalAction("_bIM40LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bILqsLvVEeyr6avTgCRLkQ");
}
}

public  String getQuestionText() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bIPVELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bIQjMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130213090006384452467334678 = questionText;
threadMonitoringController.exitInternalAction("_bIQjMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130213090006384452467334678;
}
finally {
threadMonitoringController.exitService("_bIPVELvVEeyr6avTgCRLkQ");
}
}

public  void setQuestionText(String questionText) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionText", questionText);
threadMonitoringController.enterService("_bISYYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bIUNkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionText = questionText;
threadMonitoringController.exitInternalAction("_bIUNkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bISYYLvVEeyr6avTgCRLkQ");
}
}

}
