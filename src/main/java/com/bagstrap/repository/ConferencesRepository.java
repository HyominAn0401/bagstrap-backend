package com.bagstrap.repository;

import com.bagstrap.entity.ConferencesEntity;
import org.springframework.data.repository.CrudRepository;

public interface ConferencesRepository extends CrudRepository<ConferencesEntity, Long> {
}
