package com.greenfoxacademy.foxtamagochi2.Controllers;

import com.greenfoxacademy.foxtamagochi2.Repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FoxController {

  private FoxRepository foxRepository;

  @Autowired
  public FoxController(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  @GetMapping("/{id}/feed")
  public String showFeed(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
//      foxService.setFoxAmountOfFoodTo100ByNames(name);
      model.addAttribute("fox", foxRepository.findById(id).get());
      return "feed";
    }
  }

  @GetMapping("/{id}/drink")
  public String showDrink(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
//      foxService.setFoxAmountOfDrinkTo100ByNames(name);
      model.addAttribute("fox", foxRepository.findById(id).get());
      return "drink";
    }
  }

  @GetMapping("/{id}/brush")
  public String showBrush(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
//      fill needy to 100
      model.addAttribute("fox", foxRepository.findById(id).get());
      return "brush";
    }
  }

  @GetMapping("/{id}/trick")
  public String showTrick(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxRepository.findById(id).get());
      return "trick";
    }
  }

}