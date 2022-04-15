package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import teammates.common.datatransfer.InstructorPrivileges;
import teammates.common.datatransfer.InstructorPrivilegesLegacy;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.FieldValidator;
import teammates.common.util.JsonUtils;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.Instructor;
public class InstructorAttributes extends EntityAttributes<Instructor> {
private String courseId;

private String email;

private String name;

private String googleId;

private String role;

private String displayedName;

private boolean isArchived;

private boolean isDisplayedToStudents;

private InstructorPrivileges privileges;

private transient String key;

private transient Instant createdAt;

private transient Instant updatedAt;

private  InstructorAttributes(String courseId, String email){
this.courseId = courseId;
this.email = email;
this.role = Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER;
this.displayedName = Const.DEFAULT_DISPLAY_NAME_FOR_INSTRUCTOR;
this.isArchived = false;
this.isDisplayedToStudents = true;
this.privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
this.createdAt = Const.TIME_REPRESENTS_DEFAULT_TIMESTAMP;
this.updatedAt = Const.TIME_REPRESENTS_DEFAULT_TIMESTAMP;
}
public static  Builder builder(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_aSFwMLvVEeyr6avTgCRLkQ", InstructorAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSG-ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017275007614383162246184 = new  Builder(courseId, email);
threadMonitoringController.exitInternalAction("_aSG-ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017275007614383162246184;
}
finally {
threadMonitoringController.exitService("_aSFwMLvVEeyr6avTgCRLkQ");
}
}

public static  InstructorAttributes valueOf(Instructor instructor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_aSIzgLvVEeyr6avTgCRLkQ", InstructorAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSKBoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes instructorAttributes = new  InstructorAttributes(instructor.getCourseId(), instructor.getEmail());
instructorAttributes.name = instructor.getName();
instructorAttributes.googleId = instructor.getGoogleId();
instructorAttributes.key = instructor.getRegistrationKey();
if (instructor.getRole() != null)
{
instructorAttributes.role = instructor.getRole();
}
if (instructor.getDisplayedName() != null)
{
instructorAttributes.displayedName = instructor.getDisplayedName();
}
instructorAttributes.isArchived = instructor.getIsArchived();
instructorAttributes.isDisplayedToStudents = instructor.isDisplayedToStudents();
if (instructor.getInstructorPrivilegesAsText() == null)
{
instructorAttributes.privileges = new  InstructorPrivileges(instructorAttributes.role);
}
else
{
InstructorPrivilegesLegacy privilegesLegacy = JsonUtils.fromJson(instructor.getInstructorPrivilegesAsText(), InstructorPrivilegesLegacy.class);
instructorAttributes.privileges = new  InstructorPrivileges(privilegesLegacy);
}
if (instructor.getCreatedAt() != null)
{
instructorAttributes.createdAt = instructor.getCreatedAt();
}
if (instructor.getUpdatedAt() != null)
{
instructorAttributes.updatedAt = instructor.getUpdatedAt();
}
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301728400009790901052550094 = instructorAttributes;
threadMonitoringController.exitInternalAction("_aSKBoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301728400009790901052550094;
}
finally {
threadMonitoringController.exitService("_aSIzgLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSO6ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSPhMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes instructorAttributes = new  InstructorAttributes(courseId, email);
instructorAttributes.name = name;
instructorAttributes.googleId = googleId;
instructorAttributes.key = key;
instructorAttributes.role = role;
instructorAttributes.displayedName = displayedName;
instructorAttributes.isArchived = isArchived;
instructorAttributes.isDisplayedToStudents = isDisplayedToStudents;
instructorAttributes.privileges = privileges;
instructorAttributes.createdAt = createdAt;
instructorAttributes.updatedAt = updatedAt;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301729200297278426088479 = instructorAttributes;
threadMonitoringController.exitInternalAction("_aSPhMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301729200297278426088479;
}
finally {
threadMonitoringController.exitService("_aSO6ILvVEeyr6avTgCRLkQ");
}
}

public  String getInstructorPrivilegesAsText() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSQvULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSVn1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301730000006851969766210497 = JsonUtils.toJson(privileges.toLegacyFormat(), InstructorPrivilegesLegacy.class);
threadMonitoringController.exitInternalAction("_aSVn1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301730000006851969766210497;
}
finally {
threadMonitoringController.exitService("_aSQvULvVEeyr6avTgCRLkQ");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSXdALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSYEELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017308006002735154646163 = name;
threadMonitoringController.exitInternalAction("_aSYEELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017308006002735154646163;
}
finally {
threadMonitoringController.exitService("_aSXdALvVEeyr6avTgCRLkQ");
}
}

public  void setName(String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_aSYrILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSZSMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = name;
threadMonitoringController.exitInternalAction("_aSZSMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aSYrILvVEeyr6avTgCRLkQ");
}
}

public  String getKey() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSagULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSbHYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301732400529822842350871 = key;
threadMonitoringController.exitInternalAction("_aSbHYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301732400529822842350871;
}
finally {
threadMonitoringController.exitService("_aSagULvVEeyr6avTgCRLkQ");
}
}

public  void setKey(String key) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("key", key);
threadMonitoringController.enterService("_aScVgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSc8kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.key = key;
threadMonitoringController.exitInternalAction("_aSc8kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aScVgLvVEeyr6avTgCRLkQ");
}
}

