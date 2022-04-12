package teammates.ui.webapi;

public class ActionMappingException extends Exception {
private final int statusCode;

public  ActionMappingException(String message, int statusCode){
super(message);
this.statusCode = statusCode;
}
public  int getStatusCode() {
return statusCode;
}

}
