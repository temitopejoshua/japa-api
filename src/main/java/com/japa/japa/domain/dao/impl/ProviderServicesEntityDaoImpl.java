package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.ProviderServicesEntityDao;
import com.japa.japa.domain.dao.repository.ProviderServicesRepository;
import com.japa.japa.domain.entities.ProviderServicesEntity;
import org.springframework.stereotype.Service;

@Service
public class ProviderServicesEntityDaoImpl extends CrudDaoImpl<ProviderServicesEntity, Long> implements ProviderServicesEntityDao {
    private final ProviderServicesRepository repository;
    public ProviderServicesEntityDaoImpl(ProviderServicesRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
