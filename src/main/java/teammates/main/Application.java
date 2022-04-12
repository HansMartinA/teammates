package teammates.main;

import java.io.File;
import java.time.zone.ZoneRulesProvider;
import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.util.log.StdErrLog;
import org.eclipse.jetty.webapp.Configuration.ClassList;
import org.eclipse.jetty.webapp.JettyWebXmlConfiguration;
import org.eclipse.jetty.webapp.WebAppContext;
import teammates.common.util.Config;
import teammates.common.util.Logger;
import teammates.ui.servlets.DevServerLoginServlet;
public final class Application {
private static final Logger log = Logger.getLogger();

private  Application(){
}
@SuppressWarnings("PMD.SignatureDeclareThrowsException")
public static  void main(String[]  args)throws Exception {
System.setProperty("org.eclipse.jetty.util.log.class", StdErrLog.class.getName());
System.setProperty("org.eclipse.jetty.LEVEL", "INFO");
Server server = new  Server(Config.getPort());
WebAppContext webapp = new  WebAppContext();
webapp.setContextPath("/");
String classPath = Application.class.getProtectionDomain().getCodeSource().getLocation().getFile();
String warPath = new  File(classPath).getParentFile().getParentFile().getAbsolutePath();
webapp.setWar(warPath);
ClassList classlist = ClassList.setServerDefault(server);
if (Config.isDevServerLoginEnabled())
{
ServletHolder devServerLoginServlet = new  ServletHolder("DevServerLoginServlet", new  DevServerLoginServlet());
webapp.addServlet(devServerLoginServlet, "/devServerLogin");
}
classlist.addBefore(JettyWebXmlConfiguration.class.getName(), AnnotationConfiguration.class.getName());
server.setHandler(webapp);
server.setStopAtShutdown(true);
server.addLifeCycleListener(new  LifeCycle.Listener(){
@Override
public  void lifeCycleStarting(LifeCycle event) {
log.startup();
}

@Override
public  void lifeCycleStarted(LifeCycle event) {
log.info("Using zone rules version " + ZoneRulesProvider.getVersions("UTC").firstKey());
}

@Override
public  void lifeCycleFailure(LifeCycle event, Throwable cause) {
log.severe("Instance failed to start/stop: " + Config.getInstanceId());
}

@Override
public  void lifeCycleStopping(LifeCycle event) {
log.shutdown();
}

@Override
public  void lifeCycleStopped(LifeCycle event) {
}

}
);
server.start();
server.join();
}

}
