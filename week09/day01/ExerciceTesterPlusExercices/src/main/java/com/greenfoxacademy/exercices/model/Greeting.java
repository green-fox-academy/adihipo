package com.greenfoxacademy.exercices.model;

import org.springframework.stereotype.Component;

@Component
public class Greeting {

  private String welcome_message;

  public Greeting() {
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

}
