package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.util.FieldValidator;
public class FeedbackConstantSumQuestionDetails extends FeedbackQuestionDetails {
static final String QUESTION_TYPE_NAME_OPTION = "Distribute points (among options) question";

static final String QUESTION_TYPE_NAME_RECIPIENT = "Distribute points (among recipients) question";

static final int CONST_SUM_MIN_NUM_OF_OPTIONS = 2;

static final int CONST_SUM_MIN_NUM_OF_POINTS = 1;

static final String CONST_SUM_ERROR_NOT_ENOUGH_OPTIONS = "Too little options for " + QUESTION_TYPE_NAME_OPTION + ". Minimum number of options is: ";

static final String CONST_SUM_ERROR_DUPLICATE_OPTIONS = "Duplicate options are not allowed.";

static final String CONST_SUM_ERROR_NOT_ENOUGH_POINTS = "Too little points for " + QUESTION_TYPE_NAME_RECIPIENT + ". Minimum number of points is: ";

static final String CONST_SUM_ERROR_MISMATCH = "Please distribute all the points for distribution questions. " + "To skip a distribution question, leave the boxes blank.";

static final String CONST_SUM_ERROR_NEGATIVE = "Points cannot be negative.";

static final String CONST_SUM_ERROR_UNIQUE = "Every option must be given a different number of points.";

static final String CONST_SUM_ERROR_SOME_UNIQUE = "At least some options must be given a different number of points.";

static final String CONST_SUM_ANSWER_OPTIONS_NOT_MATCH = "The answers are inconsistent with the options";

static final String CONST_SUM_ANSWER_RECIPIENT_NOT_MATCH = "The answer is inconsistent with the recipient";

private List<String> constSumOptions;

private boolean distributeToRecipients;

private boolean pointsPerOption;

private boolean forceUnevenDistribution;

private String distributePointsFor;

private int points;

public  FeedbackConstantSumQuestionDetails(){
this(null);
}
public  FeedbackConstantSumQuestionDetails(String questionText){
super(FeedbackQuestionType.CONSTSUM, questionText);
this.constSumOptions = new  ArrayList<>();
this.distributeToRecipients = false;
this.pointsPerOption = false;
this.points = 100;
this.forceUnevenDistribution = false;
this.distributePointsFor = FeedbackConstantSumDistributePointsType.NONE.getDisplayedOption();
}
@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_a2kWQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a2lkYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackConstantSumQuestionDetails newConstSumDetails = (FeedbackConstantSumQuestionDetails) newDetails;
if (!this.constSumOptions.containsAll(newConstSumDetails.constSumOptions) || !newConstSumDetails.constSumOptions.containsAll(this.constSumOptions))
{
return true;
}
if (this.distributeToRecipients != newConstSumDetails.distributeToRecipients)
{
return true;
}
if (this.points != newConstSumDetails.points)
{
return true;
}
if (this.pointsPerOption != newConstSumDetails.pointsPerOption)
{
return true;
}
if (this.forceUnevenDistribution != newConstSumDetails.forceUnevenDistribution)
{
return true;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020040009973038493442136 = !this.distributePointsFor.equals(newConstSumDetails.distributePointsFor);
threadMonitoringController.exitInternalAction("_a2lkYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020040009973038493442136;
}
finally {
threadMonitoringController.exitService("_a2kWQLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a2oAoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a2pOwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (!distributeToRecipients && constSumOptions.size() < CONST_SUM_MIN_NUM_OF_OPTIONS)
{
errors.add(CONST_SUM_ERROR_NOT_ENOUGH_OPTIONS + CONST_SUM_MIN_NUM_OF_OPTIONS + ".");
}
if (points < CONST_SUM_MIN_NUM_OF_POINTS)
{
errors.add(CONST_SUM_ERROR_NOT_ENOUGH_POINTS + CONST_SUM_MIN_NUM_OF_POINTS + ".");
}
if (!FieldValidator.areElementsUnique(constSumOptions))
{
errors.add(CONST_SUM_ERROR_DUPLICATE_OPTIONS);
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020051005676833362741778 = errors;
threadMonitoringController.exitInternalAction("_a2pOwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020051005676833362741778;
}
finally {
threadMonitoringController.exitService("_a2oAoLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_a2tgMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a2uuULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors;
int numOptions = distributeToRecipients ? numRecipients : constSumOptions.size();
int totalPoints = pointsPerOption ? points * numOptions : points;
if (distributeToRecipients)
{
errors = getErrorsForConstSumRecipients(responses, totalPoints);
}
else
{
errors = getErrorsForConstSumOptions(responses, totalPoints);
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020061001839063910583475 = errors;
threadMonitoringController.exitInternalAction("_a2uuULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020061001839063910583475;
}
finally {
threadMonitoringController.exitService("_a2tgMLvVEeyr6avTgCRLkQ");
}
}

private  List<String> getErrorsForConstSumOptions(List<FeedbackResponseDetails> responses, int totalPoints) {
for (FeedbackResponseDetails response : responses)
{
List<String> errors = new  ArrayList<>();
FeedbackConstantSumResponseDetails details = (FeedbackConstantSumResponseDetails) response;
if (details.getAnswers().size() != constSumOptions.size())
{
errors.add(CONST_SUM_ANSWER_OPTIONS_NOT_MATCH);
return errors;
}
List<Integer> givenPoints = details.getAnswers();
errors = getErrors(givenPoints, totalPoints);
if (!errors.isEmpty())
{
return errors;
}
}
return new  ArrayList<>();
}

private  List<String> getErrorsForConstSumRecipients(List<FeedbackResponseDetails> responses, int totalPoints) {
List<Integer> givenPoints = new  ArrayList<>();
for (FeedbackResponseDetails response : responses)
{
FeedbackConstantSumResponseDetails details = (FeedbackConstantSumResponseDetails) response;
List<String> errors = new  ArrayList<>();
if (details.getAnswers().size() != 1)
{
errors.add(CONST_SUM_ANSWER_RECIPIENT_NOT_MATCH);
}
if (!errors.isEmpty())
{
return errors;
}
int givenPoint = details.getAnswers().get(0);
givenPoints.add(givenPoint);
}
return getErrors(givenPoints, totalPoints);
}

private  List<String> getErrors(List<Integer> givenPoints, int totalPoints) {
List<String> errors = new  ArrayList<>();
int sum = 0;
for (int i : givenPoints)
{
if (i < 0)
{
errors.add(CONST_SUM_ERROR_NEGATIVE);
return errors;
}
sum += i;
}
if (sum != totalPoints)
{
errors.add(CONST_SUM_ERROR_MISMATCH);
return errors;
}
Set<Integer> answerSet = new  HashSet<>();
if (distributePointsFor.equals(FeedbackConstantSumDistributePointsType.DISTRIBUTE_SOME_UNEVENLY.getDisplayedOption()))
{
boolean hasDifferentPoints = false;
for (int i : givenPoints)
{
if (!answerSet.isEmpty() && !answerSet.contains(i))
{
hasDifferentPoints = true;
break;
}
answerSet.add(i);
}
if (!hasDifferentPoints)
{
errors.add(CONST_SUM_ERROR_SOME_UNIQUE);
return errors;
}
}
else
if (forceUnevenDistribution || distributePointsFor.equals(FeedbackConstantSumDistributePointsType.DISTRIBUTE_ALL_UNEVENLY.getDisplayedOption()))
{
for (int i : givenPoints)
{
if (answerSet.contains(i))
{
errors.add(CONST_SUM_ERROR_UNIQUE);
return errors;
}
answerSet.add(i);
}
}
return errors;
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a27ioLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a28wwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130200710011444646616788079 = false;
threadMonitoringController.exitInternalAction("_a28wwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130200710011444646616788079;
}
finally {
threadMonitoringController.exitService("_a27ioLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_a2-l8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a2_0ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130200810026678169838055255 = "";
threadMonitoringController.exitInternalAction("_a2_0ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130200810026678169838055255;
}
finally {
threadMonitoringController.exitService("_a2-l8LvVEeyr6avTgCRLkQ");
}
}

public  int getNumOfConstSumOptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a3BpQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3C3YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020091005915968806511256 = constSumOptions.size();
threadMonitoringController.exitInternalAction("_a3C3YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020091005915968806511256;
}
finally {
threadMonitoringController.exitService("_a3BpQLvVEeyr6avTgCRLkQ");
}
}

public  List<String> getConstSumOptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a3FToLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3GhwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130201010045789570236998345 = constSumOptions;
threadMonitoringController.exitInternalAction("_a3GhwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130201010045789570236998345;
}
finally {
threadMonitoringController.exitService("_a3FToLvVEeyr6avTgCRLkQ");
}
}

public  void setConstSumOptions(List<String> constSumOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("constSumOptions", constSumOptions);
threadMonitoringController.enterService("_a3JlELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3LaQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.constSumOptions = constSumOptions;
threadMonitoringController.exitInternalAction("_a3LaQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a3JlELvVEeyr6avTgCRLkQ");
}
}

public  boolean isDistributeToRecipients() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a3OdkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3PrsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302012300223889562665762 = distributeToRecipients;
threadMonitoringController.exitInternalAction("_a3PrsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302012300223889562665762;
}
finally {
threadMonitoringController.exitService("_a3OdkLvVEeyr6avTgCRLkQ");
}
}

public  void setDistributeToRecipients(boolean distributeToRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("distributeToRecipients", distributeToRecipients);
threadMonitoringController.enterService("_a3SH8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3TWELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.distributeToRecipients = distributeToRecipients;
threadMonitoringController.exitInternalAction("_a3TWELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a3SH8LvVEeyr6avTgCRLkQ");
}
}

public  boolean isPointsPerOption() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a3VLQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3WZYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020143009251600763383754 = pointsPerOption;
threadMonitoringController.exitInternalAction("_a3WZYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020143009251600763383754;
}
finally {
threadMonitoringController.exitService("_a3VLQLvVEeyr6avTgCRLkQ");
}
}

public  void setPointsPerOption(boolean pointsPerOption) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("pointsPerOption", pointsPerOption);
threadMonitoringController.enterService("_a3Y1oLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3aDwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.pointsPerOption = pointsPerOption;
threadMonitoringController.exitInternalAction("_a3aDwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a3Y1oLvVEeyr6avTgCRLkQ");
}
}

public  boolean isForceUnevenDistribution() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a3cgALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3duILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020163003659233888145602 = forceUnevenDistribution;
threadMonitoringController.exitInternalAction("_a3duILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020163003659233888145602;
}
finally {
threadMonitoringController.exitService("_a3cgALvVEeyr6avTgCRLkQ");
}
}

public  void setForceUnevenDistribution(boolean forceUnevenDistribution) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("forceUnevenDistribution", forceUnevenDistribution);
threadMonitoringController.enterService("_a3fjULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3gKYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.forceUnevenDistribution = forceUnevenDistribution;
threadMonitoringController.exitInternalAction("_a3gKYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a3fjULvVEeyr6avTgCRLkQ");
}
}

public  String getDistributePointsFor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a3imoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3j0wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130201910043514795481228097 = distributePointsFor;
threadMonitoringController.exitInternalAction("_a3j0wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130201910043514795481228097;
}
finally {
threadMonitoringController.exitService("_a3imoLvVEeyr6avTgCRLkQ");
}
}

public  void setDistributePointsFor(String distributePointsFor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("distributePointsFor", distributePointsFor);
threadMonitoringController.enterService("_a3m4ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3oGMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.distributePointsFor = distributePointsFor;
threadMonitoringController.exitInternalAction("_a3oGMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a3m4ELvVEeyr6avTgCRLkQ");
}
}

public  int getPoints() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_a3p7YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3rJgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130202120004882569727555541 = points;
threadMonitoringController.exitInternalAction("_a3rJgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130202120004882569727555541;
}
finally {
threadMonitoringController.exitService("_a3p7YLvVEeyr6avTgCRLkQ");
}
}

public  void setPoints(int points) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("points", points);
threadMonitoringController.enterService("_a3s-sLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a3uz4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.points = points;
threadMonitoringController.exitInternalAction("_a3uz4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_a3s-sLvVEeyr6avTgCRLkQ");
}
}

}
