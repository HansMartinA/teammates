package teammates.ui.webapi;

import teammates.common.datatransfer.InstructorPrivileges;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Const;
import teammates.common.util.SanitizationHelper;
import teammates.ui.output.InstructorData;
import teammates.ui.request.InstructorCreateRequest;
import teammates.ui.request.InvalidHttpRequestBodyException;
class CreateInstructorAction extends Action {
@Override
 AuthType getMinAuthLevel() {
return AuthType.LOGGED_IN;
}

@Override
 void checkSpecificAccessControl()throws UnauthorizedAccessException {
if (userInfo.isAdmin)
{
return;
}
if (!userInfo.isInstructor)
{
throw new  UnauthorizedAccessException("Instructor privilege is required to access this resource.");
}
String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
InstructorAttributes instructor = logic.getInstructorForGoogleId(courseId, userInfo.id);
gateKeeper.verifyAccessible(instructor, logic.getCourse(courseId), Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR);
}

@Override
public  JsonResult execute()throws InvalidHttpRequestBodyException, InvalidOperationException {
String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
InstructorCreateRequest instructorRequest = getAndValidateRequestBody(InstructorCreateRequest.class);
InstructorAttributes instructorToAdd = createInstructorWithBasicAttributes(courseId, instructorRequest.getName(), instructorRequest.getEmail(), instructorRequest.getRoleName(), instructorRequest.getIsDisplayedToStudent(), instructorRequest.getDisplayName());
try {
InstructorAttributes createdInstructor = logic.createInstructor(instructorToAdd);
taskQueuer.scheduleCourseRegistrationInviteToInstructor(userInfo.id, instructorToAdd.getEmail(), instructorToAdd.getCourseId(), false);
taskQueuer.scheduleInstructorForSearchIndexing(createdInstructor.getCourseId(), createdInstructor.getEmail());
return new  JsonResult(new  InstructorData(createdInstructor));
}
catch(EntityAlreadyExistsException e){
throw new  InvalidOperationException("An instructor with the same email address already exists in the course.", e);
}
catch(InvalidParametersException e){
throw new  InvalidHttpRequestBodyException(e);
}
}

private  InstructorAttributes createInstructorWithBasicAttributes(String courseId, String instructorName, String instructorEmail, String instructorRole, boolean isDisplayedToStudents, String displayedName) {
String instrName = SanitizationHelper.sanitizeName(instructorName);
String instrEmail = SanitizationHelper.sanitizeEmail(instructorEmail);
String instrRole = SanitizationHelper.sanitizeName(instructorRole);
String instrDisplayedName = displayedName;
if (displayedName == null || displayedName.isEmpty())
{
instrDisplayedName = Const.DEFAULT_DISPLAY_NAME_FOR_INSTRUCTOR;
}
instrDisplayedName = SanitizationHelper.sanitizeName(instrDisplayedName);
InstructorPrivileges privileges = new  InstructorPrivileges(instructorRole);
return InstructorAttributes.builder(courseId, instrEmail).withName(instrName).withRole(instrRole).withIsDisplayedToStudents(isDisplayedToStudents).withDisplayedName(instrDisplayedName).withPrivileges(privileges).build();
}

}
