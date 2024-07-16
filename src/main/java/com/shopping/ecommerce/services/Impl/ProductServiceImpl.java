package com.shopping.ecommerce.services.Impl;

import com.shopping.ecommerce.models.Product;
import com.shopping.ecommerce.repository.ProductRepository;
import com.shopping.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepo){
        productRepository = productRepo;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public boolean addProduct(Product product){
        productRepository.save(product);
        return true;
    }

    public Optional<Product> getById(Long id){
        return productRepository.findById(id);
    }
}
