import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public int getTotalBooks(){
        return this.books.size();
    }


}
