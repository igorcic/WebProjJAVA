package com.webjavaservice.webservices.resources;


import com.webjavaservice.webservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "Maria@gmail.com", "61 9 98995658", "123456");
        return ResponseEntity.ok().body(u);
    }
}
