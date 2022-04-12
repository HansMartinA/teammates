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
threadMonitoringController.enterService("_s5O_ILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s5RbYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (cookie == null)
{
return null;
}
try {
String decryptedCookie = StringHelper.decrypt(cookie);
UserInfoCookie longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368167100905971971314554 = JsonUtils.fromJson(decryptedCookie, UserInfoCookie.class);
threadMonitoringController.exitInternalAction("_s5RbYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368167100905971971314554;
}
catch(InvalidParametersException | JsonSyntaxException e){
UserInfoCookie longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816710021091551177811407 = null;
threadMonitoringController.exitInternalAction("_s5RbYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816710021091551177811407;
}
}
finally {
threadMonitoringController.exitService("_s5O_ILngEeyIw-dB1KCaVA");
}
}

public  String getUserId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s5pO0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s5qc8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368167500010101926112287107 = userId;
threadMonitoringController.exitInternalAction("_s5qc8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368167500010101926112287107;
}
finally {
threadMonitoringController.exitService("_s5pO0LngEeyIw-dB1KCaVA");
}
}

public  void setUserId(String userId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("userId", userId);
threadMonitoringController.enterService("_s5sSILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s5uHULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.userId = userId;
threadMonitoringController.exitInternalAction("_s5uHULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_s5sSILngEeyIw-dB1KCaVA");
}
}

public  String getVerificationCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s5wjkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s5xxsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681681006322074031367799 = verificationCode;
threadMonitoringController.exitInternalAction("_s5xxsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681681006322074031367799;
}
finally {
threadMonitoringController.exitService("_s5wjkLngEeyIw-dB1KCaVA");
}
}

public  void setVerificationCode(String verificationCode) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("verificationCode", verificationCode);
threadMonitoringController.enterService("_s50N8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s51cELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.verificationCode = verificationCode;
threadMonitoringController.exitInternalAction("_s51cELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_s50N8LngEeyIw-dB1KCaVA");
}
}

public  long getExpiryTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s54fYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s56UkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681685006698850092729444 = expiryTime;
threadMonitoringController.exitInternalAction("_s56UkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681685006698850092729444;
}
finally {
threadMonitoringController.exitService("_s54fYLngEeyIw-dB1KCaVA");
}
}

public  void setExpiryTime(long expiryTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("expiryTime", expiryTime);
threadMonitoringController.enterService("_s58w0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s59-8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.expiryTime = expiryTime;
threadMonitoringController.exitInternalAction("_s59-8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_s58w0LngEeyIw-dB1KCaVA");
}
}

public  boolean isValid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s6AbMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s6PrwrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681692005907094235010407 = StringHelper.isCorrectSignature(userId, verificationCode) && Instant.now().isBefore(Instant.ofEpochMilli(expiryTime));
threadMonitoringController.exitInternalAction("_s6PrwrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_s6Prw7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681692001935449504266854 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681692005907094235010407;
threadMonitoringController.exitInternalAction("_s6Prw7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681692001935449504266854;
}
finally {
threadMonitoringController.exitService("_s6AbMLngEeyIw-dB1KCaVA");
}
}

}
