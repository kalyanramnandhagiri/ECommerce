package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.WishlistDto;
import com.ecommerce.entity.Wishlist;

public interface WishlistService {
	Wishlist addToWishlist(WishlistDto wishlistDto);

    List<Wishlist> getWishlistByEmail(String email);

    int getWishlistCount(String email);

    void removeWishlistItem(Long wishlistId);
}
