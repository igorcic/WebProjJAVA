package com.webjavaservice.webservices.repository;


import com.webjavaservice.webservices.entities.Category;
import com.webjavaservice.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
