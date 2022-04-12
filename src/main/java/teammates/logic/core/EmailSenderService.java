package teammates.logic.core;

import teammates.common.exception.EmailSendingException;
import teammates.common.util.EmailSendingStatus;
import teammates.common.util.EmailWrapper;
public interface EmailSenderService {
 Object parseToEmail(EmailWrapper wrapper) ;

 EmailSendingStatus sendEmail(EmailWrapper wrapper)throws EmailSendingException ;

}
