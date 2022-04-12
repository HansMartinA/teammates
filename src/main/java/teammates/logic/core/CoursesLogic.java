package teammates.logic.core;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.InstructorPrivileges;
import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.attributes.CourseAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Const;
import teammates.common.util.Logger;
import teammates.storage.api.CoursesDb;
public final class CoursesLogic {
private static final Logger log = Logger.getLogger();

private static final CoursesLogic instance = new  CoursesLogic();

private final CoursesDb coursesDb = CoursesDb.inst();

private AccountsLogic accountsLogic;

private FeedbackSessionsLogic feedbackSessionsLogic;

private FeedbackQuestionsLogic fqLogic;

private FeedbackResponsesLogic frLogic;

private FeedbackResponseCommentsLogic frcLogic;

private InstructorsLogic instructorsLogic;

private StudentsLogic studentsLogic;

private  CoursesLogic(){
}
public static  CoursesLogic inst() {
return instance;
}

 void initLogicDependencies() {
accountsLogic = AccountsLogic.inst();
feedbackSessionsLogic = FeedbackSessionsLogic.inst();
fqLogic = FeedbackQuestionsLogic.inst();
frLogic = FeedbackResponsesLogic.inst();
frcLogic = FeedbackResponseCommentsLogic.inst();
instructorsLogic = InstructorsLogic.inst();
studentsLogic = StudentsLogic.inst();
}

public  String getCourseInstitute(String courseId) {
CourseAttributes cd = getCourse(courseId);
assert cd != null : "Trying to getCourseInstitute for inexistent course with id " + courseId;
return cd.getInstitute();
}

 CourseAttributes createCourse(CourseAttributes courseToCreate)throws InvalidParametersException, EntityAlreadyExistsException {
return coursesDb.createEntity(courseToCreate);
}

public  void createCourseAndInstructor(String instructorGoogleId, CourseAttributes courseToCreate)throws InvalidParametersException, EntityAlreadyExistsException {
AccountAttributes courseCreator = accountsLogic.getAccount(instructorGoogleId);
assert courseCreator != null : "Trying to create a course for a non-existent instructor :" + instructorGoogleId;
assert courseCreator.isInstructor() : "Trying to create a course for a person who doesn't have instructor privileges :" + instructorGoogleId;
CourseAttributes createdCourse = createCourse(courseToCreate);
InstructorPrivileges privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
InstructorAttributes instructor = InstructorAttributes.builder(createdCourse.getId(), courseCreator.getEmail()).withName(courseCreator.getName()).withGoogleId(instructorGoogleId).withPrivileges(privileges).build();
try {
instructorsLogic.createInstructor(instructor);
}
catch(EntityAlreadyExistsException | InvalidParametersException e){
coursesDb.deleteCourse(createdCourse.getId());
String errorMessage = "Unexpected exception while trying to create instructor for a new course " + System.lineSeparator() + instructor.toString();
assert false : errorMessage;
}
}

public  CourseAttributes getCourse(String courseId) {
return coursesDb.getCourse(courseId);
}

public  boolean isCoursePresent(String courseId) {
return coursesDb.getCourse(courseId) != null;
}

