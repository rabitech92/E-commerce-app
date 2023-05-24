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

import com.example.backendspring.model.Seller;
import com.example.backendspring.service.SellerService;

@RestController
@CrossOrigin(origins="http://localhost:4200" ,allowedHeaders = "*")
@RequestMapping(value="/api")
public class SellerController {
	
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/save")
    public Seller save (@RequestBody Seller cat) {
        
        
        return sellerService.save(cat);
    }

    @GetMapping("/getAll")
    public List<Seller> modelget () {

        return sellerService.getAll();
    }

    @DeleteMapping("/delete/{id}")    //browser theke del korte gele @GetMapping dite hobe
    public String delete (@PathVariable Long id) {


        sellerService.delete(id);
//         wareRepo.deleteById(id);
        return null;
    }
    
    @GetMapping("/get/{id}")
    public Seller getById (@PathVariable Long id) {

        return sellerService.getById(id);
    }
    
    @PutMapping("/update")
    public Seller update (@RequestBody Seller cat) {
        
        return sellerService.update(cat);
    }
    

    


}
