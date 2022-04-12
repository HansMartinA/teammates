package teammates.logic.core;

import java.util.ArrayList;
import java.util.List;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InstructorUpdateException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.exception.SearchServiceException;
import teammates.common.util.Const;
import teammates.common.util.Logger;
import teammates.storage.api.InstructorsDb;
public final class InstructorsLogic {
private static final Logger log = Logger.getLogger();

private static final InstructorsLogic instance = new  InstructorsLogic();

private final InstructorsDb instructorsDb = InstructorsDb.inst();

private FeedbackResponsesLogic frLogic;

private FeedbackResponseCommentsLogic frcLogic;

private FeedbackQuestionsLogic fqLogic;

private  InstructorsLogic(){
}
public static  InstructorsLogic inst() {
return instance;
}

 void initLogicDependencies() {
fqLogic = FeedbackQuestionsLogic.inst();
frLogic = FeedbackResponsesLogic.inst();
frcLogic = FeedbackResponseCommentsLogic.inst();
}

public  void putDocument(InstructorAttributes instructor)throws SearchServiceException {
instructorsDb.putDocument(instructor);
}

public  List<InstructorAttributes> searchInstructorsInWholeSystem(String queryString)throws SearchServiceException {
return instructorsDb.searchInstructorsInWholeSystem(queryString);
}

public  InstructorAttributes createInstructor(InstructorAttributes instructorToAdd)throws InvalidParametersException, EntityAlreadyExistsException {
return instructorsDb.createEntity(instructorToAdd);
}

public  void setArchiveStatusOfInstructor(String googleId, String courseId, boolean archiveStatus)throws InvalidParametersException, EntityDoesNotExistException {
instructorsDb.updateInstructorByGoogleId(InstructorAttributes.updateOptionsWithGoogleIdBuilder(courseId, googleId).withIsArchived(archiveStatus).build());
}

public  InstructorAttributes getInstructorForEmail(String courseId, String email) {
return instructorsDb.getInstructorForEmail(courseId, email);
}

public  InstructorAttributes getInstructorById(String courseId, String email) {
return instructorsDb.getInstructorById(courseId, email);
}

public  InstructorAttributes getInstructorForGoogleId(String courseId, String googleId) {
return instructorsDb.getInstructorForGoogleId(courseId, googleId);
}

public  InstructorAttributes getInstructorForRegistrationKey(String registrationKey) {
return instructorsDb.getInstructorForRegistrationKey(registrationKey);
}

public  List<InstructorAttributes> getInstructorsForCourse(String courseId) {
List<InstructorAttributes> instructorReturnList = instructorsDb.getInstructorsForCourse(courseId);
InstructorAttributes.sortByName(instructorReturnList);
return instructorReturnList;
}

public  List<InstructorAttributes> getInstructorsForGoogleId(String googleId) {
return getInstructorsForGoogleId(googleId, false);
}

public  List<InstructorAttributes> getInstructorsForGoogleId(String googleId, boolean omitArchived) {
return instructorsDb.getInstructorsForGoogleId(googleId, omitArchived);
}

