package bg.fmi.course.WebJavaWeek04.task0.service;

import bg.fmi.course.WebJavaWeek04.task0.model.Book;
import bg.fmi.course.WebJavaWeek04.task0.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class BookServiceManager extends BookServiceManagerValidator implements BookService {
    private static final int PERCENTS = 100;

    private final BookRepository booksStored;

    @Autowired
    public BookServiceManager(@Qualifier("repo") BookRepository booksStored) {
        this.booksStored = booksStored;
    }

    @Override
    public boolean add(Book o) {
        validateBookForNull(o);

        if (booksStored.contains(o)) {
            return false;
        }

        return booksStored.add(o);
    }

    @Override
    public void remove(Book o) {
        validateBookForNull(o);

        booksStored.remove(o);
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        validateAuthorName(author);

        return booksStored.getAllBooks().stream()
            .filter(b -> b.author().equals(author))
            .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
        validateDate(from);
        return booksStored.getAllBooks().stream()
            .filter(b -> b.publishedYear().isAfter(from))
            .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
        validateDate(from);
        validateDate(to);
        validateFromAndToDates(from, to);

        return booksStored.getAllBooks().stream()
            .filter(b -> b.publishedYear().isAfter(from) && b.publishedYear().isBefore(to))
            .collect(Collectors.toList());
    }

    @Override
    public void clear() {
        booksStored.clear();
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByAuthor() {
        return booksStored.getAllBooks().stream()
            .collect(Collectors.groupingBy(Book::author));
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByPublisher() {
        return booksStored.getAllBooks().stream()
            .collect(Collectors.groupingBy(Book::publisher));
    }

    @Override
    public List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate) {
        validatePredicate(bookPredicate);

        return booksStored.getAllBooks().stream()
            .filter(bookPredicate)
            .collect(Collectors.toList());
    }

    public List<Book> task09(String category, BigDecimal price) {
        return booksStored.getAllBooks().stream()
            .filter(b -> b.category().equals(category) && b.price().compareTo(price) > 0)
            .collect(Collectors.toList());
    }

    public List<Book> task10(String category) {
        return booksStored.getAllBooks().stream()
            .filter(b -> b.category().equals(category))
            .collect(Collectors.toList());
    }

    public void task11(String category, double percentsDiscount) {
        booksStored.getAllBooks().stream()
            .filter(b -> b.category().equals(category))
            .forEach(b -> b.setPrice(BigDecimal.valueOf(calculateDiscount(b, percentsDiscount))));
    }

    private double calculateDiscount(Book book, double percentsDiscount) {
        return (percentsDiscount * book.price().doubleValue()) / PERCENTS;
    }
}