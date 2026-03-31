package com.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.entity.Product;
import com.ecommerce.entity.User;
import com.ecommerce.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
	
	List<Wishlist> findByUser_Email(String email);

	Optional<Wishlist> findByUserAndProduct(User user, Product product);

	// ⭐ ADD THIS
	void deleteByProduct_Id(Long productId);
	@Modifying
	@Query("DELETE FROM Wishlist w WHERE w.product.id = :productId")
	void deleteWishlistByProductId(@Param("productId") Long productId);
}
