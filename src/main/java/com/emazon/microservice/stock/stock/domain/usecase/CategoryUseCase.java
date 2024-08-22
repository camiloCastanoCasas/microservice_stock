package com.emazon.microservice.stock.stock.domain.usecase;

import com.emazon.microservice.stock.stock.domain.api.ICategoryServicePort;
import com.emazon.microservice.stock.stock.domain.model.Category;
import com.emazon.microservice.stock.stock.domain.spi.ICategoryPersistencePort;

public class CategoryUseCase implements ICategoryServicePort {

    private final ICategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }
 
    @Override
    public void createCategory(Category category) {
        categoryPersistencePort.createCategory(category); 
    }
    
}
