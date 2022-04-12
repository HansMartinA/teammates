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
threadMonitoringController.enterService("_s7fB4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s7gQALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681701006415811263782497 = statusCode;
threadMonitoringController.exitInternalAction("_s7gQALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681701006415811263782497;
}
finally {
threadMonitoringController.exitService("_s7fB4LngEeyIw-dB1KCaVA");
}
}

}
