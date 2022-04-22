import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
    public void writeMessage(Message message, Formatter formatter, PrintWriter printWriter) throws IOException {
        /* we dont know if the given formatter is a JSONFormatter so initialization is wrong
            formatter = new JSONFormatter();
        */
        printWriter.println(formatter.format(message));
        printWriter.flush();
    }

}
