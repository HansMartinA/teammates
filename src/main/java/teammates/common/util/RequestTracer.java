package teammates.common.util;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import teammates.common.exception.DeadlineExceededException;
public final class RequestTracer {
private static final ThreadLocal<RequestTrace> THREAD_LOCAL = new  ThreadLocal<>();

private  RequestTracer(){
}
public static  String getTraceId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tUAPkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tUCEwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
RequestTrace trace = THREAD_LOCAL.get();
if (trace == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818880003240302883898538 = trace.traceId;
threadMonitoringController.exitInternalAction("_tUCEwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818880003240302883898538;
}
finally {
threadMonitoringController.exitService("_tUAPkLngEeyIw-dB1KCaVA");
}
}

public static  String getSpanId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tUOSALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tUR8YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
RequestTrace trace = THREAD_LOCAL.get();
if (trace == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681891008147916748271067 = trace.spanId;
threadMonitoringController.exitInternalAction("_tUR8YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681891008147916748271067;
}
finally {
threadMonitoringController.exitService("_tUOSALngEeyIw-dB1KCaVA");
}
}

private static  long getRemainingTimeMillis() {
RequestTrace trace = THREAD_LOCAL.get();
if (trace == null)
{
return 1L;
}
return trace.timeoutTimestamp - Instant.now().toEpochMilli();
}

public static  void checkRemainingTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tUsMELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tUwdhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
long remainingTime = getRemainingTimeMillis();
threadMonitoringController.exitInternalAction("_tUwdhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tUwdhbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (remainingTime < 0)
{
throw new  DeadlineExceededException();
}
threadMonitoringController.exitInternalAction("_tUwdhbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tUsMELngEeyIw-dB1KCaVA");
}
}

public static  long getTimeElapsedMillis() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tSdXcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tSfMoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
RequestTrace trace = THREAD_LOCAL.get();
if (trace == null)
{
return  - 1L;
}
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681885005595233484428612 = Instant.now().toEpochMilli() - trace.initTimestamp;
threadMonitoringController.exitInternalAction("_tSfMoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681885005595233484428612;
}
finally {
threadMonitoringController.exitService("_tSdXcLngEeyIw-dB1KCaVA");
}
}

public static  void init(String traceId, String spanId, int timeoutInSeconds) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("traceId", traceId);
monitoringServiceParameters.addValue("spanId", spanId);
monitoringServiceParameters.addValue("timeoutInSeconds", timeoutInSeconds);
threadMonitoringController.enterService("_tUy5wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tU1WALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
THREAD_LOCAL.set(new  RequestTrace(traceId, spanId, timeoutInSeconds));
threadMonitoringController.exitInternalAction("_tU1WALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tUy5wLngEeyIw-dB1KCaVA");
}
}

private static class RequestTrace {
private final String traceId;

private final String spanId;

private final long initTimestamp;

private final long timeoutTimestamp;

private  RequestTrace(String traceId, String spanId, int timeoutInSeconds){
this.traceId = traceId;
this.spanId = spanId;
this.initTimestamp = Instant.now().toEpochMilli();
this.timeoutTimestamp = Instant.now().plus(timeoutInSeconds, ChronoUnit.SECONDS).toEpochMilli();
}
}
}
