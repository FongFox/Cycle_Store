package com.cyclestore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyclestore.entity.Product;
import com.cyclestore.repository.ProductRepository;
import com.cyclestore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository repository;
	
	
	@Autowired
	public ProductServiceImpl(ProductRepository repository) {
		super();
		this.repository = repository;
	}


	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
