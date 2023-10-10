package com.japa.japa.domain.dao.repository;

import com.japa.japa.domain.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
