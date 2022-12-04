public class Chapter {
    private String titleChapter;
    private int chapterNumber;
    private int numberOfPages;
    private int startingChapterPage;

    public String getTitleChapter() {
        return titleChapter;
    }

    public void setTitleChapter(String titleChapter) {
        this.titleChapter = titleChapter;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getStartingChapterPage() {
        return startingChapterPage;
    }

    public void setStartingChapterPage(int startingChapterPage) {
        this.startingChapterPage = startingChapterPage;
    }

    public Chapter(String titleChapter, int chapterNumber, int numberOfPages, int startingChapterPage) {
        this.titleChapter = titleChapter;
        this.chapterNumber = chapterNumber;
        this.numberOfPages = numberOfPages;
        this.startingChapterPage = startingChapterPage;
    }

}
