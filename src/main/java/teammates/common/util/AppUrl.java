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
threadMonitoringController.enterService("_s8YZwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s8d5V7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681710004790685428256587 = withParam(Const.ParamsNames.USER_ID, userId);
threadMonitoringController.exitInternalAction("_s8d5V7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681710004790685428256587;
}
finally {
threadMonitoringController.exitService("_s8YZwLngEeyIw-dB1KCaVA");
}
}

public  AppUrl withRegistrationKey(String key) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("key", key);
threadMonitoringController.enterService("_ri76kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ri76kbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679067002759166979089941 = withParam(Const.ParamsNames.REGKEY, key);
threadMonitoringController.exitInternalAction("_ri76kbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679067002759166979089941;
}
finally {
threadMonitoringController.exitService("_ri76kLngEeyIw-dB1KCaVA");
}
}

public  AppUrl withIsCreatingAccount(String isCreatingAccount) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isCreatingAccount", isCreatingAccount);
threadMonitoringController.enterService("_ri6FYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ri6scLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790640042940434930058724 = withParam(Const.ParamsNames.IS_CREATING_ACCOUNT, isCreatingAccount);
threadMonitoringController.exitInternalAction("_ri6scLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790640042940434930058724;
}
finally {
threadMonitoringController.exitService("_ri6FYLngEeyIw-dB1KCaVA");
}
}

public  AppUrl withCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_s8gVkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s8mcMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681713005472335284780283 = withParam(Const.ParamsNames.COURSE_ID, courseId);
threadMonitoringController.exitInternalAction("_s8mcMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681713005472335284780283;
}
finally {
threadMonitoringController.exitService("_s8gVkLngEeyIw-dB1KCaVA");
}
}

public  AppUrl withSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_s8o4cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s8tw97ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681715008575880702436844 = withParam(Const.ParamsNames.FEEDBACK_SESSION_NAME, feedbackSessionName);
threadMonitoringController.exitInternalAction("_s8tw97ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681715008575880702436844;
}
finally {
threadMonitoringController.exitService("_s8o4cLngEeyIw-dB1KCaVA");
}
}

public  AppUrl withStudentEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_s8w0QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s82T17ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681718003708099385531157 = withParam(Const.ParamsNames.STUDENT_EMAIL, email);
threadMonitoringController.exitInternalAction("_s82T17ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681718003708099385531157;
}
finally {
threadMonitoringController.exitService("_s8w0QLngEeyIw-dB1KCaVA");
}
}

public  AppUrl withEntityType(String entityType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("entityType", entityType);
threadMonitoringController.enterService("_r5YrsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r5bH97ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680117007038814421468008 = withParam(Const.ParamsNames.ENTITY_TYPE, entityType);
threadMonitoringController.exitInternalAction("_r5bH97ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680117007038814421468008;
}
finally {
threadMonitoringController.exitService("_r5YrsLngEeyIw-dB1KCaVA");
}
}

}
