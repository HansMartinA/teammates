package teammates.logic.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.CourseRoster;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.questions.FeedbackMcqQuestionDetails;
import teammates.common.datatransfer.questions.FeedbackMsqQuestionDetails;
import teammates.common.datatransfer.questions.FeedbackQuestionType;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Const;
import teammates.common.util.Logger;
import teammates.storage.api.FeedbackQuestionsDb;
public final class FeedbackQuestionsLogic {
static final String USER_NAME_FOR_SELF = "Myself";

private static final Logger log = Logger.getLogger();

private static final FeedbackQuestionsLogic instance = new  FeedbackQuestionsLogic();

private final FeedbackQuestionsDb fqDb = FeedbackQuestionsDb.inst();

private CoursesLogic coursesLogic;

private FeedbackResponsesLogic frLogic;

private FeedbackSessionsLogic fsLogic;

private InstructorsLogic instructorsLogic;

private StudentsLogic studentsLogic;

private  FeedbackQuestionsLogic(){
}
public static  FeedbackQuestionsLogic inst() {
return instance;
}

 void initLogicDependencies() {
coursesLogic = CoursesLogic.inst();
frLogic = FeedbackResponsesLogic.inst();
fsLogic = FeedbackSessionsLogic.inst();
instructorsLogic = InstructorsLogic.inst();
studentsLogic = StudentsLogic.inst();
}

public  FeedbackQuestionAttributes createFeedbackQuestion(FeedbackQuestionAttributes fqa)throws InvalidParametersException {
List<FeedbackQuestionAttributes> questionsBefore = getFeedbackQuestionsForSession(fqa.getFeedbackSessionName(), fqa.getCourseId());
FeedbackQuestionAttributes createdQuestion = fqDb.putEntity(fqa);
adjustQuestionNumbers(questionsBefore.size() + 1, createdQuestion.getQuestionNumber(), questionsBefore);
return createdQuestion;
}

public  FeedbackQuestionAttributes getFeedbackQuestion(String feedbackQuestionId) {
return fqDb.getFeedbackQuestion(feedbackQuestionId);
}

public  FeedbackQuestionAttributes getFeedbackQuestion(String feedbackSessionName, String courseId, int questionNumber) {
return fqDb.getFeedbackQuestion(feedbackSessionName, courseId, questionNumber);
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForSession(String feedbackSessionName, String courseId) {
List<FeedbackQuestionAttributes> questions = fqDb.getFeedbackQuestionsForSession(feedbackSessionName, courseId);
questions.sort(null);
if (questions.size() > 1 && !areQuestionNumbersConsistent(questions))
{
log.severe(courseId + ": " + feedbackSessionName + " has invalid question numbers");
}
return questions;
}

private  boolean areQuestionNumbersConsistent(List<FeedbackQuestionAttributes> questions) {
Set<Integer> questionNumbersInSession = new  HashSet<>();
for (FeedbackQuestionAttributes question : questions)
{
if (!questionNumbersInSession.add(question.getQuestionNumber()))
{
return false;
}
}
for (int i = 1 ; i <= questions.size() ; i++)
{
if (!questionNumbersInSession.contains(i))
{
return false;
}
}
return true;
}

public  boolean hasFeedbackQuestionsForInstructors(String feedbackSessionName, String courseId, String userEmail) {
boolean hasQuestions = fqDb.hasFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.INSTRUCTORS);
if (hasQuestions)
{
return true;
}
if (userEmail != null && fsLogic.isCreatorOfSession(feedbackSessionName, courseId, userEmail))
{
hasQuestions = fqDb.hasFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.SELF);
}
return hasQuestions;
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForInstructors(String feedbackSessionName, String courseId, String userEmail) {
List<FeedbackQuestionAttributes> questions = new  ArrayList<>();
questions.addAll(fqDb.getFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.INSTRUCTORS));
if (userEmail != null && fsLogic.isCreatorOfSession(feedbackSessionName, courseId, userEmail))
{
questions.addAll(fqDb.getFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.SELF));
}
questions.sort(null);
return questions;
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForInstructors(List<FeedbackQuestionAttributes> allQuestions, boolean isCreator) {
List<FeedbackQuestionAttributes> questions = new  ArrayList<>();
for (FeedbackQuestionAttributes question : allQuestions)
{
if (question.getGiverType() == FeedbackParticipantType.INSTRUCTORS || question.getGiverType() == FeedbackParticipantType.SELF && isCreator)
{
questions.add(question);
}
}
return questions;
}

