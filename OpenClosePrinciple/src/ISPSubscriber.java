import java.util.List;

// open for modification class, extends Subscriber
public class ISPSubscriber extends Subscriber{

    private long freeUsage;

    public ISPSubscriber() {
    }

    // open for modification
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(getSubscriberId());
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return  (double) chargeableData*getBaseRate()/100;
    }

    public long getFreeUsage() {
        return freeUsage;
    }

    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

}