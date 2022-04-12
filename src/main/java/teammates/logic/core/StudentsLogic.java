package teammates.logic.core;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.exception.EnrollException;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.exception.SearchServiceException;
import teammates.common.util.Const;
import teammates.common.util.RequestTracer;
import teammates.storage.api.StudentsDb;
public final class StudentsLogic {
static final String ERROR_INVALID_TEAM_NAME = "Team \"%s\" is detected in both Section \"%s\" and Section \"%s\".";

static final String ERROR_INVALID_TEAM_NAME_INSTRUCTION = "Please use different team names in different sections.";

static final String ERROR_ENROLL_EXCEED_SECTION_LIMIT = "You are trying enroll more than %s students in section \"%s\".";

static final String ERROR_ENROLL_EXCEED_SECTION_LIMIT_INSTRUCTION = "To avoid performance problems, please do not enroll more than %s students in a single section.";

private static final StudentsLogic instance = new  StudentsLogic();

private final StudentsDb studentsDb = StudentsDb.inst();

private FeedbackResponsesLogic frLogic;

private  StudentsLogic(){
}
public static  StudentsLogic inst() {
return instance;
}

 void initLogicDependencies() {
frLogic = FeedbackResponsesLogic.inst();
}

public  StudentAttributes createStudent(StudentAttributes studentData)throws InvalidParametersException, EntityAlreadyExistsException {
return studentsDb.createEntity(studentData);
}

public  StudentAttributes getStudentForEmail(String courseId, String email) {
return studentsDb.getStudentForEmail(courseId, email);
}

public  List<StudentAttributes> getAllStudentsForEmail(String email) {
return studentsDb.getAllStudentsForEmail(email);
}

public  StudentAttributes getStudentForCourseIdAndGoogleId(String courseId, String googleId) {
return studentsDb.getStudentForGoogleId(courseId, googleId);
}

public  StudentAttributes getStudentForRegistrationKey(String registrationKey) {
return studentsDb.getStudentForRegistrationKey(registrationKey);
}

public  List<StudentAttributes> getStudentsForGoogleId(String googleId) {
return studentsDb.getStudentsForGoogleId(googleId);
}

public  List<StudentAttributes> getStudentsForCourse(String courseId) {
return studentsDb.getStudentsForCourse(courseId);
}

public  List<StudentAttributes> getStudentsForSection(String sectionName, String courseId) {
return studentsDb.getStudentsForSection(sectionName, courseId);
}

public  List<StudentAttributes> getStudentsForTeam(String teamName, String courseId) {
return studentsDb.getStudentsForTeam(teamName, courseId);
}

public  List<StudentAttributes> getUnregisteredStudentsForCourse(String courseId) {
return studentsDb.getUnregisteredStudentsForCourse(courseId);
}

public  List<StudentAttributes> searchStudents(String queryString, List<InstructorAttributes> instructors)throws SearchServiceException {
return studentsDb.search(queryString, instructors);
}

public  List<StudentAttributes> searchStudentsInWholeSystem(String queryString)throws SearchServiceException {
return studentsDb.searchStudentsInWholeSystem(queryString);
}

public  boolean isStudentInAnyCourse(String googleId) {
return !getStudentsForGoogleId(googleId).isEmpty();
}

