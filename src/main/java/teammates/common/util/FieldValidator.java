package teammates.common.util;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import teammates.common.datatransfer.FeedbackParticipantType;
public final class FieldValidator {
public static final String PERSON_NAME_FIELD_NAME = "person name";

public static final int PERSON_NAME_MAX_LENGTH = 100;

public static final String NATIONALITY_FIELD_NAME = "nationality";

public static final String COURSE_NAME_FIELD_NAME = "course name";

public static final int COURSE_NAME_MAX_LENGTH = 80;

public static final String FEEDBACK_SESSION_NAME_FIELD_NAME = "feedback session name";

public static final int FEEDBACK_SESSION_NAME_MAX_LENGTH = 64;

public static final String TEAM_NAME_FIELD_NAME = "team name";

public static final int TEAM_NAME_MAX_LENGTH = 60;

public static final String SECTION_NAME_FIELD_NAME = "section name";

public static final int SECTION_NAME_MAX_LENGTH = 60;

public static final String INSTITUTE_NAME_FIELD_NAME = "institute name";

public static final int INSTITUTE_NAME_MAX_LENGTH = 64;

public static final String EMAIL_FIELD_NAME = "email";

public static final int EMAIL_MAX_LENGTH = 254;

public static final String STUDENT_ROLE_COMMENTS_FIELD_NAME = "comments about a student enrolled in a course";

public static final int STUDENT_ROLE_COMMENTS_MAX_LENGTH = 500;

public static final String COURSE_ID_FIELD_NAME = "course ID";

public static final int COURSE_ID_MAX_LENGTH = 64;

public static final String SESSION_START_TIME_FIELD_NAME = "start time";

public static final String SESSION_END_TIME_FIELD_NAME = "end time";

public static final String TIME_ZONE_FIELD_NAME = "time zone";

public static final String GOOGLE_ID_FIELD_NAME = "Google ID";

public static final int GOOGLE_ID_MAX_LENGTH = 254;

public static final String ROLE_FIELD_NAME = "access-level";

public static final List<String> ROLE_ACCEPTED_VALUES = Collections.unmodifiableList(Arrays.asList(Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER, Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_MANAGER, Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_OBSERVER, Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_TUTOR, Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_CUSTOM));

public static final String GIVER_TYPE_NAME = "feedback giver";

public static final String RECIPIENT_TYPE_NAME = "feedback recipient";

public static final String VIEWER_TYPE_NAME = "feedback viewer";

public static final String REASON_TOO_LONG = "is too long";

public static final String REASON_INCORRECT_FORMAT = "is not in the correct format";

public static final String REASON_CONTAINS_INVALID_CHAR = "contains invalid characters";

public static final String REASON_START_WITH_NON_ALPHANUMERIC_CHAR = "starts with a non-alphanumeric character";

public static final String REASON_UNAVAILABLE_AS_CHOICE = "is not available as a choice";

public static final String EMPTY_STRING_ERROR_INFO = "The field '${fieldName}' is empty.";

public static final String ERROR_INFO = "\"${userInput}\" is not acceptable to TEAMMATES as a/an ${fieldName} because it ${reason}.";

public static final String HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_POSSIBLY_EMPTY = "The value of a/an ${fieldName} should be no longer than ${maxLength} characters.";

public static final String HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_NON_EMPTY = HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_POSSIBLY_EMPTY + " It should not be empty.";

public static final String HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_NON_EMPTY_NO_SPACES = "It cannot be longer than ${maxLength} characters, cannot be empty and cannot contain spaces.";

public static final String HINT_FOR_CORRECT_FORMAT_FOR_INVALID_NAME = "A/An ${fieldName} must start with an alphanumeric character, and cannot contain any vertical bar " + "(|) or percent sign (%).";

public static final String SIZE_CAPPED_NON_EMPTY_STRING_ERROR_MESSAGE = ERROR_INFO + " " + HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_NON_EMPTY;

public static final String SIZE_CAPPED_NON_EMPTY_STRING_ERROR_MESSAGE_EMPTY_STRING = EMPTY_STRING_ERROR_INFO + " " + HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_NON_EMPTY;

public static final String SIZE_CAPPED_POSSIBLY_EMPTY_STRING_ERROR_MESSAGE = ERROR_INFO + " " + HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_POSSIBLY_EMPTY;

public static final String SIZE_CAPPED_NON_EMPTY_STRING_ERROR_MESSAGE_EMPTY_STRING_FOR_SESSION_NAME = "The field '${fieldName}' should not be empty." + " " + "The value of '${fieldName}' field should be no longer than ${maxLength} characters.";

public static final String INVALID_NAME_ERROR_MESSAGE = ERROR_INFO + " " + HINT_FOR_CORRECT_FORMAT_FOR_INVALID_NAME;

public static final String TEAM_NAME_IS_VALID_EMAIL_ERROR_MESSAGE = "The field " + TEAM_NAME_FIELD_NAME + " is not acceptable to TEAMMATES as the suggested value for " + TEAM_NAME_FIELD_NAME + " can be mis-interpreted as an email.";

public static final String WHITESPACE_ONLY_OR_EXTRA_WHITESPACE_ERROR_MESSAGE = "The provided ${fieldName} is not acceptable to TEAMMATES as it contains only whitespace " + "or contains extra spaces at the beginning or at the end of the text.";

public static final String NON_HTML_FIELD_ERROR_MESSAGE = "The provided ${fieldName} is not acceptable to TEAMMATES " + "as it cannot contain the following special html characters" + " in brackets: (< > \" / ' &)";

public static final String NON_NULL_FIELD_ERROR_MESSAGE = "The provided ${fieldName} is not acceptable to TEAMMATES as it cannot be empty.";

public static final String HINT_FOR_CORRECT_EMAIL = "An email address contains some text followed by one '@' sign followed by some more text, and should end " + "with a top level domain address like .com. " + HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_NON_EMPTY_NO_SPACES;

public static final String EMAIL_ERROR_MESSAGE = ERROR_INFO + " " + HINT_FOR_CORRECT_EMAIL;

public static final String EMAIL_ERROR_MESSAGE_EMPTY_STRING = EMPTY_STRING_ERROR_INFO + " " + HINT_FOR_CORRECT_EMAIL;

public static final String HINT_FOR_CORRECT_COURSE_ID = "A course ID can contain letters, numbers, fullstops, hyphens, underscores, and dollar signs. " + HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_NON_EMPTY_NO_SPACES;

public static final String COURSE_ID_ERROR_MESSAGE = ERROR_INFO + " " + HINT_FOR_CORRECT_COURSE_ID;

public static final String COURSE_ID_ERROR_MESSAGE_EMPTY_STRING = EMPTY_STRING_ERROR_INFO + " " + HINT_FOR_CORRECT_COURSE_ID;

public static final String HINT_FOR_CORRECT_FORMAT_OF_GOOGLE_ID = "A Google ID must be a valid id already registered with Google. " + HINT_FOR_CORRECT_FORMAT_FOR_SIZE_CAPPED_NON_EMPTY_NO_SPACES;

public static final String GOOGLE_ID_ERROR_MESSAGE = ERROR_INFO + " " + HINT_FOR_CORRECT_FORMAT_OF_GOOGLE_ID;

public static final String GOOGLE_ID_ERROR_MESSAGE_EMPTY_STRING = EMPTY_STRING_ERROR_INFO + " " + HINT_FOR_CORRECT_FORMAT_OF_GOOGLE_ID;

public static final String HINT_FOR_CORRECT_TIME_ZONE = "The value must be one of the values from the time zone dropdown selector.";

public static final String TIME_ZONE_ERROR_MESSAGE = ERROR_INFO + " " + HINT_FOR_CORRECT_TIME_ZONE;

public static final String HINT_FOR_CORRECT_GRACE_PERIOD = "The value must be one of the options in the grace period dropdown selector.";

public static final String GRACE_PERIOD_NEGATIVE_ERROR_MESSAGE = "Grace period should not be negative." + " " + HINT_FOR_CORRECT_GRACE_PERIOD;

public static final String HINT_FOR_CORRECT_NATIONALITY = "The value must be one of the values from the nationality dropdown selector.";

public static final String NATIONALITY_ERROR_MESSAGE = "\"%s\" is not an accepted " + NATIONALITY_FIELD_NAME + " to TEAMMATES. " + HINT_FOR_CORRECT_NATIONALITY;

public static final String ROLE_ERROR_MESSAGE = "\"%s\" is not an accepted " + ROLE_FIELD_NAME + " to TEAMMATES. ";

public static final String SESSION_VISIBLE_TIME_FIELD_NAME = "time when the session will be visible";

public static final String RESULTS_VISIBLE_TIME_FIELD_NAME = "time when the results will be visible";

public static final String TIME_FRAME_ERROR_MESSAGE = "The %s for this feedback session cannot be earlier than the %s.";

public static final String PARTICIPANT_TYPE_ERROR_MESSAGE = "%s is not a valid %s.";

public static final String PARTICIPANT_TYPE_TEAM_ERROR_MESSAGE = "The feedback recipients cannot be \"%s\" when the feedback giver is \"%s\". " + "Did you mean to use \"Self\" instead?";

public static final String REGEX_NAME = "^[\\p{IsL}\\p{IsN}][^|%]*+$";

public static final String REGEX_COURSE_ID = "[a-zA-Z0-9_.$-]+";

public static final String REGEX_EMAIL = "^[\\w+-][\\w+!#$%&'*/=?^_`{}~-]*+(\\.[\\w+!#$%&'*/=?^_`{}~-]+)*+" + "@([A-Za-z0-9-]+\\.)+[A-Za-z]+$";

public static final String REGEX_GOOGLE_ID_NON_EMAIL = "[a-zA-Z0-9_.-]+";

private  FieldValidator(){
}
public static  String getInvalidityInfoForEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_Z60fsbvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z61GwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
if (email.isEmpty())
{
return getPopulatedEmptyStringErrorMessage(EMAIL_ERROR_MESSAGE_EMPTY_STRING, EMAIL_FIELD_NAME, EMAIL_MAX_LENGTH);
}
else
if (isUntrimmed(email))
{
return WHITESPACE_ONLY_OR_EXTRA_WHITESPACE_ERROR_MESSAGE.replace("${fieldName}", EMAIL_FIELD_NAME);
}
else
if (email.length() > EMAIL_MAX_LENGTH)
{
return getPopulatedErrorMessage(EMAIL_ERROR_MESSAGE, email, EMAIL_FIELD_NAME, REASON_TOO_LONG, EMAIL_MAX_LENGTH);
}
else
if (!isValidEmailAddress(email))
{
return getPopulatedErrorMessage(EMAIL_ERROR_MESSAGE, email, EMAIL_FIELD_NAME, REASON_INCORRECT_FORMAT, EMAIL_MAX_LENGTH);
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149930045850817298686386 = "";
threadMonitoringController.exitInternalAction("_Z61GwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149930045850817298686386;
}
finally {
threadMonitoringController.exitService("_Z60fsbvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForGracePeriod(Duration gracePeriod) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("gracePeriod", gracePeriod);
threadMonitoringController.enterService("_aOx9gLvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aOzLoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (gracePeriod.isNegative())
{
return GRACE_PERIOD_NEGATIVE_ERROR_MESSAGE;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301723400696695782088181 = "";
threadMonitoringController.exitInternalAction("_aOzLoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301723400696695782088181;
}
finally {
threadMonitoringController.exitService("_aOx9gLvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_Z6yDcbvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z6yqgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
assert !googleId.toLowerCase().endsWith("@gmail.com") : "\"" + googleId + "\"" + "is not expected to be a gmail address.";
threadMonitoringController.exitInternalAction("_Z6yqgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z6yqhbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean isValidFullEmail = isValidEmailAddress(googleId);
threadMonitoringController.exitInternalAction("_Z6yqhbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z6zRkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean isValidEmailWithoutDomain = StringHelper.isMatching(googleId, REGEX_GOOGLE_ID_NON_EMAIL);
if (googleId.isEmpty())
{
return getPopulatedEmptyStringErrorMessage(GOOGLE_ID_ERROR_MESSAGE_EMPTY_STRING, GOOGLE_ID_FIELD_NAME, GOOGLE_ID_MAX_LENGTH);
}
else
if (isUntrimmed(googleId))
{
return WHITESPACE_ONLY_OR_EXTRA_WHITESPACE_ERROR_MESSAGE.replace("${fieldName}", GOOGLE_ID_FIELD_NAME);
}
else
if (googleId.length() > GOOGLE_ID_MAX_LENGTH)
{
return getPopulatedErrorMessage(GOOGLE_ID_ERROR_MESSAGE, googleId, GOOGLE_ID_FIELD_NAME, REASON_TOO_LONG, GOOGLE_ID_MAX_LENGTH);
}
else
if (!(isValidFullEmail || isValidEmailWithoutDomain))
{
return getPopulatedErrorMessage(GOOGLE_ID_ERROR_MESSAGE, googleId, GOOGLE_ID_FIELD_NAME, REASON_INCORRECT_FORMAT, GOOGLE_ID_MAX_LENGTH);
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149850023655120716149347 = "";
threadMonitoringController.exitInternalAction("_Z6zRkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149850023655120716149347;
}
finally {
threadMonitoringController.exitService("_Z6yDcbvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForCourseId(String courseId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseId", courseId);
threadMonitoringController.enterService("_Z-vWYbvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-v9cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert courseId != null;
if (courseId.isEmpty())
{
return getPopulatedEmptyStringErrorMessage(COURSE_ID_ERROR_MESSAGE_EMPTY_STRING, COURSE_ID_FIELD_NAME, COURSE_ID_MAX_LENGTH);
}
if (isUntrimmed(courseId))
{
return WHITESPACE_ONLY_OR_EXTRA_WHITESPACE_ERROR_MESSAGE.replace("${fieldName}", COURSE_NAME_FIELD_NAME);
}
if (courseId.length() > COURSE_ID_MAX_LENGTH)
{
return getPopulatedErrorMessage(COURSE_ID_ERROR_MESSAGE, courseId, COURSE_ID_FIELD_NAME, REASON_TOO_LONG, COURSE_ID_MAX_LENGTH);
}
if (!StringHelper.isMatching(courseId, REGEX_COURSE_ID))
{
return getPopulatedErrorMessage(COURSE_ID_ERROR_MESSAGE, courseId, COURSE_ID_FIELD_NAME, REASON_INCORRECT_FORMAT, COURSE_ID_MAX_LENGTH);
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130154030045918446515649625 = "";
threadMonitoringController.exitInternalAction("_Z-v9cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130154030045918446515649625;
}
finally {
threadMonitoringController.exitService("_Z-vWYbvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForSectionName(String sectionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sectionName", sectionName);
threadMonitoringController.enterService("_abrxELvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_abx3tLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018157003281799914469262 = getValidityInfoForAllowedName(SECTION_NAME_FIELD_NAME, SECTION_NAME_MAX_LENGTH, sectionName);
threadMonitoringController.exitInternalAction("_abx3tLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018157003281799914469262;
}
finally {
threadMonitoringController.exitService("_abrxELvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForTeamName(String teamName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("teamName", teamName);
threadMonitoringController.enterService("_abinILvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ablDZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean isValidEmail = isValidEmailAddress(teamName);
threadMonitoringController.exitInternalAction("_ablDZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ablDZbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (isValidEmail)
{
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018149009976843046150776 = TEAM_NAME_IS_VALID_EMAIL_ERROR_MESSAGE;
threadMonitoringController.exitInternalAction("_ablDZbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018149009976843046150776;
}
threadMonitoringController.enterInternalAction("_abp75LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130181490011332464396809161 = getValidityInfoForAllowedName(TEAM_NAME_FIELD_NAME, TEAM_NAME_MAX_LENGTH, teamName);
threadMonitoringController.exitInternalAction("_abp75LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130181490011332464396809161;
}
finally {
threadMonitoringController.exitService("_abinILvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForStudentRoleComments(String studentRoleComments) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentRoleComments", studentRoleComments);
threadMonitoringController.enterService("_abzs4LvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ab3XRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130181650042016750579162965 = getValidityInfoForSizeCappedPossiblyEmptyString(STUDENT_ROLE_COMMENTS_FIELD_NAME, STUDENT_ROLE_COMMENTS_MAX_LENGTH, studentRoleComments);
threadMonitoringController.exitInternalAction("_ab3XRLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130181650042016750579162965;
}
finally {
threadMonitoringController.exitService("_abzs4LvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForFeedbackSessionName(String feedbackSessionName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("feedbackSessionName", feedbackSessionName);
threadMonitoringController.enterService("_aCOIMbvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aCRLhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String errorsFromAllowedNameValidation = getValidityInfoForAllowedName(FEEDBACK_SESSION_NAME_FIELD_NAME, FEEDBACK_SESSION_NAME_MAX_LENGTH, feedbackSessionName);
threadMonitoringController.exitInternalAction("_aCRLhLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aCRLhbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!errorsFromAllowedNameValidation.isEmpty())
{
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301584600005845342136699516 = errorsFromAllowedNameValidation;
threadMonitoringController.exitInternalAction("_aCRLhbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301584600005845342136699516;
}
threadMonitoringController.enterInternalAction("_aCTAubvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015846005754502100577387 = getValidityInfoForNonHtmlField(FEEDBACK_SESSION_NAME_FIELD_NAME, feedbackSessionName);
threadMonitoringController.exitInternalAction("_aCTAubvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015846005754502100577387;
}
finally {
threadMonitoringController.exitService("_aCOIMbvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForCourseName(String courseName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("courseName", courseName);
threadMonitoringController.enterService("_Z-yZsLvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z-019LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015409007827558181831882 = getValidityInfoForAllowedName(COURSE_NAME_FIELD_NAME, COURSE_NAME_MAX_LENGTH, courseName);
threadMonitoringController.exitInternalAction("_Z-019LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015409007827558181831882;
}
finally {
threadMonitoringController.exitService("_Z-yZsLvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForNationality(String nationality) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("nationality", nationality);
threadMonitoringController.enterService("_afZzcLvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_afbBkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert nationality != null;
if (!NationalityHelper.getNationalities().contains(nationality))
{
return String.format(NATIONALITY_ERROR_MESSAGE, nationality);
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018408005087017257851468 = "";
threadMonitoringController.exitInternalAction("_afbBkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018408005087017257851468;
}
finally {
threadMonitoringController.exitService("_afZzcLvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForInstituteName(String instituteName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instituteName", instituteName);
threadMonitoringController.enterService("_Z62U4bvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z64KFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149990034910877214671987 = getValidityInfoForAllowedName(INSTITUTE_NAME_FIELD_NAME, INSTITUTE_NAME_MAX_LENGTH, instituteName);
threadMonitoringController.exitInternalAction("_Z64KFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149990034910877214671987;
}
finally {
threadMonitoringController.exitService("_Z62U4bvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForPersonName(String personName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("personName", personName);
threadMonitoringController.enterService("_Z6vnMbvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z6xcZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014970006490496266810666 = getValidityInfoForAllowedName(PERSON_NAME_FIELD_NAME, PERSON_NAME_MAX_LENGTH, personName);
threadMonitoringController.exitInternalAction("_Z6xcZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014970006490496266810666;
}
finally {
threadMonitoringController.exitService("_Z6vnMbvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForTimeZone(String timeZoneValue) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("timeZoneValue", timeZoneValue);
threadMonitoringController.enterService("_bmDScLvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bmEgkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert timeZoneValue != null;
if (!ZoneId.getAvailableZoneIds().contains(timeZoneValue))
{
return getPopulatedErrorMessage(TIME_ZONE_ERROR_MESSAGE, timeZoneValue, TIME_ZONE_FIELD_NAME, REASON_UNAVAILABLE_AS_CHOICE);
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130228320039333417795003756 = "";
threadMonitoringController.exitInternalAction("_bmEgkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130228320039333417795003756;
}
finally {
threadMonitoringController.exitService("_bmDScLvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForRole(String role) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("role", role);
threadMonitoringController.enterService("_aWGGcLvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aWGtgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert role != null;
if (!ROLE_ACCEPTED_VALUES.contains(role))
{
return String.format(ROLE_ERROR_MESSAGE, role);
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017759003514097828123919 = "";
threadMonitoringController.exitInternalAction("_aWGtgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017759003514097828123919;
}
finally {
threadMonitoringController.exitService("_aWGGcLvVEeyr6avTgCRLkQ");
}
}

static  String getValidityInfoForAllowedName(String fieldName, int maxLength, String value) {
assert value != null : "Non-null value expected for " + fieldName;
if (value.isEmpty())
{
if (FEEDBACK_SESSION_NAME_FIELD_NAME.equals(fieldName))
{
return getPopulatedEmptyStringErrorMessage(SIZE_CAPPED_NON_EMPTY_STRING_ERROR_MESSAGE_EMPTY_STRING_FOR_SESSION_NAME, fieldName, maxLength);
}
else
{
return getPopulatedEmptyStringErrorMessage(SIZE_CAPPED_NON_EMPTY_STRING_ERROR_MESSAGE_EMPTY_STRING, fieldName, maxLength);
}
}
if (isUntrimmed(value))
{
return WHITESPACE_ONLY_OR_EXTRA_WHITESPACE_ERROR_MESSAGE.replace("${fieldName}", fieldName);
}
if (value.length() > maxLength)
{
return getPopulatedErrorMessage(SIZE_CAPPED_NON_EMPTY_STRING_ERROR_MESSAGE, value, fieldName, REASON_TOO_LONG, maxLength);
}
if (!Character.isLetterOrDigit(value.codePointAt(0)))
{
boolean hasStartingBrace = value.charAt(0) == '{' && value.contains("}");
if (!hasStartingBrace)
{
return getPopulatedErrorMessage(INVALID_NAME_ERROR_MESSAGE, value, fieldName, REASON_START_WITH_NON_ALPHANUMERIC_CHAR);
}
if (!StringHelper.isMatching(value.substring(1), REGEX_NAME))
{
return getPopulatedErrorMessage(INVALID_NAME_ERROR_MESSAGE, value, fieldName, REASON_CONTAINS_INVALID_CHAR);
}
return "";
}
if (!StringHelper.isMatching(value, REGEX_NAME))
{
return getPopulatedErrorMessage(INVALID_NAME_ERROR_MESSAGE, value, fieldName, REASON_CONTAINS_INVALID_CHAR);
}
return "";
}

static  String getValidityInfoForSizeCappedPossiblyEmptyString(String fieldName, int maxLength, String value) {
assert value != null : "Non-null value expected for " + fieldName;
if (isUntrimmed(value))
{
return WHITESPACE_ONLY_OR_EXTRA_WHITESPACE_ERROR_MESSAGE.replace("${fieldName}", fieldName);
}
if (value.length() > maxLength)
{
return getPopulatedErrorMessage(SIZE_CAPPED_POSSIBLY_EMPTY_STRING_ERROR_MESSAGE, value, fieldName, REASON_TOO_LONG, maxLength);
}
return "";
}

public static  String getInvalidityInfoForTimeForSessionStartAndEnd(Instant sessionStart, Instant sessionEnd) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sessionStart", sessionStart);
monitoringServiceParameters.addValue("sessionEnd", sessionEnd);
threadMonitoringController.enterService("_aO2O8LvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aO4EJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017241005486215394195336 = getInvalidityInfoForFirstTimeIsBeforeSecondTime(sessionStart, sessionEnd, SESSION_START_TIME_FIELD_NAME, SESSION_END_TIME_FIELD_NAME);
threadMonitoringController.exitInternalAction("_aO4EJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017241005486215394195336;
}
finally {
threadMonitoringController.exitService("_aO2O8LvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForTimeForVisibilityStartAndSessionStart(Instant visibilityStart, Instant sessionStart) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("visibilityStart", visibilityStart);
monitoringServiceParameters.addValue("sessionStart", sessionStart);
threadMonitoringController.enterService("_aO55ULvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aO7HdLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017251002072427932499813 = getInvalidityInfoForFirstTimeIsBeforeSecondTime(visibilityStart, sessionStart, SESSION_VISIBLE_TIME_FIELD_NAME, SESSION_START_TIME_FIELD_NAME);
threadMonitoringController.exitInternalAction("_aO7HdLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017251002072427932499813;
}
finally {
threadMonitoringController.exitService("_aO55ULvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForTimeForVisibilityStartAndResultsPublish(Instant visibilityStart, Instant resultsPublish) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("visibilityStart", visibilityStart);
monitoringServiceParameters.addValue("resultsPublish", resultsPublish);
threadMonitoringController.enterService("_aO-KwLvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aO__9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017263006060867742376996 = getInvalidityInfoForFirstTimeIsBeforeSecondTime(visibilityStart, resultsPublish, SESSION_VISIBLE_TIME_FIELD_NAME, RESULTS_VISIBLE_TIME_FIELD_NAME);
threadMonitoringController.exitInternalAction("_aO__9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017263006060867742376996;
}
finally {
threadMonitoringController.exitService("_aO-KwLvVEeyr6avTgCRLkQ");
}
}

private static  String getInvalidityInfoForFirstTimeIsBeforeSecondTime(Instant earlierTime, Instant laterTime, String earlierTimeFieldName, String laterTimeFieldName) {
assert earlierTime != null;
assert laterTime != null;
if (TimeHelper.isSpecialTime(earlierTime) || TimeHelper.isSpecialTime(laterTime))
{
return "";
}
if (laterTime.isBefore(earlierTime))
{
return String.format(TIME_FRAME_ERROR_MESSAGE, laterTimeFieldName, earlierTimeFieldName);
}
return "";
}

public static  List<String> getValidityInfoForFeedbackParticipantType(FeedbackParticipantType giverType, FeedbackParticipantType recipientType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("giverType", giverType);
monitoringServiceParameters.addValue("recipientType", recipientType);
threadMonitoringController.enterService("_aCU14bvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aCVc8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert giverType != null;
assert recipientType != null;
List<String> errors = new  LinkedList<>();
if (!giverType.isValidGiver())
{
errors.add(String.format(PARTICIPANT_TYPE_ERROR_MESSAGE, giverType.toString(), GIVER_TYPE_NAME));
}
if (!recipientType.isValidRecipient())
{
errors.add(String.format(PARTICIPANT_TYPE_ERROR_MESSAGE, recipientType.toString(), RECIPIENT_TYPE_NAME));
}
if (giverType == FeedbackParticipantType.TEAMS && (recipientType == FeedbackParticipantType.OWN_TEAM || recipientType == FeedbackParticipantType.OWN_TEAM_MEMBERS))
{
String displayRecipientName = recipientType == FeedbackParticipantType.OWN_TEAM ? "Giver's team" : "Giver's team members";
errors.add(String.format(PARTICIPANT_TYPE_TEAM_ERROR_MESSAGE, displayRecipientName, "Teams in this course"));
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130158550024233008867521388 = errors;
threadMonitoringController.exitInternalAction("_aCVc8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130158550024233008867521388;
}
finally {
threadMonitoringController.exitService("_aCU14bvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForCommentGiverType(FeedbackParticipantType commentGiverType) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("commentGiverType", commentGiverType);
threadMonitoringController.enterService("_aJyv0LvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aJzW4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert commentGiverType != null;
if (!commentGiverType.equals(FeedbackParticipantType.STUDENTS) && !commentGiverType.equals(FeedbackParticipantType.INSTRUCTORS) && !commentGiverType.equals(FeedbackParticipantType.TEAMS))
{
return "Invalid comment giver type: " + commentGiverType;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016573007817546262912494 = "";
threadMonitoringController.exitInternalAction("_aJzW4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013016573007817546262912494;
}
finally {
threadMonitoringController.exitService("_aJyv0LvVEeyr6avTgCRLkQ");
}
}

public static  String getInvalidityInfoForVisibilityOfFeedbackParticipantComments(boolean isCommentFromFeedbackParticipant, boolean isVisibilityFollowingFeedbackQuestion) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("isCommentFromFeedbackParticipant", isCommentFromFeedbackParticipant);
monitoringServiceParameters.addValue("isVisibilityFollowingFeedbackQuestion", isVisibilityFollowingFeedbackQuestion);
threadMonitoringController.enterService("_aJ0lALvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aJ0lAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (isCommentFromFeedbackParticipant && !isVisibilityFollowingFeedbackQuestion)
{
return "Comment by feedback participant not following visibility setting of the question.";
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165830007827638980331353 = "";
threadMonitoringController.exitInternalAction("_aJ0lAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130165830007827638980331353;
}
finally {
threadMonitoringController.exitService("_aJ0lALvVEeyr6avTgCRLkQ");
}
}

public static  List<String> getValidityInfoForFeedbackResponseVisibility(List<FeedbackParticipantType> showResponsesTo, List<FeedbackParticipantType> showGiverNameTo, List<FeedbackParticipantType> showRecipientNameTo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("showResponsesTo", showResponsesTo);
monitoringServiceParameters.addValue("showGiverNameTo", showGiverNameTo);
monitoringServiceParameters.addValue("showRecipientNameTo", showRecipientNameTo);
threadMonitoringController.enterService("_aCXSIbvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aCX5MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert showResponsesTo != null;
assert showGiverNameTo != null;
assert showRecipientNameTo != null;
assert !showResponsesTo.contains(null);
assert !showGiverNameTo.contains(null);
assert !showRecipientNameTo.contains(null);
List<String> errors = new  LinkedList<>();
for (FeedbackParticipantType type : showGiverNameTo)
{
if (!type.isValidViewer())
{
errors.add(String.format(PARTICIPANT_TYPE_ERROR_MESSAGE, type.toString(), VIEWER_TYPE_NAME));
}
if (!showResponsesTo.contains(type))
{
errors.add("Trying to show giver name to " + type.toString() + " without showing response first.");
}
}
for (FeedbackParticipantType type : showRecipientNameTo)
{
if (!type.isValidViewer())
{
errors.add(String.format(PARTICIPANT_TYPE_ERROR_MESSAGE, type.toString(), VIEWER_TYPE_NAME));
}
if (!showResponsesTo.contains(type))
{
errors.add("Trying to show recipient name to " + type.toString() + " without showing response first.");
}
}
for (FeedbackParticipantType type : showResponsesTo)
{
if (!type.isValidViewer())
{
errors.add(String.format(PARTICIPANT_TYPE_ERROR_MESSAGE, type.toString(), VIEWER_TYPE_NAME));
}
}
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301586200027002182788999574 = errors;
threadMonitoringController.exitInternalAction("_aCX5MLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301586200027002182788999574;
}
finally {
threadMonitoringController.exitService("_aCXSIbvVEeyr6avTgCRLkQ");
}
}

static  String getValidityInfoForNonHtmlField(String fieldName, String value) {
String sanitizedValue = SanitizationHelper.sanitizeForHtml(value);
return value.equals(sanitizedValue) ? "" : NON_HTML_FIELD_ERROR_MESSAGE.replace("${fieldName}", fieldName);
}

public static  String getValidityInfoForNonNullField(String fieldName, Object value) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("fieldName", fieldName);
monitoringServiceParameters.addValue("value", value);
threadMonitoringController.enterService("_aOrP0LvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aOsd8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017227009715614186145669 = value == null ? NON_NULL_FIELD_ERROR_MESSAGE.replace("${fieldName}", fieldName) : "";
threadMonitoringController.exitInternalAction("_aOsd8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013017227009715614186145669;
}
finally {
threadMonitoringController.exitService("_aOrP0LvVEeyr6avTgCRLkQ");
}
}

private static  boolean isUntrimmed(String value) {
return value.length() != value.trim().length();
}

private static  boolean isValidEmailAddress(String email) {
return StringHelper.isMatching(email, REGEX_EMAIL);
}

public static <T>  boolean areElementsUnique(Collection<T> elements) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("elements", elements);
threadMonitoringController.enterService("_a4C88LvVEeyr6avTgCRLkQ", FieldValidator.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_a4ELELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Set<T> uniqueElements = new  HashSet<>(elements);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020233007111344246933705 = uniqueElements.size() == elements.size();
threadMonitoringController.exitInternalAction("_a4ELELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013020233007111344246933705;
}
finally {
threadMonitoringController.exitService("_a4C88LvVEeyr6avTgCRLkQ");
}
}

private static  String getPopulatedErrorMessage(String messageTemplate, String userInput, String fieldName, String errorReason, int maxLength) {
return getPopulatedErrorMessage(messageTemplate, userInput, fieldName, errorReason).replace("${maxLength}", String.valueOf(maxLength));
}

private static  String getPopulatedErrorMessage(String messageTemplate, String userInput, String fieldName, String errorReason) {
return messageTemplate.replace("${userInput}", userInput).replace("${fieldName}", fieldName).replace("${reason}", errorReason);
}

private static  String getPopulatedEmptyStringErrorMessage(String messageTemplate, String fieldName, int maxLength) {
return messageTemplate.replace("${fieldName}", fieldName).replace("${maxLength}", String.valueOf(maxLength));
}

}
