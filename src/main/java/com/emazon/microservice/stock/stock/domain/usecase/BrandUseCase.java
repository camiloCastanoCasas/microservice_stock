package com.emazon.microservice.stock.stock.domain.usecase;

import com.emazon.microservice.stock.stock.domain.api.IBrandServicePort;
import com.emazon.microservice.stock.stock.domain.model.Brand;
import com.emazon.microservice.stock.stock.domain.spi.IBrandPersistencePort;

public class BrandUseCase implements IBrandServicePort{

    private final IBrandPersistencePort brandPersistencePort;

    public BrandUseCase(IBrandPersistencePort brandPersistencePort) {
        this.brandPersistencePort = brandPersistencePort;
    }

    @Override
    public void createBrand(Brand brand) {
        brandPersistencePort.createBrand(brand);
    }

}
