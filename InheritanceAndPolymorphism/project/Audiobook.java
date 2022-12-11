package InheritanceAndPolymorphism.project;

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
        System.out.println(
                getTitle() + ", " + getAuthor() + ", audiobook duration: " + getMinutes() + ":" + getSeconds());
    }

    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author, publisher);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {
        Audiobook a1 = new Audiobook("tytuł", "autor", 2, 59);
        a1.display();
    }
}
