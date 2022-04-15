package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.util.Const;
public class FeedbackRankOptionsQuestionDetails extends FeedbackRankQuestionDetails {
static final String QUESTION_TYPE_NAME = "Rank (options) question";

static final int MIN_NUM_OF_OPTIONS = 2;

static final String ERROR_INVALID_MAX_OPTIONS_ENABLED = "Max options enabled is invalid";

static final String ERROR_INVALID_MIN_OPTIONS_ENABLED = "Min options enabled is invalid";

static final String ERROR_MIN_OPTIONS_ENABLED_MORE_THAN_CHOICES = "Min options enabled is more than the total choices";

static final String ERROR_MAX_OPTIONS_ENABLED_MORE_THAN_CHOICES = "Max options enabled is more than the total choices";

static final String ERROR_NOT_ENOUGH_OPTIONS = "Too little options for " + QUESTION_TYPE_NAME + ". Minimum number of options is: ";

static final String ERROR_EMPTY_OPTIONS_ENTERED = "Empty rank options are not allowed";

static final String ERROR_DUPLICATE_RANK_RESPONSE = "Duplicate ranks are not allowed.";

static final String ERROR_INVALID_RANK_RESPONSE = "Invalid rank assigned.";

private List<String> options;

public  FeedbackRankOptionsQuestionDetails(){
this(null);
}
public  FeedbackRankOptionsQuestionDetails(String questionText){
super(FeedbackQuestionType.RANK_OPTIONS, questionText);
this.options = new  ArrayList<>();
}
@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_bJrfgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bJstoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackRankOptionsQuestionDetails newRankQuestionDetails = (FeedbackRankOptionsQuestionDetails) newDetails;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021335005235082808495639 = this.options.size() != newRankQuestionDetails.options.size() || !this.options.containsAll(newRankQuestionDetails.options) || !newRankQuestionDetails.options.containsAll(this.options) || this.minOptionsToBeRanked != newRankQuestionDetails.minOptionsToBeRanked || this.maxOptionsToBeRanked != newRankQuestionDetails.maxOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_bJstoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021335005235082808495639;
}
finally {
threadMonitoringController.exitService("_bJrfgLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bJw_ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bJyNMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
boolean isEmptyRankOptionEntered = options.stream().anyMatch(optionText -> "".equals(optionText.trim()));
if (isEmptyRankOptionEntered)
{
errors.add(ERROR_EMPTY_OPTIONS_ENTERED);
}
boolean isMaxOptionsToBeRankedEnabled = maxOptionsToBeRanked != Const.POINTS_NO_VALUE;
boolean isMinOptionsToBeRankedEnabled = minOptionsToBeRanked != Const.POINTS_NO_VALUE;
if (isMaxOptionsToBeRankedEnabled)
{
if (maxOptionsToBeRanked < 1)
{
errors.add(ERROR_INVALID_MAX_OPTIONS_ENABLED);
}
if (maxOptionsToBeRanked > options.size())
{
errors.add(ERROR_MAX_OPTIONS_ENABLED_MORE_THAN_CHOICES);
}
}
if (isMinOptionsToBeRankedEnabled)
{
if (minOptionsToBeRanked < 1)
{
errors.add(ERROR_INVALID_MIN_OPTIONS_ENABLED);
}
if (minOptionsToBeRanked > options.size())
{
errors.add(ERROR_MIN_OPTIONS_ENABLED_MORE_THAN_CHOICES);
}
}
if (isMaxOptionsToBeRankedEnabled && isMinOptionsToBeRankedEnabled && minOptionsToBeRanked > maxOptionsToBeRanked)
{
errors.add(ERROR_INVALID_MIN_OPTIONS_ENABLED);
}
if (options.size() < MIN_NUM_OF_OPTIONS)
{
errors.add(ERROR_NOT_ENOUGH_OPTIONS + MIN_NUM_OF_OPTIONS + ".");
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021347006460055673926668 = errors;
threadMonitoringController.exitInternalAction("_bJyNMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021347006460055673926668;
}
finally {
threadMonitoringController.exitService("_bJw_ELvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_bJ6JALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bJ7-MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
boolean isMinOptionsEnabled = minOptionsToBeRanked != Const.POINTS_NO_VALUE;
boolean isMaxOptionsEnabled = maxOptionsToBeRanked != Const.POINTS_NO_VALUE;
for (FeedbackResponseDetails response : responses)
{
FeedbackRankOptionsResponseDetails details = (FeedbackRankOptionsResponseDetails) response;
List<Integer> filteredAnswers = details.getFilteredSortedAnswerList();
Set<Integer> set = new  HashSet<>(filteredAnswers);
boolean isAnswerContainsDuplicates = set.size() < filteredAnswers.size();
if (isAnswerContainsDuplicates && !areDuplicatesAllowed)
{
errors.add(ERROR_DUPLICATE_RANK_RESPONSE);
}
if (isMinOptionsEnabled && filteredAnswers.size() < minOptionsToBeRanked)
{
errors.add("You must rank at least " + minOptionsToBeRanked + " options.");
}
if (isMaxOptionsEnabled && filteredAnswers.size() > maxOptionsToBeRanked)
{
errors.add("You can rank at most " + maxOptionsToBeRanked + " options.");
}
boolean isRankInvalid = filteredAnswers.stream().anyMatch(answer -> answer < 1 || answer > options.size());
if (isRankInvalid)
{
errors.add(ERROR_INVALID_RANK_RESPONSE);
}
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021359006879594167710845 = errors;
threadMonitoringController.exitInternalAction("_bJ7-MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021359006879594167710845;
}
finally {
threadMonitoringController.exitService("_bJ6JALvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bKD6ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bKFIILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130213700002393008167498678 = false;
threadMonitoringController.exitInternalAction("_bKFIILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130213700002393008167498678;
}
finally {
threadMonitoringController.exitService("_bKD6ALvVEeyr6avTgCRLkQ");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_bKG9ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bKIygLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130213840022445636674491465 = "";
threadMonitoringController.exitInternalAction("_bKIygLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130213840022445636674491465;
}
finally {
threadMonitoringController.exitService("_bKG9ULvVEeyr6avTgCRLkQ");
}
}

public  List<String> getOptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bKLOwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bKMc4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130213960020191434024029165 = options;
threadMonitoringController.exitInternalAction("_bKMc4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130213960020191434024029165;
}
finally {
threadMonitoringController.exitService("_bKLOwLvVEeyr6avTgCRLkQ");
}
}

public  void setOptions(List<String> options) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("options", options);
threadMonitoringController.enterService("_bKO5ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bKQHQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.options = options;
threadMonitoringController.exitInternalAction("_bKQHQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bKO5ILvVEeyr6avTgCRLkQ");
}
}

}
