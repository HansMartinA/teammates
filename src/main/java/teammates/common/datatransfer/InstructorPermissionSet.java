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
threadMonitoringController.enterService("_ak5-gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ak7MoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018655008720681454558882 = canModifyCourse;
threadMonitoringController.exitInternalAction("_ak7MoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018655008720681454558882;
}
finally {
threadMonitoringController.exitService("_ak5-gLvVEeyr6avTgCRLkQ");
}
}

public  void setCanModifyCourse(boolean canModifyCourse) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifyCourse", canModifyCourse);
threadMonitoringController.enterService("_ak9B0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ak9o4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifyCourse = canModifyCourse;
threadMonitoringController.exitInternalAction("_ak9o4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ak9B0LvVEeyr6avTgCRLkQ");
}
}

public  boolean isCanModifyInstructor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ak_eELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alAsMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130186730045299358873607154 = canModifyInstructor;
threadMonitoringController.exitInternalAction("_alAsMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130186730045299358873607154;
}
finally {
threadMonitoringController.exitService("_ak_eELvVEeyr6avTgCRLkQ");
}
}

public  void setCanModifyInstructor(boolean canModifyInstructor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifyInstructor", canModifyInstructor);
threadMonitoringController.enterService("_alB6ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alDIcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifyInstructor = canModifyInstructor;
threadMonitoringController.exitInternalAction("_alDIcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_alB6ULvVEeyr6avTgCRLkQ");
}
}

public  boolean isCanModifySession() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_alEWkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alFksLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130186910034275828920143525 = canModifySession;
threadMonitoringController.exitInternalAction("_alFksLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130186910034275828920143525;
}
finally {
threadMonitoringController.exitService("_alEWkLvVEeyr6avTgCRLkQ");
}
}

public  void setCanModifySession(boolean canModifySession) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifySession", canModifySession);
threadMonitoringController.enterService("_alGy0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alIA8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifySession = canModifySession;
threadMonitoringController.exitInternalAction("_alIA8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_alGy0LvVEeyr6avTgCRLkQ");
}
}

public  boolean isCanModifyStudent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_alJ2ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alKdMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018708003700419807811127 = canModifyStudent;
threadMonitoringController.exitInternalAction("_alKdMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018708003700419807811127;
}
finally {
threadMonitoringController.exitService("_alJ2ILvVEeyr6avTgCRLkQ");
}
}

public  void setCanModifyStudent(boolean canModifyStudent) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifyStudent", canModifyStudent);
threadMonitoringController.enterService("_alMSYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alM5cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifyStudent = canModifyStudent;
threadMonitoringController.exitInternalAction("_alM5cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_alMSYLvVEeyr6avTgCRLkQ");
}
}

public  boolean isCanViewStudentInSections() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_alOuoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alPVsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018724008878658406732657 = canViewStudentInSections;
threadMonitoringController.exitInternalAction("_alPVsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018724008878658406732657;
}
finally {
threadMonitoringController.exitService("_alOuoLvVEeyr6avTgCRLkQ");
}
}

public  void setCanViewStudentInSections(boolean canViewStudentInSections) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canViewStudentInSections", canViewStudentInSections);
threadMonitoringController.enterService("_alRK4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alSZALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canViewStudentInSections = canViewStudentInSections;
threadMonitoringController.exitInternalAction("_alSZALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_alRK4LvVEeyr6avTgCRLkQ");
}
}

public  boolean isCanViewSessionInSections() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_alWDYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alXRgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130187440049578841067599144 = canViewSessionInSections;
threadMonitoringController.exitInternalAction("_alXRgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130187440049578841067599144;
}
finally {
threadMonitoringController.exitService("_alWDYLvVEeyr6avTgCRLkQ");
}
}

public  void setCanViewSessionInSections(boolean canViewSessionInSections) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canViewSessionInSections", canViewSessionInSections);
threadMonitoringController.enterService("_alZtwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ala74LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canViewSessionInSections = canViewSessionInSections;
threadMonitoringController.exitInternalAction("_ala74LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_alZtwLvVEeyr6avTgCRLkQ");
}
}

public  boolean isCanSubmitSessionInSections() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_alcxELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aldYILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018764008178504956334547 = canSubmitSessionInSections;
threadMonitoringController.exitInternalAction("_aldYILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018764008178504956334547;
}
finally {
threadMonitoringController.exitService("_alcxELvVEeyr6avTgCRLkQ");
}
}

public  void setCanSubmitSessionInSections(boolean canSubmitSessionInSections) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canSubmitSessionInSections", canSubmitSessionInSections);
threadMonitoringController.enterService("_alfNULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alf0YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canSubmitSessionInSections = canSubmitSessionInSections;
threadMonitoringController.exitInternalAction("_alf0YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_alfNULvVEeyr6avTgCRLkQ");
}
}

public  boolean isCanModifySessionCommentsInSections() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_alhpkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aliQoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130187820029050841251305815 = canModifySessionCommentsInSections;
threadMonitoringController.exitInternalAction("_aliQoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130187820029050841251305815;
}
finally {
threadMonitoringController.exitService("_alhpkLvVEeyr6avTgCRLkQ");
}
}

public  void setCanModifySessionCommentsInSections(boolean canModifySessionCommentsInSections) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("canModifySessionCommentsInSections", canModifySessionCommentsInSections);
threadMonitoringController.enterService("_alkF0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_allT8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.canModifySessionCommentsInSections = canModifySessionCommentsInSections;
threadMonitoringController.exitInternalAction("_allT8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_alkF0LvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_alplYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alqzgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Boolean> legacyFormat = new  HashMap<>();
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_COURSE, canModifyCourse);
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR, canModifyInstructor);
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_SESSION, canModifySession);
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_STUDENT, canModifyStudent);
legacyFormat.put(Const.InstructorPermissions.CAN_VIEW_STUDENT_IN_SECTIONS, canViewStudentInSections);
legacyFormat.put(Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS, canViewSessionInSections);
legacyFormat.put(Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS, canSubmitSessionInSections);
legacyFormat.put(Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS, canModifySessionCommentsInSections);
Map<String, Boolean> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130187990041135781005447747 = legacyFormat;
threadMonitoringController.exitInternalAction("_alqzgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130187990041135781005447747;
}
finally {
threadMonitoringController.exitService("_alplYLvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_alxhMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_alzWYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!(other instanceof InstructorPermissionSet))
{
return false;
}
if (other == this)
{
return true;
}
InstructorPermissionSet rhs = (InstructorPermissionSet) other;
threadMonitoringController.exitInternalAction("_alzWYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return canModifyCourse == rhs.isCanModifyCourse() && canModifyInstructor == rhs.isCanModifyInstructor() && canModifySession == rhs.isCanModifySession() && canModifyStudent == rhs.isCanModifyStudent() && canViewStudentInSections == rhs.isCanViewStudentInSections() && canViewSessionInSections == rhs.isCanViewSessionInSections() && canSubmitSessionInSections == rhs.isCanSubmitSessionInSections() && canModifySessionCommentsInSections == rhs.isCanModifySessionCommentsInSections();
}
finally {
threadMonitoringController.exitService("_alxhMLvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_al4O4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_al5dALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018818000812975322612014 = result;
threadMonitoringController.exitInternalAction("_al5dALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018818000812975322612014;
}
finally {
threadMonitoringController.exitService("_al4O4LvVEeyr6avTgCRLkQ");
}
}

}
