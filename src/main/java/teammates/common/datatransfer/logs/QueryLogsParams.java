package teammates.common.datatransfer.logs;

public class QueryLogsParams {
private LogSeverity severity;

private LogSeverity minSeverity;

private long startTime;

private long endTime;

private String traceId;

private String actionClass;

private RequestLogUser userInfoParams;

private String logEvent;

private SourceLocation sourceLocation;

private String exceptionClass;

private String latency;

private String status;

private String version;

private String extraFilters;

private String order;

private Integer pageSize;

private  QueryLogsParams(long startTime, long endTime){
this.startTime = startTime;
this.endTime = endTime;
}
public static  Builder builder(long startTime, long endTime) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("startTime", startTime);
monitoringServiceParameters.addValue("endTime", endTime);
threadMonitoringController.enterService("_axGncLvVEeyr6avTgCRLkQ", QueryLogsParams.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axH1kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019483006576369540941569 = new  Builder(startTime, endTime);
threadMonitoringController.exitInternalAction("_axH1kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019483006576369540941569;
}
finally {
threadMonitoringController.exitService("_axGncLvVEeyr6avTgCRLkQ");
}
}

public  LogSeverity getSeverity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axJqwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axLf8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
LogSeverity longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019491007985437983826378 = severity;
threadMonitoringController.exitInternalAction("_axLf8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019491007985437983826378;
}
finally {
threadMonitoringController.exitService("_axJqwLvVEeyr6avTgCRLkQ");
}
}

public  LogSeverity getMinSeverity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axNVILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axPKULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
LogSeverity longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130195020022181486724890387 = minSeverity;
threadMonitoringController.exitInternalAction("_axPKULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130195020022181486724890387;
}
finally {
threadMonitoringController.exitService("_axNVILvVEeyr6avTgCRLkQ");
}
}

public  long getStartTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axQ_gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axS0sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019511008823781282558258 = startTime;
threadMonitoringController.exitInternalAction("_axS0sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019511008823781282558258;
}
finally {
threadMonitoringController.exitService("_axQ_gLvVEeyr6avTgCRLkQ");
}
}

public  long getEndTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axVQ8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axXGILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019521005747804643923349 = endTime;
threadMonitoringController.exitInternalAction("_axXGILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019521005747804643923349;
}
finally {
threadMonitoringController.exitService("_axVQ8LvVEeyr6avTgCRLkQ");
}
}

public  String getTraceId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axY7ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axaJcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019529005631238424770921 = traceId;
threadMonitoringController.exitInternalAction("_axaJcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019529005631238424770921;
}
finally {
threadMonitoringController.exitService("_axY7ULvVEeyr6avTgCRLkQ");
}
}

public  String getActionClass() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axclsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axdz0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019540009011870618294503 = actionClass;
threadMonitoringController.exitInternalAction("_axdz0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019540009011870618294503;
}
finally {
threadMonitoringController.exitService("_axclsLvVEeyr6avTgCRLkQ");
}
}

public  RequestLogUser getUserInfoParams() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axfpALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axheMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
RequestLogUser longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301954900598197430171482 = userInfoParams;
threadMonitoringController.exitInternalAction("_axheMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301954900598197430171482;
}
finally {
threadMonitoringController.exitService("_axfpALvVEeyr6avTgCRLkQ");
}
}

public  String getLogEvent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axjTYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axkhgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019558008457921917551944 = logEvent;
threadMonitoringController.exitInternalAction("_axkhgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019558008457921917551944;
}
finally {
threadMonitoringController.exitService("_axjTYLvVEeyr6avTgCRLkQ");
}
}

public  SourceLocation getSourceLocation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axmWsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axnk0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
SourceLocation longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019568004651749914100166 = sourceLocation;
threadMonitoringController.exitInternalAction("_axnk0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019568004651749914100166;
}
finally {
threadMonitoringController.exitService("_axmWsLvVEeyr6avTgCRLkQ");
}
}

