package com.japa.japa.domain.entities;

import com.japa.japa.domain.constant.CurrencyCodeTypeConstant;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "currency")
public class CurrencyEntity extends AbstractBaseEntity<Long>{
    @Column(nullable = false)
    private CurrencyCodeTypeConstant code;

    @Column(nullable = false)
    private String name;

    private String symbol;
}
