package teammates.common.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.google.common.reflect.TypeToken;
import teammates.common.datatransfer.logs.ExceptionLogDetails;
import teammates.common.datatransfer.logs.InstanceLogDetails;
import teammates.common.datatransfer.logs.LogDetails;
import teammates.common.datatransfer.logs.LogSeverity;
import teammates.common.datatransfer.logs.RequestLogDetails;
import teammates.common.datatransfer.logs.RequestLogUser;
import teammates.common.datatransfer.logs.SourceLocation;
@SuppressWarnings("PMD.MoreThanOneLogger")
public final class Logger {
private final java.util.logging.Logger standardLog;

private final java.util.logging.Logger errorLog;

private  Logger(){
StackTraceElement logRequester = getLoggerSource();
String loggerName = logRequester == null ? "null" : logRequester.getClassName();
this.standardLog = java.util.logging.Logger.getLogger(loggerName + "-out");
this.standardLog.setUseParentHandlers(false);
this.standardLog.addHandler(new  StdOutConsoleHandler());
this.errorLog = java.util.logging.Logger.getLogger(loggerName + "-err");
}
public static  Logger getLogger() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z-T4kbvVEeyr6avTgCRLkQ", Logger.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-UfoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Logger longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015389005843347093539984 = new  Logger();
threadMonitoringController.exitInternalAction("_Z-UfoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015389005843347093539984;
}
finally {
threadMonitoringController.exitService("_Z-T4kbvVEeyr6avTgCRLkQ");
}
}

public  void fine(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_bWXQoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bWqypLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_bWqypbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
standardLog.fine(formatLogMessage(message, LogSeverity.DEBUG));
threadMonitoringController.exitInternalAction("_bWqypbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_bWqypLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bWXQoLvVEeyr6avTgCRLkQ");
}
}

public  void info(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_bvQ40LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bvlo8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_bvlo8bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
standardLog.info(formatLogMessage(message, LogSeverity.INFO));
threadMonitoringController.exitInternalAction("_bvlo8bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_bvlo8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bvQ40LvVEeyr6avTgCRLkQ");
}
}

public  void startup() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bvoFMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bv0ScrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instance("STARTUP");
threadMonitoringController.exitInternalAction("_bv0ScrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bvoFMLvVEeyr6avTgCRLkQ");
}
}

public  void shutdown() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bv2usLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bwC79LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instance("SHUTDOWN");
threadMonitoringController.exitInternalAction("_bwC79LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bv2usLvVEeyr6avTgCRLkQ");
}
}

@SuppressWarnings("PMD.SystemPrintln")
private  void instance(String instanceEvent) {
String instanceId = Config.getInstanceId();
String shortenedInstanceId = instanceId;
if (shortenedInstanceId.length() > 32)
{
shortenedInstanceId = shortenedInstanceId.substring(0, 32);
}
InstanceLogDetails details = new  InstanceLogDetails();
details.setInstanceId(instanceId);
details.setInstanceEvent(instanceEvent);
String message = "Instance " + instanceEvent.toLowerCase() + ": " + shortenedInstanceId;
Map<String, Object> payload = new  HashMap<>();
payload.put("message", message);
payload.put("severity", LogSeverity.INFO);
Map<String, Object> detailsSpecificPayload = JsonUtils.fromJson(JsonUtils.toCompactJson(details), new  TypeToken<Map<String, Object>>(){
}
.getType());
payload.putAll(detailsSpecificPayload);
System.out.println(JsonUtils.toCompactJson(payload));
}

public  void request(HttpServletRequest request, int statusCode, String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("request", request);
monitoringServiceParameters.addValue("statusCode", statusCode);
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_bwHNYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bwJpoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
request(request, statusCode, message, new  RequestLogUser(), null, null);
threadMonitoringController.exitInternalAction("_bwJpoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bwHNYLvVEeyr6avTgCRLkQ");
}
}

