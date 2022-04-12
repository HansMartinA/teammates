package teammates.common.datatransfer.attributes;

import java.util.List;
import java.util.function.Consumer;
import teammates.storage.entity.BaseEntity;
public abstract class EntityAttributes<E extends BaseEntity>  {
public  boolean isValid() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rlgGYbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rlgtc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679173009159852559760829 = getInvalidityInfo().isEmpty();
threadMonitoringController.exitInternalAction("_rlgtc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rlgtdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679173006589409354713595 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679173009159852559760829;
threadMonitoringController.exitInternalAction("_rlgtdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679173006589409354713595;
}
finally {
threadMonitoringController.exitService("_rlgGYbngEeyIw-dB1KCaVA");
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
