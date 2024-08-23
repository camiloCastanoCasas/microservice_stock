package com.emazon.microservice.stock.stock.application.mapper;

import org.mapstruct.Mapper;

import com.emazon.microservice.stock.stock.application.dto.response.BrandResponse;
import com.emazon.microservice.stock.stock.domain.model.Brand;

@Mapper(componentModel = "spring")
public interface IBrandResponseMapper {

    BrandResponse toBrandResponse(Brand brand);
}
