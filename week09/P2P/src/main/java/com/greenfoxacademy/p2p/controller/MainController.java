package com.greenfoxacademy.p2p.controller;

import com.greenfoxacademy.p2p.model.User;
import com.greenfoxacademy.p2p.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private MainService mainService;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/")
  public String redirectToRegister() {
    return "redirect:/register";
  }

  @GetMapping("/{id}")
  public String showMain(@PathVariable(value = "id") Long id) {
    if (mainService.isUnregisteredUser(id))
      return "redirect:/register";

    return "main";
  }

  @GetMapping("/register")
  public String showRegister(Model model) {
    mainService.createEmptyUser(model);
    return "register";
  }

  @PostMapping("/register")
  public String postUser(@ModelAttribute(value = "user") User user) {
    if (mainService.isUserNameNull(user))
      return "redirect:/register";

    if (mainService.isUserAlreadyExist(user.getName()))
      return "redirect:/" + mainService.getIdByName(user.getName());

    mainService.saveNameToUser(user);
    return "redirect:/" + user.getId();
  }

}
