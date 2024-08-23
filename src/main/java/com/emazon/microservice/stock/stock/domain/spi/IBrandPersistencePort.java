package com.emazon.microservice.stock.stock.domain.spi;

import com.emazon.microservice.stock.stock.domain.model.Brand;

public interface IBrandPersistencePort {

    void createBrand(Brand brand);

}