public  boolean hasFeedbackQuestionsForStudents(String feedbackSessionName, String courseId) {
return fqDb.hasFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.STUDENTS) || fqDb.hasFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.TEAMS);
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForStudents(String feedbackSessionName, String courseId) {
List<FeedbackQuestionAttributes> questions = new  ArrayList<>();
questions.addAll(fqDb.getFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.STUDENTS));
questions.addAll(fqDb.getFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.TEAMS));
questions.sort(null);
return questions;
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForStudents(List<FeedbackQuestionAttributes> allQuestions) {
List<FeedbackQuestionAttributes> questions = new  ArrayList<>();
for (FeedbackQuestionAttributes question : allQuestions)
{
if (question.getGiverType() == FeedbackParticipantType.STUDENTS || question.getGiverType() == FeedbackParticipantType.TEAMS)
{
questions.add(question);
}
}
return questions;
}

public  boolean sessionHasQuestions(String feedbackSessionName, String courseId) {
return fqDb.hasFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.STUDENTS) || fqDb.hasFeedbackQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.TEAMS);
}

public  boolean sessionHasQuestionsForGiverType(String feedbackSessionName, String courseId, FeedbackParticipantType giverType) {
return fqDb.hasFeedbackQuestionsForGiverType(feedbackSessionName, courseId, giverType);
}

