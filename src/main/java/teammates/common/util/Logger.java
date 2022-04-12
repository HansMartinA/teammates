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
threadMonitoringController.enterService("_rkKpobngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rkLQsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Logger longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679159006393183968498821 = new  Logger();
threadMonitoringController.exitInternalAction("_rkLQsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679159006393183968498821;
}
finally {
threadMonitoringController.exitService("_rkKpobngEeyIw-dB1KCaVA");
}
}

public  void fine(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_s2NgULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s2emFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_s2emFbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
standardLog.fine(formatLogMessage(message, LogSeverity.DEBUG));
threadMonitoringController.exitInternalAction("_s2emFbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_s2emFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_s2NgULngEeyIw-dB1KCaVA");
}
}

public  void info(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_tNibMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tN1WJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tN1WJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
standardLog.info(formatLogMessage(message, LogSeverity.INFO));
threadMonitoringController.exitInternalAction("_tN1WJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_tN1WJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tNibMLngEeyIw-dB1KCaVA");
}
}

public  void startup() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tN4ZcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tOFNxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instance("STARTUP");
threadMonitoringController.exitInternalAction("_tOFNxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tN4ZcLngEeyIw-dB1KCaVA");
}
}

public  void shutdown() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tOHqALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tOTQMrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instance("SHUTDOWN");
threadMonitoringController.exitInternalAction("_tOTQMrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tOHqALngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_tOXhoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tOZ94LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
request(request, statusCode, message, new  RequestLogUser(), null, null);
threadMonitoringController.exitInternalAction("_tOZ94LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tOXhoLngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_tOcaILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tOe2YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.exitInternalAction("_tOe2YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tPDeIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
event(logMessage, details);
threadMonitoringController.exitInternalAction("_tPDeIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tOcaILngEeyIw-dB1KCaVA");
}
}

public  void event(String message, LogDetails details) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
monitoringServiceParameters.addValue("details", details);
threadMonitoringController.enterService("_tPF6YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tPHIgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.exitInternalAction("_tPHIgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tPF6YLngEeyIw-dB1KCaVA");
}
}

public  void warning(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_tPdGwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tP2IVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tP2IVbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
standardLog.warning(formatLogMessage(message, LogSeverity.WARNING));
threadMonitoringController.exitInternalAction("_tP2IVbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_tP2IVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tPdGwLngEeyIw-dB1KCaVA");
}
}

public  void warning(String message, Throwable t) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
monitoringServiceParameters.addValue("t", t);
threadMonitoringController.enterService("_tP4kkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tQjS9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String logMessage = getLogMessageWithStackTrace(message, t, LogSeverity.WARNING);
threadMonitoringController.exitInternalAction("_tQjS9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tQj6ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
standardLog.warning(logMessage);
threadMonitoringController.exitInternalAction("_tQj6ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tP4kkLngEeyIw-dB1KCaVA");
}
}

public  void severe(String message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_rkTzkbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rkXd8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rkXd8bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
errorLog.severe(formatLogMessage(message, LogSeverity.ERROR));
threadMonitoringController.exitInternalAction("_rkXd8bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rkXd8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rkTzkbngEeyIw-dB1KCaVA");
}
}

public  void severe(String message, Throwable t) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
monitoringServiceParameters.addValue("t", t);
threadMonitoringController.enterService("_tQm9ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tRREpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String logMessage = getLogMessageWithStackTrace(message, t, LogSeverity.ERROR);
threadMonitoringController.exitInternalAction("_tRREpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_tRRrsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
errorLog.severe(logMessage);
threadMonitoringController.exitInternalAction("_tRRrsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tQm9ULngEeyIw-dB1KCaVA");
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
