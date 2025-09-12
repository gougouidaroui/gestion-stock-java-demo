package com.example.template.controller;
import com.example.template.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/home")
    public ResponseEntity<?> home(@AuthenticationPrincipal User user) {
        return ResponseEntity.ok(new UserResponse(user.getUsername(), user.getRole()));
    }
    @GetMapping("/admin/dashboard")
    public ResponseEntity<?> adminDashboard() {
        return ResponseEntity.ok("Welcome to Admin Dashboard");
    }
    @GetMapping("/staff/dashboard")
    public ResponseEntity<?> staffDashboard() {
        return ResponseEntity.ok("Welcome to Staff Dashboard");
    }
    public static class UserResponse {
        private String username;
        private String role;
        public UserResponse(String username, String role) {
            this.username = username;
            this.role = role;
        }
        public String getUsername() { return username; }
        public String getRole() { return role; }
    }
}
