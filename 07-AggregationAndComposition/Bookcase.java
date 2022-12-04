import java.util.ArrayList;

public class Bookcase {
    private String ownerName;
    private int numberOfBooks;
    private ArrayList<Book> books = new ArrayList<>();

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
        this.numberOfBooks = this.books.size();
    }

    public void removeBook(Book book) {
        this.books.remove(book);
        this.numberOfBooks = this.books.size();
    }

    public String toString() {
        String toString = "";
        if (this.books.size() == 0) {
            return toString + "There are no books in this bookcase";
        } else {
            toString += "There are " + numberOfBooks + " books in this bookcase: \n";
            for (Book book : this.books) {
                toString += book.toString() + "\n";
            }
        }
        return toString;
    }

    public static void main(String[] args) {
        Bookcase bookcase1 = new Bookcase();

        Book b1 = new Book("Harry Potter", 2001, "fantastyka", new Writer("J.K.", "Rowling", 25, "British"));
        Book b2 = new Book("Mały Książę", 1943, "literatura dziecięca",
                new Writer("Antonine", "de Saint Exupery", 20, "French"));

        bookcase1.addBook(b1);
        bookcase1.addBook(b2);
        System.out.println(bookcase1.toString());

        Book b3 = new Book("Słownik", 2002, "słownik", new Writer("Jan", "Kowalski", 12, "Polish"));
        bookcase1.addBook(b3);
        System.out.println(bookcase1.toString());

        bookcase1.removeBook(b2);
        System.out.println(bookcase1.toString());
    }
}