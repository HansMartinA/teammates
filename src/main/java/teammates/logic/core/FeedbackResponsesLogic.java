package teammates.logic.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.CourseRoster;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.SessionResultsBundle;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.questions.FeedbackTextResponseDetails;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Const;
import teammates.common.util.RequestTracer;
import teammates.storage.api.FeedbackResponsesDb;
public final class FeedbackResponsesLogic {
private static final FeedbackResponsesLogic instance = new  FeedbackResponsesLogic();

private final FeedbackResponsesDb frDb = FeedbackResponsesDb.inst();

private FeedbackQuestionsLogic fqLogic;

private FeedbackResponseCommentsLogic frcLogic;

private InstructorsLogic instructorsLogic;

private StudentsLogic studentsLogic;

private  FeedbackResponsesLogic(){
}
public static  FeedbackResponsesLogic inst() {
return instance;
}

 void initLogicDependencies() {
fqLogic = FeedbackQuestionsLogic.inst();
frcLogic = FeedbackResponseCommentsLogic.inst();
instructorsLogic = InstructorsLogic.inst();
studentsLogic = StudentsLogic.inst();
}

public  Set<String> getGiverSetThatAnswerFeedbackSession(String courseId, String feedbackSessionName) {
return frDb.getGiverSetThatAnswerFeedbackSession(courseId, feedbackSessionName);
}

public  FeedbackResponseAttributes createFeedbackResponse(FeedbackResponseAttributes fra)throws InvalidParametersException, EntityAlreadyExistsException {
return frDb.createEntity(fra);
}

public  FeedbackResponseAttributes getFeedbackResponse(String feedbackResponseId) {
return frDb.getFeedbackResponse(feedbackResponseId);
}

public  FeedbackResponseAttributes getFeedbackResponse(String feedbackQuestionId, String giverEmail, String recipient) {
return frDb.getFeedbackResponse(feedbackQuestionId, giverEmail, recipient);
}

