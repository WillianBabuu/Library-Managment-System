package com.kilimo.Library.category;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/category")
public class CategoryController {

    /**
     *
     */
    private final CategoryService CategoryService;
    private com.kilimo.Library.category.CategoryService categoryService;

    /**
     * @param categoryService
     */
    @Autowired

    public CategoryController(CategoryService categoryService){

        CategoryService = categoryService;
        this.categoryService = categoryService;
    }
	public List<Category> getCategories() {

		return categoryService.getCategories();
	}
}
