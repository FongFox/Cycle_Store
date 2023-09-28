package com.cyclestore.springboot.controller.product;

import com.cyclestore.springboot.entity.Product;
import com.cyclestore.springboot.service.product.IProductService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRESTController implements IProductRESTController {
    private IProductService productService;

    public ProductRESTController(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public List<Product> getProducts() {
        List<Product> products = productService.getProducts();
        return products;
    }

    @Override
    public List<Product> getsProductsByCateId(int categoryId) {
        List<Product> products = productService.getProductsByCateId(categoryId);
        if (products == null) {
            throw new RuntimeException("Product not found with this category's id = " + categoryId);
        } else {
            return products;
        }
    }

    @Override
    public Product getProductsDetail(int productId) {
        Product product = productService.getProductById(productId);
        if (product == null) {
            throw new RuntimeException("Product not found with product's id = " + productId);
        } else {
            return product;
        }
    }

    @Override
    public Product addProduct(Product product) {
        product.setId(0);
        Product newProduct = productService.saveProduct(product);
        return newProduct;
    }

    @Override
    public Product updateProduct(Product product) {
        Product newProduct = productService.saveProduct(product);
        return newProduct;
    }

    @Override
    public String deleteProduct(int productId) {
        Product product = productService.getProductById(productId);
        if (product == null) {
            throw new RuntimeException("Product not found at id: " + productId);
        } else {
            productService.deleteProduct(product);
            return ("Delete complete with product id: " + productId);
        }
    }

}
