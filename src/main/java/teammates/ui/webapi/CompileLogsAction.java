package teammates.ui.webapi;

import java.util.List;
import teammates.common.datatransfer.ErrorLogEntry;
import teammates.common.util.EmailWrapper;
class CompileLogsAction extends AdminOnlyAction {
@Override
public  JsonResult execute() {
List<ErrorLogEntry> errorLogs = logsProcessor.getRecentErrorLogs();
sendEmail(errorLogs);
return new  JsonResult("Successful");
}

private  void sendEmail(List<ErrorLogEntry> logs) {
if (!logs.isEmpty())
{
EmailWrapper message = emailGenerator.generateCompiledLogsEmail(logs);
emailSender.sendReport(message);
}
}

}
