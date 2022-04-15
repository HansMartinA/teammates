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
threadMonitoringController.enterService("_cZloMLvVEeyr6avTgCRLkQ", EmailSender.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cZndYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailSender longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024710007749083390924064 = instance;
threadMonitoringController.exitInternalAction("_cZndYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013024710007749083390924064;
}
finally {
threadMonitoringController.exitService("_cZloMLvVEeyr6avTgCRLkQ");
}
}

public  EmailSendingStatus sendEmail(EmailWrapper message) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_cZqgsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_cZs88LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.enterBranch("_cZvZMLvVEeyr6avTgCRLkQ");
if (caughtE == null)
{
threadMonitoringController.enterBranch("_cZvZNLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZwAQLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZwAQbvVEeyr6avTgCRLkQ");
log.severe("Email failed to send: " + status.getMessage());
}
else
{
threadMonitoringController.setExternalCallId("_cZwnVLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZwnVbvVEeyr6avTgCRLkQ");
log.severe("Email failed to send: " + status.getMessage(), caughtE);
}
}
EmailSentLogDetails details = new  EmailSentLogDetails();
threadMonitoringController.exitInternalAction("_cZs88LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_cZx1cLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZycgLvVEeyr6avTgCRLkQ");
details.setEmailRecipient(message.getRecipient());
threadMonitoringController.setExternalCallId("_cZzDkLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZzDkbvVEeyr6avTgCRLkQ");
details.setEmailSubject(message.getSubject());
threadMonitoringController.setExternalCallId("_cZ0RsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZ04wLvVEeyr6avTgCRLkQ");
details.setEmailContent(message.getContent());
threadMonitoringController.setExternalCallId("_cZ2G4LvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZ2t8LvVEeyr6avTgCRLkQ");
details.setEmailType(message.getType());
threadMonitoringController.setExternalCallId("_cZ3VALvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZ38ELvVEeyr6avTgCRLkQ");
details.setEmailStatus(status.getStatusCode());
if (status.getMessage() != null)
{
threadMonitoringController.enterBranch("_cZ4jILvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZ5KMLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZ5KMbvVEeyr6avTgCRLkQ");
details.setEmailStatusMessage(status.getMessage());
}
threadMonitoringController.setExternalCallId("_cZ5xQbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_cZ6YULvVEeyr6avTgCRLkQ");
log.event("Email sent: " + message.getType(), details);
threadMonitoringController.enterInternalAction("_cZ6YUbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
EmailSendingStatus longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302486900553924418939482 = status;
threadMonitoringController.exitInternalAction("_cZ6YUbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302486900553924418939482;
}
finally {
threadMonitoringController.exitService("_cZqgsLvVEeyr6avTgCRLkQ");
}
}

private  boolean isTestingAccount(String email) {
return email.endsWith(Const.TEST_EMAIL_DOMAIN);
}

public  void sendReport(EmailWrapper report) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("report", report);
threadMonitoringController.enterService("_cZ_34LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
try {
sendEmail(report);
}
catch(Exception e){
log.severe("Error in sending report: " + (report == null ? "" : report.getInfoForLogging()) + "\nReport content: " + (report == null ? "" : report.getContent()), e);
}
}
finally {
threadMonitoringController.exitService("_cZ_34LvVEeyr6avTgCRLkQ");
}
}

}
