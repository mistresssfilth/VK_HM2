import com.google.inject.Guice;
import com.google.inject.Injector;

public class AppMain {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new LoggerModule());
        injector.getInstance(MsgLog.class).waitForInput();
    }
}
