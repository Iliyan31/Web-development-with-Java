package bg.uni.fmi.lab02.streams.task09;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StoreManager extends StoreManagerValidator implements Store {
    private final List<Book> booksStored;

    public StoreManager() {
        this(new LinkedList<>());
    }

    public StoreManager(List<Book> booksStored) {
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

        return booksStored.stream()
            .filter(b -> b.author().equals(author))
            .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
        validateDate(from);
        return booksStored.stream()
            .filter(b -> b.publishedYear().isAfter(from))
            .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
        validateDate(from);
        validateDate(to);
        validateFromAndToDates(from, to);

        return booksStored.stream()
            .filter(b -> b.publishedYear().isAfter(from) && b.publishedYear().isBefore(to))
            .collect(Collectors.toList());
    }

    @Override
    public void clear() {
        booksStored.clear();
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByAuthor() {
        return booksStored.stream()
            .collect(Collectors.groupingBy(Book::author));
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByPublisher() {
        return booksStored.stream()
            .collect(Collectors.groupingBy(Book::publisher));
    }

    @Override
    public List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate) {
        validatePredicate(bookPredicate);

        return booksStored.stream()
            .filter(bookPredicate)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Book b1 = new Book("a1", "Iliyan1", BigDecimal.valueOf(10.00), "Iliyan", LocalDate.of(2022, 1, 31));
        Book b2 = new Book("a2", "Iliyan2", BigDecimal.valueOf(11.00), "Iliyan1", LocalDate.of(2022, 2, 15));
        Book b3 = new Book("a3", "Iliyan1", BigDecimal.valueOf(12.00), "Iliyan", LocalDate.of(2022, 3, 16));
        Book b4 = new Book("a4", "Iliyan2", BigDecimal.valueOf(13.00), "Iliyan2", LocalDate.of(2022, 4, 17));
        Book b5 = new Book("a5", "Iliyan1", BigDecimal.valueOf(14.00), "Iliyan", LocalDate.of(2022, 5, 18));
        Book b6 = new Book("a6", "Iliyan2", BigDecimal.valueOf(15.00), "Iliyan3", LocalDate.of(2022, 6, 19));
        Book b7 = new Book("a7", "Iliyan1", BigDecimal.valueOf(16.00), "Iliyan", LocalDate.of(2022, 7, 20));
        Book b8 = new Book("a8", "Iliyan2", BigDecimal.valueOf(17.00), "Iliyan4", LocalDate.of(2022, 8, 21));
        Book b9 = new Book("a9", "Iliyan1", BigDecimal.valueOf(18.00), "Iliyan", LocalDate.of(2022, 9, 22));
        Book b10 = new Book("a10", "Iliyan2", BigDecimal.valueOf(19.00), "Iliyan5", LocalDate.of(2022, 10, 23));

        StoreManager storeManager = new StoreManager();
        storeManager.add(b1);
        storeManager.add(b2);
        storeManager.add(b3);
        storeManager.add(b4);
        storeManager.add(b5);
        storeManager.add(b6);
        storeManager.add(b7);
        storeManager.add(b8);
        storeManager.add(b9);
        storeManager.add(b10);

        //Task09

    }
}