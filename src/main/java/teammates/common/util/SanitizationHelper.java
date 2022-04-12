package teammates.common.util;

import java.net.URLEncoder;
import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.PolicyFactory;
public final class SanitizationHelper {
private static PolicyFactory richTextPolicy = new  HtmlPolicyBuilder().allowStandardUrlProtocols().allowAttributes("title").globally().allowAttributes("href").onElements("a").allowAttributes("src").onElements("img").allowAttributes("align").matching(true, "center", "left", "right", "justify", "char").onElements("p").allowAttributes("colspan", "rowspan").onElements("td", "th").allowAttributes("cellspacing").onElements("table").allowElements("a", "p", "div", "i", "b", "em", "blockquote", "tt", "strong", "hr", "br", "ul", "ol", "li", "h1", "h2", "h3", "h4", "h5", "h6", "img", "span", "table", "tr", "td", "th", "tbody", "tfoot", "thead", "caption", "colgroup", "sup", "sub", "code").allowElements("quote", "ecode").allowStyling().toFactory();

private  SanitizationHelper(){
}
public static  String sanitizeGoogleId(String rawGoogleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawGoogleId", rawGoogleId);
threadMonitoringController.enterService("_rh1uYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rh2VcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (rawGoogleId == null)
{
return null;
}
String sanitized = rawGoogleId.trim();
if (sanitized.toLowerCase().endsWith("@gmail.com"))
{
sanitized = sanitized.split("@")[0];
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678979009448661960346749 = sanitized.trim();
threadMonitoringController.exitInternalAction("_rh2VcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678979009448661960346749;
}
finally {
threadMonitoringController.exitService("_rh1uYLngEeyIw-dB1KCaVA");
}
}

public static  String sanitizeEmail(String rawEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawEmail", rawEmail);
threadMonitoringController.enterService("_rh4xsbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rh5YwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789840007510822937529094 = StringHelper.trimIfNotNull(rawEmail);
threadMonitoringController.exitInternalAction("_rh5YwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789840007510822937529094;
}
finally {
threadMonitoringController.exitService("_rh4xsbngEeyIw-dB1KCaVA");
}
}

public static  String sanitizeName(String rawName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawName", rawName);
threadMonitoringController.enterService("_rh3jkbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rh3jkrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678981004748270865813389 = StringHelper.removeExtraSpace(rawName);
threadMonitoringController.exitInternalAction("_rh3jkrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678981004748270865813389;
}
finally {
threadMonitoringController.exitService("_rh3jkbngEeyIw-dB1KCaVA");
}
}

public static  String sanitizeTitle(String rawTitle) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawTitle", rawTitle);
threadMonitoringController.enterService("_rh6m4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rh7N8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789880009862649977819626 = StringHelper.removeExtraSpace(rawTitle);
threadMonitoringController.exitInternalAction("_rh7N8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789880009862649977819626;
}
finally {
threadMonitoringController.exitService("_rh6m4LngEeyIw-dB1KCaVA");
}
}

public static  String sanitizeTextField(String rawText) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawText", rawText);
threadMonitoringController.enterService("_r-6E4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r-7TALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680295007412990089795202 = StringHelper.trimIfNotNull(rawText);
threadMonitoringController.exitInternalAction("_r-7TALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680295007412990089795202;
}
finally {
threadMonitoringController.exitService("_r-6E4LngEeyIw-dB1KCaVA");
}
}

public static  String sanitizeForRichText(String content) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("content", content);
threadMonitoringController.enterService("_roUJ0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_roUw4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (content == null)
{
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679398002498059326632983 = null;
threadMonitoringController.exitInternalAction("_roUw4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679398002498059326632983;
}
threadMonitoringController.enterInternalAction("_roV_BLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793980019956347664581375 = richTextPolicy.sanitize(sanitizeTextField(content));
threadMonitoringController.exitInternalAction("_roV_BLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_roV_BbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793980031747741010470387 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793980019956347664581375;
threadMonitoringController.exitInternalAction("_roV_BbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136793980031747741010470387;
}
finally {
threadMonitoringController.exitService("_roUJ0LngEeyIw-dB1KCaVA");
}
}

public static  String sanitizeForHtml(String unsanitizedString) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("unsanitizedString", unsanitizedString);
threadMonitoringController.enterService("_tHtgALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tHuuILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (unsanitizedString == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681829009651307259626359 = unsanitizedString.replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("/", "&#x2f;").replace("'", "&#39;").replaceAll("&(?!(amp;)|(lt;)|(gt;)|(quot;)|(#x2f;)|(#39;))", "&amp;");
threadMonitoringController.exitInternalAction("_tHuuILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681829009651307259626359;
}
finally {
threadMonitoringController.exitService("_tHtgALngEeyIw-dB1KCaVA");
}
}

public static  String sanitizeForUri(String uri) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("uri", uri);
threadMonitoringController.enterService("_tVYvoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tVby8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681900002083230125389549 = URLEncoder.encode(uri, Const.ENCODING).replaceAll("\\+", "%20");
threadMonitoringController.exitInternalAction("_tVby8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681900002083230125389549;
}
finally {
threadMonitoringController.exitService("_tVYvoLngEeyIw-dB1KCaVA");
}
}

}
