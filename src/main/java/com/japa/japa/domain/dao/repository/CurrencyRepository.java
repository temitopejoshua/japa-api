package com.japa.japa.domain.dao.repository;

import com.japa.japa.domain.entities.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Long> {
}
