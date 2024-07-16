package com.shopping.ecommerce.controllers;

import com.shopping.ecommerce.models.Product;
import com.shopping.ecommerce.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private final CartService cartService;
    public CartController(CartService cartservice){
        this.cartService = cartservice;
    }

    @GetMapping("/showCart")
    public Map<Product, Integer> getCart(){
        return cartService.getProductsInCart();
    }

    @PostMapping("/addToCart")
    public void addToCart(Product product){
        cartService.addProduct(product);
   }

    @DeleteMapping("/removeFromCart")
    public void removeFromCart(Product product){
        cartService.removeProduct(product);
    }

}
