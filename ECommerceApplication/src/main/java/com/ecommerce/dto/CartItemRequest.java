package com.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemRequest {

    private Long productId;
    private String productTitle;
    private String productImageUrl;
    private Double price;
    private Integer quantity;
}