public  boolean isArchived() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSeKsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSexwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017339008706887668192249 = isArchived;
threadMonitoringController.exitInternalAction("_aSexwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017339008706887668192249;
}
finally {
threadMonitoringController.exitService("_aSeKsLvVEeyr6avTgCRLkQ");
}
}

public  void setArchived(boolean archived) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("archived", archived);
threadMonitoringController.enterService("_aSf_4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSgm8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
isArchived = archived;
threadMonitoringController.exitInternalAction("_aSgm8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aSf_4LvVEeyr6avTgCRLkQ");
}
}

public  InstructorPrivileges getPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSh1ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSicILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorPrivileges longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017356005081358913553642 = privileges;
threadMonitoringController.exitInternalAction("_aSicILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017356005081358913553642;
}
finally {
threadMonitoringController.exitService("_aSh1ELvVEeyr6avTgCRLkQ");
}
}

public  void setPrivileges(InstructorPrivileges privileges) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privileges", privileges);
threadMonitoringController.enterService("_aSjqQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSkRULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.privileges = privileges;
threadMonitoringController.exitInternalAction("_aSkRULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aSjqQLvVEeyr6avTgCRLkQ");
}
}

public  String getDisplayedName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSk4YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSlfcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017376003229236238280715 = displayedName;
threadMonitoringController.exitInternalAction("_aSlfcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017376003229236238280715;
}
finally {
threadMonitoringController.exitService("_aSk4YLvVEeyr6avTgCRLkQ");
}
}

public  void setDisplayedName(String displayedName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("displayedName", displayedName);
threadMonitoringController.enterService("_aSmtkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSnUoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.displayedName = displayedName;
threadMonitoringController.exitInternalAction("_aSnUoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aSmtkLvVEeyr6avTgCRLkQ");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSoiwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSpJ0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130173920017298661418852157 = email;
threadMonitoringController.exitInternalAction("_aSpJ0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130173920017298661418852157;
}
finally {
threadMonitoringController.exitService("_aSoiwLvVEeyr6avTgCRLkQ");
}
}

public  void setEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_aSqX8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSrmELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = email;
threadMonitoringController.exitInternalAction("_aSrmELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aSqX8LvVEeyr6avTgCRLkQ");
}
}

public  boolean isDisplayedToStudents() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSsNILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSs0MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017407003941421240104718 = isDisplayedToStudents;
threadMonitoringController.exitInternalAction("_aSs0MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017407003941421240104718;
}
finally {
threadMonitoringController.exitService("_aSsNILvVEeyr6avTgCRLkQ");
}
}

public  void setDisplayedToStudents(boolean displayedToStudents) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("displayedToStudents", displayedToStudents);
threadMonitoringController.enterService("_aSuCULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSupYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
isDisplayedToStudents = displayedToStudents;
threadMonitoringController.exitInternalAction("_aSupYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aSuCULvVEeyr6avTgCRLkQ");
}
}

