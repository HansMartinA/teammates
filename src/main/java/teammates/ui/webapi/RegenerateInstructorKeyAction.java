package teammates.ui.webapi;

import org.apache.http.HttpStatus;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.util.Const;
import teammates.common.util.EmailSendingStatus;
import teammates.common.util.EmailType;
import teammates.common.util.EmailWrapper;
import teammates.ui.output.RegenerateKeyData;
class RegenerateInstructorKeyAction extends AdminOnlyAction {
private static final String SUCCESSFUL_REGENERATION = "Instructor's key for this course has been successfully regenerated,";

static final String SUCCESSFUL_REGENERATION_WITH_EMAIL_SENT = SUCCESSFUL_REGENERATION + " and the email has been sent.";

private static final String UNSUCCESSFUL_REGENERATION = "Regeneration of the instructor's key was unsuccessful.";

private static final String SUCCESSFUL_REGENERATION_BUT_EMAIL_FAILED = SUCCESSFUL_REGENERATION + " but the email failed to send.";

@Override
public  JsonResult execute() {
String instructorEmailAddress = getNonNullRequestParamValue(Const.ParamsNames.INSTRUCTOR_EMAIL);
String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
InstructorAttributes updatedInstructor;
try {
updatedInstructor = logic.regenerateInstructorRegistrationKey(courseId, instructorEmailAddress);
}
catch(EntityDoesNotExistException ex){
throw new  EntityNotFoundException(ex);
}
catch(EntityAlreadyExistsException ex){
return new  JsonResult(UNSUCCESSFUL_REGENERATION, HttpStatus.SC_INTERNAL_SERVER_ERROR);
}
boolean emailSent = sendEmail(updatedInstructor);
String statusMessage = emailSent ? SUCCESSFUL_REGENERATION_WITH_EMAIL_SENT : SUCCESSFUL_REGENERATION_BUT_EMAIL_FAILED;
return new  JsonResult(new  RegenerateKeyData(statusMessage, updatedInstructor.getKey()));
}

private  boolean sendEmail(InstructorAttributes instructor) {
EmailWrapper email = emailGenerator.generateFeedbackSessionSummaryOfCourse(instructor.getCourseId(), instructor.getEmail(), EmailType.INSTRUCTOR_COURSE_LINKS_REGENERATED);
EmailSendingStatus status = emailSender.sendEmail(email);
return status.isSuccess();
}

}
