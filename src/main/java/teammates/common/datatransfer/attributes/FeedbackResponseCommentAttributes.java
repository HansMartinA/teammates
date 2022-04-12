package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.util.Const;
import teammates.common.util.FieldValidator;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.FeedbackResponseComment;
public class FeedbackResponseCommentAttributes extends EntityAttributes<FeedbackResponseComment> {
private Long feedbackResponseCommentId;

private String courseId;

private String feedbackSessionName;

private String commentGiver;

private String commentText;

private String feedbackResponseId;

private String feedbackQuestionId;

private List<FeedbackParticipantType> showCommentTo;

private List<FeedbackParticipantType> showGiverNameTo;

private boolean isVisibilityFollowingFeedbackQuestion;

private Instant createdAt;

private String lastEditorEmail;

private Instant lastEditedAt;

private String giverSection;

private String receiverSection;

private FeedbackParticipantType commentGiverType;

private boolean isCommentFromFeedbackParticipant;

private  FeedbackResponseCommentAttributes(){
giverSection = Const.DEFAULT_SECTION;
receiverSection = Const.DEFAULT_SECTION;
showCommentTo = new  ArrayList<>();
showGiverNameTo = new  ArrayList<>();
isVisibilityFollowingFeedbackQuestion = true;
createdAt = Instant.now();
commentGiverType = FeedbackParticipantType.INSTRUCTORS;
isCommentFromFeedbackParticipant = false;
}
public static  FeedbackResponseCommentAttributes valueOf(FeedbackResponseComment comment) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("comment", comment);
threadMonitoringController.enterService("_rsk-wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rsk-wbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseCommentAttributes frca = new  FeedbackResponseCommentAttributes();
frca.courseId = comment.getCourseId();
frca.feedbackSessionName = comment.getFeedbackSessionName();
frca.commentGiver = comment.getGiverEmail();
frca.commentText = comment.getCommentText();
frca.feedbackResponseId = comment.getFeedbackResponseId();
frca.feedbackQuestionId = comment.getFeedbackQuestionId();
if (comment.getShowCommentTo() != null)
{
frca.showCommentTo = new  ArrayList<>(comment.getShowCommentTo());
}
if (comment.getShowGiverNameTo() != null)
{
frca.showGiverNameTo = new  ArrayList<>(comment.getShowGiverNameTo());
}
frca.isVisibilityFollowingFeedbackQuestion = comment.getIsVisibilityFollowingFeedbackQuestion();
if (comment.getCreatedAt() != null)
{
frca.createdAt = comment.getCreatedAt();
}
if (comment.getLastEditorEmail() == null)
{
frca.lastEditorEmail = frca.getCommentGiver();
}
else
{
frca.lastEditorEmail = comment.getLastEditorEmail();
}
if (comment.getLastEditedAt() == null)
{
frca.lastEditedAt = frca.getCreatedAt();
}
else
{
frca.lastEditedAt = comment.getLastEditedAt();
}
frca.feedbackResponseCommentId = comment.getFeedbackResponseCommentId();
if (comment.getGiverSection() != null)
{
frca.giverSection = comment.getGiverSection();
}
if (comment.getReceiverSection() != null)
{
frca.receiverSection = comment.getReceiverSection();
}
frca.commentGiverType = comment.getCommentGiverType();
frca.isCommentFromFeedbackParticipant = comment.getIsCommentFromFeedbackParticipant();
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679532007659501982910003 = frca;
threadMonitoringController.exitInternalAction("_rsk-wbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679532007659501982910003;
}
finally {
threadMonitoringController.exitService("_rsk-wLngEeyIw-dB1KCaVA");
}
}

public static  Builder builder() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rspQMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rsp3QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679534009767862590767997 = new  Builder();
threadMonitoringController.exitInternalAction("_rsp3QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679534009767862590767997;
}
finally {
threadMonitoringController.exitService("_rspQMLngEeyIw-dB1KCaVA");
}
}

