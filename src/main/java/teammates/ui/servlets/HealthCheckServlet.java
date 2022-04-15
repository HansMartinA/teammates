package teammates.ui.servlets;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
public class HealthCheckServlet extends HttpServlet {
@Override
public  void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_gT1QMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_gT46kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
resp.setStatus(HttpStatus.SC_OK);
resp.getWriter().write("OK");
threadMonitoringController.exitInternalAction("_gT46kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_gT1QMLvVEeyr6avTgCRLkQ");
}
}

}
