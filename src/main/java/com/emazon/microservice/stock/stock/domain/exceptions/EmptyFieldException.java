package com.emazon.microservice.stock.stock.domain.exceptions;

public class EmptyFieldException extends RuntimeException {
    public EmptyFieldException(String message) {
        super(message);
    }
}