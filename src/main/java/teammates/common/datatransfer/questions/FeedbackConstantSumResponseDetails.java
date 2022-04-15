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
threadMonitoringController.enterService("_a5JJILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a5K-ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String listString = answers.toString();
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130202580078108743421846 = listString.substring(1, listString.length() - 1);
threadMonitoringController.exitInternalAction("_a5K-ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130202580078108743421846;
}
finally {
threadMonitoringController.exitService("_a5JJILvVEeyr6avTgCRLkQ");
}
}

public  List<Integer> getAnswers() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a4heELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a4isMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Integer> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020242007105754572511797 = answers;
threadMonitoringController.exitInternalAction("_a4isMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020242007105754572511797;
}
finally {
threadMonitoringController.exitService("_a4heELvVEeyr6avTgCRLkQ");
}
}

public  void setAnswers(List<Integer> answers) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answers", answers);
threadMonitoringController.enterService("_a5NakLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a5P20LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answers = answers;
threadMonitoringController.exitInternalAction("_a5P20LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a5NakLvVEeyr6avTgCRLkQ");
}
}

}
