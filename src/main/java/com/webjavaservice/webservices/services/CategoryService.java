package com.webjavaservice.webservices.services;

import com.webjavaservice.webservices.entities.Category;
import com.webjavaservice.webservices.entities.Order;
import com.webjavaservice.webservices.repository.CategoryRepository;
import com.webjavaservice.webservices.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
