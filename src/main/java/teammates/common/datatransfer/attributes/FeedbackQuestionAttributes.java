package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.questions.FeedbackQuestionDetails;
import teammates.common.datatransfer.questions.FeedbackQuestionType;
import teammates.common.util.FieldValidator;
import teammates.common.util.JsonUtils;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.FeedbackQuestion;
public class FeedbackQuestionAttributes extends EntityAttributes<FeedbackQuestion> implements Comparable<FeedbackQuestionAttributes> {
private String feedbackSessionName;

private String courseId;

private FeedbackQuestionDetails questionDetails;

private String questionDescription;

private int questionNumber;

private FeedbackParticipantType giverType;

private FeedbackParticipantType recipientType;

private int numberOfEntitiesToGiveFeedbackTo;

private List<FeedbackParticipantType> showResponsesTo;

private List<FeedbackParticipantType> showGiverNameTo;

private List<FeedbackParticipantType> showRecipientNameTo;

private transient Instant createdAt;

private transient Instant updatedAt;

private transient String feedbackQuestionId;

private  FeedbackQuestionAttributes(){
this.showResponsesTo = new  ArrayList<>();
this.showGiverNameTo = new  ArrayList<>();
this.showRecipientNameTo = new  ArrayList<>();
}
public static  Builder builder() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z_xRIbvVEeyr6avTgCRLkQ", FeedbackQuestionAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_xRIrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015436004376859950337715 = new  Builder();
threadMonitoringController.exitInternalAction("_Z_xRIrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015436004376859950337715;
}
finally {
threadMonitoringController.exitService("_Z_xRIbvVEeyr6avTgCRLkQ");
}
}

public static  FeedbackQuestionAttributes valueOf(FeedbackQuestion fq) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fq", fq);
threadMonitoringController.enterService("_Z_x4M7vVEeyr6avTgCRLkQ", FeedbackQuestionAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_yfQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes faq = new  FeedbackQuestionAttributes();
faq.feedbackSessionName = fq.getFeedbackSessionName();
faq.courseId = fq.getCourseId();
threadMonitoringController.enterInternalAction("_Z_ztY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
faq.questionDetails = deserializeFeedbackQuestionDetails(fq.getQuestionText(), fq.getQuestionType());
threadMonitoringController.exitInternalAction("_Z_ztY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_Z_yfQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z_ztZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
faq.questionDescription = fq.getQuestionDescription();
faq.questionNumber = fq.getQuestionNumber();
faq.giverType = fq.getGiverType();
faq.recipientType = fq.getRecipientType();
faq.numberOfEntitiesToGiveFeedbackTo = fq.getNumberOfEntitiesToGiveFeedbackTo();
if (fq.getShowResponsesTo() != null)
{
faq.showResponsesTo = new  ArrayList<>(fq.getShowResponsesTo());
}
if (fq.getShowGiverNameTo() != null)
{
faq.showGiverNameTo = new  ArrayList<>(fq.getShowGiverNameTo());
}
if (fq.getShowRecipientNameTo() != null)
{
faq.showRecipientNameTo = new  ArrayList<>(fq.getShowRecipientNameTo());
}
faq.createdAt = fq.getCreatedAt();
faq.updatedAt = fq.getUpdatedAt();
faq.feedbackQuestionId = fq.getId();
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015448004923572026474423 = faq;
threadMonitoringController.exitInternalAction("_Z_ztZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015448004923572026474423;
}
finally {
threadMonitoringController.exitService("_Z_x4M7vVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z_07gbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_1ikLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015455008245835345524813 = createdAt;
threadMonitoringController.exitInternalAction("_Z_1ikLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015455008245835345524813;
}
finally {
threadMonitoringController.exitService("_Z_07gbvVEeyr6avTgCRLkQ");
}
}

public  Instant getUpdatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z_2JoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_2JobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015462004990866072232206 = updatedAt;
threadMonitoringController.exitInternalAction("_Z_2JobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015462004990866072232206;
}
finally {
threadMonitoringController.exitService("_Z_2JoLvVEeyr6avTgCRLkQ");
}
}

public  String getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z_2ws7vVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_3XwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015469008520014110636099 = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_Z_3XwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015469008520014110636099;
}
finally {
threadMonitoringController.exitService("_Z_2ws7vVEeyr6avTgCRLkQ");
}
}

@Deprecated
public  void setId(String id) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("id", id);
threadMonitoringController.enterService("_Z_3-0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_3-0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackQuestionId = id;
threadMonitoringController.exitInternalAction("_Z_3-0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z_3-0LvVEeyr6avTgCRLkQ");
}
}

