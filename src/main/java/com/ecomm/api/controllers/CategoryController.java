package com.ecomm.api.controllers;


import com.ecomm.api.entities.Category;
import com.ecomm.api.services.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryService;

    @PostMapping
    public String saveCategory(@RequestBody Category category){
        categoryService.save(category);
        return "category saved successfully";
    }

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }



}
