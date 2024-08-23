package com.dev.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED(9999, "Uncategorized error"),
    KEY_INVALID(1000, "Uncategorized error"),
    USER_EXISTED(1002, "User already exists"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
