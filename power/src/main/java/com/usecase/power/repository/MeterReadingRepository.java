package com.usecase.power.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.usecase.power.model.MeterReading;

@RepositoryRestResource
public interface MeterReadingRepository extends CrudRepository<MeterReading, Long> {

}
