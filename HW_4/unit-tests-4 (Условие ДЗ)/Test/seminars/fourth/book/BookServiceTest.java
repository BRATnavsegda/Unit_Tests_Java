package seminars.fourth.book;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookServiceTest {

    private BookService bookService;
    private BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void testFindBookById() {
        String bookId = "777";
        Book expectedBook = new Book(bookId, "Title 666", "Author 333");
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        Book result = bookService.findBookById(bookId);

        assertEquals(expectedBook, result);
    }

    @Test
    void testFindAllBooks() {
        List<Book> expectedBooks = new ArrayList<>(Arrays.asList(
                new Book("111", "Title 10", "Author 10"),
                new Book("222", "Title 20", "Author 20")
                ));

        when(bookRepository.findAll()).thenReturn(expectedBooks);
        List<Book> result = bookService.findAllBooks();

        assertEquals(expectedBooks, result);
    }
}

// Задание 1. Ответьте письменно на вопросы:

//1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
//Использование тестовых заглушек снижает сложность тестов и позволяет
//проверять код независимо от остальной системы.

//2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
//Ответ: Заглушка Stub

//3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
//Ответ: Заглушка Mock

//4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?
//Ответ: Заглушка Fake
