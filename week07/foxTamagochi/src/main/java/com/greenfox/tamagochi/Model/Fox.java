package com.greenfox.tamagochi.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<Trick> tricks;
  private String gender;

  public Fox() {
    tricks = new ArrayList<>();
    food = "pizza";
    drink = "lemonade";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
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
