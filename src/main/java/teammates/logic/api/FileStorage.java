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
threadMonitoringController.enterService("_t2B-kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t2DzwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FileStorage longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682257006148442009956544 = instance;
threadMonitoringController.exitInternalAction("_t2DzwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682257006148442009956544;
}
finally {
threadMonitoringController.exitService("_t2B-kLngEeyIw-dB1KCaVA");
}
}

public  boolean doesFileExist(String fileKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fileKey", fileKey);
threadMonitoringController.enterService("_t2HeILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t2J6YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682260008721213185166563 = service.doesFileExist(fileKey);
threadMonitoringController.exitInternalAction("_t2J6YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682260008721213185166563;
}
finally {
threadMonitoringController.exitService("_t2HeILngEeyIw-dB1KCaVA");
}
}

public  byte[]  getContent(String fileKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fileKey", fileKey);
threadMonitoringController.enterService("_t2NkwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t2QoELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
byte[]  longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682264002136136993250991 = service.getContent(fileKey);
threadMonitoringController.exitInternalAction("_t2QoELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682264002136136993250991;
}
finally {
threadMonitoringController.exitService("_t2NkwLngEeyIw-dB1KCaVA");
}
}

public  void delete(String fileKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fileKey", fileKey);
threadMonitoringController.enterService("_t2UScLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t2WHoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
service.delete(fileKey);
threadMonitoringController.exitInternalAction("_t2WHoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t2UScLngEeyIw-dB1KCaVA");
}
}

public  void create(String fileKey, byte[]  contentBytes, String contentType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fileKey", fileKey);
monitoringServiceParameters.addValue("contentBytes", contentBytes);
monitoringServiceParameters.addValue("contentType", contentType);
threadMonitoringController.enterService("_t2ZK8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t2eDcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
service.create(fileKey, contentBytes, contentType);
threadMonitoringController.exitInternalAction("_t2eDcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t2ZK8LngEeyIw-dB1KCaVA");
}
}

}
