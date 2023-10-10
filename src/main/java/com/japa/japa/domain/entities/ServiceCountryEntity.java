package com.japa.japa.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "service_country")
public class ServiceCountryEntity extends AbstractBaseEntity<Long>{
    @ManyToOne(optional = false)
    private ServiceEntity service;
    @ManyToOne(optional = false)
    private CountryEntity country;
}
