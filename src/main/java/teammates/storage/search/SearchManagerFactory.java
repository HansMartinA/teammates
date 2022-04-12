package teammates.storage.search;

public final class SearchManagerFactory {
private static InstructorSearchManager instructorInstance;

private static StudentSearchManager studentInstance;

private static AccountRequestSearchManager accountRequestInstance;

private  SearchManagerFactory(){
}
public static  InstructorSearchManager getInstructorSearchManager() {
return instructorInstance;
}

@SuppressWarnings("PMD.NonThreadSafeSingleton")
public static  void registerInstructorSearchManager(InstructorSearchManager instructorSearchManager) {
if (instructorInstance == null)
{
instructorInstance = instructorSearchManager;
}
}

public static  StudentSearchManager getStudentSearchManager() {
return studentInstance;
}

@SuppressWarnings("PMD.NonThreadSafeSingleton")
public static  void registerStudentSearchManager(StudentSearchManager studentSearchManager) {
if (studentInstance == null)
{
studentInstance = studentSearchManager;
}
}

public static  AccountRequestSearchManager getAccountRequestSearchManager() {
return accountRequestInstance;
}

@SuppressWarnings("PMD.NonThreadSafeSingleton")
public static  void registerAccountRequestSearchManager(AccountRequestSearchManager accountRequestSearchManager) {
if (accountRequestInstance == null)
{
accountRequestInstance = accountRequestSearchManager;
}
}

}
