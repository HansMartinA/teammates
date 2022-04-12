package teammates.ui.webapi;

import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.util.Const;
class DowngradeAccountAction extends AdminOnlyAction {
@Override
public  JsonResult execute() {
String instructorId = getNonNullRequestParamValue(Const.ParamsNames.INSTRUCTOR_ID);
try {
logic.downgradeInstructorToStudentCascade(instructorId);
}
catch(EntityDoesNotExistException e){
throw new  EntityNotFoundException(e);
}
return new  JsonResult("Instructor account is successfully downgraded to student.");
}

}
