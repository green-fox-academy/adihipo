package com.greenfoxacademy.exercices.model;

import org.springframework.stereotype.Component;

@Component
public class WhatResult {

  private Object result;

  public WhatResult(){
    result = new Object();
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }
}
