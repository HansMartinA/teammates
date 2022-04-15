package teammates.common.datatransfer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes;
import teammates.common.util.Const;
import teammates.common.util.StringHelper;
public class SessionResultsBundle {
private final Map<String, FeedbackQuestionAttributes> questionsMap;

private final Map<String, List<FeedbackResponseAttributes>> questionResponseMap;

private final Map<String, List<FeedbackResponseAttributes>> questionMissingResponseMap;

private final Map<String, List<FeedbackResponseCommentAttributes>> responseCommentsMap;

private final Map<String, Boolean> responseGiverVisibilityTable;

private final Map<String, Boolean> responseRecipientVisibilityTable;

private final Map<Long, Boolean> commentGiverVisibilityTable;

private final CourseRoster roster;

public  SessionResultsBundle(Map<String, FeedbackQuestionAttributes> questionsMap, List<FeedbackResponseAttributes> responses, List<FeedbackResponseAttributes> missingResponses, Map<String, Boolean> responseGiverVisibilityTable, Map<String, Boolean> responseRecipientVisibilityTable, Map<String, List<FeedbackResponseCommentAttributes>> responseCommentsMap, Map<Long, Boolean> commentGiverVisibilityTable, CourseRoster roster){
this.questionsMap = questionsMap;
this.responseCommentsMap = responseCommentsMap;
this.responseGiverVisibilityTable = responseGiverVisibilityTable;
this.responseRecipientVisibilityTable = responseRecipientVisibilityTable;
this.commentGiverVisibilityTable = commentGiverVisibilityTable;
this.roster = roster;
this.questionResponseMap = buildQuestionToResponseMap(responses);
this.questionMissingResponseMap = buildQuestionToResponseMap(missingResponses);
}
private  Map<String, List<FeedbackResponseAttributes>> buildQuestionToResponseMap(List<FeedbackResponseAttributes> responses) {
Map<String, List<FeedbackResponseAttributes>> questionToResponseMap = new  LinkedHashMap<>();
List<FeedbackQuestionAttributes> questions = new  ArrayList<>(questionsMap.values());
for (FeedbackQuestionAttributes question : questions)
{
questionToResponseMap.put(question.getId(), new  ArrayList<>());
}
for (FeedbackResponseAttributes response : responses)
{
FeedbackQuestionAttributes question = questionsMap.get(response.getFeedbackQuestionId());
List<FeedbackResponseAttributes> responsesForQuestion = questionToResponseMap.get(question.getId());
responsesForQuestion.add(response);
}
return questionToResponseMap;
}

public  boolean isResponseGiverVisible(FeedbackResponseAttributes response) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("response", response);
threadMonitoringController.enterService("_bR-f4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bSEmhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021994009760076835004878 = isResponseParticipantVisible(true, response);
threadMonitoringController.exitInternalAction("_bSEmhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021994009760076835004878;
}
finally {
threadMonitoringController.exitService("_bR-f4LvVEeyr6avTgCRLkQ");
}
}

public  boolean isResponseRecipientVisible(FeedbackResponseAttributes response) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("response", response);
threadMonitoringController.enterService("_bSHCwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bSOXhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022006002256067234908895 = isResponseParticipantVisible(false, response);
threadMonitoringController.exitInternalAction("_bSOXhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022006002256067234908895;
}
finally {
threadMonitoringController.exitService("_bSHCwLvVEeyr6avTgCRLkQ");
}
}

private  boolean isResponseParticipantVisible(boolean isGiver, FeedbackResponseAttributes response) {
FeedbackQuestionAttributes question = questionsMap.get(response.getFeedbackQuestionId());
FeedbackParticipantType participantType;
String responseId = response.getId();
boolean isVisible;
if (isGiver)
{
isVisible = responseGiverVisibilityTable.get(responseId);
participantType = question.getGiverType();
}
else
{
isVisible = responseRecipientVisibilityTable.get(responseId);
participantType = question.getRecipientType();
}
boolean isTypeNone = participantType == FeedbackParticipantType.NONE;
return isVisible || isTypeNone;
}

public  boolean isCommentGiverVisible(FeedbackResponseCommentAttributes comment) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("comment", comment);
threadMonitoringController.enterService("_bSSo8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bSVFMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022020008385409308543164 = commentGiverVisibilityTable.get(comment.getId());
threadMonitoringController.exitInternalAction("_bSVFMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022020008385409308543164;
}
finally {
threadMonitoringController.exitService("_bSSo8LvVEeyr6avTgCRLkQ");
}
}

public static  String getAnonName(FeedbackParticipantType type, String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("type", type);
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_bSXhcLvVEeyr6avTgCRLkQ", SessionResultsBundle.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bSlj5rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_bSlj67vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String hashedEncryptedName = getHashOfName(getEncryptedName(name));
threadMonitoringController.exitInternalAction("_bSlj67vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_bSlj5rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_bSmyALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String participantType = type.toSingularFormString();
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022041006319497988073911 = String.format(Const.DISPLAYED_NAME_FOR_ANONYMOUS_PARTICIPANT + " %s %s", participantType, hashedEncryptedName);
threadMonitoringController.exitInternalAction("_bSmyALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022041006319497988073911;
}
finally {
threadMonitoringController.exitService("_bSXhcLvVEeyr6avTgCRLkQ");
}
}

public  Map<String, List<FeedbackResponseAttributes>> getQuestionResponseMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a8HkoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a8IywLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<FeedbackResponseAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020414008032955139315121 = questionResponseMap;
threadMonitoringController.exitInternalAction("_a8IywLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020414008032955139315121;
}
finally {
threadMonitoringController.exitService("_a8HkoLvVEeyr6avTgCRLkQ");
}
}

public  Map<String, List<FeedbackResponseAttributes>> getQuestionMissingResponseMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bSpOQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bSrDcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<FeedbackResponseAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022053004775439746001624 = questionMissingResponseMap;
threadMonitoringController.exitInternalAction("_bSrDcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022053004775439746001624;
}
finally {
threadMonitoringController.exitService("_bSpOQLvVEeyr6avTgCRLkQ");
}
}

