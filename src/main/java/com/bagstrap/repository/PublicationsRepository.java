package com.bagstrap.repository;

import com.bagstrap.entity.PublicationsEntity;
import org.springframework.data.repository.CrudRepository;

public interface PublicationsRepository extends CrudRepository<PublicationsEntity, Long> {
}
