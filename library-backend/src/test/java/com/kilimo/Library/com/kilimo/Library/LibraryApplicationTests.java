package com.kilimo.Library;

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
