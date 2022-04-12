package teammates.common.datatransfer.logs;

public class DefaultLogDetails extends LogDetails {
public  DefaultLogDetails(){
super(LogEvent.DEFAULT_LOG);
}
@Override
public  void hideSensitiveInformation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sOXdMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sOYEQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
setMessage(null);
threadMonitoringController.exitInternalAction("_sOYEQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sOXdMLngEeyIw-dB1KCaVA");
}
}

}
