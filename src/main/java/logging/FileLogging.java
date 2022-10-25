package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileLogging implements Logging {
    private static final Logger logger = LoggerFactory.getLogger(FileLogging.class.getName());
    private final String tag;

    public FileLogging(String tag) {
        this.tag = tag;
    }

    @Override
    public void logging(String msg, int count) {
        logger.info("{}. <{}>{}</{}>", count, tag, msg, tag);
    }
}
