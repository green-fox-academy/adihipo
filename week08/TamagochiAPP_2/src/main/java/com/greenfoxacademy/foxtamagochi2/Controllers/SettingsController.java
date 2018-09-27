package com.greenfoxacademy.foxtamagochi2.Controllers;

import com.greenfoxacademy.foxtamagochi2.Models.Fox;
import com.greenfoxacademy.foxtamagochi2.Models.Trick;
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
  public String showGiveNameGetFox(Model model) {
    model.addAttribute("fox", new Fox());
    return "login";
  }

  @PostMapping("/login")
  public String postNameFox(@ModelAttribute(value = "fox") Fox fox) {
    if (foxRepository.findByName(fox.getName()).size() == 0) {
      foxRepository.save(fox);
      return "redirect:/" + foxRepository.findByName(fox.getName()).get(0).getId();
    }
    return "redirect:/login";
  }

  @GetMapping("/{id}/nutritionstore")
  public String showNutritionStore(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxRepository.findById(id).orElse(null));
      return "nutritionstore";
    }
  }

  @PostMapping("/{id}/nutritionstore")
  public String postNutritionsOfFox(@PathVariable(value = "id") Long id, @ModelAttribute(value = "fox") Fox fox) {
    foxRepository.findById(id).get().setFood(fox.getFood());
    foxRepository.findById(id).get().setDrink(fox.getDrink());
    foxRepository.save(foxRepository.findById(id).get());
    return "redirect:/" + id;
  }

  @GetMapping("/{id}/trickcenter")
  public String showTrickCenter(@PathVariable(required = false, value = "id") Long id, Model model) {
    if (id == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxRepository.findById(id).orElse(null));
      return "trickcenter";
    }
  }

  @PostMapping("/{id}/trickcenter")
  public String postNutritionsOfFox(@PathVariable(value = "id") Long id, @ModelAttribute(value = "trick") String trick) {
    foxRepository.findById(id).get().getTricks().add(new Trick(trick));
    foxRepository.save(foxRepository.findById(id).get());
    return "redirect:/" + id;
  }

  @GetMapping("/allfoxes")
  public String showAllFoxes(Model model) {
    model.addAttribute("foxes", foxRepository.findAll());
    return "allfoxes";
  }
}
