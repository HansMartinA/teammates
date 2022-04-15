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
threadMonitoringController.enterService("_cBkw0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cBmmALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023396008149736913704099 = baseUrl;
threadMonitoringController.exitInternalAction("_cBmmALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023396008149736913704099;
}
finally {
threadMonitoringController.exitService("_cBkw0LvVEeyr6avTgCRLkQ");
}
}

@SuppressWarnings("unchecked")
public <T extends Url>  T withParam(String paramName, String paramValue) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("paramName", paramName);
monitoringServiceParameters.addValue("paramValue", paramValue);
threadMonitoringController.enterService("_bdqLcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bdvD9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
query = addParamToUrl(query, paramName, paramValue);
threadMonitoringController.exitInternalAction("_bdvD9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_bdvD9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
T longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022464005320475235552617 = (T) this;
threadMonitoringController.exitInternalAction("_bdvD9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022464005320475235552617;
}
finally {
threadMonitoringController.exitService("_bdqLcLvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_aV__0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aWAm4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017751005421166711200244 = relativeUrl + query;
threadMonitoringController.exitInternalAction("_aWAm4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017751005421166711200244;
}
finally {
threadMonitoringController.exitService("_aV__0LvVEeyr6avTgCRLkQ");
}
}

public  String toAbsoluteString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z8D10LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z8Ec4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015204006125588664619109 = baseUrl + toString();
threadMonitoringController.exitInternalAction("_Z8Ec4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015204006125588664619109;
}
finally {
threadMonitoringController.exitService("_Z8D10LvVEeyr6avTgCRLkQ");
}
}

}
