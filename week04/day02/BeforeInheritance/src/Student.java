package com.company;

public class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  void Student(String name, int age, String gender, String previousOrganization) {
    skippedDays = 0;
  }

  void Student() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "School of Life";
    skippedDays = 0;
  }

  void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  void introduce() {
    System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  void getGoal() {
    System.out.println("Be a junior software developer.");
  }
}
