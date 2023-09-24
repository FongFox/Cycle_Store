package com.cyclestore.springboot.service.category;

import com.cyclestore.springboot.entity.Category;
import com.cyclestore.springboot.repository.category.CategoryDAO;
import com.cyclestore.springboot.repository.category.ICategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    private ICategoryDAO categoryDAO;

    @Autowired
    public CategoryService(ICategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    public List<Category> getCategories() {
        return categoryDAO.getCategories();
    }

    @Override
    public Category getCategoryById(int categoryId) {
        return categoryDAO.getCategoryById(categoryId);
    }

    @Transactional
    @Override
    public Category saveCategory(Category category) {
        return categoryDAO.saveCategory(category);
    }

    @Transactional
    @Override
    public void deleteCategory(Category category) {
        categoryDAO.deleteCategory(category);
    }
}
