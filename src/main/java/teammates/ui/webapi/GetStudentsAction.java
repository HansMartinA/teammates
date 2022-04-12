package teammates.ui.webapi;

import java.util.List;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.util.Const;
import teammates.ui.output.StudentData;
import teammates.ui.output.StudentsData;
class GetStudentsAction extends Action {
@Override
 AuthType getMinAuthLevel() {
return AuthType.LOGGED_IN;
}

@Override
 void checkSpecificAccessControl()throws UnauthorizedAccessException {
String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
String teamName = getRequestParamValue(Const.ParamsNames.TEAM_NAME);
if (teamName == null)
{
InstructorAttributes instructor = logic.getInstructorForGoogleId(courseId, userInfo.id);
gateKeeper.verifyAccessible(instructor, logic.getCourse(courseId));
}
else
{
StudentAttributes student = logic.getStudentForGoogleId(courseId, userInfo.id);
if (student == null || !teamName.equals(student.getTeam()))
{
throw new  UnauthorizedAccessException("You are not part of the team");
}
}
}

@Override
public  JsonResult execute() {
String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
String teamName = getRequestParamValue(Const.ParamsNames.TEAM_NAME);
if (teamName == null)
{
List<StudentAttributes> studentsForCourse = logic.getStudentsForCourse(courseId);
return new  JsonResult(new  StudentsData(studentsForCourse));
}
else
{
List<StudentAttributes> studentsForTeam = logic.getStudentsForTeam(teamName, courseId);
StudentsData studentsData = new  StudentsData(studentsForTeam);
studentsData.getStudents().forEach(StudentData::hideInformationForStudent);
return new  JsonResult(studentsData);
}
}

}
