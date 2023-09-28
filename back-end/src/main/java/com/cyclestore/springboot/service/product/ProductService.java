package com.cyclestore.springboot.service.product;

import com.cyclestore.springboot.entity.Product;
import com.cyclestore.springboot.repository.product.IProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private IProductDAO productDAO;

    @Autowired
    public ProductService(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> getProducts() {
        return productDAO.getProducts();
    }

    @Override
    public List<Product> getProductsByCateId(int categoryId) {
        return productDAO.getProductsByCateId(categoryId);
    }

    @Override
    public Product getProductById(int productId) {
        return productDAO.getProductById(productId);
    }

    @Transactional
    @Override
    public Product saveProduct(Product product) {
        return productDAO.saveProduct(product);
    }

    @Transactional
    @Override
    public void deleteProduct(Product product) {
        productDAO.deleteProduct(product);
    }

}
