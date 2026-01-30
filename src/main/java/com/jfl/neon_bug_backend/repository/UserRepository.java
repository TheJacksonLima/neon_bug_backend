package com.jfl.neon_bug_backend.repository;

import com.jfl.neon_bug_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}