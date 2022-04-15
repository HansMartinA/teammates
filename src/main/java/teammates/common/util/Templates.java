package teammates.common.util;

public final class Templates {
public static final String INSTRUCTOR_SAMPLE_DATA = FileHelper.readResourceFile("InstructorSampleData.json");

private  Templates(){
}
public static  String populateTemplate(String template, String  ...keyValuePairs) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("template", template);
monitoringServiceParameters.addValue("keyValuePairs", keyValuePairs);
threadMonitoringController.enterService("_b9HuoLvVEeyr6avTgCRLkQ", Templates.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b9Jj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert keyValuePairs.length % 2 == 0 : "The number of elements in keyValuePairs passed in must be even";
String populatedTemplate = template;
for (int i = 0 ; i < keyValuePairs.length ; i += 2)
{
populatedTemplate = populatedTemplate.replace(keyValuePairs[i], keyValuePairs[i + 1]);
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130233210026857968225811013 = populatedTemplate;
threadMonitoringController.exitInternalAction("_b9Jj0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130233210026857968225811013;
}
finally {
threadMonitoringController.exitService("_b9HuoLvVEeyr6avTgCRLkQ");
}
}

public static class EmailTemplates {
public static final String USER_COURSE_JOIN = FileHelper.readResourceFile("userEmailTemplate-courseJoin.html");

public static final String USER_COURSE_REGISTER = FileHelper.readResourceFile("userEmailTemplate-userRegisterForCourse.html");

public static final String FRAGMENT_STUDENT_COURSE_JOIN = FileHelper.readResourceFile("studentEmailFragment-courseJoin.html");

public static final String FRAGMENT_STUDENT_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET = FileHelper.readResourceFile("studentEmailFragment-googleIdReset.html");

public static final String FRAGMENT_STUDENT_COURSE_REJOIN_AFTER_REGKEY_RESET = FileHelper.readResourceFile("studentEmailFragment-registrationKeyReset.html");

public static final String FRAGMENT_INSTRUCTOR_COPY_PREAMBLE = FileHelper.readResourceFile("instructorEmailFragment-instructorCopyPreamble.html");

public static final String FRAGMENT_INSTRUCTOR_COURSE_JOIN = FileHelper.readResourceFile("instructorEmailFragment-courseJoin.html");

public static final String FRAGMENT_INSTRUCTOR_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET = FileHelper.readResourceFile("instructorEmailFragment-googleIdReset.html");

public static final String FRAGMENT_INSTRUCTOR_COURSE_REJOIN_AFTER_REGKEY_RESET = FileHelper.readResourceFile("instructorEmailFragment-registrationKeyReset.html");

public static final String USER_FEEDBACK_SESSION = FileHelper.readResourceFile("userEmailTemplate-feedbackSession.html");

public static final String USER_FEEDBACK_SESSION_PUBLISHED = FileHelper.readResourceFile("userEmailTemplate-feedbackSessionPublished.html");

public static final String FRAGMENT_SESSION_LINKS_RECOVERY_ACCESS_LINKS_BY_SESSION = FileHelper.readResourceFile("sessionLinksRecoveryEmailTemplateFragment-sessionAccessLinksBySession.html");

public static final String FRAGMENT_SESSION_LINKS_RECOVERY_ACCESS_LINKS_BY_COURSE = FileHelper.readResourceFile("sessionLinksRecoveryEmailTemplateFragment-sessionAccessLinksByCourse.html");

public static final String SESSION_LINKS_RECOVERY_ACCESS_LINKS = FileHelper.readResourceFile("sessionLinksRecoveryEmailTemplate-feedbackSessionAccessLinks.html");

public static final String SESSION_LINKS_RECOVERY_ACCESS_LINKS_NONE = FileHelper.readResourceFile("sessionLinksRecoveryEmailTemplate-feedbackSessionAccessLinksNone.html");

public static final String SESSION_LINKS_RECOVERY_EMAIL_NOT_FOUND = FileHelper.readResourceFile("sessionLinksRecoveryEmailTemplate-emailNotFound.html");

public static final String USER_FEEDBACK_SESSION_UNPUBLISHED = FileHelper.readResourceFile("userEmailTemplate-feedbackSessionUnpublished.html");

public static final String FRAGMENT_SINGLE_FEEDBACK_SESSION_LINKS = FileHelper.readResourceFile("userEmailTemplateFragment-feedbackSessionResendAllLinks.html");

public static final String USER_FEEDBACK_SESSION_RESEND_ALL_LINKS = FileHelper.readResourceFile("userEmailTemplate-feedbackSessionResendAllLinks.html");

public static final String USER_REGKEY_REGENERATION_RESEND_ALL_COURSE_LINKS = FileHelper.readResourceFile("userEmailTemplate-regenerateLinksResendAllCourseLinks.html");

public static final String SEVERE_ERROR_LOG_LINE = FileHelper.readResourceFile("severeErrorLogLine.html");

public static final String NEW_INSTRUCTOR_ACCOUNT_WELCOME = FileHelper.readResourceFile("newInstructorAccountWelcome.html");

public static final String FRAGMENT_SESSION_ADDITIONAL_CONTACT_INFORMATION = FileHelper.readResourceFile("userEmailFragment-sessionAdditionalContactInformationFragment.html");

public static final String OWNER_FEEDBACK_SESSION = FileHelper.readResourceFile("ownerEmailTemplate-feedbackSession.html");

public static final String FRAGMENT_OPENING_SOON_EDIT_DETAILS = FileHelper.readResourceFile("ownerEmailFragment-editDetails.html");

public static final String FRAGMENT_OPENING_SOON_JOIN_COURSE_BEFORE_EDIT_DETAILS = FileHelper.readResourceFile("ownerEmailFragment-joinCourseBeforeEditDetails.html");

public static final String FRAGMENT_CLOSED_VIEW_RESPONSES = FileHelper.readResourceFile("ownerEmailFragment-viewResponses.html");

}
}
