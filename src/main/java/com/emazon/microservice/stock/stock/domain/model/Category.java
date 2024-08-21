package com.emazon.microservice.stock.stock.domain.model;

public class Category {
    
    private Long id;
    private String name;
    private String description;

    public Category(Long id, String name, String description) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be null or empty");
        }
        if(name.length() > 50) {
            throw new IllegalArgumentException("Category name cannot be longer than 50 characters");
        }
        if(description.isEmpty()) {
            throw new IllegalArgumentException("Category description cannot be null or empty");
        }
        if(description.length() > 90) {
            throw new IllegalArgumentException("Category description cannot be longer than 255 characters");
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
