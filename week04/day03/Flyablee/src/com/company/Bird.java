package com.company;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    this.name = name;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public String land() {
    return "lands with feet";
  }

  @Override
  public String fly() {
    return "flies with wings";
  }

  @Override
  public String takeOff() {
    return "takes off horizontally";
  }
}
