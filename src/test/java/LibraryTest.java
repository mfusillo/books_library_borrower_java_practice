import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        book1 = new Book("Horror", "At The Mountains Of Madness", "H.P. Lovecraft");
        book2 = new Book("Fantasy", "The Silmarillion", "J.R.R. Tolkien");
        book3 = new Book("Drama", "Norwegian Wood", "Haruki Murakami");
        library = new Library(2);

    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getTotalBooks());
    }

    @Test
    public void cannotAddBookIfCapacityReached(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getTotalBooks());
    }


}
