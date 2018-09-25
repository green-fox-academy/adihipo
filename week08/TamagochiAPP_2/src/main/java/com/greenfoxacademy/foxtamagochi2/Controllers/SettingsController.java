package com.greenfoxacademy.foxtamagochi2.Controllers;

import com.greenfoxacademy.foxtamagochi2.Models.Fox;
import com.greenfoxacademy.foxtamagochi2.Repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SettingsController {

  private FoxRepository foxRepository;

  @Autowired
  public SettingsController(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  @GetMapping("/login")
  public String showGiveNameGetFox() {
    return "login";
  }

  @PostMapping("/login")
  public String postNameFox(@ModelAttribute(value = "name") String name, @ModelAttribute(value = "gender") boolean isBoy) {
    if (foxRepository.findByName(name).size() == 0) {
      foxRepository.save(new Fox(name, isBoy));
      return "redirect:/" + foxRepository.findByName(name).get(0).getId();
    }
    return "redirect:/login";
  }

  @GetMapping("/nutritionstore")
  public String showNutritionStore(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxRepository.findById(id).get());
      return "nutritionstore";
    }
  }

  @PostMapping("/{id}/nutritionstore")
  public String postNutritionsOfFox(@PathVariable(value = "id") Long id, @ModelAttribute(value = "food") String food, @ModelAttribute(value = "drink") String drink) {
    foxRepository.save(new Fox(id, food, drink));
    return "redirect:/" + id;
  }

  @GetMapping("/{id}/trickcenter")
  public String showTrickCenter(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxRepository.findById(id).get());
      return "trickcenter";
    }
  }

  @PostMapping("/{id}/trickcenter")
  public String postNutritionsOfFox(@PathVariable(value = "id") Long id, @ModelAttribute(value = "trick") String trick) {
    foxRepository.findById(id);
    return "redirect:/" + id;
  }

  @GetMapping("/allfoxes")
  public String showAllFoxes(Model model) {
    model.addAttribute("foxes", foxRepository.findAll());
    return "allfoxes";
  }
}
