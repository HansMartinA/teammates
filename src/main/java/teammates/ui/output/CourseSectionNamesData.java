package teammates.ui.output;

import java.util.List;
public class CourseSectionNamesData extends ApiOutput {
private List<String> sectionNames;

public  CourseSectionNamesData(List<String> sectionNames){
this.sectionNames = sectionNames;
}
public  List<String> getSectionNames() {
return this.sectionNames;
}

}
