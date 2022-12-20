public class Email extends Message {
    private String subject;
    private String address;

    public String getAddress() {
        return address;
    }

    public String getSubject() {
        return subject;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Email(String text, String subject, String address) {
        super(text);
        this.subject = subject;
        this.address = address;
    }

    public Email(String subject, String address) {
        this.subject = subject;
        this.address = address;
    }

    public void send() {
        System.out.println("Subject: " + this.subject + ". To: " + this.address + ". Mail: " + getText());
    }

}
