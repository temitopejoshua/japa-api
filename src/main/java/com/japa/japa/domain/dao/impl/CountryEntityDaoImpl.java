package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.CountryEntityDao;
import com.japa.japa.domain.dao.repository.CountryRepository;
import com.japa.japa.domain.entities.CountryEntity;
import org.springframework.stereotype.Service;

@Service
public class CountryEntityDaoImpl extends CrudDaoImpl<CountryEntity, Long> implements CountryEntityDao {
    private final CountryRepository repository;
    public CountryEntityDaoImpl(CountryRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