 boolean isStudentInTeam(String courseId, String teamName, String studentEmail) {
StudentAttributes student = getStudentForEmail(courseId, studentEmail);
if (student == null)
{
return false;
}
List<StudentAttributes> teammates = getStudentsForTeam(teamName, courseId);
for (StudentAttributes teammate : teammates)
{
if (teammate.getEmail().equals(student.getEmail()))
{
return true;
}
}
return false;
}

public  boolean isStudentsInSameTeam(String courseId, String student1Email, String student2Email) {
StudentAttributes student1 = getStudentForEmail(courseId, student1Email);
if (student1 == null)
{
return false;
}
return isStudentInTeam(courseId, student1.getTeam(), student2Email);
}

public  StudentAttributes updateStudentCascade(StudentAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
StudentAttributes originalStudent = getStudentForEmail(updateOptions.getCourseId(), updateOptions.getEmail());
StudentAttributes updatedStudent = studentsDb.updateStudent(updateOptions);
if (!originalStudent.getEmail().equals(updatedStudent.getEmail()))
{
frLogic.updateFeedbackResponsesForChangingEmail(updatedStudent.getCourse(), originalStudent.getEmail(), updatedStudent.getEmail());
}
if (isTeamChanged(originalStudent.getTeam(), updatedStudent.getTeam()))
{
frLogic.updateFeedbackResponsesForChangingTeam(updatedStudent.getCourse(), updatedStudent.getEmail(), originalStudent.getTeam(), updatedStudent.getTeam());
}
if (isSectionChanged(originalStudent.getSection(), updatedStudent.getSection()))
{
frLogic.updateFeedbackResponsesForChangingSection(updatedStudent.getCourse(), updatedStudent.getEmail(), originalStudent.getSection(), updatedStudent.getSection());
}
return updatedStudent;
}

public  void resetStudentGoogleId(String originalEmail, String courseId)throws EntityDoesNotExistException {
try {
updateStudentCascade(StudentAttributes.updateOptionsBuilder(courseId, originalEmail).withGoogleId(null).build());
}
catch(InvalidParametersException | EntityAlreadyExistsException e){
assert false : "Resetting google ID shall not cause: " + e.getMessage();
}
}

public  StudentAttributes regenerateStudentRegistrationKey(String courseId, String email)throws EntityDoesNotExistException, EntityAlreadyExistsException {
StudentAttributes originalStudent = studentsDb.getStudentForEmail(courseId, email);
if (originalStudent == null)
{
String errorMessage = String.format("The student with the email %s could not be found for the course with ID [%s].", email, courseId);
throw new  EntityDoesNotExistException(errorMessage);
}
return studentsDb.regenerateEntityKey(originalStudent);
}

public  void validateSectionsAndTeams(List<StudentAttributes> studentList, String courseId)throws EnrollException {
List<StudentAttributes> mergedList = getMergedList(studentList, courseId);
if (mergedList.size() < 2)
{
return;
}
String errorMessage = getSectionInvalidityInfo(mergedList) + getTeamInvalidityInfo(mergedList);
if (!errorMessage.isEmpty())
{
throw new  EnrollException(errorMessage);
}
}

private  List<StudentAttributes> getMergedList(List<StudentAttributes> studentList, String courseId) {
List<StudentAttributes> mergedList = new  ArrayList<>();
List<StudentAttributes> studentsInCourse = getStudentsForCourse(courseId);
for (StudentAttributes student : studentList)
{
mergedList.add(student);
}
for (StudentAttributes student : studentsInCourse)
{
if (!isInEnrollList(student, mergedList))
{
mergedList.add(student);
}
}
return mergedList;
}

public  String getSectionForTeam(String courseId, String teamName) {
List<StudentAttributes> students = getStudentsForTeam(teamName, courseId);
if (students.isEmpty())
{
return Const.DEFAULT_SECTION;
}
return students.get(0).getSection();
}

private  String getSectionInvalidityInfo(List<StudentAttributes> mergedList) {
StudentAttributes.sortBySectionName(mergedList);
List<String> invalidSectionList = new  ArrayList<>();
int studentsCount = 1;
for (int i = 1 ; i < mergedList.size() ; i++)
{
StudentAttributes currentStudent = mergedList.get(i);
StudentAttributes previousStudent = mergedList.get(i - 1);
if (currentStudent.getSection().equals(previousStudent.getSection()))
{
studentsCount++;
}
else
{
if (studentsCount > Const.SECTION_SIZE_LIMIT)
{
invalidSectionList.add(previousStudent.getSection());
}
studentsCount = 1;
}
if (i == mergedList.size() - 1 && studentsCount > Const.SECTION_SIZE_LIMIT)
{
invalidSectionList.add(currentStudent.getSection());
}
}
StringJoiner errorMessage = new  StringJoiner(" ");
for (String section : invalidSectionList)
{
errorMessage.add(String.format(ERROR_ENROLL_EXCEED_SECTION_LIMIT, Const.SECTION_SIZE_LIMIT, section));
}
if (!invalidSectionList.isEmpty())
{
errorMessage.add(String.format(ERROR_ENROLL_EXCEED_SECTION_LIMIT_INSTRUCTION, Const.SECTION_SIZE_LIMIT));
}
return errorMessage.toString();
}

private  String getTeamInvalidityInfo(List<StudentAttributes> mergedList) {
StringJoiner errorMessage = new  StringJoiner(" ");
StudentAttributes.sortByTeamName(mergedList);
List<String> invalidTeamList = new  ArrayList<>();
for (int i = 1 ; i < mergedList.size() ; i++)
{
StudentAttributes currentStudent = mergedList.get(i);
StudentAttributes previousStudent = mergedList.get(i - 1);
if (currentStudent.getTeam().equals(previousStudent.getTeam()) && !currentStudent.getSection().equals(previousStudent.getSection()) && !invalidTeamList.contains(currentStudent.getTeam()))
{
errorMessage.add(String.format(ERROR_INVALID_TEAM_NAME, currentStudent.getTeam(), previousStudent.getSection(), currentStudent.getSection()));
invalidTeamList.add(currentStudent.getTeam());
}
}
if (!invalidTeamList.isEmpty())
{
errorMessage.add(ERROR_INVALID_TEAM_NAME_INSTRUCTION);
}
return errorMessage.toString();
}

public  void deleteStudentsInCourseCascade(String courseId) {
List<StudentAttributes> studentsInCourse = getStudentsForCourse(courseId);
for (StudentAttributes student : studentsInCourse)
{
RequestTracer.checkRemainingTime();
deleteStudentCascade(courseId, student.getEmail());
}
}

public  void deleteStudentCascade(String courseId, String studentEmail) {
StudentAttributes student = getStudentForEmail(courseId, studentEmail);
if (student == null)
{
return;
}
frLogic.deleteFeedbackResponsesInvolvedEntityOfCourseCascade(courseId, studentEmail);
if (studentsDb.getStudentsForTeam(student.getTeam(), student.getCourse()).size() == 1)
{
frLogic.deleteFeedbackResponsesInvolvedEntityOfCourseCascade(student.getCourse(), student.getTeam());
}
studentsDb.deleteStudent(courseId, studentEmail);
}

public  void deleteStudentsForGoogleIdCascade(String googleId) {
List<StudentAttributes> students = getStudentsForGoogleId(googleId);
for (StudentAttributes student : students)
{
deleteStudentCascade(student.getCourse(), student.getEmail());
}
}

public  void deleteStudents(AttributesDeletionQuery query) {
studentsDb.deleteStudents(query);
}

public  void putDocument(StudentAttributes student)throws SearchServiceException {
studentsDb.putDocument(student);
}

private  boolean isInEnrollList(StudentAttributes student, List<StudentAttributes> studentInfoList) {
for (StudentAttributes studentInfo : studentInfoList)
{
if (studentInfo.getEmail().equalsIgnoreCase(student.getEmail()))
{
return true;
}
}
return false;
}

private  boolean isTeamChanged(String originalTeam, String newTeam) {
return newTeam != null && originalTeam != null && !originalTeam.equals(newTeam);
}

private  boolean isSectionChanged(String originalSection, String newSection) {
return newSection != null && originalSection != null && !originalSection.equals(newSection);
}

}
