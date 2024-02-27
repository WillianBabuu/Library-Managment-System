package com.kilimo.Library.book;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

    private final BookService bookService;

    // @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    
    @GetMapping
    public List<Book> getBooks(){
        return bookService.getBooks();
    } 
}