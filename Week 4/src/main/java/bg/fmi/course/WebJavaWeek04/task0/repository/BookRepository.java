package bg.fmi.course.WebJavaWeek04.task0.repository;

import bg.fmi.course.WebJavaWeek04.task0.model.Book;

import java.util.Collection;

public interface BookRepository {
    boolean add(Book book);

    void remove(Book book);

    boolean contains(Book book);

    void clear();

    Book getByIsbn(String isbn);

    Collection<Book> getAllBooks();
}