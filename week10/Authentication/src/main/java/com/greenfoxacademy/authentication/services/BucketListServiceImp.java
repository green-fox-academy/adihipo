package com.greenfoxacademy.authentication.services;

import com.greenfoxacademy.authentication.models.Goal;
import com.greenfoxacademy.authentication.repositories.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucketListServiceImp implements BucketListService {

  private GoalRepository goalRepository;

  @Autowired
  public BucketListServiceImp(GoalRepository goalRepository) {
    this.goalRepository = goalRepository;
  }

  @Override
  public List<Goal> getAllGoalsAsList() {
    return goalRepository.findAll();
  }

  @Override
  public void saveNewGoal(Goal goal) {
    goalRepository.save(goal);
  }

}
