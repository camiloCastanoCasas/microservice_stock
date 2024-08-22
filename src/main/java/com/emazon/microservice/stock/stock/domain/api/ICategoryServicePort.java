package com.emazon.microservice.stock.stock.domain.api;

import com.emazon.microservice.stock.stock.domain.model.Category;

public interface ICategoryServicePort {

    void createCategory(Category category);
}