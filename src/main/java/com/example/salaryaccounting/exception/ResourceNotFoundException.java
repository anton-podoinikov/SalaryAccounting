package com.example.salaryaccounting.exception;

import org.springframework.http.ResponseEntity;

public class ResourceNotFoundException  extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
