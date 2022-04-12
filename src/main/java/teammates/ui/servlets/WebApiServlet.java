package teammates.ui.servlets;

import java.io.IOException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import com.google.cloud.datastore.DatastoreException;
import teammates.common.datatransfer.logs.RequestLogUser;
import teammates.common.exception.DeadlineExceededException;
import teammates.common.util.Logger;
import teammates.ui.request.InvalidHttpRequestBodyException;
import teammates.ui.webapi.Action;
import teammates.ui.webapi.ActionFactory;
import teammates.ui.webapi.ActionMappingException;
import teammates.ui.webapi.ActionResult;
import teammates.ui.webapi.EntityNotFoundException;
import teammates.ui.webapi.InvalidHttpParameterException;
import teammates.ui.webapi.InvalidOperationException;
import teammates.ui.webapi.JsonResult;
import teammates.ui.webapi.UnauthorizedAccessException;
@MultipartConfig
public class WebApiServlet extends HttpServlet {
private static final Logger log = Logger.getLogger();

@Override
public  void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xwrPMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_xwuSgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
invokeServlet(req, resp);
threadMonitoringController.exitInternalAction("_xwuSgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_xwrPMLngEeyIw-dB1KCaVA");
}
}

@Override
public  void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xwzyELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_xw3ccLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
invokeServlet(req, resp);
threadMonitoringController.exitInternalAction("_xw3ccLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_xwzyELngEeyIw-dB1KCaVA");
}
}

@Override
public  void doPut(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xw9jELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_xxBNcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
invokeServlet(req, resp);
threadMonitoringController.exitInternalAction("_xxBNcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_xw9jELngEeyIw-dB1KCaVA");
}
}

@Override
public  void doDelete(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xxGF8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_xxKXYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
invokeServlet(req, resp);
threadMonitoringController.exitInternalAction("_xxKXYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_xxGF8LngEeyIw-dB1KCaVA");
}
}

@SuppressWarnings("PMD.AvoidCatchingThrowable")
private  void invokeServlet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
int statusCode = 0;
Action action = null;
try {
action = ActionFactory.getAction(req, req.getMethod());
action.init(req);
action.checkAccessControl();
ActionResult result = action.execute();
statusCode = result.getStatusCode();
result.send(resp);
}
catch(ActionMappingException e){
statusCode = e.getStatusCode();
throwErrorBasedOnRequester(req, resp, e, statusCode);
}
catch(InvalidHttpRequestBodyException | InvalidHttpParameterException e){
statusCode = HttpStatus.SC_BAD_REQUEST;
throwErrorBasedOnRequester(req, resp, e, statusCode);
}
catch(UnauthorizedAccessException uae){
statusCode = HttpStatus.SC_FORBIDDEN;
log.warning(uae.getClass().getSimpleName() + " caught by WebApiServlet: " + uae.getMessage(), uae);
throwError(resp, statusCode, uae.isShowErrorMessage() ? uae.getMessage() : "You are not authorized to access this resource.");
}
catch(EntityNotFoundException enfe){
statusCode = HttpStatus.SC_NOT_FOUND;
log.warning(enfe.getClass().getSimpleName() + " caught by WebApiServlet: " + enfe.getMessage(), enfe);
throwError(resp, statusCode, enfe.getMessage());
}
catch(InvalidOperationException ioe){
statusCode = HttpStatus.SC_CONFLICT;
log.warning(ioe.getClass().getSimpleName() + " caught by WebApiServlet: " + ioe.getMessage(), ioe);
throwError(resp, statusCode, ioe.getMessage());
}
catch(DeadlineExceededException dee){
statusCode = HttpStatus.SC_GATEWAY_TIMEOUT;
log.severe(dee.getClass().getSimpleName() + " caught by WebApiServlet", dee);
throwError(resp, statusCode, "The request exceeded the server timeout limit. Please try again later.");
}
catch(DatastoreException e){
statusCode = HttpStatus.SC_INTERNAL_SERVER_ERROR;
log.severe(e.getClass().getSimpleName() + " caught by WebApiServlet: " + e.getMessage(), e);
throwError(resp, statusCode, e.getMessage());
}
catch(Throwable t){
statusCode = HttpStatus.SC_INTERNAL_SERVER_ERROR;
log.severe(t.getClass().getSimpleName() + " caught by WebApiServlet: " + t.getMessage(), t);
throwError(resp, statusCode, "The server encountered an error when processing your request.");
}
finally {
RequestLogUser userInfo = new  RequestLogUser();
String requestBody = null;
String actionClass = null;
if (action != null)
{
if (action.hasDefinedRequestBody())
{
requestBody = action.getRequestBody();
}
actionClass = action.getClass().getSimpleName();
userInfo = action.getUserInfoForLogging();
}
log.request(req, statusCode, actionClass, userInfo, requestBody, actionClass);
}
}

private  void throwErrorBasedOnRequester(HttpServletRequest req, HttpServletResponse resp, Exception e, int statusCode)throws IOException {
boolean isRequestFromAppEngineQueue = req.getHeader("X-AppEngine-QueueName") != null;
if (isRequestFromAppEngineQueue)
{
log.severe(e.getClass().getSimpleName() + " caught by WebApiServlet: " + e.getMessage(), e);
throwError(resp, HttpStatus.SC_ACCEPTED, e.getMessage());
}
else
{
log.warning(e.getClass().getSimpleName() + " caught by WebApiServlet: " + e.getMessage(), e);
throwError(resp, statusCode, e.getMessage());
}
}

private  void throwError(HttpServletResponse resp, int statusCode, String message)throws IOException {
JsonResult result = new  JsonResult(message, statusCode);
result.send(resp);
}

}
