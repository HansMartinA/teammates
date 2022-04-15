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
threadMonitoringController.enterService("_aHitEbvVEeyr6avTgCRLkQ", FeedbackResponseCommentAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHjUILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016222004585647533897358 = frca;
threadMonitoringController.exitInternalAction("_aHjUILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016222004585647533897358;
}
finally {
threadMonitoringController.exitService("_aHitEbvVEeyr6avTgCRLkQ");
}
}

public static  Builder builder() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aHoMoLvVEeyr6avTgCRLkQ", FeedbackResponseCommentAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHozsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016230009370680337014623 = new  Builder();
threadMonitoringController.exitInternalAction("_aHozsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016230009370680337014623;
}
finally {
threadMonitoringController.exitService("_aHoMoLvVEeyr6avTgCRLkQ");
}
}

public  boolean isVisibleTo(FeedbackParticipantType viewerType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("viewerType", viewerType);
threadMonitoringController.enterService("_aHqB0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHqB0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301623800067559866914492 = showCommentTo.contains(viewerType);
threadMonitoringController.exitInternalAction("_aHqB0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301623800067559866914492;
}
finally {
threadMonitoringController.exitService("_aHqB0LvVEeyr6avTgCRLkQ");
}
}

public  Long getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aHrP8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHrP8bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Long longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301624500742219054077053 = feedbackResponseCommentId;
threadMonitoringController.exitInternalAction("_aHrP8bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301624500742219054077053;
}
finally {
threadMonitoringController.exitService("_aHrP8LvVEeyr6avTgCRLkQ");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aHseEbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHtFILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301625200836950370529244 = courseId;
threadMonitoringController.exitInternalAction("_aHtFILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301625200836950370529244;
}
finally {
threadMonitoringController.exitService("_aHseEbvVEeyr6avTgCRLkQ");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_aHuTQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHuTQbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_aHuTQbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aHuTQLvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackSessionName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aHvhYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHwIcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301626500027386656717786506 = feedbackSessionName;
threadMonitoringController.exitInternalAction("_aHwIcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301626500027386656717786506;
}
finally {
threadMonitoringController.exitService("_aHvhYLvVEeyr6avTgCRLkQ");
}
}

public  void setFeedbackSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_aHwvgbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHxWkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackSessionName = feedbackSessionName;
threadMonitoringController.exitInternalAction("_aHxWkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aHwvgbvVEeyr6avTgCRLkQ");
}
}

public  String getCommentGiver() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aHx9obvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHyksLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016279008179612952686443 = commentGiver;
threadMonitoringController.exitInternalAction("_aHyksLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016279008179612952686443;
}
finally {
threadMonitoringController.exitService("_aHx9obvVEeyr6avTgCRLkQ");
}
}

public  void setCommentGiver(String commentGiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentGiver", commentGiver);
threadMonitoringController.enterService("_aHzLwbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aHzy0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.commentGiver = commentGiver;
threadMonitoringController.exitInternalAction("_aHzy0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aHzLwbvVEeyr6avTgCRLkQ");
}
}

public  String getCommentText() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aH1A8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aH1oALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016295003538888754098072 = commentText;
threadMonitoringController.exitInternalAction("_aH1oALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016295003538888754098072;
}
finally {
threadMonitoringController.exitService("_aH1A8LvVEeyr6avTgCRLkQ");
}
}

public  void setCommentText(String commentText) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentText", commentText);
threadMonitoringController.enterService("_aH22ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aH3dMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.commentText = commentText;
threadMonitoringController.exitInternalAction("_aH3dMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aH22ILvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackResponseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aH4EQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aH4rULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016311002553296696715289 = feedbackResponseId;
threadMonitoringController.exitInternalAction("_aH4rULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016311002553296696715289;
}
finally {
threadMonitoringController.exitService("_aH4EQLvVEeyr6avTgCRLkQ");
}
}

public  void setFeedbackResponseId(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_aH55cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aH7HkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackResponseId = feedbackResponseId;
threadMonitoringController.exitInternalAction("_aH7HkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aH55cLvVEeyr6avTgCRLkQ");
}
}

