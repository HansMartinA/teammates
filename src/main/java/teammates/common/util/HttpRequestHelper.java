package teammates.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
public final class HttpRequestHelper {
private  HttpRequestHelper(){
}
static  Map<String, Object> getRequestParameters(HttpServletRequest req) {
Map<String, Object> params = new  HashMap<>();
req.getParameterMap().forEach((key, values) -> {
if (values.length == 1)
{
params.put(key, values[0]);
}
else
{
params.put(key, values);
}
}
);
return params;
}

static  Map<String, Object> getRequestHeaders(HttpServletRequest req) {
Map<String, Object> headers = new  HashMap<>();
Collections.list(req.getHeaderNames()).stream().filter(headerName -> Config.isDevServer() || !"cookie".equalsIgnoreCase(headerName)).filter(headerName -> Config.isDevServer() || !Const.HeaderNames.BACKDOOR_KEY.equalsIgnoreCase(headerName)).filter(headerName -> Config.isDevServer() || !Const.HeaderNames.CSRF_KEY.equalsIgnoreCase(headerName)).forEach(headerName -> {
List<String> headerValues = Collections.list(req.getHeaders(headerName));
if (headerValues.size() == 1)
{
headers.put(headerName, headerValues.get(0));
}
else
{
headers.put(headerName, headerValues.toArray(new String [0] ));
}
}
);
return headers;
}

public static  String getCookieValueFromRequest(HttpServletRequest req, String cookieName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("cookieName", cookieName);
threadMonitoringController.enterService("_tJm9cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tJoyoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Cookie[]  existingCookies = req.getCookies();
if (existingCookies == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818360048635547001208423 = Arrays.stream(existingCookies).filter(cookie -> cookie.getName().equals(cookieName)).map(Cookie::getValue).findFirst().orElse(null);
threadMonitoringController.exitInternalAction("_tJoyoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818360048635547001208423;
}
finally {
threadMonitoringController.exitService("_tJm9cLngEeyIw-dB1KCaVA");
}
}

public static  String getRequestBody(HttpServletRequest req) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
threadMonitoringController.enterService("_tJwHYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tJzxwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
try(BufferedReader br = req.getReader()) {
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681839001897002738385133 = br.lines().collect(Collectors.joining(System.lineSeparator()));
threadMonitoringController.exitInternalAction("_tJzxwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681839001897002738385133;
}
catch(IOException e){
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818390016538937847464308 = "";
threadMonitoringController.exitInternalAction("_tJzxwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818390016538937847464308;
}
}
finally {
threadMonitoringController.exitService("_tJwHYLngEeyIw-dB1KCaVA");
}
}

}
