package com.greenfox.tamagochi.Model;

import org.springframework.stereotype.Component;

@Component
public class Trick {

  private String name;

  public Trick() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
