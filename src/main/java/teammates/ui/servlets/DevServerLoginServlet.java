package teammates.ui.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import teammates.common.datatransfer.UserInfoCookie;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.FileHelper;
import teammates.common.util.HttpRequestHelper;
public class DevServerLoginServlet extends AuthServlet {
@Override
public  void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xiTcALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_xiXGYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String nextUrl = req.getParameter("nextUrl");
if (nextUrl == null)
{
nextUrl = "/";
}
nextUrl = resp.encodeRedirectURL(nextUrl.replace("\r\n", ""));
if (!Config.isDevServerLoginEnabled())
{
resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
resp.setHeader("Location", Const.WebPageURIs.LOGIN + "?nextUrl=" + nextUrl.replace("&", "%26"));
return;
}
String cookie = HttpRequestHelper.getCookieValueFromRequest(req, Const.SecurityConfig.AUTH_COOKIE_NAME);
threadMonitoringController.exitInternalAction("_xiXGYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_xib-4LngEeyIw-dB1KCaVA");
UserInfoCookie uic = UserInfoCookie.fromCookie(cookie);
threadMonitoringController.setExternalCallId("_xidNALngEeyIw-dB1KCaVA");
boolean isLoginNeeded = uic == null || !uic.isValid();
threadMonitoringController.enterInternalAction("_xiebILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!isLoginNeeded)
{
resp.sendRedirect(nextUrl);
void longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368411800585543844205403;
threadMonitoringController.exitInternalAction("_xiebILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368411800585543844205403;
}
threadMonitoringController.setExternalCallId("_xifCMLngEeyIw-dB1KCaVA");
String html = FileHelper.readResourceFile("devServerLoginPage.html");
threadMonitoringController.enterInternalAction("_xigQULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
resp.setContentType("text/html");
PrintWriter pw = resp.getWriter();
pw.print(html);
threadMonitoringController.exitInternalAction("_xigQULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_xiTcALngEeyIw-dB1KCaVA");
}
}

@Override
public  void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xilv4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_xiqBULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!Config.isDevServerLoginEnabled())
{
resp.setStatus(HttpStatus.SC_FORBIDDEN);
return;
}
String email = req.getParameter("email");
if (email == null)
{
return;
}
UserInfoCookie uic = new  UserInfoCookie(email.replaceFirst("@gmail\\.com$", ""));
Cookie cookie = getLoginCookie(uic);
resp.addCookie(cookie);
String nextUrl = req.getParameter("nextUrl");
if (nextUrl == null)
{
nextUrl = "/";
}
nextUrl = resp.encodeRedirectURL(nextUrl.replace("\r\n", ""));
resp.sendRedirect(nextUrl);
threadMonitoringController.exitInternalAction("_xiqBULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_xilv4LngEeyIw-dB1KCaVA");
}
}

}
