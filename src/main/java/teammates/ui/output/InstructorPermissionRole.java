package teammates.ui.output;

import teammates.common.util.Const;
public enum InstructorPermissionRole {
INSTRUCTOR_PERMISSION_ROLE_COOWNER (Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER),
INSTRUCTOR_PERMISSION_ROLE_MANAGER (Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_MANAGER),
INSTRUCTOR_PERMISSION_ROLE_OBSERVER (Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_OBSERVER),
INSTRUCTOR_PERMISSION_ROLE_TUTOR (Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_TUTOR),
INSTRUCTOR_PERMISSION_ROLE_CUSTOM (Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_CUSTOM),
;

private String roleName;

 InstructorPermissionRole(String roleName){
this.roleName = roleName;
}
public  String getRoleName() {
return roleName;
}

public static  InstructorPermissionRole getEnum(String role) {
switch (role) {
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_COOWNER: return INSTRUCTOR_PERMISSION_ROLE_COOWNER;
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_MANAGER: return INSTRUCTOR_PERMISSION_ROLE_MANAGER;
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_OBSERVER: return INSTRUCTOR_PERMISSION_ROLE_OBSERVER;
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_TUTOR: return INSTRUCTOR_PERMISSION_ROLE_TUTOR;
case Const.InstructorPermissionRoleNames.INSTRUCTOR_PERMISSION_ROLE_CUSTOM: return INSTRUCTOR_PERMISSION_ROLE_CUSTOM;
default: return INSTRUCTOR_PERMISSION_ROLE_CUSTOM;

}
}

}
