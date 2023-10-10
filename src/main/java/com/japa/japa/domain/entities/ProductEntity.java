package com.japa.japa.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity extends AbstractBaseEntity<Long>{
    private String name;

    private String imageURL;

    private ServiceProviderEntity provider;

    private BigDecimal amount;

    private CurrencyEntity currencyEntity;


}
