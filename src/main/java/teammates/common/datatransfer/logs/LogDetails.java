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
threadMonitoringController.enterService("_awVLYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_awWZgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
LogEvent longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130194590047100137245756935 = event;
threadMonitoringController.exitInternalAction("_awWZgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130194590047100137245756935;
}
finally {
threadMonitoringController.exitService("_awVLYLvVEeyr6avTgCRLkQ");
}
}

public  String getMessage() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_awY1wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_awaq8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019469007386508118338209 = message;
threadMonitoringController.exitInternalAction("_awaq8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019469007386508118338209;
}
finally {
threadMonitoringController.exitService("_awY1wLvVEeyr6avTgCRLkQ");
}
}

public  void setMessage(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_aq7G8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aq8VELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.message = message;
threadMonitoringController.exitInternalAction("_aq8VELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aq7G8LvVEeyr6avTgCRLkQ");
}
}

public abstract  void hideSensitiveInformation() ;

}
