package teammates.common.util;

import java.io.OutputStream;
import java.util.logging.ConsoleHandler;
public class StdOutConsoleHandler extends ConsoleHandler {
@Override
protected  void setOutputStream(OutputStream out) {
super.setOutputStream(System.out);
}

}
