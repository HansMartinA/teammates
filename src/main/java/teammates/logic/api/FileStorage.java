package teammates.logic.api;

import teammates.common.util.Config;
import teammates.logic.core.FileStorageService;
import teammates.logic.core.GoogleCloudStorageService;
import teammates.logic.core.LocalFileStorageService;
public class FileStorage {
private static final FileStorage instance = new  FileStorage();

private final FileStorageService service;

 FileStorage(){
if (Config.isDevServer())
{
service = new  LocalFileStorageService();
}
else
{
service = new  GoogleCloudStorageService();
}
}
public static  FileStorage inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_cbHSMLvVEeyr6avTgCRLkQ", FileStorage.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cbJHYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FileStorage longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130248870035104066980423554 = instance;
threadMonitoringController.exitInternalAction("_cbJHYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130248870035104066980423554;
}
finally {
threadMonitoringController.exitService("_cbHSMLvVEeyr6avTgCRLkQ");
}
}

public  boolean doesFileExist(String fileKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fileKey", fileKey);
threadMonitoringController.enterService("_cbMxwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cbP1ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130249000023219928987315497 = service.doesFileExist(fileKey);
threadMonitoringController.exitInternalAction("_cbP1ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130249000023219928987315497;
}
finally {
threadMonitoringController.exitService("_cbMxwLvVEeyr6avTgCRLkQ");
}
}

public  byte[]  getContent(String fileKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fileKey", fileKey);
threadMonitoringController.enterService("_cbUtkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cbXJ0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
byte[]  longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024912007018156750649883 = service.getContent(fileKey);
threadMonitoringController.exitInternalAction("_cbXJ0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024912007018156750649883;
}
finally {
threadMonitoringController.exitService("_cbUtkLvVEeyr6avTgCRLkQ");
}
}

public  void delete(String fileKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fileKey", fileKey);
threadMonitoringController.enterService("_cbaNILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cbcpYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
service.delete(fileKey);
threadMonitoringController.exitInternalAction("_cbcpYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cbaNILvVEeyr6avTgCRLkQ");
}
}

public  void create(String fileKey, byte[]  contentBytes, String contentType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fileKey", fileKey);
monitoringServiceParameters.addValue("contentBytes", contentBytes);
monitoringServiceParameters.addValue("contentType", contentType);
threadMonitoringController.enterService("_cbfssLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cbiwALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
service.create(fileKey, contentBytes, contentType);
threadMonitoringController.exitInternalAction("_cbiwALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_cbfssLvVEeyr6avTgCRLkQ");
}
}

}
