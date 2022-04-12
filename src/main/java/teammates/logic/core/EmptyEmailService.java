package teammates.logic.core;

import org.apache.http.HttpStatus;
import teammates.common.util.EmailSendingStatus;
import teammates.common.util.EmailWrapper;
public class EmptyEmailService implements EmailSenderService {
@Override
public  EmailWrapper parseToEmail(EmailWrapper wrapper) {
return wrapper;
}

@Override
public  EmailSendingStatus sendEmail(EmailWrapper wrapper) {
return new  EmailSendingStatus(HttpStatus.SC_OK, null);
}

}
