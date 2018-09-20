package com.greenfox.tamagochi.Model;

import org.springframework.stereotype.Component;

@Component
public class Fox {

  private String name;
//  private String food;
//  private String drink;
//  private List<Tricks> tricks;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