private static  String getEncryptedName(String name) {
return StringHelper.encrypt(name);
}

private static  String getHashOfName(String name) {
return Long.toString(Math.abs((long) name.hashCode()));
}

public  Map<String, FeedbackQuestionAttributes> getQuestionsMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bSwjALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bSxxILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302206400033771318611951595 = questionsMap;
threadMonitoringController.exitInternalAction("_bSxxILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302206400033771318611951595;
}
finally {
threadMonitoringController.exitService("_bSwjALvVEeyr6avTgCRLkQ");
}
}

public  Map<String, List<FeedbackResponseCommentAttributes>> getResponseCommentsMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bS0NYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bS2CkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<FeedbackResponseCommentAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022075008845943468416456 = responseCommentsMap;
threadMonitoringController.exitInternalAction("_bS2CkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022075008845943468416456;
}
finally {
threadMonitoringController.exitService("_bS0NYLvVEeyr6avTgCRLkQ");
}
}

public  CourseRoster getRoster() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a8OSULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a8PgcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseRoster longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020425009249217409965406 = roster;
threadMonitoringController.exitInternalAction("_a8PgcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020425009249217409965406;
}
finally {
threadMonitoringController.exitService("_a8OSULvVEeyr6avTgCRLkQ");
}
}

public  Map<String, Boolean> getResponseGiverVisibilityTable() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bS4e0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bS6UALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302208600400005549197345 = responseGiverVisibilityTable;
threadMonitoringController.exitInternalAction("_bS6UALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302208600400005549197345;
}
finally {
threadMonitoringController.exitService("_bS4e0LvVEeyr6avTgCRLkQ");
}
}

public  Map<String, Boolean> getResponseRecipientVisibilityTable() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bS8wQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bS9-YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022099005964462626671566 = responseRecipientVisibilityTable;
threadMonitoringController.exitInternalAction("_bS9-YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022099005964462626671566;
}
finally {
threadMonitoringController.exitService("_bS8wQLvVEeyr6avTgCRLkQ");
}
}

public  Map<Long, Boolean> getCommentGiverVisibilityTable() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bTAaoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bTCP0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<Long, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130221100011622069217929454 = commentGiverVisibilityTable;
threadMonitoringController.exitInternalAction("_bTCP0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130221100011622069217929454;
}
finally {
threadMonitoringController.exitService("_bTAaoLvVEeyr6avTgCRLkQ");
}
}

}
