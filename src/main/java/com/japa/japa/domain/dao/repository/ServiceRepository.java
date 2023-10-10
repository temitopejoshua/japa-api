package com.japa.japa.domain.dao.repository;

import com.japa.japa.domain.entities.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}