 List<FeedbackResponseAttributes> getFeedbackResponsesForSession(String feedbackSessionName, String courseId) {
return frDb.getFeedbackResponsesForSession(feedbackSessionName, courseId);
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForSessionInSection(String feedbackSessionName, String courseId, @Nullable
String section) {
if (section == null)
{
return getFeedbackResponsesForSession(feedbackSessionName, courseId);
}
return frDb.getFeedbackResponsesForSessionInSection(feedbackSessionName, courseId, section);
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForQuestion(String feedbackQuestionId) {
return frDb.getFeedbackResponsesForQuestion(feedbackQuestionId);
}

public  boolean areThereResponsesForQuestion(String feedbackQuestionId) {
return frDb.areThereResponsesForQuestion(feedbackQuestionId);
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForQuestionInSection(String feedbackQuestionId, @Nullable
String section) {
if (section == null)
{
return getFeedbackResponsesForQuestion(feedbackQuestionId);
}
return frDb.getFeedbackResponsesForQuestionInSection(feedbackQuestionId, section);
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromGiverForQuestion(String feedbackQuestionId, String userEmail) {
return frDb.getFeedbackResponsesFromGiverForQuestion(feedbackQuestionId, userEmail);
}

private  List<FeedbackResponseAttributes> getFeedbackResponsesForReceiverForQuestion(String feedbackQuestionId, String userEmail) {
return frDb.getFeedbackResponsesForReceiverForQuestion(feedbackQuestionId, userEmail);
}

public  boolean hasGiverRespondedForSession(String giverIdentifier, String feedbackSessionName, String courseId) {
return frDb.hasResponsesFromGiverInSession(giverIdentifier, feedbackSessionName, courseId);
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForReceiverForCourse(String courseId, String userEmail) {
return frDb.getFeedbackResponsesForReceiverForCourse(courseId, userEmail);
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromGiverForCourse(String courseId, String userEmail) {
return frDb.getFeedbackResponsesFromGiverForCourse(courseId, userEmail);
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromStudentOrTeamForQuestion(FeedbackQuestionAttributes question, StudentAttributes student) {
if (question.getGiverType() == FeedbackParticipantType.TEAMS)
{
return getFeedbackResponsesFromTeamForQuestion(question.getId(), question.getCourseId(), student.getTeam(), null);
}
return frDb.getFeedbackResponsesFromGiverForQuestion(question.getId(), student.getEmail());
}

public  boolean isNameVisibleToUser(FeedbackQuestionAttributes question, FeedbackResponseAttributes response, String userEmail, boolean isInstructor, boolean isGiverName, CourseRoster roster) {
if (question == null)
{
return false;
}
if (question.getGiverType() == FeedbackParticipantType.TEAMS)
{
if (roster.isStudentInTeam(userEmail, response.getGiver()))
{
return true;
}
}
else
{
if (response.getGiver().equals(userEmail))
{
return true;
}
}
return isFeedbackParticipantNameVisibleToUser(question, response, userEmail, isInstructor, isGiverName, roster);
}

private  boolean isFeedbackParticipantNameVisibleToUser(FeedbackQuestionAttributes question, FeedbackResponseAttributes response, String userEmail, boolean isInstructor, boolean isGiverName, CourseRoster roster) {
List<FeedbackParticipantType> showNameTo = isGiverName ? question.getShowGiverNameTo() : question.getShowRecipientNameTo();
for (FeedbackParticipantType type : showNameTo)
{
switch (type) {
case INSTRUCTORS: if (roster.getInstructorForEmail(userEmail) != null && isInstructor)
{
return true;
}
break;
case OWN_TEAM_MEMBERS: case OWN_TEAM_MEMBERS_INCLUDING_SELF: if (roster.isStudentsInSameTeam(response.getGiver(), userEmail))
{
return true;
}
break;
case RECEIVER: if (question.getRecipientType().isTeam())
{
if (roster.isStudentInTeam(userEmail, response.getRecipient()))
{
return true;
}
break;
}
else
if (response.getRecipient().equals(userEmail))
{
return true;
}
else
{
break;
}
case RECEIVER_TEAM_MEMBERS: if (question.getRecipientType().isTeam())
{
if (roster.isStudentInTeam(userEmail, response.getRecipient()))
{
return true;
}
break;
}
else
if (roster.isStudentsInSameTeam(response.getRecipient(), userEmail))
{
return true;
}
break;
case STUDENTS: if (roster.isStudentInCourse(userEmail))
{
return true;
}
break;
default: assert false : "Invalid FeedbackParticipantType for showNameTo in " + "FeedbackResponseLogic.isFeedbackParticipantNameVisibleToUser()";
break;

}
}
return false;
}

public  boolean isResponseOfFeedbackQuestionVisibleToStudent(FeedbackQuestionAttributes question) {
if (question.isResponseVisibleTo(FeedbackParticipantType.STUDENTS))
{
return true;
}
boolean isStudentRecipientType = question.getRecipientType().equals(FeedbackParticipantType.STUDENTS) || question.getRecipientType().equals(FeedbackParticipantType.STUDENTS_IN_SAME_SECTION) || question.getRecipientType().equals(FeedbackParticipantType.OWN_TEAM_MEMBERS) || question.getRecipientType().equals(FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF) || question.getRecipientType().equals(FeedbackParticipantType.GIVER) && question.getGiverType().equals(FeedbackParticipantType.STUDENTS);
if ((isStudentRecipientType || question.getRecipientType().isTeam()) && question.isResponseVisibleTo(FeedbackParticipantType.RECEIVER))
{
return true;
}
if (question.getGiverType() == FeedbackParticipantType.TEAMS || question.isResponseVisibleTo(FeedbackParticipantType.OWN_TEAM_MEMBERS))
{
return true;
}
return question.isResponseVisibleTo(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS);
}

public  boolean isResponseOfFeedbackQuestionVisibleToInstructor(FeedbackQuestionAttributes question) {
return question.isResponseVisibleTo(FeedbackParticipantType.INSTRUCTORS);
}

private  List<FeedbackQuestionAttributes> getQuestionsForSession(String feedbackSessionName, String courseId, @Nullable
String questionId) {
if (questionId == null)
{
return fqLogic.getFeedbackQuestionsForSession(feedbackSessionName, courseId);
}
FeedbackQuestionAttributes fqa = fqLogic.getFeedbackQuestion(questionId);
return fqa == null ? Collections.emptyList() : Collections.singletonList(fqa);
}

private  SessionResultsBundle buildResultsBundle(boolean isCourseWide, String feedbackSessionName, String courseId, String section, String questionId, boolean isInstructor, String userEmail, InstructorAttributes instructor, StudentAttributes student, CourseRoster roster, List<FeedbackQuestionAttributes> allQuestions, List<FeedbackResponseAttributes> allResponses) {
Map<String, FeedbackQuestionAttributes> allQuestionsMap = new  HashMap<>();
for (FeedbackQuestionAttributes qn : allQuestions)
{
allQuestionsMap.put(qn.getId(), qn);
}
List<FeedbackResponseCommentAttributes> allComments;
if (questionId == null)
{
allComments = frcLogic.getFeedbackResponseCommentForSessionInSection(courseId, feedbackSessionName, section);
}
else
{
allComments = frcLogic.getFeedbackResponseCommentForQuestionInSection(questionId, section);
}
RequestTracer.checkRemainingTime();
Map<String, FeedbackQuestionAttributes> relatedQuestionsMap = new  HashMap<>();
Map<String, FeedbackResponseAttributes> relatedResponsesMap = new  HashMap<>();
Map<String, List<FeedbackResponseCommentAttributes>> relatedCommentsMap = new  HashMap<>();
if (isCourseWide)
{
for (FeedbackQuestionAttributes qn : allQuestions)
{
relatedQuestionsMap.put(qn.getId(), qn);
}
}
Set<String> studentsEmailInTeam = new  HashSet<>();
if (student != null)
{
for (StudentAttributes studentInTeam : roster.getTeamToMembersTable().getOrDefault(student.getTeam(), Collections.emptyList()))
{
studentsEmailInTeam.add(studentInTeam.getEmail());
}
}
Map<String, Boolean> responseGiverVisibilityTable = new  HashMap<>();
Map<String, Boolean> responseRecipientVisibilityTable = new  HashMap<>();
Map<Long, Boolean> commentVisibilityTable = new  HashMap<>();
for (FeedbackResponseAttributes response : allResponses)
{
FeedbackQuestionAttributes correspondingQuestion = allQuestionsMap.get(response.getFeedbackQuestionId());
if (correspondingQuestion == null)
{
continue;
}
boolean isVisibleResponse = isResponseVisibleForUser(userEmail, isInstructor, student, studentsEmailInTeam, response, correspondingQuestion, instructor);
if (!isVisibleResponse)
{
continue;
}
relatedQuestionsMap.put(response.getFeedbackQuestionId(), correspondingQuestion);
relatedResponsesMap.put(response.getId(), response);
responseGiverVisibilityTable.put(response.getId(), isNameVisibleToUser(correspondingQuestion, response, userEmail, isInstructor, true, roster));
responseRecipientVisibilityTable.put(response.getId(), isNameVisibleToUser(correspondingQuestion, response, userEmail, isInstructor, false, roster));
}
RequestTracer.checkRemainingTime();
for (FeedbackResponseCommentAttributes frc : allComments)
{
FeedbackResponseAttributes relatedResponse = relatedResponsesMap.get(frc.getFeedbackResponseId());
FeedbackQuestionAttributes relatedQuestion = relatedQuestionsMap.get(frc.getFeedbackQuestionId());
if (relatedQuestion == null || relatedResponse == null)
{
continue;
}
boolean isVisibleResponseComment = frcLogic.isResponseCommentVisibleForUser(userEmail, isInstructor, student, studentsEmailInTeam, relatedResponse, relatedQuestion, frc);
if (!isVisibleResponseComment)
{
continue;
}
relatedCommentsMap.computeIfAbsent(relatedResponse.getId(), key -> new  ArrayList<>()).add(frc);
commentVisibilityTable.put(frc.getId(), frcLogic.isNameVisibleToUser(frc, relatedResponse, userEmail, roster));
}
RequestTracer.checkRemainingTime();
List<FeedbackResponseAttributes> existingResponses = new  ArrayList<>(relatedResponsesMap.values());
List<FeedbackResponseAttributes> missingResponses = Collections.emptyList();
if (isCourseWide)
{
missingResponses = buildMissingResponses(courseId, feedbackSessionName, instructor, responseGiverVisibilityTable, responseRecipientVisibilityTable, relatedQuestionsMap, existingResponses, roster, section);
}
RequestTracer.checkRemainingTime();
return new  SessionResultsBundle(relatedQuestionsMap, existingResponses, missingResponses, responseGiverVisibilityTable, responseRecipientVisibilityTable, relatedCommentsMap, commentVisibilityTable, roster);
}

public  SessionResultsBundle getSessionResultsForCourse(String feedbackSessionName, String courseId, String instructorEmail, @Nullable
String questionId, @Nullable
String section) {
CourseRoster roster = new  CourseRoster(studentsLogic.getStudentsForCourse(courseId), instructorsLogic.getInstructorsForCourse(courseId));
List<FeedbackQuestionAttributes> allQuestions = getQuestionsForSession(feedbackSessionName, courseId, questionId);
RequestTracer.checkRemainingTime();
List<FeedbackResponseAttributes> allResponses;
if (questionId == null)
{
allResponses = getFeedbackResponsesForSessionInSection(feedbackSessionName, courseId, section);
}
else
{
allResponses = getFeedbackResponsesForQuestionInSection(questionId, section);
}
RequestTracer.checkRemainingTime();
InstructorAttributes instructor = instructorsLogic.getInstructorForEmail(courseId, instructorEmail);
return buildResultsBundle(true, feedbackSessionName, courseId, section, questionId, true, instructorEmail, instructor, null, roster, allQuestions, allResponses);
}

public  SessionResultsBundle getSessionResultsForUser(String feedbackSessionName, String courseId, String userEmail, boolean isInstructor, @Nullable
String questionId) {
CourseRoster roster = new  CourseRoster(studentsLogic.getStudentsForCourse(courseId), instructorsLogic.getInstructorsForCourse(courseId));
List<FeedbackQuestionAttributes> allQuestions = getQuestionsForSession(feedbackSessionName, courseId, questionId);
RequestTracer.checkRemainingTime();
StudentAttributes student = isInstructor ? null : studentsLogic.getStudentForEmail(courseId, userEmail);
InstructorAttributes instructor = isInstructor ? instructorsLogic.getInstructorForEmail(courseId, userEmail) : null;
List<FeedbackResponseAttributes> allResponses = new  ArrayList<>();
for (FeedbackQuestionAttributes question : allQuestions)
{
List<FeedbackResponseAttributes> viewableResponses = isInstructor ? getFeedbackResponsesToOrFromInstructorForQuestion(question, instructor) : getViewableFeedbackResponsesForStudentForQuestion(question, student, roster);
allResponses.addAll(viewableResponses);
}
RequestTracer.checkRemainingTime();
return buildResultsBundle(false, feedbackSessionName, courseId, null, questionId, isInstructor, userEmail, instructor, student, roster, allQuestions, allResponses);
}

private  List<FeedbackResponseAttributes> buildMissingResponses(String courseId, String feedbackSessionName, InstructorAttributes instructor, Map<String, Boolean> responseGiverVisibilityTable, Map<String, Boolean> responseRecipientVisibilityTable, Map<String, FeedbackQuestionAttributes> relatedQuestionsMap, List<FeedbackResponseAttributes> existingResponses, CourseRoster courseRoster, @Nullable
String section) {
Map<String, Map<String, Set<String>>> questionCompleteGiverRecipientMap = new  HashMap<>();
for (FeedbackQuestionAttributes feedbackQuestion : relatedQuestionsMap.values())
{
if (feedbackQuestion.getQuestionDetailsCopy().shouldGenerateMissingResponses(feedbackQuestion))
{
questionCompleteGiverRecipientMap.put(feedbackQuestion.getId(), fqLogic.buildCompleteGiverRecipientMap(feedbackQuestion, courseRoster));
}
else
{
questionCompleteGiverRecipientMap.put(feedbackQuestion.getId(), new  HashMap<>());
}
}
for (FeedbackResponseAttributes existingResponse : existingResponses)
{
Map<String, Set<String>> currGiverRecipientMap = questionCompleteGiverRecipientMap.get(existingResponse.getFeedbackQuestionId());
if (!currGiverRecipientMap.containsKey(existingResponse.getGiver()))
{
continue;
}
currGiverRecipientMap.get(existingResponse.getGiver()).remove(existingResponse.getRecipient());
}
List<FeedbackResponseAttributes> missingResponses = new  ArrayList<>();
for (Map.Entry<String, Map<String, Set<String>>> currGiverRecipientMapEntry : questionCompleteGiverRecipientMap.entrySet())
{
FeedbackQuestionAttributes correspondingQuestion = relatedQuestionsMap.get(currGiverRecipientMapEntry.getKey());
String questionId = correspondingQuestion.getId();
for (Map.Entry<String, Set<String>> giverRecipientEntry : currGiverRecipientMapEntry.getValue().entrySet())
{
String giverIdentifier = giverRecipientEntry.getKey();
CourseRoster.ParticipantInfo giverInfo = courseRoster.getInfoForIdentifier(giverIdentifier);
for (String recipientIdentifier : giverRecipientEntry.getValue())
{
CourseRoster.ParticipantInfo recipientInfo = courseRoster.getInfoForIdentifier(recipientIdentifier);
if (section != null && !giverInfo.getSectionName().equals(section) && !recipientInfo.getSectionName().equals(section))
{
continue;
}
FeedbackResponseAttributes missingResponse = FeedbackResponseAttributes.builder(questionId, giverIdentifier, recipientIdentifier).withCourseId(courseId).withFeedbackSessionName(feedbackSessionName).withGiverSection(giverInfo.getSectionName()).withRecipientSection(recipientInfo.getSectionName()).withResponseDetails(new  FeedbackTextResponseDetails("No Response")).build();
boolean isVisibleResponse = isResponseVisibleForUser(instructor.getEmail(), true, null, Collections.emptySet(), missingResponse, correspondingQuestion, instructor);
if (!isVisibleResponse)
{
continue;
}
responseGiverVisibilityTable.put(missingResponse.getId(), isNameVisibleToUser(correspondingQuestion, missingResponse, instructor.getEmail(), true, true, courseRoster));
responseRecipientVisibilityTable.put(missingResponse.getId(), isNameVisibleToUser(correspondingQuestion, missingResponse, instructor.getEmail(), true, false, courseRoster));
missingResponses.add(missingResponse);
}
}
}
return missingResponses;
}

private  boolean isResponseVisibleForUser(String userEmail, boolean isInstructor, StudentAttributes student, Set<String> studentsEmailInTeam, FeedbackResponseAttributes response, FeedbackQuestionAttributes relatedQuestion, InstructorAttributes instructor) {
boolean isVisibleResponse = false;
if (isInstructor && relatedQuestion.isResponseVisibleTo(FeedbackParticipantType.INSTRUCTORS) || response.getRecipient().equals(userEmail) && relatedQuestion.isResponseVisibleTo(FeedbackParticipantType.RECEIVER) || response.getGiver().equals(userEmail) || !isInstructor && relatedQuestion.isResponseVisibleTo(FeedbackParticipantType.STUDENTS))
{
isVisibleResponse = true;
}
else
if (studentsEmailInTeam != null && !isInstructor)
{
if (relatedQuestion.getRecipientType() == FeedbackParticipantType.TEAMS && relatedQuestion.isResponseVisibleTo(FeedbackParticipantType.RECEIVER) && response.getRecipient().equals(student.getTeam()))
{
isVisibleResponse = true;
}
else
if (relatedQuestion.getRecipientType() == FeedbackParticipantType.TEAMS_IN_SAME_SECTION && relatedQuestion.isResponseVisibleTo(FeedbackParticipantType.RECEIVER) && response.getRecipient().equals(student.getTeam()))
{
isVisibleResponse = true;
}
else
if (relatedQuestion.getGiverType() == FeedbackParticipantType.TEAMS && response.getGiver().equals(student.getTeam()))
{
isVisibleResponse = true;
}
else
if (relatedQuestion.isResponseVisibleTo(FeedbackParticipantType.OWN_TEAM_MEMBERS) && studentsEmailInTeam.contains(response.getGiver()))
{
isVisibleResponse = true;
}
else
if (relatedQuestion.isResponseVisibleTo(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS) && studentsEmailInTeam.contains(response.getRecipient()))
{
isVisibleResponse = true;
}
}
if (isVisibleResponse && instructor != null)
{
boolean isGiverSectionRestricted = !instructor.isAllowedForPrivilege(response.getGiverSection(), response.getFeedbackSessionName(), Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS);
boolean isRecipientSectionRestricted = relatedQuestion.getRecipientType() != FeedbackParticipantType.NONE && !instructor.isAllowedForPrivilege(response.getRecipientSection(), response.getFeedbackSessionName(), Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS);
boolean isNotAllowedForInstructor = isGiverSectionRestricted || isRecipientSectionRestricted;
if (isNotAllowedForInstructor)
{
isVisibleResponse = false;
}
}
return isVisibleResponse;
}

public  boolean hasResponsesForCourse(String courseId) {
return frDb.hasFeedbackResponseEntitiesForCourse(courseId);
}

public  FeedbackResponseAttributes updateFeedbackResponseCascade(FeedbackResponseAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
FeedbackResponseAttributes oldResponse = frDb.getFeedbackResponse(updateOptions.getFeedbackResponseId());
FeedbackResponseAttributes newResponse = frDb.updateFeedbackResponse(updateOptions);
boolean isResponseIdChanged = !oldResponse.getId().equals(newResponse.getId());
boolean isGiverSectionChanged = !oldResponse.getGiverSection().equals(newResponse.getGiverSection());
boolean isRecipientSectionChanged = !oldResponse.getRecipientSection().equals(newResponse.getRecipientSection());
if (isResponseIdChanged || isGiverSectionChanged || isRecipientSectionChanged)
{
List<FeedbackResponseCommentAttributes> responseComments = frcLogic.getFeedbackResponseCommentForResponse(oldResponse.getId());
for (FeedbackResponseCommentAttributes responseComment : responseComments)
{
FeedbackResponseCommentAttributes.UpdateOptions.Builder updateOptionsBuilder = FeedbackResponseCommentAttributes.updateOptionsBuilder(responseComment.getId());
if (isResponseIdChanged)
{
updateOptionsBuilder.withFeedbackResponseId(newResponse.getId());
}
if (isGiverSectionChanged)
{
updateOptionsBuilder.withGiverSection(newResponse.getGiverSection());
}
if (isRecipientSectionChanged)
{
updateOptionsBuilder.withReceiverSection(newResponse.getRecipientSection());
}
frcLogic.updateFeedbackResponseComment(updateOptionsBuilder.build());
}
}
return newResponse;
}

public  void updateFeedbackResponsesForChangingTeam(String courseId, String userEmail, String oldTeam, String newTeam) {
FeedbackQuestionAttributes question;
List<FeedbackResponseAttributes> responsesFromUser = getFeedbackResponsesFromGiverForCourse(courseId, userEmail);
for (FeedbackResponseAttributes response : responsesFromUser)
{
question = fqLogic.getFeedbackQuestion(response.getFeedbackQuestionId());
if (question.getGiverType() == FeedbackParticipantType.TEAMS || isRecipientTypeTeamMembers(question))
{
deleteFeedbackResponseCascade(response.getId());
}
}
List<FeedbackResponseAttributes> responsesToUser = getFeedbackResponsesForReceiverForCourse(courseId, userEmail);
for (FeedbackResponseAttributes response : responsesToUser)
{
question = fqLogic.getFeedbackQuestion(response.getFeedbackQuestionId());
if (isRecipientTypeTeamMembers(question))
{
deleteFeedbackResponseCascade(response.getId());
}
}
boolean isOldTeamEmpty = studentsLogic.getStudentsForTeam(oldTeam, courseId).isEmpty();
if (isOldTeamEmpty)
{
deleteFeedbackResponsesInvolvedEntityOfCourseCascade(courseId, oldTeam);
}
}

public  void updateFeedbackResponsesForChangingSection(String courseId, String userEmail, String oldSection, String newSection)throws EntityDoesNotExistException, InvalidParametersException {
updateSectionOfResponsesFromUser(courseId, userEmail, newSection);
updateSectionOfResponsesToUser(courseId, userEmail, newSection);
}

private  void updateSectionOfResponsesToUser(String courseId, String userEmail, String newSection)throws InvalidParametersException, EntityDoesNotExistException {
List<FeedbackResponseAttributes> responsesToUser = getFeedbackResponsesForReceiverForCourse(courseId, userEmail);
for (FeedbackResponseAttributes response : responsesToUser)
{
try {
frDb.updateFeedbackResponse(FeedbackResponseAttributes.updateOptionsBuilder(response.getId()).withRecipientSection(newSection).build());
}
catch(EntityAlreadyExistsException e){
assert false : "Not possible to trigger recreating of response";
}
frcLogic.updateFeedbackResponseCommentsForResponse(response.getId());
}
}

private  void updateSectionOfResponsesFromUser(String courseId, String userEmail, String newSection)throws InvalidParametersException, EntityDoesNotExistException {
List<FeedbackResponseAttributes> responsesFromUser = getFeedbackResponsesFromGiverForCourse(courseId, userEmail);
for (FeedbackResponseAttributes response : responsesFromUser)
{
try {
frDb.updateFeedbackResponse(FeedbackResponseAttributes.updateOptionsBuilder(response.getId()).withGiverSection(newSection).build());
}
catch(EntityAlreadyExistsException e){
assert false : "Not possible to trigger recreating of response";
}
frcLogic.updateFeedbackResponseCommentsForResponse(response.getId());
}
}

private  boolean isRecipientTypeTeamMembers(FeedbackQuestionAttributes question) {
return question.getRecipientType() == FeedbackParticipantType.OWN_TEAM_MEMBERS || question.getRecipientType() == FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
}

public  void updateFeedbackResponsesForChangingEmail(String courseId, String oldEmail, String newEmail)throws InvalidParametersException, EntityDoesNotExistException {
List<FeedbackResponseAttributes> responsesFromUser = getFeedbackResponsesFromGiverForCourse(courseId, oldEmail);
for (FeedbackResponseAttributes response : responsesFromUser)
{
try {
updateFeedbackResponseCascade(FeedbackResponseAttributes.updateOptionsBuilder(response.getId()).withGiver(newEmail).build());
frcLogic.updateFeedbackResponseCommentsEmails(courseId, oldEmail, newEmail);
}
catch(EntityAlreadyExistsException e){
assert false : "Feedback response failed to update successfully as email was already in use.";
}
}
List<FeedbackResponseAttributes> responsesToUser = getFeedbackResponsesForReceiverForCourse(courseId, oldEmail);
for (FeedbackResponseAttributes response : responsesToUser)
{
try {
updateFeedbackResponseCascade(FeedbackResponseAttributes.updateOptionsBuilder(response.getId()).withRecipient(newEmail).build());
}
catch(EntityAlreadyExistsException e){
assert false : "Feedback response failed to update successfully as email was already in use.";
}
}
}

public  void deleteFeedbackResponses(AttributesDeletionQuery query) {
frDb.deleteFeedbackResponses(query);
}

public  void deleteFeedbackResponseCascade(String responseId) {
frcLogic.deleteFeedbackResponseComments(AttributesDeletionQuery.builder().withResponseId(responseId).build());
frDb.deleteFeedbackResponse(responseId);
}

public  void deleteFeedbackResponsesForQuestionCascade(String feedbackQuestionId) {
AttributesDeletionQuery query = AttributesDeletionQuery.builder().withQuestionId(feedbackQuestionId).build();
deleteFeedbackResponses(query);
frcLogic.deleteFeedbackResponseComments(query);
}

public  void deleteFeedbackResponsesInvolvedEntityOfCourseCascade(String courseId, String entityEmail) {
List<FeedbackResponseAttributes> responsesFromStudent = getFeedbackResponsesFromGiverForCourse(courseId, entityEmail);
for (FeedbackResponseAttributes response : responsesFromStudent)
{
deleteFeedbackResponseCascade(response.getId());
}
List<FeedbackResponseAttributes> responsesToStudent = getFeedbackResponsesForReceiverForCourse(courseId, entityEmail);
for (FeedbackResponseAttributes response : responsesToStudent)
{
deleteFeedbackResponseCascade(response.getId());
}
}

private  List<FeedbackResponseAttributes> getFeedbackResponsesFromTeamForQuestion(String feedbackQuestionId, String courseId, String teamName, @Nullable
CourseRoster courseRoster) {
List<FeedbackResponseAttributes> responses = new  ArrayList<>();
List<StudentAttributes> studentsInTeam = courseRoster == null ? studentsLogic.getStudentsForTeam(teamName, courseId) : courseRoster.getTeamToMembersTable().get(teamName);
for (StudentAttributes student : studentsInTeam)
{
responses.addAll(frDb.getFeedbackResponsesFromGiverForQuestion(feedbackQuestionId, student.getEmail()));
}
responses.addAll(frDb.getFeedbackResponsesFromGiverForQuestion(feedbackQuestionId, teamName));
return responses;
}

private  List<FeedbackResponseAttributes> getFeedbackResponsesToOrFromInstructorForQuestion(FeedbackQuestionAttributes question, InstructorAttributes instructor) {
UniqueResponsesSet viewableResponses = new  UniqueResponsesSet();
if (question.getGiverType() == FeedbackParticipantType.INSTRUCTORS)
{
viewableResponses.addNewResponses(getFeedbackResponsesFromGiverForQuestion(question.getFeedbackQuestionId(), instructor.getEmail()));
}
if (question.getRecipientType() == FeedbackParticipantType.INSTRUCTORS && (question.isResponseVisibleTo(FeedbackParticipantType.RECEIVER) || question.isResponseVisibleTo(FeedbackParticipantType.INSTRUCTORS)))
{
viewableResponses.addNewResponses(getFeedbackResponsesForReceiverForQuestion(question.getFeedbackQuestionId(), instructor.getEmail()));
}
return viewableResponses.getResponses();
}

private  List<FeedbackResponseAttributes> getViewableFeedbackResponsesForStudentForQuestion(FeedbackQuestionAttributes question, StudentAttributes student, CourseRoster courseRoster) {
UniqueResponsesSet viewableResponses = new  UniqueResponsesSet();
if (question.getGiverType() != FeedbackParticipantType.INSTRUCTORS)
{
viewableResponses.addNewResponses(getFeedbackResponsesFromGiverForQuestion(question.getFeedbackQuestionId(), student.getEmail()));
}
if (question.getRecipientType() != FeedbackParticipantType.INSTRUCTORS && question.isResponseVisibleTo(FeedbackParticipantType.RECEIVER))
{
viewableResponses.addNewResponses(getFeedbackResponsesForReceiverForQuestion(question.getFeedbackQuestionId(), student.getEmail()));
}
if (question.isResponseVisibleTo(FeedbackParticipantType.STUDENTS))
{
viewableResponses.addNewResponses(getFeedbackResponsesForQuestion(question.getId()));
return viewableResponses.getResponses();
}
if (question.getRecipientType().isTeam() && question.isResponseVisibleTo(FeedbackParticipantType.RECEIVER))
{
viewableResponses.addNewResponses(getFeedbackResponsesForReceiverForQuestion(question.getId(), student.getTeam()));
}
if (question.getGiverType() == FeedbackParticipantType.TEAMS || question.isResponseVisibleTo(FeedbackParticipantType.OWN_TEAM_MEMBERS))
{
viewableResponses.addNewResponses(getFeedbackResponsesFromTeamForQuestion(question.getId(), question.getCourseId(), student.getTeam(), courseRoster));
}
if (question.isResponseVisibleTo(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS))
{
for (StudentAttributes studentInTeam : courseRoster.getTeamToMembersTable().get(student.getTeam()))
{
if (studentInTeam.getEmail().equals(student.getEmail()))
{
continue;
}
List<FeedbackResponseAttributes> responses = frDb.getFeedbackResponsesForReceiverForQuestion(question.getId(), studentInTeam.getEmail());
viewableResponses.addNewResponses(responses);
}
}
return viewableResponses.getResponses();
}

private static class UniqueResponsesSet {
private final Set<String> responseIds;

private final List<FeedbackResponseAttributes> responses;

private  UniqueResponsesSet(){
responseIds = new  HashSet<>();
responses = new  ArrayList<>();
}
private  void addNewResponses(Collection<FeedbackResponseAttributes> newResponses) {
newResponses.forEach(this::addNewResponse);
}

private  void addNewResponse(FeedbackResponseAttributes newResponse) {
if (responseIds.contains(newResponse.getId()))
{
return;
}
responseIds.add(newResponse.getId());
responses.add(newResponse);
}

private  List<FeedbackResponseAttributes> getResponses() {
return responses;
}

}
}
