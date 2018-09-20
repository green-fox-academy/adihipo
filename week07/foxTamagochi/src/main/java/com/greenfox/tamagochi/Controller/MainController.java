package com.greenfox.tamagochi.Controller;

import com.greenfox.tamagochi.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private Fox fox;

  @Autowired
  public MainController(Fox fox) {
    this.fox = fox;
  }

  @GetMapping("/")
  public String showMainPage(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      if (name.equals(fox.getName())) {
        model.addAttribute("nameOfFox", fox.getName());
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
    fox.setName(name);
    return "redirect:/?name=" + name;
  }

}
