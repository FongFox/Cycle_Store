package com.cyclestore.springboot.repository;

import com.cyclestore.springboot.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO implements IProductDAO{
    private EntityManager entityManager;

    @Autowired
    public ProductDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Product> getAll() {
        //create get all product (query)
        TypedQuery<Product> query =
                entityManager.createQuery("from product", Product.class);
        //execute this query
        List<Product> products = query.getResultList();
        //return data back
        return products;
    }
}
