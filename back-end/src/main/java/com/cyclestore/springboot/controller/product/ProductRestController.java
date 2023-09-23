package com.cyclestore.springboot.controller.product;

import com.cyclestore.springboot.entity.Product;
import com.cyclestore.springboot.service.IProductService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController implements IProductRestController{

    private IProductService productService;

    @Override
    public List<Product> getProducts() {
        List<Product> products = productService.getAll();
        return products;
    }
}
