package teammates.common.datatransfer.logs;

public class DefaultLogDetails extends LogDetails {
public  DefaultLogDetails(){
super(LogEvent.DEFAULT_LOG);
}
@Override
public  void hideSensitiveInformation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aq1AULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aq21gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
setMessage(null);
threadMonitoringController.exitInternalAction("_aq21gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aq1AULvVEeyr6avTgCRLkQ");
}
}

}
