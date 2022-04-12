package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.util.List;
import com.googlecode.objectify.cmd.LoadType;
import com.googlecode.objectify.cmd.Query;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.storage.entity.FeedbackQuestion;
public final class FeedbackQuestionsDb extends EntitiesDb<FeedbackQuestion, FeedbackQuestionAttributes> {
private static final FeedbackQuestionsDb instance = new  FeedbackQuestionsDb();

private  FeedbackQuestionsDb(){
}
public static  FeedbackQuestionsDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_um5a0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_um73ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682938005710510506577807 = instance;
threadMonitoringController.exitInternalAction("_um73ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682938005710510506577807;
}
finally {
threadMonitoringController.exitService("_um5a0LngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionAttributes getFeedbackQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_uv6M4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uv9QMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
threadMonitoringController.exitInternalAction("_uv9QMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uwGaJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683040007250925514533536 = makeAttributesOrNull(getFeedbackQuestionEntity(feedbackQuestionId));
threadMonitoringController.exitInternalAction("_uwGaJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uwIPVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136830410035491544250531926 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683040007250925514533536;
threadMonitoringController.exitInternalAction("_uwIPVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136830410035491544250531926;
}
finally {
threadMonitoringController.exitService("_uv6M4LngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionAttributes getFeedbackQuestion(String feedbackSessionName, String courseId, int questionNumber) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("questionNumber", questionNumber);
threadMonitoringController.enterService("_uwO9ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uwSAULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_uwSAULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uwZ8JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136830490012897938340177406 = makeAttributesOrNull(getFeedbackQuestionEntity(feedbackSessionName, courseId, questionNumber));
threadMonitoringController.exitInternalAction("_uwZ8JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uwbKRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368304900634235066899678 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136830490012897938340177406;
threadMonitoringController.exitInternalAction("_uwbKRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368304900634235066899678;
}
finally {
threadMonitoringController.exitService("_uwO9ALngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_uwk7QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uwnXgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_uwnXgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uwvTVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683054003681296051427335 = makeAttributes(getFeedbackQuestionEntitiesForSession(feedbackSessionName, courseId));
threadMonitoringController.exitInternalAction("_uwvTVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uwv6ZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683054006302205376863742 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683054003681296051427335;
threadMonitoringController.exitInternalAction("_uwv6ZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683054006302205376863742;
}
finally {
threadMonitoringController.exitService("_uwk7QLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForGiverType(String feedbackSessionName, String courseId, FeedbackParticipantType giverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("giverType", giverType);
threadMonitoringController.enterService("_uxaBsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uxcd8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert giverType != null;
threadMonitoringController.exitInternalAction("_uxcd8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uxjLpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683063005840051145119212 = makeAttributes(getFeedbackQuestionEntitiesForGiverType(feedbackSessionName, courseId, giverType));
threadMonitoringController.exitInternalAction("_uxjLpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uxkZxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683063008415541630018658 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683063005840051145119212;
threadMonitoringController.exitInternalAction("_uxkZxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683063008415541630018658;
}
finally {
threadMonitoringController.exitService("_uxaBsLngEeyIw-dB1KCaVA");
}
}

public  boolean hasFeedbackQuestionsForGiverType(String feedbackSessionName, String courseId, FeedbackParticipantType giverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("giverType", giverType);
threadMonitoringController.enterService("_uxAZELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uxC1ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert giverType != null;
threadMonitoringController.exitInternalAction("_uxC1ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uxKxJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683058007862977273169043 = hasFeedbackQuestionEntitiesForGiverType(feedbackSessionName, courseId, giverType);
threadMonitoringController.exitInternalAction("_uxKxJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683058007862977273169043;
}
finally {
threadMonitoringController.exitService("_uxAZELngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionAttributes updateFeedbackQuestion(FeedbackQuestionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_uz58ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uz8_YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_u0FiRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestion feedbackQuestion = getFeedbackQuestionEntity(updateOptions.getFeedbackQuestionId());
threadMonitoringController.exitInternalAction("_u0FiRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uz8_YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0FiRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (feedbackQuestion == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_u0FiRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0H-hbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes newAttributes = makeAttributes(feedbackQuestion);
threadMonitoringController.exitInternalAction("_u0H-hbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0IlkLngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_u0JMoLngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_u0JzsLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_u0KawLngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_u0dVsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0dVsbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0ej1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0ej1bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0ej1rngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0fK47ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0fK5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0fK5bngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0gZA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0gZBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0gZBbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0hAE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0hAFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0hAFbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0iOM7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0iONLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0iONbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0i1Q7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0i1RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0i1RbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0kDY7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0kqcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0kqcbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0l4k7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0l4lLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0l4lbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0mfo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<Integer>hasSameValue(feedbackQuestion.getQuestionNumber(), newAttributes.getQuestionNumber()) && this.<String>hasSameValue(feedbackQuestion.getQuestionText(), newAttributes.getSerializedQuestionDetails()) && this.<String>hasSameValue(feedbackQuestion.getQuestionDescription(), newAttributes.getQuestionDescription()) && this.<FeedbackParticipantType>hasSameValue(feedbackQuestion.getGiverType(), newAttributes.getGiverType()) && this.<FeedbackParticipantType>hasSameValue(feedbackQuestion.getRecipientType(), newAttributes.getRecipientType()) && this.<List<FeedbackParticipantType>>hasSameValue(feedbackQuestion.getShowResponsesTo(), newAttributes.getShowResponsesTo()) && this.<List<FeedbackParticipantType>>hasSameValue(feedbackQuestion.getShowGiverNameTo(), newAttributes.getShowGiverNameTo()) && this.<List<FeedbackParticipantType>>hasSameValue(feedbackQuestion.getShowRecipientNameTo(), newAttributes.getShowRecipientNameTo()) && this.<Integer>hasSameValue(feedbackQuestion.getNumberOfEntitiesToGiveFeedbackTo(), newAttributes.getNumberOfEntitiesToGiveFeedbackTo());
threadMonitoringController.exitInternalAction("_u0mfo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0l4lLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0l4k7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0kqcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0kDY7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0i1RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0i1Q7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0iONLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0iOM7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0hAFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0hAE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0gZBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0gZA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0fK5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0fK47ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0ej1bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0ej1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u0dVsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_u0oU0LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0oU1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0oU1bngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, FeedbackQuestion.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_u0oU1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0o74LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683141004553409078261522 = newAttributes;
threadMonitoringController.exitInternalAction("_u0o74LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683141004553409078261522;
}
threadMonitoringController.setExternalCallId("_u0pi8LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0qKALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setQuestionNumber(newAttributes.getQuestionNumber());
threadMonitoringController.exitInternalAction("_u0qKALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0qxELngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0rYILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setQuestionText(newAttributes.getSerializedQuestionDetails());
threadMonitoringController.exitInternalAction("_u0rYILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0smQLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0smQbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setQuestionDescription(newAttributes.getQuestionDescription());
threadMonitoringController.exitInternalAction("_u0smQbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0vCgLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0vpkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setGiverType(newAttributes.getGiverType());
threadMonitoringController.exitInternalAction("_u0vpkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0xewLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0xewbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setRecipientType(newAttributes.getRecipientType());
threadMonitoringController.exitInternalAction("_u0xewbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u0ys4LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u0zT8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setShowResponsesTo(newAttributes.getShowResponsesTo());
threadMonitoringController.exitInternalAction("_u0zT8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u00iELngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u00iEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setShowGiverNameTo(newAttributes.getShowGiverNameTo());
threadMonitoringController.exitInternalAction("_u00iEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u01wMLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u02XQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setShowRecipientNameTo(newAttributes.getShowRecipientNameTo());
threadMonitoringController.exitInternalAction("_u02XQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u03lYLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u04McLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setNumberOfEntitiesToGiveFeedbackTo(newAttributes.getNumberOfEntitiesToGiveFeedbackTo());
threadMonitoringController.exitInternalAction("_u04McLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u09sArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(feedbackQuestion);
threadMonitoringController.exitInternalAction("_u09sArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u0-6I7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368314100059862074985036706 = makeAttributes(feedbackQuestion);
threadMonitoringController.exitInternalAction("_u0-6I7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368314100059862074985036706;
}
finally {
threadMonitoringController.exitService("_uz58ELngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_u1YiwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u1bmELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
makeKeyFromWebSafeString(feedbackQuestionId).ifPresent(this::deleteEntity);
threadMonitoringController.exitInternalAction("_u1bmELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_u1YiwLngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackQuestions(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_uqkZ4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uqndMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
Query<FeedbackQuestion> entitiesToDelete = load().project();
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_uqpSYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqp5cLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uqp5cbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("courseId =", query.getCourseId());
threadMonitoringController.exitInternalAction("_uqp5cbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isFeedbackSessionNamePresent())
{
threadMonitoringController.enterBranch("_uqsVsLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqsVtLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uquK4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackSessionName =", query.getFeedbackSessionName());
threadMonitoringController.exitInternalAction("_uquK4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
deleteEntity(entitiesToDelete.keys().list());
threadMonitoringController.exitInternalAction("_uqndMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uqkZ4LngEeyIw-dB1KCaVA");
}
}

private  FeedbackQuestion getFeedbackQuestionEntity(String feedbackQuestionId) {
assert feedbackQuestionId != null;
return makeKeyFromWebSafeString(feedbackQuestionId).map(key -> ofy().load().key(key).now()).orElse(null);
}

private  FeedbackQuestion getFeedbackQuestionEntity(String feedbackSessionName, String courseId, int questionNumber) {
return load().filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).filter("questionNumber =", questionNumber).first().now();
}

private  List<FeedbackQuestion> getFeedbackQuestionEntitiesForSession(String feedbackSessionName, String courseId) {
return load().filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).list();
}

private  List<FeedbackQuestion> getFeedbackQuestionEntitiesForGiverType(String feedbackSessionName, String courseId, FeedbackParticipantType giverType) {
return load().filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).filter("giverType =", giverType).list();
}

private  boolean hasFeedbackQuestionEntitiesForGiverType(String feedbackSessionName, String courseId, FeedbackParticipantType giverType) {
return load().filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).filter("giverType =", giverType).keys().list().size() != 0;
}

@Override
 LoadType<FeedbackQuestion> load() {
return ofy().load().type(FeedbackQuestion.class);
}

@Override
 boolean hasExistingEntities(FeedbackQuestionAttributes entityToCreate) {
return !load().filter("feedbackSessionName =", entityToCreate.getFeedbackSessionName()).filter("courseId =", entityToCreate.getCourseId()).filter("questionNumber =", entityToCreate.getQuestionNumber()).keys().list().isEmpty();
}

@Override
 FeedbackQuestionAttributes makeAttributes(FeedbackQuestion entity) {
assert entity != null;
return FeedbackQuestionAttributes.valueOf(entity);
}

}
