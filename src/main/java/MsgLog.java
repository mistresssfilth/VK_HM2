import org.slf4j.Logger;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class MsgLog {
    FileLogging fileLogging = new FileLogging();
    public static int count = 0;


    public void waitForInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            while (true) {
                String str = scanner.nextLine();
                fileLogging.logging(str);
                count++;
                System.out.println(count);
            }
        } catch (IllegalStateException | NoSuchElementException e) {
        }
    }


}
