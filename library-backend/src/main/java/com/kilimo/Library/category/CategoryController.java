package com.kilimo.Library.category;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(path="api/v1/category")
public class CategoryController {

    /**
     * @param categoryService
     */
    // @Autowired

    public CategoryController(CategoryService categoryService){
    }

    @GetMapping
    public List<Category> getCategory(CategoryService categoryService){
        return categoryService.getCategories();
    } 
}
