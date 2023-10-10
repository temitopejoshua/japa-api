package com.japa.japa.domain.dao.repository;

import com.japa.japa.domain.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
}
