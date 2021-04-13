package com.example.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.corse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
