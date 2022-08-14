package com.webjavaservice.webservices.repository;


import com.webjavaservice.webservices.entities.Category;
import com.webjavaservice.webservices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
