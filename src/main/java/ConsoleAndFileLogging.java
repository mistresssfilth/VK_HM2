import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleAndFileLogging implements Logging{
    private Logger logger;
    private String tag;

    public ConsoleAndFileLogging(String tag) {
        logger = LoggerFactory.getLogger(ConsoleAndFileLogging.class.getName());
        this.tag = tag;
    }

    @Override
    public void logging(String msg, int count) {
        logger.info("{}. <{}>{}</{}>", count++, tag, msg, tag);
    }
}
