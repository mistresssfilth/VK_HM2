import java.util.NoSuchElementException;
import java.util.Scanner;

public class MsgLog {

    public void waitForInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            while (true) {

            }
        } catch (IllegalStateException | NoSuchElementException e) {
        }
    }


}
