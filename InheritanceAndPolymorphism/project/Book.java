package InheritanceAndPolymorphism.project;

public class Book {
    private String title;
    private Publisher publisher;
    private int yearOfPublication;
    private Writer writer;

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
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
                "tytuł: " + getTitle() + ", autor: " + writer.getFirstName() + " " + writer.getLastName()
                        + ", wydawca: " + publisher.getName() + ", miasto: "
                        + publisher.getCity()
                        + ", rok wydania: " + getYearOfPublication() + ", gatunek literacki: "
                        + writer.getLiteraryGenre());
    }

    public Book(String title, Writer writer, Publisher publisher, int yearOfPublication) {
        this.title = title;
        this.writer = writer;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Dawid", "Myśliwiec", "popularno naukowy");
        Publisher p1 = new Publisher("Altenberg", "Warszawa");
        Book b1 = new Book("7 cząsteczek", w1, p1, 2022);
        b1.display();
    }
}