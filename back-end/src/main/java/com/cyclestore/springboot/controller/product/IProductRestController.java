package com.cyclestore.springboot.controller.product;

import com.cyclestore.springboot.entity.Product;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api")
public interface IProductRestController {

    @GetMapping("/products")
    List<Product> getProducts();
    @GetMapping("/products/{productId}")
    Product getProductsDetail(@PathVariable int productId);
    @PostMapping("/products")
    Product addProduct(@RequestBody Product product);
    @PutMapping("/products")
    Product updateProduct(@RequestBody Product product);
    @DeleteMapping("/products/{productId}")
    String deleteProduct(@PathVariable int productId);
}
