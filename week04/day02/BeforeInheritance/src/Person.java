package com.company;

public class Person {
  String name;
  int age;
  String gender;

  void Person(String name, int age, String gender) {

  }

  void Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  void introduce() {
    System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + ".");
  }

  void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
