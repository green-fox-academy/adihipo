package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


  @RequestMapping("/greeting")
  public Greeting greet(@RequestParam(name = "name") String name) {
    Greeting greet = new Greeting(name);
    return greet;
  }
}
