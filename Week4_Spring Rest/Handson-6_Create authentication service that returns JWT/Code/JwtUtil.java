package com.cognizant.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

    // Use a secure random key
    private static final Key SECRET_KEY = Keys.hmacShaKeyFor("CognizantProjectWeek4SpringRestJJWTTokenGenerationDemoProject".getBytes());

    public static String generateToken(String username) {
        long now = System.currentTimeMillis();
        long expiration = now + 120 * 60 * 1000;

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(now))
                .setExpiration(new Date(expiration))
                .signWith(SECRET_KEY, SignatureAlgorithm.HS256)
                .compact();
    }
}