public  Map<String, String> getRecipientsOfQuestion(FeedbackQuestionAttributes question, @Nullable
InstructorAttributes instructorGiver, @Nullable
StudentAttributes studentGiver, @Nullable
CourseRoster courseRoster) {
assert instructorGiver != null || studentGiver != null;
Map<String, String> recipients = new  HashMap<>();
boolean isStudentGiver = studentGiver != null;
boolean isInstructorGiver = instructorGiver != null;
String giverEmail = "";
String giverTeam = "";
String giverSection = "";
if (isStudentGiver)
{
giverEmail = studentGiver.getEmail();
giverTeam = studentGiver.getTeam();
giverSection = studentGiver.getSection();
}
else
if (isInstructorGiver)
{
giverEmail = instructorGiver.getEmail();
giverTeam = Const.USER_TEAM_FOR_INSTRUCTOR;
giverSection = Const.DEFAULT_SECTION;
}
FeedbackParticipantType recipientType = question.getRecipientType();
FeedbackParticipantType generateOptionsFor = recipientType;
switch (recipientType) {
case SELF: if (question.getGiverType() == FeedbackParticipantType.TEAMS)
{
recipients.put(giverTeam, giverTeam);
}
else
{
recipients.put(giverEmail, USER_NAME_FOR_SELF);
}
break;
case STUDENTS: case STUDENTS_IN_SAME_SECTION: List<StudentAttributes> studentList;
if (courseRoster == null)
{
if (generateOptionsFor == FeedbackParticipantType.STUDENTS_IN_SAME_SECTION)
{
studentList = studentsLogic.getStudentsForSection(giverSection, question.getCourseId());
}
else
{
studentList = studentsLogic.getStudentsForCourse(question.getCourseId());
}
}
else
{
if (generateOptionsFor == FeedbackParticipantType.STUDENTS_IN_SAME_SECTION)
{
final String finalGiverSection = giverSection;
studentList = courseRoster.getStudents().stream().filter(studentAttributes -> studentAttributes.getSection().equals(finalGiverSection)).collect(Collectors.toList());
}
else
{
studentList = courseRoster.getStudents();
}
}
for (StudentAttributes student : studentList)
{
if (isInstructorGiver && !instructorGiver.isAllowedForPrivilege(student.getSection(), question.getFeedbackSessionName(), Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS))
{
continue;
}
if (!giverEmail.equals(student.getEmail()))
{
recipients.put(student.getEmail(), student.getName());
}
}
break;
case INSTRUCTORS: List<InstructorAttributes> instructorsInCourse;
if (courseRoster == null)
{
instructorsInCourse = instructorsLogic.getInstructorsForCourse(question.getCourseId());
}
else
{
instructorsInCourse = courseRoster.getInstructors();
}
for (InstructorAttributes instr : instructorsInCourse)
{
if (isStudentGiver && !instr.isDisplayedToStudents())
{
continue;
}
if (!giverEmail.equals(instr.getEmail()))
{
recipients.put(instr.getEmail(), instr.getName());
}
}
break;
case TEAMS: case TEAMS_IN_SAME_SECTION: Map<String, List<StudentAttributes>> teamToTeamMembersTable;
List<StudentAttributes> teamStudents;
if (generateOptionsFor == FeedbackParticipantType.TEAMS_IN_SAME_SECTION)
{
teamStudents = studentsLogic.getStudentsForSection(giverSection, question.getCourseId());
teamToTeamMembersTable = CourseRoster.buildTeamToMembersTable(teamStudents);
}
else
{
if (courseRoster == null)
{
teamStudents = studentsLogic.getStudentsForCourse(question.getCourseId());
teamToTeamMembersTable = CourseRoster.buildTeamToMembersTable(teamStudents);
}
else
{
teamToTeamMembersTable = courseRoster.getTeamToMembersTable();
}
}
for (Map.Entry<String, List<StudentAttributes>> team : teamToTeamMembersTable.entrySet())
{
if (isInstructorGiver && !instructorGiver.isAllowedForPrivilege(team.getValue().iterator().next().getSection(), question.getFeedbackSessionName(), Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS))
{
continue;
}
if (!giverTeam.equals(team.getKey()))
{
recipients.put(team.getKey(), team.getKey());
}
}
break;
case OWN_TEAM: recipients.put(giverTeam, giverTeam);
break;
case OWN_TEAM_MEMBERS: List<StudentAttributes> students;
if (courseRoster == null)
{
students = studentsLogic.getStudentsForTeam(giverTeam, question.getCourseId());
}
else
{
students = courseRoster.getTeamToMembersTable().getOrDefault(giverTeam, Collections.emptyList());
}
for (StudentAttributes student : students)
{
if (!student.getEmail().equals(giverEmail))
{
recipients.put(student.getEmail(), student.getName());
}
}
break;
case OWN_TEAM_MEMBERS_INCLUDING_SELF: List<StudentAttributes> teamMembers;
if (courseRoster == null)
{
teamMembers = studentsLogic.getStudentsForTeam(giverTeam, question.getCourseId());
}
else
{
teamMembers = courseRoster.getTeamToMembersTable().getOrDefault(giverTeam, Collections.emptyList());
}
for (StudentAttributes student : teamMembers)
{
recipients.put(student.getEmail(), student.getName());
}
break;
case NONE: recipients.put(Const.GENERAL_QUESTION, Const.GENERAL_QUESTION);
break;
default: break;

}
return recipients;
}

