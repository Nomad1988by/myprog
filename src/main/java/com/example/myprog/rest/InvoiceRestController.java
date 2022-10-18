package com.example.myprog.rest;

import com.example.myprog.model.Invoice;
// import com.example.myprog.repository.InvoiceRepository;
import com.example.myprog.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/invoice/")
public class InvoiceRestController {
    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping(value = "/id/", method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
    public ResponseEntity<Invoice> getInvoice(@PathVariable("id") @Validated Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Invoice invoice = this.invoiceService.findByIdInvoice(id);
        if (id == null) {
            return new ResponseEntity<>(invoice, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(invoice, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
    public ResponseEntity<List<Invoice>> getAllInvoice() {
        List<Invoice> invoices = this.invoiceService.findAllByIdInvoices();
        if (invoices.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(invoices, HttpStatus.OK);
    }
}
