package com.cognizant.springlearn.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String user = getUser(authHeader);

        String token = generateJwt(user);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }

    private String getUser(String authHeader) {

        String encodedCredentials = authHeader.substring(6);

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String credentials = new String(decodedBytes);

        return credentials.split(":")[0];
    }

    private String generateJwt(String user) {

        return Jwts.builder()
                .setSubject(user)
                .signWith(
                        SignatureAlgorithm.HS256,
                        "secretkey"
                )
                .compact();
    }
}
