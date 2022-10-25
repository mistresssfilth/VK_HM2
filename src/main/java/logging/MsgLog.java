package logging;

import com.google.inject.Inject;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MsgLog {
    public static int count = 0;
    @Inject
    private Logging logger;

    public void waitForInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            while (true) {
                String str = scanner.nextLine();
                logger.logging(str, count);
                count++;
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
