package com.japa.japa.domain.dao.repository;

import com.japa.japa.domain.entities.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
}
