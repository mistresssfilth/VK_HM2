import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleLogging implements Logging{
    private Logger logger;

    public ConsoleLogging() {
        logger = LoggerFactory.getLogger(ConsoleLogging.class.getName());
    }

    @Override
    public void logging(String msg, int count) {
        logger.info("{}. {}", count, msg);
    }
}
