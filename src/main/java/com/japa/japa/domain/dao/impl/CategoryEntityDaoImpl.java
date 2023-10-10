package com.japa.japa.domain.dao.impl;

import com.japa.japa.domain.dao.CategoryEntityDao;
import com.japa.japa.domain.dao.repository.CategoryRepository;
import com.japa.japa.domain.entities.CategoryEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoryEntityDaoImpl extends CrudDaoImpl<CategoryEntity,Long> implements CategoryEntityDao {
    private final CategoryRepository repository;
    public CategoryEntityDaoImpl(CategoryRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
