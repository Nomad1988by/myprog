package com.example.myprog.service;

import com.example.myprog.model.Invoice;

import java.util.List;

public interface InvoiceService {

    Invoice findByIdInvoice(Long id);

    List<Invoice> findAllByIdInvoices();

}
