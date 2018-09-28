package com.greenfoxacademy.reddit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedditController {


  @GetMapping("/")
  public String showMain() {
    return "main";
  }

  

}
