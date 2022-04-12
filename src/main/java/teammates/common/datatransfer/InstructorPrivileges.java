package teammates.common.datatransfer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import teammates.common.util.Const;
public final class InstructorPrivileges {
private static final InstructorPermissionSet PRIVILEGES_COOWNER = new  InstructorPermissionSet();

private static final InstructorPermissionSet PRIVILEGES_MANAGER = new  InstructorPermissionSet();

private static final InstructorPermissionSet PRIVILEGES_OBSERVER = new  InstructorPermissionSet();

private static final InstructorPermissionSet PRIVILEGES_TUTOR = new  InstructorPermissionSet();

private static final InstructorPermissionSet PRIVILEGES_CUSTOM = new  InstructorPermissionSet();

static {
PRIVILEGES_COOWNER.setCanModifyCourse(true);
PRIVILEGES_COOWNER.setCanModifyInstructor(true);
PRIVILEGES_COOWNER.setCanModifySession(true);
PRIVILEGES_COOWNER.setCanModifyStudent(true);
PRIVILEGES_COOWNER.setCanViewStudentInSections(true);
PRIVILEGES_COOWNER.setCanViewSessionInSections(true);
PRIVILEGES_COOWNER.setCanSubmitSessionInSections(true);
PRIVILEGES_COOWNER.setCanModifySessionCommentsInSections(true);
PRIVILEGES_MANAGER.setCanModifyCourse(false);
PRIVILEGES_MANAGER.setCanModifyInstructor(true);
PRIVILEGES_MANAGER.setCanModifySession(true);
PRIVILEGES_MANAGER.setCanModifyStudent(true);
PRIVILEGES_MANAGER.setCanViewStudentInSections(true);
PRIVILEGES_MANAGER.setCanViewSessionInSections(true);
PRIVILEGES_MANAGER.setCanSubmitSessionInSections(true);
PRIVILEGES_MANAGER.setCanModifySessionCommentsInSections(true);
PRIVILEGES_OBSERVER.setCanModifyCourse(false);
PRIVILEGES_OBSERVER.setCanModifyInstructor(false);
PRIVILEGES_OBSERVER.setCanModifySession(false);
PRIVILEGES_OBSERVER.setCanModifyStudent(false);
PRIVILEGES_OBSERVER.setCanViewStudentInSections(true);
PRIVILEGES_OBSERVER.setCanViewSessionInSections(true);
PRIVILEGES_OBSERVER.setCanSubmitSessionInSections(false);
PRIVILEGES_OBSERVER.setCanModifySessionCommentsInSections(false);
PRIVILEGES_TUTOR.setCanModifyCourse(false);
PRIVILEGES_TUTOR.setCanModifyInstructor(false);
PRIVILEGES_TUTOR.setCanModifySession(false);
PRIVILEGES_TUTOR.setCanModifyStudent(false);
PRIVILEGES_TUTOR.setCanViewStudentInSections(true);
PRIVILEGES_TUTOR.setCanViewSessionInSections(true);
PRIVILEGES_TUTOR.setCanSubmitSessionInSections(true);
PRIVILEGES_TUTOR.setCanModifySessionCommentsInSections(false);
PRIVILEGES_CUSTOM.setCanModifyCourse(false);
PRIVILEGES_CUSTOM.setCanModifyInstructor(false);
PRIVILEGES_CUSTOM.setCanModifySession(false);
PRIVILEGES_CUSTOM.setCanModifyStudent(false);
PRIVILEGES_CUSTOM.setCanViewStudentInSections(false);
PRIVILEGES_CUSTOM.setCanViewSessionInSections(false);
PRIVILEGES_CUSTOM.setCanSubmitSessionInSections(false);
PRIVILEGES_CUSTOM.setCanModifySessionCommentsInSections(false);
}
private static final String[]  COURSE_LEVEL_ONLY_LIST = new String[]  {Const.InstructorPermissions.CAN_MODIFY_COURSE, Const.InstructorPermissions.CAN_MODIFY_INSTRUCTOR, Const.InstructorPermissions.CAN_MODIFY_SESSION, Const.InstructorPermissions.CAN_MODIFY_STUDENT};

private static final String[]  SECTION_LEVEL_ONLY_LIST = new String[]  {Const.InstructorPermissions.CAN_VIEW_STUDENT_IN_SECTIONS};

private static final String[]  SESSION_LEVEL_ONLY_LIST = new String[]  {Const.InstructorPermissions.CAN_VIEW_SESSION_IN_SECTIONS, Const.InstructorPermissions.CAN_SUBMIT_SESSION_IN_SECTIONS, Const.InstructorPermissions.CAN_MODIFY_SESSION_COMMENT_IN_SECTIONS};

private static final Set<String> COURSE_LEVEL_ONLY_PRIVILEGES = new  LinkedHashSet<>(Arrays.asList(COURSE_LEVEL_ONLY_LIST));

private static final Set<String> SECTION_LEVEL_ONLY_PRIVILEGES = new  LinkedHashSet<>(Arrays.asList(SECTION_LEVEL_ONLY_LIST));

private static final Set<String> SESSION_LEVEL_ONLY_PRIVILEGES = new  LinkedHashSet<>(Arrays.asList(SESSION_LEVEL_ONLY_LIST));

private final InstructorPermissionSet courseLevel;

private final Map<String, InstructorPermissionSet> sectionLevel;

private final Map<String, Map<String, InstructorPermissionSet>> sessionLevel;

public  InstructorPrivileges(){
this.courseLevel = new  InstructorPermissionSet();
this.sectionLevel = new  LinkedHashMap<>();
this.sessionLevel = new  LinkedHashMap<>();
}
public  InstructorPrivileges(String instrRole){
this();
switch (instrRole) {
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER: setDefaultPrivilegesForCoowner();
break;
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_MANAGER: setDefaultPrivilegesForManager();
break;
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_OBSERVER: setDefaultPrivilegesForObserver();
break;
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_TUTOR: setDefaultPrivilegesForTutor();
break;
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_CUSTOM: default: setDefaultPrivilegesForCustom();
break;

}
}
public  InstructorPrivileges(InstructorPrivilegesLegacy legacyFormat){
this.courseLevel = InstructorPermissionSet.fromLegacyMapFormat(legacyFormat.getCourseLevel());
this.sectionLevel = new  LinkedHashMap<>();
for (Map.Entry<String, Map<String, Boolean>> entry : legacyFormat.getSectionLevel().entrySet())
{
this.sectionLevel.put(entry.getKey(), InstructorPermissionSet.fromLegacyMapFormat(entry.getValue()));
}
this.sessionLevel = new  LinkedHashMap<>();
for (Map.Entry<String, Map<String, Map<String, Boolean>>> section : legacyFormat.getSessionLevel().entrySet())
{
Map<String, InstructorPermissionSet> sessionMap = new  HashMap<>();
for (Map.Entry<String, Map<String, Boolean>> session : section.getValue().entrySet())
{
sessionMap.put(session.getKey(), InstructorPermissionSet.fromLegacyMapFormat(session.getValue()));
}
this.sessionLevel.put(section.getKey(), sessionMap);
}
}
public  InstructorPrivilegesLegacy toLegacyFormat() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r41SELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r415ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorPrivilegesLegacy privilegesLegacy = new  InstructorPrivilegesLegacy();
threadMonitoringController.exitInternalAction("_r415ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r43HRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r43HRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
privilegesLegacy.getCourseLevel().putAll(courseLevel.toLegacyMapFormat());
threadMonitoringController.exitInternalAction("_r43HRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
for (Map.Entry<String, InstructorPermissionSet> entry : sectionLevel.entrySet())
{
Map<String, Boolean> legacySectionMap = new  HashMap<>();
for (Map.Entry<String, Boolean> section : entry.getValue().toLegacyMapFormat().entrySet())
{
if (isPrivilegeNameValidForSectionLevel(section.getKey()))
{
legacySectionMap.put(section.getKey(), section.getValue());
}
}
privilegesLegacy.getSectionLevel().put(entry.getKey(), legacySectionMap);
}
for (Map.Entry<String, Map<String, InstructorPermissionSet>> section : sessionLevel.entrySet())
{
Map<String, Map<String, Boolean>> sessionMap = new  HashMap<>();
for (Map.Entry<String, InstructorPermissionSet> entry : section.getValue().entrySet())
{
Map<String, Boolean> legacySessionMap = new  HashMap<>();
for (Map.Entry<String, Boolean> session : entry.getValue().toLegacyMapFormat().entrySet())
{
if (isPrivilegeNameValidForSessionLevel(session.getKey()))
{
legacySessionMap.put(session.getKey(), session.getValue());
}
}
sessionMap.put(entry.getKey(), legacySessionMap);
}
privilegesLegacy.getSessionLevel().put(section.getKey(), sessionMap);
}
InstructorPrivilegesLegacy longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136801140005118782323209736 = privilegesLegacy;
threadMonitoringController.exitInternalAction("_r43HRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136801140005118782323209736;
}
finally {
threadMonitoringController.exitService("_r41SELngEeyIw-dB1KCaVA");
}
}

public static  boolean isPrivilegeNameValid(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_sKaxULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sKcmgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680544009791693367453569 = COURSE_LEVEL_ONLY_PRIVILEGES.contains(privilegeName) || SECTION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName) || SESSION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName);
threadMonitoringController.exitInternalAction("_sKcmgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680544009791693367453569;
}
finally {
threadMonitoringController.exitService("_sKaxULngEeyIw-dB1KCaVA");
}
}

