package com.example.ecommerce_spring.repo;
//Role of class is an ORM
import com.example.ecommerce_spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Bean factrty for IoC
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
