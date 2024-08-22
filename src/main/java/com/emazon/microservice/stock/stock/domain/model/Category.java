package com.emazon.microservice.stock.stock.domain.model;

import static java.util.Objects.requireNonNull;

import com.emazon.microservice.stock.stock.domain.exceptions.EmptyFieldException;
import com.emazon.microservice.stock.stock.domain.exceptions.FieldTooLongException;

public class Category {
    
    private Long id;
    private String name;
    private String description;

    public Category(Long id, String name, String description) {
        if(name.trim().isEmpty()) {
            throw new EmptyFieldException("Category name cannot be null or empty");
        }
        if(name.length() > 50) {
            throw new FieldTooLongException("Category name cannot be longer than 50 characters");
        }
        if(description.isEmpty()) {
            throw new EmptyFieldException("Category description cannot be null or empty");
        }
        if(description.length() > 90) {
            throw new FieldTooLongException("Category description cannot be longer than 90 characters");
        }
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }   
}
