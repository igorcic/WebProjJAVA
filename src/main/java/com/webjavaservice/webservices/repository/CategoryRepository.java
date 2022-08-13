package com.webjavaservice.webservices.repository;


import com.webjavaservice.webservices.entities.Category;
import com.webjavaservice.webservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
