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
threadMonitoringController.enterService("_a1fYMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a1gmULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301996700027629357598006332 = file;
threadMonitoringController.exitInternalAction("_a1gmULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301996700027629357598006332;
}
finally {
threadMonitoringController.exitService("_a1fYMLvVEeyr6avTgCRLkQ");
}
}

public  Long getLine() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a1jCkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a1kQsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130199770026418033073060143 = line;
threadMonitoringController.exitInternalAction("_a1kQsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130199770026418033073060143;
}
finally {
threadMonitoringController.exitService("_a1jCkLvVEeyr6avTgCRLkQ");
}
}

public  String getFunction() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a1mF4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a1nUALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019987006204765977829236 = function;
threadMonitoringController.exitInternalAction("_a1nUALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019987006204765977829236;
}
finally {
threadMonitoringController.exitService("_a1mF4LvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object obj) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("obj", obj);
threadMonitoringController.enterService("_a1qXULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a1rlcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (obj == this)
{
return true;
}
if (obj instanceof SourceLocation)
{
SourceLocation other = (SourceLocation) obj;
return file.equals(other.getFile()) && line.equals(other.getLine()) && function.equals(other.getFunction());
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019997005860223260754375 = false;
threadMonitoringController.exitInternalAction("_a1rlcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019997005860223260754375;
}
finally {
threadMonitoringController.exitService("_a1qXULvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a1xFALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a1yTILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130200090007376729955527661 = Objects.hash(file, line, function);
threadMonitoringController.exitInternalAction("_a1yTILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130200090007376729955527661;
}
finally {
threadMonitoringController.exitService("_a1xFALvVEeyr6avTgCRLkQ");
}
}

}
