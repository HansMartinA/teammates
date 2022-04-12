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
threadMonitoringController.enterService("_s-ggsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s-i88LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InputStream longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681749009295065020968435 = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
threadMonitoringController.exitInternalAction("_s-i88LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681749009295065020968435;
}
finally {
threadMonitoringController.exitService("_s-ggsLngEeyIw-dB1KCaVA");
}
}

public static  String readResourceFile(String file) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("file", file);
threadMonitoringController.enterService("_tIN2ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tIPrgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
try(Scanner scanner = new  Scanner(getResourceAsStream(file), Const.ENCODING)) {
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681831009931364592947601 = scanner.useDelimiter("\\Z").next();
threadMonitoringController.exitInternalAction("_tIPrgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681831009931364592947601;
}
}
finally {
threadMonitoringController.exitService("_tIN2ULngEeyIw-dB1KCaVA");
}
}

}