public static  boolean isPrivilegeNameValidForSectionLevel(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_sKd0oLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sKfp0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680547005412364259991767 = SECTION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName) || SESSION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName);
threadMonitoringController.exitInternalAction("_sKfp0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680547005412364259991767;
}
finally {
threadMonitoringController.exitService("_sKd0oLngEeyIw-dB1KCaVA");
}
}

public static  boolean isPrivilegeNameValidForSessionLevel(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_sKg38LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sKiGELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680549003532140803183169 = SESSION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName);
threadMonitoringController.exitInternalAction("_sKiGELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680549003532140803183169;
}
finally {
threadMonitoringController.exitService("_sKg38LngEeyIw-dB1KCaVA");
}
}

 void setDefaultPrivilegesForCoowner() {
setDefaultPrivileges(PRIVILEGES_COOWNER);
}

 void setDefaultPrivilegesForManager() {
setDefaultPrivileges(PRIVILEGES_MANAGER);
}

 void setDefaultPrivilegesForObserver() {
setDefaultPrivileges(PRIVILEGES_OBSERVER);
}

 void setDefaultPrivilegesForTutor() {
setDefaultPrivileges(PRIVILEGES_TUTOR);
}

 void setDefaultPrivilegesForCustom() {
setDefaultPrivileges(PRIVILEGES_CUSTOM);
}

