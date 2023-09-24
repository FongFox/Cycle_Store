package com.cyclestore.springboot.repository.category;

import com.cyclestore.springboot.entity.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAO implements ICategoryDAO{
    private EntityManager entityManager;

    @Autowired
    public CategoryDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Category> getCategories() {
        TypedQuery<Category> query =
                entityManager.createQuery("from Category", Category.class);
        List<Category> categories = query.getResultList();
        return categories;
    }

    @Override
    public Category getCategoryById(int categoryId) {
        Category category = entityManager.find(Category.class, categoryId);
        return category;
    }

    @Override
    public Category saveCategory(Category category) {
        return entityManager.merge(category);
    }

    @Override
    public void deleteCategory(Category category) {
        entityManager.remove(category);
    }
}