public  Map<String, Set<String>> buildCompleteGiverRecipientMap(FeedbackQuestionAttributes relatedQuestion, CourseRoster courseRoster) {
Map<String, Set<String>> completeGiverRecipientMap = new  HashMap<>();
List<String> possibleGivers = getPossibleGivers(relatedQuestion, courseRoster);
for (String possibleGiver : possibleGivers)
{
switch (relatedQuestion.getGiverType()) {
case STUDENTS: StudentAttributes studentGiver = courseRoster.getStudentForEmail(possibleGiver);
completeGiverRecipientMap.computeIfAbsent(possibleGiver, key -> new  HashSet<>()).addAll(getRecipientsOfQuestion(relatedQuestion, null, studentGiver, courseRoster).keySet());
break;
case TEAMS: StudentAttributes oneTeamMember = courseRoster.getTeamToMembersTable().get(possibleGiver).iterator().next();
completeGiverRecipientMap.computeIfAbsent(possibleGiver, key -> new  HashSet<>()).addAll(getRecipientsOfQuestion(relatedQuestion, null, oneTeamMember, courseRoster).keySet());
break;
case INSTRUCTORS: case SELF: InstructorAttributes instructorGiver = courseRoster.getInstructorForEmail(possibleGiver);
completeGiverRecipientMap.computeIfAbsent(possibleGiver, key -> new  HashSet<>()).addAll(getRecipientsOfQuestion(relatedQuestion, instructorGiver, null, courseRoster).keySet());
break;
default: log.severe("Invalid giver type specified");
break;

}
}
return completeGiverRecipientMap;
}

private  List<String> getPossibleGivers(FeedbackQuestionAttributes fqa, CourseRoster courseRoster) {
FeedbackParticipantType giverType = fqa.getGiverType();
List<String> possibleGivers = new  ArrayList<>();
switch (giverType) {
case STUDENTS: possibleGivers = courseRoster.getStudents().stream().map(StudentAttributes::getEmail).collect(Collectors.toList());
break;
case INSTRUCTORS: possibleGivers = courseRoster.getInstructors().stream().map(InstructorAttributes::getEmail).collect(Collectors.toList());
break;
case TEAMS: possibleGivers = new  ArrayList<>(courseRoster.getTeamToMembersTable().keySet());
break;
case SELF: FeedbackSessionAttributes feedbackSession = fsLogic.getFeedbackSession(fqa.getFeedbackSessionName(), fqa.getCourseId());
possibleGivers = Collections.singletonList(feedbackSession.getCreatorEmail());
break;
default: log.severe("Invalid giver type specified");
break;

}
return possibleGivers;
}

