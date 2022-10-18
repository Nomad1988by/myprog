package com.example.myprog.repository;

import com.example.myprog.model.Invoice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    @Query(value = "SELECT id FROM bdzttn ORDER BY id", nativeQuery = true)
    Invoice findByIdInvoice(Long id);
    @Query(value = "SELECT * FROM bdzttn ORDER BY id", nativeQuery = true)
    List<Invoice> findAllByIdInvoices();
}
