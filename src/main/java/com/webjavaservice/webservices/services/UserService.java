package com.webjavaservice.webservices.services;

import com.webjavaservice.webservices.entities.Users;
import com.webjavaservice.webservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> findAll(){
        return userRepository.findAll();
    }

    public Users findById(Long id){
        Optional<Users> obj = userRepository.findById(id);
        return obj.get();
    }
}
