package teammates.common.datatransfer.questions;

import teammates.common.util.Const;
import teammates.common.util.StringHelper;
public class FeedbackNumericalScaleResponseDetails extends FeedbackResponseDetails {
private double answer;

public  FeedbackNumericalScaleResponseDetails(){
super(FeedbackQuestionType.NUMSCALE);
answer = Const.POINTS_NOT_SUBMITTED;
}
@Override
public  String getAnswerString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bG3cELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bG6fYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021203007206631899020607 = StringHelper.toDecimalFormatString(answer);
threadMonitoringController.exitInternalAction("_bG6fYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021203007206631899020607;
}
finally {
threadMonitoringController.exitService("_bG3cELvVEeyr6avTgCRLkQ");
}
}

public  double getAnswer() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bGx8gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGzKoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
double longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130211920019155875322113758 = answer;
threadMonitoringController.exitInternalAction("_bGzKoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130211920019155875322113758;
}
finally {
threadMonitoringController.exitService("_bGx8gLvVEeyr6avTgCRLkQ");
}
}

public  void setAnswer(double answer) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answer", answer);
threadMonitoringController.enterService("_bHbcwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bHdR8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answer = answer;
threadMonitoringController.exitInternalAction("_bHdR8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bHbcwLvVEeyr6avTgCRLkQ");
}
}

}
