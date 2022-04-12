package teammates.ui.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import teammates.common.util.Logger;
public class WebPageServlet extends HttpServlet {
private static final Logger log = Logger.getLogger();

@Override
public  void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xzmnYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
try {
threadMonitoringController.enterInternalAction("_xzvKQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
req.getRequestDispatcher("/index.html").forward(req, resp);
threadMonitoringController.exitInternalAction("_xzvKQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
catch(RuntimeException e){
if ("BadMessageException".equals(e.getClass().getSimpleName()))
{
log.warning("", e);
resp.setStatus(HttpStatus.SC_BAD_REQUEST);
resp.getWriter().write(e.getMessage());
}
else
{
throw e;
}
}
}
finally {
threadMonitoringController.exitService("_xzmnYLngEeyIw-dB1KCaVA");
}
}

}
