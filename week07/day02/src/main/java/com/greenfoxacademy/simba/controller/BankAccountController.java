package com.greenfoxacademy.simba.controller;

import com.greenfoxacademy.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

  @GetMapping("/")
  public String show(Model model) {
    BankAccount bankAccount1 = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", bankAccount1.getName());
    model.addAttribute("balance", bankAccount1.getBalance());
    model.addAttribute("animalType", bankAccount1.getAnimalType());
    return "bankaccount";
  }
}
