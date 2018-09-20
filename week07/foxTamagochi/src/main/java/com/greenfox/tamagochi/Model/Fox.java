package com.greenfox.tamagochi.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {

  private String name;
  private String gender;
  private Food food;
  private Drink drink;
  private List<Trick> tricks;

  public Fox() {
    tricks = new ArrayList<>();
    food = new Food();
    drink = new Drink();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Food getFood() {
    return food;
  }

  public Drink getDrink() {
    return drink;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
