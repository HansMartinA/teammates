package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.List;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
public class FeedbackRubricQuestionDetails extends FeedbackQuestionDetails {
static final String QUESTION_TYPE_NAME = "Rubric question";

static final int RUBRIC_ANSWER_NOT_CHOSEN =  - 1;

static final int RUBRIC_MIN_NUM_OF_CHOICES = 2;

static final String RUBRIC_ERROR_NOT_ENOUGH_CHOICES = "Too little choices for " + QUESTION_TYPE_NAME + ". Minimum number of options is: ";

static final int RUBRIC_MIN_NUM_OF_SUB_QUESTIONS = 1;

static final String RUBRIC_ERROR_NOT_ENOUGH_SUB_QUESTIONS = "Too little sub-questions for " + QUESTION_TYPE_NAME + ". " + "Minimum number of sub-questions is: ";

static final String RUBRIC_ERROR_DESC_INVALID_SIZE = "Invalid number of descriptions for " + QUESTION_TYPE_NAME;

static final String RUBRIC_ERROR_EMPTY_SUB_QUESTION = "Sub-questions for " + QUESTION_TYPE_NAME + " cannot be empty.";

static final String RUBRIC_ERROR_INVALID_WEIGHT = "The weights for the choices of each sub-question of a " + QUESTION_TYPE_NAME + " must be valid numbers with precision up to 2 decimal places.";

static final String RUBRIC_EMPTY_ANSWER = "Empty answer.";

static final String RUBRIC_INVALID_ANSWER = "The answer for the rubric question is not valid.";

private boolean hasAssignedWeights;

private List<List<Double>> rubricWeightsForEachCell;

private List<String> rubricChoices;

private List<String> rubricSubQuestions;

private List<List<String>> rubricDescriptions;

public  FeedbackRubricQuestionDetails(){
this(null);
}
public  FeedbackRubricQuestionDetails(String questionText){
super(FeedbackQuestionType.RUBRIC, questionText);
this.hasAssignedWeights = false;
this.rubricChoices = new  ArrayList<>();
this.rubricSubQuestions = new  ArrayList<>();
this.rubricDescriptions = new  ArrayList<>();
this.rubricWeightsForEachCell = new  ArrayList<>();
}
private  boolean isValidDescriptionSize() {
if (rubricDescriptions.size() != rubricSubQuestions.size())
{
return false;
}
for (List<String> rubricDescription : rubricDescriptions)
{
if (rubricDescription.size() != rubricChoices.size())
{
return false;
}
}
return true;
}

private  boolean isValidWeightSize() {
if (rubricWeightsForEachCell.size() != rubricSubQuestions.size())
{
return false;
}
return rubricWeightsForEachCell.stream().allMatch(x -> x.size() == rubricChoices.size());
}

@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_stkhsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_stlv0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackRubricQuestionDetails newRubricDetails = (FeedbackRubricQuestionDetails) newDetails;
if (!this.rubricChoices.equals(newRubricDetails.rubricChoices))
{
return true;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136814950004087771777607618 = this.rubricSubQuestions.size() != newRubricDetails.rubricSubQuestions.size() || !this.rubricSubQuestions.containsAll(newRubricDetails.rubricSubQuestions) || !newRubricDetails.rubricSubQuestions.containsAll(this.rubricSubQuestions);
threadMonitoringController.exitInternalAction("_stlv0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136814950004087771777607618;
}
finally {
threadMonitoringController.exitService("_stkhsLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_stqoULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_str2cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (!isValidDescriptionSize())
{
errors.add(RUBRIC_ERROR_DESC_INVALID_SIZE);
}
if (rubricChoices.size() < RUBRIC_MIN_NUM_OF_CHOICES)
{
errors.add(RUBRIC_ERROR_NOT_ENOUGH_CHOICES + RUBRIC_MIN_NUM_OF_CHOICES);
}
if (this.rubricSubQuestions.size() < RUBRIC_MIN_NUM_OF_SUB_QUESTIONS)
{
errors.add(RUBRIC_ERROR_NOT_ENOUGH_SUB_QUESTIONS + RUBRIC_MIN_NUM_OF_SUB_QUESTIONS);
}
for (String subQn : rubricSubQuestions)
{
if (subQn.trim().isEmpty())
{
errors.add(RUBRIC_ERROR_EMPTY_SUB_QUESTION);
break;
}
}
if (hasAssignedWeights && !isValidWeightSize())
{
errors.add(RUBRIC_ERROR_INVALID_WEIGHT);
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681497008126524396301648 = errors;
threadMonitoringController.exitInternalAction("_str2cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681497008126524396301648;
}
finally {
threadMonitoringController.exitService("_stqoULngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_stwH4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_stx9ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
for (FeedbackResponseDetails response : responses)
{
FeedbackRubricResponseDetails details = (FeedbackRubricResponseDetails) response;
if (details.getAnswer().isEmpty())
{
errors.add(RUBRIC_EMPTY_ANSWER);
}
if (details.getAnswer().size() != rubricSubQuestions.size())
{
errors.add(RUBRIC_INVALID_ANSWER);
}
if (details.getAnswer().stream().anyMatch(choice -> choice == null || choice != RUBRIC_ANSWER_NOT_CHOSEN && (choice < 0 || choice >= rubricChoices.size())))
{
errors.add(RUBRIC_INVALID_ANSWER);
}
if (details.getAnswer().stream().allMatch(choice -> choice == RUBRIC_ANSWER_NOT_CHOSEN))
{
errors.add(RUBRIC_INVALID_ANSWER);
}
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681500005086958267567265 = errors;
threadMonitoringController.exitInternalAction("_stx9ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681500005086958267567265;
}
finally {
threadMonitoringController.exitService("_stwH4LngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_st1ncLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_st21kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681502007917754408679899 = false;
threadMonitoringController.exitInternalAction("_st21kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681502007917754408679899;
}
finally {
threadMonitoringController.exitService("_st1ncLngEeyIw-dB1KCaVA");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_st5R0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_st6f8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136815060029634305689120355 = "";
threadMonitoringController.exitInternalAction("_st6f8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136815060029634305689120355;
}
finally {
threadMonitoringController.exitService("_st5R0LngEeyIw-dB1KCaVA");
}
}

public  List<List<Double>> getRubricWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_st9jQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_st-xYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasAssignedWeights)
{
return rubricWeightsForEachCell;
}
List<List<Double>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136815090022628085185738556 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_st-xYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136815090022628085185738556;
}
finally {
threadMonitoringController.exitService("_st9jQLngEeyIw-dB1KCaVA");
}
}

public  boolean isHasAssignedWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_suAmkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suB0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368151200009150979758111855 = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_suB0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368151200009150979758111855;
}
finally {
threadMonitoringController.exitService("_suAmkLngEeyIw-dB1KCaVA");
}
}

public  void setHasAssignedWeights(boolean hasAssignedWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hasAssignedWeights", hasAssignedWeights);
threadMonitoringController.enterService("_suDp4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suFfELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.hasAssignedWeights = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_suFfELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_suDp4LngEeyIw-dB1KCaVA");
}
}

public  List<List<Double>> getRubricWeightsForEachCell() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_suH7ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suJwgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<List<Double>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681518003261478606104252 = rubricWeightsForEachCell;
threadMonitoringController.exitInternalAction("_suJwgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681518003261478606104252;
}
finally {
threadMonitoringController.exitService("_suH7ULngEeyIw-dB1KCaVA");
}
}

public  void setRubricWeightsForEachCell(List<List<Double>> rubricWeightsForEachCell) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rubricWeightsForEachCell", rubricWeightsForEachCell);
threadMonitoringController.enterService("_suMMwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suOB8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.rubricWeightsForEachCell = rubricWeightsForEachCell;
threadMonitoringController.exitInternalAction("_suOB8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_suMMwLngEeyIw-dB1KCaVA");
}
}

public  int getNumOfRubricChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_suQeMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suSTYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681527005557845027550505 = rubricChoices.size();
threadMonitoringController.exitInternalAction("_suSTYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681527005557845027550505;
}
finally {
threadMonitoringController.exitService("_suQeMLngEeyIw-dB1KCaVA");
}
}

public  List<String> getRubricChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_suUvoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suWk0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681531009485494807479504 = rubricChoices;
threadMonitoringController.exitInternalAction("_suWk0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681531009485494807479504;
}
finally {
threadMonitoringController.exitService("_suUvoLngEeyIw-dB1KCaVA");
}
}

