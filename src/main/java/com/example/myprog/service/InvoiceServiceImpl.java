package com.example.myprog.service;


import com.example.myprog.model.Invoice;
import com.example.myprog.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{
    InvoiceRepository invoiceRepository;

    @Override
    public Invoice findByIdInvoice(Long id) { 
        return invoiceRepository.getReferenceById(id);
    }

    @Override
    public List<Invoice> findAllByIdInvoices() {
        return invoiceRepository.findAll();
    }



}
