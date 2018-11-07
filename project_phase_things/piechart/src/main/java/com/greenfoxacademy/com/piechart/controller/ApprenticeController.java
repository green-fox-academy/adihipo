package com.greenfoxacademy.com.piechart.controller;

import com.greenfoxacademy.com.piechart.service.ApprenticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApprenticeController {

  private ApprenticeService apprenticeService;

  @Autowired
  public ApprenticeController(ApprenticeService apprenticeService) {
    this.apprenticeService = apprenticeService;
  }

  @GetMapping("/")
  public String showPieChart(){
    return "apprentice";
  }
}
