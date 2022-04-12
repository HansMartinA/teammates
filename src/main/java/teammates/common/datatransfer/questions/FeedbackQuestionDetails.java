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
threadMonitoringController.enterService("_soDIgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_soEWoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681383009653692054873673 = "";
threadMonitoringController.exitInternalAction("_soEWoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681383009653692054873673;
}
finally {
threadMonitoringController.exitService("_soDIgLngEeyIw-dB1KCaVA");
}
}

public abstract  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) ;

public  boolean isIndividualResponsesShownToStudents() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_soGy4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_soIBALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368138600712517795807355 = true;
threadMonitoringController.exitInternalAction("_soIBALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368138600712517795807355;
}
finally {
threadMonitoringController.exitService("_soGy4LngEeyIw-dB1KCaVA");
}
}

public abstract  List<String> validateQuestionDetails() ;

public abstract  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responseDetails, int numRecipients) ;

public abstract  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) ;

public  boolean isInstructorCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_soTnMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_soU1ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681394005908779125084498 = true;
threadMonitoringController.exitInternalAction("_soU1ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681394005908779125084498;
}
finally {
threadMonitoringController.exitService("_soTnMLngEeyIw-dB1KCaVA");
}
}

public abstract  boolean isFeedbackParticipantCommentsOnResponsesAllowed() ;

public  boolean shouldGenerateMissingResponses(FeedbackQuestionAttributes question) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
threadMonitoringController.enterService("_soa78LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return question.getRecipientType() != FeedbackParticipantType.STUDENTS && question.getRecipientType() != FeedbackParticipantType.TEAMS;
}
finally {
threadMonitoringController.exitService("_soa78LngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object obj) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("obj", obj);
threadMonitoringController.enterService("_roGucLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_roHVgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (this == obj)
{
return true;
}
if (obj == null || obj.getClass() != this.getClass())
{
return false;
}
FeedbackQuestionDetails other = (FeedbackQuestionDetails) obj;
threadMonitoringController.exitInternalAction("_roHVgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_roH8lLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367939300020387187950997476 = this.getJsonString().equals(other.getJsonString());
threadMonitoringController.exitInternalAction("_roH8lLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_roIjo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679393008619922722849319 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367939300020387187950997476;
threadMonitoringController.exitInternalAction("_roIjo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_roIjpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679393004237772314861479 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679393008619922722849319;
threadMonitoringController.exitInternalAction("_roIjpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679393004237772314861479;
}
finally {
threadMonitoringController.exitService("_roGucLngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rn8WYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rn9khLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679385007692492051916324 = this.getJsonString().hashCode();
threadMonitoringController.exitInternalAction("_rn9khLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rn9khbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793850030715042027203865 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679385007692492051916324;
threadMonitoringController.exitInternalAction("_rn9khbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793850030715042027203865;
}
finally {
threadMonitoringController.exitService("_rn8WYLngEeyIw-dB1KCaVA");
}
}

public  String getJsonString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rocssbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rodTwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionType != null;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794060011405577895922181 = JsonUtils.toJson(this, questionType.getQuestionDetailsClass());
threadMonitoringController.exitInternalAction("_rodTwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794060011405577895922181;
}
finally {
threadMonitoringController.exitService("_rocssbngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionDetails getDeepCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_roZpYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_roaQcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionType != null;
threadMonitoringController.exitInternalAction("_roaQcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_roa3hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String serializedDetails = getJsonString();
threadMonitoringController.exitInternalAction("_roa3hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_robekLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794030000797720219660114 = JsonUtils.fromJson(serializedDetails, questionType.getQuestionDetailsClass());
threadMonitoringController.exitInternalAction("_robekLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_robelbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794030024837247446397492 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794030000797720219660114;
threadMonitoringController.exitInternalAction("_robelbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794030024837247446397492;
}
finally {
threadMonitoringController.exitService("_roZpYLngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionType getQuestionType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rojaYbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rokBcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679409005130054042020739 = questionType;
threadMonitoringController.exitInternalAction("_rokBcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679409005130054042020739;
}
finally {
threadMonitoringController.exitService("_rojaYbngEeyIw-dB1KCaVA");
}
}

public  void setQuestionType(FeedbackQuestionType questionType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionType", questionType);
threadMonitoringController.enterService("_sofNYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sogbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionType = questionType;
threadMonitoringController.exitInternalAction("_sogbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sofNYLngEeyIw-dB1KCaVA");
}
}

public  String getQuestionText() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_soi3wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sokF4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368140200285686262488696 = questionText;
threadMonitoringController.exitInternalAction("_sokF4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368140200285686262488696;
}
finally {
threadMonitoringController.exitService("_soi3wLngEeyIw-dB1KCaVA");
}
}

public  void setQuestionText(String questionText) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionText", questionText);
threadMonitoringController.enterService("_sol7ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sonJMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionText = questionText;
threadMonitoringController.exitInternalAction("_sonJMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sol7ELngEeyIw-dB1KCaVA");
}
}

}
