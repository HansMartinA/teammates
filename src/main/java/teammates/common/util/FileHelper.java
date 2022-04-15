package teammates.common.util;

import java.io.InputStream;
import java.util.Scanner;
public final class FileHelper {
private  FileHelper(){
}
public static  InputStream getResourceAsStream(String file) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("file", file);
threadMonitoringController.enterService("_bfMcgLvVEeyr6avTgCRLkQ", FileHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bfPf0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InputStream longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022556004994023921156018 = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
threadMonitoringController.exitInternalAction("_bfPf0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022556004994023921156018;
}
finally {
threadMonitoringController.exitService("_bfMcgLvVEeyr6avTgCRLkQ");
}
}

public static  String readResourceFile(String file) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("file", file);
threadMonitoringController.enterService("_bpwtwLvVEeyr6avTgCRLkQ", FileHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bpzxELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
try(Scanner scanner = new  Scanner(getResourceAsStream(file), Const.ENCODING)) {
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022892009641829920378361 = scanner.useDelimiter("\\Z").next();
threadMonitoringController.exitInternalAction("_bpzxELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022892009641829920378361;
}
}
finally {
threadMonitoringController.exitService("_bpwtwLvVEeyr6avTgCRLkQ");
}
}

}
