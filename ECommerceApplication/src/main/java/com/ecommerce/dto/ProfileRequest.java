package com.ecommerce.dto;

import lombok.Data;

@Data
public class ProfileRequest {
    private String fullName;
    private String phone;
    private String address;
    private String bio;
    private String profileImage;
}