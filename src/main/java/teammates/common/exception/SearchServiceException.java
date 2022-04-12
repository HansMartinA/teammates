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
threadMonitoringController.enterService("_s8NaoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s8PP0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368170700991144534862772 = statusCode;
threadMonitoringController.exitInternalAction("_s8PP0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368170700991144534862772;
}
finally {
threadMonitoringController.exitService("_s8NaoLngEeyIw-dB1KCaVA");
}
}

}
