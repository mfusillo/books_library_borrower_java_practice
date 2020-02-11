import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        if(this.capacity > getTotalBooks()) {
            this.books.add(book);
        }
    }

    public Book removeBook(){
        return this.books.remove(0);
    }

    public int getTotalBooks(){
        return this.books.size();
    }

    public void loanBook(Borrower borrower){
        if(getTotalBooks() > 0){
            borrower.addBook(removeBook());
        }
    }

}
