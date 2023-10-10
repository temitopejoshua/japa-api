package com.japa.japa.domain.dao.repository;

import com.japa.japa.domain.entities.ServiceProviderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepository extends JpaRepository<ServiceProviderEntity, Long> {
}
