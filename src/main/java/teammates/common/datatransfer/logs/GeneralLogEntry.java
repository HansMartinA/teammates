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
threadMonitoringController.enterService("_sRRnQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRS1YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.message = message;
threadMonitoringController.exitInternalAction("_sRS1YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sRRnQLngEeyIw-dB1KCaVA");
}
}

public  void setDetails(LogDetails details) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("details", details);
threadMonitoringController.enterService("_sRUqkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRV4sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.details = details;
threadMonitoringController.exitInternalAction("_sRV4sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sRUqkLngEeyIw-dB1KCaVA");
}
}

public  LogSeverity getSeverity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sRXt4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRY8ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
LogSeverity longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680763006383695241617436 = severity;
threadMonitoringController.exitInternalAction("_sRY8ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680763006383695241617436;
}
finally {
threadMonitoringController.exitService("_sRXt4LngEeyIw-dB1KCaVA");
}
}

public  String getTrace() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sRaKILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRbYQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136807660046399835827162583 = trace;
threadMonitoringController.exitInternalAction("_sRbYQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136807660046399835827162583;
}
finally {
threadMonitoringController.exitService("_sRaKILngEeyIw-dB1KCaVA");
}
}

public  String getInsertId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sRcmYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRd0gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136807700044729371151339614 = insertId;
threadMonitoringController.exitInternalAction("_sRd0gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136807700044729371151339614;
}
finally {
threadMonitoringController.exitService("_sRcmYLngEeyIw-dB1KCaVA");
}
}

public  Map<String, String> getResourceIdentifier() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sRgQwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRhe4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136807740010696796339016867 = resourceIdentifier;
threadMonitoringController.exitInternalAction("_sRhe4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136807740010696796339016867;
}
finally {
threadMonitoringController.exitService("_sRgQwLngEeyIw-dB1KCaVA");
}
}

public  SourceLocation getSourceLocation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sRjUELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRkiMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
SourceLocation longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680779009530087781464581 = sourceLocation;
threadMonitoringController.exitInternalAction("_sRkiMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680779009530087781464581;
}
finally {
threadMonitoringController.exitService("_sRjUELngEeyIw-dB1KCaVA");
}
}

public  long getTimestamp() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sRlwULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRm-cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136807830024444853381641662 = timestamp;
threadMonitoringController.exitInternalAction("_sRm-cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136807830024444853381641662;
}
finally {
threadMonitoringController.exitService("_sRlwULngEeyIw-dB1KCaVA");
}
}

public  String getMessage() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sRoMkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRpasLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368078500644270855399486 = message;
threadMonitoringController.exitInternalAction("_sRpasLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368078500644270855399486;
}
finally {
threadMonitoringController.exitService("_sRoMkLngEeyIw-dB1KCaVA");
}
}

public  LogDetails getDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sRrP4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sRseALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
LogDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680789003002105391343993 = details;
threadMonitoringController.exitInternalAction("_sRseALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680789003002105391343993;
}
finally {
threadMonitoringController.exitService("_sRrP4LngEeyIw-dB1KCaVA");
}
}

}
