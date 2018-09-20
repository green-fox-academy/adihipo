package com.greenfox.tamagochi.Controller;

import com.greenfox.tamagochi.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  private FoxService foxService;

  @Autowired
  public HomeController(FoxService foxService) {
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

}
