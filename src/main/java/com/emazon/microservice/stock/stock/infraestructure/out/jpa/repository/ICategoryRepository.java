package com.emazon.microservice.stock.stock.infraestructure.out.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emazon.microservice.stock.stock.infraestructure.out.jpa.entity.CategoryEntity;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByName(String name);
}
