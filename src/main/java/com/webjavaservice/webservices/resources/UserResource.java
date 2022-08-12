package com.webjavaservice.webservices.resources;


import com.webjavaservice.webservices.entities.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Users> findAll(){
        Users u = new Users(1L, "Maria", "Maria@gmail.com", "61 9 98995658", "123456");
        return ResponseEntity.ok().body(u);
    }
}
