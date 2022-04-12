package teammates.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
public final class Config {
public static final String APP_ID;

public static final String APP_REGION;

public static final String APP_VERSION;

public static final String APP_FRONTENDDEV_URL;

public static final int APP_LOCALDATASTORE_PORT;

public static final boolean TASKQUEUE_ACTIVE;

public static final String PRODUCTION_GCS_BUCKETNAME;

public static final String BACKUP_GCS_BUCKETNAME;

public static final String CSRF_KEY;

public static final String BACKDOOR_KEY;

public static final String ENCRYPTION_KEY;

public static final String OAUTH2_CLIENT_ID;

public static final String OAUTH2_CLIENT_SECRET;

public static final boolean ENABLE_DEVSERVER_LOGIN;

public static final String CAPTCHA_SECRET_KEY;

public static final List<String> APP_ADMINS;

public static final List<String> APP_MAINTAINERS;

public static final String SUPPORT_EMAIL;

public static final String EMAIL_SENDEREMAIL;

public static final String EMAIL_SENDERNAME;

public static final String EMAIL_REPLYTO;

public static final String EMAIL_SERVICE;

public static final String SENDGRID_APIKEY;

public static final String MAILGUN_APIKEY;

public static final String MAILGUN_DOMAINNAME;

public static final String MAILJET_APIKEY;

public static final String MAILJET_SECRETKEY;

public static final String SEARCH_SERVICE_HOST;

public static final boolean ENABLE_DATASTORE_BACKUP;

public static final boolean MAINTENANCE;

static {
Properties properties = new  Properties();
try(InputStream buildPropStream = FileHelper.getResourceAsStream("build.properties")) {
properties.load(buildPropStream);
}
catch(IOException e){
assert false;
}
APP_ID = properties.getProperty("app.id");
APP_REGION = properties.getProperty("app.region");
APP_VERSION = properties.getProperty("app.version");
APP_FRONTENDDEV_URL = properties.getProperty("app.frontenddev.url");
APP_LOCALDATASTORE_PORT = Integer.parseInt(properties.getProperty("app.localdatastore.port", "8484"));
TASKQUEUE_ACTIVE = Boolean.parseBoolean(properties.getProperty("app.taskqueue.active", "true"));
CSRF_KEY = properties.getProperty("app.csrf.key");
BACKDOOR_KEY = properties.getProperty("app.backdoor.key");
PRODUCTION_GCS_BUCKETNAME = properties.getProperty("app.production.gcs.bucketname");
BACKUP_GCS_BUCKETNAME = properties.getProperty("app.backup.gcs.bucketname");
ENCRYPTION_KEY = properties.getProperty("app.encryption.key");
OAUTH2_CLIENT_ID = properties.getProperty("app.oauth2.client.id");
OAUTH2_CLIENT_SECRET = properties.getProperty("app.oauth2.client.secret");
ENABLE_DEVSERVER_LOGIN = Boolean.parseBoolean(properties.getProperty("app.enable.devserver.login", "true"));
CAPTCHA_SECRET_KEY = properties.getProperty("app.captcha.secretkey");
APP_ADMINS = Collections.unmodifiableList(Arrays.asList(properties.getProperty("app.admins", "").split(",")));
APP_MAINTAINERS = Collections.unmodifiableList(Arrays.asList(properties.getProperty("app.maintainers", "").split(",")));
SUPPORT_EMAIL = properties.getProperty("app.crashreport.email");
EMAIL_SENDEREMAIL = properties.getProperty("app.email.senderemail");
EMAIL_SENDERNAME = properties.getProperty("app.email.sendername");
EMAIL_REPLYTO = properties.getProperty("app.email.replyto");
EMAIL_SERVICE = properties.getProperty("app.email.service");
SENDGRID_APIKEY = properties.getProperty("app.sendgrid.apikey");
MAILGUN_APIKEY = properties.getProperty("app.mailgun.apikey");
MAILGUN_DOMAINNAME = properties.getProperty("app.mailgun.domainname");
MAILJET_APIKEY = properties.getProperty("app.mailjet.apikey");
MAILJET_SECRETKEY = properties.getProperty("app.mailjet.secretkey");
SEARCH_SERVICE_HOST = properties.getProperty("app.search.service.host");
ENABLE_DATASTORE_BACKUP = Boolean.parseBoolean(properties.getProperty("app.enable.datastore.backup", "false"));
MAINTENANCE = Boolean.parseBoolean(properties.getProperty("app.maintenance", "false"));
}
private  Config(){
}
static  String getBaseAppUrl() {
return isDevServer() ? "http://localhost:" + getPort() : "https://" + APP_ID + ".appspot.com";
}

public static  int getPort() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s9gbILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s9iQULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String portEnv = System.getenv("PORT");
if (portEnv == null || !portEnv.matches("\\d{2,5}"))
{
return 8080;
}
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368172800789155908378994 = Integer.parseInt(portEnv);
threadMonitoringController.exitInternalAction("_s9iQULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368172800789155908378994;
}
finally {
threadMonitoringController.exitService("_s9gbILngEeyIw-dB1KCaVA");
}
}

