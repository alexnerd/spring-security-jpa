package com.alexnerd.springsecurityjpa;

import java.util.Optional;

import com.alexnerd.springsecurityjpa.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findByUserName(String userName);
}