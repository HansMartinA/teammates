package teammates.common.datatransfer.questions;

import teammates.common.util.SanitizationHelper;
public class FeedbackTextResponseDetails extends FeedbackResponseDetails {
private String answer;

public  FeedbackTextResponseDetails(){
super(FeedbackQuestionType.TEXT);
this.answer = "";
}
public  FeedbackTextResponseDetails(String answer){
super(FeedbackQuestionType.TEXT);
this.answer = SanitizationHelper.sanitizeForRichText(answer);
}
@Override
public  String getAnswerString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bRbGQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return SanitizationHelper.sanitizeForRichText(answer);
}
finally {
threadMonitoringController.exitService("_bRbGQLvVEeyr6avTgCRLkQ");
}
}

public  String getAnswer() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bRkQMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bRmscLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021972008052061388910049 = answer;
threadMonitoringController.exitInternalAction("_bRmscLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021972008052061388910049;
}
finally {
threadMonitoringController.exitService("_bRkQMLvVEeyr6avTgCRLkQ");
}
}

public  void setAnswer(String answer) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answer", answer);
threadMonitoringController.enterService("_bRqW0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bRszELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answer = answer;
threadMonitoringController.exitInternalAction("_bRszELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bRqW0LvVEeyr6avTgCRLkQ");
}
}

}
