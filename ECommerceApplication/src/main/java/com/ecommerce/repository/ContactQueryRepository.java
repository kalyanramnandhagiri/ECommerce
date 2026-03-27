package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.ContactQuery;

public interface ContactQueryRepository extends JpaRepository<ContactQuery, Long> {
}