package com.japa.japa.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "location")
public class LocationEntity extends AbstractBaseEntity<Long>{

    private double latitude;

    private double longitude;
}
