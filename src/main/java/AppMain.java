import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new LoggerModule());
        injector.getInstance(MsgLog.class);
    }
}
