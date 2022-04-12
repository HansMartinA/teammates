package teammates.ui.servlets;

import java.io.IOException;
import java.util.Random;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.binary.Hex;
import org.apache.http.HttpStatus;
import teammates.common.util.Config;
import teammates.common.util.Logger;
import teammates.common.util.RequestTracer;
import teammates.ui.webapi.JsonResult;
public class RequestTraceFilter implements Filter {
private static final Logger log = Logger.getLogger();

@Override
public  void init(FilterConfig filterConfig) {
}

@Override
public  void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)throws IOException, ServletException {
HttpServletResponse response = (HttpServletResponse) resp;
response.setHeader("Strict-Transport-Security", "max-age=31536000");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
HttpServletRequest request = (HttpServletRequest) req;
String requestId = request.getHeader("X-Cloud-Trace-Context");
String traceId;
String spanId = null;
if (requestId == null)
{
byte[]  resBuf = new byte [16] ;
new  Random().nextBytes(resBuf);
traceId = Hex.encodeHexString(resBuf);
}
else
{
String[]  traceAndSpan = requestId.split("/", 2);
traceId = traceAndSpan[0];
if (traceAndSpan.length == 2)
{
spanId = traceAndSpan[1].split(";")[0];
}
}
boolean isRequestFromAppEngineQueue = request.getHeader("X-AppEngine-QueueName") != null;
int timeoutInSeconds = isRequestFromAppEngineQueue ? 10 * 60 - 5 : 60;
RequestTracer.init(traceId, spanId, timeoutInSeconds);
if (Config.MAINTENANCE)
{
throwError(request, response, HttpStatus.SC_SERVICE_UNAVAILABLE, "The server is currently undergoing some maintenance.");
return;
}
try {
request.getParameterMap();
}
catch(RuntimeException e){
if ("BadMessageException".equals(e.getClass().getSimpleName()))
{
throwError(request, response, HttpStatus.SC_BAD_REQUEST, e.getMessage());
return;
}
throw e;
}
chain.doFilter(req, resp);
}

@Override
public  void destroy() {
}

private  void throwError(HttpServletRequest req, HttpServletResponse resp, int statusCode, String message)throws IOException {
JsonResult result = new  JsonResult(message, statusCode);
result.send(resp);
log.request(req, statusCode, message);
}

}
