package com.kilimo.Library.category;

import java.util.List;
import java.util.Locale.Category;

@Service
public class CategoryService {
    public List<Category> getCategories() {
		return List.of(
				new Category(
						1,
						"Mariam"

				)
		);
	}
    
}
