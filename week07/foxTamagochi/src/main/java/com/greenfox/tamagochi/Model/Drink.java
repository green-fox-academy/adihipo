package com.greenfox.tamagochi.Model;

import org.springframework.stereotype.Component;

@Component
public class Drink {

  private String name;
  private int amount = 100;

  public Drink() {
    this.name = "lemonade";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
