package com.japa.japa.domain.dao.repository;

import com.japa.japa.domain.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
