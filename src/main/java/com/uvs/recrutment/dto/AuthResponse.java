package com.uvs.recrutment.dto;

public class AuthResponse {
    private String token;
    private String message;
    private String role;
    private Long userId;

    public AuthResponse(String token, String message, String role, Long userId) {
        this.token = token;
        this.message = message;
        this.role = role;
        this.userId = userId;
    }

    // Getters and Setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
