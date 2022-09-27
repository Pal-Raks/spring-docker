package com.spring.docker.project.controller;

import com.spring.docker.project.entity.Product;
import com.spring.docker.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping("/testget")
    public ResponseEntity test(){
        return new ResponseEntity<>("dgaggfad",HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllPosts(){
        return new ResponseEntity<>(productService.getAllPosts(), HttpStatus.OK);
    }
    @PostMapping("/products")
    public ResponseEntity<Product> createPost(@RequestBody Product product){
        productService.savePost(product);
        return new ResponseEntity<>(product,HttpStatus.CREATED);
    }
}
