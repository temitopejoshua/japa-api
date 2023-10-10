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
@Table(name = "provider_services")
public class ProviderServicesEntity extends AbstractBaseEntity<Long>{
    @ManyToOne(optional = false)
    private ServiceProviderEntity provider;
    @ManyToOne(optional = false)
    private ServiceEntity service;
}
