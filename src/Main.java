import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stiven", "King");
        Author author2 = new Author("Irvin", "Yalom");
        Book book1 = new Book(author1, "It", 1986);
        Book book2 = new Book(author2, "Lying on the Couch", 1996);
        //System.out.println("Название книги - " + book1.getBookName() + ", автор книги - " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + ", год издания - " + book1.getYearOfRelease());
        //System.out.println("Название книги - " + book2.getBookName() + ", автор книги - " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname() + ", год издания - " + book2.getYearOfRelease());
        //book2.setYearOfRelease(2004);
        //System.out.println("Название книги - " + book2.getBookName() + ", автор книги - " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname() + ", год издания - " + book2.getYearOfRelease());
        System.out.println(book1);
        System.out.println(book2);
    }
}