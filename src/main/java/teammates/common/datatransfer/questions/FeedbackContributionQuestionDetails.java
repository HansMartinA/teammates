package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.SessionResultsBundle;
import teammates.common.datatransfer.TeamEvalResult;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.util.Const;
import teammates.common.util.JsonUtils;
import teammates.common.util.Logger;
public class FeedbackContributionQuestionDetails extends FeedbackQuestionDetails {
static final String QUESTION_TYPE_NAME = "Team contribution question";

static final String CONTRIB_ERROR_INVALID_OPTION = "Invalid option for the " + QUESTION_TYPE_NAME + ".";

static final String CONTRIB_ERROR_INVALID_FEEDBACK_PATH = QUESTION_TYPE_NAME + " must have " + "\"Students in this course\" and \"Giver's team members and Giver\" " + "as the feedback giver and recipient respectively. " + "These values will be used instead.";

static final String CONTRIB_ERROR_INVALID_VISIBILITY_OPTIONS = QUESTION_TYPE_NAME + " must use one of the common visibility options. The " + "\"Shown anonymously to recipient and team members, visible to instructors\" " + "option will be used instead.";

private static final int SUMMARY_INDEX_CLAIMED = 0;

private static final int SUMMARY_INDEX_PERCEIVED = 1;

private static final Logger log = Logger.getLogger();

private boolean isNotSureAllowed;

public  FeedbackContributionQuestionDetails(){
this(null);
}
public  FeedbackContributionQuestionDetails(String questionText){
super(FeedbackQuestionType.CONTRIB, questionText);
isNotSureAllowed = true;
}
@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_sbX-cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sbYlgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackContributionQuestionDetails newContribDetails = (FeedbackContributionQuestionDetails) newDetails;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681123007226130386426105 = newContribDetails.isNotSureAllowed != this.isNotSureAllowed;
threadMonitoringController.exitInternalAction("_sbYlgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681123007226130386426105;
}
finally {
threadMonitoringController.exitService("_sbX-cLngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isIndividualResponsesShownToStudents() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sbbBwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sbcP4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681125004649912257998947 = false;
threadMonitoringController.exitInternalAction("_sbcP4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681125004649912257998947;
}
finally {
threadMonitoringController.exitService("_sbbBwLngEeyIw-dB1KCaVA");
}
}

@Override
public  String getQuestionResultStatisticsJson(FeedbackQuestionAttributes question, String studentEmail, SessionResultsBundle bundle) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
monitoringServiceParameters.addValue("studentEmail", studentEmail);
monitoringServiceParameters.addValue("bundle", bundle);
threadMonitoringController.enterService("_sbdeALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sbf6RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sbghULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> responses = bundle.getQuestionResponseMap().get(question.getId());
threadMonitoringController.exitInternalAction("_sbf6RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean isStudent = studentEmail != null;
List<String> teamNames;
if (isStudent)
{
teamNames = getTeamsWithAtLeastOneResponse(responses, bundle);
}
else
{
teamNames = new  ArrayList<>(bundle.getRoster().getTeamToMembersTable().keySet());
}
threadMonitoringController.exitInternalAction("_sbghULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sbtVoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<String>> teamMembersEmail = getTeamMembersEmail(bundle, teamNames);
threadMonitoringController.exitInternalAction("_sbtVoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sbvx5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<FeedbackResponseAttributes>> teamResponses = getTeamResponses(responses, bundle, teamNames);
threadMonitoringController.exitInternalAction("_sbvx5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sb6J9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, int[] [] > teamSubmissionArray = getTeamSubmissionArray(teamNames, teamMembersEmail, teamResponses);
threadMonitoringController.exitInternalAction("_sb6J9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sb7_JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, TeamEvalResult> teamResults = getTeamResults(teamNames, teamSubmissionArray);
threadMonitoringController.exitInternalAction("_sb7_JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sb7_JbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
ContributionStatistics output = new  ContributionStatistics();
if (isStudent)
{
String currentUserTeam = bundle.getRoster().getInfoForIdentifier(studentEmail).getTeamName();
TeamEvalResult currentUserTeamResults = teamResults.get(currentUserTeam);
if (currentUserTeamResults != null)
{
List<String> teamEmails = teamMembersEmail.get(currentUserTeam);
int currentUserIndex = teamEmails.indexOf(studentEmail);
int[]  claimedNumbers = currentUserTeamResults.claimed[currentUserIndex];
int[]  perceivedNumbers = currentUserTeamResults.denormalizedAveragePerceived[currentUserIndex];
int claimed = 0;
int perceived = 0;
Map<String, Integer> claimedOthers = new  HashMap<>();
List<Integer> perceivedOthers = new  ArrayList<>();
for (int i = 0 ; i < claimedNumbers.length ; i++)
{
if (i == currentUserIndex)
{
claimed = claimedNumbers[i];
}
else
{
claimedOthers.put(teamEmails.get(i), claimedNumbers[i]);
}
}
for (int i = 0 ; i < perceivedNumbers.length ; i++)
{
if (i == currentUserIndex)
{
perceived = perceivedNumbers[i];
}
else
{
perceivedOthers.add(perceivedNumbers[i]);
}
}
perceivedOthers.sort(Comparator.reverseOrder());
output.results.put(studentEmail, new  ContributionStatisticsEntry(claimed, perceived, claimedOthers, perceivedOthers.stream().mapToInt(i -> i).toArray()));
}
}
else
{
Map<String, int[] > studentResults = getStudentResults(teamMembersEmail, teamResults);
for (Map.Entry<String, int[] > entry : studentResults.entrySet())
{
int[]  summary = entry.getValue();
String email = entry.getKey();
String team = bundle.getRoster().getStudentForEmail(email).getTeam();
List<String> teamEmails = teamMembersEmail.get(team);
TeamEvalResult teamResult = teamResults.get(team);
int studentIndex = teamEmails.indexOf(email);
Map<String, Integer> claimedOthers = new  HashMap<>();
List<Integer> perceivedOthers = new  ArrayList<>();
for (int i = 0 ; i < teamResult.normalizedPeerContributionRatio.length ; i++)
{
if (i != studentIndex)
{
claimedOthers.put(teamEmails.get(i), teamResult.normalizedPeerContributionRatio[studentIndex][i]);
perceivedOthers.add(teamResult.normalizedPeerContributionRatio[i][studentIndex]);
}
}
perceivedOthers.sort(Comparator.reverseOrder());
output.results.put(email, new  ContributionStatisticsEntry(summary[SUMMARY_INDEX_CLAIMED], summary[SUMMARY_INDEX_PERCEIVED], claimedOthers, perceivedOthers.stream().mapToInt(i -> i).toArray()));
}
}
threadMonitoringController.exitInternalAction("_sb7_JbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return JsonUtils.toJson(output);
}
finally {
threadMonitoringController.exitService("_sbdeALngEeyIw-dB1KCaVA");
}
}

private  Map<String, int[] > getStudentResults(Map<String, List<String>> teamMembersEmail, Map<String, TeamEvalResult> teamResults) {
Map<String, int[] > studentResults = new  LinkedHashMap<>();
teamResults.forEach((key, teamResult) -> {
List<String> teamEmails = teamMembersEmail.get(key);
for (int i = 0 ; i < teamEmails.size() ; i++)
{
String studentEmail = teamEmails.get(i);
int[]  summary = new int [2] ;
summary[SUMMARY_INDEX_CLAIMED] = teamResult.normalizedClaimed[i][i];
summary[SUMMARY_INDEX_PERCEIVED] = teamResult.normalizedAveragePerceived[i];
studentResults.put(studentEmail, summary);
}
}
);
return studentResults;
}

private  Map<String, TeamEvalResult> getTeamResults(List<String> teamNames, Map<String, int[] [] > teamSubmissionArray) {
Map<String, TeamEvalResult> teamResults = new  LinkedHashMap<>();
for (String team : teamNames)
{
TeamEvalResult teamEvalResult = new  TeamEvalResult(teamSubmissionArray.get(team));
teamResults.put(team, teamEvalResult);
}
return teamResults;
}

private  Map<String, int[] [] > getTeamSubmissionArray(List<String> teamNames, Map<String, List<String>> teamMembersEmail, Map<String, List<FeedbackResponseAttributes>> teamResponses) {
Map<String, int[] [] > teamSubmissionArray = new  LinkedHashMap<>();
for (String team : teamNames)
{
int teamSize = teamMembersEmail.get(team).size();
teamSubmissionArray.put(team, new int [teamSize] [teamSize] );
for (int i = 0 ; i < teamSize ; i++)
{
for (int j = 0 ; j < teamSize ; j++)
{
teamSubmissionArray.get(team)[i][j] = Const.POINTS_NOT_SUBMITTED;
}
}
List<FeedbackResponseAttributes> teamResponseList = teamResponses.get(team);
List<String> memberEmailList = teamMembersEmail.get(team);
for (FeedbackResponseAttributes response : teamResponseList)
{
int giverIndx = memberEmailList.indexOf(response.getGiver());
int recipientIndx = memberEmailList.indexOf(response.getRecipient());
if (giverIndx ==  - 1 || recipientIndx ==  - 1)
{
continue;
}
int points = ((FeedbackContributionResponseDetails) response.getResponseDetailsCopy()).getAnswer();
teamSubmissionArray.get(team)[giverIndx][recipientIndx] = points;
}
}
return teamSubmissionArray;
}

private  Map<String, List<FeedbackResponseAttributes>> getTeamResponses(List<FeedbackResponseAttributes> responses, SessionResultsBundle bundle, List<String> teamNames) {
Map<String, List<FeedbackResponseAttributes>> teamResponses = new  LinkedHashMap<>();
for (String teamName : teamNames)
{
teamResponses.put(teamName, new  ArrayList<>());
}
for (FeedbackResponseAttributes response : responses)
{
String team = bundle.getRoster().getInfoForIdentifier(response.getGiver()).getTeamName();
if (teamResponses.containsKey(team))
{
teamResponses.get(team).add(response);
}
}
return teamResponses;
}

private  Map<String, List<String>> getTeamMembersEmail(SessionResultsBundle bundle, List<String> teamNames) {
Map<String, List<String>> teamMembersEmail = new  LinkedHashMap<>();
for (String teamName : teamNames)
{
List<String> memberEmails = bundle.getRoster().getTeamToMembersTable().get(teamName).stream().map(StudentAttributes::getEmail).collect(Collectors.toList());
teamMembersEmail.put(teamName, memberEmails);
}
return teamMembersEmail;
}

private  List<String> getTeamsWithAtLeastOneResponse(List<FeedbackResponseAttributes> responses, SessionResultsBundle bundle) {
Set<String> teamNames = new  HashSet<>();
for (FeedbackResponseAttributes response : responses)
{
String teamNameOfResponseGiver = bundle.getRoster().getInfoForIdentifier(response.getGiver()).getTeamName();
teamNames.add(teamNameOfResponseGiver);
}
return new  ArrayList<>(teamNames);
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_scVAsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_scVnwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811430025075583099861953 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_scVnwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811430025075583099861953;
}
finally {
threadMonitoringController.exitService("_scVAsLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_scXc8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_scYrELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
for (FeedbackResponseDetails response : responses)
{
FeedbackContributionResponseDetails details = (FeedbackContributionResponseDetails) response;
boolean validAnswer = false;
boolean isValidRange = details.getAnswer() >= 0 && details.getAnswer() <= 200;
boolean isMultipleOf10 = details.getAnswer() % 10 == 0;
if (isValidRange && isMultipleOf10)
{
validAnswer = true;
}
if (details.getAnswer() == Const.POINTS_NOT_SURE && isNotSureAllowed || details.getAnswer() == Const.POINTS_NOT_SUBMITTED)
{
validAnswer = true;
}
if (!validAnswer)
{
errors.add(CONTRIB_ERROR_INVALID_OPTION);
}
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681146007445923668089339 = errors;
threadMonitoringController.exitInternalAction("_scYrELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681146007445923668089339;
}
finally {
threadMonitoringController.exitService("_scXc8LngEeyIw-dB1KCaVA");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_scbuYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_scc8gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String errorMsg = "";
if (feedbackQuestionAttributes.getGiverType() != FeedbackParticipantType.STUDENTS)
{
log.severe("Unexpected giverType for contribution question: " + feedbackQuestionAttributes.getGiverType() + " (forced to :" + FeedbackParticipantType.STUDENTS + ")");
feedbackQuestionAttributes.setGiverType(FeedbackParticipantType.STUDENTS);
errorMsg = CONTRIB_ERROR_INVALID_FEEDBACK_PATH;
}
if (feedbackQuestionAttributes.getRecipientType() != FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF)
{
log.severe("Unexpected recipientType for contribution question: " + feedbackQuestionAttributes.getRecipientType() + " (forced to :" + FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF + ")");
feedbackQuestionAttributes.setRecipientType(FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF);
errorMsg = CONTRIB_ERROR_INVALID_FEEDBACK_PATH;
}
if (!(feedbackQuestionAttributes.getShowResponsesTo().contains(FeedbackParticipantType.RECEIVER) == feedbackQuestionAttributes.getShowResponsesTo().contains(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS) && feedbackQuestionAttributes.getShowResponsesTo().contains(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS) == feedbackQuestionAttributes.getShowResponsesTo().contains(FeedbackParticipantType.OWN_TEAM_MEMBERS)))
{
log.severe("Unexpected showResponsesTo for contribution question: " + feedbackQuestionAttributes.getShowResponsesTo() + " (forced to :" + "Shown anonymously to recipient and team members, visible to instructors" + ")");
feedbackQuestionAttributes.setShowResponsesTo(Arrays.asList(FeedbackParticipantType.RECEIVER, FeedbackParticipantType.RECEIVER_TEAM_MEMBERS, FeedbackParticipantType.OWN_TEAM_MEMBERS, FeedbackParticipantType.INSTRUCTORS));
errorMsg = CONTRIB_ERROR_INVALID_VISIBILITY_OPTIONS;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681149002582420551187544 = errorMsg;
threadMonitoringController.exitInternalAction("_scc8gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681149002582420551187544;
}
finally {
threadMonitoringController.exitService("_scbuYLngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isInstructorCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_scupULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_scv3cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811520046864567448047223 = false;
threadMonitoringController.exitInternalAction("_scv3cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811520046864567448047223;
}
finally {
threadMonitoringController.exitService("_scupULngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_scyTsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_scy6wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811580022100206665053934 = false;
threadMonitoringController.exitInternalAction("_scy6wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811580022100206665053934;
}
finally {
threadMonitoringController.exitService("_scyTsLngEeyIw-dB1KCaVA");
}
}

public  boolean isNotSureAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sc0v8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sc1-ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681161004859822573091589 = isNotSureAllowed;
threadMonitoringController.exitInternalAction("_sc1-ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681161004859822573091589;
}
finally {
threadMonitoringController.exitService("_sc0v8LngEeyIw-dB1KCaVA");
}
}

public  void setNotSureAllowed(boolean notSureAllowed) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("notSureAllowed", notSureAllowed);
threadMonitoringController.enterService("_sc3zQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sc5ocLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
isNotSureAllowed = notSureAllowed;
threadMonitoringController.exitInternalAction("_sc5ocLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sc3zQLngEeyIw-dB1KCaVA");
}
}

public static class ContributionStatistics {
private final Map<String, ContributionStatisticsEntry> results = new  HashMap<>();

public  Map<String, ContributionStatisticsEntry> getResults() {
return results;
}

}
public static class ContributionStatisticsEntry {
private final int claimed;

private final int perceived;

private final Map<String, Integer> claimedOthers;

private final int[]  perceivedOthers;

public  ContributionStatisticsEntry(int claimed, int perceived, Map<String, Integer> claimedOthers, int[]  perceivedOthers){
this.claimed = claimed;
this.perceived = perceived;
this.claimedOthers = claimedOthers;
this.perceivedOthers = perceivedOthers;
}
public  int getClaimed() {
return claimed;
}

public  int getPerceived() {
return perceived;
}

public  Map<String, Integer> getClaimedOthers() {
return claimedOthers;
}

public  int[]  getPerceivedOthers() {
return perceivedOthers;
}

}
}
