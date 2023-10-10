package com.japa.japa.domain.entities;

import com.japa.japa.domain.constant.ServiceAvailabilityTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "services")
public class ServiceEntity extends AbstractBaseEntity<Long>{
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ServiceAvailabilityTypeConstant availabilityType;
}
