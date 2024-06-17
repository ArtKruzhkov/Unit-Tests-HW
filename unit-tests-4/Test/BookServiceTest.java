import seminars.fourth.book.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        Book book = new Book("1", "Book Test Title 1", "Test Author");

        when(bookRepository.findById("1")).thenReturn(book);

        Book foundBook = bookService.findBookById("1");

        assertEquals("1", foundBook.getId());
        assertEquals("Book Test Title 1", foundBook.getTitle());
        assertEquals("Test Author", foundBook.getAuthor());

        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    public void testFindAllBooks() {
        Book book1 = new Book("1", "Book Test Title 1", "Test Author");
        Book book2 = new Book("2", "Book Test Title 2", "Test Author2");

        List<Book> books = Arrays.asList(book1, book2);

        when(bookRepository.findAll()).thenReturn(books);

        List<Book> allBooks = bookService.findAllBooks();

        assertEquals(2, allBooks.size());
        assertEquals("1", allBooks.get(0).getId());
        assertEquals("Book Test Title 1", allBooks.get(0).getTitle());
        assertEquals("Test Author", allBooks.get(0).getAuthor());
        assertEquals("2", allBooks.get(1).getId());
        assertEquals("Book Test Title 2", allBooks.get(1).getTitle());
        assertEquals("Test Author2", allBooks.get(1).getAuthor());

        verify(bookRepository, times(1)).findAll();
    }
}
