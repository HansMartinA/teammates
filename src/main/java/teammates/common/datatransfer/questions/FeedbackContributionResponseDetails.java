package teammates.common.datatransfer.questions;

import teammates.common.util.Const;
public class FeedbackContributionResponseDetails extends FeedbackResponseDetails {
private int answer;

public  FeedbackContributionResponseDetails(){
super(FeedbackQuestionType.CONTRIB);
answer = Const.POINTS_NOT_SUBMITTED;
}
@Override
public  String getAnswerString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a-Jk8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a-LaILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020445009659231578448113 = Integer.toString(answer);
threadMonitoringController.exitInternalAction("_a-LaILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020445009659231578448113;
}
finally {
threadMonitoringController.exitService("_a-Jk8LvVEeyr6avTgCRLkQ");
}
}

public  int getAnswer() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a9I4ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a9KGcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130204350022791374063823777 = answer;
threadMonitoringController.exitInternalAction("_a9KGcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130204350022791374063823777;
}
finally {
threadMonitoringController.exitService("_a9I4ULvVEeyr6avTgCRLkQ");
}
}

public  void setAnswer(int answer) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answer", answer);
threadMonitoringController.enterService("_a-N2YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a-PEgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answer = answer;
threadMonitoringController.exitInternalAction("_a-PEgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a-N2YLvVEeyr6avTgCRLkQ");
}
}

}
