public class Book {
    private String name;
    private int yearPublishing;
    private Author authorName;

    public Book(String name, int yearPublishing, Author authorName) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.authorName = authorName;
    }

    public String getName() {
        return this.name;
    }

    public int getYearPublishing() {
        return  this.yearPublishing;
    }

    public Author getAuthorName() {
        return this.authorName;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

}
