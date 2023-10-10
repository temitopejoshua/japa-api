package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.ServiceEntityDao;
import com.japa.japa.domain.dao.repository.ServiceRepository;
import com.japa.japa.domain.entities.ServiceEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceEntityDaoImpl extends CrudDaoImpl<ServiceEntity, Long> implements ServiceEntityDao {
    private final ServiceRepository repository;
    public ServiceEntityDaoImpl(ServiceRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
