package teammates.ui.output;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
public class FeedbackQuestionRecipientsData extends ApiOutput {
private List<FeedbackQuestionRecipientData> recipients;

public  FeedbackQuestionRecipientsData(Map<String, String> recipients){
this.recipients = new  ArrayList<>();
recipients.forEach((identifier, name) -> {
this.recipients.add(new  FeedbackQuestionRecipientData(name, identifier));
}
);
this.recipients.sort(Comparator.comparing(FeedbackQuestionRecipientData::getName));
}
public  List<FeedbackQuestionRecipientData> getRecipients() {
return recipients;
}

}
