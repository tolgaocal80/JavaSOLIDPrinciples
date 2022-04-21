import java.util.List;

// open for modification class, extends Subscriber
public class PhoneSubscriber extends Subscriber{

    // open for modification method
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return (double) totalDuration*getBaseRate()/100;
    }

}