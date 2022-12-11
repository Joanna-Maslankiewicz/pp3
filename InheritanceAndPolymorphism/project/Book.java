package InheritanceAndPolymorphism.project;

public class Book {
    private String title;
    private String author;
    private Publisher publisher;
    private int yearOfPublication;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

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

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void display() {
        System.out.println(
                "tytuł: " + getTitle() + ", autor: " + getAuthor() + ", wydawca: " + publisher.getName() + ", miasto: "
                        + publisher.getCity()
                        + ", rok wydania: " + getYearOfPublication());
    }

    public Book(String title, String author, Publisher publisher, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    public static void main(String[] args) {
        Publisher p1 = new Publisher("Altenberg", "Warszawa");
        Book b1 = new Book("7 cząsteczek", "Dawid Myśliwiec", p1, 2022);
        b1.display();
    }
}