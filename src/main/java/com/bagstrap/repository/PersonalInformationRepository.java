package com.bagstrap.repository;

import com.bagstrap.entity.PersonalInformationEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonalInformationRepository extends CrudRepository<PersonalInformationEntity, Long> {
}
