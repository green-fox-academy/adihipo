package com.greenfoxacademy.com.piechart.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenticeRepository extends CrudRepository<Apprentice, Long> {

}
