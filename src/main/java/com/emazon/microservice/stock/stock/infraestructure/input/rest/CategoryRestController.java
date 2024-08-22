package com.emazon.microservice.stock.stock.infraestructure.input.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


import com.emazon.microservice.stock.stock.application.dto.request.CategoryRequest;
import com.emazon.microservice.stock.stock.application.handler.ICategoryHandler;

import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryRestController {

    private final ICategoryHandler categoryHandler;

    @Operation(summary = "Create a new category")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Category created", content = @Content),
        @ApiResponse(responseCode = "409", description = "Category already exists", content = @Content)
    })
    @PostMapping("/create")
    public ResponseEntity<Void> createCategory(@RequestBody CategoryRequest createCategoryRequest) {
        categoryHandler.createCategory(createCategoryRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
}
