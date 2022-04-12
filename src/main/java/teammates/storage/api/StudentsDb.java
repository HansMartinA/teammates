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
threadMonitoringController.enterService("_uml40LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_umnuALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368293200031750831441531235 = instance;
threadMonitoringController.exitInternalAction("_umnuALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368293200031750831441531235;
}
finally {
threadMonitoringController.exitService("_uml40LngEeyIw-dB1KCaVA");
}
}

private  StudentSearchManager getSearchManager() {
return SearchManagerFactory.getStudentSearchManager();
}

public  void putDocument(StudentAttributes student)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_uoFtoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uoKmJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uoKmJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().putDocument(student);
threadMonitoringController.exitInternalAction("_uoKmJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uoKmJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uoFtoLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> search(String queryString, List<InstructorAttributes> instructors)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
monitoringServiceParameters.addValue("instructors", instructors);
threadMonitoringController.enterService("_vtXToLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vtaW8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (queryString.trim().isEmpty())
{
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683991008294115619528882 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_vtaW8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683991008294115619528882;
}
threadMonitoringController.enterInternalAction("_vteoZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368399100688750174108164 = getSearchManager().searchStudents(queryString, instructors);
threadMonitoringController.exitInternalAction("_vteoZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vteoZbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136839910004172165780259662 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368399100688750174108164;
threadMonitoringController.exitInternalAction("_vteoZbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136839910004172165780259662;
}
finally {
threadMonitoringController.exitService("_vtXToLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> searchStudentsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_vtkvALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vtpAcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (queryString.trim().isEmpty())
{
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136839980010840614194067599 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_vtpAcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136839980010840614194067599;
}
threadMonitoringController.enterInternalAction("_vtsDxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683998007074322163605011 = getSearchManager().searchStudents(queryString, null);
threadMonitoringController.exitInternalAction("_vtsDxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vtsDxbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683998007546393504109192 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683998007074322163605011;
threadMonitoringController.exitInternalAction("_vtsDxbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683998007546393504109192;
}
finally {
threadMonitoringController.exitService("_vtkvALngEeyIw-dB1KCaVA");
}
}

public  void deleteDocumentByStudentId(String studentUniqueId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentUniqueId", studentUniqueId);
threadMonitoringController.enterService("_wQ8h0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_wRCodLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_wRCodbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(Collections.singletonList(studentUniqueId));
threadMonitoringController.exitInternalAction("_wRCodbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_wRCodLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_wQ8h0LngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes regenerateEntityKey(StudentAttributes originalStudent)throws EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("originalStudent", originalStudent);
threadMonitoringController.enterService("_vv4cILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vv64YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int numTries = 0;
threadMonitoringController.exitInternalAction("_vv64YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
while (numTries < MAX_KEY_REGENERATION_TRIES)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_vwI60rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseStudent updatedEntity = convertToEntityForSaving(originalStudent);
threadMonitoringController.exitInternalAction("_vwI60rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!updatedEntity.getRegistrationKey().equals(originalStudent.getKey()))
{
threadMonitoringController.enterBranch("_vwI607ngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vwKwArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(updatedEntity);
threadMonitoringController.exitInternalAction("_vwKwArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vwL-JbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713684073007191632613074044 = makeAttributes(updatedEntity);
threadMonitoringController.exitInternalAction("_vwL-JbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713684073007191632613074044;
}
numTries++;
}
threadMonitoringController.exitLoop("_vwHFoLngEeyIw-dB1KCaVA", loopIterationCounter1.get());
threadMonitoringController.setExternalCallId("_vwMlMrngEeyIw-dB1KCaVA");
log.severe("Failed to generate new registration key for student after " + MAX_KEY_REGENERATION_TRIES + " tries");
threadMonitoringController.enterInternalAction("_vwNMQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
throw new  EntityAlreadyExistsException("Could not regenerate a new course registration key for the student.");
threadMonitoringController.exitInternalAction("_vwNMQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_vv4cILngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes getStudentForEmail(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_un45ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_un6ugLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
threadMonitoringController.exitInternalAction("_un6ugLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uoA1JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682949009303027541593089 = makeAttributesOrNull(getCourseStudentEntityForEmail(courseId, email));
threadMonitoringController.exitInternalAction("_uoA1JLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uoBcNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136829490021818478867321722 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682949009303027541593089;
threadMonitoringController.exitInternalAction("_uoBcNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136829490021818478867321722;
}
finally {
threadMonitoringController.exitService("_un45ULngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getAllStudentsForEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_vrHQ4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vrKUMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
threadMonitoringController.exitInternalAction("_vrKUMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vrOlpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<CourseStudent> students = getAllCourseStudentEntitiesForEmail(email);
threadMonitoringController.exitInternalAction("_vrOlpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vrS3ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683946008742710522541265 = students.stream().map(this::makeAttributes).collect(Collectors.toList());
threadMonitoringController.exitInternalAction("_vrS3ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683946008742710522541265;
}
finally {
threadMonitoringController.exitService("_vrHQ4LngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes getStudentForGoogleId(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_vray4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vrd2MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert courseId != null;
CourseStudent student = load().filter("courseId =", courseId).filter("googleId =", googleId).first().now();
threadMonitoringController.exitInternalAction("_vrd2MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vrlK9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683950004732654685679961 = makeAttributesOrNull(student);
threadMonitoringController.exitInternalAction("_vrlK9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683950004732654685679961;
}
finally {
threadMonitoringController.exitService("_vray4LngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes getStudentForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_vrrRkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vrtt0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
threadMonitoringController.exitInternalAction("_vrtt0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vr57HLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683957007945064111204037 = makeAttributesOrNull(getCourseStudentEntityForRegistrationKey(registrationKey.trim()));
threadMonitoringController.exitInternalAction("_vr57HLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vr57HbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136839570037355736406358686 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683957007945064111204037;
threadMonitoringController.exitInternalAction("_vr57HbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vr7JNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368395700935072594648648 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136839570037355736406358686;
threadMonitoringController.exitInternalAction("_vr7JNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368395700935072594648648;
}
finally {
threadMonitoringController.exitService("_vrrRkLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getStudentsForGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_vsAowLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vsDFALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
threadMonitoringController.exitInternalAction("_vsDFALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vsH9hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683964005339029965283505 = makeAttributes(getCourseStudentEntitiesForGoogleId(googleId));
threadMonitoringController.exitInternalAction("_vsH9hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vsJLobngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683964009459023517908776 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683964005339029965283505;
threadMonitoringController.exitInternalAction("_vsJLobngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683964009459023517908776;
}
finally {
threadMonitoringController.exitService("_vsAowLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getStudentsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vsOrMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vsRHcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_vsRHcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vsWnBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136839690009772505169390178 = makeAttributes(getCourseStudentEntitiesForCourse(courseId));
threadMonitoringController.exitInternalAction("_vsWnBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vsYcNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683969008360236151678189 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136839690009772505169390178;
threadMonitoringController.exitInternalAction("_vsYcNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683969008360236151678189;
}
finally {
threadMonitoringController.exitService("_vsOrMLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getStudentsForSection(String sectionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vsfJ4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vsiNMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert sectionName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_vsiNMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vso65LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683975008079527807232588 = makeAttributes(getCourseStudentEntitiesForSection(sectionName, courseId));
threadMonitoringController.exitInternalAction("_vso65LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vsph9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683975008621512104310448 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683975008079527807232588;
threadMonitoringController.exitInternalAction("_vsph9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683975008621512104310448;
}
finally {
threadMonitoringController.exitService("_vsfJ4LngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getStudentsForTeam(String teamName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("teamName", teamName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vsw2sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vszS8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert teamName != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_vszS8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vs8c5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368398100531438823813441 = makeAttributes(getCourseStudentEntitiesForTeam(teamName, courseId));
threadMonitoringController.exitInternalAction("_vs8c5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vs9rBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368398100011939577577346538 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368398100531438823813441;
threadMonitoringController.exitInternalAction("_vs9rBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368398100011939577577346538;
}
finally {
threadMonitoringController.exitService("_vsw2sLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getUnregisteredStudentsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vtE_wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vtHcALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683983008990416293256495 = unregistered;
threadMonitoringController.exitInternalAction("_vtHcALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683983008990416293256495;
}
finally {
threadMonitoringController.exitService("_vtE_wLngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes updateStudent(StudentAttributes.UpdateOptions updateOptions)throws EntityDoesNotExistException, InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_vuEeQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vuHhkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_vuOPRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseStudent student = getCourseStudentEntityForEmail(updateOptions.getCourseId(), updateOptions.getEmail());
threadMonitoringController.exitInternalAction("_vuOPRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vuHhkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vuOPRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (student == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_vuOPRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vuRSkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes newAttributes = makeAttributes(student);
threadMonitoringController.exitInternalAction("_vuRSkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vuR5oLngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_vuTHwLngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_vuTu0LngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vuUV4LngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_vuWyILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vuWyIbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vuXZMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean isEmailChanged = !student.getEmail().equals(newAttributes.getEmail());
threadMonitoringController.exitInternalAction("_vuXZMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vuWyILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (isEmailChanged)
{
threadMonitoringController.enterBranch("_vvHnILngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvOU17ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = createEntity(newAttributes);
threadMonitoringController.exitInternalAction("_vvOU17ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vvOU2LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vvQKBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteStudent(student.getCourseId(), student.getEmail());
threadMonitoringController.exitInternalAction("_vvQKBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvOU2LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return newAttributes;
}
else
{
threadMonitoringController.enterInternalAction("_vvQKCbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvQKCrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvRYJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vvRYJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvRYJrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvSmQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vvSmRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvSmRbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvUbc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vvUbdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvUbdbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvWQo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vvWQpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvWQpbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvYF07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(student.getName(), newAttributes.getName()) && this.<String>hasSameValue(student.getComments(), newAttributes.getComments()) && this.<String>hasSameValue(student.getGoogleId(), newAttributes.getGoogleId()) && this.<String>hasSameValue(student.getTeamName(), newAttributes.getTeam()) && this.<String>hasSameValue(student.getSectionName(), newAttributes.getSection());
threadMonitoringController.exitInternalAction("_vvYF07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvWQpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvWQo7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvUbdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvUbc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvSmRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvSmQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvRYJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvRYJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vvQKCbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_vvYF1LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvYF2LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvYF2bngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, CourseStudent.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_vvYF2LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vvYs4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713684055000662937546296446 = newAttributes;
threadMonitoringController.exitInternalAction("_vvYs4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713684055000662937546296446;
}
threadMonitoringController.setExternalCallId("_vvYs4rngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvZT8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setName(newAttributes.getName());
threadMonitoringController.exitInternalAction("_vvZT8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvZT8bngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvZ7ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setComments(newAttributes.getComments());
threadMonitoringController.exitInternalAction("_vvZ7ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvZ7AbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvaiELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setGoogleId(newAttributes.getGoogleId());
threadMonitoringController.exitInternalAction("_vvaiELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvaiEbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvaiErngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setTeamName(newAttributes.getTeam());
threadMonitoringController.exitInternalAction("_vvaiErngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vvaiE7ngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vvbJILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
student.setSectionName(newAttributes.getSection());
threadMonitoringController.exitInternalAction("_vvbJILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vvc-UrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(student);
threadMonitoringController.exitInternalAction("_vvc-UrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vveMc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713684055004240493227628974 = makeAttributes(student);
threadMonitoringController.exitInternalAction("_vveMc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713684055004240493227628974;
}
}
finally {
threadMonitoringController.exitService("_vuEeQLngEeyIw-dB1KCaVA");
}
}

public  void deleteStudent(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_vxFWALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vxHyQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
threadMonitoringController.exitInternalAction("_vxHyQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vxNR1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
CourseStudent courseStudentToDelete = getCourseStudentEntityForEmail(courseId, email);
threadMonitoringController.exitInternalAction("_vxNR1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vxV0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (courseStudentToDelete != null)
{
deleteDocumentByStudentId(courseStudentToDelete.getUniqueId());
deleteEntity(Key.create(CourseStudent.class, courseStudentToDelete.getUniqueId()));
}
threadMonitoringController.exitInternalAction("_vxV0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_vxFWALngEeyIw-dB1KCaVA");
}
}

public  void deleteStudents(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_urg1ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_usxZULngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_usxZVLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_usz1kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<CourseStudent> studentsToDelete = getCourseStudentsForCourseQuery(query.getCourseId()).list();
threadMonitoringController.exitInternalAction("_usz1kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(studentsToDelete.stream().map(CourseStudent::getUniqueId).collect(Collectors.toList()));
deleteEntity(studentsToDelete.stream().map(s -> Key.create(CourseStudent.class, s.getUniqueId())).collect(Collectors.toList()));
}
}
finally {
threadMonitoringController.exitService("_urg1ELngEeyIw-dB1KCaVA");
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
