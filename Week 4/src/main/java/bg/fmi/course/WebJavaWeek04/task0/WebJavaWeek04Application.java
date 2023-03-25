//package bg.fmi.course.WebJavaWeek04.task0;
//
//import bg.fmi.course.WebJavaWeek04.task0.model.Book;
//import bg.fmi.course.WebJavaWeek04.task0.repository.BookRepoMySQL;
//import bg.fmi.course.WebJavaWeek04.task0.service.BookService;
//import bg.fmi.course.WebJavaWeek04.task0.service.BookServiceManager;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//@SpringBootApplication
//public class WebJavaWeek04Application implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(WebJavaWeek04Application.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Book b1 =
//            new Book("a1", "Iliyan1", BigDecimal.valueOf(10.00), "Iliyan", LocalDate.of(2022, 1, 31), "Books", "1234");
//        Book b2 =
//            new Book("a2", "Iliyan2", BigDecimal.valueOf(11.00), "Iliyan1", LocalDate.of(2022, 2, 15), "Books", "1234");
//        Book b3 =
//            new Book("a3", "Iliyan1", BigDecimal.valueOf(12.00), "Iliyan", LocalDate.of(2022, 3, 16), "Entertainment",
//                "1234");
//        Book b4 = new Book("a4", "Iliyan2", BigDecimal.valueOf(13.00), "Iliyan2", LocalDate.of(2022, 4, 17), "Gaming",
//            "1234");
//        Book b5 = new Book("a5", "Iliyan1", BigDecimal.valueOf(14.00), "Iliyan", LocalDate.of(2022, 5, 18), "Romantic",
//            "1234");
//        Book b6 = new Book("a6", "Iliyan2", BigDecimal.valueOf(15.00), "Iliyan3", LocalDate.of(2022, 6, 19), "Action",
//            "1234");
//        Book b7 =
//            new Book("a7", "Iliyan1", BigDecimal.valueOf(16.00), "Iliyan", LocalDate.of(2022, 7, 20), "Comics", "1234");
//        Book b8 = new Book("a8", "Iliyan2", BigDecimal.valueOf(17.00), "Iliyan4", LocalDate.of(2022, 8, 21), "Comedy",
//            "1234");
//        Book b9 = new Book("a9", "Iliyan1", BigDecimal.valueOf(18.00), "Iliyan", LocalDate.of(2022, 9, 22), "Thriller",
//            "1234");
//        Book b10 = new Book("a10", "Iliyan2", BigDecimal.valueOf(19.00), "Iliyan5", LocalDate.of(2022, 10, 23),
//            "Entertainment", "1234");
//
//        BookService bookService = new BookServiceManager(new BookRepoMySQL());
//        bookService.add(b1);
//        bookService.add(b2);
//        bookService.add(b3);
//        bookService.add(b4);
//        bookService.add(b5);
//        bookService.add(b6);
//        bookService.add(b7);
//        bookService.add(b8);
//        bookService.add(b9);
//        bookService.add(b10);
//    }
//}