public  void populateFieldsToGenerateInQuestion(FeedbackQuestionAttributes feedbackQuestionAttributes, String emailOfEntityDoingQuestion, String teamOfEntityDoingQuestion) {
List<String> optionList;
FeedbackParticipantType generateOptionsFor;
if (feedbackQuestionAttributes.getQuestionType() == FeedbackQuestionType.MCQ)
{
FeedbackMcqQuestionDetails feedbackMcqQuestionDetails = (FeedbackMcqQuestionDetails) feedbackQuestionAttributes.getQuestionDetailsCopy();
optionList = feedbackMcqQuestionDetails.getMcqChoices();
generateOptionsFor = feedbackMcqQuestionDetails.getGenerateOptionsFor();
}
else
if (feedbackQuestionAttributes.getQuestionType() == FeedbackQuestionType.MSQ)
{
FeedbackMsqQuestionDetails feedbackMsqQuestionDetails = (FeedbackMsqQuestionDetails) feedbackQuestionAttributes.getQuestionDetailsCopy();
optionList = feedbackMsqQuestionDetails.getMsqChoices();
generateOptionsFor = feedbackMsqQuestionDetails.getGenerateOptionsFor();
}
else
{
return;
}
switch (generateOptionsFor) {
case NONE: break;
case STUDENTS: case STUDENTS_IN_SAME_SECTION: case STUDENTS_EXCLUDING_SELF: List<StudentAttributes> studentList;
if (generateOptionsFor == FeedbackParticipantType.STUDENTS_IN_SAME_SECTION)
{
String courseId = feedbackQuestionAttributes.getCourseId();
StudentAttributes studentAttributes = studentsLogic.getStudentForEmail(courseId, emailOfEntityDoingQuestion);
studentList = studentsLogic.getStudentsForSection(studentAttributes.getSection(), courseId);
}
else
{
studentList = studentsLogic.getStudentsForCourse(feedbackQuestionAttributes.getCourseId());
}
if (generateOptionsFor == FeedbackParticipantType.STUDENTS_EXCLUDING_SELF)
{
studentList.removeIf(studentInList -> studentInList.getEmail().equals(emailOfEntityDoingQuestion));
}
for (StudentAttributes student : studentList)
{
optionList.add(student.getName() + " (" + student.getTeam() + ")");
}
optionList.sort(null);
break;
case TEAMS: case TEAMS_IN_SAME_SECTION: case TEAMS_EXCLUDING_SELF: try {
List<String> teams;
if (generateOptionsFor == FeedbackParticipantType.TEAMS_IN_SAME_SECTION)
{
String courseId = feedbackQuestionAttributes.getCourseId();
StudentAttributes studentAttributes = studentsLogic.getStudentForEmail(courseId, emailOfEntityDoingQuestion);
teams = coursesLogic.getTeamsForSection(studentAttributes.getSection(), courseId);
}
else
{
teams = coursesLogic.getTeamsForCourse(feedbackQuestionAttributes.getCourseId());
}
if (generateOptionsFor == FeedbackParticipantType.TEAMS_EXCLUDING_SELF)
{
teams.removeIf(team -> team.equals(teamOfEntityDoingQuestion));
}
for (String team : teams)
{
optionList.add(team);
}
optionList.sort(null);
}
catch(EntityDoesNotExistException e){
assert false : "Course disappeared";
}
break;
case OWN_TEAM_MEMBERS_INCLUDING_SELF: case OWN_TEAM_MEMBERS: if (teamOfEntityDoingQuestion != null)
{
List<StudentAttributes> teamMembers = studentsLogic.getStudentsForTeam(teamOfEntityDoingQuestion, feedbackQuestionAttributes.getCourseId());
if (generateOptionsFor == FeedbackParticipantType.OWN_TEAM_MEMBERS)
{
teamMembers.removeIf(teamMember -> teamMember.getEmail().equals(emailOfEntityDoingQuestion));
}
teamMembers.forEach(teamMember -> optionList.add(teamMember.getName()));
optionList.sort(null);
}
break;
case INSTRUCTORS: List<InstructorAttributes> instructorList = instructorsLogic.getInstructorsForCourse(feedbackQuestionAttributes.getCourseId());
for (InstructorAttributes instructor : instructorList)
{
optionList.add(instructor.getName());
}
optionList.sort(null);
break;
default: assert false : "Trying to generate options for neither students, teams nor instructors";
break;

}
if (feedbackQuestionAttributes.getQuestionType() == FeedbackQuestionType.MCQ)
{
FeedbackMcqQuestionDetails feedbackMcqQuestionDetails = (FeedbackMcqQuestionDetails) feedbackQuestionAttributes.getQuestionDetailsCopy();
feedbackMcqQuestionDetails.setMcqChoices(optionList);
feedbackQuestionAttributes.setQuestionDetails(feedbackMcqQuestionDetails);
}
else
if (feedbackQuestionAttributes.getQuestionType() == FeedbackQuestionType.MSQ)
{
FeedbackMsqQuestionDetails feedbackMsqQuestionDetails = (FeedbackMsqQuestionDetails) feedbackQuestionAttributes.getQuestionDetailsCopy();
feedbackMsqQuestionDetails.setMsqChoices(optionList);
feedbackQuestionAttributes.setQuestionDetails(feedbackMsqQuestionDetails);
}
}

