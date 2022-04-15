package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.FieldValidator;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.CourseStudent;
public class StudentAttributes extends EntityAttributes<CourseStudent> {
private String email;

private String course;

private String name;

private String googleId;

private String comments;

private String team;

private String section;

private transient String key;

private transient Instant createdAt;

private transient Instant updatedAt;

private  StudentAttributes(String courseId, String email){
this.course = courseId;
this.email = email;
this.googleId = "";
this.section = Const.DEFAULT_SECTION;
this.createdAt = Const.TIME_REPRESENTS_DEFAULT_TIMESTAMP;
this.updatedAt = Const.TIME_REPRESENTS_DEFAULT_TIMESTAMP;
}
public static  StudentAttributes valueOf(CourseStudent student) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_aYSe0LvVEeyr6avTgCRLkQ", StudentAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYTs8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes studentAttributes = new  StudentAttributes(student.getCourseId(), student.getEmail());
studentAttributes.name = student.getName();
if (student.getGoogleId() != null)
{
studentAttributes.googleId = student.getGoogleId();
}
studentAttributes.team = student.getTeamName();
if (student.getSectionName() != null)
{
studentAttributes.section = student.getSectionName();
}
studentAttributes.comments = student.getComments();
studentAttributes.key = student.getRegistrationKey();
if (student.getCreatedAt() != null)
{
studentAttributes.createdAt = student.getCreatedAt();
}
if (student.getUpdatedAt() != null)
{
studentAttributes.updatedAt = student.getUpdatedAt();
}
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301780500714510910952078 = studentAttributes;
threadMonitoringController.exitInternalAction("_aYTs8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301780500714510910952078;
}
finally {
threadMonitoringController.exitService("_aYSe0LvVEeyr6avTgCRLkQ");
}
}

public static  Builder builder(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_aYWwQLvVEeyr6avTgCRLkQ", StudentAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYX-YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017813009337619895938772 = new  Builder(courseId, email);
threadMonitoringController.exitInternalAction("_aYX-YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017813009337619895938772;
}
finally {
threadMonitoringController.exitService("_aYWwQLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aYZMgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYZzkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes studentAttributes = new  StudentAttributes(course, email);
studentAttributes.name = name;
studentAttributes.googleId = googleId;
studentAttributes.team = team;
studentAttributes.section = section;
studentAttributes.comments = comments;
studentAttributes.key = key;
studentAttributes.createdAt = createdAt;
studentAttributes.updatedAt = updatedAt;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017823006595447700984027 = studentAttributes;
threadMonitoringController.exitInternalAction("_aYZzkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017823006595447700984027;
}
finally {
threadMonitoringController.exitService("_aYZMgLvVEeyr6avTgCRLkQ");
}
}

public  boolean isRegistered() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aYbBsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYc24LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017831002967143368476457 = googleId != null && !googleId.trim().isEmpty();
threadMonitoringController.exitInternalAction("_aYc24LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017831002967143368476457;
}
finally {
threadMonitoringController.exitService("_aYbBsLvVEeyr6avTgCRLkQ");
}
}

public  String getRegistrationUrl() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aYeFALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return Config.getFrontEndAppUrl(Const.WebPageURIs.JOIN_PAGE).withRegistrationKey(key).withEntityType(Const.EntityType.STUDENT).toString();
}
finally {
threadMonitoringController.exitService("_aYeFALvVEeyr6avTgCRLkQ");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aYlZwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYmA0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017844006378139605088321 = name;
threadMonitoringController.exitInternalAction("_aYmA0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017844006378139605088321;
}
finally {
threadMonitoringController.exitService("_aYlZwLvVEeyr6avTgCRLkQ");
}
}

public  void setName(String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_aYn2ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYodELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = name;
threadMonitoringController.exitInternalAction("_aYodELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aYn2ALvVEeyr6avTgCRLkQ");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aYqSQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYq5ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130178620024060058306097898 = email;
threadMonitoringController.exitInternalAction("_aYq5ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130178620024060058306097898;
}
finally {
threadMonitoringController.exitService("_aYqSQLvVEeyr6avTgCRLkQ");
}
}

