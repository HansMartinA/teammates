package teammates.common.datatransfer.questions;

import teammates.common.util.JsonUtils;
public abstract class FeedbackResponseDetails {
private FeedbackQuestionType questionType;

public  FeedbackResponseDetails(FeedbackQuestionType questionType){
this.questionType = questionType;
}
public abstract  String getAnswerString() ;

public  String getJsonString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rr0JwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rr1X4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionType != null;
if (questionType == FeedbackQuestionType.TEXT)
{
return getAnswerString();
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679530003054806569343743 = JsonUtils.toJson(this, questionType.getResponseDetailsClass());
threadMonitoringController.exitInternalAction("_rr1X4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679530003054806569343743;
}
finally {
threadMonitoringController.exitService("_rr0JwLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseDetails getDeepCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rrwfYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rrxGcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionType != null;
if (questionType == FeedbackQuestionType.TEXT)
{
FeedbackResponseDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679528006741736279352317 = new  FeedbackTextResponseDetails(getAnswerString());
threadMonitoringController.exitInternalAction("_rrxGcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679528006741736279352317;
}
threadMonitoringController.enterInternalAction("_rryUlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String serializedResponseDetails = getJsonString();
threadMonitoringController.exitInternalAction("_rryUlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rry7oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679528009914365015679759 = JsonUtils.fromJson(serializedResponseDetails, questionType.getResponseDetailsClass());
threadMonitoringController.exitInternalAction("_rry7oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679528009914365015679759;
}
finally {
threadMonitoringController.exitService("_rrwfYLngEeyIw-dB1KCaVA");
}
}

public  void setQuestionType(FeedbackQuestionType questionType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionType", questionType);
threadMonitoringController.enterService("_stPKgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_stQYoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionType = questionType;
threadMonitoringController.exitInternalAction("_stQYoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_stPKgLngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionType getQuestionType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rrahILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rrbIMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679522004719392100114629 = questionType;
threadMonitoringController.exitInternalAction("_rrbIMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679522004719392100114629;
}
finally {
threadMonitoringController.exitService("_rrahILngEeyIw-dB1KCaVA");
}
}

}
