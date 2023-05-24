package com.example.backendspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendspring.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
