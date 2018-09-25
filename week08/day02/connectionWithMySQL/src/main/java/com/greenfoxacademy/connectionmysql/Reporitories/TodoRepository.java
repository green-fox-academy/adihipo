package com.greenfoxacademy.connectionmysql.Reporitories;

import com.greenfoxacademy.connectionmysql.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();
  List<Todo> findAllByDoneFalse();

}
