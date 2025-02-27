package com.kafein.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String TIMESTAMP_KEY = "timestamp";
    public static final String MESSAGE_KEY = "message";
    public static final String DETAILS_KEY = "details";


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGlobalException(Exception ex, WebRequest request) {
        Map<String, Object> errorDetails = new HashMap<>();
        errorDetails.put(TIMESTAMP_KEY, LocalDateTime.now());
        errorDetails.put(MESSAGE_KEY, ex.getMessage());
        errorDetails.put(DETAILS_KEY, request.getDescription(false));

        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        Map<String, Object> errorDetails = new HashMap<>();
        errorDetails.put(TIMESTAMP_KEY, LocalDateTime.now());
        errorDetails.put(MESSAGE_KEY, ex.getMessage());
        errorDetails.put(DETAILS_KEY, request.getDescription(false));

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException ex, WebRequest request) {
        Map<String, Object> errorDetails = new HashMap<>();
        errorDetails.put(TIMESTAMP_KEY, LocalDateTime.now());
        errorDetails.put(MESSAGE_KEY, ex.getMessage());
        errorDetails.put(DETAILS_KEY, request.getDescription(false));

        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
}