public  void setEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_aYsHcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYtVkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = email;
threadMonitoringController.exitInternalAction("_aYtVkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aYsHcLvVEeyr6avTgCRLkQ");
}
}

public  String getCourse() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aYvKwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYvx0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130178810019088035675480142 = course;
threadMonitoringController.exitInternalAction("_aYvx0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130178810019088035675480142;
}
finally {
threadMonitoringController.exitService("_aYvKwLvVEeyr6avTgCRLkQ");
}
}

public  void setCourse(String course) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("course", course);
threadMonitoringController.enterService("_aYw_8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aYxnALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.course = course;
threadMonitoringController.exitInternalAction("_aYxnALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aYw_8LvVEeyr6avTgCRLkQ");
}
}

public  String getGoogleId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aYy1ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aY0DQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017900007068759730100341 = googleId;
threadMonitoringController.exitInternalAction("_aY0DQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017900007068759730100341;
}
finally {
threadMonitoringController.exitService("_aYy1ILvVEeyr6avTgCRLkQ");
}
}

public  void setGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_aY1RYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aY14cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.googleId = googleId;
threadMonitoringController.exitInternalAction("_aY14cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aY1RYLvVEeyr6avTgCRLkQ");
}
}

public  String getKey() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aY3toLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aY4UsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130179180009862061100464103 = key;
threadMonitoringController.exitInternalAction("_aY4UsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130179180009862061100464103;
}
finally {
threadMonitoringController.exitService("_aY3toLvVEeyr6avTgCRLkQ");
}
}

public  void setKey(String key) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("key", key);
threadMonitoringController.enterService("_aY5i0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aY6w8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.key = key;
threadMonitoringController.exitInternalAction("_aY6w8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aY5i0LvVEeyr6avTgCRLkQ");
}
}

public  String getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aY7_ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aY90QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130179350032451342117693105 = email + "%" + course;
threadMonitoringController.exitInternalAction("_aY90QLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130179350032451342117693105;
}
finally {
threadMonitoringController.exitService("_aY7_ELvVEeyr6avTgCRLkQ");
}
}

public  String getSection() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aZA3kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZCswLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017942000545482358340611 = section;
threadMonitoringController.exitInternalAction("_aZCswLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017942000545482358340611;
}
finally {
threadMonitoringController.exitService("_aZA3kLvVEeyr6avTgCRLkQ");
}
}

public  void setSection(String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_aZFwELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZHlQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.section = section;
threadMonitoringController.exitInternalAction("_aZHlQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aZFwELvVEeyr6avTgCRLkQ");
}
}

public  String getTeam() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aZKBgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZL2sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017959003051161511983209 = team;
threadMonitoringController.exitInternalAction("_aZL2sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017959003051161511983209;
}
finally {
threadMonitoringController.exitService("_aZKBgLvVEeyr6avTgCRLkQ");
}
}

public  void setTeam(String team) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("team", team);
threadMonitoringController.enterService("_aZO6ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZPhELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.team = team;
threadMonitoringController.exitInternalAction("_aZPhELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aZO6ALvVEeyr6avTgCRLkQ");
}
}

public  String getComments() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aZQvMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZR9ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130179740016244930239628697 = comments;
threadMonitoringController.exitInternalAction("_aZR9ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130179740016244930239628697;
}
finally {
threadMonitoringController.exitService("_aZQvMLvVEeyr6avTgCRLkQ");
}
}

