import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {

    private final String msg;
    private final LocalDateTime time;

    public Message(String msg){
        this.msg = msg;
        this.time = LocalDateTime.now(ZoneId.of("UTC"));
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
