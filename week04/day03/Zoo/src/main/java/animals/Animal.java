package main.java.animals;

public abstract class Animal {

  String name;

  public String getName(){
    return this.name;
  }

  public abstract String breed();
}
