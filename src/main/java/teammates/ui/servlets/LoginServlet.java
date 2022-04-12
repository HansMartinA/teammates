package teammates.ui.servlets;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import com.google.api.client.auth.oauth2.AuthorizationCodeRequestUrl;
import teammates.common.datatransfer.UserInfoCookie;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.HttpRequestHelper;
import teammates.common.util.JsonUtils;
import teammates.common.util.Logger;
import teammates.common.util.StringHelper;
public class LoginServlet extends AuthServlet {
private static final Logger log = Logger.getLogger();

@Override
public  void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xnYwULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_xndo0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String nextUrl = req.getParameter("nextUrl");
if (nextUrl == null)
{
nextUrl = "/";
}
nextUrl = resp.encodeRedirectURL(nextUrl.replace("\r\n", ""));
if (Config.isDevServerLoginEnabled())
{
resp.setStatus(HttpStatus.SC_MOVED_PERMANENTLY);
resp.setHeader("Location", "/devServerLogin?nextUrl=" + nextUrl.replace("&", "%26"));
log.request(req, HttpStatus.SC_MOVED_PERMANENTLY, "Redirect to dev server login page");
return;
}
String cookie = HttpRequestHelper.getCookieValueFromRequest(req, Const.SecurityConfig.AUTH_COOKIE_NAME);
threadMonitoringController.exitInternalAction("_xndo0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_xnk9kLngEeyIw-dB1KCaVA");
UserInfoCookie uic = UserInfoCookie.fromCookie(cookie);
threadMonitoringController.setExternalCallId("_xnmLsLngEeyIw-dB1KCaVA");
boolean isLoginNeeded = uic == null || !uic.isValid();
threadMonitoringController.enterInternalAction("_xnoA4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!isLoginNeeded)
{
log.request(req, HttpStatus.SC_MOVED_TEMPORARILY, "Redirect to next URL");
resp.sendRedirect(nextUrl);
return;
}
AuthState state = new  AuthState(nextUrl, req.getSession().getId());
AuthorizationCodeRequestUrl authorizationUrl = getAuthorizationFlow().newAuthorizationUrl();
authorizationUrl.setRedirectUri(getRedirectUri(req));
threadMonitoringController.exitInternalAction("_xnoA4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_xnv8sLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xnwjwLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_xnwjwbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
authorizationUrl.setState(StringHelper.encrypt(JsonUtils.toCompactJson(state)));
log.request(req, HttpStatus.SC_MOVED_TEMPORARILY, "Redirect to Google sign-in page");
resp.sendRedirect(authorizationUrl.build());
threadMonitoringController.exitInternalAction("_xnwjwbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_xnYwULngEeyIw-dB1KCaVA");
}
}

}
