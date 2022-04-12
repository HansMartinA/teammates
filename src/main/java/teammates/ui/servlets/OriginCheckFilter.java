package teammates.ui.servlets;

import java.io.IOException;
import java.util.Arrays;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import teammates.common.exception.InvalidParametersException;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.Logger;
import teammates.common.util.StringHelper;
import teammates.common.util.Url;
import teammates.ui.webapi.JsonResult;
public class OriginCheckFilter implements Filter {
private static final Logger log = Logger.getLogger();

private static final String ALLOWED_HTTP_METHODS = String.join(", ", Arrays.asList(HttpGet.METHOD_NAME, HttpPost.METHOD_NAME, HttpPut.METHOD_NAME, HttpDelete.METHOD_NAME, HttpOptions.METHOD_NAME));

private static final String ALLOWED_HEADERS = String.join(", ", Arrays.asList(Const.HeaderNames.CSRF_TOKEN, "Content-Type", Const.HeaderNames.WEB_VERSION, "ngsw-bypass"));

@Override
public  void init(FilterConfig filterConfig) {
}

@Override
public  void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)throws IOException, ServletException {
HttpServletRequest request = (HttpServletRequest) req;
HttpServletResponse response = (HttpServletResponse) res;
if (Config.isDevServer())
{
response.setHeader("Access-Control-Allow-Origin", Config.APP_FRONTENDDEV_URL);
response.setHeader("Access-Control-Allow-Methods", ALLOWED_HTTP_METHODS);
response.setHeader("Access-Control-Allow-Headers", ALLOWED_HEADERS);
response.setHeader("Access-Control-Allow-Credentials", "true");
}
if (Config.CSRF_KEY.equals(request.getHeader(Const.HeaderNames.CSRF_KEY)))
{
chain.doFilter(req, res);
return;
}
boolean isRequestFromAppEngineQueue = request.getHeader("X-AppEngine-QueueName") != null;
if (isRequestFromAppEngineQueue)
{
chain.doFilter(req, res);
return;
}
String referrer = request.getHeader("referer");
if (referrer == null)
{
}
else
if (!isHttpReferrerValid(referrer, request.getRequestURL().toString()))
{
denyAccess("Invalid HTTP referrer.", request, response);
return;
}
switch (request.getMethod()) {
case HttpPost.METHOD_NAME: case HttpPut.METHOD_NAME: case HttpDelete.METHOD_NAME: String message = getCsrfTokenErrorIfAny(request);
if (message != null)
{
denyAccess(message, request, response);
return;
}
break;
default: break;

}
chain.doFilter(req, res);
}

private  boolean isHttpReferrerValid(String referrer, String requestUrl) {
String origin;
try {
origin = new  Url(referrer).getBaseUrl();
}
catch(AssertionError e){
return false;
}
if (Config.isDevServer() && Config.APP_FRONTENDDEV_URL.equals(origin))
{
return true;
}
String target = new  Url(requestUrl).getBaseUrl();
return origin.replaceFirst("^https?://", "").equals(target.replaceFirst("^https?://", ""));
}

private  String getCsrfTokenErrorIfAny(HttpServletRequest request) {
String csrfToken = request.getHeader(Const.HeaderNames.CSRF_TOKEN);
if (csrfToken == null || csrfToken.isEmpty())
{
return "Missing CSRF token.";
}
String sessionId = request.getRequestedSessionId();
if (sessionId == null)
{
sessionId = request.getSession().getId();
}
try {
return sessionId.startsWith(StringHelper.decrypt(csrfToken)) ? null : "Invalid CSRF token.";
}
catch(InvalidParametersException e){
return "Invalid CSRF token.";
}
}

private  void denyAccess(String message, HttpServletRequest request, HttpServletResponse response)throws IOException {
int statusCode = HttpStatus.SC_FORBIDDEN;
JsonResult result = new  JsonResult(message, statusCode);
result.send(response);
log.request(request, statusCode, message);
}

@Override
public  void destroy() {
}

}
