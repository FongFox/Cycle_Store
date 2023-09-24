package com.cyclestore.springboot.service.category;

import com.cyclestore.springboot.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getCategories();
    Category getCategoryById(int categoryId);
    Category saveCategory(Category category);
    void deleteCategory(Category category);
}
