package com.emazon.microservice.stock.stock.domain.api;

import com.emazon.microservice.stock.stock.domain.model.Brand;

public interface IBrandServicePort {

    void createBrand(Brand brand);

}
