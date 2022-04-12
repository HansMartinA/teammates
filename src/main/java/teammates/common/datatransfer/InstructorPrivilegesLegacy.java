package teammates.common.datatransfer;

import java.util.LinkedHashMap;
import java.util.Map;
@Deprecated
public class InstructorPrivilegesLegacy {
private final Map<String, Boolean> courseLevel;

private final Map<String, Map<String, Boolean>> sectionLevel;

private final Map<String, Map<String, Map<String, Boolean>>> sessionLevel;

public  InstructorPrivilegesLegacy(){
this.courseLevel = new  LinkedHashMap<>();
this.sectionLevel = new  LinkedHashMap<>();
this.sessionLevel = new  LinkedHashMap<>();
}
public  Map<String, Boolean> getCourseLevel() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sMgcALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sMiRMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136805860017677763228290622 = courseLevel;
threadMonitoringController.exitInternalAction("_sMiRMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136805860017677763228290622;
}
finally {
threadMonitoringController.exitService("_sMgcALngEeyIw-dB1KCaVA");
}
}

public  Map<String, Map<String, Boolean>> getSectionLevel() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sMsCMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sMt3YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Map<String, Boolean>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680590009772478889666774 = sectionLevel;
threadMonitoringController.exitInternalAction("_sMt3YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680590009772478889666774;
}
finally {
threadMonitoringController.exitService("_sMsCMLngEeyIw-dB1KCaVA");
}
}

public  Map<String, Map<String, Map<String, Boolean>>> getSessionLevel() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sM6rsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sM9H8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Map<String, Map<String, Boolean>>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680593008878065716153287 = sessionLevel;
threadMonitoringController.exitInternalAction("_sM9H8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680593008878065716153287;
}
finally {
threadMonitoringController.exitService("_sM6rsLngEeyIw-dB1KCaVA");
}
}

}
