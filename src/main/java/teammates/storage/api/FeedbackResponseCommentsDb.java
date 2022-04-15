package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.time.Instant;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import com.googlecode.objectify.cmd.Query;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Logger;
import teammates.storage.entity.FeedbackResponseComment;
public final class FeedbackResponseCommentsDb extends EntitiesDb<FeedbackResponseComment, FeedbackResponseCommentAttributes> {
private static final Logger log = Logger.getLogger();

private static final FeedbackResponseCommentsDb instance = new  FeedbackResponseCommentsDb();

private  FeedbackResponseCommentsDb(){
}
public static  FeedbackResponseCommentsDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_dNMPYLvVEeyr6avTgCRLkQ", FeedbackResponseCommentsDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dNOroLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302784100893100332663906 = instance;
threadMonitoringController.exitInternalAction("_dNOroLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302784100893100332663906;
}
finally {
threadMonitoringController.exitService("_dNMPYLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseComment(long feedbackResponseCommentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseCommentId", feedbackResponseCommentId);
threadMonitoringController.enterService("_dar40LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_da1CxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028927008268784991257877 = makeAttributesOrNull(getFeedbackResponseCommentEntity(feedbackResponseCommentId));
threadMonitoringController.exitInternalAction("_da1CxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_da1p1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028927006028277483762313 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028927008268784991257877;
threadMonitoringController.exitInternalAction("_da1p1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028927006028277483762313;
}
finally {
threadMonitoringController.exitService("_dar40LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseComment(String feedbackResponseId, String commentGiver, Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
monitoringServiceParameters.addValue("commentGiver", commentGiver);
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_da9loLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dbAB4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
assert commentGiver != null;
assert createdAt != null;
threadMonitoringController.exitInternalAction("_dbAB4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dbHWpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028960006260385810159842 = makeAttributesOrNull(getFeedbackResponseCommentEntity(feedbackResponseId, commentGiver, createdAt));
threadMonitoringController.exitInternalAction("_dbHWpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dbIkxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130289600003847108511123154 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028960006260385810159842;
threadMonitoringController.exitInternalAction("_dbIkxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130289600003847108511123154;
}
finally {
threadMonitoringController.exitService("_da9loLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentForGiver(String courseId, String commentGiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("commentGiver", commentGiver);
threadMonitoringController.enterService("_dfI7ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dfLXQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert commentGiver != null;
threadMonitoringController.exitInternalAction("_dfLXQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dfSsBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029756008604233773747234 = makeAttributes(getFeedbackResponseCommentEntitiesForGiverInCourse(courseId, commentGiver));
threadMonitoringController.exitInternalAction("_dfSsBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dfTTFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029756006660702377660621 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029756008604233773747234;
threadMonitoringController.exitInternalAction("_dfTTFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029756006660702377660621;
}
finally {
threadMonitoringController.exitService("_dfI7ALvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForResponse(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_dbOrYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dbSVwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
threadMonitoringController.exitInternalAction("_dbSVwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dbX1VLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028990009137286153356446 = makeAttributes(getFeedbackResponseCommentEntitiesForResponse(feedbackResponseId));
threadMonitoringController.exitInternalAction("_dbX1VLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dbZDdLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130289900005060296163693301 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013028990009137286153356446;
threadMonitoringController.exitInternalAction("_dbZDdLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130289900005060296163693301;
}
finally {
threadMonitoringController.exitService("_dbOrYLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseCommentForResponseFromParticipant(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_dbfxILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dbiNYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
threadMonitoringController.exitInternalAction("_dbiNYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dbr-ZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130290180027758801542015266 = makeAttributesOrNull(getFeedbackResponseCommentEntitiesForResponseFromParticipant(feedbackResponseId));
threadMonitoringController.exitInternalAction("_dbr-ZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dbsldLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029018005370018523242627 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130290180027758801542015266;
threadMonitoringController.exitInternalAction("_dbsldLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029018005370018523242627;
}
finally {
threadMonitoringController.exitService("_dbfxILvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_db29gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_db7O8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
threadMonitoringController.exitInternalAction("_db7O8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dcCjtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130290460045120038603997414 = makeAttributes(getFeedbackResponseCommentEntitiesForSession(courseId, feedbackSessionName));
threadMonitoringController.exitInternalAction("_dcCjtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dcDx1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130290460010942993760136543 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130290460045120038603997414;
threadMonitoringController.exitInternalAction("_dcDx1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130290460010942993760136543;
}
finally {
threadMonitoringController.exitService("_db29gLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForQuestion(String questionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionId", questionId);
threadMonitoringController.enterService("_dci6ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dclWQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionId != null;
threadMonitoringController.exitInternalAction("_dclWQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dcsD9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302911000832941973220233 = makeAttributes(getFeedbackResponseCommentEntitiesForQuestion(questionId));
threadMonitoringController.exitInternalAction("_dcsD9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dcsrBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029111008079231168823352 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302911000832941973220233;
threadMonitoringController.exitInternalAction("_dcsrBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029111008079231168823352;
}
finally {
threadMonitoringController.exitService("_dci6ALvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForSessionInSection(String courseId, String feedbackSessionName, String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_dcIqULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dcLGkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
assert section != null;
threadMonitoringController.exitInternalAction("_dcLGkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dcaXJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029073005192457967018398 = makeAttributes(getFeedbackResponseCommentEntitiesForSessionInSection(courseId, feedbackSessionName, section));
threadMonitoringController.exitInternalAction("_dcaXJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dca-NLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029073003462258740297407 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029073005192457967018398;
threadMonitoringController.exitInternalAction("_dca-NLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029073003462258740297407;
}
finally {
threadMonitoringController.exitService("_dcIqULvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForQuestionInSection(String questionId, String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionId", questionId);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_dcxjgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dczYsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionId != null;
assert section != null;
threadMonitoringController.exitInternalAction("_dczYsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ddEedLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029147009822916563995159 = makeAttributes(getFeedbackResponseCommentEntitiesForQuestionInSection(questionId, section));
threadMonitoringController.exitInternalAction("_ddEedLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ddFslLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302914700785833988268276 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029147009822916563995159;
threadMonitoringController.exitInternalAction("_ddFslLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302914700785833988268276;
}
finally {
threadMonitoringController.exitService("_dcxjgLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseCommentAttributes updateFeedbackResponseComment(FeedbackResponseCommentAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_dd_rgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_deCHwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_deGZNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseComment frc = getFeedbackResponseCommentEntity(updateOptions.getFeedbackResponseCommentId());
threadMonitoringController.exitInternalAction("_deGZNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_deCHwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_deGZNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (frc == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_deGZNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_deJcgbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes newAttributes = makeAttributes(frc);
threadMonitoringController.exitInternalAction("_deJcgbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_deJcgrvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_deKqoLvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_deLRsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_deLRtLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_debwYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_debwYbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dec-hLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dec-hbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dec-hrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_deeMo7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_deeMpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_deeMpbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_degB07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_degB1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_degB1bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dehP87vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_deh3ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_deh3AbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dejFI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dejFJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dejFJbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dejsM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dekTQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dekTQbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_delhY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_delhZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_delhZbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_demvg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(frc.getFeedbackResponseId(), newAttributes.getFeedbackResponseId()) && this.<String>hasSameValue(frc.getCommentText(), newAttributes.getCommentText()) && this.<List<FeedbackParticipantType>>hasSameValue(frc.getShowCommentTo(), newAttributes.getShowCommentTo()) && this.<List<FeedbackParticipantType>>hasSameValue(frc.getShowGiverNameTo(), newAttributes.getShowGiverNameTo()) && this.<String>hasSameValue(frc.getLastEditorEmail(), newAttributes.getLastEditorEmail()) && this.<Instant>hasSameValue(frc.getLastEditedAt(), newAttributes.getLastEditedAt()) && this.<String>hasSameValue(frc.getGiverSection(), newAttributes.getGiverSection()) && this.<String>hasSameValue(frc.getReceiverSection(), newAttributes.getReceiverSection());
threadMonitoringController.exitInternalAction("_demvg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_delhZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_delhY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dekTQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dejsM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dejFJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dejFI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_deh3ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dehP87vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_degB1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_degB07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_deeMpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_deeMo7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dec-hbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dec-hLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_debwYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_depLwLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_depLxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_depLxbvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, FeedbackResponseComment.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_depLxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_depy0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130297250021636655375343194 = newAttributes;
threadMonitoringController.exitInternalAction("_depy0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130297250021636655375343194;
}
threadMonitoringController.setExternalCallId("_deqZ4LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_derA8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setFeedbackResponseId(newAttributes.getFeedbackResponseId());
threadMonitoringController.exitInternalAction("_derA8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_desPELvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_desPEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setCommentText(newAttributes.getCommentText());
threadMonitoringController.exitInternalAction("_desPEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_detdMLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_deuEQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setShowCommentTo(newAttributes.getShowCommentTo());
threadMonitoringController.exitInternalAction("_deuEQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dev5cLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dev5cbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setShowGiverNameTo(newAttributes.getShowGiverNameTo());
threadMonitoringController.exitInternalAction("_dev5cbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dexHkLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dexuoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setLastEditorEmail(newAttributes.getLastEditorEmail());
threadMonitoringController.exitInternalAction("_dexuoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dey8wLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dezj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setLastEditedAt(newAttributes.getLastEditedAt());
threadMonitoringController.exitInternalAction("_dezj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_de0K4LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_de0x8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setGiverSection(newAttributes.getGiverSection());
threadMonitoringController.exitInternalAction("_de0x8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_de2AELvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_de2AEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setReceiverSection(newAttributes.getReceiverSection());
threadMonitoringController.exitInternalAction("_de2AEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_de8Gs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(frc);
threadMonitoringController.exitInternalAction("_de8Gs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_de9747vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029725009111980233723028 = makeAttributes(frc);
threadMonitoringController.exitInternalAction("_de9747vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029725009111980233723028;
}
finally {
threadMonitoringController.exitService("_dd_rgLvVEeyr6avTgCRLkQ");
}
}

public  void updateGiverEmailOfFeedbackResponseComments(String courseId, String oldEmail, String updatedEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("oldEmail", oldEmail);
monitoringServiceParameters.addValue("updatedEmail", updatedEmail);
threadMonitoringController.enterService("_ddO2gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ddRSwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert oldEmail != null;
assert updatedEmail != null;
if (oldEmail.equals(updatedEmail))
{
threadMonitoringController.exitInternalAction("_ddRSwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return;
}
threadMonitoringController.enterInternalAction("_ddWyVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseComment> responseComments = getFeedbackResponseCommentEntitiesForGiverInCourse(courseId, oldEmail);
threadMonitoringController.exitInternalAction("_ddWyVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ddYngLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
for (FeedbackResponseComment responseComment : responseComments)
{
responseComment.setGiverEmail(updatedEmail);
}
threadMonitoringController.exitInternalAction("_ddYngLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ddfVM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntities(responseComments);
threadMonitoringController.exitInternalAction("_ddfVM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ddO2gLvVEeyr6avTgCRLkQ");
}
}

public  void updateLastEditorEmailOfFeedbackResponseComments(String courseId, String oldEmail, String updatedEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("oldEmail", oldEmail);
monitoringServiceParameters.addValue("updatedEmail", updatedEmail);
threadMonitoringController.enterService("_ddk0wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ddn4ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert oldEmail != null;
assert updatedEmail != null;
if (oldEmail.equals(updatedEmail))
{
threadMonitoringController.exitInternalAction("_ddn4ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return;
}
threadMonitoringController.enterInternalAction("_ddulxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseComment> responseComments = getFeedbackResponseCommentEntitiesForLastEditorInCourse(courseId, oldEmail);
threadMonitoringController.exitInternalAction("_ddulxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ddvM0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
for (FeedbackResponseComment responseComment : responseComments)
{
responseComment.setLastEditorEmail(updatedEmail);
}
threadMonitoringController.exitInternalAction("_ddvM0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dd2hk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntities(responseComments);
threadMonitoringController.exitInternalAction("_dd2hk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dd3IoLvVEeyr6avTgCRLkQ");
log.info("updating last editor email from: " + oldEmail + " to: " + updatedEmail + " for feedback response comments in the course: " + courseId);
}
finally {
threadMonitoringController.exitService("_ddk0wLvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackResponseComment(long commentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentId", commentId);
threadMonitoringController.enterService("_dfb18LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dfhVgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteEntity(Key.create(FeedbackResponseComment.class, commentId));
threadMonitoringController.exitInternalAction("_dfhVgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dfb18LvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackResponseComments(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_dQQxgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dQT00LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
Query<FeedbackResponseComment> entitiesToDelete = load().project();
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_dQW4ILvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQW4JLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQW4JbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("courseId =", query.getCourseId());
threadMonitoringController.exitInternalAction("_dQW4JbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isFeedbackSessionNamePresent())
{
threadMonitoringController.enterBranch("_dQYGQLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQYGRLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQYtULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackSessionName =", query.getFeedbackSessionName());
threadMonitoringController.exitInternalAction("_dQYtULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isQuestionIdPresent())
{
threadMonitoringController.enterBranch("_dQZ7cLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQZ7dLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQaigLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackQuestionId =", query.getQuestionId());
threadMonitoringController.exitInternalAction("_dQaigLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isResponseIdPresent())
{
threadMonitoringController.enterBranch("_dQbJkLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQbwo7vVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQcXsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackResponseId =", query.getResponseId());
threadMonitoringController.exitInternalAction("_dQcXsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
deleteEntity(entitiesToDelete.keys().list());
threadMonitoringController.exitInternalAction("_dQT00LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dQQxgLvVEeyr6avTgCRLkQ");
}
}

private  FeedbackResponseComment getFeedbackResponseCommentEntity(long feedbackResponseCommentId) {
return load().id(feedbackResponseCommentId).now();
}

private  FeedbackResponseComment getFeedbackResponseCommentEntity(String feedbackResponseId, String giverEmail, Instant createdAt) {
return load().filter("feedbackResponseId =", feedbackResponseId).filter("giverEmail =", giverEmail).filter("createdAt =", createdAt).first().now();
}

private  List<FeedbackResponseComment> getFeedbackResponseCommentEntitiesForGiverInCourse(String courseId, String giverEmail) {
return load().filter("courseId =", courseId).filter("giverEmail =", giverEmail).list();
}

private  List<FeedbackResponseComment> getFeedbackResponseCommentEntitiesForLastEditorInCourse(String courseId, String lastEditorEmail) {
return load().filter("courseId =", courseId).filter("lastEditorEmail =", lastEditorEmail).list();
}

private  Query<FeedbackResponseComment> getFeedbackResponseCommentsForResponseQuery(String feedbackResponseId) {
return load().filter("feedbackResponseId =", feedbackResponseId);
}

private  FeedbackResponseComment getFeedbackResponseCommentEntitiesForResponseFromParticipant(String feedbackResponseId) {
return load().filter("feedbackResponseId =", feedbackResponseId).filter("isCommentFromFeedbackParticipant =", true).first().now();
}

private  List<FeedbackResponseComment> getFeedbackResponseCommentEntitiesForResponse(String feedbackResponseId) {
return getFeedbackResponseCommentsForResponseQuery(feedbackResponseId).list();
}

private  List<FeedbackResponseComment> getFeedbackResponseCommentEntitiesForSession(String courseId, String feedbackSessionName) {
return load().filter("courseId =", courseId).filter("feedbackSessionName =", feedbackSessionName).list();
}

private  Collection<FeedbackResponseComment> getFeedbackResponseCommentEntitiesForQuestion(String questionId) {
return load().filter("feedbackQuestionId =", questionId).list();
}

private  Collection<FeedbackResponseComment> getFeedbackResponseCommentEntitiesForQuestionInSection(String questionId, String section) {
Map<Long, FeedbackResponseComment> comments = new  HashMap<>();
List<FeedbackResponseComment> responseCommentsFromSection = load().filter("feedbackQuestionId =", questionId).filter("giverSection =", section).list();
for (FeedbackResponseComment comment : responseCommentsFromSection)
{
comments.put(comment.getFeedbackResponseCommentId(), comment);
}
List<FeedbackResponseComment> responseCommentsToSection = load().filter("feedbackQuestionId =", questionId).filter("receiverSection =", section).list();
for (FeedbackResponseComment comment : responseCommentsToSection)
{
comments.put(comment.getFeedbackResponseCommentId(), comment);
}
return comments.values();
}

private  Collection<FeedbackResponseComment> getFeedbackResponseCommentEntitiesForSessionInSection(String courseId, String feedbackSessionName, String section) {
Map<Long, FeedbackResponseComment> comments = new  HashMap<>();
List<FeedbackResponseComment> firstQueryResponseComments = load().filter("courseId =", courseId).filter("feedbackSessionName =", feedbackSessionName).filter("giverSection =", section).list();
for (FeedbackResponseComment comment : firstQueryResponseComments)
{
comments.put(comment.getFeedbackResponseCommentId(), comment);
}
List<FeedbackResponseComment> secondQueryResponseComments = load().filter("courseId =", courseId).filter("feedbackSessionName =", feedbackSessionName).filter("receiverSection =", section).list();
for (FeedbackResponseComment comment : secondQueryResponseComments)
{
comments.put(comment.getFeedbackResponseCommentId(), comment);
}
return comments.values();
}

@Override
 LoadType<FeedbackResponseComment> load() {
return ofy().load().type(FeedbackResponseComment.class);
}

@Override
 boolean hasExistingEntities(FeedbackResponseCommentAttributes entityToCreate) {
return false;
}

@Override
 FeedbackResponseCommentAttributes makeAttributes(FeedbackResponseComment entity) {
assert entity != null;
return FeedbackResponseCommentAttributes.valueOf(entity);
}

}
