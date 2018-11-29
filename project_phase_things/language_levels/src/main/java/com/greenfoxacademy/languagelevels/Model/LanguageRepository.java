package com.greenfoxacademy.languagelevels.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

  @Query("SELECT language FROM Language language GROUP BY language.name")
  List<Language> findAll();
}
