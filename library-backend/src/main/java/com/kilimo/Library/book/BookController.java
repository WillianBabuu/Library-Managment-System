package com.kilimo.Library.book;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.kilimo.Library.book.BookService;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

    private final BookService bookService;

    @AutoWired 
    public BookController(BookService bookService){
        this.bookService = new BookService();
    }
    
    @GetMapping
    public List<Book> getBook(BookService bookService){
        return bookService.getBooks();
    } 
}
