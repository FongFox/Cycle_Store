package com.cyclestore.springboot.repository.category;

import com.cyclestore.springboot.entity.Category;

import java.util.List;

public interface ICategoryDAO {
    List<Category> getCategories();
    Category getCategoryById(int categoryId);
    Category saveCategory(Category category);
    void deleteCategory(Category category);
}
