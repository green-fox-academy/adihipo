package com.greenfoxacademy.listtodosh2.Respository;


import com.greenfoxacademy.listtodosh2.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