 void verifyAtLeastOneInstructorIsDisplayed(String courseId, boolean isOriginalInstructorDisplayed, boolean isEditedInstructorDisplayed)throws InstructorUpdateException {
List<InstructorAttributes> instructorsDisplayed = instructorsDb.getInstructorsDisplayedToStudents(courseId);
boolean isEditedInstructorChangedToNonVisible = isOriginalInstructorDisplayed && !isEditedInstructorDisplayed;
boolean isNoInstructorMadeVisible = instructorsDisplayed.isEmpty() && !isEditedInstructorDisplayed;
if (isNoInstructorMadeVisible || instructorsDisplayed.size() == 1 && isEditedInstructorChangedToNonVisible)
{
throw new  InstructorUpdateException("At least one instructor must be displayed to students");
}
}

public  InstructorAttributes updateInstructorByGoogleIdCascade(InstructorAttributes.UpdateOptionsWithGoogleId updateOptions)throws InstructorUpdateException, InvalidParametersException, EntityDoesNotExistException {
InstructorAttributes originalInstructor = instructorsDb.getInstructorForGoogleId(updateOptions.getCourseId(), updateOptions.getGoogleId());
if (originalInstructor == null)
{
throw new  EntityDoesNotExistException("Trying to update non-existent Entity: " + updateOptions);
}
InstructorAttributes newInstructor = originalInstructor.getCopy();
newInstructor.update(updateOptions);
boolean isOriginalInstructorDisplayed = originalInstructor.isDisplayedToStudents();
verifyAtLeastOneInstructorIsDisplayed(originalInstructor.getCourseId(), isOriginalInstructorDisplayed, newInstructor.isDisplayedToStudents());
InstructorAttributes updatedInstructor = instructorsDb.updateInstructorByGoogleId(updateOptions);
if (!originalInstructor.getEmail().equals(updatedInstructor.getEmail()))
{
List<FeedbackResponseAttributes> responsesFromUser = frLogic.getFeedbackResponsesFromGiverForCourse(originalInstructor.getCourseId(), originalInstructor.getEmail());
for (FeedbackResponseAttributes responseFromUser : responsesFromUser)
{
FeedbackQuestionAttributes question = fqLogic.getFeedbackQuestion(responseFromUser.getFeedbackQuestionId());
if (question.getGiverType() == FeedbackParticipantType.INSTRUCTORS || question.getGiverType() == FeedbackParticipantType.SELF)
{
try {
frLogic.updateFeedbackResponseCascade(FeedbackResponseAttributes.updateOptionsBuilder(responseFromUser.getId()).withGiver(updatedInstructor.getEmail()).build());
}
catch(EntityAlreadyExistsException e){
log.severe("Fail to adjust 'from' responses when updating instructor: " + e.getMessage());
}
}
}
List<FeedbackResponseAttributes> responsesToUser = frLogic.getFeedbackResponsesForReceiverForCourse(originalInstructor.getCourseId(), originalInstructor.getEmail());
for (FeedbackResponseAttributes responseToUser : responsesToUser)
{
FeedbackQuestionAttributes question = fqLogic.getFeedbackQuestion(responseToUser.getFeedbackQuestionId());
if (question.getRecipientType() == FeedbackParticipantType.INSTRUCTORS || question.getGiverType() == FeedbackParticipantType.INSTRUCTORS && question.getRecipientType() == FeedbackParticipantType.SELF)
{
try {
frLogic.updateFeedbackResponseCascade(FeedbackResponseAttributes.updateOptionsBuilder(responseToUser.getId()).withRecipient(updatedInstructor.getEmail()).build());
}
catch(EntityAlreadyExistsException e){
log.severe("Fail to adjust 'to' responses when updating instructor: " + e.getMessage());
}
}
}
frcLogic.updateFeedbackResponseCommentsEmails(updatedInstructor.getCourseId(), originalInstructor.getEmail(), updatedInstructor.getEmail());
}
return updatedInstructor;
}

public  InstructorAttributes updateInstructorByEmail(InstructorAttributes.UpdateOptionsWithEmail updateOptions)throws InstructorUpdateException, InvalidParametersException, EntityDoesNotExistException {
assert updateOptions != null;
InstructorAttributes originalInstructor = instructorsDb.getInstructorForEmail(updateOptions.getCourseId(), updateOptions.getEmail());
if (originalInstructor == null)
{
throw new  EntityDoesNotExistException("Trying to update non-existent Entity: " + updateOptions);
}
InstructorAttributes newInstructor = originalInstructor.getCopy();
newInstructor.update(updateOptions);
boolean isOriginalInstructorDisplayed = originalInstructor.isDisplayedToStudents();
verifyAtLeastOneInstructorIsDisplayed(originalInstructor.getCourseId(), isOriginalInstructorDisplayed, newInstructor.isDisplayedToStudents());
return instructorsDb.updateInstructorByEmail(updateOptions);
}

public  void deleteInstructors(AttributesDeletionQuery query) {
instructorsDb.deleteInstructors(query);
}

public  void deleteInstructorCascade(String courseId, String email) {
InstructorAttributes instructorAttributes = getInstructorForEmail(courseId, email);
if (instructorAttributes == null)
{
return;
}
frLogic.deleteFeedbackResponsesInvolvedEntityOfCourseCascade(courseId, email);
instructorsDb.deleteInstructor(courseId, email);
}

public  void deleteInstructorsForGoogleIdCascade(String googleId) {
List<InstructorAttributes> instructors = instructorsDb.getInstructorsForGoogleId(googleId, false);
for (InstructorAttributes instructor : instructors)
{
deleteInstructorCascade(instructor.getCourseId(), instructor.getEmail());
}
}

public  List<InstructorAttributes> getCoOwnersForCourse(String courseId) {
List<InstructorAttributes> instructors = getInstructorsForCourse(courseId);
List<InstructorAttributes> instructorsWithCoOwnerPrivileges = new  ArrayList<>();
for (InstructorAttributes instructor : instructors)
{
if (!instructor.hasCoownerPrivileges())
{
continue;
}
instructorsWithCoOwnerPrivileges.add(instructor);
}
return instructorsWithCoOwnerPrivileges;
}

public  void resetInstructorGoogleId(String originalEmail, String courseId)throws EntityDoesNotExistException {
try {
instructorsDb.updateInstructorByEmail(InstructorAttributes.updateOptionsWithEmailBuilder(courseId, originalEmail).withGoogleId(null).build());
}
catch(InvalidParametersException e){
assert false : "Unexpected invalid parameter.";
}
}

public  void updateToEnsureValidityOfInstructorsForTheCourse(String courseId, InstructorAttributes instructorToEdit) {
List<InstructorAttributes> instructors = getInstructorsForCourse(courseId);
int numOfInstrCanModifyInstructor = 0;
InstructorAttributes instrWithModifyInstructorPrivilege = null;
for (InstructorAttributes instructor : instructors)
{
if (instructor.isAllowedForPrivilege(Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR))
{
numOfInstrCanModifyInstructor++;
instrWithModifyInstructorPrivilege = instructor;
}
}
boolean isLastRegInstructorWithPrivilege = numOfInstrCanModifyInstructor <= 1 && instrWithModifyInstructorPrivilege != null && (!instrWithModifyInstructorPrivilege.isRegistered() || instrWithModifyInstructorPrivilege.getGoogleId().equals(instructorToEdit.getGoogleId()));
if (isLastRegInstructorWithPrivilege)
{
instructorToEdit.getPrivileges().updatePrivilege(Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR, true);
}
}

public  InstructorAttributes regenerateInstructorRegistrationKey(String courseId, String email)throws EntityDoesNotExistException, EntityAlreadyExistsException {
InstructorAttributes originalInstructor = instructorsDb.getInstructorForEmail(courseId, email);
if (originalInstructor == null)
{
String errorMessage = String.format("The instructor with the email %s could not be found for the course with ID [%s].", email, courseId);
throw new  EntityDoesNotExistException(errorMessage);
}
return instructorsDb.regenerateEntityKey(originalInstructor);
}

}
