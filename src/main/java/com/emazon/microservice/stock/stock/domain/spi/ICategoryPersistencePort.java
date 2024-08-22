package com.emazon.microservice.stock.stock.domain.spi;

import com.emazon.microservice.stock.stock.domain.model.Category;

public interface ICategoryPersistencePort {
    
    void createCategory(Category category);
}