package com.greenfoxacademy.simba.model;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private Long id;
  private static AtomicLong incrementedId = new AtomicLong(1);

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.id = incrementedId.getAndIncrement();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
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
}
