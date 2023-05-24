package com.example.backendspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendspring.model.Payment;
import com.example.backendspring.service.PaymentService;

	@RestController
	@CrossOrigin(origins="http://localhost:4200" ,allowedHeaders = "*")
	@RequestMapping(value="/api")
	public class PaymentController {
	
	@Autowired	
	PaymentService paymentService;
	
	@PostMapping("/savePay")
    public Payment save (@RequestBody Payment Pay) {      
    return paymentService.save(Pay);
    }
	
	@GetMapping("/getAllPay")
    public List<Payment> modelget () {
        return paymentService.getAll();
    }
	
	@DeleteMapping("/deletePay/{id}")    //browser theke del korte gele @GetMapping dite hobe
	public String delete (@PathVariable Long id) {
		paymentService.delete(id);
//	      wareRepo.deleteById(id);
	      return null;
	    }
	
	@GetMapping("/getPay/{id}")
	public Payment getById (@PathVariable Long id) {
	  return paymentService.getById(id);
	    }
	
	@PutMapping("/updatePay")
    public Payment update (@RequestBody Payment Pay) {        
        return paymentService.update(Pay);
    }	
}
