package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.List;
public class FeedbackConstantSumResponseDetails extends FeedbackResponseDetails {
private List<Integer> answers;

public  FeedbackConstantSumResponseDetails(){
super(FeedbackQuestionType.CONSTSUM);
answers = new  ArrayList<>();
}
@Override
public  String getAnswerString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sacKULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sad_gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String listString = answers.toString();
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681116006305326109943702 = listString.substring(1, listString.length() - 1);
threadMonitoringController.exitInternalAction("_sad_gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681116006305326109943702;
}
finally {
threadMonitoringController.exitService("_sacKULngEeyIw-dB1KCaVA");
}
}

public  List<Integer> getAnswers() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sZ1tYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sZ27gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Integer> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681114006052874659623512 = answers;
threadMonitoringController.exitInternalAction("_sZ27gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681114006052874659623512;
}
finally {
threadMonitoringController.exitService("_sZ1tYLngEeyIw-dB1KCaVA");
}
}

public  void setAnswers(List<Integer> answers) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answers", answers);
threadMonitoringController.enterService("_sagbwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sahp4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answers = answers;
threadMonitoringController.exitInternalAction("_sahp4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sagbwLngEeyIw-dB1KCaVA");
}
}

}
