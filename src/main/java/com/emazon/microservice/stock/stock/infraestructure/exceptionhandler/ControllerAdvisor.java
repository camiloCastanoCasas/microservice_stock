package com.emazon.microservice.stock.stock.infraestructure.exceptionhandler;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.emazon.microservice.stock.stock.domain.exceptions.CategoryAlreadyExistsException;
import com.emazon.microservice.stock.stock.domain.exceptions.EmptyFieldException;
import com.emazon.microservice.stock.stock.domain.exceptions.FieldTooLongException;

@ControllerAdvice
public class ControllerAdvisor {
    
    private static final String MESSAGE = "message";

    @ExceptionHandler(EmptyFieldException.class)
    public ResponseEntity<Map<String,String>> handleEmptyFieldException(EmptyFieldException e) {
        return ResponseEntity.badRequest().body(Collections.singletonMap(MESSAGE, e.getMessage()));
    }

    @ExceptionHandler(CategoryAlreadyExistsException.class)
    public ResponseEntity<Map<String,String>> handleCategoryAlreadyExistsException(CategoryAlreadyExistsException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(Collections.singletonMap(MESSAGE, e.getMessage()));
    }

    @ExceptionHandler(FieldTooLongException.class)
    public ResponseEntity<Map<String,String>> handleFieldTooLongException(FieldTooLongException e) {
        return ResponseEntity.badRequest().body(Collections.singletonMap(MESSAGE, e.getMessage()));
    }
}
