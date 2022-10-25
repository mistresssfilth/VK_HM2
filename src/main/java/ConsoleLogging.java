import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleLogging implements Logging{
    Logger logger = LoggerFactory.getLogger(FileLogging.class.getName());

    @Override
    public void logging(String str) {
        logger.info(str);
    }
}
