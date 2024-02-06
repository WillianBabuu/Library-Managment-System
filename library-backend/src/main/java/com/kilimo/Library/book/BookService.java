package com.kilimo.Library.book;
import java.util.List;

public class BookService {
    
    public List<Book> getBooks(){
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
