import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleAndFileLogging implements Logging{
    Logger logger = LoggerFactory.getLogger(ConsoleAndFileLogging.class.getName());

    @Override
    public void logging(String msg, int count) {
        logger.info("{}. {}", count, msg);
    }
}
