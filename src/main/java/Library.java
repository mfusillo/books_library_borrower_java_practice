import java.lang.reflect.Array;
import java.util.ArrayList;

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

    public int getTotalBooks(){
        return this.books.size();
    }

}