public  void setRubricChoices(List<String> rubricChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rubricChoices", rubricChoices);
threadMonitoringController.enterService("_suYaALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suZoILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.rubricChoices = rubricChoices;
threadMonitoringController.exitInternalAction("_suZoILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_suYaALngEeyIw-dB1KCaVA");
}
}

public  int getNumOfRubricSubQuestions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sucEYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sud5kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681537002779695554604702 = rubricSubQuestions.size();
threadMonitoringController.exitInternalAction("_sud5kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681537002779695554604702;
}
finally {
threadMonitoringController.exitService("_sucEYLngEeyIw-dB1KCaVA");
}
}

public  List<String> getRubricSubQuestions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sugV0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suhj8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368154400953329684521975 = rubricSubQuestions;
threadMonitoringController.exitInternalAction("_suhj8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368154400953329684521975;
}
finally {
threadMonitoringController.exitService("_sugV0LngEeyIw-dB1KCaVA");
}
}

public  void setRubricSubQuestions(List<String> rubricSubQuestions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rubricSubQuestions", rubricSubQuestions);
threadMonitoringController.enterService("_sukAMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sul1YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.rubricSubQuestions = rubricSubQuestions;
threadMonitoringController.exitInternalAction("_sul1YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sukAMLngEeyIw-dB1KCaVA");
}
}

public  List<List<String>> getRubricDescriptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_suoRoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_suqG0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<List<String>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368155100537365992964439 = rubricDescriptions;
threadMonitoringController.exitInternalAction("_suqG0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368155100537365992964439;
}
finally {
threadMonitoringController.exitService("_suoRoLngEeyIw-dB1KCaVA");
}
}

public  void setRubricDescriptions(List<List<String>> rubricDescriptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rubricDescriptions", rubricDescriptions);
threadMonitoringController.enterService("_sur8ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sutKILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.rubricDescriptions = rubricDescriptions;
threadMonitoringController.exitInternalAction("_sutKILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sur8ALngEeyIw-dB1KCaVA");
}
}

}
