package com.example.template.security;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;
import java.util.Date;
@Component
public class JwtUtil {
    private static final String SECRET_KEY = "your-256-bit-secret-key-here-1234567890abcdef"; // Replace with secure key
    private static final long EXPIRATION_TIME = 86400000; // 24 hours
    public String generateToken(String username, String role) {
        return Jwts.builder()
                .subject(username)
                .claim("role", role)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
                .compact();
    }
}
