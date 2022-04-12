package teammates.ui.webapi;

import org.apache.http.HttpStatus;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.exception.SearchServiceException;
import teammates.common.util.Const.ParamsNames;
public class InstructorSearchIndexingWorkerAction extends AdminOnlyAction {
@Override
public  ActionResult execute() {
String courseId = getNonNullRequestParamValue(ParamsNames.COURSE_ID);
String email = getNonNullRequestParamValue(ParamsNames.INSTRUCTOR_EMAIL);
InstructorAttributes instructor = logic.getInstructorForEmail(courseId, email);
try {
logic.putInstructorDocument(instructor);
}
catch(SearchServiceException e){
return new  JsonResult("Failure", HttpStatus.SC_BAD_GATEWAY);
}
return new  JsonResult("Successful");
}

}
