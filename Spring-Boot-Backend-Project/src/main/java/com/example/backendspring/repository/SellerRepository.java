package com.example.backendspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendspring.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>  {

}
