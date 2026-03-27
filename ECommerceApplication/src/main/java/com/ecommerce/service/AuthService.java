package com.ecommerce.service;

import com.ecommerce.dto.LoginRequest;
import com.ecommerce.dto.RegisterRequest;
import com.ecommerce.dto.ResetPasswordRequest;

public interface AuthService {
	
	String register(RegisterRequest request);

    String login(LoginRequest request);
    
    String resetPassword(ResetPasswordRequest request);
    String sendOtp(String email);
}