public  String getFeedbackQuestionId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aH9j0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aH-x8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016324003581323027198614 = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_aH-x8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016324003581323027198614;
}
finally {
threadMonitoringController.exitService("_aH9j0LvVEeyr6avTgCRLkQ");
}
}

public  void setFeedbackQuestionId(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_aIAnILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIB1QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackQuestionId = feedbackQuestionId;
threadMonitoringController.exitInternalAction("_aIB1QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aIAnILvVEeyr6avTgCRLkQ");
}
}

public  void setShowCommentTo(List<FeedbackParticipantType> showCommentTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showCommentTo", showCommentTo);
threadMonitoringController.enterService("_aICcULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIDDYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showCommentTo = showCommentTo;
threadMonitoringController.exitInternalAction("_aIDDYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aICcULvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackParticipantType> getShowCommentTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIERgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIFfoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016346008303917101165172 = showCommentTo;
threadMonitoringController.exitInternalAction("_aIFfoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016346008303917101165172;
}
finally {
threadMonitoringController.exitService("_aIERgLvVEeyr6avTgCRLkQ");
}
}

public  void setShowGiverNameTo(List<FeedbackParticipantType> showGiverNameTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showGiverNameTo", showGiverNameTo);
threadMonitoringController.enterService("_aIFfpLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIGGsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.showGiverNameTo = showGiverNameTo;
threadMonitoringController.exitInternalAction("_aIGGsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aIFfpLvVEeyr6avTgCRLkQ");
}
}

public  List<FeedbackParticipantType> getShowGiverNameTo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIGtwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIHU0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackParticipantType> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016361008348680697856166 = showGiverNameTo;
threadMonitoringController.exitInternalAction("_aIHU0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016361008348680697856166;
}
finally {
threadMonitoringController.exitService("_aIGtwLvVEeyr6avTgCRLkQ");
}
}

public  boolean isVisibilityFollowingFeedbackQuestion() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIIi8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIJKALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016368004035962056856941 = isVisibilityFollowingFeedbackQuestion;
threadMonitoringController.exitInternalAction("_aIJKALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016368004035962056856941;
}
finally {
threadMonitoringController.exitService("_aIIi8LvVEeyr6avTgCRLkQ");
}
}

public  void setVisibilityFollowingFeedbackQuestion(boolean visibilityFollowingFeedbackQuestion) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("visibilityFollowingFeedbackQuestion", visibilityFollowingFeedbackQuestion);
threadMonitoringController.enterService("_aIJxELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIKYILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
isVisibilityFollowingFeedbackQuestion = visibilityFollowingFeedbackQuestion;
threadMonitoringController.exitInternalAction("_aIKYILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aIJxELvVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aILmQbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIMNULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016383003848647229292841 = createdAt;
threadMonitoringController.exitInternalAction("_aIMNULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016383003848647229292841;
}
finally {
threadMonitoringController.exitService("_aILmQbvVEeyr6avTgCRLkQ");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_aINbcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIOpkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_aIOpkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aINbcLvVEeyr6avTgCRLkQ");
}
}

public  String getLastEditorEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIQewLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIRF0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130164000027148932616972477 = lastEditorEmail;
threadMonitoringController.exitInternalAction("_aIRF0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130164000027148932616972477;
}
finally {
threadMonitoringController.exitService("_aIQewLvVEeyr6avTgCRLkQ");
}
}

public  void setLastEditorEmail(String lastEditorEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("lastEditorEmail", lastEditorEmail);
threadMonitoringController.enterService("_aIRs4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIST8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.lastEditorEmail = lastEditorEmail;
threadMonitoringController.exitInternalAction("_aIST8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aIRs4LvVEeyr6avTgCRLkQ");
}
}

public  Instant getLastEditedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIS7ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aITiELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130164150022300061751859512 = lastEditedAt;
threadMonitoringController.exitInternalAction("_aITiELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130164150022300061751859512;
}
finally {
threadMonitoringController.exitService("_aIS7ALvVEeyr6avTgCRLkQ");
}
}

public  void setLastEditedAt(Instant lastEditedAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("lastEditedAt", lastEditedAt);
threadMonitoringController.enterService("_aIUwMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIVXQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.lastEditedAt = lastEditedAt;
threadMonitoringController.exitInternalAction("_aIVXQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aIUwMLvVEeyr6avTgCRLkQ");
}
}

