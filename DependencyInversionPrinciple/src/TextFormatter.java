public class TextFormatter implements Formatter{

    @Override
    public String format(Message message) throws FormatException {
        return message.getTime()+" "+message.getMsg();
    }

}
