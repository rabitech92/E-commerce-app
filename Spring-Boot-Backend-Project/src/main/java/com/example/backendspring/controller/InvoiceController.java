package com.example.backendspring.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backendspring.model.Invoice;
import com.example.backendspring.service.InvoiceService;

import java.util.List;


@RestController
@CrossOrigin(origins="http://localhost:4200" ,allowedHeaders = "*")
@RequestMapping(value="/api")
public class InvoiceController{
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {

        this.invoiceService = invoiceService;
    }

    @GetMapping("/allInv")
    public ResponseEntity<List<Invoice>> getAllInvoices(){
        List<Invoice> invoices = invoiceService.findAllInvoices();
        return new ResponseEntity<>(invoices, HttpStatus.OK);
    }

    @PostMapping("/addInv")
    public ResponseEntity<Invoice> addInvoice(@RequestBody Invoice invoice){
        Invoice newInvoice = invoiceService.addInvoice(invoice);
        return new ResponseEntity<>(newInvoice, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteInv/{id}")
    public ResponseEntity<?> deleteInvoice(@PathVariable("id") Long id){
        invoiceService.deleteInvoice(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateInv")
    public ResponseEntity<Invoice> updateInvoice(@RequestBody Invoice invoice){
        Invoice updateInvoice = invoiceService.updateInvoice(invoice);
        return new ResponseEntity<>(updateInvoice, HttpStatus.OK);
    }

}
