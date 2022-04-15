package teammates.common.datatransfer.attributes;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import teammates.common.util.Const;
import teammates.common.util.FieldValidator;
import teammates.common.util.Logger;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.Course;
public class CourseAttributes extends EntityAttributes<Course> implements Comparable<CourseAttributes> {
private static final Logger log = Logger.getLogger();

private Instant createdAt;

private Instant deletedAt;

private String name;

private String timeZone;

private String id;

private String institute;

private  CourseAttributes(String courseId){
this.id = courseId;
this.timeZone = Const.DEFAULT_TIME_ZONE;
this.institute = Const.UNKNOWN_INSTITUTION;
this.createdAt = Instant.now();
this.deletedAt = null;
}
public static  CourseAttributes valueOf(Course course) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("course", course);
threadMonitoringController.enterService("_Z87YgLvVEeyr6avTgCRLkQ", CourseAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z87_kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes courseAttributes = new  CourseAttributes(course.getUniqueId());
courseAttributes.name = course.getName();
String courseTimeZone;
try {
ZoneId.of(course.getTimeZone());
courseTimeZone = course.getTimeZone();
}
catch(DateTimeException e){
log.severe("Timezone '" + course.getTimeZone() + "' of course '" + course.getUniqueId() + "' is not supported. UTC will be used instead.");
courseTimeZone = Const.DEFAULT_TIME_ZONE;
}
courseAttributes.timeZone = courseTimeZone;
courseAttributes.institute = course.getInstitute();
if (course.getCreatedAt() != null)
{
courseAttributes.createdAt = course.getCreatedAt();
}
courseAttributes.deletedAt = course.getDeletedAt();
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015210008231092874692526 = courseAttributes;
threadMonitoringController.exitInternalAction("_Z87_kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015210008231092874692526;
}
finally {
threadMonitoringController.exitService("_Z87YgLvVEeyr6avTgCRLkQ");
}
}

public static  Builder builder(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_Z9y7MbvVEeyr6avTgCRLkQ", CourseAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z9ziQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015217005194233218515252 = new  Builder(courseId);
threadMonitoringController.exitInternalAction("_Z9ziQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015217005194233218515252;
}
finally {
threadMonitoringController.exitService("_Z9y7MbvVEeyr6avTgCRLkQ");
}
}

public  String getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z90JUbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z91XcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015225005016999889450777 = id;
threadMonitoringController.exitInternalAction("_Z91XcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015225005016999889450777;
}
finally {
threadMonitoringController.exitService("_Z90JUbvVEeyr6avTgCRLkQ");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z91-gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z91-gbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130152310042930246835305597 = name;
threadMonitoringController.exitInternalAction("_Z91-gbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130152310042930246835305597;
}
finally {
threadMonitoringController.exitService("_Z91-gLvVEeyr6avTgCRLkQ");
}
}

public  void setName(String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_Z92lkrvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z93MoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = name;
threadMonitoringController.exitInternalAction("_Z93MoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z92lkrvVEeyr6avTgCRLkQ");
}
}

public  String getTimeZone() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z93zsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z93zsbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015246004038029346599056 = timeZone;
threadMonitoringController.exitInternalAction("_Z93zsbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015246004038029346599056;
}
finally {
threadMonitoringController.exitService("_Z93zsLvVEeyr6avTgCRLkQ");
}
}

public  void setTimeZone(String timeZone) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("timeZone", timeZone);
threadMonitoringController.enterService("_Z94awbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z95B0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.timeZone = timeZone;
threadMonitoringController.exitInternalAction("_Z95B0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z94awbvVEeyr6avTgCRLkQ");
}
}

public  String getInstitute() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z95o4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z95o4bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015258008754109794502988 = institute;
threadMonitoringController.exitInternalAction("_Z95o4bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015258008754109794502988;
}
finally {
threadMonitoringController.exitService("_Z95o4LvVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z96P8bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z963ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130152640005203683092088418 = createdAt;
threadMonitoringController.exitInternalAction("_Z963ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130152640005203683092088418;
}
finally {
threadMonitoringController.exitService("_Z96P8bvVEeyr6avTgCRLkQ");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_Z963BLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z97eELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_Z97eELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z963BLvVEeyr6avTgCRLkQ");
}
}

public  Instant getDeletedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z98FIbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z98sMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015294005114608115143511 = deletedAt;
threadMonitoringController.exitInternalAction("_Z98sMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015294005114608115143511;
}
finally {
threadMonitoringController.exitService("_Z98FIbvVEeyr6avTgCRLkQ");
}
}

public  void setDeletedAt(Instant deletedAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("deletedAt", deletedAt);
threadMonitoringController.enterService("_Z98sNLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z99TQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.deletedAt = deletedAt;
threadMonitoringController.exitInternalAction("_Z99TQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z98sNLvVEeyr6avTgCRLkQ");
}
}

