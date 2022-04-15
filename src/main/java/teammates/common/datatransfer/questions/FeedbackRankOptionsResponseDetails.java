package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.List;
import teammates.common.util.Const;
public class FeedbackRankOptionsResponseDetails extends FeedbackResponseDetails {
private List<Integer> answers;

public  FeedbackRankOptionsResponseDetails(){
super(FeedbackQuestionType.RANK_OPTIONS);
answers = new  ArrayList<>();
}
public  List<Integer> getFilteredSortedAnswerList() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bKvPcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bKwdkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Integer> filteredAnswers = new  ArrayList<>();
for (int answer : answers)
{
if (answer != Const.POINTS_NOT_SUBMITTED)
{
filteredAnswers.add(answer);
}
}
filteredAnswers.sort(null);
List<Integer> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021418008915847290343739 = filteredAnswers;
threadMonitoringController.exitInternalAction("_bKwdkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021418008915847290343739;
}
finally {
threadMonitoringController.exitService("_bKvPcLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String getAnswerString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bLI4ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bLO-sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String listString = getFilteredSortedAnswerList().toString();
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021427002498710315770163 = listString.substring(1, listString.length() - 1);
threadMonitoringController.exitInternalAction("_bLO-sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021427002498710315770163;
}
finally {
threadMonitoringController.exitService("_bLI4ELvVEeyr6avTgCRLkQ");
}
}

public  List<Integer> getAnswers() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bLTQILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bLVFULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Integer> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021440007222152237601283 = answers;
threadMonitoringController.exitInternalAction("_bLVFULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021440007222152237601283;
}
finally {
threadMonitoringController.exitService("_bLTQILvVEeyr6avTgCRLkQ");
}
}

public  void setAnswers(List<Integer> answers) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answers", answers);
threadMonitoringController.enterService("_bLYvsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bLak4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answers = answers;
threadMonitoringController.exitInternalAction("_bLak4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bLYvsLvVEeyr6avTgCRLkQ");
}
}

}
