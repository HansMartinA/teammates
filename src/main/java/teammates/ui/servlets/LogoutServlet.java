package teammates.ui.servlets;

import java.io.IOException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import teammates.common.util.Logger;
public class LogoutServlet extends AuthServlet {
private static final Logger log = Logger.getLogger();

@Override
public  void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_gYj_MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_gYo3sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
req.getSession().invalidate();
Cookie cookie = getLoginInvalidationCookie();
resp.addCookie(cookie);
String frontendUrl = req.getParameter("frontendUrl");
if (frontendUrl == null)
{
frontendUrl = "";
}
log.request(req, HttpStatus.SC_MOVED_TEMPORARILY, "Redirect to home page after logging out");
resp.sendRedirect(frontendUrl + "/web");
threadMonitoringController.exitInternalAction("_gYo3sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_gYj_MLvVEeyr6avTgCRLkQ");
}
}

}
