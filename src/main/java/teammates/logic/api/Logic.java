package teammates.logic.api;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import teammates.common.datatransfer.DataBundle;
import teammates.common.datatransfer.SessionResultsBundle;
import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.attributes.AccountRequestAttributes;
import teammates.common.datatransfer.attributes.CourseAttributes;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.attributes.StudentProfileAttributes;
import teammates.common.exception.EnrollException;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InstructorUpdateException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.exception.SearchServiceException;
import teammates.logic.core.AccountRequestsLogic;
import teammates.logic.core.AccountsLogic;
import teammates.logic.core.CoursesLogic;
import teammates.logic.core.DataBundleLogic;
import teammates.logic.core.FeedbackQuestionsLogic;
import teammates.logic.core.FeedbackResponseCommentsLogic;
import teammates.logic.core.FeedbackResponsesLogic;
import teammates.logic.core.FeedbackSessionsLogic;
import teammates.logic.core.InstructorsLogic;
import teammates.logic.core.ProfilesLogic;
import teammates.logic.core.StudentsLogic;
public class Logic {
private static final Logic instance = new  Logic();

final AccountsLogic accountsLogic = AccountsLogic.inst();

final AccountRequestsLogic accountRequestsLogic = AccountRequestsLogic.inst();

final StudentsLogic studentsLogic = StudentsLogic.inst();

final InstructorsLogic instructorsLogic = InstructorsLogic.inst();

final CoursesLogic coursesLogic = CoursesLogic.inst();

final FeedbackSessionsLogic feedbackSessionsLogic = FeedbackSessionsLogic.inst();

final FeedbackQuestionsLogic feedbackQuestionsLogic = FeedbackQuestionsLogic.inst();

final FeedbackResponsesLogic feedbackResponsesLogic = FeedbackResponsesLogic.inst();

final FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = FeedbackResponseCommentsLogic.inst();

final ProfilesLogic profilesLogic = ProfilesLogic.inst();

final DataBundleLogic dataBundleLogic = DataBundleLogic.inst();

 Logic(){
}
public static  Logic inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_t5OcgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t5QRsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Logic longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136822740006640391775227783 = instance;
threadMonitoringController.exitInternalAction("_t5QRsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136822740006640391775227783;
}
finally {
threadMonitoringController.exitService("_t5OcgLngEeyIw-dB1KCaVA");
}
}

public  AccountAttributes getAccount(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t5TVALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t5VKMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682277005663438495817897 = accountsLogic.getAccount(googleId);
threadMonitoringController.exitInternalAction("_t5VKMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682277005663438495817897;
}
finally {
threadMonitoringController.exitService("_t5TVALngEeyIw-dB1KCaVA");
}
}

public  String getCourseInstitute(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t5YNgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t5apwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368228000410644748004946 = coursesLogic.getCourseInstitute(courseId);
threadMonitoringController.exitInternalAction("_t5apwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368228000410644748004946;
}
finally {
threadMonitoringController.exitService("_t5YNgLngEeyIw-dB1KCaVA");
}
}

public  StudentProfileAttributes updateOrCreateStudentProfile(StudentProfileAttributes.UpdateOptions updateOptions)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_t5eUILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t5gJULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682282000018534019734589569 = profilesLogic.updateOrCreateStudentProfile(updateOptions);
threadMonitoringController.exitInternalAction("_t5gJULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682282000018534019734589569;
}
finally {
threadMonitoringController.exitService("_t5eUILngEeyIw-dB1KCaVA");
}
}

