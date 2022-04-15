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
threadMonitoringController.enterService("_c5URILvVEeyr6avTgCRLkQ", RecaptchaVerifier.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c5WtYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
RecaptchaVerifier longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026521007278498345429694 = instance;
threadMonitoringController.exitInternalAction("_c5WtYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026521007278498345429694;
}
finally {
threadMonitoringController.exitService("_c5URILvVEeyr6avTgCRLkQ");
}
}

public  boolean isVerificationSuccessful(String captchaResponse) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("captchaResponse", captchaResponse);
threadMonitoringController.enterService("_c5cM8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_c5f3ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026536002535368760591906 = service.isVerificationSuccessful(captchaResponse);
threadMonitoringController.exitInternalAction("_c5f3ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026536002535368760591906;
}
finally {
threadMonitoringController.exitService("_c5cM8LvVEeyr6avTgCRLkQ");
}
}

}
