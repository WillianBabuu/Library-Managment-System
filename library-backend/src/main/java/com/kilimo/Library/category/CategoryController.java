package com.kilimo.Library.category;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/category")
public class CategoryController {

    private final CategoryService CategoryService;

    @Autowired

    public CategoryController(CategoryService categoryService){

        this.categoryService = clone()ategoryService;
    }
	public List<Category> getCategories() {
        
		return categoryService.getCategories();
	}
}
