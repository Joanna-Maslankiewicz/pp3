package project;

public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void display() {
        super.display();
        System.out.printf("czas trwania: %02d:%02d", getMinutes(), getSeconds());
        System.out.println();
    }

    public Audiobook(String title, Writer writer, Publisher publisher, int yearOfPublication, int minutes,
            int seconds) {
        super(title, writer, publisher, yearOfPublication);
        this.minutes = minutes;
        this.seconds = seconds;
    }

}
