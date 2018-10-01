package com.greenfoxacademy.exercices.service;

import com.greenfoxacademy.exercices.model.Result;
import com.greenfoxacademy.exercices.model.Until;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionService {

  private Until until;
  private Result result;

  @Autowired
  public ActionService(Until until, Result result) {
    this.until = until;
    this.result = result;
  }

  public void doOneActionAccordingToAction(String action, Until until) {
    if (action.equals("sum")) {
      sum(until);
    }
    if (action.equals("factor")) {
      factor(until);
    }
  }

  public void sum(Until until) {
    long summa = 0;
    for (int i = 0; i <= until.getUntil(); i++) {
      summa += i;
    }
    result.setResult(summa);
  }

  public void factor(Until until) {
    long multi = 1;
    for (int i = 1; i <= until.getUntil(); i++) {
      multi *= i;
    }
    result.setResult(multi);
  }

  public Until getUntil() {
    return until;
  }

  public void setUntil(Until until) {
    this.until = until;
  }

  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

}
