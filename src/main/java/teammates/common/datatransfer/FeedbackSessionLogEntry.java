package teammates.common.datatransfer;

public class FeedbackSessionLogEntry {
private final String studentEmail;

private final String feedbackSessionName;

private final String feedbackSessionLogType;

private final long timestamp;

public  FeedbackSessionLogEntry(String studentEmail, String feedbackSessionName, String feedbackSessionLogType, long timestamp){
this.studentEmail = studentEmail;
this.feedbackSessionName = feedbackSessionName;
this.feedbackSessionLogType = feedbackSessionLogType;
this.timestamp = timestamp;
}
public  String getStudentEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_akkAQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_akknULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018618006888167583003376 = studentEmail;
threadMonitoringController.exitInternalAction("_akknULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018618006888167583003376;
}
finally {
threadMonitoringController.exitService("_akkAQLvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_akl1cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aknDkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301862800012494583462085651 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_aknDkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301862800012494583462085651;
}
finally {
threadMonitoringController.exitService("_akl1cLvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackSessionLogType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_akoRsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_akpf0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018638008193707596965973 = this.feedbackSessionLogType;
threadMonitoringController.exitInternalAction("_akpf0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018638008193707596965973;
}
finally {
threadMonitoringController.exitService("_akoRsLvVEeyr6avTgCRLkQ");
}
}

public  long getTimestamp() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_akrVALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aksjILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018646006994985431387079 = this.timestamp;
threadMonitoringController.exitInternalAction("_aksjILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018646006994985431387079;
}
finally {
threadMonitoringController.exitService("_akrVALvVEeyr6avTgCRLkQ");
}
}

}