public  void deleteAccountCascade(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t5jzsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t5lo4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
accountsLogic.deleteAccountCascade(googleId);
threadMonitoringController.exitInternalAction("_t5lo4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t5jzsLngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes createInstructor(InstructorAttributes instructor)throws InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_t5p6ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t5rvgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructor != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682286008602528323034194 = instructorsLogic.createInstructor(instructor);
threadMonitoringController.exitInternalAction("_t5rvgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682286008602528323034194;
}
finally {
threadMonitoringController.exitService("_t5p6ULngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> searchInstructorsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_t5vZ4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t5xPELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert queryString != null;
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136822890017012145700804482 = instructorsLogic.searchInstructorsInWholeSystem(queryString);
threadMonitoringController.exitInternalAction("_t5xPELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136822890017012145700804482;
}
finally {
threadMonitoringController.exitService("_t5vZ4LngEeyIw-dB1KCaVA");
}
}

public  void putInstructorDocument(InstructorAttributes instructor)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_t51ggLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t54j0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
instructorsLogic.putDocument(instructor);
threadMonitoringController.exitInternalAction("_t54j0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t51ggLngEeyIw-dB1KCaVA");
}
}

public  void updateToEnsureValidityOfInstructorsForTheCourse(String courseId, InstructorAttributes instructorToEdit) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("instructorToEdit", instructorToEdit);
threadMonitoringController.enterService("_t57nILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t59cULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert instructorToEdit != null;
instructorsLogic.updateToEnsureValidityOfInstructorsForTheCourse(courseId, instructorToEdit);
threadMonitoringController.exitInternalAction("_t59cULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t57nILngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorForEmail(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_t6BGsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t6C74LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682298009938447490352351 = instructorsLogic.getInstructorForEmail(courseId, email);
threadMonitoringController.exitInternalAction("_t6C74LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682298009938447490352351;
}
finally {
threadMonitoringController.exitService("_t6BGsLngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorById(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_t6HNULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t6JCgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823000024445621095745684 = instructorsLogic.getInstructorById(courseId, email);
threadMonitoringController.exitInternalAction("_t6JCgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823000024445621095745684;
}
finally {
threadMonitoringController.exitService("_t6HNULngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorForGoogleId(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t6Ms4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t6N7ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert courseId != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823030039256936058406466 = instructorsLogic.getInstructorForGoogleId(courseId, googleId);
threadMonitoringController.exitInternalAction("_t6N7ALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823030039256936058406466;
}
finally {
threadMonitoringController.exitService("_t6Ms4LngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_t6SMcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t6UBoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682306007807992754172893 = instructorsLogic.getInstructorForRegistrationKey(registrationKey);
threadMonitoringController.exitInternalAction("_t6UBoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682306007807992754172893;
}
finally {
threadMonitoringController.exitService("_t6SMcLngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> getInstructorsForGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t6XE8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t6Y6ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823090037929392994578537 = instructorsLogic.getInstructorsForGoogleId(googleId);
threadMonitoringController.exitInternalAction("_t6Y6ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823090037929392994578537;
}
finally {
threadMonitoringController.exitService("_t6XE8LngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> getInstructorsForGoogleId(String googleId, boolean omitArchived) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
monitoringServiceParameters.addValue("omitArchived", omitArchived);
threadMonitoringController.enterService("_t6dLkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t6fn0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823120045169869389364725 = instructorsLogic.getInstructorsForGoogleId(googleId, omitArchived);
threadMonitoringController.exitInternalAction("_t6fn0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823120045169869389364725;
}
finally {
threadMonitoringController.exitService("_t6dLkLngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> getInstructorsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t6j5QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t6oKsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682314003440297232024909 = instructorsLogic.getInstructorsForCourse(courseId);
threadMonitoringController.exitInternalAction("_t6oKsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682314003440297232024909;
}
finally {
threadMonitoringController.exitService("_t6j5QLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getAllOngoingSessions(Instant rangeStart, Instant rangeEnd) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("rangeStart", rangeStart);
monitoringServiceParameters.addValue("rangeEnd", rangeEnd);
threadMonitoringController.enterService("_t6r1ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t6wGgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823170045158964500537313 = feedbackSessionsLogic.getAllOngoingSessions(rangeStart, rangeEnd);
threadMonitoringController.exitInternalAction("_t6wGgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823170045158964500537313;
}
finally {
threadMonitoringController.exitService("_t6r1ELngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes updateInstructorCascade(InstructorAttributes.UpdateOptionsWithGoogleId updateOptions)throws InstructorUpdateException, InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_t6zw4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t61mELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682320001978044803640745 = instructorsLogic.updateInstructorByGoogleIdCascade(updateOptions);
threadMonitoringController.exitInternalAction("_t61mELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682320001978044803640745;
}
finally {
threadMonitoringController.exitService("_t6zw4LngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes updateInstructor(InstructorAttributes.UpdateOptionsWithEmail updateOptions)throws InstructorUpdateException, InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_t65QcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t67ssLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682323000575863403852912 = instructorsLogic.updateInstructorByEmail(updateOptions);
threadMonitoringController.exitInternalAction("_t67ssLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682323000575863403852912;
}
finally {
threadMonitoringController.exitService("_t65QcLngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes joinCourseForInstructor(String regkey, String googleId)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("regkey", regkey);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t6-wALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7AlMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert regkey != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682326008575151024191711 = accountsLogic.joinCourseForInstructor(regkey, googleId);
threadMonitoringController.exitInternalAction("_t7AlMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682326008575151024191711;
}
finally {
threadMonitoringController.exitService("_t6-wALngEeyIw-dB1KCaVA");
}
}

public  void downgradeInstructorToStudentCascade(String googleId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t7FdsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7HS4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
accountsLogic.downgradeInstructorToStudentCascade(googleId);
threadMonitoringController.exitInternalAction("_t7HS4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t7FdsLngEeyIw-dB1KCaVA");
}
}

public  void deleteInstructorCascade(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_t7K9QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7NZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
instructorsLogic.deleteInstructorCascade(courseId, email);
threadMonitoringController.exitInternalAction("_t7NZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t7K9QLngEeyIw-dB1KCaVA");
}
}

public  void createCourseAndInstructor(String instructorGoogleId, CourseAttributes courseAttributes)throws EntityAlreadyExistsException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorGoogleId", instructorGoogleId);
monitoringServiceParameters.addValue("courseAttributes", courseAttributes);
threadMonitoringController.enterService("_t7S5ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7UuQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorGoogleId != null;
assert courseAttributes != null;
coursesLogic.createCourseAndInstructor(instructorGoogleId, courseAttributes);
threadMonitoringController.exitInternalAction("_t7UuQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t7S5ELngEeyIw-dB1KCaVA");
}
}

public  CourseAttributes getCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t7YYoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7aN0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823380009573935210795448 = coursesLogic.getCourse(courseId);
threadMonitoringController.exitInternalAction("_t7aN0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823380009573935210795448;
}
finally {
threadMonitoringController.exitService("_t7YYoLngEeyIw-dB1KCaVA");
}
}

public  List<CourseAttributes> getCoursesForStudentAccount(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t7d4MLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7fGULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682341008904017369748158 = coursesLogic.getCoursesForStudentAccount(googleId);
threadMonitoringController.exitInternalAction("_t7fGULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682341008904017369748158;
}
finally {
threadMonitoringController.exitService("_t7d4MLngEeyIw-dB1KCaVA");
}
}

public  List<CourseAttributes> getCoursesForInstructor(List<InstructorAttributes> instructorList) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorList", instructorList);
threadMonitoringController.enterService("_t7iwsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7kl4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorList != null;
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682343006420017673501355 = coursesLogic.getCoursesForInstructor(instructorList);
threadMonitoringController.exitInternalAction("_t7kl4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682343006420017673501355;
}
finally {
threadMonitoringController.exitService("_t7iwsLngEeyIw-dB1KCaVA");
}
}

public  List<CourseAttributes> getSoftDeletedCoursesForInstructors(List<InstructorAttributes> instructorList) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorList", instructorList);
threadMonitoringController.enterService("_t7npMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7peYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorList != null;
List<CourseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682346002505907159719939 = coursesLogic.getSoftDeletedCoursesForInstructors(instructorList);
threadMonitoringController.exitInternalAction("_t7peYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682346002505907159719939;
}
finally {
threadMonitoringController.exitService("_t7npMLngEeyIw-dB1KCaVA");
}
}

public  CourseAttributes updateCourseCascade(CourseAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_t7tv0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t7vlALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
CourseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823480043094926867320027 = coursesLogic.updateCourseCascade(updateOptions);
threadMonitoringController.exitInternalAction("_t7vlALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823480043094926867320027;
}
finally {
threadMonitoringController.exitService("_t7tv0LngEeyIw-dB1KCaVA");
}
}

public  void setArchiveStatusOfInstructor(String googleId, String courseId, boolean archiveStatus)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("archiveStatus", archiveStatus);
threadMonitoringController.enterService("_t7zPYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t725wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert courseId != null;
instructorsLogic.setArchiveStatusOfInstructor(googleId, courseId, archiveStatus);
threadMonitoringController.exitInternalAction("_t725wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t7zPYLngEeyIw-dB1KCaVA");
}
}

public  void deleteCourseCascade(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t77yQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t79AYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
coursesLogic.deleteCourseCascade(courseId);
threadMonitoringController.exitInternalAction("_t79AYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t77yQLngEeyIw-dB1KCaVA");
}
}

public  Instant moveCourseToRecycleBin(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t8B44LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8DuELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682356002741975009956986 = coursesLogic.moveCourseToRecycleBin(courseId);
threadMonitoringController.exitInternalAction("_t8DuELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682356002741975009956986;
}
finally {
threadMonitoringController.exitService("_t8B44LngEeyIw-dB1KCaVA");
}
}

public  void restoreCourseFromRecycleBin(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t8HYcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8J0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
coursesLogic.restoreCourseFromRecycleBin(courseId);
threadMonitoringController.exitInternalAction("_t8J0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t8HYcLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> searchStudents(String queryString, List<InstructorAttributes> instructors)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
monitoringServiceParameters.addValue("instructors", instructors);
threadMonitoringController.enterService("_t8OGILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8P7ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert queryString != null;
assert instructors != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823620017021841157893935 = studentsLogic.searchStudents(queryString, instructors);
threadMonitoringController.exitInternalAction("_t8P7ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823620017021841157893935;
}
finally {
threadMonitoringController.exitService("_t8OGILngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> searchStudentsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_t8TlsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8Va4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert queryString != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368236400006924169284277637 = studentsLogic.searchStudentsInWholeSystem(queryString);
threadMonitoringController.exitInternalAction("_t8Va4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368236400006924169284277637;
}
finally {
threadMonitoringController.exitService("_t8TlsLngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes getStudentForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_t8ZFQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8a6cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682366002968876737951438 = studentsLogic.getStudentForRegistrationKey(registrationKey);
threadMonitoringController.exitInternalAction("_t8a6cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682366002968876737951438;
}
finally {
threadMonitoringController.exitService("_t8ZFQLngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes getStudentForEmail(String courseId, String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_t8ek0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8gaALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682368004027204261776578 = studentsLogic.getStudentForEmail(courseId, email);
threadMonitoringController.exitInternalAction("_t8gaALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682368004027204261776578;
}
finally {
threadMonitoringController.exitService("_t8ek0LngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes getStudentForGoogleId(String courseId, String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t8kEYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8l5kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert googleId != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682371009614800818812675 = studentsLogic.getStudentForCourseIdAndGoogleId(courseId, googleId);
threadMonitoringController.exitInternalAction("_t8l5kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682371009614800818812675;
}
finally {
threadMonitoringController.exitService("_t8kEYLngEeyIw-dB1KCaVA");
}
}

public  StudentProfileAttributes getStudentProfile(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t8pj8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8rZILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682374007283143493186471 = profilesLogic.getStudentProfile(googleId);
threadMonitoringController.exitInternalAction("_t8rZILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682374007283143493186471;
}
finally {
threadMonitoringController.exitService("_t8pj8LngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getStudentsForGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t8uccLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t8wRoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682377009993920330101549 = studentsLogic.getStudentsForGoogleId(googleId);
threadMonitoringController.exitInternalAction("_t8wRoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682377009993920330101549;
}
finally {
threadMonitoringController.exitService("_t8uccLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getStudentsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t8z8ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t81xMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682380005513012219426613 = studentsLogic.getStudentsForCourse(courseId);
threadMonitoringController.exitInternalAction("_t81xMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682380005513012219426613;
}
finally {
threadMonitoringController.exitService("_t8z8ALngEeyIw-dB1KCaVA");
}
}

public  List<String> getSectionNamesForCourse(String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t86CoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t88e4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682383009274484080768937 = coursesLogic.getSectionsNameForCourse(courseId);
threadMonitoringController.exitInternalAction("_t88e4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682383009274484080768937;
}
finally {
threadMonitoringController.exitService("_t86CoLngEeyIw-dB1KCaVA");
}
}

public  void populateFieldsToGenerateInQuestion(FeedbackQuestionAttributes feedbackQuestionAttributes, String emailOfEntityDoingQuestion, String teamOfEntityDoingQuestion) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionAttributes", feedbackQuestionAttributes);
monitoringServiceParameters.addValue("emailOfEntityDoingQuestion", emailOfEntityDoingQuestion);
monitoringServiceParameters.addValue("teamOfEntityDoingQuestion", teamOfEntityDoingQuestion);
threadMonitoringController.enterService("_t9AJQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t9ClgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionAttributes != null;
assert emailOfEntityDoingQuestion != null;
feedbackQuestionsLogic.populateFieldsToGenerateInQuestion(feedbackQuestionAttributes, emailOfEntityDoingQuestion, teamOfEntityDoingQuestion);
threadMonitoringController.exitInternalAction("_t9ClgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t9AJQLngEeyIw-dB1KCaVA");
}
}

public  void resetStudentGoogleId(String originalEmail, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("originalEmail", originalEmail);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t9G28LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t9JTMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert originalEmail != null;
assert courseId != null;
studentsLogic.resetStudentGoogleId(originalEmail, courseId);
threadMonitoringController.exitInternalAction("_t9JTMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t9G28LngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes regenerateInstructorRegistrationKey(String courseId, String email)throws EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_t9NkoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t9OywLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682392002846656802044454 = instructorsLogic.regenerateInstructorRegistrationKey(courseId, email);
threadMonitoringController.exitInternalAction("_t9OywLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682392002846656802044454;
}
finally {
threadMonitoringController.exitService("_t9NkoLngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes regenerateStudentRegistrationKey(String courseId, String email)throws EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_t9TEMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t9WukLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert email != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823960017968101426373817 = studentsLogic.regenerateStudentRegistrationKey(courseId, email);
threadMonitoringController.exitInternalAction("_t9WukLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136823960017968101426373817;
}
finally {
threadMonitoringController.exitService("_t9TEMLngEeyIw-dB1KCaVA");
}
}

public  void resetInstructorGoogleId(String originalEmail, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("originalEmail", originalEmail);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t9bAALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t9dcQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert originalEmail != null;
assert courseId != null;
instructorsLogic.resetInstructorGoogleId(originalEmail, courseId);
threadMonitoringController.exitInternalAction("_t9dcQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t9bAALngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes createStudent(StudentAttributes student)throws InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_t9hGoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.setExternalCallId("_t9i70LngEeyIw-dB1KCaVA");
assert student.getCourse() != null;
threadMonitoringController.setExternalCallId("_t9ji4LngEeyIw-dB1KCaVA");
assert student.getEmail() != null;
threadMonitoringController.enterInternalAction("_t9kxALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682403003543977635814086 = studentsLogic.createStudent(student);
threadMonitoringController.exitInternalAction("_t9kxALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682403003543977635814086;
}
finally {
threadMonitoringController.exitService("_t9hGoLngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes updateStudentCascade(StudentAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_t9q3oLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t9ss0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682406007316717199579397 = studentsLogic.updateStudentCascade(updateOptions);
threadMonitoringController.exitInternalAction("_t9ss0LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682406007316717199579397;
}
finally {
threadMonitoringController.exitService("_t9q3oLngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes joinCourseForStudent(String key, String googleId)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("key", key);
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_t9wXMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t9yMYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert key != null;
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824090048615741263499235 = accountsLogic.joinCourseForStudent(key, googleId);
threadMonitoringController.exitInternalAction("_t9yMYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824090048615741263499235;
}
finally {
threadMonitoringController.exitService("_t9wXMLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getUnregisteredStudentsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t912wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t93r8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682412003328745117089654 = studentsLogic.getUnregisteredStudentsForCourse(courseId);
threadMonitoringController.exitInternalAction("_t93r8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682412003328745117089654;
}
finally {
threadMonitoringController.exitService("_t912wLngEeyIw-dB1KCaVA");
}
}

public  boolean isFeedbackSessionAttemptedByInstructor(FeedbackSessionAttributes fsa, String userEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fsa", fsa);
monitoringServiceParameters.addValue("userEmail", userEmail);
threadMonitoringController.enterService("_t979YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t99ykLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert fsa != null;
assert userEmail != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368241400349285982063417 = feedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor(fsa, userEmail);
threadMonitoringController.exitInternalAction("_t99ykLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368241400349285982063417;
}
finally {
threadMonitoringController.exitService("_t979YLngEeyIw-dB1KCaVA");
}
}

public  boolean isFeedbackSessionAttemptedByStudent(FeedbackSessionAttributes fsa, String userEmail, String userTeam) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fsa", fsa);
monitoringServiceParameters.addValue("userEmail", userEmail);
monitoringServiceParameters.addValue("userTeam", userTeam);
threadMonitoringController.enterService("_t-Bc8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-DSILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert fsa != null;
assert userEmail != null;
assert userTeam != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682417009128306483122839 = feedbackSessionsLogic.isFeedbackSessionAttemptedByStudent(fsa, userEmail, userTeam);
threadMonitoringController.exitInternalAction("_t-DSILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682417009128306483122839;
}
finally {
threadMonitoringController.exitService("_t-Bc8LngEeyIw-dB1KCaVA");
}
}

public  void deleteStudentCascade(String courseId, String studentEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("studentEmail", studentEmail);
threadMonitoringController.enterService("_t-G8gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-JYwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert studentEmail != null;
studentsLogic.deleteStudentCascade(courseId, studentEmail);
threadMonitoringController.exitInternalAction("_t-JYwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t-G8gLngEeyIw-dB1KCaVA");
}
}

public  void deleteStudentsInCourseCascade(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t-NDILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-PfYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
studentsLogic.deleteStudentsInCourseCascade(courseId);
threadMonitoringController.exitInternalAction("_t-PfYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t-NDILngEeyIw-dB1KCaVA");
}
}

public  void validateSectionsAndTeams(List<StudentAttributes> studentList, String courseId)throws EnrollException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentList", studentList);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t-TJwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-U-8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert studentList != null;
assert courseId != null;
studentsLogic.validateSectionsAndTeams(studentList, courseId);
threadMonitoringController.exitInternalAction("_t-U-8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t-TJwLngEeyIw-dB1KCaVA");
}
}

public  List<StudentAttributes> getStudentsForTeam(String teamName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("teamName", teamName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t-Z3cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-bsoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert teamName != null;
assert courseId != null;
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824290022002109859583174 = studentsLogic.getStudentsForTeam(teamName, courseId);
threadMonitoringController.exitInternalAction("_t-bsoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824290022002109859583174;
}
finally {
threadMonitoringController.exitService("_t-Z3cLngEeyIw-dB1KCaVA");
}
}

public  void putStudentDocument(StudentAttributes student)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_t-ev8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-hzQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
studentsLogic.putDocument(student);
threadMonitoringController.exitInternalAction("_t-hzQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_t-ev8LngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes createFeedbackSession(FeedbackSessionAttributes feedbackSession)throws EntityAlreadyExistsException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSession", feedbackSession);
threadMonitoringController.enterService("_t-k2kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-mrwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSession != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682433005073467692836032 = feedbackSessionsLogic.createFeedbackSession(feedbackSession);
threadMonitoringController.exitInternalAction("_t-mrwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682433005073467692836032;
}
finally {
threadMonitoringController.exitService("_t-k2kLngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes getFeedbackSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t-pvELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-sLULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824350043932994424250216 = feedbackSessionsLogic.getFeedbackSession(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_t-sLULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824350043932994424250216;
}
finally {
threadMonitoringController.exitService("_t-pvELngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes getFeedbackSessionFromRecycleBin(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t-v1sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-xq4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682438006873668233896508 = feedbackSessionsLogic.getFeedbackSessionFromRecycleBin(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_t-xq4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682438006873668233896508;
}
finally {
threadMonitoringController.exitService("_t-v1sLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t-0uMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-3KcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824400014375352190288204 = feedbackSessionsLogic.getFeedbackSessionsForCourse(courseId);
threadMonitoringController.exitInternalAction("_t-3KcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824400014375352190288204;
}
finally {
threadMonitoringController.exitService("_t-0uMLngEeyIw-dB1KCaVA");
}
}

public  int getExpectedTotalSubmission(FeedbackSessionAttributes fsa) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fsa", fsa);
threadMonitoringController.enterService("_t-7b4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t-9RELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert fsa != null;
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682445009049134545051284 = feedbackSessionsLogic.getExpectedTotalSubmission(fsa);
threadMonitoringController.exitInternalAction("_t-9RELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682445009049134545051284;
}
finally {
threadMonitoringController.exitService("_t-7b4LngEeyIw-dB1KCaVA");
}
}

public  int getActualTotalSubmission(FeedbackSessionAttributes fsa) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fsa", fsa);
threadMonitoringController.enterService("_t_BigLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_DXsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert fsa != null;
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824500008008482033845776 = feedbackSessionsLogic.getActualTotalSubmission(fsa);
threadMonitoringController.exitInternalAction("_t_DXsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824500008008482033845776;
}
finally {
threadMonitoringController.exitService("_t_BigLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsListForInstructor(List<InstructorAttributes> instructorList) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorList", instructorList);
threadMonitoringController.enterService("_t_HCELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_I3QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorList != null;
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824530010120325684864928 = feedbackSessionsLogic.getFeedbackSessionsListForInstructor(instructorList);
threadMonitoringController.exitInternalAction("_t_I3QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824530010120325684864928;
}
finally {
threadMonitoringController.exitService("_t_HCELngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getSoftDeletedFeedbackSessionsListForInstructors(List<InstructorAttributes> instructorList) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructorList", instructorList);
threadMonitoringController.enterService("_t_OW0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_QzELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert instructorList != null;
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682456007072568152769062 = feedbackSessionsLogic.getSoftDeletedFeedbackSessionsListForInstructors(instructorList);
threadMonitoringController.exitInternalAction("_t_QzELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682456007072568152769062;
}
finally {
threadMonitoringController.exitService("_t_OW0LngEeyIw-dB1KCaVA");
}
}

public  Map<String, String> getRecipientsOfQuestion(FeedbackQuestionAttributes question, @Nullable
InstructorAttributes instructorGiver, @Nullable
StudentAttributes studentGiver) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
monitoringServiceParameters.addValue("instructorGiver", instructorGiver);
monitoringServiceParameters.addValue("studentGiver", studentGiver);
threadMonitoringController.enterService("_t_VrkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_XgwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert question != null;
Map<String, String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824600007158050073731659 = feedbackQuestionsLogic.getRecipientsOfQuestion(question, instructorGiver, studentGiver, null);
threadMonitoringController.exitInternalAction("_t_XgwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824600007158050073731659;
}
finally {
threadMonitoringController.exitService("_t_VrkLngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionAttributes getFeedbackQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_t_dnYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_fckLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestionId != null;
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682463003127747011692005 = feedbackQuestionsLogic.getFeedbackQuestion(feedbackQuestionId);
threadMonitoringController.exitInternalAction("_t_fckLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682463003127747011692005;
}
finally {
threadMonitoringController.exitService("_t_dnYLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForStudents(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t_jG8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_k8ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682466004356159321589109 = feedbackQuestionsLogic.getFeedbackQuestionsForStudents(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_t_k8ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682466004356159321589109;
}
finally {
threadMonitoringController.exitService("_t_jG8LngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForInstructors(String feedbackSessionName, String courseId, String instructorEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("instructorEmail", instructorEmail);
threadMonitoringController.enterService("_t_omgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_rCwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682468004883110743627208 = feedbackQuestionsLogic.getFeedbackQuestionsForInstructors(feedbackSessionName, courseId, instructorEmail);
threadMonitoringController.exitInternalAction("_t_rCwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682468004883110743627208;
}
finally {
threadMonitoringController.exitService("_t_omgLngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes updateFeedbackSession(FeedbackSessionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_t_v7QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_yXgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682471001195595063248921 = feedbackSessionsLogic.updateFeedbackSession(updateOptions);
threadMonitoringController.exitInternalAction("_t_yXgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682471001195595063248921;
}
finally {
threadMonitoringController.exitService("_t_v7QLngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes publishFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t_3QALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_t_5sQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824740012222654233599572 = feedbackSessionsLogic.publishFeedbackSession(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_t_5sQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136824740012222654233599572;
}
finally {
threadMonitoringController.exitService("_t_3QALngEeyIw-dB1KCaVA");
}
}

public  FeedbackSessionAttributes unpublishFeedbackSession(String feedbackSessionName, String courseId)throws EntityDoesNotExistException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_t_-kwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uABBALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
FeedbackSessionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682478002889182692401385 = feedbackSessionsLogic.unpublishFeedbackSession(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_uABBALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682478002889182692401385;
}
finally {
threadMonitoringController.exitService("_t_-kwLngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackSessionCascade(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_uAErYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uAGgkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
feedbackSessionsLogic.deleteFeedbackSessionCascade(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_uAGgkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uAErYLngEeyIw-dB1KCaVA");
}
}

public  void moveFeedbackSessionToRecycleBin(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_uALZELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uAOcYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
feedbackSessionsLogic.moveFeedbackSessionToRecycleBin(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_uAOcYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uALZELngEeyIw-dB1KCaVA");
}
}

public  void restoreFeedbackSessionFromRecycleBin(String feedbackSessionName, String courseId)throws EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_uAW_QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uAY0cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
feedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_uAY0cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uAW_QLngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionAttributes createFeedbackQuestion(FeedbackQuestionAttributes feedbackQuestion)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestion", feedbackQuestion);
threadMonitoringController.enterService("_uAce0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uAeUALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackQuestion != null;
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682487005689490577411591 = feedbackQuestionsLogic.createFeedbackQuestion(feedbackQuestion);
threadMonitoringController.exitInternalAction("_uAeUALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682487005689490577411591;
}
finally {
threadMonitoringController.exitService("_uAce0LngEeyIw-dB1KCaVA");
}
}

public  FeedbackQuestionAttributes updateFeedbackQuestionCascade(FeedbackQuestionAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_uAh-YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uAjzkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
FeedbackQuestionAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682492009534797825337813 = feedbackQuestionsLogic.updateFeedbackQuestionCascade(updateOptions);
threadMonitoringController.exitInternalAction("_uAjzkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682492009534797825337813;
}
finally {
threadMonitoringController.exitService("_uAh-YLngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackQuestionCascade(String questionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("questionId", questionId);
threadMonitoringController.enterService("_uAoFALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uAqhQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert questionId != null;
feedbackQuestionsLogic.deleteFeedbackQuestionCascade(questionId);
threadMonitoringController.exitInternalAction("_uAqhQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uAoFALngEeyIw-dB1KCaVA");
}
}

public  boolean areThereResponsesForQuestion(String feedbackQuestionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackQuestionId", feedbackQuestionId);
threadMonitoringController.enterService("_uAuLoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uAwn4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682500009801309078521275 = feedbackResponsesLogic.areThereResponsesForQuestion(feedbackQuestionId);
threadMonitoringController.exitInternalAction("_uAwn4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682500009801309078521275;
}
finally {
threadMonitoringController.exitService("_uAuLoLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackQuestionAttributes> getFeedbackQuestionsForSession(String feedbackSessionName, String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_uA0SQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uA2HcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
List<FeedbackQuestionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136825020055347105781121 = feedbackQuestionsLogic.getFeedbackQuestionsForSession(feedbackSessionName, courseId);
threadMonitoringController.exitInternalAction("_uA2HcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136825020055347105781121;
}
finally {
threadMonitoringController.exitService("_uA0SQLngEeyIw-dB1KCaVA");
}
}

public  Set<String> getGiverSetThatAnswerFeedbackSession(String courseId, String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_uA5KwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uA7nALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert feedbackSessionName != null;
Set<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682504009547167498174527 = feedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession(courseId, feedbackSessionName);
threadMonitoringController.exitInternalAction("_uA7nALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682504009547167498174527;
}
finally {
threadMonitoringController.exitService("_uA5KwLngEeyIw-dB1KCaVA");
}
}

public  SessionResultsBundle getSessionResultsForCourse(String feedbackSessionName, String courseId, String userEmail, @Nullable
String questionId, @Nullable
String section) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("userEmail", userEmail);
monitoringServiceParameters.addValue("questionId", questionId);
monitoringServiceParameters.addValue("section", section);
threadMonitoringController.enterService("_uBAfgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uBCUsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert userEmail != null;
SessionResultsBundle longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682508007872054134349495 = feedbackResponsesLogic.getSessionResultsForCourse(feedbackSessionName, courseId, userEmail, questionId, section);
threadMonitoringController.exitInternalAction("_uBCUsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682508007872054134349495;
}
finally {
threadMonitoringController.exitService("_uBAfgLngEeyIw-dB1KCaVA");
}
}

public  SessionResultsBundle getSessionResultsForUser(String feedbackSessionName, String courseId, String userEmail, boolean isInstructor, @Nullable
String questionId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("userEmail", userEmail);
monitoringServiceParameters.addValue("isInstructor", isInstructor);
monitoringServiceParameters.addValue("questionId", questionId);
threadMonitoringController.enterService("_uBHNMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uBJpcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackSessionName != null;
assert courseId != null;
assert userEmail != null;
SessionResultsBundle longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682511008495384396573122 = feedbackResponsesLogic.getSessionResultsForUser(feedbackSessionName, courseId, userEmail, isInstructor, questionId);
threadMonitoringController.exitInternalAction("_uBJpcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682511008495384396573122;
}
finally {
threadMonitoringController.exitService("_uBHNMLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromStudentOrTeamForQuestion(FeedbackQuestionAttributes question, StudentAttributes student) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
monitoringServiceParameters.addValue("student", student);
threadMonitoringController.enterService("_uBNT0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uBQ-MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert question != null;
assert student != null;
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682514005866327632995313 = feedbackResponsesLogic.getFeedbackResponsesFromStudentOrTeamForQuestion(question, student);
threadMonitoringController.exitInternalAction("_uBQ-MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682514005866327632995313;
}
finally {
threadMonitoringController.exitService("_uBNT0LngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackResponseAttributes> getFeedbackResponsesFromInstructorForQuestion(FeedbackQuestionAttributes question, InstructorAttributes instructorAttributes) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("question", question);
monitoringServiceParameters.addValue("instructorAttributes", instructorAttributes);
threadMonitoringController.enterService("_uBVPoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uBXr4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert question != null;
assert instructorAttributes != null;
threadMonitoringController.exitInternalAction("_uBXr4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uBY6ALngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uBZhELngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uBaIILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackResponseAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682522008444674220828078 = feedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion(question.getFeedbackQuestionId(), instructorAttributes.getEmail());
threadMonitoringController.exitInternalAction("_uBaIILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682522008444674220828078;
}
finally {
threadMonitoringController.exitService("_uBVPoLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseAttributes getFeedbackResponse(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_uBeZkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uBgOwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136825250033239068614308265 = feedbackResponsesLogic.getFeedbackResponse(feedbackResponseId);
threadMonitoringController.exitInternalAction("_uBgOwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136825250033239068614308265;
}
finally {
threadMonitoringController.exitService("_uBeZkLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseAttributes createFeedbackResponse(FeedbackResponseAttributes feedbackResponse)throws InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponse", feedbackResponse);
threadMonitoringController.enterService("_uBkgMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uBm8cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponse != null;
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682528003727910574073491 = feedbackResponsesLogic.createFeedbackResponse(feedbackResponse);
threadMonitoringController.exitInternalAction("_uBm8cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682528003727910574073491;
}
finally {
threadMonitoringController.exitService("_uBkgMLngEeyIw-dB1KCaVA");
}
}

public  boolean hasResponsesForCourse(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_uBqm0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uBtDELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136825330023461592329948722 = feedbackResponsesLogic.hasResponsesForCourse(courseId);
threadMonitoringController.exitInternalAction("_uBtDELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136825330023461592329948722;
}
finally {
threadMonitoringController.exitService("_uBqm0LngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseAttributes updateFeedbackResponseCascade(FeedbackResponseAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_uBzJsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uB0-4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
FeedbackResponseAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682593008952508046713779 = feedbackResponsesLogic.updateFeedbackResponseCascade(updateOptions);
threadMonitoringController.exitInternalAction("_uB0-4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682593008952508046713779;
}
finally {
threadMonitoringController.exitService("_uBzJsLngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackResponseCascade(String responseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("responseId", responseId);
threadMonitoringController.enterService("_uB53YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uB7skLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert responseId != null;
feedbackResponsesLogic.deleteFeedbackResponseCascade(responseId);
threadMonitoringController.exitInternalAction("_uB7skLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uB53YLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseCommentAttributes createFeedbackResponseComment(FeedbackResponseCommentAttributes feedbackResponseComment)throws InvalidParametersException, EntityDoesNotExistException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseComment", feedbackResponseComment);
threadMonitoringController.enterService("_uB-v4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCAlELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseComment != null;
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682599009158848104226884 = feedbackResponseCommentsLogic.createFeedbackResponseComment(feedbackResponseComment);
threadMonitoringController.exitInternalAction("_uCAlELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682599009158848104226884;
}
finally {
threadMonitoringController.exitService("_uB-v4LngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseComment(Long feedbackResponseCommentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseCommentId", feedbackResponseCommentId);
threadMonitoringController.enterService("_uCEPcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCGEoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseCommentId != null;
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826020044262500997601917 = feedbackResponseCommentsLogic.getFeedbackResponseComment(feedbackResponseCommentId);
threadMonitoringController.exitInternalAction("_uCGEoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826020044262500997601917;
}
finally {
threadMonitoringController.exitService("_uCEPcLngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseCommentAttributes getFeedbackResponseCommentForResponseFromParticipant(String feedbackResponseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackResponseId", feedbackResponseId);
threadMonitoringController.enterService("_uCJH8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCLkMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert feedbackResponseId != null;
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368260500009817413282761422 = feedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant(feedbackResponseId);
threadMonitoringController.exitInternalAction("_uCLkMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368260500009817413282761422;
}
finally {
threadMonitoringController.exitService("_uCJH8LngEeyIw-dB1KCaVA");
}
}

public  FeedbackResponseCommentAttributes updateFeedbackResponseComment(FeedbackResponseCommentAttributes.UpdateOptions updateOptions)throws EntityDoesNotExistException, InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_uCPOkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCRDwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
FeedbackResponseCommentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826090049502355120971486 = feedbackResponseCommentsLogic.updateFeedbackResponseComment(updateOptions);
threadMonitoringController.exitInternalAction("_uCRDwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826090049502355120971486;
}
finally {
threadMonitoringController.exitService("_uCPOkLngEeyIw-dB1KCaVA");
}
}

public  void deleteFeedbackResponseComment(long commentId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentId", commentId);
threadMonitoringController.enterService("_uCUHELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCXKYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
feedbackResponseCommentsLogic.deleteFeedbackResponseComment(commentId);
threadMonitoringController.exitInternalAction("_uCXKYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uCUHELngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsClosedWithinThePastHour() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uCa0wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCdRALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826150044032309830162997 = feedbackSessionsLogic.getFeedbackSessionsClosedWithinThePastHour();
threadMonitoringController.exitInternalAction("_uCdRALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826150044032309830162997;
}
finally {
threadMonitoringController.exitService("_uCa0wLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsClosingWithinTimeLimit() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uCg7YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCjXoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682617008649726325327652 = feedbackSessionsLogic.getFeedbackSessionsClosingWithinTimeLimit();
threadMonitoringController.exitInternalAction("_uCjXoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682617008649726325327652;
}
finally {
threadMonitoringController.exitService("_uCg7YLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsOpeningWithinTimeLimit() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uCma8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCo3MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682620006450417900061718 = feedbackSessionsLogic.getFeedbackSessionsOpeningWithinTimeLimit();
threadMonitoringController.exitInternalAction("_uCo3MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682620006450417900061718;
}
finally {
threadMonitoringController.exitService("_uCma8LngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uCshkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uCuWwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826230045532045323266357 = feedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent();
threadMonitoringController.exitInternalAction("_uCuWwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826230045532045323266357;
}
finally {
threadMonitoringController.exitService("_uCshkLngEeyIw-dB1KCaVA");
}
}

public  List<FeedbackSessionAttributes> getFeedbackSessionsWhichNeedOpenEmailsToBeSent() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_uCxaELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uC0dYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<FeedbackSessionAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682626005407180580901617 = feedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent();
threadMonitoringController.exitInternalAction("_uC0dYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682626005407180580901617;
}
finally {
threadMonitoringController.exitService("_uCxaELngEeyIw-dB1KCaVA");
}
}

public  String getSectionForTeam(String courseId, String teamName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("teamName", teamName);
threadMonitoringController.enterService("_uC3gsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uC5V4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert teamName != null;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682629003620285521736121 = studentsLogic.getSectionForTeam(courseId, teamName);
threadMonitoringController.exitInternalAction("_uC5V4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682629003620285521736121;
}
finally {
threadMonitoringController.exitService("_uC3gsLngEeyIw-dB1KCaVA");
}
}

public  DataBundle persistDataBundle(DataBundle dataBundle)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("dataBundle", dataBundle);
threadMonitoringController.enterService("_uC8ZMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uDBRsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
DataBundle longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826320045213840528792026 = dataBundleLogic.persistDataBundle(dataBundle);
threadMonitoringController.exitInternalAction("_uDBRsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826320045213840528792026;
}
finally {
threadMonitoringController.exitService("_uC8ZMLngEeyIw-dB1KCaVA");
}
}

public  void removeDataBundle(DataBundle dataBundle) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("dataBundle", dataBundle);
threadMonitoringController.enterService("_uDImcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uDNe8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
dataBundleLogic.removeDataBundle(dataBundle);
threadMonitoringController.exitInternalAction("_uDNe8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uDImcLngEeyIw-dB1KCaVA");
}
}

public  void putDocuments(DataBundle dataBundle)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("dataBundle", dataBundle);
threadMonitoringController.enterService("_uDSXcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uDUzsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
dataBundleLogic.putDocuments(dataBundle);
threadMonitoringController.exitInternalAction("_uDUzsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uDSXcLngEeyIw-dB1KCaVA");
}
}

public  boolean isStudentsInSameTeam(String courseId, String student1Email, String student2Email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
monitoringServiceParameters.addValue("student1Email", student1Email);
monitoringServiceParameters.addValue("student2Email", student2Email);
threadMonitoringController.enterService("_uDYeELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uDaTQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
assert student1Email != null;
assert student2Email != null;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826400046669081615076946 = studentsLogic.isStudentsInSameTeam(courseId, student1Email, student2Email);
threadMonitoringController.exitInternalAction("_uDaTQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826400046669081615076946;
}
finally {
threadMonitoringController.exitService("_uDYeELngEeyIw-dB1KCaVA");
}
}

public  AccountRequestAttributes createAccountRequest(AccountRequestAttributes accountRequest)throws InvalidParametersException, EntityAlreadyExistsException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequest", accountRequest);
threadMonitoringController.enterService("_uDeksLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uDgZ4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert accountRequest != null;
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682643005095911118653942 = accountRequestsLogic.createAccountRequest(accountRequest);
threadMonitoringController.exitInternalAction("_uDgZ4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682643005095911118653942;
}
finally {
threadMonitoringController.exitService("_uDeksLngEeyIw-dB1KCaVA");
}
}

public  AccountRequestAttributes updateAccountRequest(AccountRequestAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_uDkrULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uDmggLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682646007354346971282564 = accountRequestsLogic.updateAccountRequest(updateOptions);
threadMonitoringController.exitInternalAction("_uDmggLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682646007354346971282564;
}
finally {
threadMonitoringController.exitService("_uDkrULngEeyIw-dB1KCaVA");
}
}

public  void deleteAccountRequest(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_uDqK4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uDsAELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
accountRequestsLogic.deleteAccountRequest(email, institute);
threadMonitoringController.exitInternalAction("_uDsAELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uDqK4LngEeyIw-dB1KCaVA");
}
}

public  AccountRequestAttributes getAccountRequestForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_uDvqcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uDyGsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826510039792465564122037 = accountRequestsLogic.getAccountRequestForRegistrationKey(registrationKey);
threadMonitoringController.exitInternalAction("_uDyGsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826510039792465564122037;
}
finally {
threadMonitoringController.exitService("_uDvqcLngEeyIw-dB1KCaVA");
}
}

public  AccountRequestAttributes getAccountRequest(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_uD2YILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uD4NULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert institute != null;
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826540012161756002789059 = accountRequestsLogic.getAccountRequest(email, institute);
threadMonitoringController.exitInternalAction("_uD4NULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136826540012161756002789059;
}
finally {
threadMonitoringController.exitService("_uD2YILngEeyIw-dB1KCaVA");
}
}

public  List<AccountRequestAttributes> searchAccountRequestsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_uD9F0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uD_iELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert queryString != null;
List<AccountRequestAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682657005641613229481733 = accountRequestsLogic.searchAccountRequestsInWholeSystem(queryString);
threadMonitoringController.exitInternalAction("_uD_iELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682657005641613229481733;
}
finally {
threadMonitoringController.exitService("_uD9F0LngEeyIw-dB1KCaVA");
}
}

public  void putAccountRequestDocument(AccountRequestAttributes accountRequest)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequest", accountRequest);
threadMonitoringController.enterService("_uEDMcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uEGPwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
accountRequestsLogic.putDocument(accountRequest);
threadMonitoringController.exitInternalAction("_uEGPwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uEDMcLngEeyIw-dB1KCaVA");
}
}

}
