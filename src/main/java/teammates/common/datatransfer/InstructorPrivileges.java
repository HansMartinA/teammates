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
threadMonitoringController.enterService("_aVJEMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aVKSULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorPrivilegesLegacy privilegesLegacy = new  InstructorPrivilegesLegacy();
threadMonitoringController.exitInternalAction("_aVKSULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aVLgdLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aVLgdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
privilegesLegacy.getCourseLevel().putAll(courseLevel.toLegacyMapFormat());
threadMonitoringController.exitInternalAction("_aVLgdLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
InstructorPrivilegesLegacy longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017734007340775662234097 = privilegesLegacy;
threadMonitoringController.exitInternalAction("_aVLgdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017734007340775662234097;
}
finally {
threadMonitoringController.exitService("_aVJEMLvVEeyr6avTgCRLkQ");
}
}

public static  boolean isPrivilegeNameValid(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_amy04LvVEeyr6avTgCRLkQ", InstructorPrivileges.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_am0qELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018826008922600369190696 = COURSE_LEVEL_ONLY_PRIVILEGES.contains(privilegeName) || SECTION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName) || SESSION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName);
threadMonitoringController.exitInternalAction("_am0qELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018826008922600369190696;
}
finally {
threadMonitoringController.exitService("_amy04LvVEeyr6avTgCRLkQ");
}
}

public static  boolean isPrivilegeNameValidForSectionLevel(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_am2fQLvVEeyr6avTgCRLkQ", InstructorPrivileges.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_am47gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018835004602404168773224 = SECTION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName) || SESSION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName);
threadMonitoringController.exitInternalAction("_am47gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018835004602404168773224;
}
finally {
threadMonitoringController.exitService("_am2fQLvVEeyr6avTgCRLkQ");
}
}

public static  boolean isPrivilegeNameValidForSessionLevel(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_am6JoLvVEeyr6avTgCRLkQ", InstructorPrivileges.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_am7-0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018845008678760824753008 = SESSION_LEVEL_ONLY_PRIVILEGES.contains(privilegeName);
threadMonitoringController.exitInternalAction("_am7-0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018845008678760824753008;
}
finally {
threadMonitoringController.exitService("_am6JoLvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_anEhsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_anGW5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updatePrivilegeInCourseLevel(privilegeName, isAllowed);
threadMonitoringController.exitInternalAction("_anGW5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_anEhsLvVEeyr6avTgCRLkQ");
}
}

public  void updatePrivilege(String sectionName, String privilegeName, boolean isAllowed) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
monitoringServiceParameters.addValue("isAllowed", isAllowed);
threadMonitoringController.enterService("_anIMELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_anOSs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updatePrivilegeInSectionLevel(sectionName, privilegeName, isAllowed);
threadMonitoringController.exitInternalAction("_anOSs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_anIMELvVEeyr6avTgCRLkQ");
}
}

public  void updatePrivilege(String sectionName, String sessionName, String privilegeName, boolean isAllowed) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
monitoringServiceParameters.addValue("isAllowed", isAllowed);
threadMonitoringController.enterService("_anQH4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_anWOhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updatePrivilegeInSessionLevel(sectionName, sessionName, privilegeName, isAllowed);
threadMonitoringController.exitInternalAction("_anWOhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_anQH4LvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_aWYaULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aWa2mbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017766008858468257444005 = isAllowedInCourseLevel(privilegeName);
threadMonitoringController.exitInternalAction("_aWa2mbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017766008858468257444005;
}
finally {
threadMonitoringController.exitService("_aWYaULvVEeyr6avTgCRLkQ");
}
}

public  boolean isAllowedForPrivilege(String sectionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_aWfvELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aWjZebvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017774004949487873070638 = isAllowedInSectionLevel(sectionName, privilegeName);
threadMonitoringController.exitInternalAction("_aWjZebvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017774004949487873070638;
}
finally {
threadMonitoringController.exitService("_aWfvELvVEeyr6avTgCRLkQ");
}
}

public  boolean isAllowedForPrivilege(String sectionName, String sessionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_aWnq4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aWr8WbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017782009912175244830804 = isAllowedInSessionLevel(sectionName, sessionName, privilegeName);
threadMonitoringController.exitInternalAction("_aWr8WbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017782009912175244830804;
}
finally {
threadMonitoringController.exitService("_aWnq4LvVEeyr6avTgCRLkQ");
}
}

public  boolean isAllowedForPrivilegeAnySection(String sessionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_aWwNwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aWzRGbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130177890048240924079129033 = isAllowedInSessionLevelAnySection(sessionName, privilegeName);
threadMonitoringController.exitInternalAction("_aWzRGbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130177890048240924079129033;
}
finally {
threadMonitoringController.exitService("_aWwNwLvVEeyr6avTgCRLkQ");
}
}

public  boolean hasCoownerPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aW1GQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aW2UYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017797008749175034056463 = courseLevel.equals(PRIVILEGES_COOWNER);
threadMonitoringController.exitInternalAction("_aW2UYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017797008749175034056463;
}
finally {
threadMonitoringController.exitService("_aW1GQLvVEeyr6avTgCRLkQ");
}
}

public  boolean hasManagerPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_anc8MLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return courseLevel.equals(PRIVILEGES_MANAGER);
}
finally {
threadMonitoringController.exitService("_anc8MLvVEeyr6avTgCRLkQ");
}
}

