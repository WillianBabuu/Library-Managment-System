package com.kilimo.Library.book;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.kilimo.Library.book.Book;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {
    
    @GetMapping
    public List<Book> getStudents(){
        return List.of(
			new Book(
				1L,
				"Song of Ice and Fire",
				"George RR Matrin",
				2011
			)
		);
    } 
}
