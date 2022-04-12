package teammates.ui.webapi;

import org.apache.http.HttpStatus;
import teammates.common.util.EmailSendingStatus;
import teammates.common.util.EmailWrapper;
import teammates.ui.request.InvalidHttpRequestBodyException;
import teammates.ui.request.SendEmailRequest;
class SendEmailWorkerAction extends AdminOnlyAction {
@Override
public  JsonResult execute()throws InvalidHttpRequestBodyException {
SendEmailRequest emailRequest = getAndValidateRequestBody(SendEmailRequest.class);
EmailWrapper email = emailRequest.getEmail();
EmailSendingStatus status = emailSender.sendEmail(email);
if (!status.isSuccess())
{
return new  JsonResult("Failure", HttpStatus.SC_BAD_GATEWAY);
}
return new  JsonResult("Successful");
}

}
