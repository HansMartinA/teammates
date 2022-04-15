package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.util.Const;
public class FeedbackRankRecipientsQuestionDetails extends FeedbackRankQuestionDetails {
public  FeedbackRankRecipientsQuestionDetails(){
this(null);
}
public  FeedbackRankRecipientsQuestionDetails(String questionText){
super(FeedbackQuestionType.RANK_RECIPIENTS, questionText);
}
@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_bMLZ4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bMNPELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130215340021331515298089598 = false;
threadMonitoringController.exitInternalAction("_bMNPELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130215340021331515298089598;
}
finally {
threadMonitoringController.exitService("_bMLZ4LvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bMPrULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bMQ5cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021546008858525391258696 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_bMQ5cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021546008858525391258696;
}
finally {
threadMonitoringController.exitService("_bMPrULvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_bMTVsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bMUj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
boolean isMinOptionsEnabled = minOptionsToBeRanked != Const.POINTS_NO_VALUE;
boolean isMaxOptionsEnabled = maxOptionsToBeRanked != Const.POINTS_NO_VALUE;
Set<Integer> responseRank = new  HashSet<>();
for (FeedbackResponseDetails response : responses)
{
FeedbackRankRecipientsResponseDetails details = (FeedbackRankRecipientsResponseDetails) response;
if (responseRank.contains(details.getAnswer()) && !areDuplicatesAllowed)
{
errors.add("Duplicate rank " + details.getAnswer() + " in question");
}
else
if (details.getAnswer() > numRecipients || details.getAnswer() < 1)
{
errors.add("Invalid rank " + details.getAnswer() + " in question");
}
responseRank.add(details.getAnswer());
}
if (isMinOptionsEnabled && responses.size() < minOptionsToBeRanked)
{
errors.add("You must rank at least " + minOptionsToBeRanked + " options.");
}
if (isMaxOptionsEnabled && responses.size() > maxOptionsToBeRanked)
{
errors.add("You can rank at most " + maxOptionsToBeRanked + " options.");
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130215570087871748122288 = errors;
threadMonitoringController.exitInternalAction("_bMUj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130215570087871748122288;
}
finally {
threadMonitoringController.exitService("_bMTVsLvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bMaqcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bMdGsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021567009544868859521483 = false;
threadMonitoringController.exitInternalAction("_bMdGsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021567009544868859521483;
}
finally {
threadMonitoringController.exitService("_bMaqcLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_bMgKALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bMh_MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302157700744133532004021 = "";
threadMonitoringController.exitInternalAction("_bMh_MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302157700744133532004021;
}
finally {
threadMonitoringController.exitService("_bMgKALvVEeyr6avTgCRLkQ");
}
}

}
