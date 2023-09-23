package com.cyclestore.springboot.service;

import com.cyclestore.springboot.entity.Product;
import com.cyclestore.springboot.repository.IProductDAO;
import com.cyclestore.springboot.repository.ProductDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    private IProductDAO productDAO;

    @Override
    public List<Product> getAll() {
        return productDAO.getAll();
    }
}
