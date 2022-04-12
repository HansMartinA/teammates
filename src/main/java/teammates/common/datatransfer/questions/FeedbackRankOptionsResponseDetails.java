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
threadMonitoringController.enterService("_sq_HwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_srAV4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Integer> filteredAnswers = new  ArrayList<>();
for (int answer : answers)
{
if (answer != Const.POINTS_NOT_SUBMITTED)
{
filteredAnswers.add(answer);
}
}
filteredAnswers.sort(null);
List<Integer> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136814320016075087669732646 = filteredAnswers;
threadMonitoringController.exitInternalAction("_srAV4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136814320016075087669732646;
}
finally {
threadMonitoringController.exitService("_sq_HwLngEeyIw-dB1KCaVA");
}
}

@Override
public  String getAnswerString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_srVGALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_srYJULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String listString = getFilteredSortedAnswerList().toString();
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681434006460239261171705 = listString.substring(1, listString.length() - 1);
threadMonitoringController.exitInternalAction("_srYJULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681434006460239261171705;
}
finally {
threadMonitoringController.exitService("_srVGALngEeyIw-dB1KCaVA");
}
}

public  List<Integer> getAnswers() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_srbzsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_srdB0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Integer> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681436009264573586826986 = answers;
threadMonitoringController.exitInternalAction("_srdB0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681436009264573586826986;
}
finally {
threadMonitoringController.exitService("_srbzsLngEeyIw-dB1KCaVA");
}
}

public  void setAnswers(List<Integer> answers) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("answers", answers);
threadMonitoringController.enterService("_srfeELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_srhTQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.answers = answers;
threadMonitoringController.exitInternalAction("_srhTQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_srfeELngEeyIw-dB1KCaVA");
}
}

}
