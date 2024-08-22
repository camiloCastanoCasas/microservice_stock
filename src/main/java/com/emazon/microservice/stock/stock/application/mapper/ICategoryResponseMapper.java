package com.emazon.microservice.stock.stock.application.mapper;

import org.mapstruct.Mapper;

import com.emazon.microservice.stock.stock.application.dto.response.CategoryResponse;
import com.emazon.microservice.stock.stock.domain.model.Category;

@Mapper(componentModel = "spring")
public interface ICategoryResponseMapper {

    CategoryResponse toCategoryResponse(Category category);

}
