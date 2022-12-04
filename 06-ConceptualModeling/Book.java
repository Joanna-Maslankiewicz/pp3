public class Book {
    private String name;
    private int pageCount;
    private String authorName;
    private Boolean isEducational;

    public Book(String name, int pageCount, String authorName, Boolean isEducational) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.isEducational = isEducational;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getIsEducational() {
        return isEducational;
    }

    public void setIsEducational(Boolean isEducational) {
        this.isEducational = isEducational;
    }
}