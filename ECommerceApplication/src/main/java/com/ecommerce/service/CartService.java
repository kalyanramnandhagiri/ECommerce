package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.CartDto;
import com.ecommerce.entity.Cart;

public interface CartService {

    Cart addToCart(CartDto cartDto);

    List<Cart> getCartByEmail(String email);

    int getCartCount(String email);

    Cart updateCartQuantity(Long cartId, Integer quantity);

    void removeCartItem(Long cartId);
}