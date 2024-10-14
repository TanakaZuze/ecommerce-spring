package com.example.ecommerce_spring.controller;

import com.example.ecommerce_spring.model.Product;
import com.example.ecommerce_spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/")
    public String greeting() {
        return "Welcome to the store";
    }

    //method to return all products
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }

}
