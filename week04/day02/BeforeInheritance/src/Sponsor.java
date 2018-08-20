package com.company;

public class Sponsor {
  String name;
  int age;
  String gender;
  String company;
  int hiredStudents;

  void Sponsor(String name, int age, String gender, String company) {
    hiredStudents = 0;
  }

  void Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }

  void hire() {
    hiredStudents++;
  }

  void introduce() {
    System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
