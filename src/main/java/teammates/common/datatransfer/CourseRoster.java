package teammates.common.datatransfer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.util.Const;
public class CourseRoster {
private final Map<String, StudentAttributes> studentListByEmail = new  HashMap<>();

private final Map<String, InstructorAttributes> instructorListByEmail = new  HashMap<>();

private final Map<String, List<StudentAttributes>> teamToMembersTable;

public  CourseRoster(List<StudentAttributes> students, List<InstructorAttributes> instructors){
populateStudentListByEmail(students);
populateInstructorListByEmail(instructors);
teamToMembersTable = buildTeamToMembersTable(getStudents());
}
public  List<StudentAttributes> getStudents() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ahv80LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ahxK8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301849400844710527308924 = new  ArrayList<>(studentListByEmail.values());
threadMonitoringController.exitInternalAction("_ahxK8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301849400844710527308924;
}
finally {
threadMonitoringController.exitService("_ahv80LvVEeyr6avTgCRLkQ");
}
}

public  List<InstructorAttributes> getInstructors() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ahzAILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ah0OQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018503009509749989523973 = new  ArrayList<>(instructorListByEmail.values());
threadMonitoringController.exitInternalAction("_ah0OQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018503009509749989523973;
}
finally {
threadMonitoringController.exitService("_ahzAILvVEeyr6avTgCRLkQ");
}
}

public  Map<String, List<StudentAttributes>> getTeamToMembersTable() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ah2DcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ah2qgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<StudentAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130185120002170919555260964 = teamToMembersTable;
threadMonitoringController.exitInternalAction("_ah2qgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130185120002170919555260964;
}
finally {
threadMonitoringController.exitService("_ah2DcLvVEeyr6avTgCRLkQ");
}
}

public  boolean isStudentInCourse(String studentEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentEmail", studentEmail);
threadMonitoringController.enterService("_ah4fsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ah5GwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130185200015985253592713988 = studentListByEmail.containsKey(studentEmail);
threadMonitoringController.exitInternalAction("_ah5GwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130185200015985253592713988;
}
finally {
threadMonitoringController.exitService("_ah4fsLvVEeyr6avTgCRLkQ");
}
}

public  boolean isTeamInCourse(String teamName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("teamName", teamName);
threadMonitoringController.enterService("_ah678LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ah8KELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018529009190842386882375 = teamToMembersTable.containsKey(teamName);
threadMonitoringController.exitInternalAction("_ah8KELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018529009190842386882375;
}
finally {
threadMonitoringController.exitService("_ah678LvVEeyr6avTgCRLkQ");
}
}

public  boolean isStudentInTeam(String studentEmail, String targetTeamName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentEmail", studentEmail);
monitoringServiceParameters.addValue("targetTeamName", targetTeamName);
threadMonitoringController.enterService("_ah9_QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ah_NYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes student = studentListByEmail.get(studentEmail);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130185400041952759419218777 = student != null && student.getTeam().equals(targetTeamName);
threadMonitoringController.exitInternalAction("_ah_NYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130185400041952759419218777;
}
finally {
threadMonitoringController.exitService("_ah9_QLvVEeyr6avTgCRLkQ");
}
}

public  boolean isStudentsInSameTeam(String studentEmail1, String studentEmail2) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentEmail1", studentEmail1);
monitoringServiceParameters.addValue("studentEmail2", studentEmail2);
threadMonitoringController.enterService("_aiBCkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aiCQsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes student1 = studentListByEmail.get(studentEmail1);
StudentAttributes student2 = studentListByEmail.get(studentEmail2);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018547006001099514699871 = student1 != null && student2 != null && student1.getTeam() != null && student1.getTeam().equals(student2.getTeam());
threadMonitoringController.exitInternalAction("_aiCQsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018547006001099514699871;
}
finally {
threadMonitoringController.exitService("_aiBCkLvVEeyr6avTgCRLkQ");
}
}

public  StudentAttributes getStudentForEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_aiGiILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aiHJMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018556001360520047959406 = studentListByEmail.get(email);
threadMonitoringController.exitInternalAction("_aiHJMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018556001360520047959406;
}
finally {
threadMonitoringController.exitService("_aiGiILvVEeyr6avTgCRLkQ");
}
}

public  InstructorAttributes getInstructorForEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_aiI-YLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aiKMgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018564008692954905094291 = instructorListByEmail.get(email);
threadMonitoringController.exitInternalAction("_aiKMgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018564008692954905094291;
}
finally {
threadMonitoringController.exitService("_aiI-YLvVEeyr6avTgCRLkQ");
}
}

private  void populateStudentListByEmail(List<StudentAttributes> students) {
if (students == null)
{
return;
}
for (StudentAttributes s : students)
{
studentListByEmail.put(s.getEmail(), s);
}
}

private  void populateInstructorListByEmail(List<InstructorAttributes> instructors) {
if (instructors == null)
{
return;
}
for (InstructorAttributes i : instructors)
{
instructorListByEmail.put(i.getEmail(), i);
}
}

public static  Map<String, List<StudentAttributes>> buildTeamToMembersTable(List<StudentAttributes> students) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("students", students);
threadMonitoringController.enterService("_aiN24LvVEeyr6avTgCRLkQ", CourseRoster.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aiOd8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<StudentAttributes>> teamToMembersTable = new  HashMap<>();
for (StudentAttributes studentAttributes : students)
{
teamToMembersTable.computeIfAbsent(studentAttributes.getTeam(), key -> new  ArrayList<>()).add(studentAttributes);
}
Map<String, List<StudentAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018573009708818019667225 = teamToMembersTable;
threadMonitoringController.exitInternalAction("_aiOd8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018573009708818019667225;
}
finally {
threadMonitoringController.exitService("_aiN24LvVEeyr6avTgCRLkQ");
}
}

public  ParticipantInfo getInfoForIdentifier(String identifier) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("identifier", identifier);
threadMonitoringController.enterService("_aiRhQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aiSvYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String name = Const.USER_NOBODY_TEXT;
String teamName = Const.USER_NOBODY_TEXT;
String sectionName = Const.DEFAULT_SECTION;
boolean isStudent = getStudentForEmail(identifier) != null;
boolean isInstructor = getInstructorForEmail(identifier) != null;
boolean isTeam = getTeamToMembersTable().containsKey(identifier);
if (isStudent)
{
StudentAttributes student = getStudentForEmail(identifier);
name = student.getName();
teamName = student.getTeam();
sectionName = student.getSection();
}
else
if (isInstructor)
{
InstructorAttributes instructor = getInstructorForEmail(identifier);
name = instructor.getName();
teamName = Const.USER_TEAM_FOR_INSTRUCTOR;
sectionName = Const.DEFAULT_SECTION;
}
else
if (isTeam)
{
StudentAttributes teamMember = getTeamToMembersTable().get(identifier).iterator().next();
name = identifier;
teamName = identifier;
sectionName = teamMember.getSection();
}
ParticipantInfo longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130185840040647585498682237 = new  ParticipantInfo(name, teamName, sectionName);
threadMonitoringController.exitInternalAction("_aiSvYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130185840040647585498682237;
}
finally {
threadMonitoringController.exitService("_aiRhQLvVEeyr6avTgCRLkQ");
}
}

public static class ParticipantInfo {
private final String name;

private final String teamName;

private final String sectionName;

private  ParticipantInfo(String name, String teamName, String sectionName){
this.name = name;
this.teamName = teamName;
this.sectionName = sectionName;
}
public  String getName() {
return name;
}

public  String getTeamName() {
return teamName;
}

public  String getSectionName() {
return sectionName;
}

}
}
