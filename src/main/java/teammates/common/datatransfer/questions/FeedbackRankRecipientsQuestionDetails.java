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
threadMonitoringController.enterService("_ssRhMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ssTWYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681462006421554334044093 = false;
threadMonitoringController.exitInternalAction("_ssTWYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681462006421554334044093;
}
finally {
threadMonitoringController.exitService("_ssRhMLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ssVLkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ssWZsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368146700035574874190150485 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_ssWZsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368146700035574874190150485;
}
finally {
threadMonitoringController.exitService("_ssVLkLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_ssY18LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ssaEELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681471009390163437538264 = errors;
threadMonitoringController.exitInternalAction("_ssaEELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681471009390163437538264;
}
finally {
threadMonitoringController.exitService("_ssY18LngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ssfjoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ssgxwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681476003407213650255341 = false;
threadMonitoringController.exitInternalAction("_ssgxwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681476003407213650255341;
}
finally {
threadMonitoringController.exitService("_ssfjoLngEeyIw-dB1KCaVA");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_ssj1ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sslDMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681479004270322579753346 = "";
threadMonitoringController.exitInternalAction("_sslDMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681479004270322579753346;
}
finally {
threadMonitoringController.exitService("_ssj1ELngEeyIw-dB1KCaVA");
}
}

}
