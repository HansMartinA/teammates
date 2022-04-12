package teammates.ui.output;

import teammates.common.datatransfer.InstructorPrivileges;
public class InstructorPrivilegeData extends ApiOutput {
private final InstructorPrivileges privileges;

public  InstructorPrivilegeData(InstructorPrivileges privileges){
this.privileges = privileges;
}
public  InstructorPrivileges getPrivileges() {
return privileges;
}

}
