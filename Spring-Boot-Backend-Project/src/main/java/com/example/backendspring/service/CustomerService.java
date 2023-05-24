package com.example.backendspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendspring.model.Customer;
import com.example.backendspring.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	public Customer save( Customer cus) {	    
	    if(!cus.equals(null)) {
	        return customerRepository.save(cus);
	    }
	    return null;
	}

	public Customer getById(Long id) {
	Optional<Customer> op = customerRepository.findById(id);
	if(op.isPresent()) {
	    return op.get();
	}
	return null;
	}
	

	public List<Customer> getAll(){
	return customerRepository.findAll();
	}
	

	public Customer delete(Long id) {
	Optional<Customer> cutomer = customerRepository.findById(id);
	if(cutomer.isPresent()) {
		customerRepository.delete(cutomer.get());
	    return null;	       
	}
	return null;
	}


	public Customer update( Customer cus) {
	if(!cus.getId().equals(null)) {
		System.err.println(cus.toString());
	    return customerRepository.save(cus);
	}
	return null;
	}

	public List<Customer>  listinsert( List<Customer> listofCustomer) {

	return customerRepository.saveAll(listofCustomer);

	}


}
