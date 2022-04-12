package teammates.ui.webapi;

import java.util.List;
import java.util.stream.Collectors;
import teammates.common.datatransfer.attributes.CourseAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.util.Const;
import teammates.ui.output.InstructorData;
import teammates.ui.output.InstructorsData;
import teammates.ui.request.Intent;
class GetInstructorsAction extends Action {
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
String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
CourseAttributes course = logic.getCourse(courseId);
if (course == null)
{
throw new  EntityNotFoundException("course not found");
}
String intentStr = getRequestParamValue(Const.ParamsNames.INTENT);
if (intentStr == null)
{
StudentAttributes student = logic.getStudentForGoogleId(courseId, userInfo.getId());
gateKeeper.verifyAccessible(student, course);
}
else
if (intentStr.equals(Intent.FULL_DETAIL.toString()))
{
InstructorAttributes instructor = logic.getInstructorForGoogleId(courseId, userInfo.getId());
gateKeeper.verifyAccessible(instructor, course);
}
else
{
throw new  InvalidHttpParameterException("unknown intent");
}
}

@Override
public  JsonResult execute() {
String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
List<InstructorAttributes> instructorsOfCourse = logic.getInstructorsForCourse(courseId);
InstructorsData data;
String intentStr = getRequestParamValue(Const.ParamsNames.INTENT);
if (intentStr == null)
{
instructorsOfCourse = instructorsOfCourse.stream().filter(InstructorAttributes::isDisplayedToStudents).collect(Collectors.toList());
data = new  InstructorsData(instructorsOfCourse);
data.getInstructors().forEach(i -> {
i.setGoogleId(null);
i.setJoinState(null);
i.setIsDisplayedToStudents(null);
i.setRole(null);
}
);
}
else
if (intentStr.equals(Intent.FULL_DETAIL.toString()))
{
if (userInfo.isAdmin || logic.getInstructorForGoogleId(courseId, userInfo.getId()).getPrivileges().isAllowedForPrivilege(Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR))
{
data = new  InstructorsData();
for (InstructorAttributes instructor : instructorsOfCourse)
{
InstructorData instructorData = new  InstructorData(instructor);
instructorData.setGoogleId(instructor.getGoogleId());
if (userInfo.isAdmin)
{
instructorData.setKey(instructor.getKey());
}
data.getInstructors().add(instructorData);
}
}
else
{
data = new  InstructorsData(instructorsOfCourse);
}
}
else
{
throw new  InvalidHttpParameterException("unknown intent");
}
return new  JsonResult(data);
}

}
