package com.sha.springbootmicroservice3gateway.repository;

import com.sha.springbootmicroservice3gateway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    Optional<User> findByUsername(String username);
}
