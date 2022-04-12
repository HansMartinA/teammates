package teammates.ui.output;

import java.util.List;
public class ActionClasses extends ApiOutput {
private final List<String> actionClasses;

public  ActionClasses(List<String> actionClasses){
this.actionClasses = actionClasses;
}
public  List<String> getActionClasses() {
return actionClasses;
}

}
