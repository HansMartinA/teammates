package teammates.ui.servlets;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.Logger;
@Deprecated
public class LegacyUrlMapper extends HttpServlet {
private static final Logger log = Logger.getLogger();

@Override
public  void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("req", req);
monitoringServiceParameters.addValue("resp", resp);
threadMonitoringController.enterService("_xkhpkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_xkks4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String uri = req.getRequestURI();
if (uri.contains(";"))
{
uri = uri.split(";")[0];
}
String baseRedirectUrl;
String redirectUrl;
String key;
String courseId;
String fsName;
switch (uri) {
case Const.LegacyURIs.INSTRUCTOR_COURSE_JOIN: threadMonitoringController.enterInternalAction("_xlBY1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = Const.WebPageURIs.JOIN_PAGE;
threadMonitoringController.exitInternalAction("_xlBY1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
key = req.getParameter(Const.ParamsNames.REGKEY);
threadMonitoringController.setExternalCallId("_xlB_4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlCm8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlDOALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlDOAbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlD1ELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlEcILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlFDMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlFqQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlGRULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlG4YLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlHfcLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlIGgLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlIGgbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlItkLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlJUoLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlJ7sLngEeyIw-dB1KCaVA");
redirectUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.JOIN_PAGE).withRegistrationKey(key).withEntityType(Const.EntityType.INSTRUCTOR).toString();
break;
case Const.LegacyURIs.STUDENT_COURSE_JOIN: case Const.LegacyURIs.STUDENT_COURSE_JOIN_NEW: threadMonitoringController.enterInternalAction("_xlLJ0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_xlR3hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = Const.WebPageURIs.JOIN_PAGE;
threadMonitoringController.exitInternalAction("_xlR3hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_xlLJ0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
key = req.getParameter(Const.ParamsNames.REGKEY);
threadMonitoringController.setExternalCallId("_xlLJ0bngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlLJ0rngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlLw4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlMX8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlM_ALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlNmELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlNmEbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlONILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlO0MLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlO0MbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlPbQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlQCULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlQCUbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlQpYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlRQcLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlRQcbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlR3hbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlSekLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlTFoLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlTssLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlUTwLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlU60LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlVh4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlWI8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlWwALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlWwAbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlXXELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlX-ILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlX-IbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlYlMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlZMQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlZMQbngEeyIw-dB1KCaVA");
redirectUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.JOIN_PAGE).withRegistrationKey(key).withEntityType(Const.EntityType.STUDENT).toString();
break;
case Const.LegacyURIs.STUDENT_HOME_PAGE: threadMonitoringController.enterInternalAction("_xlZzVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = Const.WebPageURIs.STUDENT_HOME_PAGE;
threadMonitoringController.exitInternalAction("_xlZzVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_xlZzVbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlaaYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlbBcLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlbBcbngEeyIw-dB1KCaVA");
redirectUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.STUDENT_HOME_PAGE).toString();
break;
case Const.LegacyURIs.INSTRUCTOR_HOME_PAGE: threadMonitoringController.enterInternalAction("_xlbohLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = Const.WebPageURIs.INSTRUCTOR_HOME_PAGE;
threadMonitoringController.exitInternalAction("_xlbohLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_xlbohbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlcPkLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlc2oLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlc2obngEeyIw-dB1KCaVA");
redirectUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.INSTRUCTOR_HOME_PAGE).toString();
break;
case Const.LegacyURIs.STUDENT_FEEDBACK_SUBMISSION_EDIT_PAGE: threadMonitoringController.enterInternalAction("_xlddtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = Const.WebPageURIs.SESSION_SUBMISSION_PAGE;
threadMonitoringController.exitInternalAction("_xlddtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
key = req.getParameter(Const.ParamsNames.REGKEY);
courseId = req.getParameter(Const.ParamsNames.COURSE_ID);
fsName = req.getParameter(Const.ParamsNames.FEEDBACK_SESSION_NAME);
threadMonitoringController.setExternalCallId("_xlddtbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xleEwLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlfS4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlf58LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlf58bngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlghALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlhIELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlhIEbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlhvILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xliWMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xljkULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlkycLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlmAkLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlmnoLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlmnobngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlnOsLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xln1wLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xloc0LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlpD4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlpq8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlpq8bngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlq5ELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlq5EbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlrgILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlsHMLngEeyIw-dB1KCaVA");
redirectUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_SUBMISSION_PAGE).withRegistrationKey(key).withCourseId(courseId).withSessionName(fsName).toString();
break;
case Const.LegacyURIs.INSTRUCTOR_FEEDBACK_SUBMISSION_EDIT_PAGE: threadMonitoringController.enterInternalAction("_xltVVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = Const.WebPageURIs.INSTRUCTOR_SESSION_SUBMISSION_PAGE;
threadMonitoringController.exitInternalAction("_xltVVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
courseId = req.getParameter(Const.ParamsNames.COURSE_ID);
fsName = req.getParameter(Const.ParamsNames.FEEDBACK_SESSION_NAME);
threadMonitoringController.setExternalCallId("_xltVVbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlt8YLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlvKgLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlvxkLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlw_sLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlxmwLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlyN0LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xlzb8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl0qELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl1RILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl2fQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl2fQbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl3GULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl3tYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl4UcLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl4UcbngEeyIw-dB1KCaVA");
redirectUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.INSTRUCTOR_SESSION_SUBMISSION_PAGE).withCourseId(courseId).withSessionName(fsName).toString();
break;
case Const.LegacyURIs.STUDENT_FEEDBACK_RESULTS_PAGE: threadMonitoringController.enterInternalAction("_xl47hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = Const.WebPageURIs.SESSION_RESULTS_PAGE;
threadMonitoringController.exitInternalAction("_xl47hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
key = req.getParameter(Const.ParamsNames.REGKEY);
courseId = req.getParameter(Const.ParamsNames.COURSE_ID);
fsName = req.getParameter(Const.ParamsNames.FEEDBACK_SESSION_NAME);
threadMonitoringController.setExternalCallId("_xl47hbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl5ikLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl5ikbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl6JoLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl6wsLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl6wsbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl7XwLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl7XwbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl7-0LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl8l4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl9M8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl90ALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl-bELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl-bEbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl_CILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xl_pMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmAQQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmAQQbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmA3ULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmA3UbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmBeYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmCFcLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmCFcbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmCsgLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmDTkLngEeyIw-dB1KCaVA");
redirectUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.SESSION_RESULTS_PAGE).withRegistrationKey(key).withCourseId(courseId).withSessionName(fsName).toString();
break;
case Const.LegacyURIs.INSTRUCTOR_FEEDBACK_RESULTS_PAGE: threadMonitoringController.enterInternalAction("_xmD6pLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = Const.WebPageURIs.INSTRUCTOR_SESSION_RESULTS_PAGE;
threadMonitoringController.exitInternalAction("_xmD6pLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
courseId = req.getParameter(Const.ParamsNames.COURSE_ID);
fsName = req.getParameter(Const.ParamsNames.FEEDBACK_SESSION_NAME);
threadMonitoringController.setExternalCallId("_xmD6pbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmEhsLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmFIwLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmFIwbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmFv0LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmGW4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmHlALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmIMELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmIzILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmJaMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmJaMbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmKBQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmKoULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmKoUbngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmLPYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_xmMdgLngEeyIw-dB1KCaVA");
redirectUrl = Config.getFrontEndAppUrl(Const.WebPageURIs.INSTRUCTOR_SESSION_RESULTS_PAGE).withCourseId(courseId).withSessionName(fsName).toString();
break;
default: threadMonitoringController.enterInternalAction("_xmOSsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
baseRedirectUrl = "/";
threadMonitoringController.exitInternalAction("_xmOSsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
redirectUrl = "/";
threadMonitoringController.setExternalCallId("_xmOSsbngEeyIw-dB1KCaVA");
log.warning("Unmapped legacy URL: " + uri);
break;

}
log.request(req, HttpStatus.SC_MOVED_PERMANENTLY, "Redirect legacy URL from " + uri + " to " + baseRedirectUrl);
resp.sendRedirect(redirectUrl);
threadMonitoringController.exitInternalAction("_xkks4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_xkhpkLngEeyIw-dB1KCaVA");
}
}

}
