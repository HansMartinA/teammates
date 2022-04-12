package teammates.logic.core;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import teammates.common.util.Logger;
public class LogicStarter implements ServletContextListener {
private static final Logger log = Logger.getLogger();

public static  void initializeDependencies() {
AccountsLogic accountsLogic = AccountsLogic.inst();
CoursesLogic coursesLogic = CoursesLogic.inst();
FeedbackQuestionsLogic fqLogic = FeedbackQuestionsLogic.inst();
FeedbackResponsesLogic frLogic = FeedbackResponsesLogic.inst();
FeedbackResponseCommentsLogic frcLogic = FeedbackResponseCommentsLogic.inst();
FeedbackSessionsLogic fsLogic = FeedbackSessionsLogic.inst();
InstructorsLogic instructorsLogic = InstructorsLogic.inst();
StudentsLogic studentsLogic = StudentsLogic.inst();
ProfilesLogic profilesLogic = ProfilesLogic.inst();
accountsLogic.initLogicDependencies();
coursesLogic.initLogicDependencies();
fqLogic.initLogicDependencies();
frLogic.initLogicDependencies();
frcLogic.initLogicDependencies();
fsLogic.initLogicDependencies();
instructorsLogic.initLogicDependencies();
studentsLogic.initLogicDependencies();
profilesLogic.initLogicDependencies();
log.info("Initialized dependencies between logic classes");
}

@Override
public  void contextInitialized(ServletContextEvent event) {
initializeDependencies();
}

@Override
public  void contextDestroyed(ServletContextEvent event) {
}

}
