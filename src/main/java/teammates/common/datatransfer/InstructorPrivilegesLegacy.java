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
threadMonitoringController.enterService("_apHwILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_apI-QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018967008906610766844267 = courseLevel;
threadMonitoringController.exitInternalAction("_apI-QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018967008906610766844267;
}
finally {
threadMonitoringController.exitService("_apHwILvVEeyr6avTgCRLkQ");
}
}

public  Map<String, Map<String, Boolean>> getSectionLevel() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_apN2wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_apOd0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Map<String, Boolean>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130189760038218646714631754 = sectionLevel;
threadMonitoringController.exitInternalAction("_apOd0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130189760038218646714631754;
}
finally {
threadMonitoringController.exitService("_apN2wLvVEeyr6avTgCRLkQ");
}
}

public  Map<String, Map<String, Map<String, Boolean>>> getSessionLevel() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_apUkcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_apVykLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Map<String, Map<String, Boolean>>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301898500192982667112076 = sessionLevel;
threadMonitoringController.exitInternalAction("_apVykLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301898500192982667112076;
}
finally {
threadMonitoringController.exitService("_apUkcLvVEeyr6avTgCRLkQ");
}
}

}
