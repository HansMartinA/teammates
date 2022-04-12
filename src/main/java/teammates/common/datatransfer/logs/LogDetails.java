package teammates.common.datatransfer.logs;

import javax.annotation.Nullable;
public abstract class LogDetails {
private LogEvent event;

@Nullable
private String message;

protected  LogDetails(LogEvent event){
this.event = event;
}
public  LogEvent getEvent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sSlO0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sSl14LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
LogEvent longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368080800871196514184522 = event;
threadMonitoringController.exitInternalAction("_sSl14LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368080800871196514184522;
}
finally {
threadMonitoringController.exitService("_sSlO0LngEeyIw-dB1KCaVA");
}
}

public  String getMessage() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sSnrELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sSo5MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680811008574129483695697 = message;
threadMonitoringController.exitInternalAction("_sSo5MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680811008574129483695697;
}
finally {
threadMonitoringController.exitService("_sSnrELngEeyIw-dB1KCaVA");
}
}

public  void setMessage(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_sOc8wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sOeK4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.message = message;
threadMonitoringController.exitInternalAction("_sOeK4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sOc8wLngEeyIw-dB1KCaVA");
}
}

public abstract  void hideSensitiveInformation() ;

}
