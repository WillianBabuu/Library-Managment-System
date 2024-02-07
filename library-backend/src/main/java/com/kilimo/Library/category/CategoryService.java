package com.kilimo.Library.category;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    public List<Category> getCategories(){
        return List.of(
			new Category(
				1L,
				"Song of Ice and Fire",
				1
			)
		);
    } 
}
