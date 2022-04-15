package teammates.storage.api;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.google.cloud.datastore.DatastoreOptions;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import teammates.common.util.Config;
import teammates.storage.entity.Account;
import teammates.storage.entity.AccountRequest;
import teammates.storage.entity.BaseEntity;
import teammates.storage.entity.Course;
import teammates.storage.entity.CourseStudent;
import teammates.storage.entity.FeedbackQuestion;
import teammates.storage.entity.FeedbackResponse;
import teammates.storage.entity.FeedbackResponseComment;
import teammates.storage.entity.FeedbackSession;
import teammates.storage.entity.Instructor;
import teammates.storage.entity.StudentProfile;
public class OfyHelper implements ServletContextListener {
private static  void initializeDatastore() {
DatastoreOptions.Builder builder = DatastoreOptions.newBuilder().setProjectId(Config.APP_ID);
if (Config.isDevServer())
{
builder.setHost("http://localhost:" + Config.APP_LOCALDATASTORE_PORT);
}
ObjectifyService.init(new  ObjectifyFactory(builder.build().getService()));
}

public static  void registerEntityClasses() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_e2-QoLvVEeyr6avTgCRLkQ", OfyHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_e3B7ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
ObjectifyService.register(Account.class);
ObjectifyService.register(Course.class);
ObjectifyService.register(CourseStudent.class);
ObjectifyService.register(FeedbackQuestion.class);
ObjectifyService.register(FeedbackResponse.class);
ObjectifyService.register(FeedbackResponseComment.class);
ObjectifyService.register(FeedbackSession.class);
ObjectifyService.register(Instructor.class);
ObjectifyService.register(StudentProfile.class);
ObjectifyService.register(AccountRequest.class);
ObjectifyService.factory().getTranslators().add(new  BaseEntity.InstantTranslatorFactory());
threadMonitoringController.exitInternalAction("_e3B7ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_e2-QoLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void contextInitialized(ServletContextEvent event) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("event", event);
threadMonitoringController.enterService("_e3P9cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_e3ZudLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
initializeDatastore();
threadMonitoringController.exitInternalAction("_e3ZudLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
registerEntityClasses();
}
finally {
threadMonitoringController.exitService("_e3P9cLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void contextDestroyed(ServletContextEvent event) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("event", event);
threadMonitoringController.enterService("_e3rbQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
}
finally {
threadMonitoringController.exitService("_e3rbQLvVEeyr6avTgCRLkQ");
}
}

}
