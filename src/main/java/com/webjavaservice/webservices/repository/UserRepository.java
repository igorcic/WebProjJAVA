package com.webjavaservice.webservices.repository;


import com.webjavaservice.webservices.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
