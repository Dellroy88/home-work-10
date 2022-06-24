public class Book {
    private final Author author;
    private final String bookName;
    int yearOfRelease;

    public Book(Author author, String bookName, int yearOfRelease) {
        this.author = author;
        this.bookName = bookName;
        this.yearOfRelease = yearOfRelease;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int newYearOfRelease) {
        this.yearOfRelease = newYearOfRelease;
    }

    public String toString() {
        return "Автор " + this.author + " название книги " + this.bookName + " год выпуска " + this.yearOfRelease;
    }
}
