package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.List;
public class FeedbackRubricResponseDetails extends FeedbackResponseDetails {
private List<Integer> answer;

public  FeedbackRubricResponseDetails(){
super(FeedbackQuestionType.RUBRIC);
answer = new  ArrayList<>();
}
@Override
public  String getAnswerString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bQBYELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQDNQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130218470009459342289587414 = this.answer.toString();
threadMonitoringController.exitInternalAction("_bQDNQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130218470009459342289587414;
}
finally {
threadMonitoringController.exitService("_bQBYELvVEeyr6avTgCRLkQ");
}
}

public  List<Integer> getAnswer() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bPelgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bPfzoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Integer> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021837008494523212823131 = answer;
threadMonitoringController.exitInternalAction("_bPfzoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021837008494523212823131;
}
finally {
threadMonitoringController.exitService("_bPelgLvVEeyr6avTgCRLkQ");
}
}

public  void setAnswer(List<Integer> answer) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answer", answer);
threadMonitoringController.enterService("_bQFpgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQG3oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answer = answer;
threadMonitoringController.exitInternalAction("_bQG3oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bQFpgLvVEeyr6avTgCRLkQ");
}
}

}
