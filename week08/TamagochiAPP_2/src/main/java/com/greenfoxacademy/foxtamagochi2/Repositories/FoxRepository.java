package com.greenfoxacademy.foxtamagochi2.Repositories;

import com.greenfoxacademy.foxtamagochi2.Models.Fox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {

  List<Fox> findByName(String name);
}
