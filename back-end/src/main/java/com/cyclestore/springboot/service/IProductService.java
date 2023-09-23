package com.cyclestore.springboot.service;

import com.cyclestore.springboot.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
}