public  boolean isVisibleTo(FeedbackParticipantType viewerType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("viewerType", viewerType);
threadMonitoringController.enterService("_rsrFYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rsrscLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679536008921079819373767 = showCommentTo.contains(viewerType);
threadMonitoringController.exitInternalAction("_rsrscLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679536008921079819373767;
}
finally {
threadMonitoringController.exitService("_rsrFYLngEeyIw-dB1KCaVA");
}
}

public  Long getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rssTgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rss6kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679540009998914076897765 = feedbackResponseCommentId;
threadMonitoringController.exitInternalAction("_rss6kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679540009998914076897765;
}
finally {
threadMonitoringController.exitService("_rssTgLngEeyIw-dB1KCaVA");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rsthobngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rsuIsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679542005827189373132206 = courseId;
threadMonitoringController.exitInternalAction("_rsuIsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679542005827189373132206;
}
finally {
threadMonitoringController.exitService("_rsthobngEeyIw-dB1KCaVA");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_rsuvwbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rsvW0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_rsvW0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rsuvwbngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rswk8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rsxMALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795470011886812869053476 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_rsxMALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795470011886812869053476;
}
finally {
threadMonitoringController.exitService("_rswk8LngEeyIw-dB1KCaVA");
}
}

public  void setFeedbackSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_rsyaILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rszBMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackSessionName = feedbackSessionName;
threadMonitoringController.exitInternalAction("_rszBMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rsyaILngEeyIw-dB1KCaVA");
}
}

public  String getCommentGiver() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rszoQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs0PULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679551009313972599863719 = commentGiver;
threadMonitoringController.exitInternalAction("_rs0PULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679551009313972599863719;
}
finally {
threadMonitoringController.exitService("_rszoQLngEeyIw-dB1KCaVA");
}
}

public  void setCommentGiver(String commentGiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentGiver", commentGiver);
threadMonitoringController.enterService("_rs02YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs02YbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.commentGiver = commentGiver;
threadMonitoringController.exitInternalAction("_rs02YbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rs02YLngEeyIw-dB1KCaVA");
}
}

public  String getCommentText() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rs2EgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs2EgbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795560008211418060881659 = commentText;
threadMonitoringController.exitInternalAction("_rs2EgbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795560008211418060881659;
}
finally {
threadMonitoringController.exitService("_rs2EgLngEeyIw-dB1KCaVA");
}
}

public  void setCommentText(String commentText) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentText", commentText);
threadMonitoringController.enterService("_rs3SoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs35sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.commentText = commentText;
threadMonitoringController.exitInternalAction("_rs35sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rs3SoLngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackResponseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rs4gwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs5H0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679562006468655434632887 = feedbackResponseId;
threadMonitoringController.exitInternalAction("_rs5H0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679562006468655434632887;
}
finally {
threadMonitoringController.exitService("_rs4gwLngEeyIw-dB1KCaVA");
}
}

public  void setFeedbackResponseId(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_rs5u4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs6V8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackResponseId = feedbackResponseId;
threadMonitoringController.exitInternalAction("_rs6V8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rs5u4LngEeyIw-dB1KCaVA");
}
}

public  String getFeedbackQuestionId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rs7kELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs8LILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679566005036798412915928 = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_rs8LILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679566005036798412915928;
}
finally {
threadMonitoringController.exitService("_rs7kELngEeyIw-dB1KCaVA");
}
}

public  void setFeedbackQuestionId(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_rs9ZQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs-AULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackQuestionId = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_rs-AULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rs9ZQLngEeyIw-dB1KCaVA");
}
}

