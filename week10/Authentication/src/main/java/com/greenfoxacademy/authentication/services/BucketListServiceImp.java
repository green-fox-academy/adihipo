package com.greenfoxacademy.authentication.services;

import com.greenfoxacademy.authentication.repositories.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BucketListServiceImp implements BucketListService {

  private GoalRepository goalRepository;

  @Autowired
  public BucketListServiceImp(GoalRepository goalRepository) {
    this.goalRepository = goalRepository;
  }

}
