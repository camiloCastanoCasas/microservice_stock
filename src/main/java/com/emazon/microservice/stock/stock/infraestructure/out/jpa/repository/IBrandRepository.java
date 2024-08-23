package com.emazon.microservice.stock.stock.infraestructure.out.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emazon.microservice.stock.stock.infraestructure.out.jpa.entity.BrandEntity;

public interface IBrandRepository extends JpaRepository<BrandEntity, Long> {

    Optional<BrandEntity> findByName(String name);

}