private  void setDefaultPrivileges(InstructorPermissionSet defaultPrivileges) {
courseLevel.setCanModifyCourse(defaultPrivileges.isCanModifyCourse());
courseLevel.setCanModifyInstructor(defaultPrivileges.isCanModifyInstructor());
courseLevel.setCanModifySession(defaultPrivileges.isCanModifySession());
courseLevel.setCanModifyStudent(defaultPrivileges.isCanModifyStudent());
courseLevel.setCanViewStudentInSections(defaultPrivileges.isCanViewStudentInSections());
courseLevel.setCanViewSessionInSections(defaultPrivileges.isCanViewSessionInSections());
courseLevel.setCanSubmitSessionInSections(defaultPrivileges.isCanSubmitSessionInSections());
courseLevel.setCanModifySessionCommentsInSections(defaultPrivileges.isCanModifySessionCommentsInSections());
}

private  InstructorPermissionSet getOverallPrivilegesForSections() {
InstructorPermissionSet privileges = new  InstructorPermissionSet();
privileges.setCanViewStudentInSections(courseLevel.isCanViewStudentInSections());
privileges.setCanViewSessionInSections(courseLevel.isCanViewSessionInSections());
privileges.setCanSubmitSessionInSections(courseLevel.isCanSubmitSessionInSections());
privileges.setCanModifySessionCommentsInSections(courseLevel.isCanModifySessionCommentsInSections());
return privileges;
}

public  void updatePrivilege(String privilegeName, boolean isAllowed) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
monitoringServiceParameters.addValue("isAllowed", isAllowed);
threadMonitoringController.enterService("_sKqB4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sKr3FLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updatePrivilegeInCourseLevel(privilegeName, isAllowed);
threadMonitoringController.exitInternalAction("_sKr3FLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sKqB4LngEeyIw-dB1KCaVA");
}
}

public  void updatePrivilege(String sectionName, String privilegeName, boolean isAllowed) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
monitoringServiceParameters.addValue("isAllowed", isAllowed);
threadMonitoringController.enterService("_sKtsQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sKykxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updatePrivilegeInSectionLevel(sectionName, privilegeName, isAllowed);
threadMonitoringController.exitInternalAction("_sKykxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sKtsQLngEeyIw-dB1KCaVA");
}
}

public  void updatePrivilege(String sectionName, String sessionName, String privilegeName, boolean isAllowed) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
monitoringServiceParameters.addValue("isAllowed", isAllowed);
threadMonitoringController.enterService("_sK0Z8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sK55hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updatePrivilegeInSessionLevel(sectionName, sessionName, privilegeName, isAllowed);
threadMonitoringController.exitInternalAction("_sK55hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sK0Z8LngEeyIw-dB1KCaVA");
}
}

private  void updatePrivilegeInCourseLevel(String privilegeName, boolean isAllowed) {
if (!isPrivilegeNameValid(privilegeName))
{
return;
}
this.courseLevel.put(privilegeName, isAllowed);
}

