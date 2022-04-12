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
threadMonitoringController.enterService("_sTDI4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTEXALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808170002041134444968251 = new  Builder(startTime, endTime);
threadMonitoringController.exitInternalAction("_sTEXALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808170002041134444968251;
}
finally {
threadMonitoringController.exitService("_sTDI4LngEeyIw-dB1KCaVA");
}
}

public  LogSeverity getSeverity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTGMMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTIBYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
LogSeverity longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680819007569483833093067 = severity;
threadMonitoringController.exitInternalAction("_sTIBYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680819007569483833093067;
}
finally {
threadMonitoringController.exitService("_sTGMMLngEeyIw-dB1KCaVA");
}
}

public  LogSeverity getMinSeverity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTJ2kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTLEsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
LogSeverity longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680823002620631250040215 = minSeverity;
threadMonitoringController.exitInternalAction("_sTLEsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680823002620631250040215;
}
finally {
threadMonitoringController.exitService("_sTJ2kLngEeyIw-dB1KCaVA");
}
}

public  long getStartTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTOvELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTP9MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808260014109313826517367 = startTime;
threadMonitoringController.exitInternalAction("_sTP9MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808260014109313826517367;
}
finally {
threadMonitoringController.exitService("_sTOvELngEeyIw-dB1KCaVA");
}
}

public  long getEndTime() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTRyYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTTAgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808290048617786236829885 = endTime;
threadMonitoringController.exitInternalAction("_sTTAgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808290048617786236829885;
}
finally {
threadMonitoringController.exitService("_sTRyYLngEeyIw-dB1KCaVA");
}
}

public  String getTraceId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTU1sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTWD0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680832007346756898302836 = traceId;
threadMonitoringController.exitInternalAction("_sTWD0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680832007346756898302836;
}
finally {
threadMonitoringController.exitService("_sTU1sLngEeyIw-dB1KCaVA");
}
}

public  String getActionClass() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTXR8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTYgELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808350002837384432227885 = actionClass;
threadMonitoringController.exitInternalAction("_sTYgELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808350002837384432227885;
}
finally {
threadMonitoringController.exitService("_sTXR8LngEeyIw-dB1KCaVA");
}
}

public  RequestLogUser getUserInfoParams() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTaVQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTbjYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
RequestLogUser longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680840005075006842288896 = userInfoParams;
threadMonitoringController.exitInternalAction("_sTbjYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680840005075006842288896;
}
finally {
threadMonitoringController.exitService("_sTaVQLngEeyIw-dB1KCaVA");
}
}

public  String getLogEvent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTdYkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTd_oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808450038903040364033104 = logEvent;
threadMonitoringController.exitInternalAction("_sTd_oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808450038903040364033104;
}
finally {
threadMonitoringController.exitService("_sTdYkLngEeyIw-dB1KCaVA");
}
}

public  SourceLocation getSourceLocation() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTgb4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sThC8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
SourceLocation longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808510028062075498589856 = sourceLocation;
threadMonitoringController.exitInternalAction("_sThC8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808510028062075498589856;
}
finally {
threadMonitoringController.exitService("_sTgb4LngEeyIw-dB1KCaVA");
}
}

public  String getExceptionClass() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTi4ILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTkGQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808560020310865096641162 = exceptionClass;
threadMonitoringController.exitInternalAction("_sTkGQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808560020310865096641162;
}
finally {
threadMonitoringController.exitService("_sTi4ILngEeyIw-dB1KCaVA");
}
}

public  String getLatency() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTl7cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTnJkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808610016385943444099882 = latency;
threadMonitoringController.exitInternalAction("_sTnJkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808610016385943444099882;
}
finally {
threadMonitoringController.exitService("_sTl7cLngEeyIw-dB1KCaVA");
}
}

public  String getStatus() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sToXsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTpl0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808650008869719240419549 = status;
threadMonitoringController.exitInternalAction("_sTpl0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808650008869719240419549;
}
finally {
threadMonitoringController.exitService("_sToXsLngEeyIw-dB1KCaVA");
}
}

public  String getVersion() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTqz8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTsCELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680867001390694987194686 = version;
threadMonitoringController.exitInternalAction("_sTsCELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680867001390694987194686;
}
finally {
threadMonitoringController.exitService("_sTqz8LngEeyIw-dB1KCaVA");
}
}

public  String getExtraFilters() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTt3QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTvFYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680870009738256078861172 = extraFilters;
threadMonitoringController.exitInternalAction("_sTvFYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680870009738256078861172;
}
finally {
threadMonitoringController.exitService("_sTt3QLngEeyIw-dB1KCaVA");
}
}

public  String getOrder() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTw6kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sTyIsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368087400070838482270421 = order;
threadMonitoringController.exitInternalAction("_sTyIsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368087400070838482270421;
}
finally {
threadMonitoringController.exitService("_sTw6kLngEeyIw-dB1KCaVA");
}
}

public  Integer getPageSize() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sTzW0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sT0k8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Integer longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808770016353753119361059 = pageSize;
threadMonitoringController.exitInternalAction("_sT0k8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136808770016353753119361059;
}
finally {
threadMonitoringController.exitService("_sTzW0LngEeyIw-dB1KCaVA");
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
