package com.raczkowski.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

    public String generateToken(String username) {
        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS512, "my-secret")
                .setSubject(username)
                .compact();
    }

}
