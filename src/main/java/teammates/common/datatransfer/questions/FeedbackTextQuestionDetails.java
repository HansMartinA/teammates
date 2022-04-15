package teammates.common.datatransfer.questions;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
public class FeedbackTextQuestionDetails extends FeedbackQuestionDetails {
static final String TEXT_ERROR_INVALID_RECOMMENDED_LENGTH = "Recommended length must be 1 or greater";

@Nullable
private Integer recommendedLength;

private Boolean shouldAllowRichText;

public  FeedbackTextQuestionDetails(){
this(null);
}
public  FeedbackTextQuestionDetails(String questionText){
super(FeedbackQuestionType.TEXT, questionText);
recommendedLength = null;
shouldAllowRichText = true;
}
@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_bQRPsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQTE4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert newDetails instanceof FeedbackTextQuestionDetails;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021868007832077337420034 = !((FeedbackTextQuestionDetails) newDetails).shouldAllowRichText && shouldAllowRichText;
threadMonitoringController.exitInternalAction("_bQTE4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021868007832077337420034;
}
finally {
threadMonitoringController.exitService("_bQRPsLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bQVhILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQWvQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (recommendedLength != null && recommendedLength < 1)
{
errors.add(TEXT_ERROR_INVALID_RECOMMENDED_LENGTH);
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021879007851823822427283 = errors;
threadMonitoringController.exitInternalAction("_bQWvQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021879007851823822427283;
}
finally {
threadMonitoringController.exitService("_bQVhILvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_bQZLgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQbAsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021889006348688548178537 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_bQbAsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021889006348688548178537;
}
finally {
threadMonitoringController.exitService("_bQZLgLvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bQdc8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQerELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021899005415606068671212 = false;
threadMonitoringController.exitInternalAction("_bQerELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021899005415606068671212;
}
finally {
threadMonitoringController.exitService("_bQdc8LvVEeyr6avTgCRLkQ");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_bQhuYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQi8gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130219100038923762034787357 = "";
threadMonitoringController.exitInternalAction("_bQi8gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130219100038923762034787357;
}
finally {
threadMonitoringController.exitService("_bQhuYLvVEeyr6avTgCRLkQ");
}
}

public  Integer getRecommendedLength() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bQlYwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQnN8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Integer longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021920004936442252782022 = recommendedLength;
threadMonitoringController.exitInternalAction("_bQnN8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021920004936442252782022;
}
finally {
threadMonitoringController.exitService("_bQlYwLvVEeyr6avTgCRLkQ");
}
}

public  void setRecommendedLength(Integer recommendedLength) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("recommendedLength", recommendedLength);
threadMonitoringController.enterService("_bQq4ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQtUkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.recommendedLength = recommendedLength;
threadMonitoringController.exitInternalAction("_bQtUkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bQq4ULvVEeyr6avTgCRLkQ");
}
}

public  boolean getShouldAllowRichText() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bQwX4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQxmALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021945002910814758153194 = shouldAllowRichText;
threadMonitoringController.exitInternalAction("_bQxmALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021945002910814758153194;
}
finally {
threadMonitoringController.exitService("_bQwX4LvVEeyr6avTgCRLkQ");
}
}

public  void setShouldAllowRichText(Boolean shouldAllowRichText) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("shouldAllowRichText", shouldAllowRichText);
threadMonitoringController.enterService("_bQ13cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bQ3soLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.shouldAllowRichText = shouldAllowRichText;
threadMonitoringController.exitInternalAction("_bQ3soLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bQ13cLvVEeyr6avTgCRLkQ");
}
}

}
