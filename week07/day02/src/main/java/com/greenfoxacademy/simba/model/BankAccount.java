package com.greenfoxacademy.simba.model;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private Long id;
  private static AtomicLong incrementedId = new AtomicLong(1);
  private boolean isItKing;
  private boolean isItGoodGuy;

  public BankAccount(String name, double balance, String animalType, boolean isItKing, boolean isItGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.id = incrementedId.getAndIncrement();
    this.isItKing = isItKing;
    this.isItGoodGuy = isItGoodGuy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    DecimalFormat df = new DecimalFormat("#.00");
    return df.format(balance) + " zebra";
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public boolean isItKing() {
    return isItKing;
  }

  public void setItKing(boolean itKing) {
    isItKing = itKing;
  }

  public boolean isItGoodGuy() {
    return isItGoodGuy;
  }

  public void setItGoodGuy(boolean itGoodGuy) {
    isItGoodGuy = itGoodGuy;
  }

}
