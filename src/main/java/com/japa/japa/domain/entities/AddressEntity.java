package com.japa.japa.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "address")
public class AddressEntity extends AbstractBaseEntity<Long> {
    @Column(nullable = false, columnDefinition = "TEXT")
    private String name;

    @ManyToOne(optional = false)
    private CountryEntity country;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private LocationEntity location;


}
