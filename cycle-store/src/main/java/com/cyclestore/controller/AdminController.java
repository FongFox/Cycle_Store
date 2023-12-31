package com.cyclestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/")
    public String home() {
        return "redirect:/admin/products";
    }
    
    @GetMapping("/products")
    public String getProducts(HttpServletRequest request, Model model) {
    	return "admin/product.html";
    }
}
