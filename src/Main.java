public class Main {
    public static void main(String[] args) {
        Author stepan = new Author("Stepan", "Kuznetsov");
        printAuthor(stepan);
        Author roman = new Author("Roman", "Zvezdniy");
        printAuthor(roman);


        Book superBook = new Book("superBook", 2010, stepan);
        printBook(superBook);
        superBook.setYearPublishing(2009);
        printBook(superBook);

        Book megaBook = new Book("megaBook", 2012, roman);
        printBook(megaBook);
        megaBook.setYearPublishing(2013);
        printBook(megaBook);
    }
    public static void printBook(Book nameBook) {
        System.out.println(nameBook.getName() + " " + nameBook.getYearPublishing() + " " + nameBook.getAuthorName());
    }

    public static void printAuthor(Author nameAuthor) {
        System.out.println(nameAuthor.getName()+" "+nameAuthor.getSurname());
    }
}