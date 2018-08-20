package com.company;

public class Mentor {
  String name;
  int age;
  String gender;
  String level;

  void Mentor(String name, int age, String gender, String level) {

  }

  void Mentor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }

  void introduce() {
    System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + " " + level + " mentor.");
  }

  void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
