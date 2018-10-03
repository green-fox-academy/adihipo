package com.greenfoxacademy.p2p.model;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessage {

  private String error;

  public ErrorMessage() {
    this.error = "";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

}
