package teammates.common.exception;

public class EmailSendingException extends Exception {
private final int statusCode;

public  EmailSendingException(Throwable cause, int statusCode){
super(cause);
this.statusCode = statusCode;
}
public  int getStatusCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bcDB4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bcEQALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022378005524665623520283 = statusCode;
threadMonitoringController.exitInternalAction("_bcEQALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022378005524665623520283;
}
finally {
threadMonitoringController.exitService("_bcDB4LvVEeyr6avTgCRLkQ");
}
}

}
