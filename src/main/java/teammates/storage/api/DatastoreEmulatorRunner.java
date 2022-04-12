package teammates.storage.api;

import java.io.IOException;
import java.nio.file.Paths;
import com.google.cloud.datastore.testing.LocalDatastoreHelper;
import teammates.common.util.Config;
public final class DatastoreEmulatorRunner {
private  DatastoreEmulatorRunner(){
}
public static  void main(String[]  args)throws IOException, InterruptedException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("args", args);
threadMonitoringController.enterService("_v41j0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_v49foLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
LocalDatastoreHelper localDatastoreHelper = LocalDatastoreHelper.newBuilder().setConsistency(0.9D).setPort(Config.APP_LOCALDATASTORE_PORT).setStoreOnDisk(true).setDataDir(Paths.get("datastore-dev/datastore")).build();
localDatastoreHelper.start();
threadMonitoringController.exitInternalAction("_v49foLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_v41j0LngEeyIw-dB1KCaVA");
}
}

}
