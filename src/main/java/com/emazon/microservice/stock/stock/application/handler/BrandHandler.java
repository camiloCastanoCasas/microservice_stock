package com.emazon.microservice.stock.stock.application.handler;

import org.springframework.stereotype.Service;

import com.emazon.microservice.stock.stock.application.dto.request.BrandRequest;
import com.emazon.microservice.stock.stock.application.mapper.IBrandRequestMapper;
import com.emazon.microservice.stock.stock.domain.api.IBrandServicePort;
import com.emazon.microservice.stock.stock.domain.model.Brand;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class BrandHandler implements IBrandHandler {

    private final IBrandServicePort brandServicePort;
    private final IBrandRequestMapper brandRequestMapper;

    @Override
    public void createBrand(BrandRequest brandRequest) {
        Brand brand = brandRequestMapper.toBrand(brandRequest);
        brandServicePort.createBrand(brand);
    } 
}
