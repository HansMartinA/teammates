package teammates.ui.output;

import teammates.common.datatransfer.FeedbackSessionLogEntry;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.logs.FeedbackSessionLogType;
public class FeedbackSessionLogEntryData {
private final StudentData studentData;

private final FeedbackSessionLogType feedbackSessionLogType;

private final long timestamp;

public  FeedbackSessionLogEntryData(FeedbackSessionLogEntry logEntry, StudentAttributes student){
StudentData studentData = new  StudentData(student);
FeedbackSessionLogType logType = FeedbackSessionLogType.valueOfLabel(logEntry.getFeedbackSessionLogType());
long timestamp = logEntry.getTimestamp();
this.studentData = studentData;
this.feedbackSessionLogType = logType;
this.timestamp = timestamp;
}
public  StudentData getStudentData() {
return studentData;
}

public  FeedbackSessionLogType getFeedbackSessionLogType() {
return feedbackSessionLogType;
}

public  long getTimestamp() {
return timestamp;
}

}
