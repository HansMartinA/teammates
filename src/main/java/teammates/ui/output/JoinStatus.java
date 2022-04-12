package teammates.ui.output;

public class JoinStatus extends ApiOutput {
private final boolean hasJoined;

public  JoinStatus(boolean hasJoined){
this.hasJoined = hasJoined;
}
public  boolean getHasJoined() {
return hasJoined;
}

}
