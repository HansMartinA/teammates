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
threadMonitoringController.enterService("_b2EEYLvVEeyr6avTgCRLkQ", RequestTracer.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b2GgoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
RequestTrace trace = THREAD_LOCAL.get();
if (trace == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023135005148458349362272 = trace.traceId;
threadMonitoringController.exitInternalAction("_b2GgoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023135005148458349362272;
}
finally {
threadMonitoringController.exitService("_b2EEYLvVEeyr6avTgCRLkQ");
}
}

public static  String getSpanId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_b2SG0LvVEeyr6avTgCRLkQ", RequestTracer.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b2UjELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
RequestTrace trace = THREAD_LOCAL.get();
if (trace == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130231460017962449353252463 = trace.spanId;
threadMonitoringController.exitInternalAction("_b2UjELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130231460017962449353252463;
}
finally {
threadMonitoringController.exitService("_b2SG0LvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_b2s9kLvVEeyr6avTgCRLkQ", RequestTracer.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b2xPBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long remainingTime = getRemainingTimeMillis();
threadMonitoringController.exitInternalAction("_b2xPBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_b2xPBbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (remainingTime < 0)
{
throw new  DeadlineExceededException();
}
threadMonitoringController.exitInternalAction("_b2xPBbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_b2s9kLvVEeyr6avTgCRLkQ");
}
}

public static  long getTimeElapsedMillis() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_b0YpYLvVEeyr6avTgCRLkQ", RequestTracer.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b0bFoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
RequestTrace trace = THREAD_LOCAL.get();
if (trace == null)
{
return  - 1L;
}
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130231240046959651779545153 = Instant.now().toEpochMilli() - trace.initTimestamp;
threadMonitoringController.exitInternalAction("_b0bFoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130231240046959651779545153;
}
finally {
threadMonitoringController.exitService("_b0YpYLvVEeyr6avTgCRLkQ");
}
}

public static  void init(String traceId, String spanId, int timeoutInSeconds) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("traceId", traceId);
monitoringServiceParameters.addValue("spanId", spanId);
monitoringServiceParameters.addValue("timeoutInSeconds", timeoutInSeconds);
threadMonitoringController.enterService("_b20SULvVEeyr6avTgCRLkQ", RequestTracer.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b22HgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
THREAD_LOCAL.set(new  RequestTrace(traceId, spanId, timeoutInSeconds));
threadMonitoringController.exitInternalAction("_b22HgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_b20SULvVEeyr6avTgCRLkQ");
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
