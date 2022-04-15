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
threadMonitoringController.enterService("_dFYXMLvVEeyr6avTgCRLkQ", CoursesDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dFaMYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CoursesDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130273650003455590616018589 = instance;
threadMonitoringController.exitInternalAction("_dFaMYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130273650003455590616018589;
}
finally {
threadMonitoringController.exitService("_dFYXMLvVEeyr6avTgCRLkQ");
}
}

public  CourseAttributes getCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dF9mALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dF_bMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_dF_bMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dGHXBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027406007143442043220521 = makeAttributesOrNull(getCourseEntity(courseId));
threadMonitoringController.exitInternalAction("_dGHXBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dGJMNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027406003994661038679095 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027406007143442043220521;
threadMonitoringController.exitInternalAction("_dGJMNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027406003994661038679095;
}
finally {
threadMonitoringController.exitService("_dF9mALvVEeyr6avTgCRLkQ");
}
}

public  List<CourseAttributes> getCourses(List<String> courseIds) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseIds", courseIds);
threadMonitoringController.enterService("_dGvpILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dGyscLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseIds != null;
assert courseIds.toArray() != null;
threadMonitoringController.exitInternalAction("_dGyscLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dG8ddLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027434009509576150207129 = makeAttributes(getCourseEntities(courseIds));
threadMonitoringController.exitInternalAction("_dG8ddLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dG9rlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027434001956875078442296 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027434009509576150207129;
threadMonitoringController.exitInternalAction("_dG9rlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027434001956875078442296;
}
finally {
threadMonitoringController.exitService("_dGvpILvVEeyr6avTgCRLkQ");
}
}

public  CourseAttributes updateCourse(CourseAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_dHWtILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dHZJYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_dHeB5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Course course = getCourseEntity(updateOptions.getCourseId());
threadMonitoringController.exitInternalAction("_dHeB5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dHZJYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dHeB5bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (course == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
threadMonitoringController.exitInternalAction("_dHeB5bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dHf3ErvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes newAttributes = makeAttributes(course);
threadMonitoringController.exitInternalAction("_dHf3ErvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dHgeILvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_dHhFMLvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_dHhsQLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dHhsRLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_dHoZ8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dHoZ8bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dHpoFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dHpoFbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dHpoFrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dHq2M7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dHq2NLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dHq2NbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dHsEU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(course.getName(), newAttributes.getName()) && this.<String>hasSameValue(course.getInstitute(), newAttributes.getInstitute()) && this.<String>hasSameValue(course.getTimeZone(), newAttributes.getTimeZone());
threadMonitoringController.exitInternalAction("_dHsEU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dHq2NLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dHq2M7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dHpoFbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dHpoFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dHoZ8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_dHugkLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dHuglLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dHuglbvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, Course.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_dHuglLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dHvHoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027641007003604821875201 = newAttributes;
threadMonitoringController.exitInternalAction("_dHvHoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027641007003604821875201;
}
threadMonitoringController.setExternalCallId("_dHwVwLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dHw80LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
course.setName(newAttributes.getName());
threadMonitoringController.exitInternalAction("_dHw80LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dHxj4LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dHyK8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
course.setTimeZone(newAttributes.getTimeZone());
threadMonitoringController.exitInternalAction("_dHyK8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dHzZELvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dHzZEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
course.setInstitute(newAttributes.getInstitute());
threadMonitoringController.exitInternalAction("_dHzZEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dH7U4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(course);
threadMonitoringController.exitInternalAction("_dH7U4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dH8jA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302764100011510498378098921 = makeAttributes(course);
threadMonitoringController.exitInternalAction("_dH8jA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302764100011510498378098921;
}
finally {
threadMonitoringController.exitService("_dHWtILvVEeyr6avTgCRLkQ");
}
}

public  void deleteCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dFzN8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dF1qMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
deleteEntity(Key.create(Course.class, courseId));
threadMonitoringController.exitInternalAction("_dF1qMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dFzN8LvVEeyr6avTgCRLkQ");
}
}

public  Instant softDeleteCourse(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dIbrMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dIeugLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_dIeugLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dIiY5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Course courseEntity = getCourseEntity(courseId);
threadMonitoringController.exitInternalAction("_dIiY5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dIiY5bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (courseEntity == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
courseEntity.setDeletedAt(Instant.now());
threadMonitoringController.exitInternalAction("_dIiY5bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dIptorvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(courseEntity);
threadMonitoringController.exitInternalAction("_dIptorvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dIqUsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027686008308489356450186 = courseEntity.getDeletedAt();
threadMonitoringController.exitInternalAction("_dIqUsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027686008308489356450186;
}
finally {
threadMonitoringController.exitService("_dIbrMLvVEeyr6avTgCRLkQ");
}
}

public  void restoreDeletedCourse(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_dIxCYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dIy3kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_dIy3kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dI3JBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Course courseEntity = getCourseEntity(courseId);
threadMonitoringController.exitInternalAction("_dI3JBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dI3JBbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (courseEntity == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT);
}
courseEntity.setDeletedAt(null);
threadMonitoringController.exitInternalAction("_dI3JBbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dI92srvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(courseEntity);
threadMonitoringController.exitInternalAction("_dI92srvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dIxCYLvVEeyr6avTgCRLkQ");
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
