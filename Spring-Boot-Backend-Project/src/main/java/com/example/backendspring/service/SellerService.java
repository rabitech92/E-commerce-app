package com.example.backendspring.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.backendspring.model.Seller;
import com.example.backendspring.repository.SellerRepository;




@Service
public class SellerService {
	
@Autowired	
SellerRepository sellerRepository;  

public Seller save( Seller cat) {
    
    if(!cat.equals(null)) {
        return sellerRepository.save(cat);
    }
    return null;
}

public Seller getById(Long id) {
Optional<Seller> op = sellerRepository.findById(id);

if(op.isPresent()) {
    return op.get();
}

return null;
}

public List<Seller> getAll(){
return sellerRepository.findAll();
}

public Seller delete (Long id) {
Optional<Seller> op = sellerRepository.findById(id);
if(op.isPresent()) {
	sellerRepository.delete(op.get());
    return null;
    
    
    
}
return null;

}


public Seller update( Seller cat) {

if(!cat.equals(null)) {
    return sellerRepository.save(cat);
}
return null;
}

public List<Seller>  listinsert( List<Seller> listofProducts) {

return sellerRepository.saveAll(listofProducts);

}

}
