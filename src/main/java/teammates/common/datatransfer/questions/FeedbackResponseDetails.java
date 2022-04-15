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
threadMonitoringController.enterService("_aG2JgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aG2JgbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionType != null;
if (questionType == FeedbackQuestionType.TEXT)
{
return getAnswerString();
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016215002381913871107092 = JsonUtils.toJson(this, questionType.getResponseDetailsClass());
threadMonitoringController.exitInternalAction("_aG2JgbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016215002381913871107092;
}
finally {
threadMonitoringController.exitService("_aG2JgLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseDetails getDeepCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aGxRALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aGx4ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionType != null;
if (questionType == FeedbackQuestionType.TEXT)
{
FeedbackResponseDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301620800365993804988313 = new  FeedbackTextResponseDetails(getAnswerString());
threadMonitoringController.exitInternalAction("_aGx4ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301620800365993804988313;
}
threadMonitoringController.enterInternalAction("_aGztRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String serializedResponseDetails = getJsonString();
threadMonitoringController.exitInternalAction("_aGztRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aG0UULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130162080048668903307488987 = JsonUtils.fromJson(serializedResponseDetails, questionType.getResponseDetailsClass());
threadMonitoringController.exitInternalAction("_aG0UULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130162080048668903307488987;
}
finally {
threadMonitoringController.exitService("_aGxRALvVEeyr6avTgCRLkQ");
}
}

public  void setQuestionType(FeedbackQuestionType questionType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionType", questionType);
threadMonitoringController.enterService("_bNQ_ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bNSNILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionType = questionType;
threadMonitoringController.exitInternalAction("_bNSNILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bNQ_ALvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionType getQuestionType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aGY2gbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aGaEoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016194000483411424547151 = questionType;
threadMonitoringController.exitInternalAction("_aGaEoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016194000483411424547151;
}
finally {
threadMonitoringController.exitService("_aGY2gbvVEeyr6avTgCRLkQ");
}
}

}
