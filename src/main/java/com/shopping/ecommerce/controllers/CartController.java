package com.shopping.ecommerce.controllers;

import com.shopping.ecommerce.models.Product;
import com.shopping.ecommerce.services.CartService;
import com.shopping.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class CartController {
    @Autowired
    private final CartService cartService;
    private final ProductService productService;
    public CartController(CartService cartservice, ProductService productService){
        this.cartService = cartservice;
        this.productService = productService;
    }

    @GetMapping("/cart")
    public Map<Product, Integer> getCart(){
        return cartService.getProductsInCart();
    }

    @GetMapping("/addToCart")
   public void addToCart(Product product){
        cartService.addProduct(product);
   }

    @GetMapping("/removeFromCart")
    public void removeFromCart(Product product){
        cartService.removeProduct(product);
    }

}
