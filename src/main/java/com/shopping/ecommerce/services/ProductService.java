package com.shopping.ecommerce.services;

import com.shopping.ecommerce.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getProducts();
    boolean addProduct(Product product);
    Optional<Product> getById(Long id);
}
