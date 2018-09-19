package com.week07day03.practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GFAController {
  
  @GetMapping("/gfa")
  public String showGFAhome() {
    return "gfahome";
  }

  @GetMapping("/gfa/list")
  public String showGFAstudents() {
    return "gfahomelist";
  }

}
