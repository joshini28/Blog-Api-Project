package com.thejoshini.BLOG_REST_API.repository;

import com.thejoshini.BLOG_REST_API.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}