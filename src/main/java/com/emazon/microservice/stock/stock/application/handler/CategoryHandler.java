package com.emazon.microservice.stock.stock.application.handler;

import org.springframework.stereotype.Service;

import com.emazon.microservice.stock.stock.application.dto.request.CategoryRequest;
import com.emazon.microservice.stock.stock.application.mapper.ICategoryRequestMapper;
import com.emazon.microservice.stock.stock.domain.api.ICategoryServicePort;
import com.emazon.microservice.stock.stock.domain.model.Category;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryHandler implements ICategoryHandler {

    private final ICategoryServicePort categoryServicePort;
    private final ICategoryRequestMapper categoryRequestMapper;

    @Override
    public void createCategory(CategoryRequest categoryRequest) {
        Category category = categoryRequestMapper.toCategory(categoryRequest);
        categoryServicePort.createCategory(category);
    }
    
}
