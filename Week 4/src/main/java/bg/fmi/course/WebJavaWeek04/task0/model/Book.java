package bg.fmi.course.WebJavaWeek04.task0.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private BigDecimal price;
    private String publisher;
    private LocalDate publishedYear;
    private String category;
    private String isbn;

    public Book(String title, String author, BigDecimal price, String publisher, LocalDate publishedYear,
                String category, String isbn) {
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

        if (category == null || category.isEmpty() || category.isBlank()) {
            throw new IllegalArgumentException("The book category cannot be null, empty or blank!");
        }

        if (isbn == null || isbn.isEmpty() || isbn.isBlank()) {
            throw new IllegalArgumentException("The book isbn cannot be null, empty or blank!");
        }

        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.category = category;
        this.isbn = isbn;
    }

    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    public BigDecimal price() {
        return price;
    }

    public String publisher() {
        return publisher;
    }

    public LocalDate publishedYear() {
        return publishedYear;
    }

    public String category() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishedYear(LocalDate publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        return title.equals(book.title) && author.equals(book.author) && price.equals(book.price) &&
            publisher.equals(book.publisher) && publishedYear.equals(book.publishedYear) &&
            category.equals(book.category) && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, publisher, publishedYear, category, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            ", publisher='" + publisher + '\'' +
            ", publishedYear=" + publishedYear +
            ", category='" + category + '\'' +
            ", isbn='" + isbn + '\'' +
            '}';
    }
}