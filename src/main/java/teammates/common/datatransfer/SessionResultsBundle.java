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
threadMonitoringController.enterService("_sxZRwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sxexVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681600009520879923589027 = isResponseParticipantVisible(true, response);
threadMonitoringController.exitInternalAction("_sxexVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681600009520879923589027;
}
finally {
threadMonitoringController.exitService("_sxZRwLngEeyIw-dB1KCaVA");
}
}

public  boolean isResponseRecipientVisible(FeedbackResponseAttributes response) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("response", response);
threadMonitoringController.enterService("_sxhNkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sxmtIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681604009166356427693794 = isResponseParticipantVisible(false, response);
threadMonitoringController.exitInternalAction("_sxmtIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681604009166356427693794;
}
finally {
threadMonitoringController.exitService("_sxhNkLngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_sxqXgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sxsMsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816070018582889588908746 = commentGiverVisibilityTable.get(comment.getId());
threadMonitoringController.exitInternalAction("_sxsMsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816070018582889588908746;
}
finally {
threadMonitoringController.exitService("_sxqXgLngEeyIw-dB1KCaVA");
}
}

public static  String getAnonName(FeedbackParticipantType type, String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("type", type);
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_sxuo8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sx8rZrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sx8ra7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String hashedEncryptedName = getHashOfName(getEncryptedName(name));
threadMonitoringController.exitInternalAction("_sx8ra7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_sx8rZrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sx9ScLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String participantType = type.toSingularFormString();
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816130041859117225489617 = String.format(Const.DISPLAYED_NAME_FOR_ANONYMOUS_PARTICIPANT + " %s %s", participantType, hashedEncryptedName);
threadMonitoringController.exitInternalAction("_sx9ScLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816130041859117225489617;
}
finally {
threadMonitoringController.exitService("_sxuo8LngEeyIw-dB1KCaVA");
}
}

public  Map<String, List<FeedbackResponseAttributes>> getQuestionResponseMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sdZXsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sdal0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<FeedbackResponseAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681167008703230522224257 = questionResponseMap;
threadMonitoringController.exitInternalAction("_sdal0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681167008703230522224257;
}
finally {
threadMonitoringController.exitService("_sdZXsLngEeyIw-dB1KCaVA");
}
}

public  Map<String, List<FeedbackResponseAttributes>> getQuestionMissingResponseMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sx_usLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_syA80LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<FeedbackResponseAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681618001668593598581205 = questionMissingResponseMap;
threadMonitoringController.exitInternalAction("_syA80LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681618001668593598581205;
}
finally {
threadMonitoringController.exitService("_sx_usLngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_syGcYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_syHqgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681622006927217634281206 = questionsMap;
threadMonitoringController.exitInternalAction("_syHqgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681622006927217634281206;
}
finally {
threadMonitoringController.exitService("_syGcYLngEeyIw-dB1KCaVA");
}
}

public  Map<String, List<FeedbackResponseCommentAttributes>> getResponseCommentsMap() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_syKGwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_syLU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<FeedbackResponseCommentAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816250024193045915911493 = responseCommentsMap;
threadMonitoringController.exitInternalAction("_syLU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816250024193045915911493;
}
finally {
threadMonitoringController.exitService("_syKGwLngEeyIw-dB1KCaVA");
}
}

public  CourseRoster getRoster() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sdfeULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sdgscLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseRoster longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811700007595556861569219 = roster;
threadMonitoringController.exitInternalAction("_sdgscLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811700007595556861569219;
}
finally {
threadMonitoringController.exitService("_sdfeULngEeyIw-dB1KCaVA");
}
}

public  Map<String, Boolean> getResponseGiverVisibilityTable() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_syNKELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_syO_QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681628003529525315727343 = responseGiverVisibilityTable;
threadMonitoringController.exitInternalAction("_syO_QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681628003529525315727343;
}
finally {
threadMonitoringController.exitService("_syNKELngEeyIw-dB1KCaVA");
}
}

public  Map<String, Boolean> getResponseRecipientVisibilityTable() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_syRbgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sySpoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681631004530096464002804 = responseRecipientVisibilityTable;
threadMonitoringController.exitInternalAction("_sySpoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681631004530096464002804;
}
finally {
threadMonitoringController.exitService("_syRbgLngEeyIw-dB1KCaVA");
}
}

public  Map<Long, Boolean> getCommentGiverVisibilityTable() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_syVF4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_syWUALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<Long, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681633004751304874736616 = commentGiverVisibilityTable;
threadMonitoringController.exitInternalAction("_syWUALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681633004751304874736616;
}
finally {
threadMonitoringController.exitService("_syVF4LngEeyIw-dB1KCaVA");
}
}

}
