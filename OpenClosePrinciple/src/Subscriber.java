
// Base class which will be extended from other classes
public abstract class Subscriber {

    private Long subscriberId;

    private String address;

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    private Long phoneNumber;

    private int baseRate;

    abstract double calculateBill();

}