public  boolean hasObserverPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_anjC0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return courseLevel.equals(PRIVILEGES_OBSERVER);
}
finally {
threadMonitoringController.exitService("_anjC0LvVEeyr6avTgCRLkQ");
}
}

public  boolean hasTutorPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ann7ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return courseLevel.equals(PRIVILEGES_TUTOR);
}
finally {
threadMonitoringController.exitService("_ann7ULvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_any6cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_an1WsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.exitInternalAction("_an1WsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_any6cLvVEeyr6avTgCRLkQ");
}
}

public  InstructorPermissionSet getCourseLevelPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_an3L4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_an7dVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorPermissionSet longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018903005681343966282509 = courseLevel.getCopy();
threadMonitoringController.exitInternalAction("_an7dVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018903005681343966282509;
}
finally {
threadMonitoringController.exitService("_an3L4LvVEeyr6avTgCRLkQ");
}
}

public  Map<String, InstructorPermissionSet> getSectionLevelPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_an9SgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_an95kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, InstructorPermissionSet> copy = new  LinkedHashMap<>();
threadMonitoringController.exitInternalAction("_an95kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aoBj9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aoBj9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
sectionLevel.forEach((key, value) -> copy.put(key, value.getCopy()));
threadMonitoringController.exitInternalAction("_aoBj9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, InstructorPermissionSet> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130189200036513309206322264 = copy;
threadMonitoringController.exitInternalAction("_aoBj9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130189200036513309206322264;
}
finally {
threadMonitoringController.exitService("_an9SgLvVEeyr6avTgCRLkQ");
}
}

public  Map<String, Map<String, InstructorPermissionSet>> getSessionLevelPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aoDZILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aoEnQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Map<String, InstructorPermissionSet>> copy = new  LinkedHashMap<>();
threadMonitoringController.exitInternalAction("_aoEnQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aoJfxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aoJfxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
sessionLevel.forEach((sessionLevelKey, sessionLevelValue) -> {
Map<String, InstructorPermissionSet> sectionCopy = new  LinkedHashMap<>();
sessionLevelValue.forEach((key, value) -> sectionCopy.put(key, value.getCopy()));
copy.put(sessionLevelKey, sectionCopy);
}
);
threadMonitoringController.exitInternalAction("_aoJfxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, Map<String, InstructorPermissionSet>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130189390023678361217572608 = copy;
threadMonitoringController.exitInternalAction("_aoJfxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130189390023678361217572608;
}
finally {
threadMonitoringController.exitService("_aoDZILvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object another) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("another", another);
threadMonitoringController.enterService("_aoLU8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aoL8ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!(another instanceof InstructorPrivileges))
{
return false;
}
if (another == this)
{
return true;
}
InstructorPrivileges rhs = (InstructorPrivileges) another;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130189490004983144497828884 = this.getCourseLevelPrivileges().equals(rhs.getCourseLevelPrivileges()) && this.getSectionLevelPrivileges().equals(rhs.getSectionLevelPrivileges()) && this.getSessionLevelPrivileges().equals(rhs.getSessionLevelPrivileges());
threadMonitoringController.exitInternalAction("_aoL8ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130189490004983144497828884;
}
finally {
threadMonitoringController.exitService("_aoLU8LvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aoZXYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aoalgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int prime = 31;
int result = 1;
result = prime * result + this.getCourseLevelPrivileges().hashCode();
result = prime * result + this.getSectionLevelPrivileges().hashCode();
result = prime * result + this.getSessionLevelPrivileges().hashCode();
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018958009451207651504802 = result;
threadMonitoringController.exitInternalAction("_aoalgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018958009451207651504802;
}
finally {
threadMonitoringController.exitService("_aoZXYLvVEeyr6avTgCRLkQ");
}
}

}
