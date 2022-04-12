package teammates.common.datatransfer.questions;

public enum FeedbackQuestionType {
TEXT (FeedbackTextQuestionDetails.class, FeedbackTextResponseDetails.class),
MCQ (FeedbackMcqQuestionDetails.class, FeedbackMcqResponseDetails.class),
MSQ (FeedbackMsqQuestionDetails.class, FeedbackMsqResponseDetails.class),
NUMSCALE (FeedbackNumericalScaleQuestionDetails.class, FeedbackNumericalScaleResponseDetails.class),
CONSTSUM (FeedbackConstantSumQuestionDetails.class, FeedbackConstantSumResponseDetails.class),
CONSTSUM_OPTIONS (FeedbackConstantSumQuestionDetails.class, FeedbackConstantSumResponseDetails.class),
CONSTSUM_RECIPIENTS (FeedbackConstantSumQuestionDetails.class, FeedbackConstantSumResponseDetails.class),
CONTRIB (FeedbackContributionQuestionDetails.class, FeedbackContributionResponseDetails.class),
RUBRIC (FeedbackRubricQuestionDetails.class, FeedbackRubricResponseDetails.class),
RANK_OPTIONS (FeedbackRankOptionsQuestionDetails.class, FeedbackRankOptionsResponseDetails.class),
RANK_RECIPIENTS (FeedbackRankRecipientsQuestionDetails.class, FeedbackRankRecipientsResponseDetails.class),
;

private final Class<? extends FeedbackQuestionDetails> questionDetailsClass;

private final Class<? extends FeedbackResponseDetails> responseDetailsClass;

 FeedbackQuestionType(Class<? extends FeedbackQuestionDetails> questionDetailsClass, Class<? extends FeedbackResponseDetails> responseDetailsClass){
this.questionDetailsClass = questionDetailsClass;
this.responseDetailsClass = responseDetailsClass;
}
public  Class<? extends FeedbackQuestionDetails> getQuestionDetailsClass() {
return questionDetailsClass;
}

public  Class<? extends FeedbackResponseDetails> getResponseDetailsClass() {
return responseDetailsClass;
}

}
