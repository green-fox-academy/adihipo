package com.greenfoxacademy.foxtamagochi2.Repositories;

import com.greenfoxacademy.foxtamagochi2.Models.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrickRepository extends CrudRepository<Trick, Long> {

  Trick findByName(String name);

}
