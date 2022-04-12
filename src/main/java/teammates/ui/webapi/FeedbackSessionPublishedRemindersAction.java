package teammates.ui.webapi;

import java.util.List;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.util.RequestTracer;
class FeedbackSessionPublishedRemindersAction extends AdminOnlyAction {
@Override
public  JsonResult execute() {
List<FeedbackSessionAttributes> sessions = logic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent();
for (FeedbackSessionAttributes session : sessions)
{
RequestTracer.checkRemainingTime();
taskQueuer.scheduleFeedbackSessionPublishedEmail(session.getCourseId(), session.getFeedbackSessionName());
}
return new  JsonResult("Successful");
}

}
