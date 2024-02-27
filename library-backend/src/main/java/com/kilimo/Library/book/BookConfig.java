package com.kilimo.Library.book;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {
    
    @SuppressWarnings("null")
    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository){
        return args -> {
            Book iceFire = new Book(
				"Song of Ice and Fire",
				"George RR Matrin",
				"Science Fiction",
				"A fantasy world story of westeros",
				2011,
				true,
				true, LocalDate.now(), LocalDate.now()
			);
            Book fireBlood = new Book(
				"Fire and Blood",
				"George RR Matrin",
				"Science Fiction",
				"A fantasy world story of westeros",
				2011,
				true,
				true, LocalDate.now(), LocalDate.now()
			);
            repository.saveAll(
                List.of(iceFire,fireBlood)
            );
        };
    }
}
