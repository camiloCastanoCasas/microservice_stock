package com.emazon.microservice.stock.stock.infraestructure.out.jpa.mapper;

import org.mapstruct.Mapper;

import com.emazon.microservice.stock.stock.domain.model.Category;
import com.emazon.microservice.stock.stock.infraestructure.out.jpa.entity.CategoryEntity;

@Mapper(componentModel = "spring")
public interface CategoryEntityMapper {

    CategoryEntity toEntity(Category category);

}