public  String getGiverSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIWlYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIXMcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301643100785678930837553 = giverSection;
threadMonitoringController.exitInternalAction("_aIXMcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301643100785678930837553;
}
finally {
threadMonitoringController.exitService("_aIWlYLvVEeyr6avTgCRLkQ");
}
}

public  String getReceiverSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIXzgbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIYakLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016439002548368834578355 = receiverSection;
threadMonitoringController.exitInternalAction("_aIYakLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016439002548368834578355;
}
finally {
threadMonitoringController.exitService("_aIXzgbvVEeyr6avTgCRLkQ");
}
}

public  FeedbackParticipantType getCommentGiverType() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIZosLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIZosbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackParticipantType longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016446008165432410119392 = commentGiverType;
threadMonitoringController.exitInternalAction("_aIZosbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016446008165432410119392;
}
finally {
threadMonitoringController.exitService("_aIZosLvVEeyr6avTgCRLkQ");
}
}

public  void setCommentGiverType(FeedbackParticipantType commentGiverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentGiverType", commentGiverType);
threadMonitoringController.enterService("_aIa20LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIbd4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.commentGiverType = commentGiverType;
threadMonitoringController.exitInternalAction("_aIbd4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aIa20LvVEeyr6avTgCRLkQ");
}
}

public  boolean isCommentFromFeedbackParticipant() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIcE8bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIcsALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301646000491558656657621 = isCommentFromFeedbackParticipant;
threadMonitoringController.exitInternalAction("_aIcsALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301646000491558656657621;
}
finally {
threadMonitoringController.exitService("_aIcE8bvVEeyr6avTgCRLkQ");
}
}

public  void setCommentFromFeedbackParticipant(boolean commentFromFeedbackParticipant) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentFromFeedbackParticipant", commentFromFeedbackParticipant);
threadMonitoringController.enterService("_aIdTEbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aId6ILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
isCommentFromFeedbackParticipant = commentFromFeedbackParticipant;
threadMonitoringController.exitInternalAction("_aId6ILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aIdTEbvVEeyr6avTgCRLkQ");
}
}

