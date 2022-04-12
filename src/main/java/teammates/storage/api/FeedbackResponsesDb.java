package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import com.googlecode.objectify.cmd.Query;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.storage.entity.FeedbackResponse;
public final class FeedbackResponsesDb extends EntitiesDb<FeedbackResponse, FeedbackResponseAttributes> {
private static final FeedbackResponsesDb instance = new  FeedbackResponsesDb();

private  FeedbackResponsesDb(){
}
public static  FeedbackResponsesDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_unAIgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_unCkwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponsesDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368294200979458065639819 = instance;
threadMonitoringController.exitInternalAction("_unCkwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368294200979458065639819;
}
finally {
threadMonitoringController.exitService("_unAIgLngEeyIw-dB1KCaVA");
}
}

public  Set<String> getGiverSetThatAnswerFeedbackSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_u9xCsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u9y34LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
List<Key<FeedbackResponse>> keysOfResponses = load().filter("courseId =", courseId).filter("feedbackSessionName =", feedbackSessionName).keys().list();
Set<String> giverSet = new  HashSet<>();
for (Key<FeedbackResponse> key : keysOfResponses)
{
String[]  tokens = key.getName().split("%");
if (tokens.length >= 3)
{
giverSet.add(tokens[1]);
}
}
Set<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136832980006626479281323794 = giverSet;
threadMonitoringController.exitInternalAction("_u9y34LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136832980006626479281323794;
}
finally {
threadMonitoringController.exitService("_u9xCsLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseAttributes getFeedbackResponse(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_u-ATQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u-CvgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
threadMonitoringController.exitInternalAction("_u-CvgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u-HA9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponse fr = getFeedbackResponseEntity(feedbackResponseId);
threadMonitoringController.exitInternalAction("_u-HA9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u-JdNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683303005790856719330213 = makeAttributesOrNull(fr);
threadMonitoringController.exitInternalAction("_u-JdNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683303005790856719330213;
}
finally {
threadMonitoringController.exitService("_u-ATQLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseAttributes getFeedbackResponse(String feedbackQuestionId, String giverEmail, String receiverEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("giverEmail", giverEmail);
monitoringServiceParameters.addValue("receiverEmail", receiverEmail);
threadMonitoringController.enterService("_u-Qx8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u-TOMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
assert giverEmail != null;
assert receiverEmail != null;
threadMonitoringController.enterInternalAction("_u-W4lLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponse fr = getFeedbackResponseEntity(FeedbackResponse.generateId(feedbackQuestionId, giverEmail, receiverEmail));
threadMonitoringController.exitInternalAction("_u-W4lLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_u-TOMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u-ZU1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683309006223259431471225 = makeAttributesOrNull(fr);
threadMonitoringController.exitInternalAction("_u-ZU1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683309006223259431471225;
}
finally {
threadMonitoringController.exitService("_u-Qx8LngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForQuestionInSection(String feedbackQuestionId, String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_u_vYoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u_x04LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
assert section != null;
threadMonitoringController.exitInternalAction("_u_x04LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u__QRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683334002146018243859089 = makeAttributes(getFeedbackResponseEntitiesForQuestionInSection(feedbackQuestionId, section));
threadMonitoringController.exitInternalAction("_u__QRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u__3VLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368333400062269039120996905 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683334002146018243859089;
threadMonitoringController.exitInternalAction("_u__3VLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368333400062269039120996905;
}
finally {
threadMonitoringController.exitService("_u_vYoLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_u_RekLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u_T60LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
threadMonitoringController.exitInternalAction("_u_T60LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u_aBdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683327009348042967043699 = makeAttributes(getFeedbackResponseEntitiesForQuestion(feedbackQuestionId));
threadMonitoringController.exitInternalAction("_u_aBdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u_bPkrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833270015686634712740666 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683327009348042967043699;
threadMonitoringController.exitInternalAction("_u_bPkrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833270015686634712740666;
}
finally {
threadMonitoringController.exitService("_u_RekLngEeyIw-dB1KCaVA");
}
}

public  boolean areThereResponsesForQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_u_h9QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u_kZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683330007719578604112315 = !load().filter("feedbackQuestionId =", feedbackQuestionId).limit(1).list().isEmpty();
threadMonitoringController.exitInternalAction("_u_kZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683330007719578604112315;
}
finally {
threadMonitoringController.exitService("_u_h9QLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_u-hQoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u-js4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_u-js4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u-rBpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683314006955811789289998 = makeAttributes(getFeedbackResponseEntitiesForSession(feedbackSessionName, courseId));
threadMonitoringController.exitInternalAction("_u-rBpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u-sPxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833140009326557395119461 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683314006955811789289998;
threadMonitoringController.exitInternalAction("_u-sPxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833140009326557395119461;
}
finally {
threadMonitoringController.exitService("_u-hQoLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForSessionInSection(String feedbackSessionName, String courseId, String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_u-2AwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_u-4dALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert section != null;
threadMonitoringController.exitInternalAction("_u-4dALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u_KJ1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833200012449536800090333 = makeAttributes(getFeedbackResponseEntitiesForSessionInSection(feedbackSessionName, courseId, section));
threadMonitoringController.exitInternalAction("_u_KJ1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_u_LX9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833200014192608738504298 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833200012449536800090333;
threadMonitoringController.exitInternalAction("_u_LX9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833200014192608738504298;
}
finally {
threadMonitoringController.exitService("_u-2AwLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromGiverForQuestion(String feedbackQuestionId, String giverEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("giverEmail", giverEmail);
threadMonitoringController.enterService("_vAHMELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vAJBQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
assert giverEmail != null;
threadMonitoringController.exitInternalAction("_vAJBQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vASyRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683340003452231888641545 = makeAttributes(getFeedbackResponseEntitiesFromGiverForQuestion(feedbackQuestionId, giverEmail));
threadMonitoringController.exitInternalAction("_vASyRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vAUAZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683340005640607414637557 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683340003452231888641545;
threadMonitoringController.exitInternalAction("_vAUAZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683340005640607414637557;
}
finally {
threadMonitoringController.exitService("_vAHMELngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForReceiverForQuestion(String feedbackQuestionId, String receiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("receiver", receiver);
threadMonitoringController.enterService("_vAbVILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vAdKULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
assert receiver != null;
threadMonitoringController.exitInternalAction("_vAdKULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vAlGJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683345005009429068139425 = makeAttributes(getFeedbackResponseEntitiesForReceiverForQuestion(feedbackQuestionId, receiver));
threadMonitoringController.exitInternalAction("_vAlGJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vAltNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368334500565581300047266 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683345005009429068139425;
threadMonitoringController.exitInternalAction("_vAltNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368334500565581300047266;
}
finally {
threadMonitoringController.exitService("_vAbVILngEeyIw-dB1KCaVA");
}
}

public  boolean hasResponsesFromGiverInSession(String giverIdentifier, String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("giverIdentifier", giverIdentifier);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vAwsULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vA09wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert giverIdentifier != null;
assert feedbackSessionName != null;
assert courseId != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833470025667018686867116 = !load().filter("giverEmail =", giverIdentifier).filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).limit(1).keys().list().isEmpty();
threadMonitoringController.exitInternalAction("_vA09wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833470025667018686867116;
}
finally {
threadMonitoringController.exitService("_vAwsULngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForReceiverForCourse(String courseId, String receiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("receiver", receiver);
threadMonitoringController.enterService("_vBFccLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vBIfwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert receiver != null;
threadMonitoringController.exitInternalAction("_vBIfwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vBPNdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683353007829381237278455 = makeAttributes(getFeedbackResponseEntitiesForReceiverForCourse(courseId, receiver));
threadMonitoringController.exitInternalAction("_vBPNdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vBQblLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683353006527923262358165 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683353007829381237278455;
threadMonitoringController.exitInternalAction("_vBQblLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683353006527923262358165;
}
finally {
threadMonitoringController.exitService("_vBFccLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromGiverForCourse(String courseId, String giverEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("giverEmail", giverEmail);
threadMonitoringController.enterService("_vBazoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vBeeALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert giverEmail != null;
threadMonitoringController.exitInternalAction("_vBeeALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vBlyxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683359005810050706642484 = makeAttributes(getFeedbackResponseEntitiesFromGiverForCourse(courseId, giverEmail));
threadMonitoringController.exitInternalAction("_vBlyxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vBoPArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683359008567311789216647 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683359005810050706642484;
threadMonitoringController.exitInternalAction("_vBoPArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683359008567311789216647;
}
finally {
threadMonitoringController.exitService("_vBazoLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseAttributes updateFeedbackResponse(FeedbackResponseAttributes.UpdateOptions updateOptions)throws EntityDoesNotExistException, InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_vE2iILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vE4-YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_vE9P1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponse oldResponse = getFeedbackResponseEntity(updateOptions.getFeedbackResponseId());
threadMonitoringController.exitInternalAction("_vE9P1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vE4-YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vE9P1bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (oldResponse == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
threadMonitoringController.exitInternalAction("_vE9P1bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vE_sEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes newAttributes = makeAttributes(oldResponse);
threadMonitoringController.exitInternalAction("_vE_sEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vE_sErngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_vFATILngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_vFBhQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vFBhRLngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
if (newAttributes.getRecipient().equals(oldResponse.getRecipientEmail()) && newAttributes.getGiver().equals(oldResponse.getGiverEmail()))
{
threadMonitoringController.enterBranch("_vFjswLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFjsxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFjsxbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFlh9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vFlh9bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFlh9rngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFnXI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vFnXJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFnXJbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFolQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(oldResponse.getGiverSection(), newAttributes.getGiverSection()) && this.<String>hasSameValue(oldResponse.getRecipientSection(), newAttributes.getRecipientSection()) && this.<String>hasSameValue(oldResponse.getAnswer(), newAttributes.getSerializedFeedbackResponseDetail());
threadMonitoringController.exitInternalAction("_vFolQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFnXJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFnXI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFlh9bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFlh9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFjsxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_vFolRLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFolSLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFolSbngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, FeedbackResponse.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_vFolSLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vFpMULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683416004959649735686138 = newAttributes;
threadMonitoringController.exitInternalAction("_vFpMULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683416004959649735686138;
}
threadMonitoringController.setExternalCallId("_vFpMUrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFpMU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
oldResponse.setGiverSection(newAttributes.getGiverSection());
threadMonitoringController.exitInternalAction("_vFpMU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFpMVLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFpzYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
oldResponse.setRecipientSection(newAttributes.getRecipientSection());
threadMonitoringController.exitInternalAction("_vFpzYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFpzYbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFqacLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
oldResponse.setAnswer(newAttributes.getSerializedFeedbackResponseDetail());
threadMonitoringController.exitInternalAction("_vFqacLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vFsPorngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(oldResponse);
threadMonitoringController.exitInternalAction("_vFsPorngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vFs2s7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834160002652081237777837 = makeAttributes(oldResponse);
threadMonitoringController.exitInternalAction("_vFs2s7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834160002652081237777837;
}
else
{
threadMonitoringController.setExternalCallId("_vFs2uLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vFtdwLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vFuE0LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vFur4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vFvS8LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFv6ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFv6AbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFwhELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFwhEbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFwhErngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFwhE7ngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFxIILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vFxIIbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vFxvMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = FeedbackResponseAttributes.builder(newAttributes.getFeedbackQuestionId(), newAttributes.getGiver(), newAttributes.getRecipient()).withCourseId(newAttributes.getCourseId()).withFeedbackSessionName(newAttributes.getFeedbackSessionName()).withResponseDetails(newAttributes.getResponseDetailsCopy()).withGiverSection(newAttributes.getGiverSection()).withRecipientSection(newAttributes.getRecipientSection()).build();
threadMonitoringController.exitInternalAction("_vFxvMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFxIILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFwhErngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFwhELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vFv6ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = createEntity(newAttributes);
deleteEntity(Key.create(FeedbackResponse.class, oldResponse.getId()));
return newAttributes;
}
}
finally {
threadMonitoringController.exitService("_vE2iILngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackResponse(String responseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responseId", responseId);
threadMonitoringController.enterService("_vGyb0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vG0RALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert responseId != null;
deleteEntity(Key.create(FeedbackResponse.class, responseId));
threadMonitoringController.exitInternalAction("_vG0RALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_vGyb0LngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackResponses(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_uqVJULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uqXlkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
Query<FeedbackResponse> entitiesToDelete = load().project();
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_uqao4LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqao5LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uqao5bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("courseId =", query.getCourseId());
threadMonitoringController.exitInternalAction("_uqao5bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isFeedbackSessionNamePresent())
{
threadMonitoringController.enterBranch("_uqb3ALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqb3BLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uqceELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackSessionName =", query.getFeedbackSessionName());
threadMonitoringController.exitInternalAction("_uqceELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isQuestionIdPresent())
{
threadMonitoringController.enterBranch("_uqdFILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uqdFJLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uqdFJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackQuestionId =", query.getQuestionId());
threadMonitoringController.exitInternalAction("_uqdFJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
deleteEntity(entitiesToDelete.keys().list());
threadMonitoringController.exitInternalAction("_uqXlkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uqVJULngEeyIw-dB1KCaVA");
}
}

public  boolean hasFeedbackResponseEntitiesForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vEqU4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vEsxILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833620007428397923409125 = !load().filter("courseId =", courseId).limit(1).list().isEmpty();
threadMonitoringController.exitInternalAction("_vEsxILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136833620007428397923409125;
}
finally {
threadMonitoringController.exitService("_vEqU4LngEeyIw-dB1KCaVA");
}
}

private  FeedbackResponse getFeedbackResponseEntity(String feedbackResponseId) {
return load().id(feedbackResponseId).now();
}

private  Collection<FeedbackResponse> getFeedbackResponseEntitiesForQuestionInSection(String feedbackQuestionId, String section) {
List<FeedbackResponse> allResponses = new  ArrayList<>();
allResponses.addAll(load().filter("feedbackQuestionId =", feedbackQuestionId).filter("giverSection =", section).list());
allResponses.addAll(load().filter("feedbackQuestionId =", feedbackQuestionId).filter("receiverSection =", section).list());
return removeDuplicates(allResponses);
}

private  List<FeedbackResponse> getFeedbackResponseEntitiesForQuestion(String feedbackQuestionId) {
return load().filter("feedbackQuestionId =", feedbackQuestionId).list();
}

private  List<FeedbackResponse> getFeedbackResponseEntitiesForSession(String feedbackSessionName, String courseId) {
return load().filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).list();
}

private  Collection<FeedbackResponse> getFeedbackResponseEntitiesForSessionInSection(String feedbackSessionName, String courseId, String section) {
List<FeedbackResponse> allResponse = new  ArrayList<>();
allResponse.addAll(load().filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).filter("giverSection =", section).list());
allResponse.addAll(load().filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).filter("receiverSection =", section).list());
return removeDuplicates(allResponse);
}

private  Collection<FeedbackResponse> removeDuplicates(Collection<FeedbackResponse> responses) {
Map<String, FeedbackResponse> uniqueResponses = new  HashMap<>();
for (FeedbackResponse response : responses)
{
uniqueResponses.put(response.getId(), response);
}
return uniqueResponses.values();
}

private  List<FeedbackResponse> getFeedbackResponseEntitiesFromGiverForQuestion(String feedbackQuestionId, String giverEmail) {
return load().filter("feedbackQuestionId =", feedbackQuestionId).filter("giverEmail =", giverEmail).list();
}

private  List<FeedbackResponse> getFeedbackResponseEntitiesForReceiverForQuestion(String feedbackQuestionId, String receiver) {
return load().filter("feedbackQuestionId =", feedbackQuestionId).filter("receiver =", receiver).list();
}

private  List<FeedbackResponse> getFeedbackResponseEntitiesForReceiverForCourse(String courseId, String receiver) {
return load().filter("courseId =", courseId).filter("receiver =", receiver).list();
}

private  List<FeedbackResponse> getFeedbackResponseEntitiesFromGiverForCourse(String courseId, String giverEmail) {
return load().filter("courseId =", courseId).filter("giverEmail =", giverEmail).list();
}

@Override
 LoadType<FeedbackResponse> load() {
return ofy().load().type(FeedbackResponse.class);
}

@Override
 boolean hasExistingEntities(FeedbackResponseAttributes entityToCreate) {
return !load().filterKey(Key.create(FeedbackResponse.class, FeedbackResponse.generateId(entityToCreate.getFeedbackQuestionId(), entityToCreate.getGiver(), entityToCreate.getRecipient()))).keys().list().isEmpty();
}

@Override
 FeedbackResponseAttributes makeAttributes(FeedbackResponse entity) {
assert entity != null;
return FeedbackResponseAttributes.valueOf(entity);
}

}
