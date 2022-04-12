package teammates.common.datatransfer.questions;

import teammates.common.util.Const;
public abstract class FeedbackRankQuestionDetails extends FeedbackQuestionDetails {
int minOptionsToBeRanked;

int maxOptionsToBeRanked;

boolean areDuplicatesAllowed;

 FeedbackRankQuestionDetails(FeedbackQuestionType questionType, String questionText){
super(questionType, questionText);
minOptionsToBeRanked = Const.POINTS_NO_VALUE;
maxOptionsToBeRanked = Const.POINTS_NO_VALUE;
}
public  int getMinOptionsToBeRanked() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_srrrULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_srtggLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681443002292633742891118 = minOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_srtggLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681443002292633742891118;
}
finally {
threadMonitoringController.exitService("_srrrULngEeyIw-dB1KCaVA");
}
}

public  void setMinOptionsToBeRanked(int minOptionsToBeRanked) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("minOptionsToBeRanked", minOptionsToBeRanked);
threadMonitoringController.enterService("_srwj0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sryZALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.minOptionsToBeRanked = minOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_sryZALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_srwj0LngEeyIw-dB1KCaVA");
}
}

public  int getMaxOptionsToBeRanked() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sr01QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sr2DYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681447009418295950834455 = maxOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_sr2DYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681447009418295950834455;
}
finally {
threadMonitoringController.exitService("_sr01QLngEeyIw-dB1KCaVA");
}
}

public  void setMaxOptionsToBeRanked(int maxOptionsToBeRanked) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("maxOptionsToBeRanked", maxOptionsToBeRanked);
threadMonitoringController.enterService("_sr4foLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sr5twLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.maxOptionsToBeRanked = maxOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_sr5twLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sr4foLngEeyIw-dB1KCaVA");
}
}

public  boolean isAreDuplicatesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sr8KALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sr8xELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681452008333480271035939 = areDuplicatesAllowed;
threadMonitoringController.exitInternalAction("_sr8xELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681452008333480271035939;
}
finally {
threadMonitoringController.exitService("_sr8KALngEeyIw-dB1KCaVA");
}
}

public  void setAreDuplicatesAllowed(boolean areDuplicatesAllowed) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("areDuplicatesAllowed", areDuplicatesAllowed);
threadMonitoringController.enterService("_sr_NULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ssBCgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.areDuplicatesAllowed = areDuplicatesAllowed;
threadMonitoringController.exitInternalAction("_ssBCgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sr_NULngEeyIw-dB1KCaVA");
}
}

}
