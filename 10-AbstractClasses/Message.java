public abstract class Message {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Message(String text) {
        this.text = text;
    }

    public Message() {
        this.text = "";
    }

    public int charNumber() {
        int count = 0;
        for (int i = 0; i < this.text.length(); i++) {
            count++;
        }
        return count;
    }

    public abstract void send();

}
