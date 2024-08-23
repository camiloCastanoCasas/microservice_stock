package com.emazon.microservice.stock.stock.application.handler;

import com.emazon.microservice.stock.stock.application.dto.request.BrandRequest;

public interface IBrandHandler {

    void createBrand(BrandRequest BrandRequest);
}
