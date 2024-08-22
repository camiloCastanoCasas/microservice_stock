package com.emazon.microservice.stock.stock.infraestructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.emazon.microservice.stock.stock.domain.api.ICategoryServicePort;
import com.emazon.microservice.stock.stock.domain.spi.ICategoryPersistencePort;
import com.emazon.microservice.stock.stock.domain.usecase.CategoryUseCase;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.adapter.CategroyJpaAdapter;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.mapper.CategoryEntityMapper;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.repository.ICategoryRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ICategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Bean
    public ICategoryPersistencePort categoryPersistencePort() {
        return new CategroyJpaAdapter(categoryRepository, categoryEntityMapper);
    }

    @Bean
    public ICategoryServicePort categoryServicePort() {
        return new CategoryUseCase(categoryPersistencePort());
    }
    
}
