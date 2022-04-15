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
threadMonitoringController.enterService("_gSTmMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_gSX3oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.exitInternalAction("_gSX3oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_gSd-QLvVEeyr6avTgCRLkQ");
UserInfoCookie uic = UserInfoCookie.fromCookie(cookie);
threadMonitoringController.setExternalCallId("_gSfMYLvVEeyr6avTgCRLkQ");
boolean isLoginNeeded = uic == null || !uic.isValid();
threadMonitoringController.enterInternalAction("_gSgagLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!isLoginNeeded)
{
resp.sendRedirect(nextUrl);
threadMonitoringController.exitInternalAction("_gSgagLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return;
}
threadMonitoringController.setExternalCallId("_gShBkLvVEeyr6avTgCRLkQ");
String html = FileHelper.readResourceFile("devServerLoginPage.html");
threadMonitoringController.enterInternalAction("_gSiPsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
resp.setContentType("text/html");
PrintWriter pw = resp.getWriter();
pw.print(html);
threadMonitoringController.exitInternalAction("_gSiPsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_gSTmMLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_gSoWULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_gSsnwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.exitInternalAction("_gSsnwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_gSoWULvVEeyr6avTgCRLkQ");
}
}

}
