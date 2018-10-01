package com.greenfoxacademy.exercices.model;

import org.springframework.stereotype.Component;

@Component
public class Append {

  private String appended;

  public Append() {

  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

}
