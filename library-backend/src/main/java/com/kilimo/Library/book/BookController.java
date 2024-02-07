package com.kilimo.Library.book;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

    // @AutoWired 
    public BookController(BookService bookService){
        new BookService();
    }
    
    @GetMapping
    public List<Book> getBook(BookService bookService){
        return bookService.getBooks();
    } 
}
