package com.khan.code.Taskify.REST.API.service;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public class JwtServiceImpl implements JwtService {

    @Value("${spring.jwt.secret}")
    private String SECRET_KEY;
    @Value("${spring.jwt.expiration}")
    private long JWT_EXPIRATION;

    @Override
    public String extractUsername(String token) {
        return "";
    }

    @Override
    public boolean isTokenValid(String token, UserDetails userDetails) {
        return false;
    }

    @Override
    public String generateToken(Map<String, Object> claims, UserDetails userDetails) {
        return "";
    }
}
