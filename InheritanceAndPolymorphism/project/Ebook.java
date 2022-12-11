package InheritanceAndPolymorphism.project;

public class Ebook extends Book {
    private String Filename;

    public void setFilename(String filename) {
        Filename = filename;
    }

    public String getFilename() {
        return Filename;
    }

    public Ebook(String title, String author, Publisher publisher, String filename) {
        super(title, author, publisher);
        Filename = filename;
    }

    public void display() {
        System.out.println(getTitle() + ", " + getAuthor() + ", " + getFilename());
    }

}
