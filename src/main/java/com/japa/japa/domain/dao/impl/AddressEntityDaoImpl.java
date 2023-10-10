package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.AddressEntityDao;
import com.japa.japa.domain.dao.repository.AddressRepository;
import com.japa.japa.domain.entities.AddressEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressEntityDaoImpl extends CrudDaoImpl<AddressEntity, Long> implements AddressEntityDao{
    private final AddressRepository repository;
    public AddressEntityDaoImpl(AddressRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
