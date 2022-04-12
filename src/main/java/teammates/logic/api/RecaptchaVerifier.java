package teammates.logic.api;

import teammates.common.util.Config;
import teammates.logic.core.EmptyRecaptchaService;
import teammates.logic.core.GoogleRecaptchaService;
import teammates.logic.core.RecaptchaService;
public class RecaptchaVerifier {
private static final RecaptchaVerifier instance = new  RecaptchaVerifier();

private final RecaptchaService service;

 RecaptchaVerifier(){
if (Config.isDevServer())
{
service = new  EmptyRecaptchaService();
}
else
{
service = new  GoogleRecaptchaService(Config.CAPTCHA_SECRET_KEY);
}
}
public static  RecaptchaVerifier inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uUn_ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uUqbULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
RecaptchaVerifier longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682680008279861335622805 = instance;
threadMonitoringController.exitInternalAction("_uUqbULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682680008279861335622805;
}
finally {
threadMonitoringController.exitService("_uUn_ELngEeyIw-dB1KCaVA");
}
}

public  boolean isVerificationSuccessful(String captchaResponse) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("captchaResponse", captchaResponse);
threadMonitoringController.enterService("_uUuFsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uUwh8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368268300807860668422319 = service.isVerificationSuccessful(captchaResponse);
threadMonitoringController.exitInternalAction("_uUwh8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368268300807860668422319;
}
finally {
threadMonitoringController.exitService("_uUuFsLngEeyIw-dB1KCaVA");
}
}

}
