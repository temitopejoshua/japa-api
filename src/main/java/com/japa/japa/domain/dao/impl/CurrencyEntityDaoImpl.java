package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.CurrencyEntityDao;
import com.japa.japa.domain.dao.repository.CurrencyRepository;
import com.japa.japa.domain.entities.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyEntityDaoImpl extends CrudDaoImpl<CurrencyEntity, Long> implements CurrencyEntityDao {
    private final CurrencyRepository repository;
    public CurrencyEntityDaoImpl(CurrencyRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
