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
threadMonitoringController.enterService("_sfrPoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sfsdwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackMcqQuestionDetails newMcqDetails = (FeedbackMcqQuestionDetails) newDetails;
if (this.mcqChoices.size() != newMcqDetails.mcqChoices.size() || !this.mcqChoices.containsAll(newMcqDetails.mcqChoices) || !newMcqDetails.mcqChoices.containsAll(this.mcqChoices))
{
return true;
}
if (this.generateOptionsFor != newMcqDetails.generateOptionsFor)
{
return true;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681182005744216707029359 = this.otherEnabled != newMcqDetails.otherEnabled;
threadMonitoringController.exitInternalAction("_sfsdwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681182005744216707029359;
}
finally {
threadMonitoringController.exitService("_sfrPoLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sfuS8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sfvhELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811850045929751542071795 = errors;
threadMonitoringController.exitInternalAction("_sfvhELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811850045929751542071795;
}
finally {
threadMonitoringController.exitService("_sfuS8LngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_sf5SELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sf8VYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681191007731989164529104 = errors;
threadMonitoringController.exitInternalAction("_sf8VYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681191007731989164529104;
}
finally {
threadMonitoringController.exitService("_sf5SELngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sgAm0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgB08LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681196007295967668554179 = true;
threadMonitoringController.exitInternalAction("_sgB08LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681196007295967668554179;
}
finally {
threadMonitoringController.exitService("_sgAm0LngEeyIw-dB1KCaVA");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_sgDqILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgE4QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811990033704599294670434 = "";
threadMonitoringController.exitInternalAction("_sgE4QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136811990033704599294670434;
}
finally {
threadMonitoringController.exitService("_sgDqILngEeyIw-dB1KCaVA");
}
}

public  boolean isHasAssignedWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sgGtcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgH7kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681201009650057607632302 = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_sgH7kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681201009650057607632302;
}
finally {
threadMonitoringController.exitService("_sgGtcLngEeyIw-dB1KCaVA");
}
}

public  void setHasAssignedWeights(boolean hasAssignedWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hasAssignedWeights", hasAssignedWeights);
threadMonitoringController.enterService("_sgJwwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgK-4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.hasAssignedWeights = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_sgK-4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sgJwwLngEeyIw-dB1KCaVA");
}
}

public  List<Double> getMcqWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sgNbILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgOpQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Double> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681207008547632641226051 = mcqWeights;
threadMonitoringController.exitInternalAction("_sgOpQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681207008547632641226051;
}
finally {
threadMonitoringController.exitService("_sgNbILngEeyIw-dB1KCaVA");
}
}

public  void setMcqWeights(List<Double> mcqWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("mcqWeights", mcqWeights);
threadMonitoringController.enterService("_sgRFgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgS6sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.mcqWeights = mcqWeights;
threadMonitoringController.exitInternalAction("_sgS6sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sgRFgLngEeyIw-dB1KCaVA");
}
}

public  double getMcqOtherWeight() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sgUv4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgV-ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
double longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681214008287789464131952 = mcqOtherWeight;
threadMonitoringController.exitInternalAction("_sgV-ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681214008287789464131952;
}
finally {
threadMonitoringController.exitService("_sgUv4LngEeyIw-dB1KCaVA");
}
}

public  void setMcqOtherWeight(double mcqOtherWeight) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("mcqOtherWeight", mcqOtherWeight);
threadMonitoringController.enterService("_sgYaQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgZoYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.mcqOtherWeight = mcqOtherWeight;
threadMonitoringController.exitInternalAction("_sgZoYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sgYaQLngEeyIw-dB1KCaVA");
}
}

public  int getNumOfMcqChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sgcEoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgeg4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681221007871527932573769 = mcqChoices.size();
threadMonitoringController.exitInternalAction("_sgeg4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681221007871527932573769;
}
finally {
threadMonitoringController.exitService("_sgcEoLngEeyIw-dB1KCaVA");
}
}

public  List<String> getMcqChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sggWELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgg9ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681224009647834795018443 = mcqChoices;
threadMonitoringController.exitInternalAction("_sgg9ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681224009647834795018443;
}
finally {
threadMonitoringController.exitService("_sggWELngEeyIw-dB1KCaVA");
}
}

public  void setMcqChoices(List<String> mcqChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("mcqChoices", mcqChoices);
threadMonitoringController.enterService("_sgiyULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgkAcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.mcqChoices = mcqChoices;
threadMonitoringController.exitInternalAction("_sgkAcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sgiyULngEeyIw-dB1KCaVA");
}
}

public  boolean isOtherEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sgmcsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgnq0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681229009525789871284255 = otherEnabled;
threadMonitoringController.exitInternalAction("_sgnq0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681229009525789871284255;
}
finally {
threadMonitoringController.exitService("_sgmcsLngEeyIw-dB1KCaVA");
}
}

public  void setOtherEnabled(boolean otherEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("otherEnabled", otherEnabled);
threadMonitoringController.enterService("_sgpgALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgquILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.otherEnabled = otherEnabled;
threadMonitoringController.exitInternalAction("_sgquILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sgpgALngEeyIw-dB1KCaVA");
}
}

public  FeedbackParticipantType getGenerateOptionsFor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sgsjULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgtKYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368123400959849342115028 = generateOptionsFor;
threadMonitoringController.exitInternalAction("_sgtKYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368123400959849342115028;
}
finally {
threadMonitoringController.exitService("_sgsjULngEeyIw-dB1KCaVA");
}
}

public  void setGenerateOptionsFor(FeedbackParticipantType generateOptionsFor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("generateOptionsFor", generateOptionsFor);
threadMonitoringController.enterService("_sgu_kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sgw0wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.generateOptionsFor = generateOptionsFor;
threadMonitoringController.exitInternalAction("_sgw0wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sgu_kLngEeyIw-dB1KCaVA");
}
}

}
