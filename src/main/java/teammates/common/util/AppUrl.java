package teammates.common.util;

public class AppUrl extends Url {
public  AppUrl(String url){
super(url);
assert url.startsWith("http");
}
public  AppUrl withUserId(String userId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("userId", userId);
threadMonitoringController.enterService("_bdEVkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bdJ1J7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022412008076492921920788 = withParam(Const.ParamsNames.USER_ID, userId);
threadMonitoringController.exitInternalAction("_bdJ1J7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022412008076492921920788;
}
finally {
threadMonitoringController.exitService("_bdEVkLvVEeyr6avTgCRLkQ");
}
}

public  AppUrl withRegistrationKey(String key) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("key", key);
threadMonitoringController.enterService("_Z8CAobvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z8CnsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015196005516064874369535 = withParam(Const.ParamsNames.REGKEY, key);
threadMonitoringController.exitInternalAction("_Z8CnsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015196005516064874369535;
}
finally {
threadMonitoringController.exitService("_Z8CAobvVEeyr6avTgCRLkQ");
}
}

public  AppUrl withIsCreatingAccount(String isCreatingAccount) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isCreatingAccount", isCreatingAccount);
threadMonitoringController.enterService("_Z8BZkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z8BZkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015189008325441663507382 = withParam(Const.ParamsNames.IS_CREATING_ACCOUNT, isCreatingAccount);
threadMonitoringController.exitInternalAction("_Z8BZkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015189008325441663507382;
}
finally {
threadMonitoringController.exitService("_Z8BZkLvVEeyr6avTgCRLkQ");
}
}

public  AppUrl withCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_bdMRYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bdSYB7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022425005999598067549234 = withParam(Const.ParamsNames.COURSE_ID, courseId);
threadMonitoringController.exitInternalAction("_bdSYB7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022425005999598067549234;
}
finally {
threadMonitoringController.exitService("_bdMRYLvVEeyr6avTgCRLkQ");
}
}

public  AppUrl withSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_bdU0QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bdaT17vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130224360026325087577802564 = withParam(Const.ParamsNames.FEEDBACK_SESSION_NAME, feedbackSessionName);
threadMonitoringController.exitInternalAction("_bdaT17vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130224360026325087577802564;
}
finally {
threadMonitoringController.exitService("_bdU0QLvVEeyr6avTgCRLkQ");
}
}

public  AppUrl withStudentEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_bdcwELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bdi2tLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022448009769133248294322 = withParam(Const.ParamsNames.STUDENT_EMAIL, email);
threadMonitoringController.exitInternalAction("_bdi2tLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022448009769133248294322;
}
finally {
threadMonitoringController.exitService("_bdcwELvVEeyr6avTgCRLkQ");
}
}

public  AppUrl withEntityType(String entityType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("entityType", entityType);
threadMonitoringController.enterService("_aV7uYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aV-KqbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017742006992949151360395 = withParam(Const.ParamsNames.ENTITY_TYPE, entityType);
threadMonitoringController.exitInternalAction("_aV-KqbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017742006992949151360395;
}
finally {
threadMonitoringController.exitService("_aV7uYLvVEeyr6avTgCRLkQ");
}
}

}
