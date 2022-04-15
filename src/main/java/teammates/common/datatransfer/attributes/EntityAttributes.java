package teammates.common.datatransfer.attributes;

import java.util.List;
import java.util.function.Consumer;
import teammates.storage.entity.BaseEntity;
public abstract class EntityAttributes<E extends BaseEntity>  {
public  boolean isValid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z_fkULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z_gLY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015419005763168503282445 = getInvalidityInfo().isEmpty();
threadMonitoringController.exitInternalAction("_Z_gLY7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z_gLZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015420008463445521915688 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015419005763168503282445;
threadMonitoringController.exitInternalAction("_Z_gLZLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015420008463445521915688;
}
finally {
threadMonitoringController.exitService("_Z_fkULvVEeyr6avTgCRLkQ");
}
}

public abstract  List<String> getInvalidityInfo() ;

public abstract  E toEntity() ;

public abstract  void sanitizeForSaving() ;

 void addNonEmptyError(String error, List<String> errors) {
if (error.isEmpty())
{
return;
}
errors.add(error);
}

protected static class UpdateOption<T>  {
private static final UpdateOption<?> EMPTY = new  UpdateOption<>();

private boolean isValuePresent;

private T value;

private  UpdateOption(){
this.value = null;
this.isValuePresent = false;
}
private  UpdateOption(T value){
this.value = value;
this.isValuePresent = true;
}
public static <T>  UpdateOption<T> of(T value) {
return new  UpdateOption<>(value);
}

@SuppressWarnings("unchecked")
public static <T>  UpdateOption<T> empty() {
return (UpdateOption<T>) EMPTY;
}

 void ifPresent(Consumer<? super T> consumer) {
if (isValuePresent)
{
consumer.accept(value);
}
}

@Override
public  String toString() {
return isValuePresent ? String.format("UpdateOption[%s]", value) : "UpdateOption.empty";
}

}
}
