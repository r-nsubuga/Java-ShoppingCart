package com.shopping.ecommerce.controllers;

import com.shopping.ecommerce.models.Product;
import com.shopping.ecommerce.services.CartService;
import com.shopping.ecommerce.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/addProduct")
    public boolean addProduct(Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/getProduct")
    public Optional<Product> getById(Long productId){
        return productService.getById(productId);
    }
}
