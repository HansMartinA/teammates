package teammates.common.datatransfer.logs;

public enum LogEvent {
REQUEST_LOG (RequestLogDetails.class),
EXCEPTION_LOG (ExceptionLogDetails.class),
INSTANCE_LOG (InstanceLogDetails.class),
EMAIL_SENT (EmailSentLogDetails.class),
FEEDBACK_SESSION_AUDIT (FeedbackSessionAuditLogDetails.class),
DEFAULT_LOG (DefaultLogDetails.class),
;

private final Class<? extends LogDetails> detailsClass;

 LogEvent(Class<? extends LogDetails> detailsClass){
this.detailsClass = detailsClass;
}
public  Class<? extends LogDetails> getDetailsClass() {
return detailsClass;
}

}
