package teammates.common.datatransfer.questions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
public class FeedbackNumericalScaleQuestionDetails extends FeedbackQuestionDetails {
static final String QUESTION_TYPE_NAME = "Numerical-scale question";

static final String NUMSCALE_ERROR_MIN_MAX = "Minimum value must be < maximum value for " + QUESTION_TYPE_NAME + ".";

static final String NUMSCALE_ERROR_STEP = "Step value must be > 0 for " + QUESTION_TYPE_NAME + ".";

static final String NUMSCALE_ERROR_OUT_OF_RANGE = " is out of the range for " + QUESTION_TYPE_NAME + ".";

private int minScale;

private int maxScale;

private double step;

public  FeedbackNumericalScaleQuestionDetails(){
this(null);
}
public  FeedbackNumericalScaleQuestionDetails(String questionText){
super(FeedbackQuestionType.NUMSCALE, questionText);
this.minScale = 1;
this.maxScale = 5;
this.step = 0.5D;
}
@Override
public  boolean shouldChangesRequireResponseDeletion(FeedbackQuestionDetails newDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newDetails", newDetails);
threadMonitoringController.enterService("_bFtlgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bFvasLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackNumericalScaleQuestionDetails newNumScaleDetails = (FeedbackNumericalScaleQuestionDetails) newDetails;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302107300695639988095956 = this.minScale != newNumScaleDetails.minScale || this.maxScale != newNumScaleDetails.maxScale || this.step != newNumScaleDetails.step;
threadMonitoringController.exitInternalAction("_bFvasLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302107300695639988095956;
}
finally {
threadMonitoringController.exitService("_bFtlgLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bFxP4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bFyeALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (minScale >= maxScale)
{
errors.add(NUMSCALE_ERROR_MIN_MAX);
}
if (step <= 0)
{
errors.add(NUMSCALE_ERROR_STEP);
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021083005340465979138842 = errors;
threadMonitoringController.exitInternalAction("_bFyeALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021083005340465979138842;
}
finally {
threadMonitoringController.exitService("_bFxP4LvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_bF2IYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bF3WgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
for (FeedbackResponseDetails response : responses)
{
FeedbackNumericalScaleResponseDetails details = (FeedbackNumericalScaleResponseDetails) response;
boolean isAnswerOutOfRange = details.getAnswer() < minScale || details.getAnswer() > maxScale;
if (isAnswerOutOfRange)
{
errors.add(details.getAnswerString() + NUMSCALE_ERROR_OUT_OF_RANGE + "(min=" + minScale + ", max=" + maxScale + ")");
}
BigDecimal minval = BigDecimal.valueOf(this.minScale);
BigDecimal answer = BigDecimal.valueOf(details.getAnswer());
BigDecimal stepBd = BigDecimal.valueOf(step);
BigDecimal remainder = answer.subtract(minval).remainder(stepBd);
boolean isAnsMultipleOfStep = remainder.compareTo(BigDecimal.ZERO) == 0;
if (!isAnsMultipleOfStep && !isAnswerOutOfRange)
{
double posValSmall = answer.subtract(remainder).setScale(5, RoundingMode.HALF_UP).doubleValue();
double posValBig = answer.subtract(remainder).add(stepBd).setScale(5, RoundingMode.HALF_UP).doubleValue();
errors.add("Please enter a valid value. The two nearest valid values are " + posValSmall + " and " + posValBig + ".");
}
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130210970032376762959799676 = errors;
threadMonitoringController.exitInternalAction("_bF3WgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130210970032376762959799676;
}
finally {
threadMonitoringController.exitService("_bF2IYLvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bGCVoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGDjwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130211080028890306369771024 = false;
threadMonitoringController.exitInternalAction("_bGDjwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130211080028890306369771024;
}
finally {
threadMonitoringController.exitService("_bGCVoLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_bGFY8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGHOILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021118004408884108558915 = "";
threadMonitoringController.exitInternalAction("_bGHOILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021118004408884108558915;
}
finally {
threadMonitoringController.exitService("_bGFY8LvVEeyr6avTgCRLkQ");
}
}

public  int getMinScale() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bGJqYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGK4gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021129001655824588316921 = minScale;
threadMonitoringController.exitInternalAction("_bGK4gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021129001655824588316921;
}
finally {
threadMonitoringController.exitService("_bGJqYLvVEeyr6avTgCRLkQ");
}
}

public  void setMinScale(int minScale) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("minScale", minScale);
threadMonitoringController.enterService("_bGNUwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGOi4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.minScale = minScale;
threadMonitoringController.exitInternalAction("_bGOi4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bGNUwLvVEeyr6avTgCRLkQ");
}
}

public  int getMaxScale() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bGQ_ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGSNQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021149005234630479516896 = maxScale;
threadMonitoringController.exitInternalAction("_bGSNQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021149005234630479516896;
}
finally {
threadMonitoringController.exitService("_bGQ_ILvVEeyr6avTgCRLkQ");
}
}

public  void setMaxScale(int maxScale) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("maxScale", maxScale);
threadMonitoringController.enterService("_bGUpgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGV3oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.maxScale = maxScale;
threadMonitoringController.exitInternalAction("_bGV3oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bGUpgLvVEeyr6avTgCRLkQ");
}
}

public  double getStep() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bGYT4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGZiALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
double longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302117000058598710804770526 = step;
threadMonitoringController.exitInternalAction("_bGZiALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302117000058598710804770526;
}
finally {
threadMonitoringController.exitService("_bGYT4LvVEeyr6avTgCRLkQ");
}
}

public  void setStep(double step) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("step", step);
threadMonitoringController.enterService("_bGb-QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bGdMYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.step = step;
threadMonitoringController.exitInternalAction("_bGdMYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bGb-QLvVEeyr6avTgCRLkQ");
}
}

}
