import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileLogging implements Logging{
    Logger logger = LoggerFactory.getLogger(FileLogging.class.getName());
    @Override
    public void logging(String msg, int count) {
        logger.info("{}. {}", count, msg);
    }
}
