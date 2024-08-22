package com.emazon.microservice.stock.stock.infraestructure.out.jpa.adapter;

import com.emazon.microservice.stock.stock.domain.exceptions.CategoryAlreadyExistsException;
import com.emazon.microservice.stock.stock.domain.model.Category;
import com.emazon.microservice.stock.stock.domain.spi.ICategoryPersistencePort;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.mapper.CategoryEntityMapper;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.repository.ICategoryRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategroyJpaAdapter implements ICategoryPersistencePort {

    private final ICategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Override
    public void createCategory(Category category) {
        if(categoryRepository.findByName(category.getName()).isPresent()) {
            throw new CategoryAlreadyExistsException("Category already exists");
        }
        categoryRepository.save(categoryEntityMapper.toEntity(category));
    }

    
    
}
