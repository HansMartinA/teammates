package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import com.googlecode.objectify.cmd.Query;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Const;
import teammates.common.util.TimeHelper;
import teammates.storage.entity.FeedbackSession;
public final class FeedbackSessionsDb extends EntitiesDb<FeedbackSession, FeedbackSessionAttributes> {
private static final FeedbackSessionsDb instance = new  FeedbackSessionsDb();

private  FeedbackSessionsDb(){
}
public static  FeedbackSessionsDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_umzUMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_um1JYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682936008266224107885981 = instance;
threadMonitoringController.exitInternalAction("_um1JYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682936008266224107885981;
}
finally {
threadMonitoringController.exitService("_umzUMLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getAllOngoingSessions(Instant rangeStart, Instant rangeEnd) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rangeStart", rangeStart);
monitoringServiceParameters.addValue("rangeEnd", rangeEnd);
threadMonitoringController.enterService("_vIr5QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vI0cILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSession> endEntities = load().filter("endTime >", rangeStart).filter("endTime <", Instant.ofEpochMilli(rangeEnd.toEpochMilli()).plus(Const.FEEDBACK_SESSIONS_SEARCH_WINDOW)).list();
List<FeedbackSession> startEntities = load().filter("startTime <", rangeEnd).filter("startTime >", Instant.ofEpochMilli(rangeStart.toEpochMilli()).minus(Const.FEEDBACK_SESSIONS_SEARCH_WINDOW)).list();
List<String> startEntitiesIds = startEntities.stream().map(session -> session.getCourseId() + "::" + session.getFeedbackSessionName()).collect(Collectors.toList());
List<FeedbackSession> ongoingSessions = endEntities.stream().filter(session -> {
String id = session.getCourseId() + "::" + session.getFeedbackSessionName();
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683424007660942152684004 = startEntitiesIds.contains(id);
threadMonitoringController.exitInternalAction("_vI0cILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683424007660942152684004;
}
).collect(Collectors.toList());
threadMonitoringController.enterInternalAction("_vJFh5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834240008659447444748913 = makeAttributes(ongoingSessions);
threadMonitoringController.exitInternalAction("_vJFh5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834240008659447444748913;
}
finally {
threadMonitoringController.exitService("_vIr5QLngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes getFeedbackSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_vJLogLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vJOEwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_vJOEwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vJULZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vJUydLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes feedbackSession = makeAttributesOrNull(getFeedbackSessionEntity(feedbackSessionName, courseId));
threadMonitoringController.exitInternalAction("_vJUydLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vJULZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (feedbackSession != null && feedbackSession.isSessionDeleted())
{
threadMonitoringController.enterBranch("_vJVZgLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vJVZhLngEeyIw-dB1KCaVA");
log.info("Trying to access soft-deleted session: " + feedbackSessionName + "/" + courseId);
threadMonitoringController.enterInternalAction("_vJWAkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683433002988515116972448 = null;
threadMonitoringController.exitInternalAction("_vJWAkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683433002988515116972448;
}
threadMonitoringController.enterInternalAction("_vJWAkrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683433006185364205173102 = feedbackSession;
threadMonitoringController.exitInternalAction("_vJWAkrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683433006185364205173102;
}
finally {
threadMonitoringController.exitService("_vJLogLngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes getSoftDeletedFeedbackSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_vJcuQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vJfKgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_vJfKgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vJlRJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vJl4NLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes feedbackSession = makeAttributesOrNull(getFeedbackSessionEntity(feedbackSessionName, courseId));
threadMonitoringController.exitInternalAction("_vJl4NLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vJlRJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (feedbackSession != null && !feedbackSession.isSessionDeleted())
{
threadMonitoringController.enterBranch("_vJmfQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vJmfRLngEeyIw-dB1KCaVA");
log.info(feedbackSessionName + "/" + courseId + " is not soft-deleted!");
threadMonitoringController.enterInternalAction("_vJnGULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683445004829969912709242 = null;
threadMonitoringController.exitInternalAction("_vJnGULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683445004829969912709242;
}
threadMonitoringController.enterInternalAction("_vJnGUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683445003158557701227156 = feedbackSession;
threadMonitoringController.exitInternalAction("_vJnGUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683445003158557701227156;
}
finally {
threadMonitoringController.exitService("_vJcuQLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vJtM8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vJwQQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_vJwQQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vJ5aNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683451005527190372589266 = makeAttributes(getFeedbackSessionEntitiesForCourse(courseId)).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vJ5aNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vJ6oVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683451005606115474255371 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683451005527190372589266;
threadMonitoringController.exitInternalAction("_vJ6oVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vJ6oVbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vJ6oVrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683451005210108509239011 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683451005606115474255371;
threadMonitoringController.exitInternalAction("_vJ6oVrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683451005210108509239011;
}
finally {
threadMonitoringController.exitService("_vJtM8LngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsForCourseStartingAfter(String courseId, Instant after) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("after", after);
threadMonitoringController.enterService("_vKCkILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vKQmlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834590048749462376302266 = makeAttributes(getFeedbackSessionEntitiesForCourseStartingAfter(courseId, after)).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vKQmlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vKRNpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683460005576843816439868 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834590048749462376302266;
threadMonitoringController.exitInternalAction("_vKRNpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vKRNpbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vKR0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834600034978240947831307 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683460005576843816439868;
threadMonitoringController.exitInternalAction("_vKR0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834600034978240947831307;
}
finally {
threadMonitoringController.exitService("_vKCkILngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getSoftDeletedFeedbackSessionsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vQKaQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vQM2gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_vQM2gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vQWnhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683646005934220428096525 = makeAttributes(getFeedbackSessionEntitiesForCourse(courseId)).stream().filter(FeedbackSessionAttributes::isSessionDeleted).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vQWnhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vQX1pLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136836460019936801821817762 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683646005934220428096525;
threadMonitoringController.exitInternalAction("_vQX1pLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vQX1pbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683646009176038631542172 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136836460019936801821817762;
threadMonitoringController.exitInternalAction("_vQX1pbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683646009176038631542172;
}
finally {
threadMonitoringController.exitService("_vQKaQLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingOpenEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_vK9xMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vLQsIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683472005845506353440957 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingOpenEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vLQsIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vLR6RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834720038407181030395543 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683472005845506353440957;
threadMonitoringController.exitInternalAction("_vLR6RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vLR6RbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vLTIYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368347380145694797825342E04 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136834720038407181030395543;
threadMonitoringController.exitInternalAction("_vLTIYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368347380145694797825342E04;
}
finally {
threadMonitoringController.exitService("_vK9xMLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingClosingEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_vOMEULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vOaGxrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683614009830943391671674 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingClosingEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vOaGxrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vOat1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368361400689121296435446 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683614009830943391671674;
threadMonitoringController.exitInternalAction("_vOat1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vOat1bngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vObU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136836140021347687932437098 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368361400689121296435446;
threadMonitoringController.exitInternalAction("_vObU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136836140021347687932437098;
}
finally {
threadMonitoringController.exitService("_vOMEULngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingClosedEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_vOj3wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vOxTIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136836200029077665554285714 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingClosedEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vOxTIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vOyhRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368362000010290305073876516 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136836200029077665554285714;
threadMonitoringController.exitInternalAction("_vOyhRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vOyhRbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vOzIULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368362000622070373547625 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368362000010290305073876516;
threadMonitoringController.exitInternalAction("_vOzIULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368362000622070373547625;
}
finally {
threadMonitoringController.exitService("_vOj3wLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingOpeningSoonEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_vNybsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vOAeIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683606009756222383722594 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingOpeningSoonEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vOAeIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vOCTVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683606007031336390929421 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683606009756222383722594;
threadMonitoringController.exitInternalAction("_vOCTVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vOCTVbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vOC6YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683606009466170250461425 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683606007031336390929421;
threadMonitoringController.exitInternalAction("_vOC6YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683606009466170250461425;
}
finally {
threadMonitoringController.exitService("_vNybsLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingPublishedEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_vKkIkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vKyyEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683466009520000237108119 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingPublishedEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vKyyEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vKzZJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683466007302611879959341 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683466009520000237108119;
threadMonitoringController.exitInternalAction("_vKzZJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vKzZJbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vK0nQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683466005077498897948733 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683466007302611879959341;
threadMonitoringController.exitInternalAction("_vK0nQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683466005077498897948733;
}
finally {
threadMonitoringController.exitService("_vKkIkLngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes updateFeedbackSession(FeedbackSessionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_vLzesLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vL168LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_vL7ahLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSession feedbackSession = getFeedbackSessionEntity(updateOptions.getFeedbackSessionName(), updateOptions.getCourseId());
threadMonitoringController.exitInternalAction("_vL7ahLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vL168LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vL7ahbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (feedbackSession == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_vL7ahbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vL92xbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes newAttributes = makeAttributes(feedbackSession);
threadMonitoringController.exitInternalAction("_vL92xbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vL-d0LngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_vL_E4LngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_vMATALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vMATBLngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_vMc-8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMc-8bngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMdmBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMdmBbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMdmBrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMe0I7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMe0JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMe0JbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMgCQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMgCRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMgCRbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMgpU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMgpVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMgpVbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMh3c7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMh3dLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMh3dbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMjFk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMjsoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMjsobngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMlh0bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMlh0rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMlh07ngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMnXArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMnXA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMnXBLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMolI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMolJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMolJbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMpzQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMpzRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMpzRbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMrBY7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMrBZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMrBZbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMsPg7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMsPhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMsPhbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMtdo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vMtdpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMtdpbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMv547ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(feedbackSession.getInstructions(), newAttributes.getInstructions()) && this.<Instant>hasSameValue(feedbackSession.getStartTime(), newAttributes.getStartTime()) && this.<Instant>hasSameValue(feedbackSession.getEndTime(), newAttributes.getEndTime()) && this.<Instant>hasSameValue(feedbackSession.getSessionVisibleFromTime(), newAttributes.getSessionVisibleFromTime()) && this.<Instant>hasSameValue(feedbackSession.getResultsVisibleFromTime(), newAttributes.getResultsVisibleFromTime()) && this.<String>hasSameValue(feedbackSession.getTimeZone(), newAttributes.getTimeZone()) && this.<Long>hasSameValue(feedbackSession.getGracePeriod(), newAttributes.getGracePeriodMinutes()) && this.<Boolean>hasSameValue(feedbackSession.isSentOpeningSoonEmail(), newAttributes.isSentOpeningSoonEmail()) && this.<Boolean>hasSameValue(feedbackSession.isSentOpenEmail(), newAttributes.isSentOpenEmail()) && this.<Boolean>hasSameValue(feedbackSession.isSentClosingEmail(), newAttributes.isSentClosingEmail()) && this.<Boolean>hasSameValue(feedbackSession.isSentClosedEmail(), newAttributes.isSentClosedEmail()) && this.<Boolean>hasSameValue(feedbackSession.isSentPublishedEmail(), newAttributes.isSentPublishedEmail()) && this.<Boolean>hasSameValue(feedbackSession.isClosingEmailEnabled(), newAttributes.isClosingEmailEnabled()) && this.<Boolean>hasSameValue(feedbackSession.isPublishedEmailEnabled(), newAttributes.isPublishedEmailEnabled());
threadMonitoringController.exitInternalAction("_vMv547ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMtdpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMtdo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMsPhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMsPg7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMrBZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMrBY7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMpzRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMpzQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMolJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMolI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMnXA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMnXArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMlh0rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMlh0bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMjsoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMjFk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMh3dLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMh3c7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMgpVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMgpU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMgCRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMgCQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMe0JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMe0I7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMdmBbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMdmBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vMc-8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_vMy9MLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vMy9NLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vMy9NbngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, FeedbackSession.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_vMy9NLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vM0LU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683599006989558005441024 = makeAttributes(feedbackSession);
threadMonitoringController.exitInternalAction("_vM0LU7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683599006989558005441024;
}
threadMonitoringController.setExternalCallId("_vM1ZcLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vM1ZcbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setInstructions(newAttributes.getInstructions());
threadMonitoringController.exitInternalAction("_vM1ZcbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vM2nkLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vM3OoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setStartTime(newAttributes.getStartTime());
threadMonitoringController.exitInternalAction("_vM3OoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vM5D0LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vM5q4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setEndTime(newAttributes.getEndTime());
threadMonitoringController.exitInternalAction("_vM5q4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vM7gELngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vM8HILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSessionVisibleFromTime(newAttributes.getSessionVisibleFromTime());
threadMonitoringController.exitInternalAction("_vM8HILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vM9VQLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vM9VQbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setResultsVisibleFromTime(newAttributes.getResultsVisibleFromTime());
threadMonitoringController.exitInternalAction("_vM9VQbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vM-jYLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vM_KcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setTimeZone(newAttributes.getTimeZone());
threadMonitoringController.exitInternalAction("_vM_KcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vNAYkLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vNAYkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setGracePeriod(newAttributes.getGracePeriodMinutes());
threadMonitoringController.exitInternalAction("_vNAYkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vNCNwLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vNC00LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentOpeningSoonEmail(newAttributes.isSentOpeningSoonEmail());
threadMonitoringController.exitInternalAction("_vNC00LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vNEqALngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vNFRELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentOpenEmail(newAttributes.isSentOpenEmail());
threadMonitoringController.exitInternalAction("_vNFRELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vNGfMLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vNGfMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentClosingEmail(newAttributes.isSentClosingEmail());
threadMonitoringController.exitInternalAction("_vNGfMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vNHtULngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vNIUYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentClosedEmail(newAttributes.isSentClosedEmail());
threadMonitoringController.exitInternalAction("_vNIUYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vNI7cLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vNJigLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentPublishedEmail(newAttributes.isSentPublishedEmail());
threadMonitoringController.exitInternalAction("_vNJigLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vNKwoLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vNKwobngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSendClosingEmail(newAttributes.isClosingEmailEnabled());
threadMonitoringController.exitInternalAction("_vNKwobngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vNMl0LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vNNM4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSendPublishedEmail(newAttributes.isPublishedEmailEnabled());
threadMonitoringController.exitInternalAction("_vNNM4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vNT6krngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(feedbackSession);
threadMonitoringController.exitInternalAction("_vNT6krngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vNVvwbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683599008783266545295934 = makeAttributes(feedbackSession);
threadMonitoringController.exitInternalAction("_vNVvwbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683599008783266545295934;
}
finally {
threadMonitoringController.exitService("_vLzesLngEeyIw-dB1KCaVA");
}
}

public  Instant softDeleteFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vPMJ4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vPN_ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
threadMonitoringController.exitInternalAction("_vPN_ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vPTepLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSession sessionEntity = getFeedbackSessionEntity(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_vPTepLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vPUFsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (sessionEntity == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
sessionEntity.setDeletedTime(Instant.now());
threadMonitoringController.exitInternalAction("_vPUFsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vPcBgrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(sessionEntity);
threadMonitoringController.exitInternalAction("_vPcBgrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vPdPoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136836320006946665775295913 = sessionEntity.getDeletedTime();
threadMonitoringController.exitInternalAction("_vPdPoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136836320006946665775295913;
}
finally {
threadMonitoringController.exitService("_vPMJ4LngEeyIw-dB1KCaVA");
}
}

public  void restoreDeletedFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vPj9ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vPnAoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
threadMonitoringController.exitInternalAction("_vPnAoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vPrSFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSession sessionEntity = getFeedbackSessionEntity(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_vPrSFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vPrSFbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (sessionEntity == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
sessionEntity.setDeletedTime(null);
threadMonitoringController.exitInternalAction("_vPrSFbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vP1qI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(sessionEntity);
threadMonitoringController.exitInternalAction("_vP1qI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_vPj9ULngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vO-ugLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vPBKwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
deleteEntity(Key.create(FeedbackSession.class, FeedbackSession.generateId(feedbackSessionName, courseId)));
threadMonitoringController.exitInternalAction("_vPBKwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_vO-ugLngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackSessions(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_uq-pkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_urGlYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
Query<FeedbackSession> entitiesToDelete = load().project();
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_urPIQLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_urPIRLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_urQ9cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("courseId =", query.getCourseId());
threadMonitoringController.exitInternalAction("_urQ9cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
deleteEntity(entitiesToDelete.keys().list());
threadMonitoringController.exitInternalAction("_urGlYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uq-pkLngEeyIw-dB1KCaVA");
}
}

private  List<FeedbackSession> getFeedbackSessionEntitiesForCourse(String courseId) {
return load().filter("courseId =", courseId).list();
}

private  List<FeedbackSession> getFeedbackSessionEntitiesForCourseStartingAfter(String courseId, Instant after) {
return load().filter("courseId =", courseId).filter("startTime >=", after).list();
}

private  List<FeedbackSession> getFeedbackSessionEntitiesPossiblyNeedingOpeningSoonEmail() {
return load().filter("startTime >", TimeHelper.getInstantDaysOffsetFromNow( - 2)).filter("sentOpeningSoonEmail =", false).list();
}

private  List<FeedbackSession> getFeedbackSessionEntitiesPossiblyNeedingOpenEmail() {
return load().filter("startTime >", TimeHelper.getInstantDaysOffsetFromNow( - 2)).filter("sentOpenEmail =", false).list();
}

private  List<FeedbackSession> getFeedbackSessionEntitiesPossiblyNeedingClosingEmail() {
return load().filter("endTime >", TimeHelper.getInstantDaysOffsetFromNow( - 2)).filter("sentClosingEmail =", false).filter("isClosingEmailEnabled =", true).list();
}

private  List<FeedbackSession> getFeedbackSessionEntitiesPossiblyNeedingClosedEmail() {
return load().filter("endTime >", TimeHelper.getInstantDaysOffsetFromNow( - 2)).filter("sentClosedEmail =", false).filter("isClosingEmailEnabled =", true).list();
}

private  List<FeedbackSession> getFeedbackSessionEntitiesPossiblyNeedingPublishedEmail() {
return load().filter("resultsVisibleFromTime >", TimeHelper.getInstantDaysOffsetFromNow( - 2)).filter("sentPublishedEmail =", false).filter("isPublishedEmailEnabled =", true).list();
}

private  FeedbackSession getFeedbackSessionEntity(String feedbackSessionName, String courseId) {
return load().id(FeedbackSession.generateId(feedbackSessionName, courseId)).now();
}

@Override
 LoadType<FeedbackSession> load() {
return ofy().load().type(FeedbackSession.class);
}

@Override
 boolean hasExistingEntities(FeedbackSessionAttributes entityToCreate) {
return !load().filterKey(Key.create(FeedbackSession.class, FeedbackSession.generateId(entityToCreate.getFeedbackSessionName(), entityToCreate.getCourseId()))).keys().list().isEmpty();
}

@Override
 FeedbackSessionAttributes makeAttributes(FeedbackSession entity) {
assert entity != null;
return FeedbackSessionAttributes.valueOf(entity);
}

}
