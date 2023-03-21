package bg.uni.fmi.lab02.streams.task09;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Book(String title, String author, BigDecimal price, String publisher, LocalDate publishedYear) {
    public Book {
        if (title == null || title.isEmpty() || title.isBlank()) {
            throw new IllegalArgumentException("The title of the book cannot be null, empty or blank!");
        }

        if (author == null || author.isEmpty() || author.isBlank()) {
            throw new IllegalArgumentException("The author of the book cannot be null, empty or blank!");
        }

        if (price.compareTo(BigDecimal.valueOf(0)) < 0) {
            throw new IllegalArgumentException("The price of the book cannot be negative!");
        }

        if (publisher == null || publisher.isEmpty() || publisher.isBlank()) {
            throw new IllegalArgumentException("The publisher of the book cannot be null, empty or blank!");
        }

        if (publishedYear == null || publishedYear.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("The published year cannot be after now!");
        }
    }
}