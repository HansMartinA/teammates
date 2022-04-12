package teammates.ui.webapi;

import teammates.common.util.Logger;
import teammates.ui.request.ErrorReportRequest;
import teammates.ui.request.InvalidHttpRequestBodyException;
class SendErrorReportAction extends Action {
private static final Logger log = Logger.getLogger();

@Override
 AuthType getMinAuthLevel() {
return AuthType.PUBLIC;
}

@Override
 void checkSpecificAccessControl() {
}

@Override
public  JsonResult execute()throws InvalidHttpRequestBodyException {
ErrorReportRequest report = getAndValidateRequestBody(ErrorReportRequest.class);
log.severe(getUserErrorReportLogMessage(report));
return new  JsonResult("Error report successfully sent");
}

 String getUserErrorReportLogMessage(ErrorReportRequest report) {
String user = userInfo == null ? "Non-logged in user" : userInfo.id;
return "====== USER FEEDBACK ABOUT ERROR ======" + System.lineSeparator() + "USER: " + user + System.lineSeparator() + "REQUEST ID: " + report.getRequestId() + System.lineSeparator() + "SUBJECT: " + report.getSubject() + System.lineSeparator() + "CONTENT: " + report.getContent();
}

}
