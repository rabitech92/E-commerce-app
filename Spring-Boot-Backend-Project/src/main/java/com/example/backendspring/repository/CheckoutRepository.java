package com.example.backendspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendspring.model.CheckoutProduct;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutProduct, Integer> {

}
