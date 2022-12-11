package InheritanceAndPolymorphism.project;

public class Ebook extends Book {
    private String Filename;

    public void setFilename(String filename) {
        Filename = filename;
    }

    public String getFilename() {
        return Filename;
    }

    public Ebook(String title, String author, String filename) {
        super(title, author);
        Filename = filename;
    }

    public void display() {
        System.out.println(getTitle() + ", " + getAuthor() + ", " + getFilename());
    }

    public static void main(String[] args) {
        Ebook e1 = new Ebook("Tytuł", "Nazwisko", "nazwa pliku");
        e1.display();
    }
}
