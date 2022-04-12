package teammates.storage.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Translate;
import com.googlecode.objectify.annotation.Unindex;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.util.SanitizationHelper;
@Entity
@Index
public class FeedbackResponseComment extends BaseEntity {
@Id
private transient Long feedbackResponseCommentId;

private String courseId;

private String feedbackSessionName;

private String feedbackQuestionId;

private String giverEmail;

private FeedbackParticipantType commentGiverType;

private String feedbackResponseId;

private String giverSection;

private String receiverSection;

private List<FeedbackParticipantType> showCommentTo = new  ArrayList<>();

private List<FeedbackParticipantType> showGiverNameTo = new  ArrayList<>();

private Boolean isVisibilityFollowingFeedbackQuestion;

private boolean isCommentFromFeedbackParticipant;

@Translate(InstantTranslatorFactory.class)
private Instant createdAt;

@Unindex
private String commentText;

private String lastEditorEmail;

@Translate(InstantTranslatorFactory.class)
private Instant lastEditedAt;

@SuppressWarnings("unused")
private  FeedbackResponseComment(){
}
public  FeedbackResponseComment(String courseId, String feedbackSessionName, String feedbackQuestionId, String giverEmail, FeedbackParticipantType commentGiverType, String feedbackResponseId, Instant createdAt, String commentText, String giverSection, String receiverSection, List<FeedbackParticipantType> showCommentTo, List<FeedbackParticipantType> showGiverNameTo, String lastEditorEmail, Instant lastEditedAt, boolean isCommentFromFeedbackParticipant, boolean isVisibilityFollowingFeedbackQuestion){
this.feedbackResponseCommentId = null;
this.courseId = courseId;
this.feedbackSessionName = feedbackSessionName;
this.feedbackQuestionId = feedbackQuestionId;
this.giverEmail = giverEmail;
this.commentGiverType = commentGiverType;
this.feedbackResponseId = feedbackResponseId;
this.createdAt = createdAt;
this.commentText = SanitizationHelper.sanitizeForRichText(commentText);
this.giverSection = giverSection;
this.receiverSection = receiverSection;
this.showCommentTo = showCommentTo == null ? new  ArrayList<>() : showCommentTo;
this.showGiverNameTo = showGiverNameTo == null ? new  ArrayList<>() : showGiverNameTo;
this.isVisibilityFollowingFeedbackQuestion = isVisibilityFollowingFeedbackQuestion;
this.lastEditorEmail = lastEditorEmail == null ? giverEmail : lastEditorEmail;
this.lastEditedAt = lastEditedAt == null ? this.createdAt : lastEditedAt;
this.isCommentFromFeedbackParticipant = isCommentFromFeedbackParticipant;
}
public  Long getFeedbackResponseCommentId() {
return feedbackResponseCommentId;
}

public  String getCourseId() {
return courseId;
}

public  void setCourseId(String courseId) {
this.courseId = courseId;
}

public  String getFeedbackSessionName() {
return feedbackSessionName;
}

public  void setFeedbackSessionName(String feedbackSessionName) {
this.feedbackSessionName = feedbackSessionName;
}

public  String getFeedbackQuestionId() {
return feedbackQuestionId;
}

public  void setFeedbackQuestionId(String feedbackQuestionId) {
this.feedbackQuestionId = feedbackQuestionId;
}

public  boolean getIsVisibilityFollowingFeedbackQuestion() {
if (this.isVisibilityFollowingFeedbackQuestion == null)
{
return true;
}
return this.isVisibilityFollowingFeedbackQuestion;
}

public  void setIsVisibilityFollowingFeedbackQuestion(Boolean isVisibilityFollowingFeedbackQuestion) {
this.isVisibilityFollowingFeedbackQuestion = isVisibilityFollowingFeedbackQuestion;
}

public  String getGiverEmail() {
return giverEmail;
}

public  void setGiverEmail(String giverEmail) {
this.giverEmail = giverEmail;
}

public  FeedbackParticipantType getCommentGiverType() {
return commentGiverType;
}

public  void setCommentGiverType(FeedbackParticipantType commentGiverType) {
this.commentGiverType = commentGiverType;
}

public  void setShowCommentTo(List<FeedbackParticipantType> showCommentTo) {
this.showCommentTo = showCommentTo;
}

public  List<FeedbackParticipantType> getShowCommentTo() {
return showCommentTo;
}

public  void setShowGiverNameTo(List<FeedbackParticipantType> showGiverNameTo) {
this.showGiverNameTo = showGiverNameTo;
}

public  List<FeedbackParticipantType> getShowGiverNameTo() {
return showGiverNameTo;
}

public  String getFeedbackResponseId() {
return feedbackResponseId;
}

public  void setFeedbackResponseId(String feedbackResponseId) {
this.feedbackResponseId = feedbackResponseId;
}

public  Instant getCreatedAt() {
return createdAt;
}

public  void setCreatedAt(Instant createdAt) {
this.createdAt = createdAt;
}

public  String getCommentText() {
return commentText;
}

public  void setCommentText(String commentText) {
this.commentText = commentText;
}

public  String getGiverSection() {
return giverSection;
}

public  void setGiverSection(String giverSection) {
this.giverSection = giverSection;
}

public  String getReceiverSection() {
return receiverSection;
}

public  void setReceiverSection(String receiverSection) {
this.receiverSection = receiverSection;
}

public  void setLastEditorEmail(String lastEditorEmail) {
this.lastEditorEmail = lastEditorEmail;
}

public  String getLastEditorEmail() {
return this.lastEditorEmail;
}

public  Instant getLastEditedAt() {
return this.lastEditedAt;
}

public  void setLastEditedAt(Instant lastEditedAt) {
this.lastEditedAt = lastEditedAt;
}

public  boolean getIsCommentFromFeedbackParticipant() {
return this.isCommentFromFeedbackParticipant;
}

public  void setIsCommentFromFeedbackParticipant(boolean isCommentFromFeedbackParticipant) {
this.isCommentFromFeedbackParticipant = isCommentFromFeedbackParticipant;
}

}
