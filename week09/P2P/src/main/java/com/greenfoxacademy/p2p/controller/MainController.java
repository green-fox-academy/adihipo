package com.greenfoxacademy.p2p.controller;

import com.greenfoxacademy.p2p.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private MainService mainService;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/")
  public String showMain() {
    return "main";
  }
}
