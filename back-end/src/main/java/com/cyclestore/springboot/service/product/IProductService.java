package com.cyclestore.springboot.service.product;

import com.cyclestore.springboot.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();

    List<Product> getProductsByCateId(int categoryId);

    Product getProductById(int productId);

    Product saveProduct(Product product);

    void deleteProduct(Product product);
}
