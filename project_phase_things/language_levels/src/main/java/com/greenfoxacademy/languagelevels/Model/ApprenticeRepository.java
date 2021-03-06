package com.greenfoxacademy.languagelevels.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprenticeRepository extends CrudRepository<Apprentice, Long> {

  List<Apprentice> findAll();

  @Query("SELECT apprentice FROM Apprentice apprentice WHERE " +
          "EXISTS(SELECT apprentice FROM apprentice.languages languages join languages.level level WHERE "+
          "languages.name LIKE 'English' AND level.value > 1)")
  List<Apprentice> findAllFiltered();

  @Query("SELECT apprentice FROM Apprentice apprentice WHERE " +
          "EXISTS(SELECT apprentice FROM apprentice.languages languages join languages.level level WHERE "+
          "CONCAT(languages.name, level.id) IN :#{#searched} OR :#{#searched} IS NULL) GROUP BY apprentice.id")
  List<Apprentice> findAllFilteredWEB(@Param("searched") String[] searched);
}
