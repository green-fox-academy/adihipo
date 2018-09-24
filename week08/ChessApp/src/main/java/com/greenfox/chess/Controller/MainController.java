package com.greenfox.chess.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String showMainPage() {
    return "login";
  }

  @PostMapping("/")
  public String getPlayerInfo() {
    return "redirect:/newgame";
  }

  @GetMapping("/newgame")
  public String showNewGame() {
    return "newgame";
  }

}
