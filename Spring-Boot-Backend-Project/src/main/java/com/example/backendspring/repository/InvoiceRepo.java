package com.example.backendspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendspring.model.Invoice;


public interface InvoiceRepo extends JpaRepository<Invoice, Long> {


}