public  FeedbackQuestionAttributes updateFeedbackQuestionCascade(FeedbackQuestionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
FeedbackQuestionAttributes oldQuestion = fqDb.getFeedbackQuestion(updateOptions.getFeedbackQuestionId());
if (oldQuestion == null)
{
throw new  EntityDoesNotExistException("Trying to update a feedback question that does not exist.");
}
FeedbackQuestionAttributes newQuestion = oldQuestion.getCopy();
newQuestion.update(updateOptions);
int oldQuestionNumber = oldQuestion.getQuestionNumber();
int newQuestionNumber = newQuestion.getQuestionNumber();
List<FeedbackQuestionAttributes> previousQuestionsInSession = new  ArrayList<>();
if (oldQuestionNumber != newQuestionNumber)
{
String feedbackSessionName = oldQuestion.getFeedbackSessionName();
String courseId = oldQuestion.getCourseId();
previousQuestionsInSession = getFeedbackQuestionsForSession(feedbackSessionName, courseId);
}
FeedbackQuestionAttributes updatedQuestion = fqDb.updateFeedbackQuestion(updateOptions);
if (oldQuestionNumber != newQuestionNumber)
{
adjustQuestionNumbers(oldQuestionNumber, newQuestionNumber, previousQuestionsInSession);
}
if (oldQuestion.areResponseDeletionsRequiredForChanges(updatedQuestion))
{
frLogic.deleteFeedbackResponsesForQuestionCascade(oldQuestion.getId());
}
return updatedQuestion;
}

private  void adjustQuestionNumbers(int oldQuestionNumber, int newQuestionNumber, List<FeedbackQuestionAttributes> questions) {
try {
if (oldQuestionNumber > newQuestionNumber && oldQuestionNumber >= 1)
{
for (int i = oldQuestionNumber - 1 ; i >= newQuestionNumber ; i--)
{
FeedbackQuestionAttributes question = questions.get(i - 1);
fqDb.updateFeedbackQuestion(FeedbackQuestionAttributes.updateOptionsBuilder(question.getId()).withQuestionNumber(question.getQuestionNumber() + 1).build());
}
}
else
if (oldQuestionNumber < newQuestionNumber && oldQuestionNumber < questions.size())
{
for (int i = oldQuestionNumber + 1 ; i <= newQuestionNumber ; i++)
{
FeedbackQuestionAttributes question = questions.get(i - 1);
fqDb.updateFeedbackQuestion(FeedbackQuestionAttributes.updateOptionsBuilder(question.getId()).withQuestionNumber(question.getQuestionNumber() - 1).build());
}
}
}
catch(InvalidParametersException | EntityDoesNotExistException e){
assert false : "Adjusting question number should not cause: " + e.getMessage();
}
}

public  void deleteFeedbackQuestionCascade(String feedbackQuestionId) {
FeedbackQuestionAttributes questionToDelete = getFeedbackQuestion(feedbackQuestionId);
if (questionToDelete == null)
{
return;
}
frLogic.deleteFeedbackResponsesForQuestionCascade(questionToDelete.getId());
List<FeedbackQuestionAttributes> questionsToShiftQnNumber = getFeedbackQuestionsForSession(questionToDelete.getFeedbackSessionName(), questionToDelete.getCourseId());
fqDb.deleteFeedbackQuestion(feedbackQuestionId);
if (questionToDelete.getQuestionNumber() < questionsToShiftQnNumber.size())
{
shiftQuestionNumbersDown(questionToDelete.getQuestionNumber(), questionsToShiftQnNumber);
}
}

public  void deleteFeedbackQuestions(AttributesDeletionQuery query) {
fqDb.deleteFeedbackQuestions(query);
}

private  void shiftQuestionNumbersDown(int questionNumberToShiftFrom, List<FeedbackQuestionAttributes> questionsToShift) {
for (FeedbackQuestionAttributes question : questionsToShift)
{
if (question.getQuestionNumber() > questionNumberToShiftFrom)
{
try {
fqDb.updateFeedbackQuestion(FeedbackQuestionAttributes.updateOptionsBuilder(question.getId()).withQuestionNumber(question.getQuestionNumber() - 1).build());
}
catch(InvalidParametersException | EntityDoesNotExistException e){
assert false : "Shifting question number should not cause: " + e.getMessage();
}
}
}
}

}
