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
threadMonitoringController.enterService("_sFw60LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sFyI8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<StudentAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804230012528898964774748 = new  ArrayList<>(studentListByEmail.values());
threadMonitoringController.exitInternalAction("_sFyI8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804230012528898964774748;
}
finally {
threadMonitoringController.exitService("_sFw60LngEeyIw-dB1KCaVA");
}
}

public  List<InstructorAttributes> getInstructors() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sFzXELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sF0lMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<InstructorAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804250017599858179069494 = new  ArrayList<>(instructorListByEmail.values());
threadMonitoringController.exitInternalAction("_sF0lMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804250017599858179069494;
}
finally {
threadMonitoringController.exitService("_sFzXELngEeyIw-dB1KCaVA");
}
}

public  Map<String, List<StudentAttributes>> getTeamToMembersTable() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sF1zULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sF2aYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<StudentAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680429001056629909010941 = teamToMembersTable;
threadMonitoringController.exitInternalAction("_sF2aYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680429001056629909010941;
}
finally {
threadMonitoringController.exitService("_sF1zULngEeyIw-dB1KCaVA");
}
}

public  boolean isStudentInCourse(String studentEmail) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentEmail", studentEmail);
threadMonitoringController.enterService("_sF4PkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sF6EwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804320026015436599131014 = studentListByEmail.containsKey(studentEmail);
threadMonitoringController.exitInternalAction("_sF6EwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804320026015436599131014;
}
finally {
threadMonitoringController.exitService("_sF4PkLngEeyIw-dB1KCaVA");
}
}

public  boolean isTeamInCourse(String teamName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("teamName", teamName);
threadMonitoringController.enterService("_sF7S4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sF8hALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368043400016826829706369728 = teamToMembersTable.containsKey(teamName);
threadMonitoringController.exitInternalAction("_sF8hALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368043400016826829706369728;
}
finally {
threadMonitoringController.exitService("_sF7S4LngEeyIw-dB1KCaVA");
}
}

public  boolean isStudentInTeam(String studentEmail, String targetTeamName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentEmail", studentEmail);
monitoringServiceParameters.addValue("targetTeamName", targetTeamName);
threadMonitoringController.enterService("_sF-WMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sF-9QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes student = studentListByEmail.get(studentEmail);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680437000035337953682593737 = student != null && student.getTeam().equals(targetTeamName);
threadMonitoringController.exitInternalAction("_sF-9QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680437000035337953682593737;
}
finally {
threadMonitoringController.exitService("_sF-WMLngEeyIw-dB1KCaVA");
}
}

public  boolean isStudentsInSameTeam(String studentEmail1, String studentEmail2) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("studentEmail1", studentEmail1);
monitoringServiceParameters.addValue("studentEmail2", studentEmail2);
threadMonitoringController.enterService("_sGBZgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sGD1wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes student1 = studentListByEmail.get(studentEmail1);
StudentAttributes student2 = studentListByEmail.get(studentEmail2);
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680442006143416953465877 = student1 != null && student2 != null && student1.getTeam() != null && student1.getTeam().equals(student2.getTeam());
threadMonitoringController.exitInternalAction("_sGD1wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680442006143416953465877;
}
finally {
threadMonitoringController.exitService("_sGBZgLngEeyIw-dB1KCaVA");
}
}

public  StudentAttributes getStudentForEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_sGG5ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sGIHMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680445003953898039880732 = studentListByEmail.get(email);
threadMonitoringController.exitInternalAction("_sGIHMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680445003953898039880732;
}
finally {
threadMonitoringController.exitService("_sGG5ELngEeyIw-dB1KCaVA");
}
}

public  InstructorAttributes getInstructorForEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_sGJ8YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sGKjcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
InstructorAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680447003196125117573111 = instructorListByEmail.get(email);
threadMonitoringController.exitInternalAction("_sGKjcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680447003196125117573111;
}
finally {
threadMonitoringController.exitService("_sGJ8YLngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_sGO04LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sGQDALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Map<String, List<StudentAttributes>> teamToMembersTable = new  HashMap<>();
for (StudentAttributes studentAttributes : students)
{
teamToMembersTable.computeIfAbsent(studentAttributes.getTeam(), key -> new  ArrayList<>()).add(studentAttributes);
}
Map<String, List<StudentAttributes>> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804500045278013573052345 = teamToMembersTable;
threadMonitoringController.exitInternalAction("_sGQDALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804500045278013573052345;
}
finally {
threadMonitoringController.exitService("_sGO04LngEeyIw-dB1KCaVA");
}
}

public  ParticipantInfo getInfoForIdentifier(String identifier) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("identifier", identifier);
threadMonitoringController.enterService("_sGTGULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sGTtYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
ParticipantInfo longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804520026936333671503276 = new  ParticipantInfo(name, teamName, sectionName);
threadMonitoringController.exitInternalAction("_sGTtYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136804520026936333671503276;
}
finally {
threadMonitoringController.exitService("_sGTGULngEeyIw-dB1KCaVA");
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