@Override
public  FeedbackQuestion toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z_4l4bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_6bFrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestion longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015485008763295027467556 = new  FeedbackQuestion(feedbackSessionName, courseId, getSerializedQuestionDetails(), questionDescription, questionNumber, getQuestionType(), giverType, recipientType, numberOfEntitiesToGiveFeedbackTo, showResponsesTo, showGiverNameTo, showRecipientNameTo);
threadMonitoringController.exitInternalAction("_Z_6bFrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z_7CJrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestion longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130154850016049891236035307 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015485008763295027467556;
threadMonitoringController.exitInternalAction("_Z_7CJrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130154850016049891236035307;
}
finally {
threadMonitoringController.exitService("_Z_4l4bvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z_7pMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_7pMbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes faq = new  FeedbackQuestionAttributes();
faq.feedbackSessionName = this.feedbackSessionName;
faq.courseId = this.courseId;
threadMonitoringController.exitInternalAction("_Z_7pMbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z_83WLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
faq.questionDetails = this.getQuestionDetailsCopy();
threadMonitoringController.exitInternalAction("_Z_83WLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z_83WbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
faq.questionDescription = this.questionDescription;
faq.questionNumber = this.questionNumber;
faq.giverType = this.giverType;
faq.recipientType = this.recipientType;
faq.numberOfEntitiesToGiveFeedbackTo = this.numberOfEntitiesToGiveFeedbackTo;
faq.showResponsesTo = new  ArrayList<>(this.showResponsesTo);
faq.showGiverNameTo = new  ArrayList<>(this.showGiverNameTo);
faq.showRecipientNameTo = new  ArrayList<>(this.showRecipientNameTo);
faq.createdAt = this.createdAt;
faq.updatedAt = this.updatedAt;
faq.feedbackQuestionId = this.feedbackQuestionId;
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015496003220253578332737 = faq;
threadMonitoringController.exitInternalAction("_Z_83WbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015496003220253578332737;
}
finally {
threadMonitoringController.exitService("_Z_7pMLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z_-FcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z__TlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015506005990549460190646 = "FeedbackQuestionAttributes [feedbackSessionName=" + feedbackSessionName + ", courseId=" + courseId + ", questionText=" + getSerializedQuestionDetails() + ", questionDescription=" + questionDescription + ", questionNumber=" + questionNumber + ", questionType=" + getQuestionType() + ", giverType=" + giverType + ", recipientType=" + recipientType + ", numberOfEntitiesToGiveFeedbackTo=" + numberOfEntitiesToGiveFeedbackTo + ", showResponsesTo=" + showResponsesTo + ", showGiverNameTo=" + showGiverNameTo + ", showRecipientNameTo=" + showRecipientNameTo + "]";
threadMonitoringController.exitInternalAction("_Z__TlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z__TnbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015506007481233156999195 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015506005990549460190646;
threadMonitoringController.exitInternalAction("_Z__TnbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015506007481233156999195;
}
finally {
threadMonitoringController.exitService("_Z_-FcLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z__6obvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aAAhsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_aAAhsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAFaObvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAFaPrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForFeedbackSessionName(feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_aAFaPrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aAFaObvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAGBQ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_aAGBQ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAHPZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAHPZbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
errors.addAll(FieldValidator.getValidityInfoForFeedbackParticipantType(giverType, recipientType));
threadMonitoringController.exitInternalAction("_aAHPZbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aAHPZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAJElLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAJElbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
errors.addAll(FieldValidator.getValidityInfoForFeedbackResponseVisibility(showResponsesTo, showGiverNameTo, showRecipientNameTo));
threadMonitoringController.exitInternalAction("_aAJElLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015530007444714236343418 = errors;
threadMonitoringController.exitInternalAction("_aAJElbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015530007444714236343418;
}
finally {
threadMonitoringController.exitService("_Z__6obvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean isValid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aAKSsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aASOgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130155390030915872920736653 = getInvalidityInfo().isEmpty();
threadMonitoringController.exitInternalAction("_aASOgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130155390030915872920736653;
}
finally {
threadMonitoringController.exitService("_aAKSsLvVEeyr6avTgCRLkQ");
}
}

public  boolean isResponseVisibleTo(FeedbackParticipantType userType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("userType", userType);
threadMonitoringController.enterService("_aATcoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aAUDsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015546009854052447325735 = showResponsesTo.contains(userType);
threadMonitoringController.exitInternalAction("_aAUDsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015546009854052447325735;
}
finally {
threadMonitoringController.exitService("_aATcoLvVEeyr6avTgCRLkQ");
}
}

public  boolean areResponseDeletionsRequiredForChanges(FeedbackQuestionAttributes newAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newAttributes", newAttributes);
threadMonitoringController.enterService("_aAUqwbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aAVR0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!newAttributes.giverType.equals(this.giverType) || !newAttributes.recipientType.equals(this.recipientType))
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015562007592057967802075 = true;
threadMonitoringController.exitInternalAction("_aAVR0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015562007592057967802075;
}
threadMonitoringController.enterInternalAction("_aAWf-LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130155620007269336096894763 = this.getQuestionDetailsCopy().shouldChangesRequireResponseDeletion(newAttributes.getQuestionDetailsCopy());
threadMonitoringController.exitInternalAction("_aAWf-LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAWf_LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015562005743575419877077 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130155620007269336096894763;
threadMonitoringController.exitInternalAction("_aAWf_LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAXHA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015562006439022876015111 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015562005743575419877077;
threadMonitoringController.exitInternalAction("_aAXHA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015562006439022876015111;
}
finally {
threadMonitoringController.exitService("_aAUqwbvVEeyr6avTgCRLkQ");
}
}

@Override
public  int compareTo(FeedbackQuestionAttributes o) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("o", o);
threadMonitoringController.enterService("_aAYVILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aAYVIbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (o == null)
{
return 1;
}
if (this.questionNumber != o.questionNumber)
{
return Integer.compare(this.questionNumber, o.questionNumber);
}
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301557000976832468421897 = this.feedbackQuestionId.compareTo(o.feedbackQuestionId);
threadMonitoringController.exitInternalAction("_aAYVIbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301557000976832468421897;
}
finally {
threadMonitoringController.exitService("_aAYVILvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aAaKULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aAaxYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int prime = 31;
int result = 1;
result = prime * result + (courseId == null ? 0 : courseId.hashCode());
result = prime * result + (feedbackSessionName == null ? 0 : feedbackSessionName.hashCode());
result = prime * result + (giverType == null ? 0 : giverType.hashCode());
result = prime * result + numberOfEntitiesToGiveFeedbackTo;
result = prime * result + questionNumber;
threadMonitoringController.exitInternalAction("_aAaxYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAb_ibvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
result = prime * result + (questionDetails == null ? 0 : questionDetails.hashCode());
threadMonitoringController.exitInternalAction("_aAb_ibvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aAb_irvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
result = prime * result + (questionDescription == null ? 0 : questionDescription.hashCode());
result = prime * result + (recipientType == null ? 0 : recipientType.hashCode());
result = prime * result + (showGiverNameTo == null ? 0 : showGiverNameTo.hashCode());
result = prime * result + (showRecipientNameTo == null ? 0 : showRecipientNameTo.hashCode());
result = prime * result + (showResponsesTo == null ? 0 : showResponsesTo.hashCode());
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015583009262039443518393 = result;
threadMonitoringController.exitInternalAction("_aAb_irvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015583009262039443518393;
}
finally {
threadMonitoringController.exitService("_aAaKULvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object obj) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("obj", obj);
threadMonitoringController.enterService("_aAd0sLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aAebwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (this == obj)
{
return true;
}
if (obj == null)
{
return false;
}
if (getClass() != obj.getClass())
{
return false;
}
FeedbackQuestionAttributes other = (FeedbackQuestionAttributes) obj;
if (courseId == null)
{
if (other.courseId != null)
{
return false;
}
}
else
if (!courseId.equals(other.courseId))
{
return false;
}
if (feedbackSessionName == null)
{
if (other.feedbackSessionName != null)
{
return false;
}
}
else
if (!feedbackSessionName.equals(other.feedbackSessionName))
{
return false;
}
if (giverType != other.giverType)
{
return false;
}
if (numberOfEntitiesToGiveFeedbackTo != other.numberOfEntitiesToGiveFeedbackTo)
{
return false;
}
if (questionNumber != other.questionNumber)
{
return false;
}
if (questionDetails == null)
{
if (other.questionDetails != null)
{
return false;
}
}
else
if (!questionDetails.equals(other.questionDetails))
{
return false;
}
if (questionDescription == null)
{
if (other.questionDescription != null)
{
return false;
}
}
else
if (!questionDescription.equals(other.questionDescription))
{
return false;
}
if (recipientType != other.recipientType)
{
return false;
}
if (showGiverNameTo == null)
{
if (other.showGiverNameTo != null)
{
return false;
}
}
else
if (!showGiverNameTo.equals(other.showGiverNameTo))
{
return false;
}
if (showRecipientNameTo == null)
{
if (other.showRecipientNameTo != null)
{
return false;
}
}
else
if (!showRecipientNameTo.equals(other.showRecipientNameTo))
{
return false;
}
if (showResponsesTo == null)
{
if (other.showResponsesTo != null)
{
return false;
}
}
else
if (!showResponsesTo.equals(other.showResponsesTo))
{
return false;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015590002920068626977935 = true;
threadMonitoringController.exitInternalAction("_aAebwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015590002920068626977935;
}
finally {
threadMonitoringController.exitService("_aAd0sLvVEeyr6avTgCRLkQ");
}
}

public  void removeIrrelevantVisibilityOptions() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aAfC0bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aAfp4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> optionsToRemove = new  ArrayList<>();
if (recipientType != null)
{
switch (recipientType) {
case NONE: optionsToRemove.add(FeedbackParticipantType.RECEIVER);
optionsToRemove.add(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS);
break;
case TEAMS: case INSTRUCTORS: case OWN_TEAM: case OWN_TEAM_MEMBERS: optionsToRemove.add(FeedbackParticipantType.RECEIVER_TEAM_MEMBERS);
break;
default: break;

}
}
if (giverType != null)
{
switch (giverType) {
case TEAMS: case INSTRUCTORS: optionsToRemove.add(FeedbackParticipantType.OWN_TEAM_MEMBERS);
break;
default: break;

}
}
if (showRecipientNameTo != null)
{
showResponsesTo.removeAll(optionsToRemove);
}
if (showGiverNameTo != null)
{
showGiverNameTo.removeAll(optionsToRemove);
}
if (showRecipientNameTo != null)
{
showRecipientNameTo.removeAll(optionsToRemove);
}
threadMonitoringController.exitInternalAction("_aAfp4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aAfC0bvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aA55kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aA7HtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionDescription = SanitizationHelper.sanitizeForRichText(this.questionDescription);
threadMonitoringController.exitInternalAction("_aA7HtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aA55kLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionDetails getQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aA7uwbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aA8V0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015614005306062350224033 = questionDetails;
threadMonitoringController.exitInternalAction("_aA8V0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015614005306062350224033;
}
finally {
threadMonitoringController.exitService("_aA7uwbvVEeyr6avTgCRLkQ");
}
}

public  void setQuestionDetails(FeedbackQuestionDetails newQuestionDetails) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("newQuestionDetails", newQuestionDetails);
threadMonitoringController.enterService("_aA884LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aA-yFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionDetails = newQuestionDetails.getDeepCopy();
threadMonitoringController.exitInternalAction("_aA-yFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aA884LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionDetails getQuestionDetailsCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aA_ZILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBBOVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionDetails longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130156260036053959756360077 = questionDetails.getDeepCopy();
threadMonitoringController.exitInternalAction("_aBBOVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130156260036053959756360077;
}
finally {
threadMonitoringController.exitService("_aA_ZILvVEeyr6avTgCRLkQ");
}
}

public  String getSerializedQuestionDetails() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBB1YbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBDDhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130156330041072801239199797 = questionDetails.getJsonString();
threadMonitoringController.exitInternalAction("_aBDDhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130156330041072801239199797;
}
finally {
threadMonitoringController.exitService("_aBB1YbvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackQuestionId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBDqkbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBERoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015639005543277170822286 = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_aBERoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015639005543277170822286;
}
finally {
threadMonitoringController.exitService("_aBDqkbvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBE4sbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBFfwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015647008748017510852266 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_aBFfwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015647008748017510852266;
}
finally {
threadMonitoringController.exitService("_aBE4sbvVEeyr6avTgCRLkQ");
}
}

public  void setFeedbackSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_aBGt4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBH8ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackSessionName = feedbackSessionName;
threadMonitoringController.exitInternalAction("_aBH8ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBGt4LvVEeyr6avTgCRLkQ");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBJKILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBJxMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130156610023797383866004496 = courseId;
threadMonitoringController.exitInternalAction("_aBJxMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130156610023797383866004496;
}
finally {
threadMonitoringController.exitService("_aBJKILvVEeyr6avTgCRLkQ");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_aBK_ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBLmYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_aBLmYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBK_ULvVEeyr6avTgCRLkQ");
}
}

public  String getQuestionDescription() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBM0gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBM0gbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130156790023014275183795285 = questionDescription;
threadMonitoringController.exitInternalAction("_aBM0gbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130156790023014275183795285;
}
finally {
threadMonitoringController.exitService("_aBM0gLvVEeyr6avTgCRLkQ");
}
}

public  void setQuestionDescription(String questionDescription) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionDescription", questionDescription);
threadMonitoringController.enterService("_aBOCoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBOpsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionDescription = questionDescription;
threadMonitoringController.exitInternalAction("_aBOpsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBOCoLvVEeyr6avTgCRLkQ");
}
}

public  int getQuestionNumber() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBPQwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBP30LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015695008480465761035829 = questionNumber;
threadMonitoringController.exitInternalAction("_aBP30LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015695008480465761035829;
}
finally {
threadMonitoringController.exitService("_aBPQwLvVEeyr6avTgCRLkQ");
}
}

public  void setQuestionNumber(int questionNumber) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionNumber", questionNumber);
threadMonitoringController.enterService("_aBQe4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBRtALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.questionNumber = questionNumber;
threadMonitoringController.exitInternalAction("_aBRtALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBQe4LvVEeyr6avTgCRLkQ");
}
}

public  FeedbackQuestionType getQuestionType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBS7ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBTiNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015713006902927880828346 = questionDetails.getQuestionType();
threadMonitoringController.exitInternalAction("_aBTiNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015713006902927880828346;
}
finally {
threadMonitoringController.exitService("_aBS7ILvVEeyr6avTgCRLkQ");
}
}

public  FeedbackParticipantType getGiverType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBVXYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBV-cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015721005925895163334747 = giverType;
threadMonitoringController.exitInternalAction("_aBV-cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015721005925895163334747;
}
finally {
threadMonitoringController.exitService("_aBVXYLvVEeyr6avTgCRLkQ");
}
}

public  void setGiverType(FeedbackParticipantType giverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("giverType", giverType);
threadMonitoringController.enterService("_aBXMkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBXzoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.giverType = giverType;
threadMonitoringController.exitInternalAction("_aBXzoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBXMkLvVEeyr6avTgCRLkQ");
}
}

public  FeedbackParticipantType getRecipientType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBaP4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBa28LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015737005874022372516209 = recipientType;
threadMonitoringController.exitInternalAction("_aBa28LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015737005874022372516209;
}
finally {
threadMonitoringController.exitService("_aBaP4LvVEeyr6avTgCRLkQ");
}
}

public  void setRecipientType(FeedbackParticipantType recipientType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("recipientType", recipientType);
threadMonitoringController.enterService("_aBcFELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBcsILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.recipientType = recipientType;
threadMonitoringController.exitInternalAction("_aBcsILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBcFELvVEeyr6avTgCRLkQ");
}
}

public  int getNumberOfEntitiesToGiveFeedbackTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBd6QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBfIYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015755007056184077439912 = numberOfEntitiesToGiveFeedbackTo;
threadMonitoringController.exitInternalAction("_aBfIYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015755007056184077439912;
}
finally {
threadMonitoringController.exitService("_aBd6QLvVEeyr6avTgCRLkQ");
}
}

public  void setNumberOfEntitiesToGiveFeedbackTo(int numberOfEntitiesToGiveFeedbackTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("numberOfEntitiesToGiveFeedbackTo", numberOfEntitiesToGiveFeedbackTo);
threadMonitoringController.enterService("_aBfvcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBgWgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.numberOfEntitiesToGiveFeedbackTo = numberOfEntitiesToGiveFeedbackTo;
threadMonitoringController.exitInternalAction("_aBgWgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBfvcLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackParticipantType> getShowResponsesTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBg9kbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBhkoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130157710047276375465473885 = showResponsesTo;
threadMonitoringController.exitInternalAction("_aBhkoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130157710047276375465473885;
}
finally {
threadMonitoringController.exitService("_aBg9kbvVEeyr6avTgCRLkQ");
}
}

public  void setShowResponsesTo(List<FeedbackParticipantType> showResponsesTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showResponsesTo", showResponsesTo);
threadMonitoringController.enterService("_aBiLsbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBiywLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showResponsesTo = showResponsesTo;
threadMonitoringController.exitInternalAction("_aBiywLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBiLsbvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackParticipantType> getShowGiverNameTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBjZ0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBkA4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015787002189084163423093 = showGiverNameTo;
threadMonitoringController.exitInternalAction("_aBkA4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015787002189084163423093;
}
finally {
threadMonitoringController.exitService("_aBjZ0LvVEeyr6avTgCRLkQ");
}
}

public  void setShowGiverNameTo(List<FeedbackParticipantType> showGiverNameTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showGiverNameTo", showGiverNameTo);
threadMonitoringController.enterService("_aBkn8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBlPALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showGiverNameTo = showGiverNameTo;
threadMonitoringController.exitInternalAction("_aBlPALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBkn8LvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackParticipantType> getShowRecipientNameTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aBl2EbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBmdILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015800001389754001367013 = showRecipientNameTo;
threadMonitoringController.exitInternalAction("_aBmdILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015800001389754001367013;
}
finally {
threadMonitoringController.exitService("_aBl2EbvVEeyr6avTgCRLkQ");
}
}

public  void setShowRecipientNameTo(List<FeedbackParticipantType> showRecipientNameTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showRecipientNameTo", showRecipientNameTo);
threadMonitoringController.enterService("_aBnEMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBnrQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showRecipientNameTo = showRecipientNameTo;
threadMonitoringController.exitInternalAction("_aBnrQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aBnEMLvVEeyr6avTgCRLkQ");
}
}

private static  FeedbackQuestionDetails deserializeFeedbackQuestionDetails(String questionDetailsInJson, FeedbackQuestionType questionType) {
return JsonUtils.fromJson(questionDetailsInJson, questionType.getQuestionDetailsClass());
}

public  void update(FeedbackQuestionAttributes.UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aBoSUbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBo5YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.questionNumberOption.ifPresent(s -> questionNumber = s);
threadMonitoringController.exitInternalAction("_aBo5YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aBqulLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aBqulbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.questionDetailsOption.ifPresent(s -> questionDetails = s.getDeepCopy());
threadMonitoringController.exitInternalAction("_aBqulLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.questionDescriptionOption.ifPresent(s -> questionDescription = s);
updateOptions.giverTypeOption.ifPresent(s -> giverType = s);
updateOptions.recipientTypeOption.ifPresent(s -> recipientType = s);
updateOptions.numberOfEntitiesToGiveFeedbackToOption.ifPresent(s -> numberOfEntitiesToGiveFeedbackTo = s);
updateOptions.showResponsesToOption.ifPresent(s -> showResponsesTo = s);
updateOptions.showGiverNameToOption.ifPresent(s -> showGiverNameTo = s);
updateOptions.showRecipientNameToOption.ifPresent(s -> showRecipientNameTo = s);
threadMonitoringController.exitInternalAction("_aBqulbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
removeIrrelevantVisibilityOptions();
}
finally {
threadMonitoringController.exitService("_aBoSUbvVEeyr6avTgCRLkQ");
}
}

public static  FeedbackQuestionAttributes.UpdateOptions.Builder updateOptionsBuilder(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_aBtK0bvVEeyr6avTgCRLkQ", FeedbackQuestionAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aBtx4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackQuestionAttributes.UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301583000969999220654431 = new  FeedbackQuestionAttributes.UpdateOptions.Builder(feedbackQuestionId);
threadMonitoringController.exitInternalAction("_aBtx4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301583000969999220654431;
}
finally {
threadMonitoringController.exitService("_aBtK0bvVEeyr6avTgCRLkQ");
}
}

public static class Builder extends BasicBuilder<FeedbackQuestionAttributes, Builder> {
private final FeedbackQuestionAttributes feedbackQuestionAttributes;

private  Builder(){
super(new  UpdateOptions(""));
thisBuilder = this;
feedbackQuestionAttributes = new  FeedbackQuestionAttributes();
}
public  Builder withFeedbackSessionName(String feedbackSessionName) {
assert feedbackSessionName != null;
feedbackQuestionAttributes.feedbackSessionName = feedbackSessionName;
return this;
}

public  Builder withCourseId(String courseId) {
assert courseId != null;
feedbackQuestionAttributes.courseId = courseId;
return this;
}

@Override
public  FeedbackQuestionAttributes build() {
feedbackQuestionAttributes.update(updateOptions);
feedbackQuestionAttributes.removeIrrelevantVisibilityOptions();
return feedbackQuestionAttributes;
}

}
public static class UpdateOptions {
private String feedbackQuestionId;

private UpdateOption<FeedbackQuestionDetails> questionDetailsOption = UpdateOption.empty();

private UpdateOption<String> questionDescriptionOption = UpdateOption.empty();

private UpdateOption<Integer> questionNumberOption = UpdateOption.empty();

private UpdateOption<FeedbackParticipantType> giverTypeOption = UpdateOption.empty();

private UpdateOption<FeedbackParticipantType> recipientTypeOption = UpdateOption.empty();

private UpdateOption<Integer> numberOfEntitiesToGiveFeedbackToOption = UpdateOption.empty();

private UpdateOption<List<FeedbackParticipantType>> showResponsesToOption = UpdateOption.empty();

private UpdateOption<List<FeedbackParticipantType>> showGiverNameToOption = UpdateOption.empty();

private UpdateOption<List<FeedbackParticipantType>> showRecipientNameToOption = UpdateOption.empty();

private  UpdateOptions(String feedbackQuestionId){
assert feedbackQuestionId != null;
this.feedbackQuestionId = feedbackQuestionId;
}
public  String getFeedbackQuestionId() {
return feedbackQuestionId;
}

@Override
public  String toString() {
return "FeedbackQuestionAttributes.UpdateOptions [" + "feedbackQuestionId = " + feedbackQuestionId + ", questionDetails = " + JsonUtils.toJson(questionDetailsOption) + ", questionDescription = " + questionDescriptionOption + ", questionNumber = " + questionNumberOption + ", giverType = " + giverTypeOption + ", recipientType = " + recipientTypeOption + ", numberOfEntitiesToGiveFeedbackTo = " + numberOfEntitiesToGiveFeedbackToOption + ", showResponsesTo = " + showResponsesToOption + ", showGiverNameTo = " + showGiverNameToOption + ", showRecipientNameTo = " + showRecipientNameToOption + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(String feedbackQuestionId){
super(new  UpdateOptions(feedbackQuestionId));
thisBuilder = this;
}
@Override
public  UpdateOptions build() {
return updateOptions;
}

}
}
private abstract static class BasicBuilder<T, B extends BasicBuilder<T, B>>  {
FeedbackQuestionAttributes.UpdateOptions updateOptions;

B thisBuilder;

 BasicBuilder(UpdateOptions updateOptions){
this.updateOptions = updateOptions;
}
public  B withQuestionDetails(FeedbackQuestionDetails questionDetails) {
assert questionDetails != null;
updateOptions.questionDetailsOption = UpdateOption.of(questionDetails.getDeepCopy());
return thisBuilder;
}

public  B withQuestionDescription(String questionDescription) {
updateOptions.questionDescriptionOption = UpdateOption.of(questionDescription);
return thisBuilder;
}

public  B withQuestionNumber(int questionNumber) {
updateOptions.questionNumberOption = UpdateOption.of(questionNumber);
return thisBuilder;
}

public  B withGiverType(FeedbackParticipantType giverType) {
assert giverType != null;
updateOptions.giverTypeOption = UpdateOption.of(giverType);
return thisBuilder;
}

public  B withRecipientType(FeedbackParticipantType recipientType) {
assert recipientType != null;
updateOptions.recipientTypeOption = UpdateOption.of(recipientType);
return thisBuilder;
}

public  B withNumberOfEntitiesToGiveFeedbackTo(int numberOfEntitiesToGiveFeedbackTo) {
updateOptions.numberOfEntitiesToGiveFeedbackToOption = UpdateOption.of(numberOfEntitiesToGiveFeedbackTo);
return thisBuilder;
}

public  B withShowResponsesTo(List<FeedbackParticipantType> showResponsesTo) {
assert showResponsesTo != null;
assert !showResponsesTo.contains(null);
updateOptions.showResponsesToOption = UpdateOption.of(new  ArrayList<>(showResponsesTo));
return thisBuilder;
}

public  B withShowGiverNameTo(List<FeedbackParticipantType> showGiverNameTo) {
assert showGiverNameTo != null;
assert !showGiverNameTo.contains(null);
updateOptions.showGiverNameToOption = UpdateOption.of(new  ArrayList<>(showGiverNameTo));
return thisBuilder;
}

public  B withShowRecipientNameTo(List<FeedbackParticipantType> showRecipientNameTo) {
assert showRecipientNameTo != null;
assert !showRecipientNameTo.contains(null);
updateOptions.showRecipientNameToOption = UpdateOption.of(new  ArrayList<>(showRecipientNameTo));
return thisBuilder;
}

public abstract  T build() ;

}
}
