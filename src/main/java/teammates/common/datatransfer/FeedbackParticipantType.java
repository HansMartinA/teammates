package teammates.common.datatransfer;

public enum FeedbackParticipantType {
SELF (true, true, false),
STUDENTS (true, true, true),
STUDENTS_IN_SAME_SECTION (true, true, true),
STUDENTS_EXCLUDING_SELF (false, false, false),
INSTRUCTORS (true, true, true),
TEAMS (true, true, false),
TEAMS_IN_SAME_SECTION (true, true, false),
TEAMS_EXCLUDING_SELF (false, false, false),
OWN_TEAM (false, true, false),
OWN_TEAM_MEMBERS (false, true, true),
OWN_TEAM_MEMBERS_INCLUDING_SELF (false, true, true),
RECEIVER (false, false, true),
RECEIVER_TEAM_MEMBERS (false, false, true),
NONE (false, true, false),
GIVER (false, false, true),
;

private final boolean validGiver;

private final boolean validRecipient;

private final boolean validViewer;

 FeedbackParticipantType(boolean isGiver, boolean isRecipient, boolean isViewer){
this.validGiver = isGiver;
this.validRecipient = isRecipient;
this.validViewer = isViewer;
}
public  boolean isValidGiver() {
return validGiver;
}

public  boolean isValidRecipient() {
return validRecipient;
}

public  boolean isValidViewer() {
return validViewer;
}

public  boolean isTeam() {
return this == TEAMS || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION;
}

public  String toSingularFormString() {
switch (this) {
case INSTRUCTORS: return "instructor";
case STUDENTS: case STUDENTS_IN_SAME_SECTION: case STUDENTS_EXCLUDING_SELF: case OWN_TEAM_MEMBERS: case OWN_TEAM_MEMBERS_INCLUDING_SELF: return "student";
case TEAMS: case TEAMS_IN_SAME_SECTION: case TEAMS_EXCLUDING_SELF: case OWN_TEAM: return "team";
default: return super.toString();

}
}

}
