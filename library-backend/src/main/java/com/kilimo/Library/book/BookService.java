package com.kilimo.Library.book;
import java.util.List;

import com.kilimo.Library.book.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    public List<Book> getBooks(){
        return List.of(
			new Book(
				1L,
				"Song of Ice and Fire",
				"George RR Matrin",
				"Science Fiction",
				"A fantasy world story of westeros",
				2011,
				true,
				true
			)
		);
    } 
}
