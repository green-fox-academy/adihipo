package com.greenfoxacademy.foxtamagochi2.Controllers;

import com.greenfoxacademy.foxtamagochi2.Repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

  private FoxRepository foxRepository;

  @Autowired
  public HomeController(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  @GetMapping("/{id}")
  public String showMainPage(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxRepository.findById(id).get());
      return "index";
    }
  }

}