package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.LocationEntityDao;
import com.japa.japa.domain.dao.repository.LocationRepository;
import com.japa.japa.domain.entities.LocationEntity;
import org.springframework.stereotype.Service;

@Service
public class LocationEntityDaoImpl extends CrudDaoImpl<LocationEntity, Long> implements LocationEntityDao {
    private final LocationRepository repository;
    public LocationEntityDaoImpl(LocationRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
