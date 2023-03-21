package bg.uni.fmi.lab02.streams.task09;

import java.time.LocalDate;
import java.util.function.Predicate;

public abstract class StoreManagerValidator {
    void validateBookForNull(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("The book to add cannot be null!");
        }
    }

    void validateAuthorName(String author) {
        if (author == null || author.isEmpty() || author.isBlank()) {
            throw new IllegalArgumentException("The author name cannot be null, empty or blank!");
        }
    }

    void validateDate(LocalDate from) {
        if (from == null || from.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("The from date cannot be null or after now!");
        }
    }

    void validateFromAndToDates(LocalDate from, LocalDate to) {
        if (from.isAfter(to)) {
            throw new IllegalArgumentException("The from date cannot be after to date!");
        }
    }

    void validatePredicate(Predicate<Book> bookPredicate) {
        if (bookPredicate == null) {
            throw new IllegalArgumentException("The given predicate cannot be null!");
        }
    }
}