package com.spring.docker.project.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "product_id", nullable = false)
    private Long productId;
    @Column(name = "product_details", nullable = false)
    private String productDetails;
}