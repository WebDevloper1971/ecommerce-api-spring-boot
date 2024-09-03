package com.ecomm.api.services;

import com.ecomm.api.entities.Category;
import com.ecomm.api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public String save(Category category) {
        categoryRepository.save(category);
        return "Category Saved Successfully";
    }

    @Override
    public Category update(Category category) {
        return null;
    }

    @Override
    public String delete(Long id) {
        categoryRepository.deleteById(id);
        return "Category Deleted Successfully";
    }

    @Override
    public Optional<Category> getById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
