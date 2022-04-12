package teammates.common.datatransfer;

import java.util.HashMap;
import java.util.Map;
import teammates.common.util.Const;
public class InstructorPermissionSet {
private boolean canModifyCourse;

private boolean canModifyInstructor;

private boolean canModifySession;

private boolean canModifyStudent;

private boolean canViewStudentInSections;

private boolean canViewSessionInSections;

private boolean canSubmitSessionInSections;

private boolean canModifySessionCommentsInSections;

public  boolean isCanModifyCourse() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sISDULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sITRcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804790004304195116176124 = canModifyCourse;
threadMonitoringController.exitInternalAction("_sITRcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804790004304195116176124;
}
finally {
threadMonitoringController.exitService("_sISDULngEeyIw-dB1KCaVA");
}
}

public  void setCanModifyCourse(boolean canModifyCourse) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifyCourse", canModifyCourse);
threadMonitoringController.enterService("_sIUfkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIVGoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifyCourse = canModifyCourse;
threadMonitoringController.exitInternalAction("_sIVGoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sIUfkLngEeyIw-dB1KCaVA");
}
}

public  boolean isCanModifyInstructor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sIW70LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIXi4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680486008018416855027898 = canModifyInstructor;
threadMonitoringController.exitInternalAction("_sIXi4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680486008018416855027898;
}
finally {
threadMonitoringController.exitService("_sIW70LngEeyIw-dB1KCaVA");
}
}

public  void setCanModifyInstructor(boolean canModifyInstructor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifyInstructor", canModifyInstructor);
threadMonitoringController.enterService("_sIYxALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIZ_ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifyInstructor = canModifyInstructor;
threadMonitoringController.exitInternalAction("_sIZ_ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sIYxALngEeyIw-dB1KCaVA");
}
}

public  boolean isCanModifySession() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sIbNQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIcbYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680494004046918454543418 = canModifySession;
threadMonitoringController.exitInternalAction("_sIcbYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680494004046918454543418;
}
finally {
threadMonitoringController.exitService("_sIbNQLngEeyIw-dB1KCaVA");
}
}

public  void setCanModifySession(boolean canModifySession) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifySession", canModifySession);
threadMonitoringController.enterService("_sIdpgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIe3oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifySession = canModifySession;
threadMonitoringController.exitInternalAction("_sIe3oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sIdpgLngEeyIw-dB1KCaVA");
}
}

public  boolean isCanModifyStudent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sIgFwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIhT4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680499005629176205250245 = canModifyStudent;
threadMonitoringController.exitInternalAction("_sIhT4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680499005629176205250245;
}
finally {
threadMonitoringController.exitService("_sIgFwLngEeyIw-dB1KCaVA");
}
}

public  void setCanModifyStudent(boolean canModifyStudent) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifyStudent", canModifyStudent);
threadMonitoringController.enterService("_sIiiALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIjJELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifyStudent = canModifyStudent;
threadMonitoringController.exitInternalAction("_sIjJELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sIiiALngEeyIw-dB1KCaVA");
}
}

public  boolean isCanViewStudentInSections() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sIk-QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sImMYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368050900009545388056061865 = canViewStudentInSections;
threadMonitoringController.exitInternalAction("_sImMYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368050900009545388056061865;
}
finally {
threadMonitoringController.exitService("_sIk-QLngEeyIw-dB1KCaVA");
}
}

public  void setCanViewStudentInSections(boolean canViewStudentInSections) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canViewStudentInSections", canViewStudentInSections);
threadMonitoringController.enterService("_sIoBkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIoooLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canViewStudentInSections = canViewStudentInSections;
threadMonitoringController.exitInternalAction("_sIoooLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sIoBkLngEeyIw-dB1KCaVA");
}
}

public  boolean isCanViewSessionInSections() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sIp2wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIrE4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680518003989508802261297 = canViewSessionInSections;
threadMonitoringController.exitInternalAction("_sIrE4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680518003989508802261297;
}
finally {
threadMonitoringController.exitService("_sIp2wLngEeyIw-dB1KCaVA");
}
}

