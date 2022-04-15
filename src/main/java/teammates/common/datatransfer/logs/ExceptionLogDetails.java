package teammates.common.datatransfer.logs;

import java.util.List;
import javax.annotation.Nullable;
public class ExceptionLogDetails extends LogDetails {
private String exceptionClass;

private List<String> exceptionClasses;

private List<List<String>> exceptionStackTraces;

@Nullable
private List<String> exceptionMessages;

private SourceLocation loggerSourceLocation;

public  ExceptionLogDetails(){
super(LogEvent.EXCEPTION_LOG);
}
public  String getExceptionClass() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_asqzYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_assBgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019130005721300161340781 = exceptionClass;
threadMonitoringController.exitInternalAction("_assBgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019130005721300161340781;
}
finally {
threadMonitoringController.exitService("_asqzYLvVEeyr6avTgCRLkQ");
}
}

public  void setExceptionClass(String exceptionClass) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("exceptionClass", exceptionClass);
threadMonitoringController.enterService("_ast2sLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_asvE0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.exceptionClass = exceptionClass;
threadMonitoringController.exitInternalAction("_asvE0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ast2sLvVEeyr6avTgCRLkQ");
}
}

public  List<String> getExceptionClasses() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_asw6ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_asyIILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130191490038069811019297983 = exceptionClasses;
threadMonitoringController.exitInternalAction("_asyIILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130191490038069811019297983;
}
finally {
threadMonitoringController.exitService("_asw6ALvVEeyr6avTgCRLkQ");
}
}

public  void setExceptionClasses(List<String> exceptionClasses) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("exceptionClasses", exceptionClasses);
threadMonitoringController.enterService("_asz9ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_as0kYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.exceptionClasses = exceptionClasses;
threadMonitoringController.exitInternalAction("_as0kYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_asz9ULvVEeyr6avTgCRLkQ");
}
}

public  List<List<String>> getExceptionStackTraces() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_as2ZkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_as3nsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<List<String>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130191670026092505184649295 = exceptionStackTraces;
threadMonitoringController.exitInternalAction("_as3nsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130191670026092505184649295;
}
finally {
threadMonitoringController.exitService("_as2ZkLvVEeyr6avTgCRLkQ");
}
}

public  void setExceptionStackTraces(List<List<String>> exceptionStackTraces) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("exceptionStackTraces", exceptionStackTraces);
threadMonitoringController.enterService("_as5c4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_as6rALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.exceptionStackTraces = exceptionStackTraces;
threadMonitoringController.exitInternalAction("_as6rALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_as5c4LvVEeyr6avTgCRLkQ");
}
}

public  List<String> getExceptionMessages() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_as8gMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_as9uULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130191860002643836115575937 = exceptionMessages;
threadMonitoringController.exitInternalAction("_as9uULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130191860002643836115575937;
}
finally {
threadMonitoringController.exitService("_as8gMLvVEeyr6avTgCRLkQ");
}
}

public  void setExceptionMessages(List<String> exceptionMessages) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("exceptionMessages", exceptionMessages);
threadMonitoringController.enterService("_as-8cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_atAKkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.exceptionMessages = exceptionMessages;
threadMonitoringController.exitInternalAction("_atAKkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_as-8cLvVEeyr6avTgCRLkQ");
}
}

public  SourceLocation getLoggerSourceLocation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_atB_wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_atDN4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
SourceLocation longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019206003217222582185638 = loggerSourceLocation;
threadMonitoringController.exitInternalAction("_atDN4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019206003217222582185638;
}
finally {
threadMonitoringController.exitService("_atB_wLvVEeyr6avTgCRLkQ");
}
}

public  void setLoggerSourceLocation(SourceLocation loggerSourceLocation) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("loggerSourceLocation", loggerSourceLocation);
threadMonitoringController.enterService("_atFDELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_atFqILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.loggerSourceLocation = loggerSourceLocation;
threadMonitoringController.exitInternalAction("_atFqILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_atFDELvVEeyr6avTgCRLkQ");
}
}

@Override
public  void hideSensitiveInformation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_atHfULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_atItcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
exceptionMessages = null;
threadMonitoringController.exitInternalAction("_atItcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
setMessage(null);
}
finally {
threadMonitoringController.exitService("_atHfULvVEeyr6avTgCRLkQ");
}
}

}
