package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

  @GetMapping("/greet")
  public String greetingForm(Model model) {
    model.addAttribute("greeting", new Greet());
    return "greet";
  }

  @PostMapping("/greet")
  public String greetingSubmit(@ModelAttribute Greet greeting) {
    return "result";
  }
}