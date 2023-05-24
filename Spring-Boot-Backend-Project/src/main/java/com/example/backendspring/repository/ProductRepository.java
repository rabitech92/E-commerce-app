package com.example.backendspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendspring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
