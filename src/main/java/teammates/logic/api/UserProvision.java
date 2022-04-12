package teammates.logic.api;

import teammates.common.datatransfer.UserInfo;
import teammates.common.datatransfer.UserInfoCookie;
import teammates.common.util.Config;
import teammates.logic.core.AccountsLogic;
import teammates.logic.core.StudentsLogic;
public class UserProvision {
private static final UserProvision instance = new  UserProvision();

private final AccountsLogic accountsLogic = AccountsLogic.inst();

private final StudentsLogic studentsLogic = StudentsLogic.inst();

 UserProvision(){
}
public static  UserProvision inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uZvvoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uZxk0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UserProvision longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682748008297151523268084 = instance;
threadMonitoringController.exitInternalAction("_uZxk0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682748008297151523268084;
}
finally {
threadMonitoringController.exitService("_uZvvoLngEeyIw-dB1KCaVA");
}
}

public  UserInfo getCurrentUser(UserInfoCookie uic) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("uic", uic);
threadMonitoringController.enterService("_uZ0oILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uZ45lbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UserInfo user = getCurrentLoggedInUser(uic);
threadMonitoringController.exitInternalAction("_uZ45lbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uZ5goLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (user == null)
{
return null;
}
String userId = user.id;
user.isAdmin = Config.APP_ADMINS.contains(userId);
user.isInstructor = accountsLogic.isAccountAnInstructor(userId);
user.isStudent = studentsLogic.isStudentInAnyCourse(userId);
threadMonitoringController.exitInternalAction("_uZ5goLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uZ784LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uZ8j8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
user.isMaintainer = Config.APP_MAINTAINERS.contains(user.getId());
UserInfo longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136827560017363469358908634 = user;
threadMonitoringController.exitInternalAction("_uZ8j8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136827560017363469358908634;
}
finally {
threadMonitoringController.exitService("_uZ0oILngEeyIw-dB1KCaVA");
}
}

 UserInfo getCurrentLoggedInUser(UserInfoCookie uic) {
if (uic == null || !uic.isValid())
{
return null;
}
return new  UserInfo(uic.getUserId());
}

public  UserInfo getMasqueradeUser(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_uaCqkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uaEfwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UserInfo userInfo = new  UserInfo(googleId);
userInfo.isAdmin = false;
userInfo.isInstructor = accountsLogic.isAccountAnInstructor(googleId);
userInfo.isStudent = studentsLogic.isStudentInAnyCourse(googleId);
userInfo.isMaintainer = Config.APP_MAINTAINERS.contains(googleId);
UserInfo longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682760004114885415060625 = userInfo;
threadMonitoringController.exitInternalAction("_uaEfwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682760004114885415060625;
}
finally {
threadMonitoringController.exitService("_uaCqkLngEeyIw-dB1KCaVA");
}
}

public  UserInfo getAdminOnlyUser(String userId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("userId", userId);
threadMonitoringController.enterService("_uaJYQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uaL0gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UserInfo userInfo = new  UserInfo(userId);
userInfo.isAdmin = true;
UserInfo longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368276200747127852674988 = userInfo;
threadMonitoringController.exitInternalAction("_uaL0gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368276200747127852674988;
}
finally {
threadMonitoringController.exitService("_uaJYQLngEeyIw-dB1KCaVA");
}
}

}
