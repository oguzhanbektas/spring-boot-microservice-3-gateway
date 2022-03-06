package com.sha.springbootmicroservice3gateway.repository;

import com.sha.springbootmicroservice3gateway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    Optional<User> findByUsername(String username);
}
