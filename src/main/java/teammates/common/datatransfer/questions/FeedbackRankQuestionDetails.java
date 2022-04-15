package teammates.common.datatransfer.questions;

import teammates.common.util.Const;
public abstract class FeedbackRankQuestionDetails extends FeedbackQuestionDetails {
int minOptionsToBeRanked;

int maxOptionsToBeRanked;

boolean areDuplicatesAllowed;

 FeedbackRankQuestionDetails(FeedbackQuestionType questionType, String questionText){
super(questionType, questionText);
minOptionsToBeRanked = Const.POINTS_NO_VALUE;
maxOptionsToBeRanked = Const.POINTS_NO_VALUE;
}
public  int getMinOptionsToBeRanked() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bLlkALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bLnZMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021460008396692404878857 = minOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_bLnZMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021460008396692404878857;
}
finally {
threadMonitoringController.exitService("_bLlkALvVEeyr6avTgCRLkQ");
}
}

public  void setMinOptionsToBeRanked(int minOptionsToBeRanked) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("minOptionsToBeRanked", minOptionsToBeRanked);
threadMonitoringController.enterService("_bLpOYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bLrDkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.minOptionsToBeRanked = minOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_bLrDkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bLpOYLvVEeyr6avTgCRLkQ");
}
}

public  int getMaxOptionsToBeRanked() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bLs4wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bLut8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021488007817504942294436 = maxOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_bLut8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021488007817504942294436;
}
finally {
threadMonitoringController.exitService("_bLs4wLvVEeyr6avTgCRLkQ");
}
}

public  void setMaxOptionsToBeRanked(int maxOptionsToBeRanked) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("maxOptionsToBeRanked", maxOptionsToBeRanked);
threadMonitoringController.enterService("_bLxxQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bLzmcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.maxOptionsToBeRanked = maxOptionsToBeRanked;
threadMonitoringController.exitInternalAction("_bLzmcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bLxxQLvVEeyr6avTgCRLkQ");
}
}

public  boolean isAreDuplicatesAllowed() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_bL2CsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bL3Q0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130215110024458629472078108 = areDuplicatesAllowed;
threadMonitoringController.exitInternalAction("_bL3Q0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130215110024458629472078108;
}
finally {
threadMonitoringController.exitService("_bL2CsLvVEeyr6avTgCRLkQ");
}
}

public  void setAreDuplicatesAllowed(boolean areDuplicatesAllowed) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("areDuplicatesAllowed", areDuplicatesAllowed);
threadMonitoringController.enterService("_bL5tELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bL7iQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.areDuplicatesAllowed = areDuplicatesAllowed;
threadMonitoringController.exitInternalAction("_bL7iQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_bL5tELvVEeyr6avTgCRLkQ");
}
}

}
