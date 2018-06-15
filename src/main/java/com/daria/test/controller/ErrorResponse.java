package com.daria.test.controller;

import lombok.Getter;
import lombok.Setter;

public class ErrorResponse {
    @Getter @Setter private String message;
    @Getter @Setter private String details;

    public ErrorResponse(String message, String details) {
        this.message = message;
        this.details = details;
    }

}
