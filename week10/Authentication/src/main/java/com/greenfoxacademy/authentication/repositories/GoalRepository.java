package com.greenfoxacademy.authentication.repositories;

import com.greenfoxacademy.authentication.models.Goal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalRepository extends CrudRepository<Goal, Long> {

}
