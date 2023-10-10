package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.ServiceCountryEntityDao;
import com.japa.japa.domain.dao.repository.ServiceCountryRepository;
import com.japa.japa.domain.entities.ServiceCountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceCountryEntityDaoImpl extends CrudDaoImpl<ServiceCountryEntity, Long> implements ServiceCountryEntityDao {
    private final ServiceCountryRepository repository;
    public ServiceCountryEntityDaoImpl(ServiceCountryRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
