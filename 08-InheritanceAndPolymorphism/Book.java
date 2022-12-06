public class Book {
    protected String title;
    protected String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println(getTitle() + ", " + getAuthor());
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book b1 = new Book("7 cząsteczek", "Dawid Myśliwiec");
        b1.display();
    }
}