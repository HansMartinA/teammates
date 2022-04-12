package teammates.ui.output;

public class CourseArchiveData extends ApiOutput {
private final String courseId;

private final boolean isArchived;

public  CourseArchiveData(String courseId, boolean isArchived){
this.courseId = courseId;
this.isArchived = isArchived;
}
public  String getCourseId() {
return courseId;
}

public  boolean getIsArchived() {
return isArchived;
}

}
