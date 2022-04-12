package teammates.ui.output;

import java.util.Set;
public class FeedbackSessionSubmittedGiverSet extends ApiOutput {
private final Set<String> giverIdentifiers;

public  FeedbackSessionSubmittedGiverSet(Set<String> giverIdentifiers){
this.giverIdentifiers = giverIdentifiers;
}
public  Set<String> getGiverIdentifiers() {
return giverIdentifiers;
}

}
