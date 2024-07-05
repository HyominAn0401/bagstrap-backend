package com.bagstrap.repository;

import com.bagstrap.entity.ProjectsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProjectsRepository extends CrudRepository<ProjectsEntity, Long> {
}
