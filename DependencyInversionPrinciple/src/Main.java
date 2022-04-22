import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        Message message = new Message("This is a message again");
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.writeMessage(message, new JSONFormatter(), new PrintWriter(new File("test_msg.txt")));

    }

}
