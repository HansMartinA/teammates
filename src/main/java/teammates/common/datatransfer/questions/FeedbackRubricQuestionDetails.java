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
threadMonitoringController.enterService("_bNrOsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bNtD4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackRubricQuestionDetails newRubricDetails = (FeedbackRubricQuestionDetails) newDetails;
if (!this.rubricChoices.equals(newRubricDetails.rubricChoices))
{
return true;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021636002220189845715047 = this.rubricSubQuestions.size() != newRubricDetails.rubricSubQuestions.size() || !this.rubricSubQuestions.containsAll(newRubricDetails.rubricSubQuestions) || !newRubricDetails.rubricSubQuestions.containsAll(this.rubricSubQuestions);
threadMonitoringController.exitInternalAction("_bNtD4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021636002220189845715047;
}
finally {
threadMonitoringController.exitService("_bNrOsLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bNxVULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bNyjcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021646009256232273219985 = errors;
threadMonitoringController.exitInternalAction("_bNyjcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021646009256232273219985;
}
finally {
threadMonitoringController.exitService("_bNxVULvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_bN4DALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bN54MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302166200924979582366723 = errors;
threadMonitoringController.exitInternalAction("_bN54MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302166200924979582366723;
}
finally {
threadMonitoringController.exitService("_bN4DALvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bN-JoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bN_XwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021674005110310854617474 = false;
threadMonitoringController.exitInternalAction("_bN_XwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021674005110310854617474;
}
finally {
threadMonitoringController.exitService("_bN-JoLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_bOB0ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bODpMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021686004010344629770134 = "";
threadMonitoringController.exitInternalAction("_bODpMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021686004010344629770134;
}
finally {
threadMonitoringController.exitService("_bOB0ALvVEeyr6avTgCRLkQ");
}
}

public  List<List<Double>> getRubricWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bOGFcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOH6oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasAssignedWeights)
{
return rubricWeightsForEachCell;
}
List<List<Double>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021696005833065646077046 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_bOH6oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021696005833065646077046;
}
finally {
threadMonitoringController.exitService("_bOGFcLvVEeyr6avTgCRLkQ");
}
}

public  boolean isHasAssignedWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bOKW4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOLlALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130217070028484058360493936 = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_bOLlALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130217070028484058360493936;
}
finally {
threadMonitoringController.exitService("_bOKW4LvVEeyr6avTgCRLkQ");
}
}

public  void setHasAssignedWeights(boolean hasAssignedWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hasAssignedWeights", hasAssignedWeights);
threadMonitoringController.enterService("_bOOBQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOPPYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.hasAssignedWeights = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_bOPPYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bOOBQLvVEeyr6avTgCRLkQ");
}
}

public  List<List<Double>> getRubricWeightsForEachCell() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bORroLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOTg0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<List<Double>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302172900673250268411244 = rubricWeightsForEachCell;
threadMonitoringController.exitInternalAction("_bOTg0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302172900673250268411244;
}
finally {
threadMonitoringController.exitService("_bORroLvVEeyr6avTgCRLkQ");
}
}

public  void setRubricWeightsForEachCell(List<List<Double>> rubricWeightsForEachCell) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rubricWeightsForEachCell", rubricWeightsForEachCell);
threadMonitoringController.enterService("_bOVWALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOWkILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.rubricWeightsForEachCell = rubricWeightsForEachCell;
threadMonitoringController.exitInternalAction("_bOWkILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bOVWALvVEeyr6avTgCRLkQ");
}
}

public  int getNumOfRubricChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bOZncLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOef8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130217510038819329825048876 = rubricChoices.size();
threadMonitoringController.exitInternalAction("_bOef8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130217510038819329825048876;
}
finally {
threadMonitoringController.exitService("_bOZncLvVEeyr6avTgCRLkQ");
}
}

public  List<String> getRubricChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bOg8MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOiKULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021761001321160456261642 = rubricChoices;
threadMonitoringController.exitInternalAction("_bOiKULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021761001321160456261642;
}
finally {
threadMonitoringController.exitService("_bOg8MLvVEeyr6avTgCRLkQ");
}
}

public  void setRubricChoices(List<String> rubricChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rubricChoices", rubricChoices);
threadMonitoringController.enterService("_bOkmkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOmbwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.rubricChoices = rubricChoices;
threadMonitoringController.exitInternalAction("_bOmbwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bOkmkLvVEeyr6avTgCRLkQ");
}
}

public  int getNumOfRubricSubQuestions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bOqtMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOtJcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130217830034641998459999435 = rubricSubQuestions.size();
threadMonitoringController.exitInternalAction("_bOtJcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130217830034641998459999435;
}
finally {
threadMonitoringController.exitService("_bOqtMLvVEeyr6avTgCRLkQ");
}
}

public  List<String> getRubricSubQuestions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bOvlsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bOwz0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302179300619801649383166 = rubricSubQuestions;
threadMonitoringController.exitInternalAction("_bOwz0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302179300619801649383166;
}
finally {
threadMonitoringController.exitService("_bOvlsLvVEeyr6avTgCRLkQ");
}
}

public  void setRubricSubQuestions(List<String> rubricSubQuestions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rubricSubQuestions", rubricSubQuestions);
threadMonitoringController.enterService("_bOzQELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bO0eMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.rubricSubQuestions = rubricSubQuestions;
threadMonitoringController.exitInternalAction("_bO0eMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bOzQELvVEeyr6avTgCRLkQ");
}
}

public  List<List<String>> getRubricDescriptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bO4IkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bO59wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<List<String>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021816008558286971622335 = rubricDescriptions;
threadMonitoringController.exitInternalAction("_bO59wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021816008558286971622335;
}
finally {
threadMonitoringController.exitService("_bO4IkLvVEeyr6avTgCRLkQ");
}
}

public  void setRubricDescriptions(List<List<String>> rubricDescriptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rubricDescriptions", rubricDescriptions);
threadMonitoringController.enterService("_bO9oILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bO_dULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.rubricDescriptions = rubricDescriptions;
threadMonitoringController.exitInternalAction("_bO_dULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bO9oILvVEeyr6avTgCRLkQ");
}
}

}