private  void updatePrivilegeInSectionLevel(String sectionName, String privilegeName, boolean isAllowed) {
if (!isPrivilegeNameValidForSectionLevel(privilegeName))
{
return;
}
addSectionWithDefaultPrivileges(sectionName);
this.sectionLevel.get(sectionName).put(privilegeName, isAllowed);
}

private  void updatePrivilegeInSessionLevel(String sectionName, String sessionName, String privilegeName, boolean isAllowed) {
if (!isPrivilegeNameValidForSessionLevel(privilegeName))
{
return;
}
verifyExistenceOfsectionName(sectionName);
this.sessionLevel.get(sectionName).computeIfAbsent(sessionName, key -> new  InstructorPermissionSet()).put(privilegeName, isAllowed);
}

private  void verifyExistenceOfsectionName(String sectionName) {
this.sessionLevel.computeIfAbsent(sectionName, key -> {
addSectionWithDefaultPrivileges(sectionName);
return new  LinkedHashMap<>();
}
);
}

 void addSectionWithDefaultPrivileges(String sectionName) {
this.sectionLevel.putIfAbsent(sectionName, getOverallPrivilegesForSections());
}

public  boolean isAllowedForPrivilege(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_r50wkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r53M2bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680131004231100641676663 = isAllowedInCourseLevel(privilegeName);
threadMonitoringController.exitInternalAction("_r53M2bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680131004231100641676663;
}
finally {
threadMonitoringController.exitService("_r50wkLngEeyIw-dB1KCaVA");
}
}

public  boolean isAllowedForPrivilege(String sectionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_r563MLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r5-hmbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136801340005224847860898141 = isAllowedInSectionLevel(sectionName, privilegeName);
threadMonitoringController.exitInternalAction("_r5-hmbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136801340005224847860898141;
}
finally {
threadMonitoringController.exitService("_r563MLngEeyIw-dB1KCaVA");
}
}

public  boolean isAllowedForPrivilege(String sectionName, String sessionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_r6CzALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r6HEd7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136801380032079841690397104 = isAllowedInSessionLevel(sectionName, sessionName, privilegeName);
threadMonitoringController.exitInternalAction("_r6HEd7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136801380032079841690397104;
}
finally {
threadMonitoringController.exitService("_r6CzALngEeyIw-dB1KCaVA");
}
}

public  boolean isAllowedForPrivilegeAnySection(String sessionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_r6LV4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r6PAR7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680144008855959257588877 = isAllowedInSessionLevelAnySection(sessionName, privilegeName);
threadMonitoringController.exitInternalAction("_r6PAR7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680144008855959257588877;
}
finally {
threadMonitoringController.exitService("_r6LV4LngEeyIw-dB1KCaVA");
}
}

public  boolean hasCoownerPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r6Q1cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r6SDkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680146003824922521282117 = courseLevel.equals(PRIVILEGES_COOWNER);
threadMonitoringController.exitInternalAction("_r6SDkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680146003824922521282117;
}
finally {
threadMonitoringController.exitService("_r6Q1cLngEeyIw-dB1KCaVA");
}
}

public  boolean hasManagerPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sLAnMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return courseLevel.equals(PRIVILEGES_MANAGER);
}
finally {
threadMonitoringController.exitService("_sLAnMLngEeyIw-dB1KCaVA");
}
}

public  boolean hasObserverPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sLFfsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return courseLevel.equals(PRIVILEGES_OBSERVER);
}
finally {
threadMonitoringController.exitService("_sLFfsLngEeyIw-dB1KCaVA");
}
}

public  boolean hasTutorPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sLK_QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return courseLevel.equals(PRIVILEGES_TUTOR);
}
finally {
threadMonitoringController.exitService("_sLK_QLngEeyIw-dB1KCaVA");
}
}

private  boolean isAllowedInCourseLevel(String privilegeName) {
assert isPrivilegeNameValid(privilegeName);
return this.courseLevel.get(privilegeName);
}

private  boolean isAllowedInSectionLevel(String sectionName, String privilegeName) {
assert isPrivilegeNameValid(privilegeName);
if (!this.sectionLevel.containsKey(sectionName))
{
return isAllowedInCourseLevel(privilegeName);
}
return this.sectionLevel.get(sectionName).get(privilegeName);
}

private  boolean isAllowedInSessionLevel(String sectionName, String sessionName, String privilegeName) {
assert isPrivilegeNameValid(privilegeName);
if (!this.sessionLevel.containsKey(sectionName) || !this.sessionLevel.get(sectionName).containsKey(sessionName))
{
return isAllowedInSectionLevel(sectionName, privilegeName);
}
return this.sessionLevel.get(sectionName).get(sessionName).get(privilegeName);
}

