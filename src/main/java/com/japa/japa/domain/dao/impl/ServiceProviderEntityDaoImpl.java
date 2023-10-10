package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.ServiceProviderEntityDao;
import com.japa.japa.domain.dao.repository.ServiceProviderRepository;
import com.japa.japa.domain.entities.ServiceProviderEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceProviderEntityDaoImpl extends CrudDaoImpl<ServiceProviderEntity, Long> implements ServiceProviderEntityDao {
    private final ServiceProviderRepository repository;
    public ServiceProviderEntityDaoImpl(ServiceProviderRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