public static  String getInstanceId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s9l6sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s9nv4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String instanceId = System.getenv("GAE_INSTANCE");
if (instanceId == null)
{
return "dev_server_instance_id";
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681732009032815296562637 = instanceId;
threadMonitoringController.exitInternalAction("_s9nv4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681732009032815296562637;
}
finally {
threadMonitoringController.exitService("_s9l6sLngEeyIw-dB1KCaVA");
}
}

public static  boolean isDevServer() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s9qzMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s9udkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String version = System.getenv("GAE_VERSION");
if (!APP_VERSION.equals(version))
{
return true;
}
String env = System.getenv("GAE_ENV");
if ("standard".equals(env))
{
String appName = System.getenv("GAE_APPLICATION");
return appName == null || !appName.endsWith(APP_ID);
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681734009421513842651308 = env != null;
threadMonitoringController.exitInternalAction("_s9udkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681734009421513842651308;
}
finally {
threadMonitoringController.exitService("_s9qzMLngEeyIw-dB1KCaVA");
}
}

public static  boolean isDevServerLoginEnabled() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s9yH8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return Config.isDevServer() && ENABLE_DEVSERVER_LOGIN;
}
finally {
threadMonitoringController.exitService("_s9yH8LngEeyIw-dB1KCaVA");
}
}

public static  AppUrl getFrontEndAppUrl(String relativeUrl) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("relativeUrl", relativeUrl);
threadMonitoringController.enterService("_ri1z8bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ri2bALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (Config.isDevServer() && APP_FRONTENDDEV_URL != null)
{
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679061007049877805539659 = new  AppUrl(APP_FRONTENDDEV_URL + relativeUrl);
threadMonitoringController.exitInternalAction("_ri2bALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679061007049877805539659;
}
threadMonitoringController.enterInternalAction("_ri4QMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AppUrl longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367906100355647543169778 = getBackEndAppUrl(relativeUrl);
threadMonitoringController.exitInternalAction("_ri4QMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367906100355647543169778;
}
finally {
threadMonitoringController.exitService("_ri1z8bngEeyIw-dB1KCaVA");
}
}

private static  AppUrl getBackEndAppUrl(String relativeUrl) {
return new  AppUrl(getBaseAppUrl() + relativeUrl);
}

public static  boolean isUsingSendgrid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s96q0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s99HELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681740008914375286091303 = "sendgrid".equalsIgnoreCase(EMAIL_SERVICE) && SENDGRID_APIKEY != null && !SENDGRID_APIKEY.isEmpty();
threadMonitoringController.exitInternalAction("_s99HELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681740008914375286091303;
}
finally {
threadMonitoringController.exitService("_s96q0LngEeyIw-dB1KCaVA");
}
}

public static  boolean isUsingMailgun() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s9_jULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s-DNsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681744009721158225150993 = "mailgun".equalsIgnoreCase(EMAIL_SERVICE) && MAILGUN_APIKEY != null && !MAILGUN_APIKEY.isEmpty() && MAILGUN_DOMAINNAME != null && !MAILGUN_DOMAINNAME.isEmpty();
threadMonitoringController.exitInternalAction("_s-DNsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681744009721158225150993;
}
finally {
threadMonitoringController.exitService("_s9_jULngEeyIw-dB1KCaVA");
}
}

public static  boolean isUsingMailjet() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_s-Fp8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s-JUULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817470048552703848289314 = "mailjet".equalsIgnoreCase(EMAIL_SERVICE) && MAILJET_APIKEY != null && !MAILJET_APIKEY.isEmpty() && MAILJET_SECRETKEY != null && !MAILJET_SECRETKEY.isEmpty();
threadMonitoringController.exitInternalAction("_s-JUULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817470048552703848289314;
}
finally {
threadMonitoringController.exitService("_s-Fp8LngEeyIw-dB1KCaVA");
}
}

}
