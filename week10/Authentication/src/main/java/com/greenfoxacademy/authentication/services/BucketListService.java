package com.greenfoxacademy.authentication.services;

import com.greenfoxacademy.authentication.models.Goal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BucketListService {

  List<Goal> getAllGoalsAsList();

  void saveNewGoal(Goal goal);

}
