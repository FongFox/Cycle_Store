package com.cyclestore.springboot.controller.product;

import com.cyclestore.springboot.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/api")
public interface IProductRestController {
    @GetMapping("/products")
    List<Product> getProducts();
}
