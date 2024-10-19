package com.example.ecommerce_spring.controller;

import com.example.ecommerce_spring.model.Product;
import com.example.ecommerce_spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//Role of class is view and redirects
import java.util.List;
//annotation to enable Rest API
@RestController
//croos port connection
@CrossOrigin
//main redirect for the whole class as a whole
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
//    get product by id
    @GetMapping("/product/{id}")
    public Product geProductById(@PathVariable int id){
        return service.getProductById(id);
    }

}
