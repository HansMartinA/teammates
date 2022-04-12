package teammates.storage.search;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import teammates.common.util.Config;
public class SearchManagerStarter implements ServletContextListener {
@Override
public  void contextInitialized(ServletContextEvent event) {
SearchManagerFactory.registerInstructorSearchManager(new  InstructorSearchManager(Config.SEARCH_SERVICE_HOST, false));
SearchManagerFactory.registerStudentSearchManager(new  StudentSearchManager(Config.SEARCH_SERVICE_HOST, false));
SearchManagerFactory.registerAccountRequestSearchManager(new  AccountRequestSearchManager(Config.SEARCH_SERVICE_HOST, false));
}

@Override
public  void contextDestroyed(ServletContextEvent event) {
}

}