public  boolean isRegistered() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSv3gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aSxFoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017424008602994999701796 = googleId != null && !googleId.trim().isEmpty();
threadMonitoringController.exitInternalAction("_aSxFoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017424008602994999701796;
}
finally {
threadMonitoringController.exitService("_aSv3gLvVEeyr6avTgCRLkQ");
}
}

public  String getRegistrationUrl() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aSyTwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aS4aabvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017437009350167885326875 = Config.getFrontEndAppUrl(Const.WebPageURIs.JOIN_PAGE).withRegistrationKey(key).withEntityType(Const.EntityType.INSTRUCTOR).toString();
threadMonitoringController.exitInternalAction("_aS4aabvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aS4abrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130174370048927371652972806 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017437009350167885326875;
threadMonitoringController.exitInternalAction("_aS4abrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130174370048927371652972806;
}
finally {
threadMonitoringController.exitService("_aSyTwLvVEeyr6avTgCRLkQ");
}
}

@Override
public  Instructor toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aS6PkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return new  Instructor(googleId, courseId, isArchived, name, email, role, isDisplayedToStudents, displayedName, getInstructorPrivilegesAsText());
}
finally {
threadMonitoringController.exitService("_aS6PkLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aTBkULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aTCLYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (googleId != null)
{
addNonEmptyError(FieldValidator.getInvalidityInfoForGoogleId(googleId), errors);
}
threadMonitoringController.exitInternalAction("_aTCLYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTISBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_aTISBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTLVU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(name), errors);
threadMonitoringController.exitInternalAction("_aTLVU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTNKg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(email), errors);
threadMonitoringController.exitInternalAction("_aTNKg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTNxk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(displayedName), errors);
threadMonitoringController.exitInternalAction("_aTNxk7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTQN1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTQ047vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForRole(role), errors);
threadMonitoringController.exitInternalAction("_aTQ047vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aTQN1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTQ05LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017478009150278108287927 = errors;
threadMonitoringController.exitInternalAction("_aTQ05LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017478009150278108287927;
}
finally {
threadMonitoringController.exitService("_aTBkULvVEeyr6avTgCRLkQ");
}
}

public static  void sortByName(List<InstructorAttributes> instructors) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructors", instructors);
threadMonitoringController.enterService("_aTTRILvVEeyr6avTgCRLkQ", InstructorAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aTWUcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructors.sort(Comparator.comparing(instructor -> instructor.name.toLowerCase()));
threadMonitoringController.exitInternalAction("_aTWUcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aTTRILvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aTYwsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return JsonUtils.toJson(this, InstructorAttributes.class);
}
finally {
threadMonitoringController.exitService("_aTYwsLvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aTeQQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aTgFcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.email).append(this.name).append(this.courseId).append(this.googleId).append(this.displayedName).append(this.role);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130174990017532183192471684 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_aTgFcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130174990017532183192471684;
}
finally {
threadMonitoringController.exitService("_aTeQQLvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_aTjIwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aTk98LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017508008788352282017998 = false;
threadMonitoringController.exitInternalAction("_aTk98LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017508008788352282017998;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301750800795715440349734 = true;
threadMonitoringController.exitInternalAction("_aTk98LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301750800795715440349734;
}
else
if (this.getClass() == other.getClass())
{
InstructorAttributes otherInstructor = (InstructorAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175080046009956483743464 = Objects.equals(this.email, otherInstructor.email) && Objects.equals(this.name, otherInstructor.name) && Objects.equals(this.courseId, otherInstructor.courseId) && Objects.equals(this.googleId, otherInstructor.googleId) && Objects.equals(this.displayedName, otherInstructor.displayedName) && Objects.equals(this.role, otherInstructor.role);
threadMonitoringController.exitInternalAction("_aTk98LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175080046009956483743464;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175080049928987162738037 = false;
threadMonitoringController.exitInternalAction("_aTk98LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175080049928987162738037;
}
}
finally {
threadMonitoringController.exitService("_aTjIwLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aTmMELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
googleId = SanitizationHelper.sanitizeGoogleId(googleId);
name = SanitizationHelper.sanitizeName(name);
email = SanitizationHelper.sanitizeEmail(email);
courseId = SanitizationHelper.sanitizeTitle(courseId);
threadMonitoringController.enterInternalAction("_aTpPYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (role == null)
{
role = Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER;
}
else
{
role = SanitizationHelper.sanitizeName(role);
}
if (displayedName == null)
{
displayedName = Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER;
}
else
{
displayedName = SanitizationHelper.sanitizeName(displayedName);
}
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_aTpPYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aTmMELvVEeyr6avTgCRLkQ");
}
}

public  boolean isAllowedForPrivilege(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_aTrEkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aTrroLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_aTrroLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTuH6bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175290040668302568005965 = privileges.isAllowedForPrivilege(privilegeName);
threadMonitoringController.exitInternalAction("_aTuH6bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175290040668302568005965;
}
finally {
threadMonitoringController.exitService("_aTrEkLvVEeyr6avTgCRLkQ");
}
}

public  boolean isAllowedForPrivilege(String sectionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_aTv9ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aTwkILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_aTwkILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aTznebvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017546003891130446074288 = privileges.isAllowedForPrivilege(sectionName, privilegeName);
threadMonitoringController.exitInternalAction("_aTznebvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017546003891130446074288;
}
finally {
threadMonitoringController.exitService("_aTv9ELvVEeyr6avTgCRLkQ");
}
}

public  boolean isAllowedForPrivilege(String sectionName, String sessionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_aT01kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aT1coLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_aT1coLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aT8KVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017562006489563218314593 = privileges.isAllowedForPrivilege(sectionName, sessionName, privilegeName);
threadMonitoringController.exitInternalAction("_aT8KVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017562006489563218314593;
}
finally {
threadMonitoringController.exitService("_aT01kLvVEeyr6avTgCRLkQ");
}
}

public  boolean isAllowedForPrivilegeAnySection(String sessionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_aT9_gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aT_NoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_aT_NoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aUBp67vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017576009256916805927788 = privileges.isAllowedForPrivilegeAnySection(sessionName, privilegeName);
threadMonitoringController.exitInternalAction("_aUBp67vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017576009256916805927788;
}
finally {
threadMonitoringController.exitService("_aT9_gLvVEeyr6avTgCRLkQ");
}
}

public  boolean hasCoownerPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aUC4ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUEtNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175860019413066558788317 = privileges.hasCoownerPrivileges();
threadMonitoringController.exitInternalAction("_aUEtNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175860019413066558788317;
}
finally {
threadMonitoringController.exitService("_aUC4ALvVEeyr6avTgCRLkQ");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aUF7ULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUGiYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175940003029906952741268 = courseId;
threadMonitoringController.exitInternalAction("_aUGiYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130175940003029906952741268;
}
finally {
threadMonitoringController.exitService("_aUF7ULvVEeyr6avTgCRLkQ");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_aUHwgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUIXkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_aUIXkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aUHwgLvVEeyr6avTgCRLkQ");
}
}

public  String getGoogleId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aUKMwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUKz0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017616009379175246907413 = googleId;
threadMonitoringController.exitInternalAction("_aUKz0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017616009379175246907413;
}
finally {
threadMonitoringController.exitService("_aUKMwLvVEeyr6avTgCRLkQ");
}
}

public  void setGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_aUMB8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUMpALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.googleId = googleId;
threadMonitoringController.exitInternalAction("_aUMpALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aUMB8LvVEeyr6avTgCRLkQ");
}
}

public  String getRole() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aUN3ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUOeMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017633007112126447118887 = role;
threadMonitoringController.exitInternalAction("_aUOeMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017633007112126447118887;
}
finally {
threadMonitoringController.exitService("_aUN3ILvVEeyr6avTgCRLkQ");
}
}

public  void setRole(String role) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("role", role);
threadMonitoringController.enterService("_aUPsULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUQTYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.role = role;
threadMonitoringController.exitInternalAction("_aUQTYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aUPsULvVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aURhgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUSIkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301765200624807561251285 = createdAt;
threadMonitoringController.exitInternalAction("_aUSIkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301765200624807561251285;
}
finally {
threadMonitoringController.exitService("_aURhgLvVEeyr6avTgCRLkQ");
}
}

public  Instant getUpdatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aUT9wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUUk0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130176600010352475188375809 = updatedAt;
threadMonitoringController.exitInternalAction("_aUUk0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130176600010352475188375809;
}
finally {
threadMonitoringController.exitService("_aUT9wLvVEeyr6avTgCRLkQ");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_aUVy8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUWaALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_aUWaALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aUVy8LvVEeyr6avTgCRLkQ");
}
}

public  void setUpdatedAt(Instant updatedAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updatedAt", updatedAt);
threadMonitoringController.enterService("_aUYPMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUY2QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.updatedAt = updatedAt;
threadMonitoringController.exitInternalAction("_aUY2QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aUYPMLvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptionsWithEmail updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aUaEYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUbSgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.googleIdOption.ifPresent(s -> googleId = s);
threadMonitoringController.exitInternalAction("_aUbSgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aUduxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateBasic(updateOptions);
threadMonitoringController.exitInternalAction("_aUduxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aUaEYLvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptionsWithGoogleId updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aUe84LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUgLALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.emailOption.ifPresent(s -> email = s);
threadMonitoringController.exitInternalAction("_aUgLALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aUiANLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateBasic(updateOptions);
threadMonitoringController.exitInternalAction("_aUiANLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aUe84LvVEeyr6avTgCRLkQ");
}
}

private  void updateBasic(UpdateOptions updateOptions) {
updateOptions.nameOption.ifPresent(s -> name = s);
updateOptions.isArchivedOption.ifPresent(s -> isArchived = s);
updateOptions.roleOption.ifPresent(s -> role = s);
updateOptions.isDisplayedToStudentsOption.ifPresent(s -> isDisplayedToStudents = s);
updateOptions.instructorPrivilegesOption.ifPresent(s -> privileges = s);
updateOptions.displayedNameOption.ifPresent(s -> displayedName = s);
}

public static  UpdateOptionsWithEmail.Builder updateOptionsWithEmailBuilder(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_aUj1YLvVEeyr6avTgCRLkQ", InstructorAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUkccLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptionsWithEmail.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130177090007489070813851939 = new  UpdateOptionsWithEmail.Builder(courseId, email);
threadMonitoringController.exitInternalAction("_aUkccLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130177090007489070813851939;
}
finally {
threadMonitoringController.exitService("_aUj1YLvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptionsWithGoogleId.Builder updateOptionsWithGoogleIdBuilder(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_aUmRoLvVEeyr6avTgCRLkQ", InstructorAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aUm4sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptionsWithGoogleId.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017716006848372309414447 = new  UpdateOptionsWithGoogleId.Builder(courseId, googleId);
threadMonitoringController.exitInternalAction("_aUm4sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017716006848372309414447;
}
finally {
threadMonitoringController.exitService("_aUmRoLvVEeyr6avTgCRLkQ");
}
}

public static class Builder extends BasicBuilder<InstructorAttributes, Builder> {
private final InstructorAttributes instructorAttributes;

private  Builder(String courseId, String email){
super(new  UpdateOptions());
thisBuilder = this;
assert courseId != null;
assert email != null;
instructorAttributes = new  InstructorAttributes(courseId, email);
}
public  Builder withGoogleId(String googleId) {
assert googleId != null;
instructorAttributes.googleId = googleId;
return this;
}

@Override
public  InstructorAttributes build() {
instructorAttributes.updateBasic(updateOptions);
return instructorAttributes;
}

}
public static class UpdateOptionsWithEmail extends UpdateOptions {
private String courseId;

private String email;

private UpdateOption<String> googleIdOption = UpdateOption.empty();

private  UpdateOptionsWithEmail(String courseId, String email){
super();
assert courseId != null;
assert email != null;
this.courseId = courseId;
this.email = email;
}
public  String getCourseId() {
return courseId;
}

public  String getEmail() {
return email;
}

@Override
public  String toString() {
return super.toString() + "]" + String.format("(courseId = %s/googleId = %s)", courseId, email);
}

public static class Builder extends BasicBuilder<UpdateOptionsWithEmail, UpdateOptionsWithEmail.Builder> {
private UpdateOptionsWithEmail updateOptionsWithEmail;

private  Builder(String courseId, String email){
super(new  UpdateOptionsWithEmail(courseId, email));
thisBuilder = this;
updateOptionsWithEmail = (UpdateOptionsWithEmail) updateOptions;
}
public  Builder withGoogleId(String googleId) {
updateOptionsWithEmail.googleIdOption = UpdateOption.of(googleId);
return this;
}

@Override
public  UpdateOptionsWithEmail build() {
return updateOptionsWithEmail;
}

}
}
public static class UpdateOptionsWithGoogleId extends UpdateOptions {
private String courseId;

private String googleId;

private UpdateOption<String> emailOption = UpdateOption.empty();

private  UpdateOptionsWithGoogleId(String courseId, String googleId){
super();
assert courseId != null;
assert googleId != null;
this.courseId = courseId;
this.googleId = googleId;
}
public  String getCourseId() {
return courseId;
}

public  String getGoogleId() {
return googleId;
}

@Override
public  String toString() {
return super.toString() + ", email = " + emailOption + "]" + String.format("(courseId = %s/googleId = %s)", courseId, googleId);
}

public static class Builder extends BasicBuilder<UpdateOptionsWithGoogleId, UpdateOptionsWithGoogleId.Builder> {
private UpdateOptionsWithGoogleId updateOptionsWithGoogleId;

private  Builder(String courseId, String email){
super(new  UpdateOptionsWithGoogleId(courseId, email));
thisBuilder = this;
updateOptionsWithGoogleId = (UpdateOptionsWithGoogleId) updateOptions;
}
public  Builder withEmail(String email) {
assert email != null;
updateOptionsWithGoogleId.emailOption = UpdateOption.of(email);
return this;
}

@Override
public  UpdateOptionsWithGoogleId build() {
return updateOptionsWithGoogleId;
}

}
}
private static class UpdateOptions {
UpdateOption<String> nameOption = UpdateOption.empty();

UpdateOption<Boolean> isArchivedOption = UpdateOption.empty();

UpdateOption<String> roleOption = UpdateOption.empty();

UpdateOption<Boolean> isDisplayedToStudentsOption = UpdateOption.empty();

UpdateOption<String> displayedNameOption = UpdateOption.empty();

UpdateOption<InstructorPrivileges> instructorPrivilegesOption = UpdateOption.empty();

@Override
public  String toString() {
return "InstructorAttributes.UpdateOptions [" + "name = " + nameOption + ", isAchieved = " + isArchivedOption + ", roleOption = " + roleOption + ", isDisplayedToStudents = " + isDisplayedToStudentsOption + ", displayedName = " + displayedNameOption + ", instructorPrivilegeAsText = " + instructorPrivilegesOption;
}

}
private abstract static class BasicBuilder<T, B extends BasicBuilder<T, B>>  {
UpdateOptions updateOptions;

B thisBuilder;

 BasicBuilder(UpdateOptions updateOptions){
this.updateOptions = updateOptions;
}
public  B withName(String name) {
assert name != null;
updateOptions.nameOption = UpdateOption.of(name);
return thisBuilder;
}

public  B withRole(String role) {
assert role != null;
updateOptions.roleOption = UpdateOption.of(role);
return thisBuilder;
}

public  B withDisplayedName(String displayedName) {
assert displayedName != null;
updateOptions.displayedNameOption = UpdateOption.of(displayedName);
return thisBuilder;
}

public  B withPrivileges(InstructorPrivileges instructorPrivileges) {
assert instructorPrivileges != null;
updateOptions.instructorPrivilegesOption = UpdateOption.of(instructorPrivileges);
return thisBuilder;
}

public  B withIsDisplayedToStudents(boolean isDisplayedToStudents) {
updateOptions.isDisplayedToStudentsOption = UpdateOption.of(isDisplayedToStudents);
return thisBuilder;
}

public  B withIsArchived(boolean isAchieved) {
updateOptions.isArchivedOption = UpdateOption.of(isAchieved);
return thisBuilder;
}

public abstract  T build() ;

}
}
