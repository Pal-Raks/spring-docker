package com.spring.docker.project.service;

import com.spring.docker.project.entity.Product;
import com.spring.docker.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public void savePost(Product product){
        productRepository.save(product);
    }

    public List<Product> getAllPosts(){
        return productRepository.findAll();
    }

}
