package com.spring.docker.project.repository;

import com.spring.docker.project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProductId(Long productId);
    @Override
    List<Product> findAll();


}