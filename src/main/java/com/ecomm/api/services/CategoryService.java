package com.ecomm.api.services;

import com.ecomm.api.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {

    String save(Category category);

    Category update(Category category);

    String delete(Long id);

    Optional<Category> getById(Long id);

    List<Category> getAllCategories();

}
