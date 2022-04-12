package teammates.logic.core;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Const;
import teammates.common.util.Logger;
import teammates.common.util.TimeHelper;
import teammates.storage.api.FeedbackSessionsDb;
public final class FeedbackSessionsLogic {
private static final Logger log = Logger.getLogger();

private static final String ERROR_NON_EXISTENT_FS_STRING_FORMAT = "Trying to %s a non-existent feedback session: ";

private static final String ERROR_NON_EXISTENT_FS_UPDATE = String.format(ERROR_NON_EXISTENT_FS_STRING_FORMAT, "update");

private static final String ERROR_FS_ALREADY_PUBLISH = "Error publishing feedback session: " + "Session has already been published.";

private static final String ERROR_FS_ALREADY_UNPUBLISH = "Error unpublishing feedback session: " + "Session has already been unpublished.";

private static final int NUMBER_OF_HOURS_BEFORE_CLOSING_ALERT = 24;

private static final int NUMBER_OF_HOURS_BEFORE_OPENING_SOON_ALERT = 24;

private static final FeedbackSessionsLogic instance = new  FeedbackSessionsLogic();

private final FeedbackSessionsDb fsDb = FeedbackSessionsDb.inst();

private CoursesLogic coursesLogic;

private FeedbackQuestionsLogic fqLogic;

private FeedbackResponsesLogic frLogic;

private FeedbackResponseCommentsLogic frcLogic;

private InstructorsLogic instructorsLogic;

private StudentsLogic studentsLogic;

private  FeedbackSessionsLogic(){
}
public static  FeedbackSessionsLogic inst() {
return instance;
}

