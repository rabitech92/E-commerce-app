package com.example.backendspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendspring.model.Product;
import com.example.backendspring.repository.ProductRepository;



@Service
public class ProductService {
	
	@Autowired	
	ProductRepository productRepository;  

	public Product save( Product pod) {
	     if(!pod.equals(null)) {
	        return productRepository.save(pod);
	    }
	    return null;
	}

	public Product getById(Long id) {
	Optional<Product> op = productRepository.findById(id);
	if(op.isPresent()) {
	    return op.get();
	}

	return null;
	}

	public List<Product> getAll(){
	return productRepository.findAll();
	}

	public Product delete(Long id) {
	Optional<Product> por = productRepository.findById(id);
	if(por.isPresent()) {
		productRepository.delete(por.get());
	    return null;	    
	 	}
	return null;
	}


	public Product update(Product poro) {
	if(!poro.equals(null)) {
	    return productRepository.save(poro);
	}
	return null;
	}

	public List<Product>  listinsert( List<Product> listofProducts) {
	return productRepository.saveAll(listofProducts);

	}

	

}
