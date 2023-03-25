package bg.fmi.course.WebJavaWeek04.task0.repository;

import bg.fmi.course.WebJavaWeek04.task0.model.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Repository("repo")
public class BookRepoMySQL implements BookRepository {
    //private Map<String, Book> db = new ConcurrentHashMap<>();
    private final List<Book> bookList = new LinkedList<>();

    @Override
    public boolean add(Book book) {
        return bookList.add(book);
    }

    @Override
    public Book getByIsbn(String isbn) {
        return null;
        //return db.get(isbn);
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    @Override
    public Collection<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public void remove(Book book) {
        bookList.remove(book);
    }

    @Override
    public void clear() {
        bookList.clear();
    }
}