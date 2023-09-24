package com.cyclestore.springboot.controller.category;

import com.cyclestore.springboot.entity.Category;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
public interface ICategoryRestController {
    @GetMapping("/category")
    List<Category> getCategories();
    @GetMapping("/category/{categoryId}")
    Category getCategoriesDetail(@PathVariable int categoryId);
    @PostMapping("/category")
    Category addCategory(@RequestBody Category category);
    @PutMapping("/category")
    Category updateCategory(@RequestBody Category category);
    @DeleteMapping("/category/{categoryId}")
    String deleteCategory(@PathVariable int categoryId);
}
