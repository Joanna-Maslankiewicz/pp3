package project;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf = new ArrayList<>();

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void display() {
        for (Book book : shelf) {
            book.display();
        }
    }

    public void addBook(Book book) {
        this.shelf.add(book);
    }

    public static void main(String[] args) {
        Library l1 = new Library();
        Book book1 = new Book("tytul", "autor");
        l1.addBook(book1);
        Ebook ebook1 = new Ebook("abc", "abcd", "asdujbjhdbc");
        Ebook ebook2 = new Ebook("asdhjbcka", "blablabla", "aaiusdfbcls");
        l1.addBook(ebook1);
        l1.addBook(ebook2);
        Audiobook audio1 = new Audiobook("iushvu", "shbkbdk", 23, 3);
        Audiobook audio2 = new Audiobook("hsdbi", "asdybgjc", 34, 43);
        l1.addBook(audio1);
        l1.addBook(audio2);
        l1.display();
    }
}
