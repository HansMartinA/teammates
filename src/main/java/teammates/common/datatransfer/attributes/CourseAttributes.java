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
threadMonitoringController.enterService("_rjiXgbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rji-kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679076007887346117569023 = courseAttributes;
threadMonitoringController.exitInternalAction("_rji-kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679076007887346117569023;
}
finally {
threadMonitoringController.exitService("_rjiXgbngEeyIw-dB1KCaVA");
}
}

public static  Builder builder(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_rjnQAbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjn3ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790790041747872546426557 = new  Builder(courseId);
threadMonitoringController.exitInternalAction("_rjn3ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790790041747872546426557;
}
finally {
threadMonitoringController.exitService("_rjnQAbngEeyIw-dB1KCaVA");
}
}

public  String getId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rjoeIbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjpFMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367908300023251363953919135 = id;
threadMonitoringController.exitInternalAction("_rjpFMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367908300023251363953919135;
}
finally {
threadMonitoringController.exitService("_rjoeIbngEeyIw-dB1KCaVA");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rjpsQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjqTULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790880041076089378536973 = name;
threadMonitoringController.exitInternalAction("_rjqTULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790880041076089378536973;
}
finally {
threadMonitoringController.exitService("_rjpsQLngEeyIw-dB1KCaVA");
}
}

public  void setName(String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_rjqTVLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjq6YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = name;
threadMonitoringController.exitInternalAction("_rjq6YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rjqTVLngEeyIw-dB1KCaVA");
}
}

public  String getTimeZone() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rjrhcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjrhcbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679094005180493731731499 = timeZone;
threadMonitoringController.exitInternalAction("_rjrhcbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679094005180493731731499;
}
finally {
threadMonitoringController.exitService("_rjrhcLngEeyIw-dB1KCaVA");
}
}

public  void setTimeZone(String timeZone) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("timeZone", timeZone);
threadMonitoringController.enterService("_rjsIgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjsIgbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.timeZone = timeZone;
threadMonitoringController.exitInternalAction("_rjsIgbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rjsIgLngEeyIw-dB1KCaVA");
}
}

public  String getInstitute() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rjtWoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjt9sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679099009186664135404466 = institute;
threadMonitoringController.exitInternalAction("_rjt9sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679099009186664135404466;
}
finally {
threadMonitoringController.exitService("_rjtWoLngEeyIw-dB1KCaVA");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rjukwbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjvL0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367910200920740037046677 = createdAt;
threadMonitoringController.exitInternalAction("_rjvL0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367910200920740037046677;
}
finally {
threadMonitoringController.exitService("_rjukwbngEeyIw-dB1KCaVA");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_rjwZ8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjwZ8bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_rjwZ8bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rjwZ8LngEeyIw-dB1KCaVA");
}
}

public  Instant getDeletedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rjxoELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjyPILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679111005228950541542564 = deletedAt;
threadMonitoringController.exitInternalAction("_rjyPILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679111005228950541542564;
}
finally {
threadMonitoringController.exitService("_rjxoELngEeyIw-dB1KCaVA");
}
}

public  void setDeletedAt(Instant deletedAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("deletedAt", deletedAt);
threadMonitoringController.enterService("_rjy2MLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rjzdQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.deletedAt = deletedAt;
threadMonitoringController.exitInternalAction("_rjzdQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rjy2MLngEeyIw-dB1KCaVA");
}
}

public  boolean isCourseDeleted() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rj0rYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rj1ScLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679119008977183988013032 = this.deletedAt != null;
threadMonitoringController.exitInternalAction("_rj1ScLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679119008977183988013032;
}
finally {
threadMonitoringController.exitService("_rj0rYLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rj15gbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rj2gkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_rj2gkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rj480rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rj4817ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseId(getId()), errors);
threadMonitoringController.exitInternalAction("_rj4817ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rj480rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rj6yCLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rj6yDLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForCourseName(getName()), errors);
threadMonitoringController.exitInternalAction("_rj6yDLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rj6yCLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rj7ZE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForInstituteName(getInstitute()), errors);
threadMonitoringController.exitInternalAction("_rj7ZE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rj7ZFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679130005622813910030813 = errors;
threadMonitoringController.exitInternalAction("_rj7ZFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679130005622813910030813;
}
finally {
threadMonitoringController.exitService("_rj15gbngEeyIw-dB1KCaVA");
}
}

@Override
public  Course toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rj8nMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return new  Course(getId(), getName(), getTimeZone(), getInstitute(), createdAt, deletedAt);
}
finally {
threadMonitoringController.exitService("_rj8nMLngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rj-cYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rj_DcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679134006710130862959302 = "[" + CourseAttributes.class.getSimpleName() + "] id: " + getId() + " name: " + getName() + " institute: " + getInstitute() + " timeZone: " + getTimeZone();
threadMonitoringController.exitInternalAction("_rj_DcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679134006710130862959302;
}
finally {
threadMonitoringController.exitService("_rj-cYLngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rj_qgbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rkARkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791380017154960943859965 = (this.id + this.name + this.institute).hashCode();
threadMonitoringController.exitInternalAction("_rkARkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791380017154960943859965;
}
finally {
threadMonitoringController.exitService("_rj_qgbngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_rkA4oLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rkDU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791420036824549013652996 = false;
threadMonitoringController.exitInternalAction("_rkDU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791420036824549013652996;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791420010072107726859814 = true;
threadMonitoringController.exitInternalAction("_rkDU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791420010072107726859814;
}
else
if (this.getClass() == other.getClass())
{
CourseAttributes otherCourse = (CourseAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679142004059883178463407 = Objects.equals(this.id, otherCourse.id) && Objects.equals(this.institute, otherCourse.institute) && Objects.equals(this.name, otherCourse.name);
threadMonitoringController.exitInternalAction("_rkDU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679142004059883178463407;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679142008866091093651224 = false;
threadMonitoringController.exitInternalAction("_rkDU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679142008866091093651224;
}
}
finally {
threadMonitoringController.exitService("_rkA4oLngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rkD78bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
this.institute = SanitizationHelper.sanitizeTitle(institute);
}
finally {
threadMonitoringController.exitService("_rkD78bngEeyIw-dB1KCaVA");
}
}

@Override
public  int compareTo(CourseAttributes o) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("o", o);
threadMonitoringController.enterService("_rkFKEbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rkFxILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (o == null)
{
return 0;
}
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679147002788240874155483 = o.createdAt.compareTo(createdAt);
threadMonitoringController.exitInternalAction("_rkFxILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679147002788240874155483;
}
finally {
threadMonitoringController.exitService("_rkFKEbngEeyIw-dB1KCaVA");
}
}

public static  void sortById(List<CourseAttributes> courses) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courses", courses);
threadMonitoringController.enterService("_rkGYMbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rkHmULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
courses.sort(Comparator.comparing(CourseAttributes::getId));
threadMonitoringController.exitInternalAction("_rkHmULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rkGYMbngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_rkINYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rkI0cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.nameOption.ifPresent(s -> name = s);
updateOptions.timeZoneOption.ifPresent(s -> timeZone = s);
updateOptions.instituteOption.ifPresent(s -> institute = s);
threadMonitoringController.exitInternalAction("_rkI0cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rkINYLngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_rkJbgbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rkJbgrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791560005947185799288468 = new  UpdateOptions.Builder(courseId);
threadMonitoringController.exitInternalAction("_rkJbgrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136791560005947185799288468;
}
finally {
threadMonitoringController.exitService("_rkJbgbngEeyIw-dB1KCaVA");
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