public  boolean isCourseDeleted() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z996UbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z9-hYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153090036208640128838665 = this.deletedAt != null;
threadMonitoringController.exitInternalAction("_Z9-hYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153090036208640128838665;
}
finally {
threadMonitoringController.exitService("_Z996UbvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z9_IcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z9_IcbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_Z9_IcbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z-A9pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z-A9qbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(getId()), errors);
threadMonitoringController.exitInternalAction("_Z-A9qbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_Z-A9pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z-CLyLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z-Cy07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseName(getName()), errors);
threadMonitoringController.exitInternalAction("_Z-Cy07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_Z-CLyLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z-Cy17vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForInstituteName(getInstitute()), errors);
threadMonitoringController.exitInternalAction("_Z-Cy17vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z-DZ4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015332005839667538927815 = errors;
threadMonitoringController.exitInternalAction("_Z-DZ4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015332005839667538927815;
}
finally {
threadMonitoringController.exitService("_Z9_IcLvVEeyr6avTgCRLkQ");
}
}

@Override
public  Course toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z-EA8bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return new  Course(getId(), getName(), getTimeZone(), getInstitute(), createdAt, deletedAt);
}
finally {
threadMonitoringController.exitService("_Z-EA8bvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z-F2ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-GdMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153430003047739111171921 = "[" + CourseAttributes.class.getSimpleName() + "] id: " + getId() + " name: " + getName() + " institute: " + getInstitute() + " timeZone: " + getTimeZone();
threadMonitoringController.exitInternalAction("_Z-GdMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153430003047739111171921;
}
finally {
threadMonitoringController.exitService("_Z-F2ILvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z-HEQbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-HrULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153490015499142115558173 = (this.id + this.name + this.institute).hashCode();
threadMonitoringController.exitInternalAction("_Z-HrULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153490015499142115558173;
}
finally {
threadMonitoringController.exitService("_Z-HEQbvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_Z-I5cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-JggLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015356004371565627499018 = false;
threadMonitoringController.exitInternalAction("_Z-JggLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015356004371565627499018;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015356006245319296383282 = true;
threadMonitoringController.exitInternalAction("_Z-JggLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015356006245319296383282;
}
else
if (this.getClass() == other.getClass())
{
CourseAttributes otherCourse = (CourseAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015356001867499947200807 = Objects.equals(this.id, otherCourse.id) && Objects.equals(this.institute, otherCourse.institute) && Objects.equals(this.name, otherCourse.name);
threadMonitoringController.exitInternalAction("_Z-JggLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015356001867499947200807;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153560017408082183001694 = false;
threadMonitoringController.exitInternalAction("_Z-JggLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153560017408082183001694;
}
}
finally {
threadMonitoringController.exitService("_Z-I5cLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z-KuoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
this.institute = SanitizationHelper.sanitizeTitle(institute);
}
finally {
threadMonitoringController.exitService("_Z-KuoLvVEeyr6avTgCRLkQ");
}
}

@Override
public  int compareTo(CourseAttributes o) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("o", o);
threadMonitoringController.enterService("_Z-NK4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-Nx8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (o == null)
{
return 0;
}
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153650017308804820267787 = o.createdAt.compareTo(createdAt);
threadMonitoringController.exitInternalAction("_Z-Nx8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130153650017308804820267787;
}
finally {
threadMonitoringController.exitService("_Z-NK4LvVEeyr6avTgCRLkQ");
}
}

public static  void sortById(List<CourseAttributes> courses) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courses", courses);
threadMonitoringController.enterService("_Z-PAELvVEeyr6avTgCRLkQ", CourseAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-PnILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
courses.sort(Comparator.comparing(CourseAttributes::getId));
threadMonitoringController.exitInternalAction("_Z-PnILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z-PAELvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_Z-Q1QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-Q1QbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.nameOption.ifPresent(s -> name = s);
updateOptions.timeZoneOption.ifPresent(s -> timeZone = s);
updateOptions.instituteOption.ifPresent(s -> institute = s);
threadMonitoringController.exitInternalAction("_Z-Q1QbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z-Q1QLvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_Z-SDYLvVEeyr6avTgCRLkQ", CourseAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-SqcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301538300059660503637644746 = new  UpdateOptions.Builder(courseId);
threadMonitoringController.exitInternalAction("_Z-SqcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301538300059660503637644746;
}
finally {
threadMonitoringController.exitService("_Z-SDYLvVEeyr6avTgCRLkQ");
}
}

public static class Builder extends BasicBuilder<CourseAttributes, Builder> {
private final CourseAttributes courseAttributes;

private  Builder(String courseId){
super(new  UpdateOptions(courseId));
thisBuilder = this;
courseAttributes = new  CourseAttributes(courseId);
}
@Override
public  CourseAttributes build() {
courseAttributes.update(updateOptions);
return courseAttributes;
}

}
public static class UpdateOptions {
private String courseId;

private UpdateOption<String> nameOption = UpdateOption.empty();

private UpdateOption<String> timeZoneOption = UpdateOption.empty();

private UpdateOption<String> instituteOption = UpdateOption.empty();

private  UpdateOptions(String courseId){
assert courseId != null;
this.courseId = courseId;
}
public  String getCourseId() {
return courseId;
}

@Override
public  String toString() {
return "CourseAttributes.UpdateOptions [" + "courseId = " + courseId + ", name = " + nameOption + ", timezone = " + timeZoneOption + ", institute = " + instituteOption + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(String courseId){
super(new  UpdateOptions(courseId));
thisBuilder = this;
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

public  B withTimezone(String timezone) {
assert timezone != null;
updateOptions.timeZoneOption = UpdateOption.of(timezone);
return thisBuilder;
}

public  B withInstitute(String institute) {
assert institute != null;
updateOptions.instituteOption = UpdateOption.of(institute);
return thisBuilder;
}

public abstract  T build() ;

}
}
