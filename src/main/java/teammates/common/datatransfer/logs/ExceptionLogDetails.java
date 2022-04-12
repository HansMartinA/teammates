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
threadMonitoringController.enterService("_sPVtkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sPWUoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680635005655243863393761 = exceptionClass;
threadMonitoringController.exitInternalAction("_sPWUoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680635005655243863393761;
}
finally {
threadMonitoringController.exitService("_sPVtkLngEeyIw-dB1KCaVA");
}
}

public  void setExceptionClass(String exceptionClass) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("exceptionClass", exceptionClass);
threadMonitoringController.enterService("_sPYJ0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sPZX8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.exceptionClass = exceptionClass;
threadMonitoringController.exitInternalAction("_sPZX8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sPYJ0LngEeyIw-dB1KCaVA");
}
}

public  List<String> getExceptionClasses() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sPdpYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sPfekLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136806410006815917922537473 = exceptionClasses;
threadMonitoringController.exitInternalAction("_sPfekLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136806410006815917922537473;
}
finally {
threadMonitoringController.exitService("_sPdpYLngEeyIw-dB1KCaVA");
}
}

public  void setExceptionClasses(List<String> exceptionClasses) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("exceptionClasses", exceptionClasses);
threadMonitoringController.enterService("_sPjI8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sPk-ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.exceptionClasses = exceptionClasses;
threadMonitoringController.exitInternalAction("_sPk-ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sPjI8LngEeyIw-dB1KCaVA");
}
}

public  List<List<String>> getExceptionStackTraces() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sPoogLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sPqdsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<List<String>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680647006951377730739351 = exceptionStackTraces;
threadMonitoringController.exitInternalAction("_sPqdsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680647006951377730739351;
}
finally {
threadMonitoringController.exitService("_sPoogLngEeyIw-dB1KCaVA");
}
}

public  void setExceptionStackTraces(List<List<String>> exceptionStackTraces) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("exceptionStackTraces", exceptionStackTraces);
threadMonitoringController.enterService("_sPthALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sPwkULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.exceptionStackTraces = exceptionStackTraces;
threadMonitoringController.exitInternalAction("_sPwkULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sPthALngEeyIw-dB1KCaVA");
}
}

public  List<String> getExceptionMessages() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sPznoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sP1c0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136806510027674421163994 = exceptionMessages;
threadMonitoringController.exitInternalAction("_sP1c0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136806510027674421163994;
}
finally {
threadMonitoringController.exitService("_sPznoLngEeyIw-dB1KCaVA");
}
}

public  void setExceptionMessages(List<String> exceptionMessages) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("exceptionMessages", exceptionMessages);
threadMonitoringController.enterService("_sP5uQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sP7jcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.exceptionMessages = exceptionMessages;
threadMonitoringController.exitInternalAction("_sP7jcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sP5uQLngEeyIw-dB1KCaVA");
}
}

public  SourceLocation getLoggerSourceLocation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sP-mwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sP_04LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
SourceLocation longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680719006708348377700465 = loggerSourceLocation;
threadMonitoringController.exitInternalAction("_sP_04LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680719006708348377700465;
}
finally {
threadMonitoringController.exitService("_sP-mwLngEeyIw-dB1KCaVA");
}
}

public  void setLoggerSourceLocation(SourceLocation loggerSourceLocation) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("loggerSourceLocation", loggerSourceLocation);
threadMonitoringController.enterService("_sQCRILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sQDfQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.loggerSourceLocation = loggerSourceLocation;
threadMonitoringController.exitInternalAction("_sQDfQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sQCRILngEeyIw-dB1KCaVA");
}
}

@Override
public  void hideSensitiveInformation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sQF7gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sQHJoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
exceptionMessages = null;
threadMonitoringController.exitInternalAction("_sQHJoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
setMessage(null);
}
finally {
threadMonitoringController.exitService("_sQF7gLngEeyIw-dB1KCaVA");
}
}

}
