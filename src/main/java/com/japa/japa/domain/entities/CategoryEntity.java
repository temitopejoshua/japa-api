package com.japa.japa.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "category")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryEntity extends AbstractBaseEntity<Long>{
    private String name;
}
