package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.List;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
public class FeedbackMcqQuestionDetails extends FeedbackQuestionDetails {
static final String QUESTION_TYPE_NAME = "Multiple-choice (single answer) question";

static final int MCQ_MIN_NUM_OF_CHOICES = 2;

static final String MCQ_ERROR_NOT_ENOUGH_CHOICES = "Too little choices for " + QUESTION_TYPE_NAME + ". Minimum number of options is: ";

static final String MCQ_ERROR_INVALID_OPTION = " is not a valid option for the " + QUESTION_TYPE_NAME + ".";

static final String MCQ_ERROR_INVALID_WEIGHT = "The weights for the choices of a " + QUESTION_TYPE_NAME + " must be valid non-negative numbers with precision up to 2 decimal places.";

static final String MCQ_ERROR_EMPTY_MCQ_OPTION = "The MCQ options cannot be empty";

static final String MCQ_ERROR_OTHER_CONTENT_NOT_PROVIDED = "No text provided for other option";

static final String MCQ_ERROR_DUPLICATE_MCQ_OPTION = "The MCQ options cannot be duplicate";

private boolean hasAssignedWeights;

private List<Double> mcqWeights;

private double mcqOtherWeight;

private List<String> mcqChoices;

private boolean otherEnabled;

private FeedbackParticipantType generateOptionsFor;

public  FeedbackMcqQuestionDetails(){
this(null);
}
public  FeedbackMcqQuestionDetails(String questionText){
super(FeedbackQuestionType.MCQ, questionText);
this.hasAssignedWeights = false;
this.mcqWeights = new  ArrayList<>();
this.mcqChoices = new  ArrayList<>();
this.otherEnabled = false;
this.mcqOtherWeight = 0;
this.generateOptionsFor = FeedbackParticipantType.NONE;
}
@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_a-fjMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a-gxULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackMcqQuestionDetails newMcqDetails = (FeedbackMcqQuestionDetails) newDetails;
if (this.mcqChoices.size() != newMcqDetails.mcqChoices.size() || !this.mcqChoices.containsAll(newMcqDetails.mcqChoices) || !newMcqDetails.mcqChoices.containsAll(this.mcqChoices))
{
return true;
}
if (this.generateOptionsFor != newMcqDetails.generateOptionsFor)
{
return true;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130204670005174253819630781 = this.otherEnabled != newMcqDetails.otherEnabled;
threadMonitoringController.exitInternalAction("_a-gxULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130204670005174253819630781;
}
finally {
threadMonitoringController.exitService("_a-fjMLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a-jNkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a-kbsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (generateOptionsFor == FeedbackParticipantType.NONE)
{
if (mcqChoices.size() < MCQ_MIN_NUM_OF_CHOICES)
{
errors.add(MCQ_ERROR_NOT_ENOUGH_CHOICES + MCQ_MIN_NUM_OF_CHOICES + ".");
}
boolean isEmptyMcqOptionEntered = mcqChoices.stream().anyMatch(mcqText -> "".equals(mcqText.trim()));
if (isEmptyMcqOptionEntered)
{
errors.add(MCQ_ERROR_EMPTY_MCQ_OPTION);
}
if (hasAssignedWeights && mcqChoices.size() != mcqWeights.size())
{
errors.add(MCQ_ERROR_INVALID_WEIGHT);
}
if (!hasAssignedWeights && (!mcqWeights.isEmpty() || mcqOtherWeight != 0))
{
errors.add(MCQ_ERROR_INVALID_WEIGHT);
}
if (hasAssignedWeights && !otherEnabled && mcqOtherWeight != 0)
{
errors.add(MCQ_ERROR_INVALID_WEIGHT);
}
if (hasAssignedWeights && !mcqWeights.isEmpty())
{
mcqWeights.stream().filter(weight -> weight < 0).forEach(weight -> errors.add(MCQ_ERROR_INVALID_WEIGHT));
}
if (hasAssignedWeights && otherEnabled && mcqOtherWeight < 0)
{
errors.add(MCQ_ERROR_INVALID_WEIGHT);
}
boolean isDuplicateOptionsEntered = mcqChoices.stream().map(String::trim).distinct().count() != mcqChoices.size();
if (isDuplicateOptionsEntered)
{
errors.add(MCQ_ERROR_DUPLICATE_MCQ_OPTION);
}
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020477008400887055938633 = errors;
threadMonitoringController.exitInternalAction("_a-kbsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020477008400887055938633;
}
finally {
threadMonitoringController.exitService("_a-jNkLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_a-x3ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a-0TULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
for (FeedbackResponseDetails response : responses)
{
FeedbackMcqResponseDetails details = (FeedbackMcqResponseDetails) response;
if (!details.isOther() && !mcqChoices.contains(details.getAnswerString()))
{
errors.add(details.getAnswerString() + " " + MCQ_ERROR_INVALID_OPTION);
}
if (details.isOther() && "".equals(details.getAnswerString().trim()))
{
errors.add(MCQ_ERROR_OTHER_CONTENT_NOT_PROVIDED);
}
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020491005607221785448178 = errors;
threadMonitoringController.exitInternalAction("_a-0TULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020491005607221785448178;
}
finally {
threadMonitoringController.exitService("_a-x3ELvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a-82MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a-_ScLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130205000034074008566352243 = true;
threadMonitoringController.exitInternalAction("_a-_ScLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130205000034074008566352243;
}
finally {
threadMonitoringController.exitService("_a-82MLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_a_CVwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_EK8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020510006252440409155502 = "";
threadMonitoringController.exitInternalAction("_a_EK8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020510006252440409155502;
}
finally {
threadMonitoringController.exitService("_a_CVwLvVEeyr6avTgCRLkQ");
}
}

public  boolean isHasAssignedWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a_GnMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_IcYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020524004212092007368061 = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_a_IcYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020524004212092007368061;
}
finally {
threadMonitoringController.exitService("_a_GnMLvVEeyr6avTgCRLkQ");
}
}

public  void setHasAssignedWeights(boolean hasAssignedWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hasAssignedWeights", hasAssignedWeights);
threadMonitoringController.enterService("_a_LfsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_NU4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.hasAssignedWeights = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_a_NU4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a_LfsLvVEeyr6avTgCRLkQ");
}
}

public  List<Double> getMcqWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a_PxILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_RmULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Double> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130205440027258838262965657 = mcqWeights;
threadMonitoringController.exitInternalAction("_a_RmULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130205440027258838262965657;
}
finally {
threadMonitoringController.exitService("_a_PxILvVEeyr6avTgCRLkQ");
}
}

public  void setMcqWeights(List<Double> mcqWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("mcqWeights", mcqWeights);
threadMonitoringController.enterService("_a_UpoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_We0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.mcqWeights = mcqWeights;
threadMonitoringController.exitInternalAction("_a_We0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a_UpoLvVEeyr6avTgCRLkQ");
}
}

public  double getMcqOtherWeight() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a_ZiILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_bXULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
double longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302056800216366768898533 = mcqOtherWeight;
threadMonitoringController.exitInternalAction("_a_bXULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302056800216366768898533;
}
finally {
threadMonitoringController.exitService("_a_ZiILvVEeyr6avTgCRLkQ");
}
}

public  void setMcqOtherWeight(double mcqOtherWeight) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("mcqOtherWeight", mcqOtherWeight);
threadMonitoringController.enterService("_a_dzkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_hd8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.mcqOtherWeight = mcqOtherWeight;
threadMonitoringController.exitInternalAction("_a_hd8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a_dzkLvVEeyr6avTgCRLkQ");
}
}

public  int getNumOfMcqChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a_khQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_lvYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020593008951706755416243 = mcqChoices.size();
threadMonitoringController.exitInternalAction("_a_lvYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020593008951706755416243;
}
finally {
threadMonitoringController.exitService("_a_khQLvVEeyr6avTgCRLkQ");
}
}

public  List<String> getMcqChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a_oLoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_qA0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020604005875079581674278 = mcqChoices;
threadMonitoringController.exitInternalAction("_a_qA0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020604005875079581674278;
}
finally {
threadMonitoringController.exitService("_a_oLoLvVEeyr6avTgCRLkQ");
}
}

public  void setMcqChoices(List<String> mcqChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("mcqChoices", mcqChoices);
threadMonitoringController.enterService("_a_sdELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_trMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.mcqChoices = mcqChoices;
threadMonitoringController.exitInternalAction("_a_trMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a_sdELvVEeyr6avTgCRLkQ");
}
}

public  boolean isOtherEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a_wHcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_xVkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302062800047801874827209656 = otherEnabled;
threadMonitoringController.exitInternalAction("_a_xVkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302062800047801874827209656;
}
finally {
threadMonitoringController.exitService("_a_wHcLvVEeyr6avTgCRLkQ");
}
}

public  void setOtherEnabled(boolean otherEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("otherEnabled", otherEnabled);
threadMonitoringController.enterService("_a_zx0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_2OELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.otherEnabled = otherEnabled;
threadMonitoringController.exitInternalAction("_a_2OELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a_zx0LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackParticipantType getGenerateOptionsFor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a_4qULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a_54cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020651009828440536820383 = generateOptionsFor;
threadMonitoringController.exitInternalAction("_a_54cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020651009828440536820383;
}
finally {
threadMonitoringController.exitService("_a_4qULvVEeyr6avTgCRLkQ");
}
}

public  void setGenerateOptionsFor(FeedbackParticipantType generateOptionsFor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("generateOptionsFor", generateOptionsFor);
threadMonitoringController.enterService("_a_8UsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a___ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.generateOptionsFor = generateOptionsFor;
threadMonitoringController.exitInternalAction("_a___ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a_8UsLvVEeyr6avTgCRLkQ");
}
}

}
