public class Book {
    private String title;
    private int yearPublishing;
    private String author;

    public Book(String title, int yearPublishing, String author) {
        this.title = title;
        this.yearPublishing = yearPublishing;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}



