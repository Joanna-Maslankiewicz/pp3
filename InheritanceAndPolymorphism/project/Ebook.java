package project;

public class Ebook extends Book {
    private String Filename;

    public void setFilename(String filename) {
        Filename = filename;
    }

    public String getFilename() {
        return Filename;
    }

    public Ebook(String title, Writer writer, Publisher publisher, int yearOfPublication, String filename) {
        super(title, writer, publisher, yearOfPublication);
        Filename = filename;
    }

    public void display() {
        super.display();
        System.out.println("nazwa pliku: " + getFilename());
    }

}
