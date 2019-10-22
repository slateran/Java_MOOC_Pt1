public class Book {

    private String title;
    private String publisher;
    private int year;

    public Book(String title, String book, int year) {
        this.title = title;
        this.publisher = book;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }


}
