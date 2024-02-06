package com.kilimo.Library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootTest
class LibraryApplicationTests {

	@Test
	void contextLoads() {
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		extracted();
	}
	/**
	 * 
	 */
	private static void extracted() {
		SpringApplication.run(LibraryApplicationTests.class);
	}
	/**
	 * @return
	 */
	@GetMapping
	public List<category> hello() {
		return List.of(
				new category(
						1,
						"Mariam"

				)
		);
	}



}
