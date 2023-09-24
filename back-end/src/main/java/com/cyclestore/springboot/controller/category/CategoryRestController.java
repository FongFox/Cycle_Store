package com.cyclestore.springboot.controller.category;

import com.cyclestore.springboot.entity.Category;
import com.cyclestore.springboot.service.category.ICategoryService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryRestController implements ICategoryRestController{
    private ICategoryService categoryService;

    public CategoryRestController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public List<Category> getCategories() {
        List<Category> categories = categoryService.getCategories();
        return categories;
    }

    @Override
    public Category getCategoriesDetail(int categoryId) {
        Category category = categoryService.getCategoryById(categoryId);
        if(category == null) {
            throw new RuntimeException("Category not found with this id: " + categoryId);
        }
        else {
            return category;
        }
    }

    @Override
    public Category addCategory(Category category) {
        category.setId(0);
        Category newCategory = categoryService.saveCategory(category);
        return newCategory;
    }

    @Override
    public Category updateCategory(Category category) {
        Category newCategory = categoryService.saveCategory(category);
        return newCategory;
    }

    @Override
    public String deleteCategory(int categoryId) {
        Category category = categoryService.getCategoryById(categoryId);
        if (category == null) {
            throw new RuntimeException("Category not found at id: " + categoryId);
        } else {
            categoryService.deleteCategory(category);
            return ("Delete complete with category id: " + categoryId);
        }
    }
}
