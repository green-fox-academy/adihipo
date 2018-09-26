package com.greenfoxacademy.foxtamagochi2.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fox {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private boolean isBoy;
  private String food;
  private int hunger;
  private String drink;
  private int thirst;

  @OneToMany(cascade = CascadeType.ALL)
  private List<Trick> tricks;
  private int entertained;

  public Fox(String name, boolean isBoy) {
    this.name = name;
    this.isBoy = isBoy;
    food = "pizza";
    hunger = 100;
    drink = "lemonade";
    thirst = 100;
    tricks = new ArrayList<>();
    entertained = 100;
  }

  public Fox(Long id, String food, String drink) {
    this.id = id;
    this.food = food;
    this.drink = drink;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isBoy() {
    return isBoy;
  }

  public void setBoy(boolean boy) {
    isBoy = boy;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public int getThirst() {
    return thirst;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }

  public int getEntertained() {
    return entertained;
  }

  public void setEntertained(int entertained) {
    this.entertained = entertained;
  }
}