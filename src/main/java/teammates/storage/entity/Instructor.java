package teammates.storage.entity;

import java.security.SecureRandom;
import java.time.Instant;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.OnSave;
import com.googlecode.objectify.annotation.Translate;
import com.googlecode.objectify.annotation.Unindex;
import teammates.common.util.StringHelper;
@Entity
@Index
public class Instructor extends BaseEntity {
@Id
private String id;

private String googleId;

private String courseId;

private boolean isArchived;

private String name;

private String email;

private String registrationKey;

@Unindex
private String role;

private Boolean isDisplayedToStudents;

@Unindex
private String displayedName;

@Unindex
private String instructorPrivilegesAsText;

@Translate(InstantTranslatorFactory.class)
private Instant createdAt;

@Translate(InstantTranslatorFactory.class)
private Instant updatedAt;

@SuppressWarnings("unused")
private  Instructor(){
}
public  Instructor(String instructorGoogleId, String courseId, boolean isArchived, String instructorName, String instructorEmail, String role, boolean isDisplayedToStudents, String displayedName, String instructorPrivilegesAsText){
this.setGoogleId(instructorGoogleId);
this.setCourseId(courseId);
this.setIsArchived(isArchived);
this.setName(instructorName);
this.setEmail(instructorEmail);
this.setRole(role);
this.setIsDisplayedToStudents(isDisplayedToStudents);
this.setDisplayedName(displayedName);
this.setInstructorPrivilegeAsText(instructorPrivilegesAsText);
this.setUniqueId(generateId(this.getEmail(), this.getCourseId()));
this.setRegistrationKey(generateRegistrationKey());
this.setCreatedAt(Instant.now());
}
public static  String generateId(String email, String courseId) {
return email + '%' + courseId;
}

public  String getUniqueId() {
return id;
}

public  void setUniqueId(String uniqueId) {
this.id = uniqueId;
}

public  String getGoogleId() {
return googleId;
}

public  void setGoogleId(String instructorGoogleId) {
this.googleId = instructorGoogleId;
}

public  String getCourseId() {
return courseId;
}

public  void setCourseId(String courseId) {
this.courseId = courseId;
}

public  boolean getIsArchived() {
return isArchived;
}

public  void setIsArchived(boolean isArchived) {
this.isArchived = isArchived;
}

public  String getName() {
return name;
}

public  void setName(String instructorName) {
this.name = instructorName;
}

public  String getEmail() {
return email;
}

public  void setEmail(String instructorEmail) {
this.email = instructorEmail;
}

public  String getRegistrationKey() {
return registrationKey;
}

public  void setRegistrationKey(String key) {
this.registrationKey = key;
}

private  String generateRegistrationKey() {
String uniqueId = getUniqueId();
SecureRandom prng = new  SecureRandom();
return StringHelper.encrypt(uniqueId + prng.nextInt());
}

public  String getRole() {
return role;
}

public  void setRole(String role) {
this.role = role;
}

public  boolean isDisplayedToStudents() {
if (this.isDisplayedToStudents == null)
{
return true;
}
return isDisplayedToStudents;
}

public  void setIsDisplayedToStudents(boolean shouldDisplayToStudents) {
this.isDisplayedToStudents = shouldDisplayToStudents;
}

public  String getDisplayedName() {
return displayedName;
}

public  void setDisplayedName(String displayedName) {
this.displayedName = displayedName;
}

public  String getInstructorPrivilegesAsText() {
return instructorPrivilegesAsText;
}

public  void setInstructorPrivilegeAsText(String instructorPrivilegesAsText) {
this.instructorPrivilegesAsText = instructorPrivilegesAsText;
}

public  Instant getCreatedAt() {
return createdAt;
}

public  void setCreatedAt(Instant created) {
this.createdAt = created;
setLastUpdate(created);
}

public  Instant getUpdatedAt() {
return updatedAt;
}

public  void setLastUpdate(Instant updatedAt) {
this.updatedAt = updatedAt;
}

@OnSave
public  void updateLastUpdateTimestamp() {
this.setLastUpdate(Instant.now());
}

}
