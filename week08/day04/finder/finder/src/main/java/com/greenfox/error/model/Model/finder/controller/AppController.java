package com.greenfox.error.model.Model.finder.controller;

import com.greenfox.error.model.Model.finder.model.User;
import com.greenfox.error.model.Model.finder.service.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

  @Autowired
  UserService service;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("user", new User());
    model.addAttribute("yolo", service.getAll());
    return "main";
  }

  @PostMapping("/")
  public String create(@ModelAttribute(value = "user") User user) {
    service.save(user);
    return "redirect:/";
  }
}