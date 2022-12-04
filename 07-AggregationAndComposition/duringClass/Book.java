public class Book {
    private String title;
    private int year;
    private String type;
    public Writer writer;
    private int currentPage;
    private boolean isOpen;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    Book(String title, int year, String type, Writer writer) {
        this.title = title;
        this.year = year;
        this.type = type;
        this.writer = writer;
    }

    public void read(int pages) {
        this.isOpen = true;
        this.currentPage += pages;
    }

    public void openAtPage(int page) {
        this.currentPage = page;
        this.isOpen = true;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public void close() {
        this.isOpen = false;
        setCurrentPage(0);
    }

    public static void main(String[] args) {
        Writer writer1 = new Writer("Jan", "Kowalski", 5, "Polish");

        Book book1 = new Book("Jakaś książka", 2022, "Biografia", writer1);

        System.out.println(book1.getCurrentPage());
        book1.openAtPage(50);
        System.out.println(book1.getCurrentPage());
        System.out.println(book1.isOpen());
        book1.read(20);
        System.out.println(book1.isOpen());
        System.out.println(book1.getCurrentPage());
        book1.close();
        System.out.println(book1.getCurrentPage());
        System.out.println(book1.isOpen());

    }
}