private  boolean isAllowedInSessionLevelAnySection(String sessionName, String privilegeName) {
assert isPrivilegeNameValid(privilegeName);
Set<String> sections = new  LinkedHashSet<>(this.sessionLevel.keySet());
sections.addAll(this.sectionLevel.keySet());
for (String sectionName : sections)
{
if (isAllowedInSessionLevel(sectionName, sessionName, privilegeName))
{
return true;
}
}
return false;
}

public  void validatePrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sLUJMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sLVXULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (this.courseLevel.isCanModifySessionCommentsInSections())
{
this.courseLevel.setCanViewSessionInSections(true);
}
for (InstructorPermissionSet sectionMap : this.sectionLevel.values())
{
if (sectionMap.isCanModifySessionCommentsInSections())
{
sectionMap.setCanViewSessionInSections(true);
}
}
for (Map<String, InstructorPermissionSet> section : this.sessionLevel.values())
{
for (InstructorPermissionSet sessionMap : section.values())
{
if (sessionMap.isCanModifySessionCommentsInSections())
{
sessionMap.setCanViewSessionInSections(true);
}
}
}
threadMonitoringController.exitInternalAction("_sLVXULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sLUJMLngEeyIw-dB1KCaVA");
}
}

public  InstructorPermissionSet getCourseLevelPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sLXMgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sLa25LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorPermissionSet longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136805660020446774060737194 = courseLevel.getCopy();
threadMonitoringController.exitInternalAction("_sLa25LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136805660020446774060737194;
}
finally {
threadMonitoringController.exitService("_sLXMgLngEeyIw-dB1KCaVA");
}
}

public  Map<String, InstructorPermissionSet> getSectionLevelPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sLcsELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sLdTILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, InstructorPermissionSet> copy = new  LinkedHashMap<>();
threadMonitoringController.exitInternalAction("_sLdTILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sLg9hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sLg9hbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
sectionLevel.forEach((key, value) -> copy.put(key, value.getCopy()));
threadMonitoringController.exitInternalAction("_sLg9hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, InstructorPermissionSet> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680571005243628397192017 = copy;
threadMonitoringController.exitInternalAction("_sLg9hbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680571005243628397192017;
}
finally {
threadMonitoringController.exitService("_sLcsELngEeyIw-dB1KCaVA");
}
}

public  Map<String, Map<String, InstructorPermissionSet>> getSessionLevelPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sLiLoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sLjZwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Map<String, InstructorPermissionSet>> copy = new  LinkedHashMap<>();
threadMonitoringController.exitInternalAction("_sLjZwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sLnrNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sLnrNbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
sessionLevel.forEach((sessionLevelKey, sessionLevelValue) -> {
Map<String, InstructorPermissionSet> sectionCopy = new  LinkedHashMap<>();
sessionLevelValue.forEach((key, value) -> sectionCopy.put(key, value.getCopy()));
copy.put(sessionLevelKey, sectionCopy);
}
);
threadMonitoringController.exitInternalAction("_sLnrNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Map<String, InstructorPermissionSet>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680579009522464391968488 = copy;
threadMonitoringController.exitInternalAction("_sLnrNbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680579009522464391968488;
}
finally {
threadMonitoringController.exitService("_sLiLoLngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object another) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("another", another);
threadMonitoringController.enterService("_sLpgYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sLqHcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!(another instanceof InstructorPrivileges))
{
return false;
}
if (another == this)
{
return true;
}
InstructorPrivileges rhs = (InstructorPrivileges) another;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680581002377600552104765 = this.getCourseLevelPrivileges().equals(rhs.getCourseLevelPrivileges()) && this.getSectionLevelPrivileges().equals(rhs.getSectionLevelPrivileges()) && this.getSessionLevelPrivileges().equals(rhs.getSessionLevelPrivileges());
threadMonitoringController.exitInternalAction("_sLqHcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680581002377600552104765;
}
finally {
threadMonitoringController.exitService("_sLpgYLngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sL2UsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sL27wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int prime = 31;
int result = 1;
result = prime * result + this.getCourseLevelPrivileges().hashCode();
result = prime * result + this.getSectionLevelPrivileges().hashCode();
result = prime * result + this.getSessionLevelPrivileges().hashCode();
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680583003504616267068654 = result;
threadMonitoringController.exitInternalAction("_sL27wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680583003504616267068654;
}
finally {
threadMonitoringController.exitService("_sL2UsLngEeyIw-dB1KCaVA");
}
}

}
