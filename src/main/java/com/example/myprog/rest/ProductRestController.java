package com.example.myprog.rest;

import com.example.myprog.model.Product;
import com.example.myprog.repository.ProductRepository;
import com.example.myprog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/id/", method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
    public ResponseEntity<Product> getProduct(@PathVariable("id") @Validated Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Product product = this.productService.findByIdIProduct(id);
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.ALL_VALUE)

    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> products = this.productService.findAllByIdProducts();
        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
