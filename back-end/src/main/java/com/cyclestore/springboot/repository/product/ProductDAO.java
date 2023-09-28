package com.cyclestore.springboot.repository.product;

import com.cyclestore.springboot.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO implements IProductDAO {
    private EntityManager entityManager;

    @Autowired
    public ProductDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Product> getProducts() {
        //create get all product (query)
        TypedQuery<Product> query =
                entityManager.createQuery("from Product", Product.class);
        //execute this query
        List<Product> products = query.getResultList();
        //return data back
        return products;
    }

    @Override
    public List<Product> getProductsByCateId(int categoryId) {
        String jpql = "select p from Product p where p.category.id = :data";
        TypedQuery<Product> query = entityManager.
                createQuery(jpql, Product.class);
        query.setParameter("data", categoryId);
        List<Product> products = query.getResultList();
        return products;
//        return null;
    }

    @Override
    public Product getProductById(int productId) {
        Product product = entityManager.find(Product.class, productId);
        return product;
    }

    @Override
    public Product saveProduct(Product product) {
        return entityManager.merge(product);
    }

    @Override
    public void deleteProduct(Product product) {
        entityManager.remove(product);
    }
}
