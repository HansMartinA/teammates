package teammates.common.datatransfer;

import java.util.List;
import teammates.common.datatransfer.logs.GeneralLogEntry;
public class QueryLogsResults {
private final List<GeneralLogEntry> logEntries;

private final boolean hasNextPage;

public  QueryLogsResults(List<GeneralLogEntry> logEntries, boolean hasNextPage){
this.logEntries = logEntries;
this.hasNextPage = hasNextPage;
}
public  List<GeneralLogEntry> getLogEntries() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a2GcMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a2HqULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<GeneralLogEntry> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130200210039478384353757434 = logEntries;
threadMonitoringController.exitInternalAction("_a2HqULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130200210039478384353757434;
}
finally {
threadMonitoringController.exitService("_a2GcMLvVEeyr6avTgCRLkQ");
}
}

public  boolean getHasNextPage() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a2JfgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a2LUsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020030007981249831986508 = hasNextPage;
threadMonitoringController.exitInternalAction("_a2LUsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020030007981249831986508;
}
finally {
threadMonitoringController.exitService("_a2JfgLvVEeyr6avTgCRLkQ");
}
}

}
