package com.greenfox.tamagochi.Controller;

import com.greenfox.tamagochi.Model.Trick;
import com.greenfox.tamagochi.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String showMainPage(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxService.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxService.giveBackFoxFromListByName(name));
        model.addAttribute("isBoy", foxService.isFoxBoyByName(name));
        return "index";
      } else {
        return "redirect:/login";
      }
    }
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
    foxService.giveBackFoxFromListByName(name).setFood(food);
    foxService.giveBackFoxFromListByName(name).setDrink(drink);
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
    foxService.giveBackFoxFromListByName(name).getTricks().add(new Trick(trick));
    return "redirect:/?name=" + name;
  }

  @GetMapping("/feed")
  public String showFeed(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxService.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxService.giveBackFoxFromListByName(name));
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
        return "trick";
      } else {
        return "redirect:/login";
      }
    }
  }

}
