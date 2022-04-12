package teammates.ui.output;

import java.util.Map;
public class TimeZonesData extends ApiOutput {
private String version;

private Map<String, Integer> offsets;

public  TimeZonesData(String version, Map<String, Integer> offsets){
this.version = version;
this.offsets = offsets;
}
public  String getVersion() {
return version;
}

public  Map<String, Integer> getOffsets() {
return offsets;
}

}
