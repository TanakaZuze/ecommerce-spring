package com.example.ecommerce_spring.service;

import com.example.ecommerce_spring.model.Product;
import com.example.ecommerce_spring.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
//this is a bean component associated with the IOC theory...
@Service
public class ProductService {
//    a way of letting know whic class is being detailed
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
//    getting product by id
    public Product getProductById(int id) {
        return productRepository.findById(id).get();
    }

}
