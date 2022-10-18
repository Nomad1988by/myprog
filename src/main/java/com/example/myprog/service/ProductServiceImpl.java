package com.example.myprog.service;

import com.example.myprog.model.Product;
import com.example.myprog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    @Override
    public Product findByIdIProduct(Long id) {

        return productRepository.getReferenceById(id);
    }

    @Override
    public List<Product> findAllByIdProducts() {

        return productRepository.findAll();
    }
}
