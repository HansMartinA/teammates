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
threadMonitoringController.enterService("_b8n_YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b8pNgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023273009980569734239613 = queueName;
threadMonitoringController.exitInternalAction("_b8pNgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023273009980569734239613;
}
finally {
threadMonitoringController.exitService("_b8n_YLvVEeyr6avTgCRLkQ");
}
}

public  String getWorkerUrl() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_b8s34LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b8uGALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023284002016278557054978 = workerUrl;
threadMonitoringController.exitInternalAction("_b8uGALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023284002016278557054978;
}
finally {
threadMonitoringController.exitService("_b8s34LvVEeyr6avTgCRLkQ");
}
}

public  Map<String, String> getParamMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_b8xJULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b8y-gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023296004032922608062959 = paramMap;
threadMonitoringController.exitInternalAction("_b8y-gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023296004032922608062959;
}
finally {
threadMonitoringController.exitService("_b8xJULvVEeyr6avTgCRLkQ");
}
}

public  Object getRequestBody() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_b81awLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b83P8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Object longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130233090020716828908676965 = requestBody;
threadMonitoringController.exitInternalAction("_b83P8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130233090020716828908676965;
}
finally {
threadMonitoringController.exitService("_b81awLvVEeyr6avTgCRLkQ");
}
}

}
