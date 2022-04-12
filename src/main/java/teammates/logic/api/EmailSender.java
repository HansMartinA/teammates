package teammates.logic.api;

import org.apache.http.HttpStatus;
import teammates.common.datatransfer.logs.EmailSentLogDetails;
import teammates.common.exception.EmailSendingException;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.EmailSendingStatus;
import teammates.common.util.EmailWrapper;
import teammates.common.util.Logger;
import teammates.logic.core.EmailSenderService;
import teammates.logic.core.EmptyEmailService;
import teammates.logic.core.MailgunService;
import teammates.logic.core.MailjetService;
import teammates.logic.core.SendgridService;
public class EmailSender {
private static final Logger log = Logger.getLogger();

private static final EmailSender instance = new  EmailSender();

private final EmailSenderService service;

 EmailSender(){
if (Config.isDevServer())
{
service = new  EmptyEmailService();
}
else
{
if (Config.isUsingSendgrid())
{
service = new  SendgridService();
}
else
if (Config.isUsingMailgun())
{
service = new  MailgunService();
}
else
if (Config.isUsingMailjet())
{
service = new  MailjetService();
}
else
{
service = new  EmptyEmailService();
}
}
}
public static  EmailSender inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_t0XxsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t0aN8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailSender longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368222300924557843237987 = instance;
threadMonitoringController.exitInternalAction("_t0aN8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368222300924557843237987;
}
finally {
threadMonitoringController.exitService("_t0XxsLngEeyIw-dB1KCaVA");
}
}

public  EmailSendingStatus sendEmail(EmailWrapper message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_t0dRQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t0fGcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (isTestingAccount(message.getRecipient()))
{
return new  EmailSendingStatus(HttpStatus.SC_OK, "Not sending email to test account");
}
EmailSendingStatus status;
EmailSendingException caughtE = null;
try {
status = service.sendEmail(message);
}
catch(EmailSendingException e){
caughtE = e;
status = new  EmailSendingStatus(e.getStatusCode(), e.getMessage());
}
if (!status.isSuccess())
{
threadMonitoringController.enterBranch("_t0iJwLngEeyIw-dB1KCaVA");
if (caughtE == null)
{
threadMonitoringController.enterBranch("_t0iJxLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0iJyLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0iJybngEeyIw-dB1KCaVA");
log.severe("Email failed to send: " + status.getMessage());
}
else
{
threadMonitoringController.setExternalCallId("_t0iw1LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0jX4LngEeyIw-dB1KCaVA");
log.severe("Email failed to send: " + status.getMessage(), caughtE);
}
}
EmailSentLogDetails details = new  EmailSentLogDetails();
threadMonitoringController.exitInternalAction("_t0fGcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_t0j-8LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0kmALngEeyIw-dB1KCaVA");
details.setEmailRecipient(message.getRecipient());
threadMonitoringController.setExternalCallId("_t0lNELngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0l0ILngEeyIw-dB1KCaVA");
details.setEmailSubject(message.getSubject());
threadMonitoringController.setExternalCallId("_t0mbMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0nCQLngEeyIw-dB1KCaVA");
details.setEmailContent(message.getContent());
threadMonitoringController.setExternalCallId("_t0npULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0oQYLngEeyIw-dB1KCaVA");
details.setEmailType(message.getType());
threadMonitoringController.setExternalCallId("_t0o3cLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0o3cbngEeyIw-dB1KCaVA");
details.setEmailStatus(status.getStatusCode());
if (status.getMessage() != null)
{
threadMonitoringController.enterBranch("_t0pegLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0pehLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0pehbngEeyIw-dB1KCaVA");
details.setEmailStatusMessage(status.getMessage());
}
threadMonitoringController.setExternalCallId("_t0qsobngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_t0r6wLngEeyIw-dB1KCaVA");
log.event("Email sent: " + message.getType(), details);
threadMonitoringController.enterInternalAction("_t0r6wbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailSendingStatus longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682252007017542300596769 = status;
threadMonitoringController.exitInternalAction("_t0r6wbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682252007017542300596769;
}
finally {
threadMonitoringController.exitService("_t0dRQLngEeyIw-dB1KCaVA");
}
}

private  boolean isTestingAccount(String email) {
return email.endsWith(Const.TEST_EMAIL_DOMAIN);
}

public  void sendReport(EmailWrapper report) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("report", report);
threadMonitoringController.enterService("_t0yocLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
try {
sendEmail(report);
}
catch(Exception e){
log.severe("Error in sending report: " + (report == null ? "" : report.getInfoForLogging()) + "\nReport content: " + (report == null ? "" : report.getContent()), e);
}
}
finally {
threadMonitoringController.exitService("_t0yocLngEeyIw-dB1KCaVA");
}
}

}
