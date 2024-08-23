package com.emazon.microservice.stock.stock.infraestructure.out.jpa.adapter;

import com.emazon.microservice.stock.stock.domain.exceptions.CategoryAlreadyExistsException;
import com.emazon.microservice.stock.stock.domain.model.Brand;
import com.emazon.microservice.stock.stock.domain.spi.IBrandPersistencePort;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.mapper.BrandEntityMapper;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.repository.IBrandRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BrandJpaAdapter implements IBrandPersistencePort {

    private final IBrandRepository brandRepository;
    private final BrandEntityMapper brandEntityMapper;

    @Override
    public void createBrand(Brand brand) {
        if(brandRepository.findByName(brand.getName()).isPresent()) {
            throw new CategoryAlreadyExistsException("Brand already exists");
        }
        brandRepository.save(brandEntityMapper.toEntity(brand));
    }
    
}
