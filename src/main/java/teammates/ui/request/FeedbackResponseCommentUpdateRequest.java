package teammates.ui.request;

import java.util.List;
import teammates.ui.output.CommentVisibilityType;
public class FeedbackResponseCommentUpdateRequest extends FeedbackResponseCommentBasicRequest {
public  FeedbackResponseCommentUpdateRequest(String commentText, List<CommentVisibilityType> showCommentTo, List<CommentVisibilityType> showGiverNameTo){
super(commentText, showCommentTo, showGiverNameTo);
}
}
