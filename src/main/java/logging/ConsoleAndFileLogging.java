package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleAndFileLogging implements Logging {
    private static final Logger loggerToFile = LoggerFactory.getLogger(FileLogging.class.getName());
    private static final Logger loggerToConsole = LoggerFactory.getLogger(ConsoleLogging.class.getName());
    private final String tag;

    public ConsoleAndFileLogging(String tag) {
        this.tag = tag;
    }

    @Override
    public void logging(String msg, int count) {
        loggerToConsole.info("{}. {}", count++, msg);
        loggerToFile.info("{}. <{}>{}</{}>", ++count, tag, msg, tag);
    }
}
