package com.emazon.microservice.stock.stock.domain.exceptions;

public class FieldTooLongException extends RuntimeException {
    public FieldTooLongException(String message) {
        super(message);
    } 
}
