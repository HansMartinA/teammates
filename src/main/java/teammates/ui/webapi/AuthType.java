package teammates.ui.webapi;

public enum AuthType {
PUBLIC (0),
LOGGED_IN (1),
MASQUERADE (1),
ALL_ACCESS (2),
;

private final int level;

 AuthType(int level){
this.level = level;
}
public  int getLevel() {
return level;
}

}
