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
threadMonitoringController.enterService("_c3fFILvVEeyr6avTgCRLkQ", LogsProcessor.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c3ivgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
LogsProcessor longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302644200437032286147538 = instance;
threadMonitoringController.exitInternalAction("_c3ivgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302644200437032286147538;
}
finally {
threadMonitoringController.exitService("_c3fFILvVEeyr6avTgCRLkQ");
}
}

public  List<ErrorLogEntry> getRecentErrorLogs() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_c3ly0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c3oPELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<ErrorLogEntry> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026457009446322085073803 = service.getRecentErrorLogs();
threadMonitoringController.exitInternalAction("_c3oPELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026457009446322085073803;
}
finally {
threadMonitoringController.exitService("_c3ly0LvVEeyr6avTgCRLkQ");
}
}

public  QueryLogsResults queryLogs(QueryLogsParams queryLogsParams) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryLogsParams", queryLogsParams);
threadMonitoringController.enterService("_c3r5cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c3vj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
QueryLogsResults longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302647000023956416409465997 = service.queryLogs(queryLogsParams);
threadMonitoringController.exitInternalAction("_c3vj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302647000023956416409465997;
}
finally {
threadMonitoringController.exitService("_c3r5cLvVEeyr6avTgCRLkQ");
}
}

public  void createFeedbackSessionLog(String courseId, String email, String fsName, String fslType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("fsName", fsName);
monitoringServiceParameters.addValue("fslType", fslType);
threadMonitoringController.enterService("_c3ynILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c3574LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
service.createFeedbackSessionLog(courseId, email, fsName, fslType);
threadMonitoringController.exitInternalAction("_c3574LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_c3ynILvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_c4BQoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c4Ds4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionLogEntry> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026502003978688298174098 = service.getFeedbackSessionLogs(courseId, email, startTime, endTime, fsName);
threadMonitoringController.exitInternalAction("_c4Ds4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026502003978688298174098;
}
finally {
threadMonitoringController.exitService("_c4BQoLvVEeyr6avTgCRLkQ");
}
}

}
