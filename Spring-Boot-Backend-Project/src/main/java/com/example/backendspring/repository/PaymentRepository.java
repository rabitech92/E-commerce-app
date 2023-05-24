package com.example.backendspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendspring.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{
	
}
