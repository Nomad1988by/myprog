package com.example.myprog.service;

import com.example.myprog.model.Product;

import java.util.List;

public interface ProductService {

    Product findByIdIProduct(Long id);

    List<Product> findAllByIdProducts();

}
