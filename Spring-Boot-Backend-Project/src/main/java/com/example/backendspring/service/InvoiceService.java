package com.example.backendspring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendspring.model.Invoice;
import com.example.backendspring.repository.InvoiceRepo;

import java.util.List;


@Service
public class InvoiceService {
	@Autowired
    private final InvoiceRepo invoiceRepo;

    @Autowired
    public InvoiceService(InvoiceRepo invoiceRepo) {
        this.invoiceRepo = invoiceRepo;
    }

    public List<Invoice> findAllInvoices(){
        return invoiceRepo.findAll();
    }


    public Invoice addInvoice(Invoice invoice){
        return invoiceRepo.save(invoice);
    }


     public void deleteInvoice(Long id){
        try{
            invoiceRepo.deleteById(id);
        }
        catch (Exception e){
            throw e;
        }

     }

    public Invoice updateInvoice(Invoice invoice) {
        return invoiceRepo.save(invoice);
    }
}
