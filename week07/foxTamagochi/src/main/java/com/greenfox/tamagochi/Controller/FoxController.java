package com.greenfox.tamagochi.Controller;

import com.greenfox.tamagochi.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  private FoxService foxService;

  @Autowired
  public FoxController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/feed")
  public String showFeed(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxService.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxService.giveBackFoxFromListByName(name));
        model.addAttribute("food", foxService.getFoxAmountOfFoodByNames(name));
        model.addAttribute("drink", foxService.getFoxAmountOfDrinkByNames(name));
        foxService.setFoxAmountOfFoodTo100ByNames(name);
        return "feed";
      } else {
        return "redirect:/login";
      }
    }
  }

  @GetMapping("/drink")
  public String showDrink(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxService.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxService.giveBackFoxFromListByName(name));
        model.addAttribute("food", foxService.getFoxAmountOfFoodByNames(name));
        model.addAttribute("drink", foxService.getFoxAmountOfDrinkByNames(name));
        foxService.setFoxAmountOfDrinkTo100ByNames(name);
        return "drink";
      } else {
        return "redirect:/login";
      }
    }
  }

  @GetMapping("/brush")
  public String showBrush(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxService.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxService.giveBackFoxFromListByName(name));
        model.addAttribute("food", foxService.getFoxAmountOfFoodByNames(name));
        model.addAttribute("drink", foxService.getFoxAmountOfDrinkByNames(name));
        return "brush";
      } else {
        return "redirect:/login";
      }
    }
  }

  @GetMapping("/trick")
  public String showTrick(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxService.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxService.giveBackFoxFromListByName(name));
        model.addAttribute("food", foxService.getFoxAmountOfFoodByNames(name));
        model.addAttribute("drink", foxService.getFoxAmountOfDrinkByNames(name));
        return "trick";
      } else {
        return "redirect:/login";
      }
    }
  }

}
