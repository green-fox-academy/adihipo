package com.greenfoxacademy.com.piechart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApprenticeController {

  @GetMapping("/")
  public String showPieChart(){
    return "apprentice";
  }
}
