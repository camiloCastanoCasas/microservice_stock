package com.emazon.microservice.stock.stock.infraestructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.emazon.microservice.stock.stock.domain.api.IBrandServicePort;
import com.emazon.microservice.stock.stock.domain.api.ICategoryServicePort;
import com.emazon.microservice.stock.stock.domain.spi.IBrandPersistencePort;
import com.emazon.microservice.stock.stock.domain.spi.ICategoryPersistencePort;
import com.emazon.microservice.stock.stock.domain.usecase.BrandUseCase;
import com.emazon.microservice.stock.stock.domain.usecase.CategoryUseCase;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.adapter.BrandJpaAdapter;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.adapter.CategroyJpaAdapter;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.mapper.BrandEntityMapper;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.mapper.CategoryEntityMapper;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.repository.IBrandRepository;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.repository.ICategoryRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ICategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;
    private final IBrandRepository brandRepository;
    private final BrandEntityMapper brandEntityMapper;

    @Bean
    public ICategoryPersistencePort categoryPersistencePort() {
        return new CategroyJpaAdapter(categoryRepository, categoryEntityMapper);
    }

    @Bean
    public ICategoryServicePort categoryServicePort() {
        return new CategoryUseCase(categoryPersistencePort());
    }

    @Bean
    public IBrandPersistencePort brandPersistencePort() {
        return new BrandJpaAdapter(brandRepository, brandEntityMapper);
    }

    @Bean
    public IBrandServicePort brandServicePort() {
        return new BrandUseCase(brandPersistencePort());
    }
    
}
