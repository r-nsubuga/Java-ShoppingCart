package com.shopping.ecommerce.services;

import com.shopping.ecommerce.models.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface CartService {
    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    BigDecimal getTotal();
}
