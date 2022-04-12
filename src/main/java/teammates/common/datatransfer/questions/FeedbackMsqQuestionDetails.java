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
threadMonitoringController.enterService("_sirgULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sitVgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136812600028976874158349963 = this.otherEnabled != newMsqDetails.otherEnabled;
threadMonitoringController.exitInternalAction("_sitVgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136812600028976874158349963;
}
finally {
threadMonitoringController.exitService("_sirgULngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sivxwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sixm8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136812640035659936918489865 = errors;
threadMonitoringController.exitInternalAction("_sixm8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136812640035659936918489865;
}
finally {
threadMonitoringController.exitService("_sivxwLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_si_pYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjA3gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136812670005465300558764852 = errors;
threadMonitoringController.exitInternalAction("_sjA3gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136812670005465300558764852;
}
finally {
threadMonitoringController.exitService("_si_pYLngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sjKBcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjKogLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681272006870161150704064 = true;
threadMonitoringController.exitInternalAction("_sjKogLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681272006870161150704064;
}
finally {
threadMonitoringController.exitService("_sjKBcLngEeyIw-dB1KCaVA");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_sjNEwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjNr0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681276005064944070043462 = "";
threadMonitoringController.exitInternalAction("_sjNr0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681276005064944070043462;
}
finally {
threadMonitoringController.exitService("_sjNEwLngEeyIw-dB1KCaVA");
}
}

public  List<String> getMsqChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sjQIELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjRWMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681279009749484792241981 = msqChoices;
threadMonitoringController.exitInternalAction("_sjRWMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681279009749484792241981;
}
finally {
threadMonitoringController.exitService("_sjQIELngEeyIw-dB1KCaVA");
}
}

public  void setMsqChoices(List<String> msqChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("msqChoices", msqChoices);
threadMonitoringController.enterService("_sjTLYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjUZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.msqChoices = msqChoices;
threadMonitoringController.exitInternalAction("_sjUZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sjTLYLngEeyIw-dB1KCaVA");
}
}

public  boolean isOtherEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sjWOsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjXc0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681284004845721662741045 = otherEnabled;
threadMonitoringController.exitInternalAction("_sjXc0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681284004845721662741045;
}
finally {
threadMonitoringController.exitService("_sjWOsLngEeyIw-dB1KCaVA");
}
}

public  void setOtherEnabled(boolean otherEnabled) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("otherEnabled", otherEnabled);
threadMonitoringController.enterService("_sjZSALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjagILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.otherEnabled = otherEnabled;
threadMonitoringController.exitInternalAction("_sjagILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sjZSALngEeyIw-dB1KCaVA");
}
}

public  boolean isHasAssignedWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sjcVULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjeKgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681290008424510402735653 = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_sjeKgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681290008424510402735653;
}
finally {
threadMonitoringController.exitService("_sjcVULngEeyIw-dB1KCaVA");
}
}

public  void setHasAssignedWeights(boolean hasAssignedWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("hasAssignedWeights", hasAssignedWeights);
threadMonitoringController.enterService("_sjf_sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjhN0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.hasAssignedWeights = hasAssignedWeights;
threadMonitoringController.exitInternalAction("_sjhN0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sjf_sLngEeyIw-dB1KCaVA");
}
}

public  List<Double> getMsqWeights() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sjjDALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjjqELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Double> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681295005769190493716011 = msqWeights;
threadMonitoringController.exitInternalAction("_sjjqELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681295005769190493716011;
}
finally {
threadMonitoringController.exitService("_sjjDALngEeyIw-dB1KCaVA");
}
}

public  void setMsqWeights(List<Double> msqWeights) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("msqWeights", msqWeights);
threadMonitoringController.enterService("_sjlfQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjn7gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.msqWeights = msqWeights;
threadMonitoringController.exitInternalAction("_sjn7gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sjlfQLngEeyIw-dB1KCaVA");
}
}

public  double getMsqOtherWeight() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sjqXwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjrl4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
double longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681299006077399161161198 = msqOtherWeight;
threadMonitoringController.exitInternalAction("_sjrl4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681299006077399161161198;
}
finally {
threadMonitoringController.exitService("_sjqXwLngEeyIw-dB1KCaVA");
}
}

public  void setMsqOtherWeight(double msqOtherWeight) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("msqOtherWeight", msqOtherWeight);
threadMonitoringController.enterService("_sjtbELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjupMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.msqOtherWeight = msqOtherWeight;
threadMonitoringController.exitInternalAction("_sjupMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sjtbELngEeyIw-dB1KCaVA");
}
}

public  FeedbackParticipantType getGenerateOptionsFor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sjweYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sjxsgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368130400713453750062004 = generateOptionsFor;
threadMonitoringController.exitInternalAction("_sjxsgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368130400713453750062004;
}
finally {
threadMonitoringController.exitService("_sjweYLngEeyIw-dB1KCaVA");
}
}

public  void setGenerateOptionsFor(FeedbackParticipantType generateOptionsFor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("generateOptionsFor", generateOptionsFor);
threadMonitoringController.enterService("_sj0IwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sj1W4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.generateOptionsFor = generateOptionsFor;
threadMonitoringController.exitInternalAction("_sj1W4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sj0IwLngEeyIw-dB1KCaVA");
}
}

public  int getMaxSelectableChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sj3MELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sj3zILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368130900676179407847863 = maxSelectableChoices;
threadMonitoringController.exitInternalAction("_sj3zILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368130900676179407847863;
}
finally {
threadMonitoringController.exitService("_sj3MELngEeyIw-dB1KCaVA");
}
}

public  void setMaxSelectableChoices(int maxSelectableChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("maxSelectableChoices", maxSelectableChoices);
threadMonitoringController.enterService("_sj5oULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sj7dgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.maxSelectableChoices = maxSelectableChoices;
threadMonitoringController.exitInternalAction("_sj7dgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sj5oULngEeyIw-dB1KCaVA");
}
}

public  int getMinSelectableChoices() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sj_u8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_skA9ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681314009486394242004733 = minSelectableChoices;
threadMonitoringController.exitInternalAction("_skA9ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681314009486394242004733;
}
finally {
threadMonitoringController.exitService("_sj_u8LngEeyIw-dB1KCaVA");
}
}

public  void setMinSelectableChoices(int minSelectableChoices) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("minSelectableChoices", minSelectableChoices);
threadMonitoringController.enterService("_skCyQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_skEAYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.minSelectableChoices = minSelectableChoices;
threadMonitoringController.exitInternalAction("_skEAYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_skCyQLngEeyIw-dB1KCaVA");
}
}

}
