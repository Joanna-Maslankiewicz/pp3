public class Book {
    private String name;
    private String author;
    private String releaseDate;
    private int pageCount;
    private boolean isFictional;
    private int currentPage;

    public Book(String name, String author, String releaseDate, int pageCount, boolean isFictional) {
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pageCount = pageCount;
        this.isFictional = isFictional;
        this.currentPage = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isFictional() {
        return isFictional;
    }

    public void setFictional(boolean isFictional) {
        this.isFictional = isFictional;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void nextPage() {
        this.currentPage++;
    }

    public void previousPage() {
        this.currentPage--;
    }
}
