package injection;

import com.google.inject.AbstractModule;
import logging.ConsoleAndFileLogging;
import logging.ConsoleLogging;
import logging.FileLogging;
import logging.Logging;
import org.jetbrains.annotations.NotNull;

public class LoggerModule extends AbstractModule {
    private final String[] args;
    public LoggerModule(@NotNull String[] args) {
        this.args = args;
    }
    @Override
    protected void configure() {
        switch (args[0]){
            case "console":
                bind(Logging.class).to(ConsoleLogging.class);
                break;
            case "file":
                bind(Logging.class).toInstance(new FileLogging(args[1]));
                break;
            case "all":
                bind(Logging.class).toInstance(new ConsoleAndFileLogging(args[1]));
                break;
        }
    }
}
