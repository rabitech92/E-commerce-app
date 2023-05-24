package com.example.backendspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendspring.model.Payment;
import com.example.backendspring.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	 PaymentRepository paymentRepository;
	
	public Payment save( Payment Pay) {
	    
	    if(!Pay.equals(null)) {
	        return paymentRepository.save(Pay);
	    }
	    return null;
	}
	
	
	public Payment getById(Long id) {
		Optional<Payment> op = paymentRepository.findById(id);
		if(op.isPresent()) {
		    return op.get();
		}
		return null;
		}
	
	public List<Payment> getAll(){
		return paymentRepository.findAll();
		}
	
	
	public Payment delete(Long id) {
		Optional<Payment> op = paymentRepository.findById(id);
		if(op.isPresent()) {
			paymentRepository.delete(op.get());
		    return null;  
		   }
		return null;
		}
	
	
	public Payment update(Payment Pay) {

		if(!Pay.equals(null)) {
		    return paymentRepository.save(Pay);
		}
		return null;
		}
	
	
	public List<Payment>  listinsert( List<Payment> listofProducts) {

		return paymentRepository.saveAll(listofProducts);

		}

}
