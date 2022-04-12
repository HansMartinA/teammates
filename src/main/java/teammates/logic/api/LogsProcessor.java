package teammates.logic.api;

import java.util.List;
import teammates.common.datatransfer.ErrorLogEntry;
import teammates.common.datatransfer.FeedbackSessionLogEntry;
import teammates.common.datatransfer.QueryLogsResults;
import teammates.common.datatransfer.logs.QueryLogsParams;
import teammates.common.util.Config;
import teammates.logic.core.GoogleCloudLoggingService;
import teammates.logic.core.LocalLoggingService;
import teammates.logic.core.LogService;
public class LogsProcessor {
private static final LogsProcessor instance = new  LogsProcessor();

private final LogService service;

 LogsProcessor(){
if (Config.isDevServer())
{
service = new  LocalLoggingService();
}
else
{
service = new  GoogleCloudLoggingService();
}
}
public static  LogsProcessor inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uSobALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uStTgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
LogsProcessor longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682664006119784237698179 = instance;
threadMonitoringController.exitInternalAction("_uStTgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682664006119784237698179;
}
finally {
threadMonitoringController.exitService("_uSobALngEeyIw-dB1KCaVA");
}
}

public  List<ErrorLogEntry> getRecentErrorLogs() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uS0oQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uS5gwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<ErrorLogEntry> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368266600576869222136129 = service.getRecentErrorLogs();
threadMonitoringController.exitInternalAction("_uS5gwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368266600576869222136129;
}
finally {
threadMonitoringController.exitService("_uS0oQLngEeyIw-dB1KCaVA");
}
}

public  QueryLogsResults queryLogs(QueryLogsParams queryLogsParams) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryLogsParams", queryLogsParams);
threadMonitoringController.enterService("_uS_nYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uTCqsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
QueryLogsResults longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682668003028015464436862 = service.queryLogs(queryLogsParams);
threadMonitoringController.exitInternalAction("_uTCqsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682668003028015464436862;
}
finally {
threadMonitoringController.exitService("_uS_nYLngEeyIw-dB1KCaVA");
}
}

public  void createFeedbackSessionLog(String courseId, String email, String fsName, String fslType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("fsName", fsName);
monitoringServiceParameters.addValue("fslType", fslType);
threadMonitoringController.enterService("_uTFuALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uTIKQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
service.createFeedbackSessionLog(courseId, email, fsName, fslType);
threadMonitoringController.exitInternalAction("_uTIKQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uTFuALngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionLogEntry> getFeedbackSessionLogs(String courseId, String email, long startTime, long endTime, String fsName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("startTime", startTime);
monitoringServiceParameters.addValue("endTime", endTime);
monitoringServiceParameters.addValue("fsName", fsName);
threadMonitoringController.enterService("_uTLNkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uTOQ4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionLogEntry> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368267700811334868624795 = service.getFeedbackSessionLogs(courseId, email, startTime, endTime, fsName);
threadMonitoringController.exitInternalAction("_uTOQ4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368267700811334868624795;
}
finally {
threadMonitoringController.exitService("_uTLNkLngEeyIw-dB1KCaVA");
}
}

}
