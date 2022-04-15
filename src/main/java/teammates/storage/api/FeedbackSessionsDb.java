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
threadMonitoringController.enterService("_dM2RILvVEeyr6avTgCRLkQ", FeedbackSessionsDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dM4tYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130277920024977857264467795 = instance;
threadMonitoringController.exitInternalAction("_dM4tYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130277920024977857264467795;
}
finally {
threadMonitoringController.exitService("_dM2RILvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getAllOngoingSessions(Instant rangeStart, Instant rangeEnd) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rangeStart", rangeStart);
monitoringServiceParameters.addValue("rangeEnd", rangeEnd);
threadMonitoringController.enterService("_dvXvYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dvgSQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSession> endEntities = load().filter("endTime >", rangeStart).filter("endTime <", Instant.ofEpochMilli(rangeEnd.toEpochMilli()).plus(Const.FEEDBACK_SESSIONS_SEARCH_WINDOW)).list();
List<FeedbackSession> startEntities = load().filter("startTime <", rangeEnd).filter("startTime >", Instant.ofEpochMilli(rangeStart.toEpochMilli()).minus(Const.FEEDBACK_SESSIONS_SEARCH_WINDOW)).list();
List<String> startEntitiesIds = startEntities.stream().map(session -> session.getCourseId() + "::" + session.getFeedbackSessionName()).collect(Collectors.toList());
List<FeedbackSession> ongoingSessions = endEntities.stream().filter(session -> {
String id = session.getCourseId() + "::" + session.getFeedbackSessionName();
return startEntitiesIds.contains(id);
}
).collect(Collectors.toList());
threadMonitoringController.enterInternalAction("_dv0bVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030503002282951286150815 = makeAttributes(ongoingSessions);
threadMonitoringController.exitInternalAction("_dv0bVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030503002282951286150815;
}
finally {
threadMonitoringController.exitService("_dvXvYLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes getFeedbackSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_dv8XILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dv_acLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_dv_acLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dwGIJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dwHWRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes feedbackSession = makeAttributesOrNull(getFeedbackSessionEntity(feedbackSessionName, courseId));
threadMonitoringController.exitInternalAction("_dwHWRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dwGIJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (feedbackSession != null && feedbackSession.isSessionDeleted())
{
threadMonitoringController.enterBranch("_dwHWRbvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dwH9ULvVEeyr6avTgCRLkQ");
log.info("Trying to access soft-deleted session: " + feedbackSessionName + "/" + courseId);
threadMonitoringController.enterInternalAction("_dwH9UbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030569003390820763411583 = null;
threadMonitoringController.exitInternalAction("_dwH9UbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030569003390820763411583;
}
threadMonitoringController.enterInternalAction("_dwH9U7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030569009615025427220076 = feedbackSession;
threadMonitoringController.exitInternalAction("_dwH9U7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030569009615025427220076;
}
finally {
threadMonitoringController.exitService("_dv8XILvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes getSoftDeletedFeedbackSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_dwP5ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dwS8cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_dwS8cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dwaRNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dwa4RLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes feedbackSession = makeAttributesOrNull(getFeedbackSessionEntity(feedbackSessionName, courseId));
threadMonitoringController.exitInternalAction("_dwa4RLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dwaRNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (feedbackSession != null && !feedbackSession.isSessionDeleted())
{
threadMonitoringController.enterBranch("_dwbfULvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dwbfVLvVEeyr6avTgCRLkQ");
log.info(feedbackSessionName + "/" + courseId + " is not soft-deleted!");
threadMonitoringController.enterInternalAction("_dwcGYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030633005485746082783128 = null;
threadMonitoringController.exitInternalAction("_dwcGYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030633005485746082783128;
}
threadMonitoringController.enterInternalAction("_dwctcbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030633006235843903245712 = feedbackSession;
threadMonitoringController.exitInternalAction("_dwctcbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030633006235843903245712;
}
finally {
threadMonitoringController.exitService("_dwP5ILvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dwkpQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dwnskLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_dwnskLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dwzSw7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030676009444565241838987 = makeAttributes(getFeedbackSessionEntitiesForCourse(courseId)).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_dwzSw7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dwz51LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130306760042688501053704053 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030676009444565241838987;
threadMonitoringController.exitInternalAction("_dwz51LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dwz51bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dw0g4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303067600603134269315642 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130306760042688501053704053;
threadMonitoringController.exitInternalAction("_dw0g4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303067600603134269315642;
}
finally {
threadMonitoringController.exitService("_dwkpQLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsForCourseStartingAfter(String courseId, Instant after) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("after", after);
threadMonitoringController.enterService("_dw-R4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dxSa9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030714004828162440479129 = makeAttributes(getFeedbackSessionEntitiesForCourseStartingAfter(courseId, after)).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_dxSa9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dxTpFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030715007676679273755852 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030714004828162440479129;
threadMonitoringController.exitInternalAction("_dxTpFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dxTpFbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dxUQILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030715004043904575575781 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030715007676679273755852;
threadMonitoringController.exitInternalAction("_dxUQILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030715004043904575575781;
}
finally {
threadMonitoringController.exitService("_dw-R4LvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getSoftDeletedFeedbackSessionsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_d3rW0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_d3tzELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_d3tzELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d34LI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031719009153226058341242 = makeAttributes(getFeedbackSessionEntitiesForCourse(courseId)).stream().filter(FeedbackSessionAttributes::isSessionDeleted).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_d34LI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d34yNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031719003776360591407423 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031719009153226058341242;
threadMonitoringController.exitInternalAction("_d34yNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d34yNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130317190042937912391045263 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031719003776360591407423;
threadMonitoringController.exitInternalAction("_d34yNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130317190042937912391045263;
}
finally {
threadMonitoringController.exitService("_d3rW0LvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingOpenEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_dyEeELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dyUVsrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030788009589894896701225 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingOpenEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_dyUVsrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dyU8xLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030788008159699515365642 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030788009589894896701225;
threadMonitoringController.exitInternalAction("_dyU8xLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dyU8xbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dyVj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303078800467362104774559 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030788008159699515365642;
threadMonitoringController.exitInternalAction("_dyVj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303078800467362104774559;
}
finally {
threadMonitoringController.exitService("_dyEeELvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingClosingEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_d1flgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_d1u2ErvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031543005321652981842391 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingClosingEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_d1u2ErvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d1vdJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130315430014819432416128975 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031543005321652981842391;
threadMonitoringController.exitInternalAction("_d1vdJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d1vdJbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d1wEMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031543008982926057570713 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130315430014819432416128975;
threadMonitoringController.exitInternalAction("_d1wEMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031543008982926057570713;
}
finally {
threadMonitoringController.exitService("_d1flgLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingClosedEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_d17DULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_d2N-QrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031581005821799022597675 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingClosedEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_d2N-QrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d2OlVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031581005790393872150108 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031581005821799022597675;
threadMonitoringController.exitInternalAction("_d2OlVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d2OlVbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d2PMYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031581003200335974356888 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031581005790393872150108;
threadMonitoringController.exitInternalAction("_d2PMYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031581003200335974356888;
}
finally {
threadMonitoringController.exitService("_d17DULvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingOpeningSoonEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_d1FV0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_d1VNc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031500002854143869003739 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingOpeningSoonEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_d1VNc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d1V0hLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031500006664487390013082 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031500002854143869003739;
threadMonitoringController.exitInternalAction("_d1V0hLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d1V0hbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d1WbkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031500009264037385682126 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031500006664487390013082;
threadMonitoringController.exitInternalAction("_d1WbkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031500009264037385682126;
}
finally {
threadMonitoringController.exitService("_d1FV0LvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsPossiblyNeedingPublishedEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_dxnyILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dx4Q0rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130307510018237583631257592 = makeAttributes(getFeedbackSessionEntitiesPossiblyNeedingPublishedEmail()).stream().filter(session -> !session.isSessionDeleted()).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_dx4Q0rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dx435LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130307510034557963707075734 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130307510018237583631257592;
threadMonitoringController.exitInternalAction("_dx435LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dx435bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dx5e8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030751004121761638213235 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130307510034557963707075734;
threadMonitoringController.exitInternalAction("_dx5e8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013030751004121761638213235;
}
finally {
threadMonitoringController.exitService("_dxnyILvVEeyr6avTgCRLkQ");
}
}

public  FeedbackSessionAttributes updateFeedbackSession(FeedbackSessionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_dy6LkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dy8n0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_dzDVhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSession feedbackSession = getFeedbackSessionEntity(updateOptions.getFeedbackSessionName(), updateOptions.getCourseId());
threadMonitoringController.exitInternalAction("_dzDVhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dy8n0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dzDVhbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (feedbackSession == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_dzDVhbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dzGY0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes newAttributes = makeAttributes(feedbackSession);
threadMonitoringController.exitInternalAction("_dzGY0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dzGY0rvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_dzHm8LvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_dzIOALvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dzIOBLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_dzokULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dzokUbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dzpydLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dzpydbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dzpydrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dzrAk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dzrAlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dzrAlbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dzsOs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dzsOtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dzsOtbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dztc07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dztc1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dztc1bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dzvSA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dzvSBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dzvSBbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dzwgI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dzwgJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dzwgJbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dzxuQ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dzxuRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dzxuRbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dz1Yo7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dz1YpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dz1YpbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dz2mw7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dz2mxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dz2mxbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dz3047vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dz305LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dz305bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dz5qE7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dz5qFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dz5qFbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dz64M7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dz64NLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dz64NbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dz8GU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dz8GVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dz8GVbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dz9Uc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(feedbackSession.getInstructions(), newAttributes.getInstructions()) && this.<Instant>hasSameValue(feedbackSession.getStartTime(), newAttributes.getStartTime()) && this.<Instant>hasSameValue(feedbackSession.getEndTime(), newAttributes.getEndTime()) && this.<Instant>hasSameValue(feedbackSession.getSessionVisibleFromTime(), newAttributes.getSessionVisibleFromTime()) && this.<Instant>hasSameValue(feedbackSession.getResultsVisibleFromTime(), newAttributes.getResultsVisibleFromTime()) && this.<String>hasSameValue(feedbackSession.getTimeZone(), newAttributes.getTimeZone()) && this.<Long>hasSameValue(feedbackSession.getGracePeriod(), newAttributes.getGracePeriodMinutes()) && this.<Boolean>hasSameValue(feedbackSession.isSentOpeningSoonEmail(), newAttributes.isSentOpeningSoonEmail()) && this.<Boolean>hasSameValue(feedbackSession.isSentOpenEmail(), newAttributes.isSentOpenEmail()) && this.<Boolean>hasSameValue(feedbackSession.isSentClosingEmail(), newAttributes.isSentClosingEmail()) && this.<Boolean>hasSameValue(feedbackSession.isSentClosedEmail(), newAttributes.isSentClosedEmail()) && this.<Boolean>hasSameValue(feedbackSession.isSentPublishedEmail(), newAttributes.isSentPublishedEmail()) && this.<Boolean>hasSameValue(feedbackSession.isClosingEmailEnabled(), newAttributes.isClosingEmailEnabled()) && this.<Boolean>hasSameValue(feedbackSession.isPublishedEmailEnabled(), newAttributes.isPublishedEmailEnabled());
threadMonitoringController.exitInternalAction("_dz9Uc7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz8GVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz8GU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz64NLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz64M7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz5qFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz5qE7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz305LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz3047vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz2mxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz2mw7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz1YpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dz1Yo7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzxuRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzxuQ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzwgJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzwgI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzvSBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzvSA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dztc1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dztc07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzsOtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzsOs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzrAlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzrAk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzpydbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzpydLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dzokULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_dz_wsLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0AXw7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0AXxLvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, FeedbackSession.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_d0AXw7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d0Bl47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031462007162370742292757 = makeAttributes(feedbackSession);
threadMonitoringController.exitInternalAction("_d0Bl47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031462007162370742292757;
}
threadMonitoringController.setExternalCallId("_d0C0ALvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0DbELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setInstructions(newAttributes.getInstructions());
threadMonitoringController.exitInternalAction("_d0DbELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0EpMLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0FQQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setStartTime(newAttributes.getStartTime());
threadMonitoringController.exitInternalAction("_d0FQQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0GeYLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0HFcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setEndTime(newAttributes.getEndTime());
threadMonitoringController.exitInternalAction("_d0HFcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0ITkLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0I6oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSessionVisibleFromTime(newAttributes.getSessionVisibleFromTime());
threadMonitoringController.exitInternalAction("_d0I6oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0Kv0LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0LW4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setResultsVisibleFromTime(newAttributes.getResultsVisibleFromTime());
threadMonitoringController.exitInternalAction("_d0LW4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0MlALvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0MlAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setTimeZone(newAttributes.getTimeZone());
threadMonitoringController.exitInternalAction("_d0MlAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0OaMLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0PBQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setGracePeriod(newAttributes.getGracePeriodMinutes());
threadMonitoringController.exitInternalAction("_d0PBQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0QPYLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0Q2cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentOpeningSoonEmail(newAttributes.isSentOpeningSoonEmail());
threadMonitoringController.exitInternalAction("_d0Q2cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0SEkLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0SEkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentOpenEmail(newAttributes.isSentOpenEmail());
threadMonitoringController.exitInternalAction("_d0SEkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0TSsLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0T5wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentClosingEmail(newAttributes.isSentClosingEmail());
threadMonitoringController.exitInternalAction("_d0T5wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0VH4LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0Vu8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentClosedEmail(newAttributes.isSentClosedEmail());
threadMonitoringController.exitInternalAction("_d0Vu8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0XkILvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0YyQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSentPublishedEmail(newAttributes.isSentPublishedEmail());
threadMonitoringController.exitInternalAction("_d0YyQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0ancLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0bOgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSendClosingEmail(newAttributes.isClosingEmailEnabled());
threadMonitoringController.exitInternalAction("_d0bOgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_d0ccoLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_d0ccobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackSession.setSendPublishedEmail(newAttributes.isPublishedEmailEnabled());
threadMonitoringController.exitInternalAction("_d0ccobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d0jKUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(feedbackSession);
threadMonitoringController.exitInternalAction("_d0jKUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d0k_g7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130314620023653182305652565 = makeAttributes(feedbackSession);
threadMonitoringController.exitInternalAction("_d0k_g7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130314620023653182305652565;
}
finally {
threadMonitoringController.exitService("_dy6LkLvVEeyr6avTgCRLkQ");
}
}

public  Instant softDeleteFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_d2sfYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_d2u7oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
threadMonitoringController.exitInternalAction("_d2u7oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d20bM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSession sessionEntity = getFeedbackSessionEntity(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_d20bM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d20bNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (sessionEntity == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
sessionEntity.setDeletedTime(Instant.now());
threadMonitoringController.exitInternalAction("_d20bNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d28-ErvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(sessionEntity);
threadMonitoringController.exitInternalAction("_d28-ErvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d2-zQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031640006428363242066398 = sessionEntity.getDeletedTime();
threadMonitoringController.exitInternalAction("_d2-zQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031640006428363242066398;
}
finally {
threadMonitoringController.exitService("_d2sfYLvVEeyr6avTgCRLkQ");
}
}

public  void restoreDeletedFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_d3GvELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_d3JyYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
threadMonitoringController.exitInternalAction("_d3JyYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d3PR9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackSession sessionEntity = getFeedbackSessionEntity(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_d3PR9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d3PR9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (sessionEntity == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
sessionEntity.setDeletedTime(null);
threadMonitoringController.exitInternalAction("_d3PR9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_d3XNwrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(sessionEntity);
threadMonitoringController.exitInternalAction("_d3XNwrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_d3GvELvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_d2ZkcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_d2dO0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
deleteEntity(Key.create(FeedbackSession.class, FeedbackSession.generateId(feedbackSessionName, courseId)));
threadMonitoringController.exitInternalAction("_d2dO0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_d2ZkcLvVEeyr6avTgCRLkQ");
}
}

public  void deleteFeedbackSessions(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_dRC0oLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dRGfALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
Query<FeedbackSession> entitiesToDelete = load().project();
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_dRI7QLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dRI7RLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dRJiULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
entitiesToDelete = entitiesToDelete.filter("courseId =", query.getCourseId());
threadMonitoringController.exitInternalAction("_dRJiULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
deleteEntity(entitiesToDelete.keys().list());
threadMonitoringController.exitInternalAction("_dRGfALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dRC0oLvVEeyr6avTgCRLkQ");
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
