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
threadMonitoringController.enterService("_dM8-0LvVEeyr6avTgCRLkQ", FeedbackQuestionsDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dM_bELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027811005478136792904602 = instance;
threadMonitoringController.exitInternalAction("_dM_bELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027811005478136792904602;
}
finally {
threadMonitoringController.exitService("_dM8-0LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionAttributes getFeedbackQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_dTiH8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dTkkMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
threadMonitoringController.exitInternalAction("_dTkkMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dTtHFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028356002979015118397068 = makeAttributesOrNull(getFeedbackQuestionEntity(feedbackQuestionId));
threadMonitoringController.exitInternalAction("_dTtHFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dTtuJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028356004611178094195908 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028356002979015118397068;
threadMonitoringController.exitInternalAction("_dTtuJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028356004611178094195908;
}
finally {
threadMonitoringController.exitService("_dTiH8LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionAttributes getFeedbackQuestion(String feedbackSessionName, String courseId, int questionNumber) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("questionNumber", questionNumber);
threadMonitoringController.enterService("_dT4tQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dT7JgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_dT7JgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dUCeRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130283850036686882500936613 = makeAttributesOrNull(getFeedbackQuestionEntity(feedbackSessionName, courseId, questionNumber));
threadMonitoringController.exitInternalAction("_dUCeRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dUDFVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028385002776538750402132 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130283850036686882500936613;
threadMonitoringController.exitInternalAction("_dUDFVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028385002776538750402132;
}
finally {
threadMonitoringController.exitService("_dT4tQLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dULBILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dUNdYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_dUNdYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dUWARLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302841400611670260606486 = makeAttributes(getFeedbackQuestionEntitiesForSession(feedbackSessionName, courseId));
threadMonitoringController.exitInternalAction("_dUWARLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dUWnVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028415002574882891532677 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302841400611670260606486;
threadMonitoringController.exitInternalAction("_dUWnVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028415002574882891532677;
}
finally {
threadMonitoringController.exitService("_dULBILvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForGiverType(String feedbackSessionName, String courseId, FeedbackParticipantType giverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("giverType", giverType);
threadMonitoringController.enterService("_dU72ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dU-SYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert giverType != null;
threadMonitoringController.exitInternalAction("_dU-SYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dVGONLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130284640044407332514401165 = makeAttributes(getFeedbackQuestionEntitiesForGiverType(feedbackSessionName, courseId, giverType));
threadMonitoringController.exitInternalAction("_dVGONLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dVG1RLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130284640029824270988805235 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130284640044407332514401165;
threadMonitoringController.exitInternalAction("_dVG1RLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130284640029824270988805235;
}
finally {
threadMonitoringController.exitService("_dU72ILvVEeyr6avTgCRLkQ");
}
}

public  boolean hasFeedbackQuestionsForGiverType(String feedbackSessionName, String courseId, FeedbackParticipantType giverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("giverType", giverType);
threadMonitoringController.enterService("_dUl34LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dUoUILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert giverType != null;
threadMonitoringController.exitInternalAction("_dUoUILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dUvB1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028437009001378345950269 = hasFeedbackQuestionEntitiesForGiverType(feedbackSessionName, courseId, giverType);
threadMonitoringController.exitInternalAction("_dUvB1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028437009001378345950269;
}
finally {
threadMonitoringController.exitService("_dUl34LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionAttributes updateFeedbackQuestion(FeedbackQuestionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_dXsPMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dXurcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_dX2nRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestion feedbackQuestion = getFeedbackQuestionEntity(updateOptions.getFeedbackQuestionId());
threadMonitoringController.exitInternalAction("_dX2nRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dXurcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dX2nRbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (feedbackQuestion == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_dX2nRbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dX4cdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes newAttributes = makeAttributes(feedbackQuestion);
threadMonitoringController.exitInternalAction("_dX4cdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dX5DgLvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_dX5qkLvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_dX64sLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dX64tLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_dYOasLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYPBwLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYQP5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYQP5bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYQP5rvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYReA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYReBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYReBbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYSsI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYSsJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYSsJbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYT6Q7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYT6RLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYT6RbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYVIY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYVIZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYVIZbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYWWg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYWWhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYWWhbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYW9k7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYW9lLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYW9lbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYYLs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYYLtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYYywLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYaA47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<Integer>hasSameValue(feedbackQuestion.getQuestionNumber(), newAttributes.getQuestionNumber()) && this.<String>hasSameValue(feedbackQuestion.getQuestionText(), newAttributes.getSerializedQuestionDetails()) && this.<String>hasSameValue(feedbackQuestion.getQuestionDescription(), newAttributes.getQuestionDescription()) && this.<FeedbackParticipantType>hasSameValue(feedbackQuestion.getGiverType(), newAttributes.getGiverType()) && this.<FeedbackParticipantType>hasSameValue(feedbackQuestion.getRecipientType(), newAttributes.getRecipientType()) && this.<List<FeedbackParticipantType>>hasSameValue(feedbackQuestion.getShowResponsesTo(), newAttributes.getShowResponsesTo()) && this.<List<FeedbackParticipantType>>hasSameValue(feedbackQuestion.getShowGiverNameTo(), newAttributes.getShowGiverNameTo()) && this.<List<FeedbackParticipantType>>hasSameValue(feedbackQuestion.getShowRecipientNameTo(), newAttributes.getShowRecipientNameTo()) && this.<Integer>hasSameValue(feedbackQuestion.getNumberOfEntitiesToGiveFeedbackTo(), newAttributes.getNumberOfEntitiesToGiveFeedbackTo());
threadMonitoringController.exitInternalAction("_dYaA47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYYLtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYYLs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYW9lLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYW9k7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYWWhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYWWg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYVIZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYVIY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYT6RLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYT6Q7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYSsJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYSsI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYReBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYReA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYQP5bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYQP5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dYOasLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_dYcdILvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYcdJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYcdJbvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, FeedbackQuestion.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_dYcdJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYcdJrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130288920043944366757693765 = newAttributes;
threadMonitoringController.exitInternalAction("_dYcdJrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130288920043944366757693765;
}
threadMonitoringController.setExternalCallId("_dYdrQLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYeSULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setQuestionNumber(newAttributes.getQuestionNumber());
threadMonitoringController.exitInternalAction("_dYeSULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYe5YLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYfgcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setQuestionText(newAttributes.getSerializedQuestionDetails());
threadMonitoringController.exitInternalAction("_dYfgcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYgukLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYgukbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setQuestionDescription(newAttributes.getQuestionDescription());
threadMonitoringController.exitInternalAction("_dYgukbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYh8sLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYijwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setGiverType(newAttributes.getGiverType());
threadMonitoringController.exitInternalAction("_dYijwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYjx4LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYkY8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setRecipientType(newAttributes.getRecipientType());
threadMonitoringController.exitInternalAction("_dYkY8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYlnELvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYmOILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setShowResponsesTo(newAttributes.getShowResponsesTo());
threadMonitoringController.exitInternalAction("_dYmOILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYncQLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYncQbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setShowGiverNameTo(newAttributes.getShowGiverNameTo());
threadMonitoringController.exitInternalAction("_dYncQbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYoqYLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYpRcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setShowRecipientNameTo(newAttributes.getShowRecipientNameTo());
threadMonitoringController.exitInternalAction("_dYpRcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dYp4gLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dYqfkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackQuestion.setNumberOfEntitiesToGiveFeedbackTo(newAttributes.getNumberOfEntitiesToGiveFeedbackTo());
threadMonitoringController.exitInternalAction("_dYqfkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYwmM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(feedbackQuestion);
threadMonitoringController.exitInternalAction("_dYwmM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dYybY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028892008155844996369711 = makeAttributes(feedbackQuestion);
threadMonitoringController.exitInternalAction("_dYybY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028892008155844996369711;
}
finally {
threadMonitoringController.exitService("_dXsPMLvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_dZNSILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dZRjkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
makeKeyFromWebSafeString(feedbackQuestionId).ifPresent(this::deleteEntity);
threadMonitoringController.exitInternalAction("_dZRjkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dZNSILvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackQuestions(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_dQzkELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dQ2AULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
Query<FeedbackQuestion> entitiesToDelete = load().project();
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_dQ4ckLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQ5DoLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQ5DobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("courseId =", query.getCourseId());
threadMonitoringController.exitInternalAction("_dQ5DobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isFeedbackSessionNamePresent())
{
threadMonitoringController.enterBranch("_dQ6RwLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQ6407vVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQ7f4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackSessionName =", query.getFeedbackSessionName());
threadMonitoringController.exitInternalAction("_dQ7f4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
deleteEntity(entitiesToDelete.keys().list());
threadMonitoringController.exitInternalAction("_dQ2AULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dQzkELvVEeyr6avTgCRLkQ");
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
