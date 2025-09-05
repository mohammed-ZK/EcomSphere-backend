package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Category;
import com.jacoEx.ecomsphere_backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category insert (Category category) {
        return categoryRepository.save(category);
    }

    public List< Category > getAllCategorys () {
        return categoryRepository.findAll();
    }

    public Optional< Category > getCategoryById (Integer id) {
        return categoryRepository.findById(id);
    }

    public Category updateCategory (Integer id , Category categoryDetails) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("category not found with id: " + id));
        category.setName(categoryDetails.getName());
        return categoryRepository.save(category);
    }

    public void deleteCategory (Integer id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("category not found with id: " + id));
        categoryRepository.delete(category);
    }
}
