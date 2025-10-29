package com.ecommerce.ds_ecom.controllers;

import com.ecommerce.ds_ecom.model.Category;
import com.ecommerce.ds_ecom.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
@RequiredArgsConstructor
public class CategoryController
{
    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories()
    {
        return categoryService.getAllCategories();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String addCategory(@RequestBody Category category)
    {
        categoryService.addCategory(category);
        return "Category added successfully";
    }
}