public  void setCanViewSessionInSections(boolean canViewSessionInSections) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canViewSessionInSections", canViewSessionInSections);
threadMonitoringController.enterService("_sIsTALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIs6ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canViewSessionInSections = canViewSessionInSections;
threadMonitoringController.exitInternalAction("_sIs6ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sIsTALngEeyIw-dB1KCaVA");
}
}

public  boolean isCanSubmitSessionInSections() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sIuvQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIv9YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680524002578075062229157 = canSubmitSessionInSections;
threadMonitoringController.exitInternalAction("_sIv9YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680524002578075062229157;
}
finally {
threadMonitoringController.exitService("_sIuvQLngEeyIw-dB1KCaVA");
}
}

public  void setCanSubmitSessionInSections(boolean canSubmitSessionInSections) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canSubmitSessionInSections", canSubmitSessionInSections);
threadMonitoringController.enterService("_sIxLgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sIyZoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canSubmitSessionInSections = canSubmitSessionInSections;
threadMonitoringController.exitInternalAction("_sIyZoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sIxLgLngEeyIw-dB1KCaVA");
}
}

public  boolean isCanModifySessionCommentsInSections() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sI0O0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sI014LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680530009100716608205522 = canModifySessionCommentsInSections;
threadMonitoringController.exitInternalAction("_sI014LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680530009100716608205522;
}
finally {
threadMonitoringController.exitService("_sI0O0LngEeyIw-dB1KCaVA");
}
}

public  void setCanModifySessionCommentsInSections(boolean canModifySessionCommentsInSections) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifySessionCommentsInSections", canModifySessionCommentsInSections);
threadMonitoringController.enterService("_sI2EALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sI2rELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifySessionCommentsInSections = canModifySessionCommentsInSections;
threadMonitoringController.exitInternalAction("_sI2rELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sI2EALngEeyIw-dB1KCaVA");
}
}

 InstructorPermissionSet getCopy() {
InstructorPermissionSet copy = new  InstructorPermissionSet();
copy.setCanModifyCourse(canModifyCourse);
copy.setCanModifyInstructor(canModifyInstructor);
copy.setCanModifySession(canModifySession);
copy.setCanModifyStudent(canModifyStudent);
copy.setCanViewStudentInSections(canViewStudentInSections);
copy.setCanViewSessionInSections(canViewSessionInSections);
copy.setCanSubmitSessionInSections(canSubmitSessionInSections);
copy.setCanModifySessionCommentsInSections(canModifySessionCommentsInSections);
return copy;
}

 boolean get(String privilegeName) {
switch (privilegeName) {
case Const.InstructorPermissions.CAN_MODIFY_COURSE: return canModifyCourse;
case Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR: return canModifyInstructor;
case Const.InstructorPermissions.CAN_MODIFY_SESSION: return canModifySession;
case Const.InstructorPermissions.CAN_MODIFY_STUDENT: return canModifyStudent;
case Const.InstructorPermissions.CAN_VIEW_STUDENT_IN_SECTIONS: return canViewStudentInSections;
case Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS: return canViewSessionInSections;
case Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS: return canSubmitSessionInSections;
case Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS: return canModifySessionCommentsInSections;
default: return false;

}
}

 void put(String privilegeName, boolean value) {
switch (privilegeName) {
case Const.InstructorPermissions.CAN_MODIFY_COURSE: canModifyCourse = value;
break;
case Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR: canModifyInstructor = value;
break;
case Const.InstructorPermissions.CAN_MODIFY_SESSION: canModifySession = value;
break;
case Const.InstructorPermissions.CAN_MODIFY_STUDENT: canModifyStudent = value;
break;
case Const.InstructorPermissions.CAN_VIEW_STUDENT_IN_SECTIONS: canViewStudentInSections = value;
break;
case Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS: canViewSessionInSections = value;
break;
case Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS: canSubmitSessionInSections = value;
break;
case Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS: canModifySessionCommentsInSections = value;
break;
default: break;

}
}

