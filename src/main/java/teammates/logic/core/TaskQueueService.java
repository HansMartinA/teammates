package teammates.logic.core;

import teammates.common.util.TaskWrapper;
public interface TaskQueueService {
 void addDeferredTask(TaskWrapper task, long countdownTime) ;

}
