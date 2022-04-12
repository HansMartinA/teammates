package teammates.common.util;

import java.net.MalformedURLException;
import java.net.URL;
public class Url {
private final String baseUrl;

private final String relativeUrl;

private String query;

public  Url(String urlString){
URL url = null;
try {
url = new  URL(urlString);
}
catch(MalformedURLException e){
assert false : "MalformedURLException for [" + urlString + "]: " + e.getMessage();
}
this.baseUrl = url.getProtocol() + "://" + url.getAuthority();
this.relativeUrl = StringHelper.convertToEmptyStringIfNull(url.getPath());
String query = url.getQuery();
this.query = query == null ? "" : "?" + query;
}
public  String getBaseUrl() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_teeaMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tefoULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681950002061128611303059 = baseUrl;
threadMonitoringController.exitInternalAction("_tefoULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681950002061128611303059;
}
finally {
threadMonitoringController.exitService("_teeaMLngEeyIw-dB1KCaVA");
}
}

@SuppressWarnings("unchecked")
public <T extends Url>  T withParam(String paramName, String paramValue) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("paramName", paramName);
monitoringServiceParameters.addValue("paramValue", paramValue);
threadMonitoringController.enterService("_s89okLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s9BS9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
query = addParamToUrl(query, paramName, paramValue);
threadMonitoringController.exitInternalAction("_s9BS9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_s9B6ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
T longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681723007686146440389626 = (T) this;
threadMonitoringController.exitInternalAction("_s9B6ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681723007686146440389626;
}
finally {
threadMonitoringController.exitService("_s89okLngEeyIw-dB1KCaVA");
}
}

static  String addParamToUrl(String url, String key, String value) {
if (key == null || key.isEmpty() || value == null || value.isEmpty() || url.contains("?" + key + "=") || url.contains("&" + key + "="))
{
return url;
}
return url + (url.contains("?") ? "&" : "?") + key + "=" + SanitizationHelper.sanitizeForUri(value);
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r5cWELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r5c9ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368012200736586264340931 = relativeUrl + query;
threadMonitoringController.exitInternalAction("_r5c9ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368012200736586264340931;
}
finally {
threadMonitoringController.exitService("_r5cWELngEeyIw-dB1KCaVA");
}
}

public  String toAbsoluteString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ri9IsrngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ri9vxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679070006277400945905758 = baseUrl + toString();
threadMonitoringController.exitInternalAction("_ri9vxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679070006277400945905758;
}
finally {
threadMonitoringController.exitService("_ri9IsrngEeyIw-dB1KCaVA");
}
}

}
