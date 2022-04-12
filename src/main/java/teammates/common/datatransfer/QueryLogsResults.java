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
threadMonitoringController.enterService("_sXlDkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sXmRsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<GeneralLogEntry> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681031001491765615914764 = logEntries;
threadMonitoringController.exitInternalAction("_sXmRsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681031001491765615914764;
}
finally {
threadMonitoringController.exitService("_sXlDkLngEeyIw-dB1KCaVA");
}
}

public  boolean getHasNextPage() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sXnf0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sXot8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810340020201019842447587 = hasNextPage;
threadMonitoringController.exitInternalAction("_sXot8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810340020201019842447587;
}
finally {
threadMonitoringController.exitService("_sXnf0LngEeyIw-dB1KCaVA");
}
}

}