public  void setShowCommentTo(List<FeedbackParticipantType> showCommentTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showCommentTo", showCommentTo);
threadMonitoringController.enterService("_rs-nYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs-nYbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showCommentTo = showCommentTo;
threadMonitoringController.exitInternalAction("_rs-nYbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rs-nYLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackParticipantType> getShowCommentTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rs_1gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rs_1gbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679573005420669650872119 = showCommentTo;
threadMonitoringController.exitInternalAction("_rs_1gbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679573005420669650872119;
}
finally {
threadMonitoringController.exitService("_rs_1gLngEeyIw-dB1KCaVA");
}
}

public  void setShowGiverNameTo(List<FeedbackParticipantType> showGiverNameTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showGiverNameTo", showGiverNameTo);
threadMonitoringController.enterService("_rtAckbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtBDoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showGiverNameTo = showGiverNameTo;
threadMonitoringController.exitInternalAction("_rtBDoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtAckbngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackParticipantType> getShowGiverNameTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtBqsbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtCRwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679580008847458916715154 = showGiverNameTo;
threadMonitoringController.exitInternalAction("_rtCRwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679580008847458916715154;
}
finally {
threadMonitoringController.exitService("_rtBqsbngEeyIw-dB1KCaVA");
}
}

public  boolean isVisibilityFollowingFeedbackQuestion() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtC40bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtDf4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795810016917759420685818 = isVisibilityFollowingFeedbackQuestion;
threadMonitoringController.exitInternalAction("_rtDf4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795810016917759420685818;
}
finally {
threadMonitoringController.exitService("_rtC40bngEeyIw-dB1KCaVA");
}
}

public  void setVisibilityFollowingFeedbackQuestion(boolean visibilityFollowingFeedbackQuestion) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("visibilityFollowingFeedbackQuestion", visibilityFollowingFeedbackQuestion);
threadMonitoringController.enterService("_rtEG8bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtEuALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
isVisibilityFollowingFeedbackQuestion = visibilityFollowingFeedbackQuestion;
threadMonitoringController.exitInternalAction("_rtEuALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtEG8bngEeyIw-dB1KCaVA");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtF8ILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtGjMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679585005517853063310466 = createdAt;
threadMonitoringController.exitInternalAction("_rtGjMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679585005517853063310466;
}
finally {
threadMonitoringController.exitService("_rtF8ILngEeyIw-dB1KCaVA");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_rtHKQbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtHxULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_rtHxULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtHKQbngEeyIw-dB1KCaVA");
}
}

public  String getLastEditorEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtIYYbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtI_cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795930026071658924557994 = lastEditorEmail;
threadMonitoringController.exitInternalAction("_rtI_cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136795930026071658924557994;
}
finally {
threadMonitoringController.exitService("_rtIYYbngEeyIw-dB1KCaVA");
}
}

public  void setLastEditorEmail(String lastEditorEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("lastEditorEmail", lastEditorEmail);
threadMonitoringController.enterService("_rtJmgbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtKNkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.lastEditorEmail = lastEditorEmail;
threadMonitoringController.exitInternalAction("_rtKNkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtJmgbngEeyIw-dB1KCaVA");
}
}

public  Instant getLastEditedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtK0obngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtLbsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679597004402782003393838 = lastEditedAt;
threadMonitoringController.exitInternalAction("_rtLbsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679597004402782003393838;
}
finally {
threadMonitoringController.exitService("_rtK0obngEeyIw-dB1KCaVA");
}
}

public  void setLastEditedAt(Instant lastEditedAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("lastEditedAt", lastEditedAt);
threadMonitoringController.enterService("_rtMCwbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtMp0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.lastEditedAt = lastEditedAt;
threadMonitoringController.exitInternalAction("_rtMp0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtMCwbngEeyIw-dB1KCaVA");
}
}

public  String getGiverSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtNQ4bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtN38LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679602009139346982723953 = giverSection;
threadMonitoringController.exitInternalAction("_rtN38LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679602009139346982723953;
}
finally {
threadMonitoringController.exitService("_rtNQ4bngEeyIw-dB1KCaVA");
}
}

public  String getReceiverSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtOfAbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtPGELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679605008081572689137083 = receiverSection;
threadMonitoringController.exitInternalAction("_rtPGELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679605008081572689137083;
}
finally {
threadMonitoringController.exitService("_rtOfAbngEeyIw-dB1KCaVA");
}
}

public  FeedbackParticipantType getCommentGiverType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtQUMbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtRiULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679607003508668760773517 = commentGiverType;
threadMonitoringController.exitInternalAction("_rtRiULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679607003508668760773517;
}
finally {
threadMonitoringController.exitService("_rtQUMbngEeyIw-dB1KCaVA");
}
}

