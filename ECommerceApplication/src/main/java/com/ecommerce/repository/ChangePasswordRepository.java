package com.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.ChangePassword;

public interface ChangePasswordRepository extends JpaRepository<ChangePassword, Long> {
	Optional<ChangePassword> findByEmail(String email);
}
