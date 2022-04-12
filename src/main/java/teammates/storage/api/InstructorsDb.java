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
threadMonitoringController.enterService("_umr_cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_umt0oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368293300911693387143859 = instance;
threadMonitoringController.exitInternalAction("_umt0oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368293300911693387143859;
}
finally {
threadMonitoringController.exitService("_umr_cLngEeyIw-dB1KCaVA");
}
}

private  InstructorSearchManager getSearchManager() {
return SearchManagerFactory.getInstructorSearchManager();
}

public  void putDocument(InstructorAttributes instructor)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_uof9ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uolc5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uolc5bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().putDocument(instructor);
threadMonitoringController.exitInternalAction("_uolc5bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uolc5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uof9ULngEeyIw-dB1KCaVA");
}
}

public  void deleteDocumentByInstructorId(String instructorUniqueId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorUniqueId", instructorUniqueId);
threadMonitoringController.enterService("_wJMUALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_wJVd9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_wJVd9bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(Collections.singletonList(instructorUniqueId));
threadMonitoringController.exitInternalAction("_wJVd9bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_wJVd9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_wJMUALngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes regenerateEntityKey(InstructorAttributes originalInstructor)throws EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("originalInstructor", originalInstructor);
threadMonitoringController.enterService("_veGvoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_veJL4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int numTries = 0;
threadMonitoringController.exitInternalAction("_veJL4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
java.util.concurrent.atomic.AtomicInteger loopIterationCounter1 = new  java.util.concurrent.atomic.AtomicInteger(0);
while (numTries < MAX_KEY_REGENERATION_TRIES)
{
loopIterationCounter1.getAndIncrement();
threadMonitoringController.enterInternalAction("_vea4sbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instructor updatedEntity = convertToEntityForSaving(originalInstructor);
threadMonitoringController.exitInternalAction("_vea4sbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!updatedEntity.getRegistrationKey().equals(originalInstructor.getKey()))
{
threadMonitoringController.enterBranch("_vea4srngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_ved8ArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(updatedEntity);
threadMonitoringController.exitInternalAction("_ved8ArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vefKIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683870008166616765431743 = makeAttributes(updatedEntity);
threadMonitoringController.exitInternalAction("_vefKIrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683870008166616765431743;
}
numTries++;
}
threadMonitoringController.exitLoop("_veWnQLngEeyIw-dB1KCaVA", loopIterationCounter1.get());
threadMonitoringController.setExternalCallId("_vefxMLngEeyIw-dB1KCaVA");
log.severe("Failed to generate new registration key for instructor after " + MAX_KEY_REGENERATION_TRIES + " tries");
threadMonitoringController.enterInternalAction("_vegYQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
throw new  EntityAlreadyExistsException("Could not regenerate a new course registration key for the instructor.");
threadMonitoringController.exitInternalAction("_vegYQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_veGvoLngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> searchInstructorsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_vYIqgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vYLt0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (queryString.trim().isEmpty())
{
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683651009109750921637099 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_vYLt0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683651009109750921637099;
}
threadMonitoringController.enterInternalAction("_vYPYNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683651006866739327294226 = getSearchManager().searchInstructors(queryString);
threadMonitoringController.exitInternalAction("_vYPYNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vYPYNbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368365100029242954414794964 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683651006866739327294226;
threadMonitoringController.exitInternalAction("_vYPYNbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368365100029242954414794964;
}
finally {
threadMonitoringController.exitService("_vYIqgLngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorForEmail(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_uoQFsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uoSh8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_uoSh8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uoadxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136829570012397514502948215 = makeAttributesOrNull(getInstructorEntityForEmail(courseId, email));
threadMonitoringController.exitInternalAction("_uoadxLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uobE1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368295700746308916956652 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136829570012397514502948215;
threadMonitoringController.exitInternalAction("_uobE1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368295700746308916956652;
}
finally {
threadMonitoringController.exitService("_uoQFsLngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorById(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_vZfVYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vZhKkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_vZhKkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vZn4RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837420031807273026074845 = makeAttributesOrNull(getInstructorEntityById(courseId, email));
threadMonitoringController.exitInternalAction("_vZn4RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vZpGYrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683742005937920879530717 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837420031807273026074845;
threadMonitoringController.exitInternalAction("_vZpGYrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683742005937920879530717;
}
finally {
threadMonitoringController.exitService("_vZfVYLngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorForGoogleId(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_vZvNALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vZyQULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_vZyQULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vZ4W9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837470023587300451119952 = makeAttributesOrNull(getInstructorEntityForGoogleId(courseId, googleId));
threadMonitoringController.exitInternalAction("_vZ4W9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vZ5lFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368374700005040454829105978 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837470023587300451119952;
threadMonitoringController.exitInternalAction("_vZ5lFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368374700005040454829105978;
}
finally {
threadMonitoringController.exitService("_vZvNALngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_vaASwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vaCvALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
threadMonitoringController.exitInternalAction("_vaCvALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vaNuI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837550025725042955884925 = makeAttributesOrNull(getInstructorEntityForRegistrationKey(registrationKey.trim()));
threadMonitoringController.exitInternalAction("_vaNuI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vaNuJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837550006980746373426261 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837550025725042955884925;
threadMonitoringController.exitInternalAction("_vaNuJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vaOVNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837550018271940919158758 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837550006980746373426261;
threadMonitoringController.exitInternalAction("_vaOVNLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136837550018271940919158758;
}
finally {
threadMonitoringController.exitService("_vaASwLngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> getInstructorsForGoogleId(String googleId, boolean omitArchived) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
monitoringServiceParameters.addValue("omitArchived", omitArchived);
threadMonitoringController.enterService("_varBILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vatdYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
threadMonitoringController.exitInternalAction("_vatdYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_va5qpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683765007942797459649658 = makeAttributes(getInstructorEntitiesForGoogleId(googleId, omitArchived));
threadMonitoringController.exitInternalAction("_va5qpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_va64xLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683765007723070739930712 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683765007942797459649658;
threadMonitoringController.exitInternalAction("_va64xLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683765007723070739930712;
}
finally {
threadMonitoringController.exitService("_varBILngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> getInstructorsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vaWRALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vaYGMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_vaYGMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vaez5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683761005248156623134465 = makeAttributes(getInstructorEntitiesForCourse(courseId));
threadMonitoringController.exitInternalAction("_vaez5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vafa9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683761005776902942308579 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683761005248156623134465;
threadMonitoringController.exitInternalAction("_vafa9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683761005776902942308579;
}
finally {
threadMonitoringController.exitService("_vaWRALngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> getInstructorsDisplayedToStudents(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_vbEpwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vbHGALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
threadMonitoringController.exitInternalAction("_vbHGALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vbQP9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368377200047307022250270725 = makeAttributes(getInstructorEntitiesThatAreDisplayedInCourse(courseId));
threadMonitoringController.exitInternalAction("_vbQP9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vbQ3BLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683772003079410331201672 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368377200047307022250270725;
threadMonitoringController.exitInternalAction("_vbQ3BLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683772003079410331201672;
}
finally {
threadMonitoringController.exitService("_vbEpwLngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes updateInstructorByGoogleId(InstructorAttributes.UpdateOptionsWithGoogleId updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_vYYiILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vYblcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_vYi6NLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instructor instructor = getInstructorEntityForGoogleId(updateOptions.getCourseId(), updateOptions.getGoogleId());
threadMonitoringController.exitInternalAction("_vYi6NLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vYblcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vYjhQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instructor == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_vYjhQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vYl9gbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes newAttributes = makeAttributes(instructor);
threadMonitoringController.exitInternalAction("_vYl9gbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vYl9grngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_vYnLoLngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_vYnysLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vYoZwLngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_vY3DQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vY3DQbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vY3qVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vY3qVbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vY3qVrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vY44c7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vY44dLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vY44dbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vY6Gk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vY6GlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vY6GlbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vY7Us7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vY7UtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vY7UtbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vY8i07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vY8i1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vY8i1bngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vY9w87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vY9w9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vY9w9bngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vY-_E7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(instructor.getName(), newAttributes.getName()) && this.<String>hasSameValue(instructor.getEmail(), newAttributes.getEmail()) && this.<Boolean>hasSameValue(instructor.getIsArchived(), newAttributes.isArchived()) && this.<String>hasSameValue(instructor.getRole(), newAttributes.getRole()) && this.<Boolean>hasSameValue(instructor.isDisplayedToStudents(), newAttributes.isDisplayedToStudents()) && this.<String>hasSameValue(instructor.getDisplayedName(), newAttributes.getDisplayedName()) && this.<String>hasSameValue(instructor.getInstructorPrivilegesAsText(), newAttributes.getInstructorPrivilegesAsText());
threadMonitoringController.exitInternalAction("_vY-_E7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY9w9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY9w87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY8i1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY8i07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY7UtLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY7Us7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY6GlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY6Gk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY44dLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY44c7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY3qVbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY3qVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vY3DQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_vZA0QLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vZA0RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vZA0RbngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, Instructor.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_vZA0RLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vZBbULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683734004534960025631225 = newAttributes;
threadMonitoringController.exitInternalAction("_vZBbULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683734004534960025631225;
}
threadMonitoringController.setExternalCallId("_vZCCYLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vZCpcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setName(newAttributes.getName());
threadMonitoringController.exitInternalAction("_vZCpcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vZD3kLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vZD3kbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setEmail(newAttributes.getEmail());
threadMonitoringController.exitInternalAction("_vZD3kbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vZFFsLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vZFFsbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setIsArchived(newAttributes.isArchived());
threadMonitoringController.exitInternalAction("_vZFFsbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vZGT0LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vZG64LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setRole(newAttributes.getRole());
threadMonitoringController.exitInternalAction("_vZG64LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vZIJALngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vZIwELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setIsDisplayedToStudents(newAttributes.isDisplayedToStudents());
threadMonitoringController.exitInternalAction("_vZIwELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vZJXILngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vZJ-MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setDisplayedName(newAttributes.getDisplayedName());
threadMonitoringController.exitInternalAction("_vZJ-MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vZLMULngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vZLMUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setInstructorPrivilegeAsText(newAttributes.getInstructorPrivilegesAsText());
threadMonitoringController.exitInternalAction("_vZLMUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vZQr4rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(instructor);
threadMonitoringController.exitInternalAction("_vZQr4rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vZShE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = makeAttributes(instructor);
threadMonitoringController.exitInternalAction("_vZShE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vZShFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683735008708399228464053 = newAttributes;
threadMonitoringController.exitInternalAction("_vZShFLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683735008708399228464053;
}
finally {
threadMonitoringController.exitService("_vYYiILngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes updateInstructorByEmail(InstructorAttributes.UpdateOptionsWithEmail updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_vb37ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vb8McLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_vcGkhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instructor instructor = getInstructorEntityForEmail(updateOptions.getCourseId(), updateOptions.getEmail());
threadMonitoringController.exitInternalAction("_vcGkhLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vb8McLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vcGkhbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instructor == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_vcGkhbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vcK18bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes newAttributes = makeAttributes(instructor);
threadMonitoringController.exitInternalAction("_vcK18bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vcLdALngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_vcMrILngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_vcNSMLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vcN5Q7ngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_vce_ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vce_AbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vcgNJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vcgNJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vcgNJrngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vchbQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vciCULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vciCUbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vcjQc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vcjQdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vcjQdbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vckek7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vckelLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vckelbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vclss7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vclstLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vclstbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vcm607ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vcm61LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vcm61bngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vcpXE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(instructor.getName(), newAttributes.getName()) && this.<String>hasSameValue(instructor.getGoogleId(), newAttributes.getGoogleId()) && this.<Boolean>hasSameValue(instructor.getIsArchived(), newAttributes.isArchived()) && this.<String>hasSameValue(instructor.getRole(), newAttributes.getRole()) && this.<Boolean>hasSameValue(instructor.isDisplayedToStudents(), newAttributes.isDisplayedToStudents()) && this.<String>hasSameValue(instructor.getDisplayedName(), newAttributes.getDisplayedName()) && this.<String>hasSameValue(instructor.getInstructorPrivilegesAsText(), newAttributes.getInstructorPrivilegesAsText());
threadMonitoringController.exitInternalAction("_vcpXE7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vcm61LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vcm607ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vclstLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vclss7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vckelLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vckek7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vcjQdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vcjQc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vciCULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vchbQ7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vcgNJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vcgNJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vce_ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_vcrMQLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vcrMRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vcrzULngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, Instructor.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_vcrMRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vcrzUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683845009376148650387098 = newAttributes;
threadMonitoringController.exitInternalAction("_vcrzUbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683845009376148650387098;
}
threadMonitoringController.setExternalCallId("_vctBcLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vctogLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setGoogleId(newAttributes.getGoogleId());
threadMonitoringController.exitInternalAction("_vctogLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vcu2oLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vcvdsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setName(newAttributes.getName());
threadMonitoringController.exitInternalAction("_vcvdsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vcwEwLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vcwr0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setIsArchived(newAttributes.isArchived());
threadMonitoringController.exitInternalAction("_vcwr0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vczIELngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vczvILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setRole(newAttributes.getRole());
threadMonitoringController.exitInternalAction("_vczvILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vc09QLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vc1kULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setIsDisplayedToStudents(newAttributes.isDisplayedToStudents());
threadMonitoringController.exitInternalAction("_vc1kULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vc2ycLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vc3ZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setDisplayedName(newAttributes.getDisplayedName());
threadMonitoringController.exitInternalAction("_vc3ZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vc4noLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vc4nobngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructor.setInstructorPrivilegeAsText(newAttributes.getInstructorPrivilegesAsText());
threadMonitoringController.exitInternalAction("_vc4nobngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vc_8Y7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(instructor);
threadMonitoringController.exitInternalAction("_vc_8Y7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vdBxk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
newAttributes = makeAttributes(instructor);
threadMonitoringController.exitInternalAction("_vdBxk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vdBxlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683845008529638786769218 = newAttributes;
threadMonitoringController.exitInternalAction("_vdBxlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683845008529638786769218;
}
finally {
threadMonitoringController.exitService("_vb37ALngEeyIw-dB1KCaVA");
}
}

public  void deleteInstructor(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_vdP0ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_vdS3ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert courseId != null;
threadMonitoringController.exitInternalAction("_vdS3ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vdYW5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instructor instructorToDelete = getInstructorEntityForEmail(courseId, email);
threadMonitoringController.exitInternalAction("_vdYW5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vdYW5bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instructorToDelete == null)
{
return;
}
threadMonitoringController.enterInternalAction("_vdg5x7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteDocumentByInstructorId(instructorToDelete.getUniqueId());
threadMonitoringController.exitInternalAction("_vdg5x7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vdYW5bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vdiu8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteEntity(Key.create(Instructor.class, instructorToDelete.getUniqueId()));
threadMonitoringController.exitInternalAction("_vdiu8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_vdP0ALngEeyIw-dB1KCaVA");
}
}

public  void deleteInstructors(AttributesDeletionQuery query) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("query", query);
threadMonitoringController.enterService("_utBQ8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_utGJcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert query != null;
threadMonitoringController.exitInternalAction("_utGJcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (query.isCourseIdPresent())
{
threadMonitoringController.enterBranch("_utfLALngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_utfLBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_utfLBbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_utfyELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<Instructor> instructorsToDelete = load().filter("courseId =", query.getCourseId()).list();
threadMonitoringController.exitInternalAction("_utfyELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_utfLBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(instructorsToDelete.stream().map(Instructor::getUniqueId).collect(Collectors.toList()));
deleteEntity(instructorsToDelete.stream().map(s -> Key.create(Instructor.class, s.getUniqueId())).collect(Collectors.toList()));
}
}
finally {
threadMonitoringController.exitService("_utBQ8LngEeyIw-dB1KCaVA");
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
