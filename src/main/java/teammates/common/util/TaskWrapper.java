package teammates.common.util;

import java.util.Map;
public class TaskWrapper {
private final String queueName;

private final String workerUrl;

private final Map<String, String> paramMap;

private final Object requestBody;

public  TaskWrapper(String queueName, String workerUrl, Map<String, String> paramMap, Object requestBody){
this.queueName = queueName;
this.workerUrl = workerUrl;
this.paramMap = paramMap;
this.requestBody = requestBody;
}
public  String getQueueName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tZdXULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tZelcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681919008716124523858615 = queueName;
threadMonitoringController.exitInternalAction("_tZelcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681919008716124523858615;
}
finally {
threadMonitoringController.exitService("_tZdXULngEeyIw-dB1KCaVA");
}
}

public  String getWorkerUrl() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tZiP0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tZkFALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681925008730047699623611 = workerUrl;
threadMonitoringController.exitInternalAction("_tZkFALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681925008730047699623611;
}
finally {
threadMonitoringController.exitService("_tZiP0LngEeyIw-dB1KCaVA");
}
}

public  Map<String, String> getParamMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tZmhQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tZnvYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681928009325132954941826 = paramMap;
threadMonitoringController.exitInternalAction("_tZnvYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681928009325132954941826;
}
finally {
threadMonitoringController.exitService("_tZmhQLngEeyIw-dB1KCaVA");
}
}

public  Object getRequestBody() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tZqysLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tZsA0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Object longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819310022605645618010473 = requestBody;
threadMonitoringController.exitInternalAction("_tZsA0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819310022605645618010473;
}
finally {
threadMonitoringController.exitService("_tZqysLngEeyIw-dB1KCaVA");
}
}

}
