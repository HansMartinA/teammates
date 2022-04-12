package teammates.ui.webapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URLConnection;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
class ImageResult extends ActionResult {
private byte[]  bytes;

 ImageResult(){
super(HttpStatus.SC_NO_CONTENT);
this.bytes = new byte [0] ;
}
 ImageResult(byte[]  bytes){
super(HttpStatus.SC_OK);
this.bytes = bytes;
}
 byte[]  getBytes() {
return this.bytes;
}

@Override
public  void send(HttpServletResponse resp)throws IOException {
String contentType = URLConnection.guessContentTypeFromStream(new  ByteArrayInputStream(bytes));
if ("application/xml".equals(contentType))
{
contentType = "image/svg+xml";
}
resp.setContentType(contentType);
resp.getOutputStream().write(bytes);
}

}
