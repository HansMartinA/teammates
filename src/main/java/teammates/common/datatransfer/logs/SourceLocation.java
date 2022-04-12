package teammates.common.datatransfer.logs;

import java.util.Objects;
public class SourceLocation {
private final String file;

private final Long line;

private final String function;

public  SourceLocation(String file, Long line, String function){
this.file = file;
this.line = line;
this.function = function;
}
public  String getFile() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sXC4ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sXEGMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681014006892207071957962 = file;
threadMonitoringController.exitInternalAction("_sXEGMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681014006892207071957962;
}
finally {
threadMonitoringController.exitService("_sXC4ELngEeyIw-dB1KCaVA");
}
}

public  Long getLine() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sXF7YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sXHJgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810170021660010274086117 = line;
threadMonitoringController.exitInternalAction("_sXHJgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810170021660010274086117;
}
finally {
threadMonitoringController.exitService("_sXF7YLngEeyIw-dB1KCaVA");
}
}

public  String getFunction() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sXI-sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sXKM0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681020001271249806973882 = function;
threadMonitoringController.exitInternalAction("_sXKM0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681020001271249806973882;
}
finally {
threadMonitoringController.exitService("_sXI-sLngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object obj) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("obj", obj);
threadMonitoringController.enterService("_sXMCALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sXMpELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (obj == this)
{
return true;
}
if (obj instanceof SourceLocation)
{
SourceLocation other = (SourceLocation) obj;
return file.equals(other.getFile()) && line.equals(other.getLine()) && function.equals(other.getFunction());
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681025006808911189882414 = false;
threadMonitoringController.exitInternalAction("_sXMpELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681025006808911189882414;
}
finally {
threadMonitoringController.exitService("_sXMCALngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sXQ6gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sXSIoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681028005886024659458864 = Objects.hash(file, line, function);
threadMonitoringController.exitInternalAction("_sXSIoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681028005886024659458864;
}
finally {
threadMonitoringController.exitService("_sXQ6gLngEeyIw-dB1KCaVA");
}
}

}
