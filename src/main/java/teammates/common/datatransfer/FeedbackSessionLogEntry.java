package teammates.common.datatransfer;

public class FeedbackSessionLogEntry {
private final String studentEmail;

private final String feedbackSessionName;

private final String feedbackSessionLogType;

private final long timestamp;

public  FeedbackSessionLogEntry(String studentEmail, String feedbackSessionName, String feedbackSessionLogType, long timestamp){
this.studentEmail = studentEmail;
this.feedbackSessionName = feedbackSessionName;
this.feedbackSessionLogType = feedbackSessionLogType;
this.timestamp = timestamp;
}
public  String getStudentEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sH6P4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sH7eALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368046300739411674867409 = studentEmail;
threadMonitoringController.exitInternalAction("_sH7eALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368046300739411674867409;
}
finally {
threadMonitoringController.exitService("_sH6P4LngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sH8sILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sH96QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680465006222465802640089 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_sH96QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680465006222465802640089;
}
finally {
threadMonitoringController.exitService("_sH8sILngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackSessionLogType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sH_IYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIAWgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680468005261270816702712 = this.feedbackSessionLogType;
threadMonitoringController.exitInternalAction("_sIAWgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680468005261270816702712;
}
finally {
threadMonitoringController.exitService("_sH_IYLngEeyIw-dB1KCaVA");
}
}

public  long getTimestamp() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sIBkoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sICywLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680472004939598040501898 = this.timestamp;
threadMonitoringController.exitInternalAction("_sICywLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680472004939598040501898;
}
finally {
threadMonitoringController.exitService("_sIBkoLngEeyIw-dB1KCaVA");
}
}

}