public  void setComments(String comments) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("comments", comments);
threadMonitoringController.enterService("_aZTygLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZUZkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.comments = comments;
threadMonitoringController.exitInternalAction("_aZUZkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aZTygLvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_aZWOwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZYrALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017990002332516493338863 = false;
threadMonitoringController.exitInternalAction("_aZYrALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017990002332516493338863;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130179900004171266496344839 = true;
threadMonitoringController.exitInternalAction("_aZYrALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130179900004171266496344839;
}
else
if (this.getClass() == other.getClass())
{
StudentAttributes otherStudent = (StudentAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017990006209247514237393 = Objects.equals(this.course, otherStudent.course) && Objects.equals(this.name, otherStudent.name) && Objects.equals(this.email, otherStudent.email) && Objects.equals(this.googleId, otherStudent.googleId) && Objects.equals(this.comments, otherStudent.comments) && Objects.equals(this.team, otherStudent.team) && Objects.equals(this.section, otherStudent.section);
threadMonitoringController.exitInternalAction("_aZYrALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017990006209247514237393;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017991007070345838014617 = false;
threadMonitoringController.exitInternalAction("_aZYrALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017991007070345838014617;
}
}
finally {
threadMonitoringController.exitService("_aZWOwLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aZZ5ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZagMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert team != null;
assert comments != null;
List<String> errors = new  ArrayList<>();
if (isRegistered())
{
addNonEmptyError(FieldValidator.getInvalidityInfoForGoogleId(googleId), errors);
}
threadMonitoringController.exitInternalAction("_aZagMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZh09LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(course), errors);
threadMonitoringController.exitInternalAction("_aZh09LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZkRM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(email), errors);
threadMonitoringController.exitInternalAction("_aZkRM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZn7mbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZoio7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForTeamName(team), errors);
threadMonitoringController.exitInternalAction("_aZoio7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aZn7mbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZpwxrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZpwyrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForSectionName(section), errors);
threadMonitoringController.exitInternalAction("_aZpwyrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aZpwxrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZrl-LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZsNA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForStudentRoleComments(comments), errors);
threadMonitoringController.exitInternalAction("_aZsNA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_aZrl-LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZtbI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(name), errors);
threadMonitoringController.exitInternalAction("_aZtbI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aZtbJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018036002638429714632302 = errors;
threadMonitoringController.exitInternalAction("_aZtbJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018036002638429714632302;
}
finally {
threadMonitoringController.exitService("_aZZ5ILvVEeyr6avTgCRLkQ");
}
}

public static  void sortBySectionName(List<StudentAttributes> students) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("students", students);
threadMonitoringController.enterService("_aZvQULvVEeyr6avTgCRLkQ", StudentAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZxFgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
students.sort(Comparator.comparing((StudentAttributes student) -> student.section).thenComparing(student -> student.team).thenComparing(student -> student.name));
threadMonitoringController.exitInternalAction("_aZxFgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aZvQULvVEeyr6avTgCRLkQ");
}
}

public static  void sortByTeamName(List<StudentAttributes> students) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("students", students);
threadMonitoringController.enterService("_aZyToLvVEeyr6avTgCRLkQ", StudentAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZ0I0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
students.sort(Comparator.comparing((StudentAttributes student) -> student.team).thenComparing(student -> student.name));
threadMonitoringController.exitInternalAction("_aZ0I0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aZyToLvVEeyr6avTgCRLkQ");
}
}

@Override
public  CourseStudent toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aZ1W8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZ2lELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseStudent longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130180590006829663382245987 = new  CourseStudent(email, name, googleId, comments, course, team, section);
threadMonitoringController.exitInternalAction("_aZ2lELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130180590006829663382245987;
}
finally {
threadMonitoringController.exitService("_aZ1W8LvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aZ3zMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZ5BULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.email).append(this.name).append(this.course).append(this.googleId).append(this.team).append(this.section).append(this.comments);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018067009530918851281328 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_aZ5BULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018067009530918851281328;
}
finally {
threadMonitoringController.exitService("_aZ3zMLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aZ8rsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aZ9SwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018075009418295178659282 = "Student:" + name + "[" + email + "]";
threadMonitoringController.exitInternalAction("_aZ9SwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018075009418295178659282;
}
finally {
threadMonitoringController.exitService("_aZ8rsLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aZ-g4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
googleId = SanitizationHelper.sanitizeGoogleId(googleId);
name = SanitizationHelper.sanitizeName(name);
threadMonitoringController.enterInternalAction("_aaCLRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
comments = SanitizationHelper.sanitizeTextField(comments);
threadMonitoringController.exitInternalAction("_aaCLRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aZ-g4LvVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aaDZYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aaEngLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130180910012407067905337033 = createdAt;
threadMonitoringController.exitInternalAction("_aaEngLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130180910012407067905337033;
}
finally {
threadMonitoringController.exitService("_aaDZYLvVEeyr6avTgCRLkQ");
}
}

public  Instant getUpdatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aaF1oLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aaGcsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018100007040864693682595 = updatedAt;
threadMonitoringController.exitInternalAction("_aaGcsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018100007040864693682595;
}
finally {
threadMonitoringController.exitService("_aaF1oLvVEeyr6avTgCRLkQ");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_aaI48LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aaKuILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_aaKuILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aaI48LvVEeyr6avTgCRLkQ");
}
}

public  void setUpdatedAt(Instant updatedAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updatedAt", updatedAt);
threadMonitoringController.enterService("_aaL8QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aaNKYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.updatedAt = updatedAt;
threadMonitoringController.exitInternalAction("_aaNKYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aaL8QLvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aaOYgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aaPmoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.newEmailOption.ifPresent(s -> email = s);
updateOptions.nameOption.ifPresent(s -> name = s);
updateOptions.commentOption.ifPresent(s -> comments = s);
updateOptions.googleIdOption.ifPresent(s -> googleId = s);
updateOptions.teamNameOption.ifPresent(s -> team = s);
updateOptions.sectionNameOption.ifPresent(s -> section = s);
threadMonitoringController.exitInternalAction("_aaPmoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aaOYgLvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_aaSC4LvVEeyr6avTgCRLkQ", StudentAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aaTRALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130181340012070313690252388 = new  UpdateOptions.Builder(courseId, email);
threadMonitoringController.exitInternalAction("_aaTRALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130181340012070313690252388;
}
finally {
threadMonitoringController.exitService("_aaSC4LvVEeyr6avTgCRLkQ");
}
}

public static class Builder extends BasicBuilder<StudentAttributes, Builder> {
private final StudentAttributes studentAttributes;

private  Builder(String courseId, String email){
super(new  UpdateOptions(courseId, email));
thisBuilder = this;
studentAttributes = new  StudentAttributes(courseId, email);
}
@Override
public  StudentAttributes build() {
studentAttributes.update(updateOptions);
return studentAttributes;
}

}
public static class UpdateOptions {
private String courseId;

private String email;

private UpdateOption<String> newEmailOption = UpdateOption.empty();

private UpdateOption<String> nameOption = UpdateOption.empty();

private UpdateOption<String> commentOption = UpdateOption.empty();

private UpdateOption<String> googleIdOption = UpdateOption.empty();

private UpdateOption<String> teamNameOption = UpdateOption.empty();

private UpdateOption<String> sectionNameOption = UpdateOption.empty();

private  UpdateOptions(String courseId, String email){
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
return "StudentAttributes.UpdateOptions [" + "courseId = " + courseId + ", email = " + email + ", newEmail = " + newEmailOption + ", name = " + nameOption + ", comment = " + commentOption + ", googleId = " + googleIdOption + ", teamName = " + teamNameOption + ", sectionName = " + sectionNameOption + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(String courseId, String email){
super(new  UpdateOptions(courseId, email));
thisBuilder = this;
}
public  Builder withNewEmail(String email) {
assert email != null;
updateOptions.newEmailOption = UpdateOption.of(email);
return thisBuilder;
}

@Override
public  UpdateOptions build() {
return updateOptions;
}

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

public  B withComment(String comment) {
assert comment != null;
updateOptions.commentOption = UpdateOption.of(comment);
return thisBuilder;
}

public  B withGoogleId(String googleId) {
updateOptions.googleIdOption = UpdateOption.of(googleId);
return thisBuilder;
}

public  B withTeamName(String teamName) {
assert teamName != null;
updateOptions.teamNameOption = UpdateOption.of(teamName);
return thisBuilder;
}

public  B withSectionName(String sectionName) {
assert sectionName != null;
updateOptions.sectionNameOption = UpdateOption.of(sectionName);
return thisBuilder;
}

public abstract  T build() ;

}
}
