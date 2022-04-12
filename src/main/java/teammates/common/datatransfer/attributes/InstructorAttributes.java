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
threadMonitoringController.enterService("_r2Dq4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2ER8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367993300631577170431387 = new  Builder(courseId, email);
threadMonitoringController.exitInternalAction("_r2ER8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367993300631577170431387;
}
finally {
threadMonitoringController.exitService("_r2Dq4LngEeyIw-dB1KCaVA");
}
}

public static  InstructorAttributes valueOf(Instructor instructor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_r2E5ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2GHILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799360021467641878328958 = instructorAttributes;
threadMonitoringController.exitInternalAction("_r2GHILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799360021467641878328958;
}
finally {
threadMonitoringController.exitService("_r2E5ALngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2JxgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2KYkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679940005413536478184728 = instructorAttributes;
threadMonitoringController.exitInternalAction("_r2KYkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679940005413536478184728;
}
finally {
threadMonitoringController.exitService("_r2JxgLngEeyIw-dB1KCaVA");
}
}

public  String getInstructorPrivilegesAsText() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2LmsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2QfNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799430063902443634301 = JsonUtils.toJson(privileges.toLegacyFormat(), InstructorPrivilegesLegacy.class);
threadMonitoringController.exitInternalAction("_r2QfNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799430063902443634301;
}
finally {
threadMonitoringController.exitService("_r2LmsLngEeyIw-dB1KCaVA");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2RtULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2SUYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799460013846425569188436 = name;
threadMonitoringController.exitInternalAction("_r2SUYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799460013846425569188436;
}
finally {
threadMonitoringController.exitService("_r2RtULngEeyIw-dB1KCaVA");
}
}

public  void setName(String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_r2S7cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2TigLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = name;
threadMonitoringController.exitInternalAction("_r2TigLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r2S7cLngEeyIw-dB1KCaVA");
}
}

public  String getKey() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2VXsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2V-wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679951007112548295956719 = key;
threadMonitoringController.exitInternalAction("_r2V-wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679951007112548295956719;
}
finally {
threadMonitoringController.exitService("_r2VXsLngEeyIw-dB1KCaVA");
}
}

public  void setKey(String key) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("key", key);
threadMonitoringController.enterService("_r2XM4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2XM4bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.key = key;
threadMonitoringController.exitInternalAction("_r2XM4bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r2XM4LngEeyIw-dB1KCaVA");
}
}

public  boolean isArchived() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2YbALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2ZCELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799570032584062219998766 = isArchived;
threadMonitoringController.exitInternalAction("_r2ZCELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799570032584062219998766;
}
finally {
threadMonitoringController.exitService("_r2YbALngEeyIw-dB1KCaVA");
}
}

public  void setArchived(boolean archived) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("archived", archived);
threadMonitoringController.enterService("_r2aQMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2a3QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
isArchived = archived;
threadMonitoringController.exitInternalAction("_r2a3QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r2aQMLngEeyIw-dB1KCaVA");
}
}

public  InstructorPrivileges getPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2beULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2cFYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorPrivileges longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679962004767073807706034 = privileges;
threadMonitoringController.exitInternalAction("_r2cFYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679962004767073807706034;
}
finally {
threadMonitoringController.exitService("_r2beULngEeyIw-dB1KCaVA");
}
}

public  void setPrivileges(InstructorPrivileges privileges) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privileges", privileges);
threadMonitoringController.enterService("_r2dTgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2d6kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.privileges = privileges;
threadMonitoringController.exitInternalAction("_r2d6kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r2dTgLngEeyIw-dB1KCaVA");
}
}

public  String getDisplayedName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2fIsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2fvwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799680006195041626910802 = displayedName;
threadMonitoringController.exitInternalAction("_r2fvwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799680006195041626910802;
}
finally {
threadMonitoringController.exitService("_r2fIsLngEeyIw-dB1KCaVA");
}
}

