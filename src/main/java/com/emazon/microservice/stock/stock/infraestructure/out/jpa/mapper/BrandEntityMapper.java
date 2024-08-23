package com.emazon.microservice.stock.stock.infraestructure.out.jpa.mapper;

import org.mapstruct.Mapper;

import com.emazon.microservice.stock.stock.domain.model.Brand;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.entity.BrandEntity;

@Mapper(componentModel = "spring")
public interface BrandEntityMapper {

    BrandEntity toEntity(Brand brand);
}
