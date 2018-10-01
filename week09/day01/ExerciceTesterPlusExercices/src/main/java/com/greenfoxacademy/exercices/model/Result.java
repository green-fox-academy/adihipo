package com.greenfoxacademy.exercices.model;

import org.springframework.stereotype.Component;

@Component
public class Result {

  private Long result;

  public Result(){
  }

  public Long getResult() {
    return result;
  }

  public void setResult(Long result) {
    this.result = result;
  }

}