public  void setId(Long id) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("id", id);
threadMonitoringController.enterService("_aIfvULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIgWYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.feedbackResponseCommentId = id;
threadMonitoringController.exitInternalAction("_aIgWYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aIfvULvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIg9cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIhkgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_aIhkgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aIkAxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_aIkAxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aInrI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForFeedbackSessionName(feedbackSessionName), errors);
threadMonitoringController.exitInternalAction("_aInrI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aIoSNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aIo5Q7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCommentGiverType(commentGiverType), errors);
threadMonitoringController.exitInternalAction("_aIo5Q7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aIoSNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aIpgVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aIpgWLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForVisibilityOfFeedbackParticipantComments(isCommentFromFeedbackParticipant, isVisibilityFollowingFeedbackQuestion), errors);
threadMonitoringController.exitInternalAction("_aIpgWLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aIpgVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aIpgWbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016510008116046428943795 = errors;
threadMonitoringController.exitInternalAction("_aIpgWbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016510008116046428943795;
}
finally {
threadMonitoringController.exitService("_aIg9cLvVEeyr6avTgCRLkQ");
}
}

@Override
public  FeedbackResponseComment toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIqucbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIrVgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
FeedbackResponseComment longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016518008404301670305165 = new  FeedbackResponseComment(courseId, feedbackSessionName, feedbackQuestionId, commentGiver, commentGiverType, feedbackResponseId, createdAt, commentText, giverSection, receiverSection, showCommentTo, showGiverNameTo, lastEditorEmail, lastEditedAt, isCommentFromFeedbackParticipant, isVisibilityFollowingFeedbackQuestion);
threadMonitoringController.exitInternalAction("_aIrVgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016518008404301670305165;
}
finally {
threadMonitoringController.exitService("_aIqucbvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIsjoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
this.commentText = SanitizationHelper.sanitizeForRichText(this.commentText);
}
finally {
threadMonitoringController.exitService("_aIsjoLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIvm8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIw1ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016528009422664495874824 = "FeedbackResponseCommentAttributes [" + "feedbackResponseCommentId = " + feedbackResponseCommentId + ", courseId = " + courseId + ", feedbackSessionName = " + feedbackSessionName + ", feedbackQuestionId = " + feedbackQuestionId + ", commentGiver = " + commentGiver + ", feedbackResponseId = " + feedbackResponseId + ", commentText = " + commentText + ", createdAt = " + createdAt + ", lastEditorEmail = " + lastEditorEmail + ", lastEditedAt = " + lastEditedAt + ", giverSection = " + giverSection + ", receiverSection = " + receiverSection + ", showCommentTo = " + showCommentTo + ", showGiverNameTo = " + showGiverNameTo + ", commentGiverType = " + commentGiverType + ", isVisibilityFollowingFeedbackQuestion = " + isVisibilityFollowingFeedbackQuestion + ", isCommentFromFeedbackParticipant = " + isCommentFromFeedbackParticipant + "]";
threadMonitoringController.exitInternalAction("_aIw1ELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016528009422664495874824;
}
finally {
threadMonitoringController.exitService("_aIvm8LvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aIyDMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aIyqQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.feedbackSessionName).append(this.feedbackQuestionId).append(this.feedbackResponseId).append(this.courseId).append(this.commentGiver).append(this.commentText).append(this.giverSection).append(this.receiverSection);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165380047688909625881404 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_aIyqQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165380047688909625881404;
}
finally {
threadMonitoringController.exitService("_aIyDMLvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_aI1GgbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aI27sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165490016336475829409058 = false;
threadMonitoringController.exitInternalAction("_aI27sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165490016336475829409058;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165490046202104245770026 = true;
threadMonitoringController.exitInternalAction("_aI27sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165490046202104245770026;
}
else
if (this.getClass() == other.getClass())
{
FeedbackResponseCommentAttributes otherCommentAttributes = (FeedbackResponseCommentAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016549005536916105138711 = Objects.equals(this.feedbackSessionName, otherCommentAttributes.feedbackSessionName) && Objects.equals(this.feedbackResponseId, otherCommentAttributes.feedbackResponseId) && Objects.equals(this.feedbackQuestionId, otherCommentAttributes.feedbackQuestionId) && Objects.equals(this.courseId, otherCommentAttributes.courseId) && Objects.equals(this.commentGiver, otherCommentAttributes.commentGiver) && Objects.equals(this.commentText, otherCommentAttributes.commentText) && Objects.equals(this.giverSection, otherCommentAttributes.giverSection) && Objects.equals(this.receiverSection, otherCommentAttributes.receiverSection);
threadMonitoringController.exitInternalAction("_aI27sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016549005536916105138711;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165490024294317316421976 = false;
threadMonitoringController.exitInternalAction("_aI27sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165490024294317316421976;
}
}
finally {
threadMonitoringController.exitService("_aI1GgbvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aI3iwbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aI4w4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.feedbackResponseIdOption.ifPresent(s -> feedbackResponseId = s);
updateOptions.commentTextOption.ifPresent(s -> commentText = s);
updateOptions.showCommentToOption.ifPresent(s -> showCommentTo = s);
updateOptions.showGiverNameToOption.ifPresent(s -> showGiverNameTo = s);
updateOptions.lastEditorEmailOption.ifPresent(s -> lastEditorEmail = s);
updateOptions.lastEditedAtOption.ifPresent(s -> lastEditedAt = s);
updateOptions.giverSectionOption.ifPresent(s -> giverSection = s);
updateOptions.receiverSectionOption.ifPresent(s -> receiverSection = s);
threadMonitoringController.exitInternalAction("_aI4w4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aI3iwbvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(long feedbackResponseCommentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseCommentId", feedbackResponseCommentId);
threadMonitoringController.enterService("_aI6mELvVEeyr6avTgCRLkQ", FeedbackResponseCommentAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aI7NILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016566004539046710410649 = new  UpdateOptions.Builder(feedbackResponseCommentId);
threadMonitoringController.exitInternalAction("_aI7NILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016566004539046710410649;
}
finally {
threadMonitoringController.exitService("_aI6mELvVEeyr6avTgCRLkQ");
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
