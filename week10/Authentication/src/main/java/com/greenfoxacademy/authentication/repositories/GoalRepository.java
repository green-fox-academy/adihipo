package com.greenfoxacademy.authentication.repositories;

import com.greenfoxacademy.authentication.models.Goal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends CrudRepository<Goal, Long> {

  List<Goal> findAll();

}
