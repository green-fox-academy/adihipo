package com.greenfox.tamagochi.Controller;

import com.greenfox.tamagochi.Model.Foxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private Foxes foxes;

  @Autowired
  public MainController(Foxes foxes) {
    this.foxes = foxes;
  }

  @GetMapping("/")
  public String showMainPage(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (foxes.isThereAFoxInTheListWithThisName(name)) {
        model.addAttribute("fox", foxes.giveBackFoxFromListByName(name));
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
  public String postNameFox(@ModelAttribute(value = "name") String name) {
    foxes.createFoxByNameAndAddToList(name);
    return "redirect:/?name=" + name;
  }

}
