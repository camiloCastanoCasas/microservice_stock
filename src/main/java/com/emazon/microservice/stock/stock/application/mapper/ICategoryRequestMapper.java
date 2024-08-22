package com.emazon.microservice.stock.stock.application.mapper;

import org.mapstruct.Mapper;

import com.emazon.microservice.stock.stock.application.dto.request.CategoryRequest;
import com.emazon.microservice.stock.stock.domain.model.Category;

@Mapper(componentModel = "spring")
public interface ICategoryRequestMapper {

    Category toCategory(CategoryRequest createCategoryRequest);
}