 void verifyCourseIsPresent(String courseId)throws EntityDoesNotExistException {
if (!isCoursePresent(courseId))
{
throw new  EntityDoesNotExistException("Course does not exist: " + courseId);
}
}

public  List<String> getSectionsNameForCourse(String courseId)throws EntityDoesNotExistException {
verifyCourseIsPresent(courseId);
List<StudentAttributes> studentDataList = studentsLogic.getStudentsForCourse(courseId);
Set<String> sectionNameSet = new  HashSet<>();
for (StudentAttributes sd : studentDataList)
{
if (!Const.DEFAULT_SECTION.equals(sd.getSection()))
{
sectionNameSet.add(sd.getSection());
}
}
List<String> sectionNameList = new  ArrayList<>(sectionNameSet);
sectionNameList.sort(null);
return sectionNameList;
}

public  List<String> getTeamsForCourse(String courseId)throws EntityDoesNotExistException {
if (getCourse(courseId) == null)
{
throw new  EntityDoesNotExistException("The course " + courseId + " does not exist");
}
return studentsLogic.getStudentsForCourse(courseId).stream().map(StudentAttributes::getTeam).distinct().sorted().collect(Collectors.toList());
}

public  List<String> getTeamsForSection(String sectionName, String courseId)throws EntityDoesNotExistException {
if (getCourse(courseId) == null)
{
throw new  EntityDoesNotExistException("The course " + courseId + " does not exist");
}
return studentsLogic.getStudentsForCourse(courseId).stream().filter(studentAttributes -> studentAttributes.getSection().equals(sectionName)).map(StudentAttributes::getTeam).distinct().sorted().collect(Collectors.toList());
}

public  List<CourseAttributes> getCoursesForStudentAccount(String googleId) {
List<StudentAttributes> studentDataList = studentsLogic.getStudentsForGoogleId(googleId);
List<String> courseIds = studentDataList.stream().filter(student -> !getCourse(student.getCourse()).isCourseDeleted()).map(StudentAttributes::getCourse).collect(Collectors.toList());
return coursesDb.getCourses(courseIds);
}

public  List<CourseAttributes> getCoursesForInstructor(List<InstructorAttributes> instructorList) {
assert instructorList != null;
List<String> courseIdList = instructorList.stream().filter(instructor -> !coursesDb.getCourse(instructor.getCourseId()).isCourseDeleted()).map(InstructorAttributes::getCourseId).collect(Collectors.toList());
List<CourseAttributes> courseList = coursesDb.getCourses(courseIdList);
if (courseIdList.size() > courseList.size())
{
for (CourseAttributes ca : courseList)
{
courseIdList.remove(ca.getId());
}
log.severe("Course(s) was deleted but the instructor still exists: " + System.lineSeparator() + courseIdList.toString());
}
return courseList;
}

public  List<CourseAttributes> getSoftDeletedCoursesForInstructors(List<InstructorAttributes> instructorList) {
assert instructorList != null;
List<String> softDeletedCourseIdList = instructorList.stream().filter(instructor -> coursesDb.getCourse(instructor.getCourseId()).isCourseDeleted()).map(InstructorAttributes::getCourseId).collect(Collectors.toList());
List<CourseAttributes> softDeletedCourseList = coursesDb.getCourses(softDeletedCourseIdList);
if (softDeletedCourseIdList.size() > softDeletedCourseList.size())
{
for (CourseAttributes ca : softDeletedCourseList)
{
softDeletedCourseIdList.remove(ca.getId());
}
log.severe("Course(s) was deleted but the instructor still exists: " + System.lineSeparator() + softDeletedCourseIdList.toString());
}
return softDeletedCourseList;
}

public  CourseAttributes updateCourseCascade(CourseAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
CourseAttributes oldCourse = coursesDb.getCourse(updateOptions.getCourseId());
CourseAttributes updatedCourse = coursesDb.updateCourse(updateOptions);
if (!updatedCourse.getTimeZone().equals(oldCourse.getTimeZone()))
{
feedbackSessionsLogic.updateFeedbackSessionsTimeZoneForCourse(updatedCourse.getId(), updatedCourse.getTimeZone());
}
return updatedCourse;
}

public  void deleteCourseCascade(String courseId) {
if (getCourse(courseId) == null)
{
return;
}
AttributesDeletionQuery query = AttributesDeletionQuery.builder().withCourseId(courseId).build();
frcLogic.deleteFeedbackResponseComments(query);
frLogic.deleteFeedbackResponses(query);
fqLogic.deleteFeedbackQuestions(query);
feedbackSessionsLogic.deleteFeedbackSessions(query);
studentsLogic.deleteStudents(query);
instructorsLogic.deleteInstructors(query);
coursesDb.deleteCourse(courseId);
}

public  Instant moveCourseToRecycleBin(String courseId)throws EntityDoesNotExistException {
return coursesDb.softDeleteCourse(courseId);
}

public  void restoreCourseFromRecycleBin(String courseId)throws EntityDoesNotExistException {
coursesDb.restoreDeletedCourse(courseId);
}

}
