package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import teammates.common.datatransfer.attributes.CourseAttributes;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.storage.entity.Course;
public final class CoursesDb extends EntitiesDb<Course, CourseAttributes> {
private static final CoursesDb instance = new  CoursesDb();

private  CoursesDb(){
}
public static  CoursesDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ugG2ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ugLHwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CoursesDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136828520017947037681877154 = instance;
threadMonitoringController.exitInternalAction("_ugLHwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136828520017947037681877154;
}
finally {
threadMonitoringController.exitService("_ugG2ULngEeyIw-dB1KCaVA");
}
}

public  CourseAttributes getCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_uguhYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ugw9oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_ugw9oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ug1PFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682863008238370848831207 = makeAttributesOrNull(getCourseEntity(courseId));
threadMonitoringController.exitInternalAction("_ug1PFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ug2dNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682863009271036739344841 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682863008238370848831207;
threadMonitoringController.exitInternalAction("_ug2dNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682863009271036739344841;
}
finally {
threadMonitoringController.exitService("_uguhYLngEeyIw-dB1KCaVA");
}
}

public  List<CourseAttributes> getCourses(List<String> courseIds) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseIds", courseIds);
threadMonitoringController.enterService("_uhUXQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uhXakLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseIds != null;
assert courseIds.toArray() != null;
threadMonitoringController.exitInternalAction("_uhXakLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uhevVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682868009800799616877212 = makeAttributes(getCourseEntities(courseIds));
threadMonitoringController.exitInternalAction("_uhevVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uhf9crngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682868009289976501231806 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682868009800799616877212;
threadMonitoringController.exitInternalAction("_uhf9crngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682868009289976501231806;
}
finally {
threadMonitoringController.exitService("_uhUXQLngEeyIw-dB1KCaVA");
}
}

public  CourseAttributes updateCourse(CourseAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_uh4_ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uh60MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_uiATxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Course course = getCourseEntity(updateOptions.getCourseId());
threadMonitoringController.exitInternalAction("_uiATxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uh60MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uiATxbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (course == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
threadMonitoringController.exitInternalAction("_uiATxbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uiCwAbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes newAttributes = makeAttributes(course);
threadMonitoringController.exitInternalAction("_uiCwAbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uiDXELngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_uiD-ILngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_uiElMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uiElNLngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_uiQLYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uiQLYbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uiSAlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uiSAlbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uiSAlrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uiTOs7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uiTOtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uiTOtbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uiUc07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(course.getName(), newAttributes.getName()) && this.<String>hasSameValue(course.getInstitute(), newAttributes.getInstitute()) && this.<String>hasSameValue(course.getTimeZone(), newAttributes.getTimeZone());
threadMonitoringController.exitInternalAction("_uiUc07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uiTOtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uiTOs7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uiSAlbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uiSAlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uiQLYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_uiW5ELngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uiW5FLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uiW5FbngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, Course.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_uiW5FLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uiXgILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682908006039290637461736 = newAttributes;
threadMonitoringController.exitInternalAction("_uiXgILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682908006039290637461736;
}
threadMonitoringController.setExternalCallId("_uiYHMLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uiYuQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
course.setName(newAttributes.getName());
threadMonitoringController.exitInternalAction("_uiYuQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uiZ8YLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uiZ8YbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
course.setTimeZone(newAttributes.getTimeZone());
threadMonitoringController.exitInternalAction("_uiZ8YbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uibKgLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uibxkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
course.setInstitute(newAttributes.getInstitute());
threadMonitoringController.exitInternalAction("_uibxkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uiifQrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(course);
threadMonitoringController.exitInternalAction("_uiifQrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uikUc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682909007230860032839129 = makeAttributes(course);
threadMonitoringController.exitInternalAction("_uikUc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682909007230860032839129;
}
finally {
threadMonitoringController.exitService("_uh4_ALngEeyIw-dB1KCaVA");
}
}

public  void deleteCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ugiUILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ugkwYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
deleteEntity(Key.create(Course.class, courseId));
threadMonitoringController.exitInternalAction("_ugkwYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ugiUILngEeyIw-dB1KCaVA");
}
}

public  Instant softDeleteCourse(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ujCOgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ujFR0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_ujFR0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ujJjRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Course courseEntity = getCourseEntity(courseId);
threadMonitoringController.exitInternalAction("_ujJjRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ujJjRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (courseEntity == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
courseEntity.setDeletedAt(Instant.now());
threadMonitoringController.exitInternalAction("_ujJjRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ujQ4A7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(courseEntity);
threadMonitoringController.exitInternalAction("_ujQ4A7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ujSGILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682917008847822505396611 = courseEntity.getDeletedAt();
threadMonitoringController.exitInternalAction("_ujSGILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682917008847822505396611;
}
finally {
threadMonitoringController.exitService("_ujCOgLngEeyIw-dB1KCaVA");
}
}

public  void restoreDeletedCourse(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_ujW-oLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ujYz0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_ujYz0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ujeTZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Course courseEntity = getCourseEntity(courseId);
threadMonitoringController.exitInternalAction("_ujeTZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ujeTZbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (courseEntity == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
courseEntity.setDeletedAt(null);
threadMonitoringController.exitInternalAction("_ujeTZbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ujloI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(courseEntity);
threadMonitoringController.exitInternalAction("_ujloI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ujW-oLngEeyIw-dB1KCaVA");
}
}

@Override
 LoadType<Course> load() {
return ofy().load().type(Course.class);
}

@Override
 boolean hasExistingEntities(CourseAttributes entityToCreate) {
Key<Course> keyToFind = Key.create(Course.class, entityToCreate.getId());
return !load().filterKey(keyToFind).keys().list().isEmpty();
}

private  Course getCourseEntity(String courseId) {
return load().id(courseId).now();
}

private  List<Course> getCourseEntities(List<String> courseIds) {
if (courseIds.isEmpty())
{
return new  ArrayList<>();
}
return new  ArrayList<>(load().ids(courseIds).values());
}

@Override
 CourseAttributes makeAttributes(Course entity) {
assert entity != null;
return CourseAttributes.valueOf(entity);
}

}
