package com.company;

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  @Override
  public String land() {
    return "lands with gears";
  }

  @Override
  public String fly() {
    return "flies with propeller";
  }

  @Override
  public String takeOff() {
    return "takes off vertically";
  }
}
