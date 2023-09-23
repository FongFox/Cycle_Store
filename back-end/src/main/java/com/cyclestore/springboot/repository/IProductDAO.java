package com.cyclestore.springboot.repository;

import com.cyclestore.springboot.entity.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> getAll();
}
