package com.company;

public class Main {

  public static void main(String[] args) {

    Bird goose = new Bird("Goosy");
    Helicopter heli = new Helicopter("Heli", "black", 7);
    System.out.println("What do we know about them?");
    System.out.println(goose.getName() + " is a bird which " + goose.takeOff() + " and " + goose.fly() + " and " + goose.land() + " and " + goose.breed() + ".");
    System.out.println(heli.getName() + " is a helicopter " + " which is " + heli.getColor() + " and " + heli.getAge() + " years old. It " + heli.takeOff() + " and " + heli.fly() + " and " + heli.land() + ".");
  }
}
