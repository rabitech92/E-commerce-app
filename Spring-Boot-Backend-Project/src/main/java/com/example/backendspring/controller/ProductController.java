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

import com.example.backendspring.model.Customer;
import com.example.backendspring.model.Product;
import com.example.backendspring.service.ProductService;


@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="http://localhost:4200" ,allowCredentials  = "true")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/savePod")
    public Product save(@RequestBody Product poro) {    
        return productService.save(poro);
    }
	
	@GetMapping("/getAllPro")
    public List<Product> modelget () {
        
        return productService.getAll();
    }

//    @GetMapping("/getAllPod")
//    public List<Product> modelget() {
//        return productService.getAll();
//    }

    
    @DeleteMapping("/deletePod/{id}")    //browser theke del korte gele @GetMapping dite hobe
    public String delete (@PathVariable Long id) {
    	productService.delete(id);
//         wareRepo.deleteById(id);
        return null;
    }
    
    @GetMapping("/getPod/{id}")
    public Product getById (@PathVariable Long id) {
        return productService.getById(id);
    }
    
    @PutMapping("/updatePod")
    public Product update (@RequestBody Product pod) {
        
        return productService.update(pod);
    }	
	

}
