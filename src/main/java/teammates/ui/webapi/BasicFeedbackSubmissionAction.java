package teammates.ui.webapi;

import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.util.Const;
import teammates.common.util.StringHelper;
abstract class BasicFeedbackSubmissionAction extends Action {
 boolean canInstructorSeeQuestion(FeedbackQuestionAttributes feedbackQuestion) {
boolean isGiverVisibleToInstructor = feedbackQuestion.getShowGiverNameTo().contains(FeedbackParticipantType.INSTRUCTORS);
boolean isRecipientVisibleToInstructor = feedbackQuestion.getShowRecipientNameTo().contains(FeedbackParticipantType.INSTRUCTORS);
boolean isResponseVisibleToInstructor = feedbackQuestion.getShowResponsesTo().contains(FeedbackParticipantType.INSTRUCTORS);
return isResponseVisibleToInstructor && isGiverVisibleToInstructor && isRecipientVisibleToInstructor;
}

 void verifyInstructorCanSeeQuestionIfInModeration(FeedbackQuestionAttributes feedbackQuestion)throws UnauthorizedAccessException {
String moderatedPerson = getRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_MODERATED_PERSON);
if (!StringHelper.isEmpty(moderatedPerson) && !canInstructorSeeQuestion(feedbackQuestion))
{
throw new  UnauthorizedAccessException("The question is not applicable for moderation", true);
}
}

 StudentAttributes getStudentOfCourseFromRequest(String courseId) {
String moderatedPerson = getRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_MODERATED_PERSON);
String previewAsPerson = getRequestParamValue(Const.ParamsNames.PREVIEWAS);
if (!StringHelper.isEmpty(moderatedPerson))
{
return logic.getStudentForEmail(courseId, moderatedPerson);
}
else
if (!StringHelper.isEmpty(previewAsPerson))
{
return logic.getStudentForEmail(courseId, previewAsPerson);
}
else
{
return getUnregisteredStudent().orElseGet(() -> {
if (userInfo == null)
{
return null;
}
return logic.getStudentForGoogleId(courseId, userInfo.getId());
}
);
}
}

 void checkAccessControlForStudentFeedbackSubmission(StudentAttributes student, FeedbackSessionAttributes feedbackSession)throws UnauthorizedAccessException {
if (student == null)
{
throw new  UnauthorizedAccessException("Trying to access system using a non-existent student entity");
}
String moderatedPerson = getRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_MODERATED_PERSON);
String previewAsPerson = getRequestParamValue(Const.ParamsNames.PREVIEWAS);
if (!StringHelper.isEmpty(moderatedPerson))
{
gateKeeper.verifyLoggedInUserPrivileges(userInfo);
gateKeeper.verifyAccessible(logic.getInstructorForGoogleId(feedbackSession.getCourseId(), userInfo.getId()), feedbackSession, student.getSection(), Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS);
}
else
if (!StringHelper.isEmpty(previewAsPerson))
{
gateKeeper.verifyLoggedInUserPrivileges(userInfo);
gateKeeper.verifyAccessible(logic.getInstructorForGoogleId(feedbackSession.getCourseId(), userInfo.getId()), feedbackSession, Const.InstructorPermissions.CAN_MODIFY_SESSION);
}
else
{
if (!StringHelper.isEmpty(student.getGoogleId()))
{
if (userInfo == null)
{
throw new  UnauthorizedAccessException("Login is required to access this feedback session");
}
else
if (!userInfo.id.equals(student.getGoogleId()))
{
throw new  UnauthorizedAccessException("You are not authorized to access this feedback session");
}
}
gateKeeper.verifyAccessible(student, feedbackSession);
}
}

 InstructorAttributes getInstructorOfCourseFromRequest(String courseId) {
String moderatedPerson = getRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_MODERATED_PERSON);
String previewAsPerson = getRequestParamValue(Const.ParamsNames.PREVIEWAS);
if (!StringHelper.isEmpty(moderatedPerson))
{
return logic.getInstructorForEmail(courseId, moderatedPerson);
}
else
if (!StringHelper.isEmpty(previewAsPerson))
{
return logic.getInstructorForEmail(courseId, previewAsPerson);
}
else
{
return getUnregisteredInstructor().orElseGet(() -> {
if (userInfo == null)
{
return null;
}
return logic.getInstructorForGoogleId(courseId, userInfo.getId());
}
);
}
}

 void checkAccessControlForInstructorFeedbackSubmission(InstructorAttributes instructor, FeedbackSessionAttributes feedbackSession)throws UnauthorizedAccessException {
if (instructor == null)
{
throw new  UnauthorizedAccessException("Trying to access system using a non-existent instructor entity");
}
String moderatedPerson = getRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_MODERATED_PERSON);
String previewAsPerson = getRequestParamValue(Const.ParamsNames.PREVIEWAS);
if (!StringHelper.isEmpty(moderatedPerson))
{
gateKeeper.verifyLoggedInUserPrivileges(userInfo);
gateKeeper.verifyAccessible(logic.getInstructorForGoogleId(feedbackSession.getCourseId(), userInfo.getId()), feedbackSession, Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS);
}
else
if (!StringHelper.isEmpty(previewAsPerson))
{
gateKeeper.verifyLoggedInUserPrivileges(userInfo);
gateKeeper.verifyAccessible(logic.getInstructorForGoogleId(feedbackSession.getCourseId(), userInfo.getId()), feedbackSession, Const.InstructorPermissions.CAN_MODIFY_SESSION);
}
else
{
if (!StringHelper.isEmpty(instructor.getGoogleId()))
{
if (userInfo == null)
{
throw new  UnauthorizedAccessException("Login is required to access this feedback session");
}
else
if (!userInfo.id.equals(instructor.getGoogleId()))
{
throw new  UnauthorizedAccessException("You are not authorized to access this feedback session");
}
}
gateKeeper.verifySessionSubmissionPrivilegeForInstructor(feedbackSession, instructor);
}
}

 void verifyNotPreview()throws UnauthorizedAccessException {
String previewAsPerson = getRequestParamValue(Const.ParamsNames.PREVIEWAS);
if (!StringHelper.isEmpty(previewAsPerson))
{
throw new  UnauthorizedAccessException("You are not allowed to see responses when previewing", true);
}
}

 void verifySessionOpenExceptForModeration(FeedbackSessionAttributes feedbackSession)throws UnauthorizedAccessException {
String moderatedPerson = getRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_MODERATED_PERSON);
if (StringHelper.isEmpty(moderatedPerson) && !(feedbackSession.isOpened() || feedbackSession.isInGracePeriod()))
{
throw new  UnauthorizedAccessException("The feedback session is not available for submission", true);
}
}

 String getRecipientSection(String courseId, FeedbackParticipantType giverType, FeedbackParticipantType recipientType, String recipientIdentifier) {
switch (recipientType) {
case SELF: switch (giverType) {
case INSTRUCTORS: case SELF: return Const.DEFAULT_SECTION;
case TEAMS: case TEAMS_IN_SAME_SECTION: return logic.getSectionForTeam(courseId, recipientIdentifier);
case STUDENTS: case STUDENTS_IN_SAME_SECTION: StudentAttributes student = logic.getStudentForEmail(courseId, recipientIdentifier);
return student == null ? Const.DEFAULT_SECTION : student.getSection();
default: assert false : "Invalid giver type " + giverType + " for recipient type " + recipientType;
return null;

}
case INSTRUCTORS: case NONE: return Const.DEFAULT_SECTION;
case TEAMS: case TEAMS_IN_SAME_SECTION: case OWN_TEAM: return logic.getSectionForTeam(courseId, recipientIdentifier);
case STUDENTS: case STUDENTS_IN_SAME_SECTION: case OWN_TEAM_MEMBERS: case OWN_TEAM_MEMBERS_INCLUDING_SELF: StudentAttributes student = logic.getStudentForEmail(courseId, recipientIdentifier);
return student == null ? Const.DEFAULT_SECTION : student.getSection();
default: assert false : "Unknown recipient type " + recipientType;
return null;

}
}

}
