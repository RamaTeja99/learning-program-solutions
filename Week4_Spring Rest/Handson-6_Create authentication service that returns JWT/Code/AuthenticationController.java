package com.cognizant.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.util.JwtUtil;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        String[] values = credentials.split(":", 2);
        String username = values[0];
        String password = values[1];

        if (!username.equals("user") || !password.equals("pwd")) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = JwtUtil.generateToken(username);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}

