package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


  @RequestMapping("/greeting")
  public Greeting greet() {
    Greeting greet = new Greeting(1, "Tsá World!");
    return greet;
  }
}
