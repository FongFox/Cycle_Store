package com.cyclestore.springboot.repository.product;

import com.cyclestore.springboot.entity.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> getProducts();
    Product getProductById(int productId);
    Product saveProduct(Product product);
    void deleteProduct(Product product);
}
