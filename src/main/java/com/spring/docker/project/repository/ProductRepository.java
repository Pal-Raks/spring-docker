package com.spring.docker.project.repository;

import com.spring.docker.project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByPostId(Long postId);
    @Override
    List<Product> findAll();


}