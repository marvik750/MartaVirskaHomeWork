package Task2;

public class Book {

    private String author;
    private int year;
    private String title;
    private int pageCount;

    public Book() {
        this.author = author;
        this.year = year;
        this.title = title;
        this.pageCount = pageCount;
    }

    public Book(String author, int year, String title, int pageCount) {
        this.author = author;
        this.year = year;
        this.title = title;
        this.pageCount = pageCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPageCount(int pCount) {
        this.pageCount = pCount;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    @Override
    public String toString() {
        return "Autors: " + author + "\nizlaiduma gads: " + year + "\ngrāmatas nosaukums: " + title + "\nlappušu skaits: " + pageCount;
    }
}
