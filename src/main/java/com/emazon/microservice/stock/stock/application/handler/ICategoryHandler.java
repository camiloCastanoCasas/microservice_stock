package com.emazon.microservice.stock.stock.application.handler;

import com.emazon.microservice.stock.stock.application.dto.request.CategoryRequest;

public interface ICategoryHandler {

    void createCategory(CategoryRequest createCategoryRequest);

}
