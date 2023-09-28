package com.cyclestore.springboot.controller.product;

import com.cyclestore.springboot.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
public interface IProductRESTController {
    @GetMapping("/products")
    List<Product> getProducts();

    @GetMapping("/products/cate={categoryId}")
    List<Product> getsProductsByCateId(@PathVariable int categoryId);

    @GetMapping("/products/pro={productId}")
    Product getProductsDetail(@PathVariable int productId);

    @PostMapping("/products")
    Product addProduct(@RequestBody Product product);

    @PutMapping("/products")
    Product updateProduct(@RequestBody Product product);

    @DeleteMapping("/products/{productId}")
    String deleteProduct(@PathVariable int productId);
}
