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
threadMonitoringController.enterService("_smK5MLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smMHULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackNumericalScaleQuestionDetails newNumScaleDetails = (FeedbackNumericalScaleQuestionDetails) newDetails;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681342005034731716893274 = this.minScale != newNumScaleDetails.minScale || this.maxScale != newNumScaleDetails.maxScale || this.step != newNumScaleDetails.step;
threadMonitoringController.exitInternalAction("_smMHULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681342005034731716893274;
}
finally {
threadMonitoringController.exitService("_smK5MLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_smN8gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smPKoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (minScale >= maxScale)
{
errors.add(NUMSCALE_ERROR_MIN_MAX);
}
if (step <= 0)
{
errors.add(NUMSCALE_ERROR_STEP);
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136813450011011622061264714 = errors;
threadMonitoringController.exitInternalAction("_smPKoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136813450011011622061264714;
}
finally {
threadMonitoringController.exitService("_smN8gLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_smRm4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smS1ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136813480039028317827590653 = errors;
threadMonitoringController.exitInternalAction("_smS1ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136813480039028317827590653;
}
finally {
threadMonitoringController.exitService("_smRm4LngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean isFeedbackParticipantCommentsOnResponsesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_smcmALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smd0ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681351009509908998285465 = false;
threadMonitoringController.exitInternalAction("_smd0ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681351009509908998285465;
}
finally {
threadMonitoringController.exitService("_smcmALngEeyIw-dB1KCaVA");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_smgQYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smhegLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681353006615667680065762 = "";
threadMonitoringController.exitInternalAction("_smhegLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681353006615667680065762;
}
finally {
threadMonitoringController.exitService("_smgQYLngEeyIw-dB1KCaVA");
}
}

public  int getMinScale() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_smjTsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smkh0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681356008175401137800968 = minScale;
threadMonitoringController.exitInternalAction("_smkh0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681356008175401137800968;
}
finally {
threadMonitoringController.exitService("_smjTsLngEeyIw-dB1KCaVA");
}
}

public  void setMinScale(int minScale) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("minScale", minScale);
threadMonitoringController.enterService("_smmXALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smnlILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.minScale = minScale;
threadMonitoringController.exitInternalAction("_smnlILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_smmXALngEeyIw-dB1KCaVA");
}
}

public  int getMaxScale() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_smqocLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smsdoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681362007366051861312133 = maxScale;
threadMonitoringController.exitInternalAction("_smsdoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681362007366051861312133;
}
finally {
threadMonitoringController.exitService("_smqocLngEeyIw-dB1KCaVA");
}
}

public  void setMaxScale(int maxScale) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("maxScale", maxScale);
threadMonitoringController.enterService("_smu54LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smwIALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.maxScale = maxScale;
threadMonitoringController.exitInternalAction("_smwIALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_smu54LngEeyIw-dB1KCaVA");
}
}

public  double getStep() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_smykQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_smzyYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
double longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136813660028449608010417293 = step;
threadMonitoringController.exitInternalAction("_smzyYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136813660028449608010417293;
}
finally {
threadMonitoringController.exitService("_smykQLngEeyIw-dB1KCaVA");
}
}

public  void setStep(double step) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("step", step);
threadMonitoringController.enterService("_sm1nkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sm3cwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.step = step;
threadMonitoringController.exitInternalAction("_sm3cwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sm1nkLngEeyIw-dB1KCaVA");
}
}

}
