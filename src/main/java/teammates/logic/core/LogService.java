package teammates.logic.core;

import java.util.List;
import teammates.common.datatransfer.ErrorLogEntry;
import teammates.common.datatransfer.FeedbackSessionLogEntry;
import teammates.common.datatransfer.QueryLogsResults;
import teammates.common.datatransfer.logs.QueryLogsParams;
public interface LogService {
 List<ErrorLogEntry> getRecentErrorLogs() ;

 QueryLogsResults queryLogs(QueryLogsParams queryLogsParams) ;

 void createFeedbackSessionLog(String courseId, String email, String fsName, String fslType) ;

 List<FeedbackSessionLogEntry> getFeedbackSessionLogs(String courseId, String email, long startTime, long endTime, String fsName) ;

}
