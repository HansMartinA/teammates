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
threadMonitoringController.enterService("_unIrYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_unLHoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682944007201352677142874 = instance;
threadMonitoringController.exitInternalAction("_unLHoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682944007201352677142874;
}
finally {
threadMonitoringController.exitService("_unIrYLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseComment(long feedbackResponseCommentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseCommentId", feedbackResponseCommentId);
threadMonitoringController.enterService("_u2vNoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u217VLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831500017966931801561647 = makeAttributesOrNull(getFeedbackResponseCommentEntity(feedbackResponseCommentId));
threadMonitoringController.exitInternalAction("_u217VLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u22iZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831500046164009882834345 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831500017966931801561647;
threadMonitoringController.exitInternalAction("_u22iZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831500046164009882834345;
}
finally {
threadMonitoringController.exitService("_u2vNoLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseComment(String feedbackResponseId, String commentGiver, Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
monitoringServiceParameters.addValue("commentGiver", commentGiver);
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_u293ILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u3ATYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
assert commentGiver != null;
assert createdAt != null;
threadMonitoringController.exitInternalAction("_u3ATYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u3HoJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683157005259900268884298 = makeAttributesOrNull(getFeedbackResponseCommentEntity(feedbackResponseId, commentGiver, createdAt));
threadMonitoringController.exitInternalAction("_u3HoJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u3I2RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368315700960719757863458 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683157005259900268884298;
threadMonitoringController.exitInternalAction("_u3I2RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368315700960719757863458;
}
finally {
threadMonitoringController.exitService("_u293ILngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentForGiver(String courseId, String commentGiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("commentGiver", commentGiver);
threadMonitoringController.enterService("_u6oPILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u6qEULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert commentGiver != null;
threadMonitoringController.exitInternalAction("_u6qEULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6vj5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683292008007333224202131 = makeAttributes(getFeedbackResponseCommentEntitiesForGiverInCourse(courseId, commentGiver));
threadMonitoringController.exitInternalAction("_u6vj5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6wyBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136832920034386216895432653 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683292008007333224202131;
threadMonitoringController.exitInternalAction("_u6wyBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136832920034386216895432653;
}
finally {
threadMonitoringController.exitService("_u6oPILngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForResponse(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_u3NuwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u3QLALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
threadMonitoringController.exitInternalAction("_u3QLALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u3VDhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683163009804083963277597 = makeAttributes(getFeedbackResponseCommentEntitiesForResponse(feedbackResponseId));
threadMonitoringController.exitInternalAction("_u3VDhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u3VqlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683163005390653719297474 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683163009804083963277597;
threadMonitoringController.exitInternalAction("_u3VqlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683163005390653719297474;
}
finally {
threadMonitoringController.exitService("_u3NuwLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseCommentForResponseFromParticipant(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_u3ajELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u3c_ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
threadMonitoringController.exitInternalAction("_u3c_ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u3jF9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683167001306892032416369 = makeAttributesOrNull(getFeedbackResponseCommentEntitiesForResponseFromParticipant(feedbackResponseId));
threadMonitoringController.exitInternalAction("_u3jF9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u3jtBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683167004481990556464991 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683167001306892032416369;
threadMonitoringController.exitInternalAction("_u3jtBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683167004481990556464991;
}
finally {
threadMonitoringController.exitService("_u3ajELngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_u3sP4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u3uFELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
threadMonitoringController.exitInternalAction("_u3uFELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u30LtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683173008134962911122758 = makeAttributes(getFeedbackResponseCommentEntitiesForSession(courseId, feedbackSessionName));
threadMonitoringController.exitInternalAction("_u30LtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u30yxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683173003116902093577937 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683173008134962911122758;
threadMonitoringController.exitInternalAction("_u30yxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683173003116902093577937;
}
finally {
threadMonitoringController.exitService("_u3sP4LngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForQuestion(String questionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionId", questionId);
threadMonitoringController.enterService("_u4PpgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u4ResLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionId != null;
threadMonitoringController.exitInternalAction("_u4ResLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u4W-RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683184007319745449213663 = makeAttributes(getFeedbackResponseCommentEntitiesForQuestion(questionId));
threadMonitoringController.exitInternalAction("_u4W-RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u4XlVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683184003346878895034192 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683184007319745449213663;
threadMonitoringController.exitInternalAction("_u4XlVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683184003346878895034192;
}
finally {
threadMonitoringController.exitService("_u4PpgLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForSessionInSection(String courseId, String feedbackSessionName, String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_u34dILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u365YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
assert section != null;
threadMonitoringController.exitInternalAction("_u365YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u4IUxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683180006920369848088673 = makeAttributes(getFeedbackResponseCommentEntitiesForSessionInSection(courseId, feedbackSessionName, section));
threadMonitoringController.exitInternalAction("_u4IUxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u4I71LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831800010017933329678286 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683180006920369848088673;
threadMonitoringController.exitInternalAction("_u4I71LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831800010017933329678286;
}
finally {
threadMonitoringController.exitService("_u34dILngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseCommentAttributes> getFeedbackResponseCommentsForQuestionInSection(String questionId, String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionId", questionId);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_u4cd0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u4e6ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionId != null;
assert section != null;
threadMonitoringController.exitInternalAction("_u4e6ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u4tjkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831900015275941957261563 = makeAttributes(getFeedbackResponseCommentEntitiesForQuestionInSection(questionId, section));
threadMonitoringController.exitInternalAction("_u4tjkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u4uxtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseCommentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831900012451820105760814 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831900015275941957261563;
threadMonitoringController.exitInternalAction("_u4uxtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136831900012451820105760814;
}
finally {
threadMonitoringController.exitService("_u4cd0LngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseCommentAttributes updateFeedbackResponseComment(FeedbackResponseCommentAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_u5jRELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u5lGQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_u5pXtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseComment frc = getFeedbackResponseCommentEntity(updateOptions.getFeedbackResponseCommentId());
threadMonitoringController.exitInternalAction("_u5pXtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u5lGQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u5pXtbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (frc == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_u5pXtbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u5sbBbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes newAttributes = makeAttributes(frc);
threadMonitoringController.exitInternalAction("_u5sbBbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u5tCELngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_u5tpILngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_u5uQMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_u5u3Q7ngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_u5_9ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6AkELngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6BLJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6BLJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6BLJrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6CZQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6CZRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6CZRbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6DAU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6DAVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6DAVbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6EOc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6EOdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6EOdbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6E1g7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6E1hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6E1hbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6GDo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6GDpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6GDpbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6HRw7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6HRxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6HRxbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6JG87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(frc.getFeedbackResponseId(), newAttributes.getFeedbackResponseId()) && this.<String>hasSameValue(frc.getCommentText(), newAttributes.getCommentText()) && this.<List<FeedbackParticipantType>>hasSameValue(frc.getShowCommentTo(), newAttributes.getShowCommentTo()) && this.<List<FeedbackParticipantType>>hasSameValue(frc.getShowGiverNameTo(), newAttributes.getShowGiverNameTo()) && this.<String>hasSameValue(frc.getLastEditorEmail(), newAttributes.getLastEditorEmail()) && this.<Instant>hasSameValue(frc.getLastEditedAt(), newAttributes.getLastEditedAt()) && this.<String>hasSameValue(frc.getGiverSection(), newAttributes.getGiverSection()) && this.<String>hasSameValue(frc.getReceiverSection(), newAttributes.getReceiverSection());
threadMonitoringController.exitInternalAction("_u6JG87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6HRxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6HRw7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6GDpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6GDo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6E1hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6E1g7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6EOdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6EOc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6DAVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6DAU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6CZRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6CZQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6BLJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u6BLJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u5_9ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_u6KVELngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6KVFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6KVFbngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, FeedbackResponseComment.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_u6KVFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6K8ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368328300014677204458098614 = newAttributes;
threadMonitoringController.exitInternalAction("_u6K8ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368328300014677204458098614;
}
threadMonitoringController.setExternalCallId("_u6MKQLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6MKQbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setFeedbackResponseId(newAttributes.getFeedbackResponseId());
threadMonitoringController.exitInternalAction("_u6MKQbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6NYYLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6NYYbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setCommentText(newAttributes.getCommentText());
threadMonitoringController.exitInternalAction("_u6NYYbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6OmgLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6OmgbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setShowCommentTo(newAttributes.getShowCommentTo());
threadMonitoringController.exitInternalAction("_u6OmgbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6P0oLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6P0obngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setShowGiverNameTo(newAttributes.getShowGiverNameTo());
threadMonitoringController.exitInternalAction("_u6P0obngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6RCwLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6Rp0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setLastEditorEmail(newAttributes.getLastEditorEmail());
threadMonitoringController.exitInternalAction("_u6Rp0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6S38LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6TfALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setLastEditedAt(newAttributes.getLastEditedAt());
threadMonitoringController.exitInternalAction("_u6TfALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6UtILngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6UtIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setGiverSection(newAttributes.getGiverSection());
threadMonitoringController.exitInternalAction("_u6UtIbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u6V7QLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_u6V7QbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
frc.setReceiverSection(newAttributes.getReceiverSection());
threadMonitoringController.exitInternalAction("_u6V7QbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6ba0rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(frc);
threadMonitoringController.exitInternalAction("_u6ba0rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u6dQA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136832830039403931113099666 = makeAttributes(frc);
threadMonitoringController.exitInternalAction("_u6dQA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136832830039403931113099666;
}
finally {
threadMonitoringController.exitService("_u5jRELngEeyIw-dB1KCaVA");
}
}

public  void updateGiverEmailOfFeedbackResponseComments(String courseId, String oldEmail, String updatedEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("oldEmail", oldEmail);
monitoringServiceParameters.addValue("updatedEmail", updatedEmail);
threadMonitoringController.enterService("_u45JwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u480ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert oldEmail != null;
assert updatedEmail != null;
if (oldEmail.equals(updatedEmail))
{
void longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683197001556240939080702;
threadMonitoringController.exitInternalAction("_u480ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683197001556240939080702;
}
threadMonitoringController.enterInternalAction("_u5BspLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseComment> responseComments = getFeedbackResponseCommentEntitiesForGiverInCourse(courseId, oldEmail);
threadMonitoringController.exitInternalAction("_u5BspLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u5CTsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
for (FeedbackResponseComment responseComment : responseComments)
{
responseComment.setGiverEmail(updatedEmail);
}
threadMonitoringController.exitInternalAction("_u5CTsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u5IaU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntities(responseComments);
threadMonitoringController.exitInternalAction("_u5IaU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_u45JwLngEeyIw-dB1KCaVA");
}
}

public  void updateLastEditorEmailOfFeedbackResponseComments(String courseId, String oldEmail, String updatedEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("oldEmail", oldEmail);
monitoringServiceParameters.addValue("updatedEmail", updatedEmail);
threadMonitoringController.enterService("_u5NS0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u5PvELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert oldEmail != null;
assert updatedEmail != null;
if (oldEmail.equals(updatedEmail))
{
void longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136832040035759971084793674;
threadMonitoringController.exitInternalAction("_u5PvELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136832040035759971084793674;
}
threadMonitoringController.enterInternalAction("_u5TZdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseComment> responseComments = getFeedbackResponseCommentEntitiesForLastEditorInCourse(courseId, oldEmail);
threadMonitoringController.exitInternalAction("_u5TZdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u5UAgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
for (FeedbackResponseComment responseComment : responseComments)
{
responseComment.setLastEditorEmail(updatedEmail);
}
threadMonitoringController.exitInternalAction("_u5UAgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u5auM7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntities(responseComments);
threadMonitoringController.exitInternalAction("_u5auM7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_u5auNLngEeyIw-dB1KCaVA");
log.info("updating last editor email from: " + oldEmail + " to: " + updatedEmail + " for feedback response comments in the course: " + courseId);
}
finally {
threadMonitoringController.exitService("_u5NS0LngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackResponseComment(long commentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentId", commentId);
threadMonitoringController.enterService("_u624oLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u6578LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteEntity(Key.create(FeedbackResponseComment.class, commentId));
threadMonitoringController.exitInternalAction("_u6578LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_u624oLngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackResponseComments(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_uqGf0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uqI8ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
Query<FeedbackResponseComment> entitiesToDelete = load().project();
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_uqKxQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqLYU7ngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uqLYVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("courseId =", query.getCourseId());
threadMonitoringController.exitInternalAction("_uqLYVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isFeedbackSessionNamePresent())
{
threadMonitoringController.enterBranch("_uqMmcLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqMmdLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uqMmdbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackSessionName =", query.getFeedbackSessionName());
threadMonitoringController.exitInternalAction("_uqMmdbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isQuestionIdPresent())
{
threadMonitoringController.enterBranch("_uqN0kLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqN0lLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uqN0lbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackQuestionId =", query.getQuestionId());
threadMonitoringController.exitInternalAction("_uqN0lbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isResponseIdPresent())
{
threadMonitoringController.enterBranch("_uqPCsLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqPpw7ngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uqPpxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackResponseId =", query.getResponseId());
threadMonitoringController.exitInternalAction("_uqPpxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
deleteEntity(entitiesToDelete.keys().list());
threadMonitoringController.exitInternalAction("_uqI8ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uqGf0LngEeyIw-dB1KCaVA");
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
