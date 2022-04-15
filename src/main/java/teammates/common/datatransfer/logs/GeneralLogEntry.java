package teammates.common.datatransfer.logs;

import java.util.Map;
import javax.annotation.Nullable;
public class GeneralLogEntry {
private final LogSeverity severity;

private final String trace;

private final String insertId;

private final Map<String, String> resourceIdentifier;

private final SourceLocation sourceLocation;

private final long timestamp;

@Nullable
private String message;

@Nullable
private LogDetails details;

public  GeneralLogEntry(LogSeverity severity, String trace, String insertId, Map<String, String> resourceIdentifier, SourceLocation sourceLocation, long timestamp){
this.severity = severity;
this.trace = trace;
this.insertId = insertId;
this.resourceIdentifier = resourceIdentifier;
this.sourceLocation = sourceLocation;
this.timestamp = timestamp;
}
public  void setMessage(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_auzhYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_au0vgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.message = message;
threadMonitoringController.exitInternalAction("_au0vgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_auzhYLvVEeyr6avTgCRLkQ");
}
}

public  void setDetails(LogDetails details) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("details", details);
threadMonitoringController.enterService("_au3LwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_au4Z4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.details = details;
threadMonitoringController.exitInternalAction("_au4Z4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_au3LwLvVEeyr6avTgCRLkQ");
}
}

public  LogSeverity getSeverity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_au62ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_au8EQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
LogSeverity longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019335006918149960699193 = severity;
threadMonitoringController.exitInternalAction("_au8EQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019335006918149960699193;
}
finally {
threadMonitoringController.exitService("_au62ILvVEeyr6avTgCRLkQ");
}
}

public  String getTrace() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_au-ggLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_avAVsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019345008486776556730256 = trace;
threadMonitoringController.exitInternalAction("_avAVsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019345008486776556730256;
}
finally {
threadMonitoringController.exitService("_au-ggLvVEeyr6avTgCRLkQ");
}
}

public  String getInsertId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_avCx8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_avEnILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019356008549203588723637 = insertId;
threadMonitoringController.exitInternalAction("_avEnILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019356008549203588723637;
}
finally {
threadMonitoringController.exitService("_avCx8LvVEeyr6avTgCRLkQ");
}
}

public  Map<String, String> getResourceIdentifier() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_avGcULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_avHqcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130193670007565495163978486 = resourceIdentifier;
threadMonitoringController.exitInternalAction("_avHqcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130193670007565495163978486;
}
finally {
threadMonitoringController.exitService("_avGcULvVEeyr6avTgCRLkQ");
}
}

public  SourceLocation getSourceLocation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_avKGsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_avLU0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
SourceLocation longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019378006055053686015396 = sourceLocation;
threadMonitoringController.exitInternalAction("_avLU0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019378006055053686015396;
}
finally {
threadMonitoringController.exitService("_avKGsLvVEeyr6avTgCRLkQ");
}
}

public  long getTimestamp() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_avNxELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_avO_MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019387004744578734473818 = timestamp;
threadMonitoringController.exitInternalAction("_avO_MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019387004744578734473818;
}
finally {
threadMonitoringController.exitService("_avNxELvVEeyr6avTgCRLkQ");
}
}

public  String getMessage() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_avRbcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_avSpkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019396007686402554171508 = message;
threadMonitoringController.exitInternalAction("_avSpkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019396007686402554171508;
}
finally {
threadMonitoringController.exitService("_avRbcLvVEeyr6avTgCRLkQ");
}
}

public  LogDetails getDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_avVF0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_avWT8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
LogDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019406005232497180380142 = details;
threadMonitoringController.exitInternalAction("_avWT8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019406005232497180380142;
}
finally {
threadMonitoringController.exitService("_avVF0LvVEeyr6avTgCRLkQ");
}
}

}
