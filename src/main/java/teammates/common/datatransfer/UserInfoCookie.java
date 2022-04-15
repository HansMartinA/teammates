package teammates.common.datatransfer;

import java.time.Instant;
import com.google.gson.JsonSyntaxException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Const;
import teammates.common.util.JsonUtils;
import teammates.common.util.StringHelper;
public class UserInfoCookie {
private String userId;

private String verificationCode;

private long expiryTime;

public  UserInfoCookie(String userId){
this.userId = userId;
this.verificationCode = StringHelper.generateSignature(userId);
this.expiryTime = Instant.now().plus(Const.COOKIE_VALIDITY_PERIOD).toEpochMilli();
}
public static  UserInfoCookie fromCookie(String cookie) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("cookie", cookie);
threadMonitoringController.enterService("_bZutsLvVEeyr6avTgCRLkQ", UserInfoCookie.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bZwi4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (cookie == null)
{
return null;
}
try {
String decryptedCookie = StringHelper.decrypt(cookie);
UserInfoCookie longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022243004211398597397715 = JsonUtils.fromJson(decryptedCookie, UserInfoCookie.class);
threadMonitoringController.exitInternalAction("_bZwi4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022243004211398597397715;
}
catch(InvalidParametersException | JsonSyntaxException e){
UserInfoCookie longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022243004121600814548151 = null;
threadMonitoringController.exitInternalAction("_bZwi4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022243004121600814548151;
}
}
finally {
threadMonitoringController.exitService("_bZutsLvVEeyr6avTgCRLkQ");
}
}

public  String getUserId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_baMAsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_baNO0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022255006622668815882455 = userId;
threadMonitoringController.exitInternalAction("_baNO0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022255006622668815882455;
}
finally {
threadMonitoringController.exitService("_baMAsLvVEeyr6avTgCRLkQ");
}
}

public  void setUserId(String userId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("userId", userId);
threadMonitoringController.enterService("_baPrELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_baRgQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.userId = userId;
threadMonitoringController.exitInternalAction("_baRgQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_baPrELvVEeyr6avTgCRLkQ");
}
}

public  String getVerificationCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_baT8gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_baVKoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130222790035000602728249197 = verificationCode;
threadMonitoringController.exitInternalAction("_baVKoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130222790035000602728249197;
}
finally {
threadMonitoringController.exitService("_baT8gLvVEeyr6avTgCRLkQ");
}
}

public  void setVerificationCode(String verificationCode) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("verificationCode", verificationCode);
threadMonitoringController.enterService("_baXm4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_baZcELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.verificationCode = verificationCode;
threadMonitoringController.exitInternalAction("_baZcELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_baXm4LvVEeyr6avTgCRLkQ");
}
}

public  long getExpiryTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bab4ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_badGcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022305005550659593350886 = expiryTime;
threadMonitoringController.exitInternalAction("_badGcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022305005550659593350886;
}
finally {
threadMonitoringController.exitService("_bab4ULvVEeyr6avTgCRLkQ");
}
}

public  void setExpiryTime(long expiryTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("expiryTime", expiryTime);
threadMonitoringController.enterService("_bafisLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bahX4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.expiryTime = expiryTime;
threadMonitoringController.exitInternalAction("_bahX4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bafisLvVEeyr6avTgCRLkQ");
}
}

public  boolean isValid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_baj0ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bawodLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130223340008661617574704628 = StringHelper.isCorrectSignature(userId, verificationCode) && Instant.now().isBefore(Instant.ofEpochMilli(expiryTime));
threadMonitoringController.exitInternalAction("_bawodLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_baxPgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022335004605020426366835 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130223340008661617574704628;
threadMonitoringController.exitInternalAction("_baxPgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022335004605020426366835;
}
finally {
threadMonitoringController.exitService("_baj0ILvVEeyr6avTgCRLkQ");
}
}

}
