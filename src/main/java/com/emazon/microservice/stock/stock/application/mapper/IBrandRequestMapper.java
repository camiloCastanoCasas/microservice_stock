package com.emazon.microservice.stock.stock.application.mapper;

import org.mapstruct.Mapper;

import com.emazon.microservice.stock.stock.application.dto.request.BrandRequest;
import com.emazon.microservice.stock.stock.domain.model.Brand;

@Mapper(componentModel = "spring")
public interface IBrandRequestMapper {

    Brand toBrand(BrandRequest BrandRequest);
}
