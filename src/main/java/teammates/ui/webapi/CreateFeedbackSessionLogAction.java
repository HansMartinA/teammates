package teammates.ui.webapi;

import teammates.common.datatransfer.logs.FeedbackSessionAuditLogDetails;
import teammates.common.datatransfer.logs.FeedbackSessionLogType;
import teammates.common.util.Const;
import teammates.common.util.Logger;
class CreateFeedbackSessionLogAction extends Action {
private static final Logger log = Logger.getLogger();

@Override
 AuthType getMinAuthLevel() {
return AuthType.PUBLIC;
}

@Override
 void checkSpecificAccessControl() {
}

@Override
public  JsonResult execute() {
String fslType = getNonNullRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_LOG_TYPE);
FeedbackSessionLogType convertedFslType = FeedbackSessionLogType.valueOfLabel(fslType);
if (convertedFslType == null)
{
throw new  InvalidHttpParameterException("Invalid log type");
}
String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
String fsName = getNonNullRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_NAME);
String studentEmail = getNonNullRequestParamValue(Const.ParamsNames.STUDENT_EMAIL);
logsProcessor.createFeedbackSessionLog(courseId, studentEmail, fsName, fslType);
FeedbackSessionAuditLogDetails details = new  FeedbackSessionAuditLogDetails();
details.setCourseId(courseId);
details.setFeedbackSessionName(fsName);
details.setStudentEmail(studentEmail);
details.setAccessType(fslType);
log.event("Feedback session audit event: " + fslType, details);
return new  JsonResult("Successful");
}

}
