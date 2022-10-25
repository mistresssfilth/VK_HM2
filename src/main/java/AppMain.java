import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public class AppMain {
    public static void main(@NotNull String[] args) {
        Injector injector = Guice.createInjector(new LoggerModule(args));
        injector.getInstance(MsgLog.class).waitForInput();
    }
}
