package teammates.common.exception;

public class SearchServiceException extends Exception {
private final int statusCode;

public  SearchServiceException(String message, Throwable cause, int statusCode){
super(message, cause);
this.statusCode = statusCode;
}
public  SearchServiceException(Throwable cause, int statusCode){
super(cause);
this.statusCode = statusCode;
}
public  SearchServiceException(String message, int statusCode){
super(message);
this.statusCode = statusCode;
}
public  int getStatusCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bc5WcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bc6kkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022399005978082996544403 = statusCode;
threadMonitoringController.exitInternalAction("_bc6kkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022399005978082996544403;
}
finally {
threadMonitoringController.exitService("_bc5WcLvVEeyr6avTgCRLkQ");
}
}

}
