package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import com.googlecode.objectify.cmd.Query;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.exception.SearchServiceException;
import teammates.common.util.Logger;
import teammates.storage.entity.CourseStudent;
import teammates.storage.search.SearchManagerFactory;
import teammates.storage.search.StudentSearchManager;
public final class StudentsDb extends EntitiesDb<CourseStudent, StudentAttributes> {
private static final Logger log = Logger.getLogger();

private static final int MAX_KEY_REGENERATION_TRIES = 10;

private static final StudentsDb instance = new  StudentsDb();

private  StudentsDb(){
}
public static  StudentsDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_dMnAkLvVEeyr6avTgCRLkQ", StudentsDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dMpc0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027763003307487690313978 = instance;
threadMonitoringController.exitInternalAction("_dMpc0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027763003307487690313978;
}
finally {
threadMonitoringController.exitService("_dMnAkLvVEeyr6avTgCRLkQ");
}
}

private  StudentSearchManager getSearchManager() {
return SearchManagerFactory.getStudentSearchManager();
}

public  void putDocument(StudentAttributes student)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_dOIqkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dONjFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dOOKILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().putDocument(student);
threadMonitoringController.exitInternalAction("_dOOKILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dONjFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dOIqkLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> search(String queryString, List<InstructorAttributes> instructors)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
monitoringServiceParameters.addValue("instructors", instructors);
threadMonitoringController.enterService("_eVFEgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eVIu4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (queryString.trim().isEmpty())
{
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033479005428044179782254 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_eVIu4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033479005428044179782254;
}
threadMonitoringController.enterInternalAction("_eVMZRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033479008765691921309401 = getSearchManager().searchStudents(queryString, instructors);
threadMonitoringController.exitInternalAction("_eVMZRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eVMZRbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033479006746601490672061 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033479008765691921309401;
threadMonitoringController.exitInternalAction("_eVMZRbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033479006746601490672061;
}
finally {
threadMonitoringController.exitService("_eVFEgLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> searchStudentsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_eVUVELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eVXYYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (queryString.trim().isEmpty())
{
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033506006183756682077325 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_eVXYYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033506006183756682077325;
}
threadMonitoringController.enterInternalAction("_eVbCxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033506009131546528098394 = getSearchManager().searchStudents(queryString, null);
threadMonitoringController.exitInternalAction("_eVbCxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eVbCxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130335060032525538111312935 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033506009131546528098394;
threadMonitoringController.exitInternalAction("_eVbCxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130335060032525538111312935;
}
finally {
threadMonitoringController.exitService("_eVUVELvVEeyr6avTgCRLkQ");
}
}

public  void deleteDocumentByStudentId(String studentUniqueId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentUniqueId", studentUniqueId);
threadMonitoringController.enterService("_e6NK0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_e6VGpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_e6VGpbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(Collections.singletonList(studentUniqueId));
threadMonitoringController.exitInternalAction("_e6VGpbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_e6VGpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_e6NK0LvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes regenerateEntityKey(StudentAttributes originalStudent)throws EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("originalStudent", originalStudent);
threadMonitoringController.enterService("_eXll8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eXoCMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int numTries = 0;
threadMonitoringController.exitInternalAction("_eXoCMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
while (numTries < MAX_KEY_REGENERATION_TRIES)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_eX350rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseStudent updatedEntity = convertToEntityForSaving(originalStudent);
threadMonitoringController.exitInternalAction("_eX350rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!updatedEntity.getRegistrationKey().equals(originalStudent.getKey()))
{
threadMonitoringController.enterBranch("_eX3507vVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eX5vArvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(updatedEntity);
threadMonitoringController.exitInternalAction("_eX5vArvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eX69JbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033859004426521722921972 = makeAttributes(updatedEntity);
threadMonitoringController.exitInternalAction("_eX69JbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033859004426521722921972;
}
numTries++;
}
threadMonitoringController.exitLoop("_eX2EoLvVEeyr6avTgCRLkQ", loopIterationCounter1.get());
threadMonitoringController.setExternalCallId("_eX7kMbvVEeyr6avTgCRLkQ");
log.severe("Failed to generate new registration key for student after " + MAX_KEY_REGENERATION_TRIES + " tries");
threadMonitoringController.enterInternalAction("_eX8LQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eX8LQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
throw new  EntityAlreadyExistsException("Could not regenerate a new course registration key for the student.");
}
finally {
threadMonitoringController.exitService("_eXll8LvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes getStudentForEmail(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_dN29wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dN7PMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
threadMonitoringController.exitInternalAction("_dN7PMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dOCj9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130278720012986094916830881 = makeAttributesOrNull(getCourseStudentEntityForEmail(courseId, email));
threadMonitoringController.exitInternalAction("_dOCj9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dODyFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027872007937863393629829 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130278720012986094916830881;
threadMonitoringController.exitInternalAction("_dODyFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027872007937863393629829;
}
finally {
threadMonitoringController.exitService("_dN29wLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getAllStudentsForEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_eSnmYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eSqCoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
threadMonitoringController.exitInternalAction("_eSqCoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eSu7JLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<CourseStudent> students = getAllCourseStudentEntitiesForEmail(email);
threadMonitoringController.exitInternalAction("_eSu7JLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eSzMkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033283005366794973162389 = students.stream().map(this::makeAttributes).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_eSzMkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033283005366794973162389;
}
finally {
threadMonitoringController.exitService("_eSnmYLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes getStudentForGoogleId(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_eS-LsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eTAn8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert courseId != null;
CourseStudent student = load().filter("courseId =", courseId).filter("googleId =", googleId).first().now();
threadMonitoringController.exitInternalAction("_eTAn8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eTJK1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303330500129856172332646 = makeAttributesOrNull(student);
threadMonitoringController.exitInternalAction("_eTJK1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303330500129856172332646;
}
finally {
threadMonitoringController.exitService("_eS-LsLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes getStudentForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_eTRGoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eTTi4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
threadMonitoringController.exitInternalAction("_eTTi4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eTfwI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130333330027769715558906216 = makeAttributesOrNull(getCourseStudentEntityForRegistrationKey(registrationKey.trim()));
threadMonitoringController.exitInternalAction("_eTfwI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eTfwJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130333330012529502608903065 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130333330027769715558906216;
threadMonitoringController.exitInternalAction("_eTfwJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eTgXNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130333330044634340500522973 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130333330012529502608903065;
threadMonitoringController.exitInternalAction("_eTgXNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130333330044634340500522973;
}
finally {
threadMonitoringController.exitService("_eTRGoLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getStudentsForGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_eTnE4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eTphILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
threadMonitoringController.exitInternalAction("_eTphILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eTvnxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033361004870993782904045 = makeAttributes(getCourseStudentEntitiesForGoogleId(googleId));
threadMonitoringController.exitInternalAction("_eTvnxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eTw15LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033361007890453474174173 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033361004870993782904045;
threadMonitoringController.exitInternalAction("_eTw15LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033361007890453474174173;
}
finally {
threadMonitoringController.exitService("_eTnE4LvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getStudentsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_eT4KoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eT7N8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_eT7N8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eUBUlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130333870024278050036893273 = makeAttributes(getCourseStudentEntitiesForCourse(courseId));
threadMonitoringController.exitInternalAction("_eUBUlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eUB7pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303338700862527522162286 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130333870024278050036893273;
threadMonitoringController.exitInternalAction("_eUB7pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303338700862527522162286;
}
finally {
threadMonitoringController.exitService("_eT4KoLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getStudentsForSection(String sectionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_eUJ3cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eUMTsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert sectionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_eUMTsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eUU2lLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033412005837203267503688 = makeAttributes(getCourseStudentEntitiesForSection(sectionName, courseId));
threadMonitoringController.exitInternalAction("_eUU2lLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eUWEtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033412005886389320959521 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033412005837203267503688;
threadMonitoringController.exitInternalAction("_eUWEtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033412005886389320959521;
}
finally {
threadMonitoringController.exitService("_eUJ3cLvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getStudentsForTeam(String teamName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("teamName", teamName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_eUhD0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eUjgELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert teamName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_eUjgELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eUrb5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130334360042226250827945244 = makeAttributes(getCourseStudentEntitiesForTeam(teamName, courseId));
threadMonitoringController.exitInternalAction("_eUrb5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eUsC9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033436009546979442719838 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130334360042226250827945244;
threadMonitoringController.exitInternalAction("_eUsC9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033436009546979442719838;
}
finally {
threadMonitoringController.exitService("_eUhD0LvVEeyr6avTgCRLkQ");
}
}

public  List<StudentAttributes> getUnregisteredStudentsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_eUzXsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eU1z8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<StudentAttributes> allStudents = getStudentsForCourse(courseId);
List<StudentAttributes> unregistered = new  ArrayList<>();
for (StudentAttributes s : allStudents)
{
if (s.getGoogleId() == null || s.getGoogleId().trim().isEmpty())
{
unregistered.add(s);
}
}
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033448003482350196117088 = unregistered;
threadMonitoringController.exitInternalAction("_eU1z8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033448003482350196117088;
}
finally {
threadMonitoringController.exitService("_eUzXsLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes updateStudent(StudentAttributes.UpdateOptions updateOptions)throws EntityDoesNotExistException, InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_eVyPILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eV0rYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_eV8nNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseStudent student = getCourseStudentEntityForEmail(updateOptions.getCourseId(), updateOptions.getEmail());
threadMonitoringController.exitInternalAction("_eV8nNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eV0rYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eV8nNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (student == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_eV8nNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eV_DdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes newAttributes = makeAttributes(student);
threadMonitoringController.exitInternalAction("_eV_DdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eV_qgLvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_eWARkLvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_eWBfsLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_eWBftLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_eWD78LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eWD78bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eWEjALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean isEmailChanged = !student.getEmail().equals(newAttributes.getEmail());
threadMonitoringController.exitInternalAction("_eWEjALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eWD78LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (isEmailChanged)
{
threadMonitoringController.enterBranch("_eW9T0LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXDad7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = createEntity(newAttributes);
threadMonitoringController.exitInternalAction("_eXDad7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXEBgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXEolLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteStudent(student.getCourseId(), student.getEmail());
threadMonitoringController.exitInternalAction("_eXEolLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXEBgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return newAttributes;
}
else
{
threadMonitoringController.enterInternalAction("_eXEombvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXEomrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXGdxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXGdxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXGdxrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXHr47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXHr5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXHr5bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXI6A7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXI6BLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXI6BbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXKII7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXKIJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXKIJbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXL9U7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(student.getName(), newAttributes.getName()) && this.<String>hasSameValue(student.getComments(), newAttributes.getComments()) && this.<String>hasSameValue(student.getGoogleId(), newAttributes.getGoogleId()) && this.<String>hasSameValue(student.getTeamName(), newAttributes.getTeam()) && this.<String>hasSameValue(student.getSectionName(), newAttributes.getSection());
threadMonitoringController.exitInternalAction("_eXL9U7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXKIJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXKII7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXI6BLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXI6A7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXHr5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXHr47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXGdxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXGdxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eXEombvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_eXL9VLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXMkYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXMkYbvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, CourseStudent.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_eXMkYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXMkYrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033805005786638161532528 = newAttributes;
threadMonitoringController.exitInternalAction("_eXMkYrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033805005786638161532528;
}
threadMonitoringController.setExternalCallId("_eXNLcLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXNLcbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setName(newAttributes.getName());
threadMonitoringController.exitInternalAction("_eXNLcbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXNLcrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXNygLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setComments(newAttributes.getComments());
threadMonitoringController.exitInternalAction("_eXNygLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXNygbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXOZkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setGoogleId(newAttributes.getGoogleId());
threadMonitoringController.exitInternalAction("_eXOZkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXOZkbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXPAoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setTeamName(newAttributes.getTeam());
threadMonitoringController.exitInternalAction("_eXPAoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eXPAobvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eXPAorvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setSectionName(newAttributes.getSection());
threadMonitoringController.exitInternalAction("_eXPAorvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXQ107vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(student);
threadMonitoringController.exitInternalAction("_eXQ107vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eXSrA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033806007376755614133265 = makeAttributes(student);
threadMonitoringController.exitInternalAction("_eXSrA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033806007376755614133265;
}
}
finally {
threadMonitoringController.exitService("_eVyPILvVEeyr6avTgCRLkQ");
}
}

public  void deleteStudent(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_eY5NgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eY834LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
threadMonitoringController.exitInternalAction("_eY834LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eZBJVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseStudent courseStudentToDelete = getCourseStudentEntityForEmail(courseId, email);
threadMonitoringController.exitInternalAction("_eZBJVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eZJFILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (courseStudentToDelete != null)
{
deleteDocumentByStudentId(courseStudentToDelete.getUniqueId());
deleteEntity(Key.create(CourseStudent.class, courseStudentToDelete.getUniqueId()));
}
threadMonitoringController.exitInternalAction("_eZJFILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_eY5NgLvVEeyr6avTgCRLkQ");
}
}

public  void deleteStudents(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_dRPo8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_dRe5gLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dRfgkLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dRfgkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<CourseStudent> studentsToDelete = getCourseStudentsForCourseQuery(query.getCourseId()).list();
threadMonitoringController.exitInternalAction("_dRfgkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(studentsToDelete.stream().map(CourseStudent::getUniqueId).collect(Collectors.toList()));
deleteEntity(studentsToDelete.stream().map(s -> Key.create(CourseStudent.class, s.getUniqueId())).collect(Collectors.toList()));
}
}
finally {
threadMonitoringController.exitService("_dRPo8LvVEeyr6avTgCRLkQ");
}
}

private  CourseStudent getCourseStudentEntityForEmail(String courseId, String email) {
return load().id(CourseStudent.generateId(email, courseId)).now();
}

private  List<CourseStudent> getAllCourseStudentEntitiesForEmail(String email) {
return load().filter("email =", email).list();
}

private  CourseStudent getCourseStudentEntityForRegistrationKey(String registrationKey) {
List<CourseStudent> studentList = load().filter("registrationKey =", registrationKey).list();
if (studentList.size() > 1)
{
log.severe("Duplicate registration keys detected for: " + studentList.stream().map(s -> s.getUniqueId()).collect(Collectors.joining(", ")));
}
if (studentList.isEmpty())
{
return null;
}
return studentList.get(0);
}

private  Query<CourseStudent> getCourseStudentsForCourseQuery(String courseId) {
return load().filter("courseId =", courseId);
}

private  List<CourseStudent> getCourseStudentEntitiesForCourse(String courseId) {
return getCourseStudentsForCourseQuery(courseId).list();
}

private  Query<CourseStudent> getCourseStudentsForGoogleIdQuery(String googleId) {
return load().filter("googleId =", googleId);
}

private  List<CourseStudent> getCourseStudentEntitiesForGoogleId(String googleId) {
return getCourseStudentsForGoogleIdQuery(googleId).list();
}

private  List<CourseStudent> getCourseStudentEntitiesForTeam(String teamName, String courseId) {
return load().filter("teamName =", teamName).filter("courseId =", courseId).list();
}

private  List<CourseStudent> getCourseStudentEntitiesForSection(String sectionName, String courseId) {
return load().filter("sectionName =", sectionName).filter("courseId =", courseId).list();
}

@Override
 LoadType<CourseStudent> load() {
return ofy().load().type(CourseStudent.class);
}

@Override
 boolean hasExistingEntities(StudentAttributes entityToCreate) {
return !load().filterKey(Key.create(CourseStudent.class, CourseStudent.generateId(entityToCreate.getEmail(), entityToCreate.getCourse()))).keys().list().isEmpty();
}

@Override
 StudentAttributes makeAttributes(CourseStudent entity) {
assert entity != null;
return StudentAttributes.valueOf(entity);
}

@Override
 CourseStudent convertToEntityForSaving(StudentAttributes attributes)throws EntityAlreadyExistsException {
int numTries = 0;
while (numTries < MAX_KEY_REGENERATION_TRIES)
{
CourseStudent student = attributes.toEntity();
Key<CourseStudent> existingStudent = load().filter("registrationKey =", student.getRegistrationKey()).keys().first().now();
if (existingStudent == null)
{
return student;
}
numTries++;
}
log.severe("Failed to generate new registration key for student after " + MAX_KEY_REGENERATION_TRIES + " tries");
throw new  EntityAlreadyExistsException("Unable to create new student");
}

}