public  void request(HttpServletRequest request, int statusCode, String message, RequestLogUser userInfo, String requestBody, String actionClass) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("request", request);
monitoringServiceParameters.addValue("statusCode", statusCode);
monitoringServiceParameters.addValue("message", message);
monitoringServiceParameters.addValue("userInfo", userInfo);
monitoringServiceParameters.addValue("requestBody", requestBody);
monitoringServiceParameters.addValue("actionClass", actionClass);
threadMonitoringController.enterService("_bwMF4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bwOiILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long timeElapsed = RequestTracer.getTimeElapsedMillis();
String method = request.getMethod();
String requestUrl = request.getRequestURI();
RequestLogDetails details = new  RequestLogDetails();
details.setResponseStatus(statusCode);
details.setResponseTime(timeElapsed);
details.setRequestMethod(method);
details.setRequestUrl(requestUrl);
details.setUserAgent(request.getHeader("User-Agent"));
details.setWebVersion(request.getHeader(Const.HeaderNames.WEB_VERSION));
details.setReferrer(request.getHeader("referer"));
details.setInstanceId(Config.getInstanceId());
details.setRequestParams(HttpRequestHelper.getRequestParameters(request));
details.setRequestHeaders(HttpRequestHelper.getRequestHeaders(request));
if (request.getParameter(Const.ParamsNames.REGKEY) != null && userInfo.getRegkey() == null)
{
userInfo.setRegkey(request.getParameter(Const.ParamsNames.REGKEY));
}
details.setUserInfo(userInfo);
details.setRequestBody(requestBody);
details.setActionClass(actionClass);
String logMessage = String.format("[%s] [%sms] [%s %s] %s", statusCode, timeElapsed, method, requestUrl, message);
threadMonitoringController.exitInternalAction("_bwOiILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_bw0_FLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
event(logMessage, details);
threadMonitoringController.exitInternalAction("_bw0_FLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bwMF4LvVEeyr6avTgCRLkQ");
}
}

public  void event(String message, LogDetails details) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
monitoringServiceParameters.addValue("details", details);
threadMonitoringController.enterService("_bw4CYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bw5QgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String logMessage;
if (Config.isDevServer())
{
logMessage = formatLogMessageForHumanDisplay(message) + " extra_info: " + JsonUtils.toCompactJson(details);
}
else
{
Map<String, Object> payload = getBaseCloudLoggingPayload(message, LogSeverity.INFO);
Map<String, Object> detailsSpecificPayload = JsonUtils.fromJson(JsonUtils.toCompactJson(details), new  TypeToken<Map<String, Object>>(){
}
.getType());
payload.putAll(detailsSpecificPayload);
logMessage = JsonUtils.toCompactJson(payload);
}
standardLog.info(logMessage);
threadMonitoringController.exitInternalAction("_bw5QgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bw4CYLvVEeyr6avTgCRLkQ");
}
}

public  void warning(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_bxRD8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bxmbJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_bxmbJbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
standardLog.warning(formatLogMessage(message, LogSeverity.WARNING));
threadMonitoringController.exitInternalAction("_bxmbJbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_bxmbJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bxRD8LvVEeyr6avTgCRLkQ");
}
}

public  void warning(String message, Throwable t) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
monitoringServiceParameters.addValue("t", t);
threadMonitoringController.enterService("_bxo3YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_byTlxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String logMessage = getLogMessageWithStackTrace(message, t, LogSeverity.WARNING);
threadMonitoringController.exitInternalAction("_byTlxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_byUM0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
standardLog.warning(logMessage);
threadMonitoringController.exitInternalAction("_byUM0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bxo3YLvVEeyr6avTgCRLkQ");
}
}

public  void severe(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_Z-gF0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-jJJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z-jJJbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
errorLog.severe(formatLogMessage(message, LogSeverity.ERROR));
threadMonitoringController.exitInternalAction("_Z-jJJbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_Z-jJJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z-gF0LvVEeyr6avTgCRLkQ");
}
}

public  void severe(String message, Throwable t) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
monitoringServiceParameters.addValue("t", t);
threadMonitoringController.enterService("_byXQILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bzDMpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String logMessage = getLogMessageWithStackTrace(message, t, LogSeverity.ERROR);
threadMonitoringController.exitInternalAction("_bzDMpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_bzDzsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
errorLog.severe(logMessage);
threadMonitoringController.exitInternalAction("_bzDzsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_byXQILvVEeyr6avTgCRLkQ");
}
}

