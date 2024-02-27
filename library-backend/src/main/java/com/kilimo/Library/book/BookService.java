package com.kilimo.Library.book;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository){
		this.bookRepository = bookRepository;
	}

    public List<Book> getBooks(){
        return bookRepository.findAll();
    } 

	// new Book(
	// 			1L,
	// 			"Song of Ice and Fire",
	// 			"George RR Matrin",
	// 			"Science Fiction",
	// 			"A fantasy world story of westeros",
	// 			2011,
	// 			true,
	// 			true, null, null
	// 		)
}
