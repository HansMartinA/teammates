package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.exception.SearchServiceException;
import teammates.storage.entity.Instructor;
import teammates.storage.search.InstructorSearchManager;
import teammates.storage.search.SearchManagerFactory;
public final class InstructorsDb extends EntitiesDb<Instructor, InstructorAttributes> {
private static final int MAX_KEY_REGENERATION_TRIES = 10;

private static final InstructorsDb instance = new  InstructorsDb();

private  InstructorsDb(){
}
public static  InstructorsDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_dMtuQLvVEeyr6avTgCRLkQ", InstructorsDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dMwxkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027777004820170719088722 = instance;
threadMonitoringController.exitInternalAction("_dMwxkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027777004820170719088722;
}
finally {
threadMonitoringController.exitService("_dMtuQLvVEeyr6avTgCRLkQ");
}
}

private  InstructorSearchManager getSearchManager() {
return SearchManagerFactory.getInstructorSearchManager();
}

public  void putDocument(InstructorAttributes instructor)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_dOhsILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dOpA4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dOpA47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().putDocument(instructor);
threadMonitoringController.exitInternalAction("_dOpA47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dOpA4rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dOhsILvVEeyr6avTgCRLkQ");
}
}

public  void deleteDocumentByInstructorId(String instructorUniqueId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorUniqueId", instructorUniqueId);
threadMonitoringController.enterService("_ey4a0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ey_IhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ey_IhbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(Collections.singletonList(instructorUniqueId));
threadMonitoringController.exitInternalAction("_ey_IhbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_ey_IhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ey4a0LvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes regenerateEntityKey(InstructorAttributes originalInstructor)throws EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("originalInstructor", originalInstructor);
threadMonitoringController.enterService("_eGf18LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eGjgULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int numTries = 0;
threadMonitoringController.exitInternalAction("_eGjgULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
while (numTries < MAX_KEY_REGENERATION_TRIES)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_eGyJ0rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instructor updatedEntity = convertToEntityForSaving(originalInstructor);
threadMonitoringController.exitInternalAction("_eGyJ0rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!updatedEntity.getRegistrationKey().equals(originalInstructor.getKey()))
{
threadMonitoringController.enterBranch("_eGyJ07vVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eGz_A7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(updatedEntity);
threadMonitoringController.exitInternalAction("_eGz_A7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eG1NJbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303295900039153097451968266 = makeAttributes(updatedEntity);
threadMonitoringController.exitInternalAction("_eG1NJbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303295900039153097451968266;
}
numTries++;
}
threadMonitoringController.exitLoop("_eGwUoLvVEeyr6avTgCRLkQ", loopIterationCounter1.get());
threadMonitoringController.setExternalCallId("_eG10MbvVEeyr6avTgCRLkQ");
log.severe("Failed to generate new registration key for instructor after " + MAX_KEY_REGENERATION_TRIES + " tries");
threadMonitoringController.enterInternalAction("_eG2bQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eG2bQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
throw new  EntityAlreadyExistsException("Could not regenerate a new course registration key for the instructor.");
}
finally {
threadMonitoringController.exitService("_eGf18LvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> searchInstructorsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_eAk0ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eAn3cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (queryString.trim().isEmpty())
{
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130317510029280335307749283 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_eAn3cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130317510029280335307749283;
}
threadMonitoringController.enterInternalAction("_eArh1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031751008338933727730209 = getSearchManager().searchInstructors(queryString);
threadMonitoringController.exitInternalAction("_eArh1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eArh1bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031751003792353802881059 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031751008338933727730209;
threadMonitoringController.exitInternalAction("_eArh1bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013031751003792353802881059;
}
finally {
threadMonitoringController.exitService("_eAk0ILvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorForEmail(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_dOUQwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dOWF8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_dOWF8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dOdatLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130279240027270557476167734 = makeAttributesOrNull(getInstructorEntityForEmail(courseId, email));
threadMonitoringController.exitInternalAction("_dOdatLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dOeBxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302792400508080865775525 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130279240027270557476167734;
threadMonitoringController.exitInternalAction("_dOeBxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302792400508080865775525;
}
finally {
threadMonitoringController.exitService("_dOUQwLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorById(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_eCBloLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eCFQALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_eCFQALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eCMkxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130322070010900772859050745 = makeAttributesOrNull(getInstructorEntityById(courseId, email));
threadMonitoringController.exitInternalAction("_eCMkxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eCNL1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303220800861436666885817 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130322070010900772859050745;
threadMonitoringController.exitInternalAction("_eCNL1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303220800861436666885817;
}
finally {
threadMonitoringController.exitService("_eCBloLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorForGoogleId(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_eCVusLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eCYK8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_eCYK8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eCfftLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130322390010495277782396661 = makeAttributesOrNull(getInstructorEntityForGoogleId(courseId, googleId));
threadMonitoringController.exitInternalAction("_eCfftLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eCgGxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303223900519845225656545 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130322390010495277782396661;
threadMonitoringController.exitInternalAction("_eCgGxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303223900519845225656545;
}
finally {
threadMonitoringController.exitService("_eCVusLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_eCm0cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eCpQsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
threadMonitoringController.exitInternalAction("_eCpQsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eC1d8bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032280002113358302082351 = makeAttributesOrNull(getInstructorEntityForRegistrationKey(registrationKey.trim()));
threadMonitoringController.exitInternalAction("_eC1d8bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eC1d8rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032280008893206510378248 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032280002113358302082351;
threadMonitoringController.exitInternalAction("_eC1d8rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eC2FBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303228000646265304821558 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032280008893206510378248;
threadMonitoringController.exitInternalAction("_eC2FBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303228000646265304821558;
}
finally {
threadMonitoringController.exitService("_eCm0cLvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> getInstructorsForGoogleId(String googleId, boolean omitArchived) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
monitoringServiceParameters.addValue("omitArchived", omitArchived);
threadMonitoringController.enterService("_eDQ7wLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eDTYALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
threadMonitoringController.exitInternalAction("_eDTYALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eDeXJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032344003427517067156264 = makeAttributes(getInstructorEntitiesForGoogleId(googleId, omitArchived));
threadMonitoringController.exitInternalAction("_eDeXJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eDe-NLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303234400707919101547945 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032344003427517067156264;
threadMonitoringController.exitInternalAction("_eDe-NLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303234400707919101547945;
}
finally {
threadMonitoringController.exitService("_eDQ7wLvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> getInstructorsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_eC8ysLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eC_2ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_eC_2ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eDF8pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032313005771530599667172 = makeAttributes(getInstructorEntitiesForCourse(courseId));
threadMonitoringController.exitInternalAction("_eDF8pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eDHKxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032313003547570649385192 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032313005771530599667172;
threadMonitoringController.exitInternalAction("_eDHKxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032313003547570649385192;
}
finally {
threadMonitoringController.exitService("_eC8ysLvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> getInstructorsDisplayedToStudents(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_eDpWQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eDrLcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_eDrLcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eDygNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032383009306948311626214 = makeAttributes(getInstructorEntitiesThatAreDisplayedInCourse(courseId));
threadMonitoringController.exitInternalAction("_eDygNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eDzuVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032383006961741761269807 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032383009306948311626214;
threadMonitoringController.exitInternalAction("_eDzuVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032383006961741761269807;
}
finally {
threadMonitoringController.exitService("_eDpWQLvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes updateInstructorByGoogleId(InstructorAttributes.UpdateOptionsWithGoogleId updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_eA2g8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eA49MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_eBAR9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instructor instructor = getInstructorEntityForGoogleId(updateOptions.getCourseId(), updateOptions.getGoogleId());
threadMonitoringController.exitInternalAction("_eBAR9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eA49MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBA5ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instructor == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_eBA5ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBCuNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes newAttributes = makeAttributes(instructor);
threadMonitoringController.exitInternalAction("_eBCuNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBDVQLvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_eBD8ULvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_eBFKcLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_eBFKdLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_eBVCELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBVCEbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBWQNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBWQNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBWQNrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBXeU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBXeVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBYFYLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBZTg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBZThLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBZThbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBbIs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBbItLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBbItbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBcW07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBcW1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBcW1bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBdk87vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBdk9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBdk9bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBezE7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(instructor.getName(), newAttributes.getName()) && this.<String>hasSameValue(instructor.getEmail(), newAttributes.getEmail()) && this.<Boolean>hasSameValue(instructor.getIsArchived(), newAttributes.isArchived()) && this.<String>hasSameValue(instructor.getRole(), newAttributes.getRole()) && this.<Boolean>hasSameValue(instructor.isDisplayedToStudents(), newAttributes.isDisplayedToStudents()) && this.<String>hasSameValue(instructor.getDisplayedName(), newAttributes.getDisplayedName()) && this.<String>hasSameValue(instructor.getInstructorPrivilegesAsText(), newAttributes.getInstructorPrivilegesAsText());
threadMonitoringController.exitInternalAction("_eBezE7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBdk9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBdk87vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBcW1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBcW07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBbItLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBbIs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBZThLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBZTg7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBXeVLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBXeU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBWQNbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBWQNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eBVCELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_eBgoQLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBgoRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBgoRbvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, Instructor.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_eBgoRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBhPULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032174009404866146925627 = newAttributes;
threadMonitoringController.exitInternalAction("_eBhPULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032174009404866146925627;
}
threadMonitoringController.setExternalCallId("_eBidcLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBjEgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setName(newAttributes.getName());
threadMonitoringController.exitInternalAction("_eBjEgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBkSoLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBk5sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setEmail(newAttributes.getEmail());
threadMonitoringController.exitInternalAction("_eBk5sLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBmH0LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBmH0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setIsArchived(newAttributes.isArchived());
threadMonitoringController.exitInternalAction("_eBmH0bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBnV8LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBn9ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setRole(newAttributes.getRole());
threadMonitoringController.exitInternalAction("_eBn9ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBpLILvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBpLIbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setIsDisplayedToStudents(newAttributes.isDisplayedToStudents());
threadMonitoringController.exitInternalAction("_eBpLIbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBqZQLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBrAULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setDisplayedName(newAttributes.getDisplayedName());
threadMonitoringController.exitInternalAction("_eBrAULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eBsOcLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eBs1gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setInstructorPrivilegeAsText(newAttributes.getInstructorPrivilegesAsText());
threadMonitoringController.exitInternalAction("_eBs1gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eBy8I7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(instructor);
threadMonitoringController.exitInternalAction("_eBy8I7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eB0xU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = makeAttributes(instructor);
threadMonitoringController.exitInternalAction("_eB0xU7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eB1YYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032174008647672201769522 = newAttributes;
threadMonitoringController.exitInternalAction("_eB1YYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032174008647672201769522;
}
finally {
threadMonitoringController.exitService("_eA2g8LvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes updateInstructorByEmail(InstructorAttributes.UpdateOptionsWithEmail updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_eETdkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eEV50LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_eEdOlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instructor instructor = getInstructorEntityForEmail(updateOptions.getCourseId(), updateOptions.getEmail());
threadMonitoringController.exitInternalAction("_eEdOlLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eEV50LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eEd1oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instructor == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_eEd1oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eEfq1bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes newAttributes = makeAttributes(instructor);
threadMonitoringController.exitInternalAction("_eEfq1bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eEgR4LvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_eEhgALvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_eEiHELvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_eEiHFLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_eExXoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eExXobvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eEylxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eEylxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eEylxrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eEzz47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eEzz5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eEzz5bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eE1CA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eE1CBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eE1CBbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eE2QI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eE2QJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eE2QJbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eE3eQ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eE3eRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eE3eRbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eE56g7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eE56hLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eE56hbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eE7vs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(instructor.getName(), newAttributes.getName()) && this.<String>hasSameValue(instructor.getGoogleId(), newAttributes.getGoogleId()) && this.<Boolean>hasSameValue(instructor.getIsArchived(), newAttributes.isArchived()) && this.<String>hasSameValue(instructor.getRole(), newAttributes.getRole()) && this.<Boolean>hasSameValue(instructor.isDisplayedToStudents(), newAttributes.isDisplayedToStudents()) && this.<String>hasSameValue(instructor.getDisplayedName(), newAttributes.getDisplayedName()) && this.<String>hasSameValue(instructor.getInstructorPrivilegesAsText(), newAttributes.getInstructorPrivilegesAsText());
threadMonitoringController.exitInternalAction("_eE7vs7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eE56hLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eE56g7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eE3eRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eE3eQ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eE2QJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eE2QI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eE1CBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eE1CA7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eEzz5LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eEzz47vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eEylxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eEylxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eExXoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_eE9k4LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eE-L8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eE-L8bvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, Instructor.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_eE-L8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eE-L8rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130328680010848371993018024 = newAttributes;
threadMonitoringController.exitInternalAction("_eE-L8rvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130328680010848371993018024;
}
threadMonitoringController.setExternalCallId("_eE_aELvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eFABILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setGoogleId(newAttributes.getGoogleId());
threadMonitoringController.exitInternalAction("_eFABILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eFBPQLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eFB2ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setName(newAttributes.getName());
threadMonitoringController.exitInternalAction("_eFB2ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eFDEcLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eFDrgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setIsArchived(newAttributes.isArchived());
threadMonitoringController.exitInternalAction("_eFDrgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eFE5oLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eFFgsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setRole(newAttributes.getRole());
threadMonitoringController.exitInternalAction("_eFFgsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eFGu0LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eFHV4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setIsDisplayedToStudents(newAttributes.isDisplayedToStudents());
threadMonitoringController.exitInternalAction("_eFHV4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eFIkALvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eFJLELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setDisplayedName(newAttributes.getDisplayedName());
threadMonitoringController.exitInternalAction("_eFJLELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eFKZMLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eFLAQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setInstructorPrivilegeAsText(newAttributes.getInstructorPrivilegesAsText());
threadMonitoringController.exitInternalAction("_eFLAQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eFSVArvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(instructor);
threadMonitoringController.exitInternalAction("_eFSVArvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eFUxQ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = makeAttributes(instructor);
threadMonitoringController.exitInternalAction("_eFUxQ7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eFUxRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303286800002872950580187772 = newAttributes;
threadMonitoringController.exitInternalAction("_eFUxRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303286800002872950580187772;
}
finally {
threadMonitoringController.exitService("_eETdkLvVEeyr6avTgCRLkQ");
}
}

public  void deleteInstructor(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_eFiMoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_eFoTQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_eFoTQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eF0ghLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instructor instructorToDelete = getInstructorEntityForEmail(courseId, email);
threadMonitoringController.exitInternalAction("_eF0ghLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eF0ghbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instructorToDelete == null)
{
return;
}
threadMonitoringController.enterInternalAction("_eF71R7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteDocumentByInstructorId(instructorToDelete.getUniqueId());
threadMonitoringController.exitInternalAction("_eF71R7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eF0ghbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eF-RgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteEntity(Key.create(Instructor.class, instructorToDelete.getUniqueId()));
threadMonitoringController.exitInternalAction("_eF-RgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_eFiMoLvVEeyr6avTgCRLkQ");
}
}

public  void deleteInstructors(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_dRkZELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dRm1ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
threadMonitoringController.exitInternalAction("_dRm1ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_dRzCkLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dRzpo7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dRzppLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dRzppbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Instructor> instructorsToDelete = load().filter("courseId =", query.getCourseId()).list();
threadMonitoringController.exitInternalAction("_dRzppbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dRzpo7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(instructorsToDelete.stream().map(Instructor::getUniqueId).collect(Collectors.toList()));
deleteEntity(instructorsToDelete.stream().map(s -> Key.create(Instructor.class, s.getUniqueId())).collect(Collectors.toList()));
}
}
finally {
threadMonitoringController.exitService("_dRkZELvVEeyr6avTgCRLkQ");
}
}

private  Instructor getInstructorEntityForGoogleId(String courseId, String googleId) {
return load().filter("courseId =", courseId).filter("googleId =", googleId).first().now();
}

private  Instructor getInstructorEntityForEmail(String courseId, String email) {
return load().filter("courseId =", courseId).filter("email =", email).first().now();
}

private  Instructor getInstructorEntityById(String courseId, String email) {
return load().id(Instructor.generateId(email, courseId)).now();
}

private  List<Instructor> getInstructorEntitiesThatAreDisplayedInCourse(String courseId) {
return load().filter("courseId =", courseId).filter("isDisplayedToStudents =", true).list();
}

private  Instructor getInstructorEntityForRegistrationKey(String key) {
List<Instructor> instructorList = load().filter("registrationKey =", key).list();
if (instructorList.size() > 1)
{
log.severe("Duplicate registration keys detected for: " + instructorList.stream().map(i -> i.getUniqueId()).collect(Collectors.joining(", ")));
}
if (instructorList.isEmpty())
{
return null;
}
return instructorList.get(0);
}

private  List<Instructor> getInstructorEntitiesForGoogleId(String googleId) {
return load().filter("googleId =", googleId).list();
}

private  List<Instructor> getInstructorEntitiesForGoogleId(String googleId, boolean omitArchived) {
if (omitArchived)
{
return load().filter("googleId =", googleId).filter("isArchived =", false).list();
}
return getInstructorEntitiesForGoogleId(googleId);
}

private  List<Instructor> getInstructorEntitiesForCourse(String courseId) {
return load().filter("courseId =", courseId).list();
}

@Override
 LoadType<Instructor> load() {
return ofy().load().type(Instructor.class);
}

@Override
 boolean hasExistingEntities(InstructorAttributes entityToCreate) {
return !load().filter("courseId =", entityToCreate.getCourseId()).filter("email =", entityToCreate.getEmail()).keys().list().isEmpty();
}

@Override
 InstructorAttributes makeAttributes(Instructor entity) {
assert entity != null;
return InstructorAttributes.valueOf(entity);
}

@Override
 Instructor convertToEntityForSaving(InstructorAttributes attributes)throws EntityAlreadyExistsException {
int numTries = 0;
while (numTries < MAX_KEY_REGENERATION_TRIES)
{
Instructor instructor = attributes.toEntity();
Key<Instructor> existingInstructor = load().filter("registrationKey =", instructor.getRegistrationKey()).keys().first().now();
if (existingInstructor == null)
{
return instructor;
}
numTries++;
}
log.severe("Failed to generate new registration key for instructor after " + MAX_KEY_REGENERATION_TRIES + " tries");
throw new  EntityAlreadyExistsException("Unable to create new instructor");
}

}
