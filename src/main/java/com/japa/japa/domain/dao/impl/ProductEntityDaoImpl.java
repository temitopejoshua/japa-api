package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.ProductEntityDao;
import com.japa.japa.domain.dao.repository.ProductRepository;
import com.japa.japa.domain.entities.ProductEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductEntityDaoImpl extends CrudDaoImpl<ProductEntity, Long> implements ProductEntityDao {
    private final ProductRepository repository;
    public ProductEntityDaoImpl(ProductRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
