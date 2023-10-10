package com.japa.japa.domain.dao.repository;

import com.japa.japa.domain.entities.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {
}
