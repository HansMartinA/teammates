package teammates.ui.output;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
public class HasResponsesData extends ApiOutput {
private final boolean hasResponses;

@Nullable
private final Map<String, Boolean> hasResponsesBySession;

public  HasResponsesData(boolean hasResponses){
this.hasResponsesBySession = new  HashMap<>();
this.hasResponses = hasResponses;
}
public  HasResponsesData(Map<String, Boolean> hasResponsesBySession){
this.hasResponsesBySession = hasResponsesBySession;
this.hasResponses = false;
}
public  boolean getHasResponses() {
return hasResponses;
}

public  Map<String, Boolean> getHasResponsesBySessions() {
return hasResponsesBySession;
}

}
