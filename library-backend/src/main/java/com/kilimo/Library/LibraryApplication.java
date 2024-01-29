package com.kilimo.Library;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kilimo.Library.book.Book;

@SpringBootApplication
@RequestMapping()
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@GetMapping
    public List<Book> hello(){
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
