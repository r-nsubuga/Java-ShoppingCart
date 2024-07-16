package com.shopping.ecommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue
    private Long Id;
    @Column(name="product_name")
    private String name;
    @Column(name="product_price")
    private BigDecimal price ;
    @Column(name="product_picture_url")
    private String pictureUrl;



}