public  Map<String, Boolean> toLegacyMapFormat() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sI8KoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sI9YwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Boolean> legacyFormat = new  HashMap<>();
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_COURSE, canModifyCourse);
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR, canModifyInstructor);
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_SESSION, canModifySession);
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_STUDENT, canModifyStudent);
legacyFormat.put(Const.InstructorPermissions.CAN_VIEW_STUDENT_IN_SECTIONS, canViewStudentInSections);
legacyFormat.put(Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS, canViewSessionInSections);
legacyFormat.put(Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS, canSubmitSessionInSections);
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS, canModifySessionCommentsInSections);
Map<String, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136805340018510438824023934 = legacyFormat;
threadMonitoringController.exitInternalAction("_sI9YwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136805340018510438824023934;
}
finally {
threadMonitoringController.exitService("_sI8KoLngEeyIw-dB1KCaVA");
}
}

static  InstructorPermissionSet fromLegacyMapFormat(Map<String, Boolean> legacyMap) {
InstructorPermissionSet ips = new  InstructorPermissionSet();
ips.setCanModifyCourse(legacyMap.getOrDefault(Const.InstructorPermissions.CAN_MODIFY_COURSE, false));
ips.setCanModifyInstructor(legacyMap.getOrDefault(Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR, false));
ips.setCanModifyStudent(legacyMap.getOrDefault(Const.InstructorPermissions.CAN_MODIFY_STUDENT, false));
ips.setCanModifySession(legacyMap.getOrDefault(Const.InstructorPermissions.CAN_MODIFY_SESSION, false));
ips.setCanViewStudentInSections(legacyMap.getOrDefault(Const.InstructorPermissions.CAN_VIEW_STUDENT_IN_SECTIONS, false));
ips.setCanViewSessionInSections(legacyMap.getOrDefault(Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS, false));
ips.setCanSubmitSessionInSections(legacyMap.getOrDefault(Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS, false));
ips.setCanModifySessionCommentsInSections(legacyMap.getOrDefault(Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS, false));
return ips;
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_sJDfYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sJEtgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!(other instanceof InstructorPermissionSet))
{
return false;
}
if (other == this)
{
return true;
}
InstructorPermissionSet rhs = (InstructorPermissionSet) other;
threadMonitoringController.exitInternalAction("_sJEtgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return canModifyCourse == rhs.isCanModifyCourse() && canModifyInstructor == rhs.isCanModifyInstructor() && canModifySession == rhs.isCanModifySession() && canModifyStudent == rhs.isCanModifyStudent() && canViewStudentInSections == rhs.isCanViewStudentInSections() && canViewSessionInSections == rhs.isCanViewSessionInSections() && canSubmitSessionInSections == rhs.isCanSubmitSessionInSections() && canModifySessionCommentsInSections == rhs.isCanModifySessionCommentsInSections();
}
finally {
threadMonitoringController.exitService("_sJDfYLngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sJKNELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sJK0ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int prime = 31;
int result = 1;
result = prime * result + Boolean.hashCode(canModifyCourse);
result = prime * result + Boolean.hashCode(canModifyInstructor);
result = prime * result + Boolean.hashCode(canModifySession);
result = prime * result + Boolean.hashCode(canModifyStudent);
result = prime * result + Boolean.hashCode(canViewStudentInSections);
result = prime * result + Boolean.hashCode(canViewSessionInSections);
result = prime * result + Boolean.hashCode(canSubmitSessionInSections);
result = prime * result + Boolean.hashCode(canModifySessionCommentsInSections);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368054100216432214482991 = result;
threadMonitoringController.exitInternalAction("_sJK0ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368054100216432214482991;
}
finally {
threadMonitoringController.exitService("_sJKNELngEeyIw-dB1KCaVA");
}
}

}
