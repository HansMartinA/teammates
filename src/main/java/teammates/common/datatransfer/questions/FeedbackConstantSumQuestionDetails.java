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
threadMonitoringController.enterService("_sX-sMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sX_6ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810380006031182531476331 = !this.distributePointsFor.equals(newConstSumDetails.distributePointsFor);
threadMonitoringController.exitInternalAction("_sX_6ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810380006031182531476331;
}
finally {
threadMonitoringController.exitService("_sX-sMLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sYC9oLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYELwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681041004579514683417465 = errors;
threadMonitoringController.exitInternalAction("_sYELwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681041004579514683417465;
}
finally {
threadMonitoringController.exitService("_sYC9oLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> validateResponsesDetails(List<FeedbackResponseDetails> responses, int numRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responses", responses);
monitoringServiceParameters.addValue("numRecipients", numRecipients);
threadMonitoringController.enterService("_sYH2ILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYJEQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681045006421752233239564 = errors;
threadMonitoringController.exitInternalAction("_sYJEQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681045006421752233239564;
}
finally {
threadMonitoringController.exitService("_sYH2ILngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_sYUDYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYVRgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681049008151703685709878 = false;
threadMonitoringController.exitInternalAction("_sYVRgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681049008151703685709878;
}
finally {
threadMonitoringController.exitService("_sYUDYLngEeyIw-dB1KCaVA");
}
}

@Override
public  String validateGiverRecipientVisibility(FeedbackQuestionAttributes feedbackQuestionAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
threadMonitoringController.enterService("_sYXtwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYY74LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681052009700985507905246 = "";
threadMonitoringController.exitInternalAction("_sYY74LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681052009700985507905246;
}
finally {
threadMonitoringController.exitService("_sYXtwLngEeyIw-dB1KCaVA");
}
}

public  int getNumOfConstSumOptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sYaKALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYbYILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810570012702055857923666 = constSumOptions.size();
threadMonitoringController.exitInternalAction("_sYbYILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810570012702055857923666;
}
finally {
threadMonitoringController.exitService("_sYaKALngEeyIw-dB1KCaVA");
}
}

public  List<String> getConstSumOptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sYdNULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYebcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681064009495532055887589 = constSumOptions;
threadMonitoringController.exitInternalAction("_sYebcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681064009495532055887589;
}
finally {
threadMonitoringController.exitService("_sYdNULngEeyIw-dB1KCaVA");
}
}

public  void setConstSumOptions(List<String> constSumOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("constSumOptions", constSumOptions);
threadMonitoringController.enterService("_sYg3sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYhewLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.constSumOptions = constSumOptions;
threadMonitoringController.exitInternalAction("_sYhewLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sYg3sLngEeyIw-dB1KCaVA");
}
}

public  boolean isDistributeToRecipients() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sYjT8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYkiELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810710005260533902500675 = distributeToRecipients;
threadMonitoringController.exitInternalAction("_sYkiELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810710005260533902500675;
}
finally {
threadMonitoringController.exitService("_sYjT8LngEeyIw-dB1KCaVA");
}
}

public  void setDistributeToRecipients(boolean distributeToRecipients) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("distributeToRecipients", distributeToRecipients);
threadMonitoringController.enterService("_sYmXQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYnlYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.distributeToRecipients = distributeToRecipients;
threadMonitoringController.exitInternalAction("_sYnlYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sYmXQLngEeyIw-dB1KCaVA");
}
}

public  boolean isPointsPerOption() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sYpakLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYrPwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368108100041785147683710555 = pointsPerOption;
threadMonitoringController.exitInternalAction("_sYrPwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368108100041785147683710555;
}
finally {
threadMonitoringController.exitService("_sYpakLngEeyIw-dB1KCaVA");
}
}

public  void setPointsPerOption(boolean pointsPerOption) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("pointsPerOption", pointsPerOption);
threadMonitoringController.enterService("_sYsd4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYtsALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.pointsPerOption = pointsPerOption;
threadMonitoringController.exitInternalAction("_sYtsALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sYsd4LngEeyIw-dB1KCaVA");
}
}

public  boolean isForceUnevenDistribution() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sYvhMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYwvULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681092007704988268516417 = forceUnevenDistribution;
threadMonitoringController.exitInternalAction("_sYwvULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681092007704988268516417;
}
finally {
threadMonitoringController.exitService("_sYvhMLngEeyIw-dB1KCaVA");
}
}

public  void setForceUnevenDistribution(boolean forceUnevenDistribution) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("forceUnevenDistribution", forceUnevenDistribution);
threadMonitoringController.enterService("_sYykgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sYzyoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.forceUnevenDistribution = forceUnevenDistribution;
threadMonitoringController.exitInternalAction("_sYzyoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sYykgLngEeyIw-dB1KCaVA");
}
}

public  String getDistributePointsFor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sY2O4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sY218LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810990046116071475632214 = distributePointsFor;
threadMonitoringController.exitInternalAction("_sY218LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136810990046116071475632214;
}
finally {
threadMonitoringController.exitService("_sY2O4LngEeyIw-dB1KCaVA");
}
}

public  void setDistributePointsFor(String distributePointsFor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("distributePointsFor", distributePointsFor);
threadMonitoringController.enterService("_sY4rILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sY55QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.distributePointsFor = distributePointsFor;
threadMonitoringController.exitInternalAction("_sY55QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sY4rILngEeyIw-dB1KCaVA");
}
}

public  int getPoints() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sY7ucLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sY8VgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681105006455414603522395 = points;
threadMonitoringController.exitInternalAction("_sY8VgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681105006455414603522395;
}
finally {
threadMonitoringController.exitService("_sY7ucLngEeyIw-dB1KCaVA");
}
}

public  void setPoints(int points) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("points", points);
threadMonitoringController.enterService("_sY-xwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sY__4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.points = points;
threadMonitoringController.exitInternalAction("_sY__4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sY-xwLngEeyIw-dB1KCaVA");
}
}

}
