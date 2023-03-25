//package bg.fmi.course.WebJavaWeek04.service;
//
//import bg.fmi.course.WebJavaWeek04.model.Book;
//import bg.fmi.course.WebJavaWeek04.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Predicate;
//
//@Service
//public class BookServiceImpl implements BookService{
//    @Autowired
//    private final BookRepository bookRepository;
//
//    @Autowired
//    public BookServiceImpl(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    @Override
//    public boolean add(Book book) {
////        Book bookByIsbn = bookRepository.getByIsbn()
////        if (bookByIsbn == null) {
////            return false;
////        }
//
//        if (book == null) {
//            return false;
//        }
//
//        return bookRepository.add(book);
//    }
//
//    @Override
//    public void remove(Book o) {
//
//    }
//
//    @Override
//    public List<Book> getAllBooksByAuthor(String author) {
//        return null;
//    }
//
//    @Override
//    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
//        return null;
//    }
//
//    @Override
//    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
//        return null;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public Map<String, List<Book>> getAllBooksGroupByAuthor() {
//        return null;
//    }
//
//    @Override
//    public Map<String, List<Book>> getAllBooksGroupByPublisher() {
//        return null;
//    }
//
//    @Override
//    public List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate) {
//        return null;
//    }
//}
