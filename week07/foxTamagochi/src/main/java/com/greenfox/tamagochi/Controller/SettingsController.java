package com.greenfox.tamagochi.Controller;

import com.greenfox.tamagochi.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SettingsController {

  private FoxService foxService;

  @Autowired
  public SettingsController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/login")
  public String showGiveNameGetFox() {
    return "login";
  }

  @PostMapping("/login")
  public String postNameFox(@ModelAttribute(value = "name") String name, @ModelAttribute(value = "gender") String gender) {
    foxService.createFoxByNameAndAddToList(name);
    foxService.giveBackFoxFromListByName(name).setGender(gender);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/nutritionstore")
  public String showNutritionStore(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxService.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxService.giveBackFoxFromListByName(name));
        return "nutritionstore";
      } else {
        return "redirect:/login";
      }
    }
  }

  @PostMapping("/nutritionstore")
  public String postNutritionsOfFox(@RequestParam(value = "name") String name, @ModelAttribute(value = "food") String food, @ModelAttribute(value = "drink") String drink) {
    foxService.setFoxFoodByNames(name, food);
    foxService.setFoxDrinkByNames(name, drink);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/trickcenter")
  public String showTrickCenter(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxService.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxService.giveBackFoxFromListByName(name));
        return "trickcenter";
      } else {
        return "redirect:/login";
      }
    }
  }

  @PostMapping("/trickcenter")
  public String postNutritionsOfFox(@RequestParam(value = "name") String name, @ModelAttribute(value = "trick") String trick) {
    if (!foxService.doesFoxKnowThisTrickByNames(name, trick)) {
      foxService.addAFoxATrickByNames(name, trick);
    }
    return "redirect:/?name=" + name;
  }

  @GetMapping("/allfoxes")
  public String showAllFoxes(Model model) {
    if (foxService.getFoxes().isEmpty()) {
      return "redirect:/login";
    } else {
      model.addAttribute("foxes", foxService);
      return "allfoxes";
    }
  }

}
