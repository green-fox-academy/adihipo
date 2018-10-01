package com.greenfoxacademy.exercices.service;

import com.greenfoxacademy.exercices.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreeterService {

  private Greeting greeting;

  @Autowired
  public GreeterService(Greeting greeting) {
    this.greeting = greeting;
  }

  public void generateMessage(String name, String title) {
    greeting.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
  }


  public Greeting getGreeting() {
    return greeting;
  }

  public void setGreeting(Greeting greeting) {
    this.greeting = greeting;
  }
}
