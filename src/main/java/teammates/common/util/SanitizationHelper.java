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
threadMonitoringController.enterService("_Z7BUAbvVEeyr6avTgCRLkQ", SanitizationHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7BUArvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (rawGoogleId == null)
{
return null;
}
String sanitized = rawGoogleId.trim();
if (sanitized.toLowerCase().endsWith("@gmail.com"))
{
sanitized = sanitized.split("@")[0];
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015016006468952430851145 = sanitized.trim();
threadMonitoringController.exitInternalAction("_Z7BUArvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015016006468952430851145;
}
finally {
threadMonitoringController.exitService("_Z7BUAbvVEeyr6avTgCRLkQ");
}
}

public static  String sanitizeEmail(String rawEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawEmail", rawEmail);
threadMonitoringController.enterService("_Z7DwQbvVEeyr6avTgCRLkQ", SanitizationHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7EXULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130150290038926160817420097 = StringHelper.trimIfNotNull(rawEmail);
threadMonitoringController.exitInternalAction("_Z7EXULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130150290038926160817420097;
}
finally {
threadMonitoringController.exitService("_Z7DwQbvVEeyr6avTgCRLkQ");
}
}

public static  String sanitizeName(String rawName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawName", rawName);
threadMonitoringController.enterService("_Z7CiIbvVEeyr6avTgCRLkQ", SanitizationHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7DJMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301502300733480749537978 = StringHelper.removeExtraSpace(rawName);
threadMonitoringController.exitInternalAction("_Z7DJMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301502300733480749537978;
}
finally {
threadMonitoringController.exitService("_Z7CiIbvVEeyr6avTgCRLkQ");
}
}

public static  String sanitizeTitle(String rawTitle) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawTitle", rawTitle);
threadMonitoringController.enterService("_Z7E-YbvVEeyr6avTgCRLkQ", SanitizationHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7FlcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130150380034258336661219235 = StringHelper.removeExtraSpace(rawTitle);
threadMonitoringController.exitInternalAction("_Z7FlcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130150380034258336661219235;
}
finally {
threadMonitoringController.exitService("_Z7E-YbvVEeyr6avTgCRLkQ");
}
}

public static  String sanitizeTextField(String rawText) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rawText", rawText);
threadMonitoringController.enterService("_acELkLvVEeyr6avTgCRLkQ", SanitizationHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_acFZsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018175005938114738330409 = StringHelper.trimIfNotNull(rawText);
threadMonitoringController.exitInternalAction("_acFZsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018175005938114738330409;
}
finally {
threadMonitoringController.exitService("_acELkLvVEeyr6avTgCRLkQ");
}
}

public static  String sanitizeForRichText(String content) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("content", content);
threadMonitoringController.enterService("_aDZM4bvVEeyr6avTgCRLkQ", SanitizationHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aDabALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (content == null)
{
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015907005576465324880858 = null;
threadMonitoringController.exitInternalAction("_aDabALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015907005576465324880858;
}
threadMonitoringController.enterInternalAction("_aDabBbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015907006255244289453203 = richTextPolicy.sanitize(sanitizeTextField(content));
threadMonitoringController.exitInternalAction("_aDabBbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aDabBrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015907003237617621937007 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015907006255244289453203;
threadMonitoringController.exitInternalAction("_aDabBrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015907003237617621937007;
}
finally {
threadMonitoringController.exitService("_aDZM4bvVEeyr6avTgCRLkQ");
}
}

public static  String sanitizeForHtml(String unsanitizedString) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("unsanitizedString", unsanitizedString);
threadMonitoringController.enterService("_bpLe8LvVEeyr6avTgCRLkQ", SanitizationHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bpNUILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (unsanitizedString == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022880008626403934467767 = unsanitizedString.replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("/", "&#x2f;").replace("'", "&#39;").replaceAll("&(?!(amp;)|(lt;)|(gt;)|(quot;)|(#x2f;)|(#39;))", "&amp;");
threadMonitoringController.exitInternalAction("_bpNUILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022880008626403934467767;
}
finally {
threadMonitoringController.exitService("_bpLe8LvVEeyr6avTgCRLkQ");
}
}

public static  String sanitizeForUri(String uri) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("uri", uri);
threadMonitoringController.enterService("_b3ckcLvVEeyr6avTgCRLkQ", SanitizationHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b3fAsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130231880018191932922178355 = URLEncoder.encode(uri, Const.ENCODING).replaceAll("\\+", "%20");
threadMonitoringController.exitInternalAction("_b3fAsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130231880018191932922178355;
}
finally {
threadMonitoringController.exitService("_b3ckcLvVEeyr6avTgCRLkQ");
}
}

}
