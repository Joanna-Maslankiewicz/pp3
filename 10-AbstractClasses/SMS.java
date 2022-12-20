public class SMS extends Message {
    int phoneNumber;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SMS(String text, int phoneNumber) {
        super(text);
        this.phoneNumber = phoneNumber;
    }

    public SMS(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void send() {
        System.out.println("SMS: " + getText() + ". To: " + this.phoneNumber);
    }

}
