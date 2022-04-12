package teammates.ui.request;

public class CourseArchiveRequest extends BasicRequest {
private boolean archiveStatus;

@Override
public  void validate() {
}

public  boolean getArchiveStatus() {
return archiveStatus;
}

public  void setArchiveStatus(boolean archiveStatus) {
this.archiveStatus = archiveStatus;
}

}
