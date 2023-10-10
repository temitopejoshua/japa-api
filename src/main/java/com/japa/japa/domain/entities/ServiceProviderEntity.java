package com.japa.japa.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "service_providers")
public class ServiceProviderEntity extends AbstractBaseEntity<Long>{
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String emailAddress;
    @Column(nullable = false)
    private String phoneNumber;

    @ManyToOne(optional = false)
    private CountryEntity country;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private AddressEntity address;


}
