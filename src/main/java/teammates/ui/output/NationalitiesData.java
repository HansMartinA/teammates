package teammates.ui.output;

import java.util.List;
public class NationalitiesData extends ApiOutput {
private List<String> nationalities;

public  NationalitiesData(List<String> nationalities){
this.nationalities = nationalities;
}
public  List<String> getNationalities() {
return this.nationalities;
}

}
