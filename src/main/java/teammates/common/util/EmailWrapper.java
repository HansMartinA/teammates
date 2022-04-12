package teammates.common.util;

public class EmailWrapper {
public static final String EMAIL_COPY_SUBJECT_PREFIX = "[Email Copy] ";

private EmailType type;

private String senderName;

private String senderEmail;

private String replyTo;

private String recipient;

private String bcc;

private String subject;

private String content;

private boolean isCopy;

public  EmailType getType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tCisILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tCj6QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681764005884396947590723 = type;
threadMonitoringController.exitInternalAction("_tCj6QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681764005884396947590723;
}
finally {
threadMonitoringController.exitService("_tCisILngEeyIw-dB1KCaVA");
}
}

public  void setType(EmailType type) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("type", type);
threadMonitoringController.enterService("_tClvcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tCm9kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.type = type;
threadMonitoringController.exitInternalAction("_tCm9kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tClvcLngEeyIw-dB1KCaVA");
}
}

public  String getSenderName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tCpZ0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tCqn8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817680015991387512569677 = senderName;
threadMonitoringController.exitInternalAction("_tCqn8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817680015991387512569677;
}
finally {
threadMonitoringController.exitService("_tCpZ0LngEeyIw-dB1KCaVA");
}
}

public  void setSenderName(String senderName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("senderName", senderName);
threadMonitoringController.enterService("_tCtEMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tCuSULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.senderName = senderName;
threadMonitoringController.exitInternalAction("_tCuSULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tCtEMLngEeyIw-dB1KCaVA");
}
}

public  String getSenderEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tCwukLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tCyjwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681774008798242418600059 = senderEmail;
threadMonitoringController.exitInternalAction("_tCyjwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681774008798242418600059;
}
finally {
threadMonitoringController.exitService("_tCwukLngEeyIw-dB1KCaVA");
}
}

public  void setSenderEmail(String senderEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("senderEmail", senderEmail);
threadMonitoringController.enterService("_tC1AALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tC2OILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.senderEmail = senderEmail;
threadMonitoringController.exitInternalAction("_tC2OILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tC1AALngEeyIw-dB1KCaVA");
}
}

public  String getReplyTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tC4qYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tC54gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817800039921405100069973 = replyTo;
threadMonitoringController.exitInternalAction("_tC54gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817800039921405100069973;
}
finally {
threadMonitoringController.exitService("_tC4qYLngEeyIw-dB1KCaVA");
}
}

public  void setReplyTo(String replyTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("replyTo", replyTo);
threadMonitoringController.enterService("_tC870LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tC-J8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.replyTo = replyTo;
threadMonitoringController.exitInternalAction("_tC-J8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tC870LngEeyIw-dB1KCaVA");
}
}

public  String getRecipient() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tDAmMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDB0ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817860024486068583599963 = recipient;
threadMonitoringController.exitInternalAction("_tDB0ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817860024486068583599963;
}
finally {
threadMonitoringController.exitService("_tDAmMLngEeyIw-dB1KCaVA");
}
}

public  void setRecipient(String recipient) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("recipient", recipient);
threadMonitoringController.enterService("_tDEQkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDGFwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.recipient = recipient;
threadMonitoringController.exitInternalAction("_tDGFwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tDEQkLngEeyIw-dB1KCaVA");
}
}

public  String getBcc() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tDIiALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDKXMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681794004230772187498517 = bcc;
threadMonitoringController.exitInternalAction("_tDKXMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681794004230772187498517;
}
finally {
threadMonitoringController.exitService("_tDIiALngEeyIw-dB1KCaVA");
}
}

public  void setBcc(String bcc) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("bcc", bcc);
threadMonitoringController.enterService("_tDMzcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDOooLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.bcc = bcc;
threadMonitoringController.exitInternalAction("_tDOooLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tDMzcLngEeyIw-dB1KCaVA");
}
}

public  String getSubject() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tDRr8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDThILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817990007376924274228347 = subject;
threadMonitoringController.exitInternalAction("_tDThILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817990007376924274228347;
}
finally {
threadMonitoringController.exitService("_tDRr8LngEeyIw-dB1KCaVA");
}
}

public  void setSubject(String subject) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("subject", subject);
threadMonitoringController.enterService("_tDVWULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDXLgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.subject = subject;
threadMonitoringController.exitInternalAction("_tDXLgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tDVWULngEeyIw-dB1KCaVA");
}
}

public  void setSubjectFromType(Object  ...params) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("params", params);
threadMonitoringController.enterService("_tDZnwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDcEALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (type != null)
{
this.subject = String.format(type.getSubject(), params);
}
if (isCopy)
{
this.subject = EMAIL_COPY_SUBJECT_PREFIX + this.subject;
}
threadMonitoringController.exitInternalAction("_tDcEALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tDZnwLngEeyIw-dB1KCaVA");
}
}

public  String getContent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tDegQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDfuYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368180600028939624895472194 = content;
threadMonitoringController.exitInternalAction("_tDfuYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368180600028939624895472194;
}
finally {
threadMonitoringController.exitService("_tDegQLngEeyIw-dB1KCaVA");
}
}

public  void setContent(String content) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("content", content);
threadMonitoringController.enterService("_tDiKoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDjYwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.content = content;
threadMonitoringController.exitInternalAction("_tDjYwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tDiKoLngEeyIw-dB1KCaVA");
}
}

public  boolean getIsCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tDmcELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDnqMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681812007574184585566632 = isCopy;
threadMonitoringController.exitInternalAction("_tDnqMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681812007574184585566632;
}
finally {
threadMonitoringController.exitService("_tDmcELngEeyIw-dB1KCaVA");
}
}

public  void setIsCopy(boolean isCopy) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isCopy", isCopy);
threadMonitoringController.enterService("_tDqGcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tDrUkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.isCopy = isCopy;
threadMonitoringController.exitInternalAction("_tDrUkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tDqGcLngEeyIw-dB1KCaVA");
}
}

public  String getInfoForLogging() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_tDtw0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return "[Email sent]to=" + getRecipient() + "|from=" + getSenderEmail() + "|subject=" + getSubject();
}
finally {
threadMonitoringController.exitService("_tDtw0LngEeyIw-dB1KCaVA");
}
}

}
