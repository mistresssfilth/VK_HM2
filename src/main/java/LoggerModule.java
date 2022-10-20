import com.google.inject.AbstractModule;

public class LoggerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Logging.class).to(ConsoleLogging.class);
    }
}
