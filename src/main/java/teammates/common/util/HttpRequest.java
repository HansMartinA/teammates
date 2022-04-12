package teammates.common.util;

import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
public final class HttpRequest {
private static final int TIMEOUT_IN_MS = 30000;

private  HttpRequest(){
}
public static  String executeGetRequest(URI uri)throws IOException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("uri", uri);
threadMonitoringController.enterService("_tI06ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tI2IcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
HttpUriRequest request = new  HttpGet(uri);
RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(TIMEOUT_IN_MS).build();
HttpResponse httpResponse = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build().execute(request);
HttpEntity entity = httpResponse.getEntity();
String response = EntityUtils.toString(entity, Const.ENCODING);
if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
{
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681833005032894389997445 = response;
threadMonitoringController.exitInternalAction("_tI2IcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681833005032894389997445;
}
else
{
throw new  HttpResponseException(httpResponse.getStatusLine().getStatusCode(), response);
}
}
finally {
threadMonitoringController.exitService("_tI06ULngEeyIw-dB1KCaVA");
}
}

}
