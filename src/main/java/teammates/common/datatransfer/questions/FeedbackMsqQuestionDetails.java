package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.List;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.util.Const;
public class FeedbackMsqQuestionDetails extends FeedbackQuestionDetails {
static final String QUESTION_TYPE_NAME = "Multiple-choice (multiple answers) question";

static final int MSQ_MIN_NUM_OF_CHOICES = 2;

static final String MSQ_ERROR_EMPTY_MSQ_OPTION = "The MSQ options cannot be empty";

static final String MSQ_ERROR_OTHER_CONTENT_NOT_PROVIDED = "No text provided for other option";

static final String MSQ_ERROR_NONE_OF_THE_ABOVE_ANSWER = "No other choices are allowed with \"None of the above\" option";

static final String MSQ_ERROR_NOT_ENOUGH_CHOICES = "Too little choices for " + QUESTION_TYPE_NAME + ". Minimum number of options is: ";

static final String MSQ_ERROR_INVALID_OPTION = " is not a valid option for the " + QUESTION_TYPE_NAME + ".";

static final String MSQ_ERROR_MAX_SELECTABLE_EXCEEDED_TOTAL = "Maximum selectable choices exceeds the total number of options for " + QUESTION_TYPE_NAME;

static final String MSQ_ERROR_NUM_SELECTED_MORE_THAN_MAXIMUM = "Number of choices selected is more than the maximum number ";

static final String MSQ_ERROR_MIN_SELECTABLE_MORE_THAN_NUM_CHOICES = "Minimum selectable choices exceeds number of options ";

static final String MSQ_ERROR_NUM_SELECTED_LESS_THAN_MINIMUM = "Number of choices selected is less than the minimum number ";

static final String MSQ_ERROR_MIN_SELECTABLE_EXCEEDED_MAX_SELECTABLE = "Minimum selectable choices exceeds maximum selectable choices for " + QUESTION_TYPE_NAME;

static final String MSQ_ERROR_MIN_FOR_MAX_SELECTABLE_CHOICES = "Maximum selectable choices for " + QUESTION_TYPE_NAME + " must be at least 2.";

static final String MSQ_ERROR_MIN_FOR_MIN_SELECTABLE_CHOICES = "Minimum selectable choices for " + QUESTION_TYPE_NAME + " must be at least 1.";

static final String MSQ_ERROR_INVALID_WEIGHT = "The weights for the choices of a " + QUESTION_TYPE_NAME + " must be valid numbers with precision up to 2 decimal places.";

static final String MSQ_ANSWER_NONE_OF_THE_ABOVE = "";

static final String MSQ_ERROR_DUPLICATE_MSQ_OPTION = "The MSQ options cannot be duplicate";

private List<String> msqChoices;

private boolean otherEnabled;

private boolean hasAssignedWeights;

private List<Double> msqWeights;

private double msqOtherWeight;

private FeedbackParticipantType generateOptionsFor;

private int maxSelectableChoices;

private int minSelectableChoices;

public  FeedbackMsqQuestionDetails(){
this(null);
}
public  FeedbackMsqQuestionDetails(String questionText){
super(FeedbackQuestionType.MSQ, questionText);
this.msqChoices = new  ArrayList<>();
this.otherEnabled = false;
this.generateOptionsFor = FeedbackParticipantType.NONE;
this.maxSelectableChoices = Const.POINTS_NO_VALUE;
this.minSelectableChoices = Const.POINTS_NO_VALUE;
this.hasAssignedWeights = false;
this.msqWeights = new  ArrayList<>();
this.msqOtherWeight = 0;
}
@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_bB1yILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bB3AQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackMsqQuestionDetails newMsqDetails = (FeedbackMsqQuestionDetails) newDetails;
if (this.msqChoices.size() != newMsqDetails.msqChoices.size() || !this.msqChoices.containsAll(newMsqDetails.msqChoices) || !newMsqDetails.msqChoices.containsAll(this.msqChoices))
{
return true;
}
if (this.generateOptionsFor != newMsqDetails.generateOptionsFor)
{
return true;
}
if (this.maxSelectableChoices == Const.POINTS_NO_VALUE && newMsqDetails.maxSelectableChoices != Const.POINTS_NO_VALUE)
{
return true;
}
if (this.minSelectableChoices == Const.POINTS_NO_VALUE && newMsqDetails.minSelectableChoices != Const.POINTS_NO_VALUE)
{
return true;
}
if (this.minSelectableChoices != Const.POINTS_NO_VALUE && newMsqDetails.minSelectableChoices != Const.POINTS_NO_VALUE && this.minSelectableChoices < newMsqDetails.minSelectableChoices)
{
return true;
}
if (this.maxSelectableChoices != Const.POINTS_NO_VALUE && newMsqDetails.maxSelectableChoices != Const.POINTS_NO_VALUE && this.maxSelectableChoices > newMsqDetails.maxSelectableChoices)
{
return true;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020752003345804047092259 = this.otherEnabled != newMsqDetails.otherEnabled;
threadMonitoringController.exitInternalAction("_bB3AQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020752003345804047092259;
}
finally {
threadMonitoringController.exitService("_bB1yILvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bB5cgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bB7RsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (generateOptionsFor == FeedbackParticipantType.NONE)
{
if (msqChoices.size() < MSQ_MIN_NUM_OF_CHOICES)
{
errors.add(MSQ_ERROR_NOT_ENOUGH_CHOICES + MSQ_MIN_NUM_OF_CHOICES + ".");
}
boolean isEmptyMsqOptionEntered = msqChoices.stream().anyMatch(msqText -> "".equals(msqText.trim()));
if (isEmptyMsqOptionEntered)
{
errors.add(MSQ_ERROR_EMPTY_MSQ_OPTION);
}
if (hasAssignedWeights && msqChoices.size() != msqWeights.size())
{
errors.add(MSQ_ERROR_INVALID_WEIGHT);
}
if (!hasAssignedWeights && (!msqWeights.isEmpty() || msqOtherWeight != 0))
{
errors.add(MSQ_ERROR_INVALID_WEIGHT);
}
if (hasAssignedWeights && !otherEnabled && msqOtherWeight != 0)
{
errors.add(MSQ_ERROR_INVALID_WEIGHT);
}
if (hasAssignedWeights && !msqWeights.isEmpty())
{
msqWeights.stream().filter(weight -> weight < 0).forEach(weight -> errors.add(MSQ_ERROR_INVALID_WEIGHT));
}
if (hasAssignedWeights && otherEnabled && msqOtherWeight < 0)
{
errors.add(MSQ_ERROR_INVALID_WEIGHT);
}
boolean isDuplicateOptionsEntered = msqChoices.stream().map(String::trim).distinct().count() != msqChoices.size();
if (isDuplicateOptionsEntered)
{
errors.add(MSQ_ERROR_DUPLICATE_MSQ_OPTION);
}
}
boolean isMaxSelectableChoicesEnabled = maxSelectableChoices != Const.POINTS_NO_VALUE;
boolean isMinSelectableChoicesEnabled = minSelectableChoices != Const.POINTS_NO_VALUE;
boolean isMsqChoiceValidatable = generateOptionsFor == FeedbackParticipantType.NONE;
int numOfMsqChoices = msqChoices.size() + (otherEnabled ? 1 : 0);
if (isMsqChoiceValidatable && isMaxSelectableChoicesEnabled)
{
if (numOfMsqChoices < maxSelectableChoices)
{
errors.add(MSQ_ERROR_MAX_SELECTABLE_EXCEEDED_TOTAL);
}
else
if (maxSelectableChoices < 2)
{
errors.add(MSQ_ERROR_MIN_FOR_MAX_SELECTABLE_CHOICES);
}
}
if (isMsqChoiceValidatable && isMinSelectableChoicesEnabled)
{
if (minSelectableChoices < 1)
{
errors.add(MSQ_ERROR_MIN_FOR_MIN_SELECTABLE_CHOICES);
}
if (minSelectableChoices > numOfMsqChoices)
{
errors.add(MSQ_ERROR_MIN_SELECTABLE_MORE_THAN_NUM_CHOICES);
}
}
if (isMaxSelectableChoicesEnabled && isMinSelectableChoicesEnabled && minSelectableChoices > maxSelectableChoices)
{
errors.add(MSQ_ERROR_MIN_SELECTABLE_EXCEEDED_MAX_SELECTABLE);
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302076400657416000288657 = errors;
threadMonitoringController.exitInternalAction("_bB7RsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302076400657416000288657;
}
finally {
threadMonitoringController.exitService("_bB5cgLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_bCIGALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bCKiQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
for (FeedbackResponseDetails response : responses)
{
FeedbackMsqResponseDetails details = (FeedbackMsqResponseDetails) response;
int totalChoicesSelected = details.getAnswers().size();
boolean isMaxSelectableEnabled = maxSelectableChoices != Const.POINTS_NO_VALUE;
boolean isMinSelectableEnabled = minSelectableChoices != Const.POINTS_NO_VALUE;
boolean isNoneOfTheAboveOptionEnabled = details.getAnswers().contains(MSQ_ANSWER_NONE_OF_THE_ABOVE);
if (details.isOther() && !otherEnabled)
{
errors.add(MSQ_ERROR_INVALID_OPTION);
}
if (otherEnabled && !details.isOther() && !details.getOtherFieldContent().isEmpty())
{
errors.add(MSQ_ERROR_INVALID_OPTION);
}
List<String> validChoices = new  ArrayList<>(msqChoices);
if (otherEnabled && details.isOther())
{
validChoices.add(details.getOtherFieldContent());
}
boolean isAnswersPartOfChoices = validChoices.containsAll(details.getAnswers());
if (!isAnswersPartOfChoices && !isNoneOfTheAboveOptionEnabled)
{
errors.add(details.getAnswerString() + " " + MSQ_ERROR_INVALID_OPTION);
}
if (details.isOther() && "".equals(details.getOtherFieldContent().trim()))
{
errors.add(MSQ_ERROR_OTHER_CONTENT_NOT_PROVIDED);
}
if (details.isOther() && !details.getAnswers().contains(details.getOtherFieldContent()))
{
errors.add(MSQ_ERROR_OTHER_CONTENT_NOT_PROVIDED);
}
if (isMaxSelectableEnabled && totalChoicesSelected > maxSelectableChoices)
{
errors.add(MSQ_ERROR_NUM_SELECTED_MORE_THAN_MAXIMUM + maxSelectableChoices);
}
if (isMinSelectableEnabled)
{
if (totalChoicesSelected < minSelectableChoices)
{
errors.add(MSQ_ERROR_NUM_SELECTED_LESS_THAN_MINIMUM + minSelectableChoices);
}
if (isNoneOfTheAboveOptionEnabled)
{
errors.add(MSQ_ERROR_INVALID_OPTION);
}
}
else
{
if ((details.getAnswers().size() > 1 || details.isOther()) && isNoneOfTheAboveOptionEnabled)
{
errors.add(MSQ_ERROR_NONE_OF_THE_ABOVE_ANSWER);
}
}
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020776002856577000013001 = errors;
threadMonitoringController.exitInternalAction("_bCKiQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020776002856577000013001;
}
finally {
threadMonitoringController.exitService("_bCIGALvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bCXWkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bCYksLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020789004440575109204248 = true;
threadMonitoringController.exitInternalAction("_bCYksLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020789004440575109204248;
}
finally {
threadMonitoringController.exitService("_bCXWkLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_bCaZ4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bCboALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020799006745269878634539 = "";
threadMonitoringController.exitInternalAction("_bCboALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020799006745269878634539;
}
finally {
threadMonitoringController.exitService("_bCaZ4LvVEeyr6avTgCRLkQ");
}
}

public  List<String> getMsqChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bCeEQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bCfSYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130208080005856814525828036 = msqChoices;
threadMonitoringController.exitInternalAction("_bCfSYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130208080005856814525828036;
}
finally {
threadMonitoringController.exitService("_bCeEQLvVEeyr6avTgCRLkQ");
}
}

public  void setMsqChoices(List<String> msqChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("msqChoices", msqChoices);
threadMonitoringController.enterService("_bCkK4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bCmnILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.msqChoices = msqChoices;
threadMonitoringController.exitInternalAction("_bCmnILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bCkK4LvVEeyr6avTgCRLkQ");
}
}

public  boolean isOtherEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bCpqcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bCq4kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130208310042702024274454464 = otherEnabled;
threadMonitoringController.exitInternalAction("_bCq4kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130208310042702024274454464;
}
finally {
threadMonitoringController.exitService("_bCpqcLvVEeyr6avTgCRLkQ");
}
}

public  void setOtherEnabled(boolean otherEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("otherEnabled", otherEnabled);
threadMonitoringController.enterService("_bCtU0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bCui8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.otherEnabled = otherEnabled;
threadMonitoringController.exitInternalAction("_bCui8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bCtU0LvVEeyr6avTgCRLkQ");
}
}

public  boolean isHasAssignedWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bCw_MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bCy0YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130208520019320844183077523 = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_bCy0YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130208520019320844183077523;
}
finally {
threadMonitoringController.exitService("_bCw_MLvVEeyr6avTgCRLkQ");
}
}

public  void setHasAssignedWeights(boolean hasAssignedWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hasAssignedWeights", hasAssignedWeights);
threadMonitoringController.enterService("_bC13sLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bC3F0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.hasAssignedWeights = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_bC3F0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bC13sLvVEeyr6avTgCRLkQ");
}
}

public  List<Double> getMsqWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bC5iELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bC6wMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Double> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130208740016353965866142184 = msqWeights;
threadMonitoringController.exitInternalAction("_bC6wMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130208740016353965866142184;
}
finally {
threadMonitoringController.exitService("_bC5iELvVEeyr6avTgCRLkQ");
}
}

public  void setMsqWeights(List<Double> msqWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("msqWeights", msqWeights);
threadMonitoringController.enterService("_bC8lYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bC9zgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.msqWeights = msqWeights;
threadMonitoringController.exitInternalAction("_bC9zgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bC8lYLvVEeyr6avTgCRLkQ");
}
}

public  double getMsqOtherWeight() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bDAPwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bDBd4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
double longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020894001326500710035936 = msqOtherWeight;
threadMonitoringController.exitInternalAction("_bDBd4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020894001326500710035936;
}
finally {
threadMonitoringController.exitService("_bDAPwLvVEeyr6avTgCRLkQ");
}
}

public  void setMsqOtherWeight(double msqOtherWeight) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("msqOtherWeight", msqOtherWeight);
threadMonitoringController.enterService("_bDEhMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bDFvULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.msqOtherWeight = msqOtherWeight;
threadMonitoringController.exitInternalAction("_bDFvULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bDEhMLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackParticipantType getGenerateOptionsFor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bDILkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bDJZsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130209170031834606645794505 = generateOptionsFor;
threadMonitoringController.exitInternalAction("_bDJZsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130209170031834606645794505;
}
finally {
threadMonitoringController.exitService("_bDILkLvVEeyr6avTgCRLkQ");
}
}

public  void setGenerateOptionsFor(FeedbackParticipantType generateOptionsFor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("generateOptionsFor", generateOptionsFor);
threadMonitoringController.enterService("_bDLO4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bDMdALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.generateOptionsFor = generateOptionsFor;
threadMonitoringController.exitInternalAction("_bDMdALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bDLO4LvVEeyr6avTgCRLkQ");
}
}

public  int getMaxSelectableChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bDO5QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bDQHYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020943005698318610553157 = maxSelectableChoices;
threadMonitoringController.exitInternalAction("_bDQHYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020943005698318610553157;
}
finally {
threadMonitoringController.exitService("_bDO5QLvVEeyr6avTgCRLkQ");
}
}

public  void setMaxSelectableChoices(int maxSelectableChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("maxSelectableChoices", maxSelectableChoices);
threadMonitoringController.enterService("_bDSjoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bDTxwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.maxSelectableChoices = maxSelectableChoices;
threadMonitoringController.exitInternalAction("_bDTxwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bDSjoLvVEeyr6avTgCRLkQ");
}
}

public  int getMinSelectableChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bDWOALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bDXcILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130209640016784778885639906 = minSelectableChoices;
threadMonitoringController.exitInternalAction("_bDXcILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130209640016784778885639906;
}
finally {
threadMonitoringController.exitService("_bDWOALvVEeyr6avTgCRLkQ");
}
}

public  void setMinSelectableChoices(int minSelectableChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("minSelectableChoices", minSelectableChoices);
threadMonitoringController.enterService("_bDZ4YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bDbGgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.minSelectableChoices = minSelectableChoices;
threadMonitoringController.exitInternalAction("_bDbGgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bDZ4YLvVEeyr6avTgCRLkQ");
}
}

}
