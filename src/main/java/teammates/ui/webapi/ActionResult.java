package teammates.ui.webapi;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
public abstract class ActionResult {
private final int statusCode;

 ActionResult(int statusCode){
this.statusCode = statusCode;
}
public abstract  void send(HttpServletResponse resp)throws IOException ;

public  int getStatusCode() {
return statusCode;
}

}