public  void setDisplayedName(String displayedName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("displayedName", displayedName);
threadMonitoringController.enterService("_r2g94LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2hk8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.displayedName = displayedName;
threadMonitoringController.exitInternalAction("_r2hk8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r2g94LngEeyIw-dB1KCaVA");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2izELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2izEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679974002452718271463714 = email;
threadMonitoringController.exitInternalAction("_r2izEbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679974002452718271463714;
}
finally {
threadMonitoringController.exitService("_r2izELngEeyIw-dB1KCaVA");
}
}

public  void setEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_r2kBMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2koQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = email;
threadMonitoringController.exitInternalAction("_r2koQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r2kBMLngEeyIw-dB1KCaVA");
}
}

public  boolean isDisplayedToStudents() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2l2YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2mdcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799810018475790595203645 = isDisplayedToStudents;
threadMonitoringController.exitInternalAction("_r2mdcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799810018475790595203645;
}
finally {
threadMonitoringController.exitService("_r2l2YLngEeyIw-dB1KCaVA");
}
}

public  void setDisplayedToStudents(boolean displayedToStudents) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("displayedToStudents", displayedToStudents);
threadMonitoringController.enterService("_r2oSoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2pgwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
isDisplayedToStudents = displayedToStudents;
threadMonitoringController.exitInternalAction("_r2pgwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r2oSoLngEeyIw-dB1KCaVA");
}
}

public  boolean isRegistered() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2qH0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2rV8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679987007804393379006649 = googleId != null && !googleId.trim().isEmpty();
threadMonitoringController.exitInternalAction("_r2rV8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679987007804393379006649;
}
finally {
threadMonitoringController.exitService("_r2qH0LngEeyIw-dB1KCaVA");
}
}

public  String getRegistrationUrl() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2skELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r2yDq7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799920030235707684128554 = Config.getFrontEndAppUrl(Const.WebPageURIs.JOIN_PAGE).withRegistrationKey(key).withEntityType(Const.EntityType.INSTRUCTOR).toString();
threadMonitoringController.exitInternalAction("_r2yDq7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r2yqtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799920001420798452384131 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799920030235707684128554;
threadMonitoringController.exitInternalAction("_r2yqtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136799920001420798452384131;
}
finally {
threadMonitoringController.exitService("_r2skELngEeyIw-dB1KCaVA");
}
}

