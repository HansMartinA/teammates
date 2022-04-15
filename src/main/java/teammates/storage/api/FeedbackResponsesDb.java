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
threadMonitoringController.enterService("_dNDsgLvVEeyr6avTgCRLkQ", FeedbackResponsesDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dNGIwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponsesDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130278250011064891998514226 = instance;
threadMonitoringController.exitInternalAction("_dNGIwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130278250011064891998514226;
}
finally {
threadMonitoringController.exitService("_dNDsgLvVEeyr6avTgCRLkQ");
}
}

public  Set<String> getGiverSetThatAnswerFeedbackSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_djblILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_djeBYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
Set<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029785009641072618627753 = giverSet;
threadMonitoringController.exitInternalAction("_djeBYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029785009641072618627753;
}
finally {
threadMonitoringController.exitService("_djblILvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseAttributes getFeedbackResponse(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_djtR8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_djwVQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
threadMonitoringController.exitInternalAction("_djwVQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_djz_pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponse fr = getFeedbackResponseEntity(feedbackResponseId);
threadMonitoringController.exitInternalAction("_djz_pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dj3qBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302981800585725578269564 = makeAttributesOrNull(fr);
threadMonitoringController.exitInternalAction("_dj3qBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302981800585725578269564;
}
finally {
threadMonitoringController.exitService("_djtR8LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseAttributes getFeedbackResponse(String feedbackQuestionId, String giverEmail, String receiverEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("giverEmail", giverEmail);
monitoringServiceParameters.addValue("receiverEmail", receiverEmail);
threadMonitoringController.enterService("_dkBbALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dkDQMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
assert giverEmail != null;
assert receiverEmail != null;
threadMonitoringController.enterInternalAction("_dkIItLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponse fr = getFeedbackResponseEntity(FeedbackResponse.generateId(feedbackQuestionId, giverEmail, receiverEmail));
threadMonitoringController.exitInternalAction("_dkIItLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dkDQMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dkLMBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029848004340139842581545 = makeAttributesOrNull(fr);
threadMonitoringController.exitInternalAction("_dkLMBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029848004340139842581545;
}
finally {
threadMonitoringController.exitService("_dkBbALvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForQuestionInSection(String feedbackQuestionId, String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_dlnWcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dlqZwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
assert section != null;
threadMonitoringController.exitInternalAction("_dlqZwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dl5DRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130299830048089764359336873 = makeAttributes(getFeedbackResponseEntitiesForQuestionInSection(feedbackQuestionId, section));
threadMonitoringController.exitInternalAction("_dl5DRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dl5qVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029983003197432417797996 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130299830048089764359336873;
threadMonitoringController.exitInternalAction("_dl5qVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029983003197432417797996;
}
finally {
threadMonitoringController.exitService("_dlnWcLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_dlIOQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dlKqgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
threadMonitoringController.exitInternalAction("_dlKqgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dlQxJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029942008319874964872536 = makeAttributes(getFeedbackResponseEntitiesForQuestion(feedbackQuestionId));
threadMonitoringController.exitInternalAction("_dlQxJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dlR_RLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302994200018855398405703716 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029942008319874964872536;
threadMonitoringController.exitInternalAction("_dlR_RLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302994200018855398405703716;
}
finally {
threadMonitoringController.exitService("_dlIOQLvVEeyr6avTgCRLkQ");
}
}

public  boolean areThereResponsesForQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_dlYs8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dlaiILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029955009598982456261911 = !load().filter("feedbackQuestionId =", feedbackQuestionId).limit(1).list().isEmpty();
threadMonitoringController.exitInternalAction("_dlaiILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029955009598982456261911;
}
finally {
threadMonitoringController.exitService("_dlYs8LvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dkSgwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dkU9ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_dkU9ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dkbqtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302988000620704258314154 = makeAttributes(getFeedbackResponseEntitiesForSession(feedbackSessionName, courseId));
threadMonitoringController.exitInternalAction("_dkbqtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dkc41LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029881007027444494285406 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302988000620704258314154;
threadMonitoringController.exitInternalAction("_dkc41LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029881007027444494285406;
}
finally {
threadMonitoringController.exitService("_dkSgwLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForSessionInSection(String feedbackSessionName, String courseId, String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_dkmp0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dkqUMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert section != null;
threadMonitoringController.exitInternalAction("_dkqUMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dk_rZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130299130009507109142648107 = makeAttributes(getFeedbackResponseEntitiesForSessionInSection(feedbackSessionName, courseId, section));
threadMonitoringController.exitInternalAction("_dk_rZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dlA5hLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029913009022083854470168 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130299130009507109142648107;
threadMonitoringController.exitInternalAction("_dlA5hLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013029913009022083854470168;
}
finally {
threadMonitoringController.exitService("_dkmp0LvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromGiverForQuestion(String feedbackQuestionId, String giverEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("giverEmail", giverEmail);
threadMonitoringController.enterService("_dmA_ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dmDbULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
assert giverEmail != null;
threadMonitoringController.exitInternalAction("_dmDbULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dmKwFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030012005712256106885614 = makeAttributes(getFeedbackResponseEntitiesFromGiverForQuestion(feedbackQuestionId, giverEmail));
threadMonitoringController.exitInternalAction("_dmKwFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dmL-MrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130300120018846959934496887 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030012005712256106885614;
threadMonitoringController.exitInternalAction("_dmL-MrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130300120018846959934496887;
}
finally {
threadMonitoringController.exitService("_dmA_ELvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForReceiverForQuestion(String feedbackQuestionId, String receiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
monitoringServiceParameters.addValue("receiver", receiver);
threadMonitoringController.enterService("_dmVIILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dmXkYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
assert receiver != null;
threadMonitoringController.exitInternalAction("_dmXkYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dmguVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030044003740234759146843 = makeAttributes(getFeedbackResponseEntitiesForReceiverForQuestion(feedbackQuestionId, receiver));
threadMonitoringController.exitInternalAction("_dmguVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dmijhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303004400655216358290319 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030044003740234759146843;
threadMonitoringController.exitInternalAction("_dmijhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303004400655216358290319;
}
finally {
threadMonitoringController.exitService("_dmVIILvVEeyr6avTgCRLkQ");
}
}

public  boolean hasResponsesFromGiverInSession(String giverIdentifier, String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("giverIdentifier", giverIdentifier);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dmrtcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dmx0ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert giverIdentifier != null;
assert feedbackSessionName != null;
assert courseId != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130300580018809975320647554 = !load().filter("giverEmail =", giverIdentifier).filter("feedbackSessionName =", feedbackSessionName).filter("courseId =", courseId).limit(1).keys().list().isEmpty();
threadMonitoringController.exitInternalAction("_dmx0ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130300580018809975320647554;
}
finally {
threadMonitoringController.exitService("_dmrtcLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesForReceiverForCourse(String courseId, String receiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("receiver", receiver);
threadMonitoringController.enterService("_dnBrsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dnDg4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert receiver != null;
threadMonitoringController.exitInternalAction("_dnDg4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dnN49LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303008600637976830124217 = makeAttributes(getFeedbackResponseEntitiesForReceiverForCourse(courseId, receiver));
threadMonitoringController.exitInternalAction("_dnN49LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dnPHFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030086004063292188909613 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303008600637976830124217;
threadMonitoringController.exitInternalAction("_dnPHFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030086004063292188909613;
}
finally {
threadMonitoringController.exitService("_dnBrsLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromGiverForCourse(String courseId, String giverEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("giverEmail", giverEmail);
threadMonitoringController.enterService("_dnaGMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dncicLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert giverEmail != null;
threadMonitoringController.exitInternalAction("_dncicLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dnnhlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130301170043003581476864916 = makeAttributes(getFeedbackResponseEntitiesFromGiverForCourse(courseId, giverEmail));
threadMonitoringController.exitInternalAction("_dnnhlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dnoIpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030117003396395925555419 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130301170043003581476864916;
threadMonitoringController.exitInternalAction("_dnoIpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030117003396395925555419;
}
finally {
threadMonitoringController.exitService("_dnaGMLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackResponseAttributes updateFeedbackResponse(FeedbackResponseAttributes.UpdateOptions updateOptions)throws EntityDoesNotExistException, InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_drFFQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_drHhgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_drOPNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponse oldResponse = getFeedbackResponseEntity(updateOptions.getFeedbackResponseId());
threadMonitoringController.exitInternalAction("_drOPNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_drHhgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_drOPNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (oldResponse == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
threadMonitoringController.exitInternalAction("_drOPNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_drRSgbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes newAttributes = makeAttributes(oldResponse);
threadMonitoringController.exitInternalAction("_drRSgbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_drR5kLvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_drSgoLvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_drU84LvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_drU85LvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
if (newAttributes.getRecipient().equals(oldResponse.getRecipientEmail()) && newAttributes.getGiver().equals(oldResponse.getGiverEmail()))
{
threadMonitoringController.enterBranch("_dr-dILvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dr_EM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dr_ENLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsASVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dsASVbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsASVrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsBgc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dsBgdLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsBgdbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsCuk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(oldResponse.getGiverSection(), newAttributes.getGiverSection()) && this.<String>hasSameValue(oldResponse.getRecipientSection(), newAttributes.getRecipientSection()) && this.<String>hasSameValue(oldResponse.getAnswer(), newAttributes.getSerializedFeedbackResponseDetail());
threadMonitoringController.exitInternalAction("_dsCuk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dsBgdLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dsBgc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dsASVbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dsASVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dr_EM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_dsCulLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsCumLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsCumbvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, FeedbackResponse.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_dsCumLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dsDVoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030466008175880327195871 = newAttributes;
threadMonitoringController.exitInternalAction("_dsDVoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030466008175880327195871;
}
threadMonitoringController.setExternalCallId("_dsDVorvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsD8sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
oldResponse.setGiverSection(newAttributes.getGiverSection());
threadMonitoringController.exitInternalAction("_dsD8sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsD8sbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsD8srvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
oldResponse.setRecipientSection(newAttributes.getRecipientSection());
threadMonitoringController.exitInternalAction("_dsD8srvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsD8s7vVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsEjwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
oldResponse.setAnswer(newAttributes.getSerializedFeedbackResponseDetail());
threadMonitoringController.exitInternalAction("_dsEjwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dsGY8rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(oldResponse);
threadMonitoringController.exitInternalAction("_dsGY8rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dsHAA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130304660006161910595739162 = makeAttributes(oldResponse);
threadMonitoringController.exitInternalAction("_dsHAA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130304660006161910595739162;
}
else
{
threadMonitoringController.setExternalCallId("_dsHACLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dsHnELvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dsIOILvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dsI1MLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dsI1MbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsJcQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsJcQbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsKDULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsKDUbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsKDUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsKDU7vVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsKqYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dsKqYbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dsLRcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = FeedbackResponseAttributes.builder(newAttributes.getFeedbackQuestionId(), newAttributes.getGiver(), newAttributes.getRecipient()).withCourseId(newAttributes.getCourseId()).withFeedbackSessionName(newAttributes.getFeedbackSessionName()).withResponseDetails(newAttributes.getResponseDetailsCopy()).withGiverSection(newAttributes.getGiverSection()).withRecipientSection(newAttributes.getRecipientSection()).build();
threadMonitoringController.exitInternalAction("_dsLRcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dsKqYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dsKDUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dsKDULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dsJcQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = createEntity(newAttributes);
deleteEntity(Key.create(FeedbackResponse.class, oldResponse.getId()));
return newAttributes;
}
}
finally {
threadMonitoringController.exitService("_drFFQLvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackResponse(String responseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responseId", responseId);
threadMonitoringController.enterService("_dtQ2kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dtT54LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert responseId != null;
deleteEntity(Key.create(FeedbackResponse.class, responseId));
threadMonitoringController.exitInternalAction("_dtT54LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dtQ2kLvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackResponses(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_dQieULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dQk6kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
Query<FeedbackResponse> entitiesToDelete = load().project();
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_dQok8LvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQok9LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQpMALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("courseId =", query.getCourseId());
threadMonitoringController.exitInternalAction("_dQpMALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isFeedbackSessionNamePresent())
{
threadMonitoringController.enterBranch("_dQqaILvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQqaJLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQrBMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackSessionName =", query.getFeedbackSessionName());
threadMonitoringController.exitInternalAction("_dQrBMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (query.isQuestionIdPresent())
{
threadMonitoringController.enterBranch("_dQsPULvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dQsPVLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dQs2YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("feedbackQuestionId =", query.getQuestionId());
threadMonitoringController.exitInternalAction("_dQs2YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
deleteEntity(entitiesToDelete.keys().list());
threadMonitoringController.exitInternalAction("_dQk6kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dQieULvVEeyr6avTgCRLkQ");
}
}

public  boolean hasFeedbackResponseEntitiesForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dq3p4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dq6GILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030131003023857215275444 = !load().filter("courseId =", courseId).limit(1).list().isEmpty();
threadMonitoringController.exitInternalAction("_dq6GILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030131003023857215275444;
}
finally {
threadMonitoringController.exitService("_dq3p4LvVEeyr6avTgCRLkQ");
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
