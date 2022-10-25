import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileLogging implements Logging{
    private Logger logger;
    private String tag;

    public FileLogging(String tag) {
        logger = LoggerFactory.getLogger(FileLogging.class.getName());
        this.tag = tag;
    }

    @Override
    public void logging(String msg, int count) {
        logger.info("{}. <{}>{}</{}>", count, tag, msg, tag);
    }
}