 void initLogicDependencies() {
coursesLogic = CoursesLogic.inst();
fqLogic = FeedbackQuestionsLogic.inst();
frLogic = FeedbackResponsesLogic.inst();
frcLogic = FeedbackResponseCommentsLogic.inst();
instructorsLogic = InstructorsLogic.inst();
studentsLogic = StudentsLogic.inst();
}

public  FeedbackSessionAttributes createFeedbackSession(FeedbackSessionAttributes fsa)throws InvalidParametersException, EntityAlreadyExistsException {
return fsDb.createEntity(fsa);
}

public  List<FeedbackSessionAttributes> getAllOngoingSessions(Instant rangeStart, Instant rangeEnd) {
return fsDb.getAllOngoingSessions(rangeStart, rangeEnd);
}

public  FeedbackSessionAttributes getFeedbackSession(String feedbackSessionName, String courseId) {
return fsDb.getFeedbackSession(courseId, feedbackSessionName);
}

public  FeedbackSessionAttributes getFeedbackSessionFromRecycleBin(String feedbackSessionName, String courseId) {
return fsDb.getSoftDeletedFeedbackSession(courseId, feedbackSessionName);
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsForCourse(String courseId) {
return fsDb.getFeedbackSessionsForCourse(courseId);
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsForCourseStartingAfter(String courseId, Instant after) {
return fsDb.getFeedbackSessionsForCourseStartingAfter(courseId, after);
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsListForInstructor(List<InstructorAttributes> instructorList) {
List<InstructorAttributes> courseNotDeletedInstructorList = instructorList.stream().filter(instructor -> !coursesLogic.getCourse(instructor.getCourseId()).isCourseDeleted()).collect(Collectors.toList());
List<FeedbackSessionAttributes> fsList = new  ArrayList<>();
for (InstructorAttributes instructor : courseNotDeletedInstructorList)
{
fsList.addAll(getFeedbackSessionsListForCourse(instructor.getCourseId()));
}
return fsList;
}

public  List<FeedbackSessionAttributes> getSoftDeletedFeedbackSessionsListForInstructors(List<InstructorAttributes> instructorList) {
List<InstructorAttributes> courseNotDeletedInstructorList = instructorList.stream().filter(instructor -> !coursesLogic.getCourse(instructor.getCourseId()).isCourseDeleted()).collect(Collectors.toList());
List<FeedbackSessionAttributes> fsList = new  ArrayList<>();
for (InstructorAttributes instructor : courseNotDeletedInstructorList)
{
fsList.addAll(getSoftDeletedFeedbackSessionsListForCourse(instructor.getCourseId()));
}
return fsList;
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent() {
List<FeedbackSessionAttributes> sessions = fsDb.getFeedbackSessionsPossiblyNeedingPublishedEmail();
log.info(String.format("Number of sessions under consideration: %d", sessions.size()));
List<FeedbackSessionAttributes> sessionsToSendEmailsFor = new  ArrayList<>();
for (FeedbackSessionAttributes session : sessions)
{
if (session.isPublished() && !TimeHelper.isSpecialTime(session.getResultsVisibleFromTime()) && !coursesLogic.getCourse(session.getCourseId()).isCourseDeleted())
{
sessionsToSendEmailsFor.add(session);
}
}
log.info(String.format("Number of sessions under consideration after filtering: %d", sessionsToSendEmailsFor.size()));
return sessionsToSendEmailsFor;
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsWhichNeedOpenEmailsToBeSent() {
List<FeedbackSessionAttributes> sessions = fsDb.getFeedbackSessionsPossiblyNeedingOpenEmail();
List<FeedbackSessionAttributes> sessionsToSendEmailsFor = new  ArrayList<>();
log.info(String.format("Number of sessions under consideration: %d", sessions.size()));
for (FeedbackSessionAttributes session : sessions)
{
if (session.isOpened() && !coursesLogic.getCourse(session.getCourseId()).isCourseDeleted())
{
sessionsToSendEmailsFor.add(session);
}
}
log.info(String.format("Number of sessions under consideration after filtering: %d", sessionsToSendEmailsFor.size()));
return sessionsToSendEmailsFor;
}

public  boolean isCreatorOfSession(String feedbackSessionName, String courseId, String userEmail) {
FeedbackSessionAttributes fs = getFeedbackSession(feedbackSessionName, courseId);
if (fs == null)
{
return false;
}
return fs.getCreatorEmail().equals(userEmail);
}

public  boolean isFeedbackSessionAttemptedByStudent(FeedbackSessionAttributes fsa, String userEmail, String userTeam) {
String feedbackSessionName = fsa.getFeedbackSessionName();
String courseId = fsa.getCourseId();
if (!fqLogic.sessionHasQuestions(feedbackSessionName, courseId))
{
return true;
}
else
if (fqLogic.sessionHasQuestionsForGiverType(feedbackSessionName, courseId, FeedbackParticipantType.STUDENTS))
{
return frLogic.hasGiverRespondedForSession(userEmail, feedbackSessionName, courseId);
}
else
{
return frLogic.hasGiverRespondedForSession(userTeam, feedbackSessionName, courseId);
}
}

public  boolean isFeedbackSessionAttemptedByInstructor(FeedbackSessionAttributes fsa, String userEmail) {
if (frLogic.hasGiverRespondedForSession(userEmail, fsa.getFeedbackSessionName(), fsa.getCourseId()))
{
return true;
}
String feedbackSessionName = fsa.getFeedbackSessionName();
String courseId = fsa.getCourseId();
List<FeedbackQuestionAttributes> allQuestions = fqLogic.getFeedbackQuestionsForInstructors(feedbackSessionName, courseId, userEmail);
return allQuestions.isEmpty();
}

public  FeedbackSessionAttributes updateFeedbackSession(FeedbackSessionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
FeedbackSessionAttributes oldSession = fsDb.getFeedbackSession(updateOptions.getCourseId(), updateOptions.getFeedbackSessionName());
if (oldSession == null)
{
throw new  EntityDoesNotExistException(ERROR_NON_EXISTENT_FS_UPDATE + updateOptions.getCourseId() + "/" + updateOptions.getFeedbackSessionName());
}
FeedbackSessionAttributes newSession = oldSession.getCopy();
newSession.update(updateOptions);
FeedbackSessionAttributes.UpdateOptions.Builder newUpdateOptions = FeedbackSessionAttributes.updateOptionsBuilder(updateOptions);
if (oldSession.isSentOpenEmail())
{
newUpdateOptions.withSentOpenEmail(newSession.isOpened());
newUpdateOptions.withSentOpeningSoonEmail(newSession.isOpened() || newSession.isOpeningInHours(NUMBER_OF_HOURS_BEFORE_OPENING_SOON_ALERT));
}
if (oldSession.isSentClosedEmail())
{
newUpdateOptions.withSentClosedEmail(newSession.isClosed());
newUpdateOptions.withSentClosingEmail(newSession.isClosed() || newSession.isClosedAfter(NUMBER_OF_HOURS_BEFORE_CLOSING_ALERT));
}
if (oldSession.isSentPublishedEmail())
{
newUpdateOptions.withSentPublishedEmail(newSession.isPublished());
}
return fsDb.updateFeedbackSession(newUpdateOptions.build());
}

public  void updateFeedbackSessionsTimeZoneForCourse(String courseId, String courseTimeZone) {
assert courseId != null;
assert courseTimeZone != null;
List<FeedbackSessionAttributes> fsForCourse = fsDb.getFeedbackSessionsForCourse(courseId);
fsForCourse.forEach(fs -> {
try {
fsDb.updateFeedbackSession(FeedbackSessionAttributes.updateOptionsBuilder(fs.getFeedbackSessionName(), fs.getCourseId()).withTimeZone(courseTimeZone).build());
}
catch(EntityDoesNotExistException | InvalidParametersException e){
log.severe("Cannot adjust timezone of courses: " + e.getMessage());
}
}
);
}

public  FeedbackSessionAttributes publishFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException, InvalidParametersException {
FeedbackSessionAttributes sessionToPublish = getFeedbackSession(feedbackSessionName, courseId);
if (sessionToPublish == null)
{
throw new  EntityDoesNotExistException(ERROR_NON_EXISTENT_FS_UPDATE + courseId + "/" + feedbackSessionName);
}
if (sessionToPublish.isPublished())
{
throw new  InvalidParametersException(ERROR_FS_ALREADY_PUBLISH);
}
return updateFeedbackSession(FeedbackSessionAttributes.updateOptionsBuilder(sessionToPublish.getFeedbackSessionName(), sessionToPublish.getCourseId()).withResultsVisibleFromTime(Instant.now()).build());
}

public  FeedbackSessionAttributes unpublishFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException, InvalidParametersException {
FeedbackSessionAttributes sessionToUnpublish = getFeedbackSession(feedbackSessionName, courseId);
if (sessionToUnpublish == null)
{
throw new  EntityDoesNotExistException(ERROR_NON_EXISTENT_FS_UPDATE + courseId + "/" + feedbackSessionName);
}
if (!sessionToUnpublish.isPublished())
{
throw new  InvalidParametersException(ERROR_FS_ALREADY_UNPUBLISH);
}
return updateFeedbackSession(FeedbackSessionAttributes.updateOptionsBuilder(sessionToUnpublish.getFeedbackSessionName(), sessionToUnpublish.getCourseId()).withResultsVisibleFromTime(Const.TIME_REPRESENTS_LATER).build());
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsOpeningWithinTimeLimit() {
List<FeedbackSessionAttributes> requiredSessions = new  ArrayList<>();
List<FeedbackSessionAttributes> sessions = fsDb.getFeedbackSessionsPossiblyNeedingOpeningSoonEmail();
log.info(String.format("Number of sessions under consideration: %d", sessions.size()));
for (FeedbackSessionAttributes session : sessions)
{
if (session.isOpeningWithinTimeLimit(NUMBER_OF_HOURS_BEFORE_OPENING_SOON_ALERT) && !coursesLogic.getCourse(session.getCourseId()).isCourseDeleted())
{
requiredSessions.add(session);
}
}
log.info(String.format("Number of sessions under consideration after filtering: %d", requiredSessions.size()));
return requiredSessions;
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsClosingWithinTimeLimit() {
List<FeedbackSessionAttributes> requiredSessions = new  ArrayList<>();
List<FeedbackSessionAttributes> sessions = fsDb.getFeedbackSessionsPossiblyNeedingClosingEmail();
log.info(String.format("Number of sessions under consideration: %d", sessions.size()));
for (FeedbackSessionAttributes session : sessions)
{
if (session.isClosingWithinTimeLimit(NUMBER_OF_HOURS_BEFORE_CLOSING_ALERT) && !coursesLogic.getCourse(session.getCourseId()).isCourseDeleted())
{
requiredSessions.add(session);
}
}
log.info(String.format("Number of sessions under consideration after filtering: %d", requiredSessions.size()));
return requiredSessions;
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsClosedWithinThePastHour() {
List<FeedbackSessionAttributes> requiredSessions = new  ArrayList<>();
List<FeedbackSessionAttributes> sessions = fsDb.getFeedbackSessionsPossiblyNeedingClosedEmail();
log.info(String.format("Number of sessions under consideration: %d", sessions.size()));
for (FeedbackSessionAttributes session : sessions)
{
if (session.isClosedWithinPastHour() && !coursesLogic.getCourse(session.getCourseId()).isCourseDeleted())
{
requiredSessions.add(session);
}
}
log.info(String.format("Number of sessions under consideration after filtering: %d", requiredSessions.size()));
return requiredSessions;
}

public  void deleteFeedbackSessionCascade(String feedbackSessionName, String courseId) {
AttributesDeletionQuery query = AttributesDeletionQuery.builder().withCourseId(courseId).withFeedbackSessionName(feedbackSessionName).build();
frcLogic.deleteFeedbackResponseComments(query);
frLogic.deleteFeedbackResponses(query);
fqLogic.deleteFeedbackQuestions(query);
fsDb.deleteFeedbackSession(feedbackSessionName, courseId);
}

public  void deleteFeedbackSessions(AttributesDeletionQuery query) {
fsDb.deleteFeedbackSessions(query);
}

public  Instant moveFeedbackSessionToRecycleBin(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
return fsDb.softDeleteFeedbackSession(feedbackSessionName, courseId);
}

public  void restoreFeedbackSessionFromRecycleBin(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
fsDb.restoreDeletedFeedbackSession(feedbackSessionName, courseId);
}

public  int getExpectedTotalSubmission(FeedbackSessionAttributes fsa) {
List<StudentAttributes> students = studentsLogic.getStudentsForCourse(fsa.getCourseId());
List<InstructorAttributes> instructors = instructorsLogic.getInstructorsForCourse(fsa.getCourseId());
List<FeedbackQuestionAttributes> questions = fqLogic.getFeedbackQuestionsForSession(fsa.getFeedbackSessionName(), fsa.getCourseId());
List<FeedbackQuestionAttributes> studentQns = fqLogic.getFeedbackQuestionsForStudents(questions);
int expectedTotal = 0;
if (!studentQns.isEmpty())
{
expectedTotal += students.size();
}
for (InstructorAttributes instructor : instructors)
{
List<FeedbackQuestionAttributes> instructorQns = fqLogic.getFeedbackQuestionsForInstructors(questions, fsa.isCreator(instructor.getEmail()));
if (!instructorQns.isEmpty())
{
expectedTotal += 1;
}
}
return expectedTotal;
}

public  int getActualTotalSubmission(FeedbackSessionAttributes fsa) {
return frLogic.getGiverSetThatAnswerFeedbackSession(fsa.getCourseId(), fsa.getFeedbackSessionName()).size();
}

private  List<FeedbackSessionAttributes> getFeedbackSessionsListForCourse(String courseId) {
return fsDb.getFeedbackSessionsForCourse(courseId);
}

private  List<FeedbackSessionAttributes> getSoftDeletedFeedbackSessionsListForCourse(String courseId) {
return fsDb.getSoftDeletedFeedbackSessionsForCourse(courseId);
}

public  boolean isFeedbackSessionViewableToUserType(FeedbackSessionAttributes session, boolean isInstructor) {
if (isFeedbackSessionForUserTypeToAnswer(session, isInstructor))
{
return true;
}
List<FeedbackQuestionAttributes> questionsWithVisibleResponses = new  ArrayList<>();
List<FeedbackQuestionAttributes> questionsForUser = fqLogic.getFeedbackQuestionsForSession(session.getFeedbackSessionName(), session.getCourseId());
for (FeedbackQuestionAttributes question : questionsForUser)
{
if (!isInstructor && frLogic.isResponseOfFeedbackQuestionVisibleToStudent(question) || isInstructor && frLogic.isResponseOfFeedbackQuestionVisibleToInstructor(question))
{
questionsWithVisibleResponses.add(question);
break;
}
}
return session.isVisible() && !questionsWithVisibleResponses.isEmpty();
}

public  boolean isFeedbackSessionForUserTypeToAnswer(FeedbackSessionAttributes session, boolean isInstructor) {
if (!session.isVisible())
{
return false;
}
return isInstructor ? fqLogic.hasFeedbackQuestionsForInstructors(session.getFeedbackSessionName(), session.getCourseId(), null) : fqLogic.hasFeedbackQuestionsForStudents(session.getFeedbackSessionName(), session.getCourseId());
}

}
