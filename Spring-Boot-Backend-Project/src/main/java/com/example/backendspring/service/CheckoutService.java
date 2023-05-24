package com.example.backendspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendspring.model.CheckoutProduct;
import com.example.backendspring.repository.CheckoutRepository;

@Service
public class CheckoutService {
	
	@Autowired
	private CheckoutRepository checkoutRepository;
	
	public CheckoutProduct addProduct( CheckoutProduct ch) {
		if(!ch.equals(null)) {
			return checkoutRepository.save(ch);
		}
		return null;
	}
	
	public CheckoutProduct getCheckById(int id) {		
		return checkoutRepository.findById(id).get();
	}
	
	
	public List<CheckoutProduct> getAll(){
		return checkoutRepository.findAll();
	}
	
	public CheckoutProduct checkoutUpdate(int id,CheckoutProduct chp) {
		CheckoutProduct cp = checkoutRepository.findById(id).get();
		cp.setProductQuntity(chp.getProductQuntity());
		cp.setProduct(chp.getProduct());		
		return checkoutRepository.save(cp);
	}
	
	public void deleteCheck(CheckoutProduct chp) {
		System.out.println("Delete Successfully");
		checkoutRepository.delete(chp);
	}
	
	

}
9tyvytg9yu