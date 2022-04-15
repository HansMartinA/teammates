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
threadMonitoringController.enterService("_c-zOELvVEeyr6avTgCRLkQ", UserProvision.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c-1qULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UserProvision longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130268350016662911360634858 = instance;
threadMonitoringController.exitInternalAction("_c-1qULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130268350016662911360634858;
}
finally {
threadMonitoringController.exitService("_c-zOELvVEeyr6avTgCRLkQ");
}
}

public  UserInfo getCurrentUser(UserInfoCookie uic) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("uic", uic);
threadMonitoringController.enterService("_c-57wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c-_bUbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UserInfo user = getCurrentLoggedInUser(uic);
threadMonitoringController.exitInternalAction("_c-_bUbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_c-_bUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (user == null)
{
return null;
}
String userId = user.id;
user.isAdmin = Config.APP_ADMINS.contains(userId);
user.isInstructor = accountsLogic.isAccountAnInstructor(userId);
user.isStudent = studentsLogic.isStudentInAnyCourse(userId);
threadMonitoringController.exitInternalAction("_c-_bUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_c_CeoLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_c_DFsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
user.isMaintainer = Config.APP_MAINTAINERS.contains(user.getId());
UserInfo longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026872005927440221807055 = user;
threadMonitoringController.exitInternalAction("_c_DFsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026872005927440221807055;
}
finally {
threadMonitoringController.exitService("_c-57wLvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_c_JMULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c_LokLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UserInfo userInfo = new  UserInfo(googleId);
userInfo.isAdmin = false;
userInfo.isInstructor = accountsLogic.isAccountAnInstructor(googleId);
userInfo.isStudent = studentsLogic.isStudentInAnyCourse(googleId);
userInfo.isMaintainer = Config.APP_MAINTAINERS.contains(googleId);
UserInfo longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026896008393175171568708 = userInfo;
threadMonitoringController.exitInternalAction("_c_LokLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026896008393175171568708;
}
finally {
threadMonitoringController.exitService("_c_JMULvVEeyr6avTgCRLkQ");
}
}

public  UserInfo getAdminOnlyUser(String userId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("userId", userId);
threadMonitoringController.enterService("_c_RIILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c_TkYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UserInfo userInfo = new  UserInfo(userId);
userInfo.isAdmin = true;
UserInfo longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130269160024450493077994717 = userInfo;
threadMonitoringController.exitInternalAction("_c_TkYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130269160024450493077994717;
}
finally {
threadMonitoringController.exitService("_c_RIILvVEeyr6avTgCRLkQ");
}
}

}