private  String getLogMessageWithStackTrace(String message, Throwable t, LogSeverity severity) {
if (Config.isDevServer())
{
StringWriter sw = new  StringWriter();
try(PrintWriter pw = new  PrintWriter(sw)) {
t.printStackTrace(pw);
}
return formatLogMessageForHumanDisplay(message) + " stack_trace: " + System.lineSeparator() + sw.toString();
}
Map<String, Object> payload = getBaseCloudLoggingPayload(message, severity);
List<String> exceptionClasses = new  ArrayList<>();
List<List<String>> exceptionStackTraces = new  ArrayList<>();
List<String> exceptionMessages = new  ArrayList<>();
Throwable currentT = t;
while (currentT != null)
{
exceptionClasses.add(currentT.getClass().getName());
exceptionStackTraces.add(getStackTraceToDisplay(currentT));
exceptionMessages.add(currentT.getMessage());
currentT = currentT.getCause();
}
ExceptionLogDetails details = new  ExceptionLogDetails();
details.setExceptionClass(t.getClass().getSimpleName());
details.setExceptionClasses(exceptionClasses);
details.setExceptionStackTraces(exceptionStackTraces);
details.setExceptionMessages(exceptionMessages);
StackTraceElement tSource = getFirstInternalStackTrace(t);
if (tSource != null)
{
SourceLocation tSourceLocation = new  SourceLocation(tSource.getClassName(), (long) tSource.getLineNumber(), tSource.getMethodName());
SourceLocation loggerSourceLocation = (SourceLocation) payload.get("logging.googleapis.com/sourceLocation");
payload.put("logging.googleapis.com/sourceLocation", tSourceLocation);
details.setLoggerSourceLocation(loggerSourceLocation);
}
Map<String, Object> detailsSpecificPayload = JsonUtils.fromJson(JsonUtils.toCompactJson(details), new  TypeToken<Map<String, Object>>(){
}
.getType());
payload.putAll(detailsSpecificPayload);
return JsonUtils.toCompactJson(payload);
}

private  StackTraceElement getFirstInternalStackTrace(Throwable t) {
StackTraceElement[]  stackTraces = t.getStackTrace();
if (stackTraces.length == 0)
{
return null;
}
return Arrays.stream(stackTraces).filter(ste -> ste.getClassName().startsWith("teammates")).findFirst().orElse(stackTraces[0]);
}

private  List<String> getStackTraceToDisplay(Throwable t) {
List<String> stackTraceToDisplay = new  ArrayList<>();
for (StackTraceElement ste : t.getStackTrace())
{
String stClass = ste.getClassName();
if (stClass.startsWith("org.eclipse.jetty.servlet"))
{
stackTraceToDisplay.add("...");
break;
}
stackTraceToDisplay.add(String.format("%s.%s(%s:%s)", ste.getClassName(), ste.getMethodName(), ste.getFileName(), ste.getLineNumber()));
}
return stackTraceToDisplay;
}

private  String formatLogMessage(String message, LogSeverity severity) {
if (Config.isDevServer())
{
return formatLogMessageForHumanDisplay(message);
}
return formatLogMessageForCloudLogging(message, severity);
}

private  String formatLogMessageForHumanDisplay(String message) {
StringBuilder prefix = new  StringBuilder();
StackTraceElement source = getLoggerSource();
if (source != null)
{
prefix.append(source.getClassName()).append(':').append(source.getMethodName()).append(':').append(source.getLineNumber()).append(':');
}
prefix.append(' ');
if (RequestTracer.getTraceId() == null)
{
return prefix.toString() + message;
}
return prefix.toString() + "[" + RequestTracer.getTraceId() + "] " + message;
}

private  String formatLogMessageForCloudLogging(String message, LogSeverity severity) {
return JsonUtils.toCompactJson(getBaseCloudLoggingPayload(message, severity));
}

private  Map<String, Object> getBaseCloudLoggingPayload(String message, LogSeverity severity) {
Map<String, Object> payload = new  HashMap<>();
payload.put("message", message);
payload.put("severity", severity);
StackTraceElement source = getLoggerSource();
if (source != null)
{
SourceLocation sourceLocation = new  SourceLocation(source.getClassName(), (long) source.getLineNumber(), source.getMethodName());
payload.put("logging.googleapis.com/sourceLocation", sourceLocation);
}
if (RequestTracer.getTraceId() != null)
{
payload.put("logging.googleapis.com/trace", "projects/" + Config.APP_ID + "/traces/" + RequestTracer.getTraceId());
}
if (RequestTracer.getSpanId() != null)
{
payload.put("logging.googleapis.com/spanId", RequestTracer.getSpanId());
}
return payload;
}

private  StackTraceElement getLoggerSource() {
StackTraceElement[]  stes = Thread.currentThread().getStackTrace();
for (int i = 0 ; i < stes.length ; i++)
{
StackTraceElement ste = stes[i];
if (ste.getClassName().equals(Logger.class.getName()) && i + 1 < stes.length)
{
StackTraceElement nextSte = stes[i + 1];
if (!nextSte.getClassName().equals(Logger.class.getName()))
{
return nextSte;
}
}
}
return null;
}

}