@Override
public  Instructor toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r2z40LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return new  Instructor(googleId, courseId, isArchived, name, email, role, isDisplayedToStudents, displayedName, getInstructorPrivilegesAsText());
}
finally {
threadMonitoringController.exitService("_r2z40LngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r25_cbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r26mgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
if (googleId != null)
{
addNonEmptyError(FieldValidator.getInvalidityInfoForGoogleId(googleId), errors);
}
threadMonitoringController.exitInternalAction("_r26mgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3AtJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(courseId), errors);
threadMonitoringController.exitInternalAction("_r3AtJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3DJY7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(name), errors);
threadMonitoringController.exitInternalAction("_r3DJY7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3EXg7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(email), errors);
threadMonitoringController.exitInternalAction("_r3EXg7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3E-k7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(displayedName), errors);
threadMonitoringController.exitInternalAction("_r3E-k7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3GMtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3GMuLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForRole(role), errors);
threadMonitoringController.exitInternalAction("_r3GMuLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_r3GMtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3GMubngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680007006779640690622782 = errors;
threadMonitoringController.exitInternalAction("_r3GMubngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680007006779640690622782;
}
finally {
threadMonitoringController.exitService("_r25_cbngEeyIw-dB1KCaVA");
}
}

public static  void sortByName(List<InstructorAttributes> instructors) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructors", instructors);
threadMonitoringController.enterService("_r3IB4bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3J3ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructors.sort(Comparator.comparing(instructor -> instructor.name.toLowerCase()));
threadMonitoringController.exitInternalAction("_r3J3ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r3IB4bngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r3LsQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return JsonUtils.toJson(this, InstructorAttributes.class);
}
finally {
threadMonitoringController.exitService("_r3LsQLngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r3OIgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3PWoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.email).append(this.name).append(this.courseId).append(this.googleId).append(this.displayedName).append(this.role);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800150007350958603759494 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_r3PWoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800150007350958603759494;
}
finally {
threadMonitoringController.exitService("_r3OIgLngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_r3UPILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3WEULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680017004135773029374379 = false;
threadMonitoringController.exitInternalAction("_r3WEULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680017004135773029374379;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800170009944744172858377 = true;
threadMonitoringController.exitInternalAction("_r3WEULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800170009944744172858377;
}
else
if (this.getClass() == other.getClass())
{
InstructorAttributes otherInstructor = (InstructorAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800170006788526579534393 = Objects.equals(this.email, otherInstructor.email) && Objects.equals(this.name, otherInstructor.name) && Objects.equals(this.courseId, otherInstructor.courseId) && Objects.equals(this.googleId, otherInstructor.googleId) && Objects.equals(this.displayedName, otherInstructor.displayedName) && Objects.equals(this.role, otherInstructor.role);
threadMonitoringController.exitInternalAction("_r3WEULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800170006788526579534393;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680018006808474927525339 = false;
threadMonitoringController.exitInternalAction("_r3WEULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680018006808474927525339;
}
}
finally {
threadMonitoringController.exitService("_r3UPILngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r3XScLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
googleId = SanitizationHelper.sanitizeGoogleId(googleId);
name = SanitizationHelper.sanitizeName(name);
email = SanitizationHelper.sanitizeEmail(email);
courseId = SanitizationHelper.sanitizeTitle(courseId);
threadMonitoringController.enterInternalAction("_r3aVwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
threadMonitoringController.exitInternalAction("_r3aVwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r3XScLngEeyIw-dB1KCaVA");
}
}

public  boolean isAllowedForPrivilege(String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_r3bj4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3cyALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_r3cyALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3enO7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680028005137147835226257 = privileges.isAllowedForPrivilege(privilegeName);
threadMonitoringController.exitInternalAction("_r3enO7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680028005137147835226257;
}
finally {
threadMonitoringController.exitService("_r3bj4LngEeyIw-dB1KCaVA");
}
}

public  boolean isAllowedForPrivilege(String sectionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_r3f1ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3gcYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_r3gcYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3i4rbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680032005062838251526861 = privileges.isAllowedForPrivilege(sectionName, privilegeName);
threadMonitoringController.exitInternalAction("_r3i4rbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680032005062838251526861;
}
finally {
threadMonitoringController.exitService("_r3f1ULngEeyIw-dB1KCaVA");
}
}

public  boolean isAllowedForPrivilege(String sectionName, String sessionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_r3kGwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3lU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_r3lU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3pmWbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368003500622877714208392 = privileges.isAllowedForPrivilege(sectionName, sessionName, privilegeName);
threadMonitoringController.exitInternalAction("_r3pmWbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368003500622877714208392;
}
finally {
threadMonitoringController.exitService("_r3kGwLngEeyIw-dB1KCaVA");
}
}

public  boolean isAllowedForPrivilegeAnySection(String sessionName, String privilegeName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sessionName", sessionName);
monitoringServiceParameters.addValue("privilegeName", privilegeName);
threadMonitoringController.enterService("_r3q0cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3rbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (privileges == null)
{
privileges = new  InstructorPrivileges(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER);
}
threadMonitoringController.exitInternalAction("_r3rbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r3ue27ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680042003773167477044501 = privileges.isAllowedForPrivilegeAnySection(sessionName, privilegeName);
threadMonitoringController.exitInternalAction("_r3ue27ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680042003773167477044501;
}
finally {
threadMonitoringController.exitService("_r3q0cLngEeyIw-dB1KCaVA");
}
}

public  boolean hasCoownerPrivileges() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r3wUALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3yJNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680045006767340423073946 = privileges.hasCoownerPrivileges();
threadMonitoringController.exitInternalAction("_r3yJNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680045006767340423073946;
}
finally {
threadMonitoringController.exitService("_r3wUALngEeyIw-dB1KCaVA");
}
}

public  String getCourseId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r3zXULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3z-YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800470009928238878888451 = courseId;
threadMonitoringController.exitInternalAction("_r3z-YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800470009928238878888451;
}
finally {
threadMonitoringController.exitService("_r3zXULngEeyIw-dB1KCaVA");
}
}

public  void setCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_r31MgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r31zkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.courseId = courseId;
threadMonitoringController.exitInternalAction("_r31zkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r31MgLngEeyIw-dB1KCaVA");
}
}

public  String getGoogleId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r33BsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r33owLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368005400044805079320371144 = googleId;
threadMonitoringController.exitInternalAction("_r33owLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368005400044805079320371144;
}
finally {
threadMonitoringController.exitService("_r33BsLngEeyIw-dB1KCaVA");
}
}

public  void setGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_r34P0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3424LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.googleId = googleId;
threadMonitoringController.exitInternalAction("_r3424LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r34P0LngEeyIw-dB1KCaVA");
}
}

public  String getRole() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r36sELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r37TILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800640006932055608338938 = role;
threadMonitoringController.exitInternalAction("_r37TILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136800640006932055608338938;
}
finally {
threadMonitoringController.exitService("_r36sELngEeyIw-dB1KCaVA");
}
}

public  void setRole(String role) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("role", role);
threadMonitoringController.enterService("_r38hQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r39IULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.role = role;
threadMonitoringController.exitInternalAction("_r39IULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r38hQLngEeyIw-dB1KCaVA");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r3-WcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r3-9gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680072000976329375808006 = createdAt;
threadMonitoringController.exitInternalAction("_r3-9gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680072000976329375808006;
}
finally {
threadMonitoringController.exitService("_r3-WcLngEeyIw-dB1KCaVA");
}
}

public  Instant getUpdatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_r3_kkbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r4ALoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368007500974776926359596 = updatedAt;
threadMonitoringController.exitInternalAction("_r4ALoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368007500974776926359596;
}
finally {
threadMonitoringController.exitService("_r3_kkbngEeyIw-dB1KCaVA");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_r4BZwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r4CA0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_r4CA0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r4BZwLngEeyIw-dB1KCaVA");
}
}

public  void setUpdatedAt(Instant updatedAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updatedAt", updatedAt);
threadMonitoringController.enterService("_r4DO8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r4EdELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.updatedAt = updatedAt;
threadMonitoringController.exitInternalAction("_r4EdELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r4DO8LngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptionsWithEmail updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_r4FrMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r4GSQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.googleIdOption.ifPresent(s -> googleId = s);
threadMonitoringController.exitInternalAction("_r4GSQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r4IHdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateBasic(updateOptions);
threadMonitoringController.exitInternalAction("_r4IHdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r4FrMLngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptionsWithGoogleId updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_r4JVkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r4J8oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.emailOption.ifPresent(s -> email = s);
threadMonitoringController.exitInternalAction("_r4J8oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_r4Lx1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateBasic(updateOptions);
threadMonitoringController.exitInternalAction("_r4Lx1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_r4JVkLngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_r4OOELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r4PcMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptionsWithEmail.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680105008607055243650706 = new  UpdateOptionsWithEmail.Builder(courseId, email);
threadMonitoringController.exitInternalAction("_r4PcMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680105008607055243650706;
}
finally {
threadMonitoringController.exitService("_r4OOELngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptionsWithGoogleId.Builder updateOptionsWithGoogleIdBuilder(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_r4R4cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_r4TtoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptionsWithGoogleId.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680108007746406283312807 = new  UpdateOptionsWithGoogleId.Builder(courseId, googleId);
threadMonitoringController.exitInternalAction("_r4TtoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680108007746406283312807;
}
finally {
threadMonitoringController.exitService("_r4R4cLngEeyIw-dB1KCaVA");
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
