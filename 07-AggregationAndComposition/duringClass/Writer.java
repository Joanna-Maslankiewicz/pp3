public class Writer {
    private String name;
    private String surname;
    private int numberOfWrittenBooks;
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfWrittenBooks() {
        return numberOfWrittenBooks;
    }

    public void setNumberOfWrittenBooks(int numberOfWrittenBooks) {
        this.numberOfWrittenBooks = numberOfWrittenBooks;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Writer(String name, String surname, int numberOfWrittenBooks, String nationality) {
        this.name = name;
        this.surname = surname;
        this.numberOfWrittenBooks = numberOfWrittenBooks;
        this.nationality = nationality;
    }

}