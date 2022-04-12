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
threadMonitoringController.enterService("_sw4UYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return SanitizationHelper.sanitizeForRichText(answer);
}
finally {
threadMonitoringController.exitService("_sw4UYLngEeyIw-dB1KCaVA");
}
}

public  String getAnswer() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sw-bALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sxAQMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136815900012465062669672689 = answer;
threadMonitoringController.exitInternalAction("_sxAQMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136815900012465062669672689;
}
finally {
threadMonitoringController.exitService("_sw-bALngEeyIw-dB1KCaVA");
}
}

public  void setAnswer(String answer) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answer", answer);
threadMonitoringController.enterService("_sxDTgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sxFIsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answer = answer;
threadMonitoringController.exitInternalAction("_sxFIsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sxDTgLngEeyIw-dB1KCaVA");
}
}

}
