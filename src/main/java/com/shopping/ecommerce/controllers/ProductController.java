package com.shopping.ecommerce.controllers;

import com.shopping.ecommerce.models.Product;
import com.shopping.ecommerce.services.CartService;
import com.shopping.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/allProducts")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping("/addProduct")
    public boolean addProduct(Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/getProduct/{productId}")
    public Optional<Product> getById(@PathVariable Long productId){
        return productService.getById(productId);
    }
}