public  void setCommentGiverType(FeedbackParticipantType commentGiverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentGiverType", commentGiverType);
threadMonitoringController.enterService("_rtSJYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtSwcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.commentGiverType = commentGiverType;
threadMonitoringController.exitInternalAction("_rtSwcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtSJYLngEeyIw-dB1KCaVA");
}
}

public  boolean isCommentFromFeedbackParticipant() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtT-kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtUloLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679612006883543140919337 = isCommentFromFeedbackParticipant;
threadMonitoringController.exitInternalAction("_rtUloLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679612006883543140919337;
}
finally {
threadMonitoringController.exitService("_rtT-kLngEeyIw-dB1KCaVA");
}
}

public  void setCommentFromFeedbackParticipant(boolean commentFromFeedbackParticipant) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentFromFeedbackParticipant", commentFromFeedbackParticipant);
threadMonitoringController.enterService("_rtVMsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtVzwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
isCommentFromFeedbackParticipant = commentFromFeedbackParticipant;
threadMonitoringController.exitInternalAction("_rtVzwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtVMsLngEeyIw-dB1KCaVA");
}
}

public  void setId(Long id) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("id", id);
threadMonitoringController.enterService("_rtWa0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtXB4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackResponseCommentId = id;
threadMonitoringController.exitInternalAction("_rtXB4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtWa0LngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtYQALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtY3ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_rtY3ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rtbTVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_rtbTVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rte9s7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForFeedbackSessionName(feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_rte9s7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rtfkxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rtfkyLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCommentGiverType(commentGiverType), errors);
threadMonitoringController.exitInternalAction("_rtfkyLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rtfkxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rtgL1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rtgL2LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForVisibilityOfFeedbackParticipantComments(isCommentFromFeedbackParticipant, isVisibilityFollowingFeedbackQuestion), errors);
threadMonitoringController.exitInternalAction("_rtgL2LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rtgL1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rtgL2bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679628007258437178582822 = errors;
threadMonitoringController.exitInternalAction("_rtgL2bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679628007258437178582822;
}
finally {
threadMonitoringController.exitService("_rtYQALngEeyIw-dB1KCaVA");
}
}

@Override
public  FeedbackResponseComment toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rthZ8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtiBALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseComment longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679631009124349012192385 = new  FeedbackResponseComment(courseId, feedbackSessionName, feedbackQuestionId, commentGiver, commentGiverType, feedbackResponseId, createdAt, commentText, giverSection, receiverSection, showCommentTo, showGiverNameTo, lastEditorEmail, lastEditedAt, isCommentFromFeedbackParticipant, isVisibilityFollowingFeedbackQuestion);
threadMonitoringController.exitInternalAction("_rtiBALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679631009124349012192385;
}
finally {
threadMonitoringController.exitService("_rthZ8LngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtioEbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
this.commentText = SanitizationHelper.sanitizeForRichText(this.commentText);
}
finally {
threadMonitoringController.exitService("_rtioEbngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtlEULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtlrYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679634007274671543853738 = "FeedbackResponseCommentAttributes [" + "feedbackResponseCommentId = " + feedbackResponseCommentId + ", courseId = " + courseId + ", feedbackSessionName = " + feedbackSessionName + ", feedbackQuestionId = " + feedbackQuestionId + ", commentGiver = " + commentGiver + ", feedbackResponseId = " + feedbackResponseId + ", commentText = " + commentText + ", createdAt = " + createdAt + ", lastEditorEmail = " + lastEditorEmail + ", lastEditedAt = " + lastEditedAt + ", giverSection = " + giverSection + ", receiverSection = " + receiverSection + ", showCommentTo = " + showCommentTo + ", showGiverNameTo = " + showGiverNameTo + ", commentGiverType = " + commentGiverType + ", isVisibilityFollowingFeedbackQuestion = " + isVisibilityFollowingFeedbackQuestion + ", isCommentFromFeedbackParticipant = " + isCommentFromFeedbackParticipant + "]";
threadMonitoringController.exitInternalAction("_rtlrYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679634007274671543853738;
}
finally {
threadMonitoringController.exitService("_rtlEULngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rtmScbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtm5gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.feedbackSessionName).append(this.feedbackQuestionId).append(this.feedbackResponseId).append(this.courseId).append(this.commentGiver).append(this.commentText).append(this.giverSection).append(this.receiverSection);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679636009755149548521141 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_rtm5gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679636009755149548521141;
}
finally {
threadMonitoringController.exitService("_rtmScbngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_rtpVwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtrK8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679640005402973338811969 = false;
threadMonitoringController.exitInternalAction("_rtrK8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679640005402973338811969;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679640006252357375969471 = true;
threadMonitoringController.exitInternalAction("_rtrK8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679640006252357375969471;
}
else
if (this.getClass() == other.getClass())
{
FeedbackResponseCommentAttributes otherCommentAttributes = (FeedbackResponseCommentAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679640002656200583110476 = Objects.equals(this.feedbackSessionName, otherCommentAttributes.feedbackSessionName) && Objects.equals(this.feedbackResponseId, otherCommentAttributes.feedbackResponseId) && Objects.equals(this.feedbackQuestionId, otherCommentAttributes.feedbackQuestionId) && Objects.equals(this.courseId, otherCommentAttributes.courseId) && Objects.equals(this.commentGiver, otherCommentAttributes.commentGiver) && Objects.equals(this.commentText, otherCommentAttributes.commentText) && Objects.equals(this.giverSection, otherCommentAttributes.giverSection) && Objects.equals(this.receiverSection, otherCommentAttributes.receiverSection);
threadMonitoringController.exitInternalAction("_rtrK8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679640002656200583110476;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136796400049394805603183245 = false;
threadMonitoringController.exitInternalAction("_rtrK8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136796400049394805603183245;
}
}
finally {
threadMonitoringController.exitService("_rtpVwLngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_rtryALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtsZELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.feedbackResponseIdOption.ifPresent(s -> feedbackResponseId = s);
updateOptions.commentTextOption.ifPresent(s -> commentText = s);
updateOptions.showCommentToOption.ifPresent(s -> showCommentTo = s);
updateOptions.showGiverNameToOption.ifPresent(s -> showGiverNameTo = s);
updateOptions.lastEditorEmailOption.ifPresent(s -> lastEditorEmail = s);
updateOptions.lastEditedAtOption.ifPresent(s -> lastEditedAt = s);
updateOptions.giverSectionOption.ifPresent(s -> giverSection = s);
updateOptions.receiverSectionOption.ifPresent(s -> receiverSection = s);
threadMonitoringController.exitInternalAction("_rtsZELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rtryALngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(long feedbackResponseCommentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseCommentId", feedbackResponseCommentId);
threadMonitoringController.enterService("_rtu1ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rtvcYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679646008391442808398228 = new  UpdateOptions.Builder(feedbackResponseCommentId);
threadMonitoringController.exitInternalAction("_rtvcYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679646008391442808398228;
}
finally {
threadMonitoringController.exitService("_rtu1ULngEeyIw-dB1KCaVA");
}
}

public static class Builder extends BasicBuilder<FeedbackResponseCommentAttributes, Builder> {
private final FeedbackResponseCommentAttributes frca;

private  Builder(){
super(new  UpdateOptions(0L));
thisBuilder = this;
frca = new  FeedbackResponseCommentAttributes();
}
public  Builder withCourseId(String courseId) {
assert courseId != null;
frca.courseId = courseId;
return this;
}

public  Builder withFeedbackSessionName(String feedbackSessionName) {
assert feedbackSessionName != null;
frca.feedbackSessionName = feedbackSessionName;
return this;
}

public  Builder withCommentGiver(String commentGiver) {
assert commentGiver != null;
frca.commentGiver = commentGiver;
return this;
}

public  Builder withFeedbackQuestionId(String feedbackQuestionId) {
assert feedbackQuestionId != null;
frca.feedbackQuestionId = feedbackQuestionId;
return this;
}

public  Builder withVisibilityFollowingFeedbackQuestion(boolean visibilityFollowingFeedbackQuestion) {
frca.isVisibilityFollowingFeedbackQuestion = visibilityFollowingFeedbackQuestion;
return this;
}

public  Builder withCommentGiverType(FeedbackParticipantType commentGiverType) {
assert commentGiverType != null;
frca.commentGiverType = commentGiverType;
return this;
}

public  Builder withCommentFromFeedbackParticipant(boolean isCommentFromFeedbackParticipant) {
frca.isCommentFromFeedbackParticipant = isCommentFromFeedbackParticipant;
return this;
}

@Override
public  FeedbackResponseCommentAttributes build() {
frca.update(updateOptions);
return frca;
}

}
public static class UpdateOptions {
private long feedbackResponseCommentId;

private UpdateOption<String> feedbackResponseIdOption = UpdateOption.empty();

private UpdateOption<String> commentTextOption = UpdateOption.empty();

private UpdateOption<List<FeedbackParticipantType>> showCommentToOption = UpdateOption.empty();

private UpdateOption<List<FeedbackParticipantType>> showGiverNameToOption = UpdateOption.empty();

private UpdateOption<String> lastEditorEmailOption = UpdateOption.empty();

private UpdateOption<Instant> lastEditedAtOption = UpdateOption.empty();

private UpdateOption<String> giverSectionOption = UpdateOption.empty();

private UpdateOption<String> receiverSectionOption = UpdateOption.empty();

private  UpdateOptions(long feedbackResponseCommentId){
this.feedbackResponseCommentId = feedbackResponseCommentId;
}
public  long getFeedbackResponseCommentId() {
return feedbackResponseCommentId;
}

@Override
public  String toString() {
return "FeedbackResponseCommentAttributes.UpdateOptions [" + "feedbackResponseCommentId = " + feedbackResponseCommentId + ", commentText = " + commentTextOption + ", showCommentTo = " + showCommentToOption + ", showGiverNameTo = " + showGiverNameToOption + ", lastEditorEmail = " + lastEditorEmailOption + ", giverSection = " + giverSectionOption + ", receiverSection = " + receiverSectionOption + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(Long feedbackResponseCommentId){
super(new  UpdateOptions(feedbackResponseCommentId));
thisBuilder = this;
}
public  Builder withLastEditorEmail(String lastEditorEmail) {
assert lastEditorEmail != null;
updateOptions.lastEditorEmailOption = UpdateOption.of(lastEditorEmail);
return this;
}

public  Builder withLastEditorAt(Instant lastEditedAt) {
assert lastEditedAt != null;
updateOptions.lastEditedAtOption = UpdateOption.of(lastEditedAt);
return this;
}

@Override
public  UpdateOptions build() {
return updateOptions;
}

}
}
private abstract static class BasicBuilder<T, B extends BasicBuilder<T, B>>  {
UpdateOptions updateOptions;

B thisBuilder;

 BasicBuilder(UpdateOptions updateOptions){
this.updateOptions = updateOptions;
}
public  B withFeedbackResponseId(String feedbackResponseId) {
assert feedbackResponseId != null;
updateOptions.feedbackResponseIdOption = UpdateOption.of(feedbackResponseId);
return thisBuilder;
}

public  B withCommentText(String commentText) {
assert commentText != null;
updateOptions.commentTextOption = UpdateOption.of(commentText);
return thisBuilder;
}

public  B withShowCommentTo(List<FeedbackParticipantType> showCommentTo) {
assert showCommentTo != null;
updateOptions.showCommentToOption = UpdateOption.of(showCommentTo);
return thisBuilder;
}

public  B withShowGiverNameTo(List<FeedbackParticipantType> showGiverNameTo) {
assert showGiverNameTo != null;
updateOptions.showGiverNameToOption = UpdateOption.of(showGiverNameTo);
return thisBuilder;
}

public  B withGiverSection(String giverSection) {
assert giverSection != null;
updateOptions.giverSectionOption = UpdateOption.of(giverSection);
return thisBuilder;
}

public  B withReceiverSection(String receiverSection) {
assert receiverSection != null;
updateOptions.receiverSectionOption = UpdateOption.of(receiverSection);
return thisBuilder;
}

public abstract  T build() ;

}
}