public  String getExceptionClass() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axpaALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axqBELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019577006640143258311679 = exceptionClass;
threadMonitoringController.exitInternalAction("_axqBELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019577006640143258311679;
}
finally {
threadMonitoringController.exitService("_axpaALvVEeyr6avTgCRLkQ");
}
}

public  String getLatency() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axr2QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axtEYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019589004292415418727885 = latency;
threadMonitoringController.exitInternalAction("_axtEYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019589004292415418727885;
}
finally {
threadMonitoringController.exitService("_axr2QLvVEeyr6avTgCRLkQ");
}
}

public  String getStatus() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axu5kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axwHsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019598005424447975656537 = status;
threadMonitoringController.exitInternalAction("_axwHsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019598005424447975656537;
}
finally {
threadMonitoringController.exitService("_axu5kLvVEeyr6avTgCRLkQ");
}
}

public  String getVersion() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_axx84LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_axzLALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019608003854984741983287 = version;
threadMonitoringController.exitInternalAction("_axzLALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019608003854984741983287;
}
finally {
threadMonitoringController.exitService("_axx84LvVEeyr6avTgCRLkQ");
}
}

public  String getExtraFilters() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ax1AMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ax2OULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301961800510349461764321 = extraFilters;
threadMonitoringController.exitInternalAction("_ax2OULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301961800510349461764321;
}
finally {
threadMonitoringController.exitService("_ax1AMLvVEeyr6avTgCRLkQ");
}
}

public  String getOrder() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ax4DgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ax5RoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130196270003199948430380095 = order;
threadMonitoringController.exitInternalAction("_ax5RoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130196270003199948430380095;
}
finally {
threadMonitoringController.exitService("_ax4DgLvVEeyr6avTgCRLkQ");
}
}

public  Integer getPageSize() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ax7G0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ax8U8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Integer longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019640008364945580554597 = pageSize;
threadMonitoringController.exitInternalAction("_ax8U8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013019640008364945580554597;
}
finally {
threadMonitoringController.exitService("_ax7G0LvVEeyr6avTgCRLkQ");
}
}

public static class Builder {
private QueryLogsParams queryLogsParams;

private  Builder(long startTime, long endTime){
this.queryLogsParams = new  QueryLogsParams(startTime, endTime);
}
public  Builder withSeverityLevel(LogSeverity severityLevel) {
queryLogsParams.severity = severityLevel;
return this;
}

public  Builder withMinSeverity(LogSeverity minSeverity) {
queryLogsParams.minSeverity = minSeverity;
return this;
}

public  Builder withTraceId(String traceId) {
queryLogsParams.traceId = traceId;
return this;
}

public  Builder withActionClass(String actionClass) {
queryLogsParams.actionClass = actionClass;
return this;
}

public  Builder withUserInfo(RequestLogUser userInfoParams) {
queryLogsParams.userInfoParams = userInfoParams;
return this;
}

public  Builder withLogEvent(String logEvent) {
queryLogsParams.logEvent = logEvent;
return this;
}

public  Builder withSourceLocation(SourceLocation sourceLocation) {
queryLogsParams.sourceLocation = sourceLocation;
return this;
}

public  Builder withExceptionClass(String exceptionClass) {
queryLogsParams.exceptionClass = exceptionClass;
return this;
}

public  Builder withOrder(String order) {
queryLogsParams.order = order;
return this;
}

public  Builder withLatency(String latency) {
queryLogsParams.latency = latency;
return this;
}

public  Builder withStatus(String status) {
queryLogsParams.status = status;
return this;
}

public  Builder withVersion(String version) {
queryLogsParams.version = version;
return this;
}

public  Builder withExtraFilters(String extraFilters) {
queryLogsParams.extraFilters = extraFilters;
return this;
}

public  Builder withPageSize(Integer pageSize) {
queryLogsParams.pageSize = pageSize;
return this;
}

public  QueryLogsParams build() {
return queryLogsParams;
}

}
}
