package com.example.myprog.repository;

import com.example.myprog.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT id FROM bd_sttn ORDER BY id", nativeQuery = true)
    Product findByIdProduct(Long id);
    @Query(value = "SELECT * FROM bd_sttn ORDER BY id", nativeQuery = true)
    List<Product> findAllByIdProducts();
}
