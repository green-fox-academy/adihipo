package com.week07day03.practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

  @GetMapping("/useful")
  public String showUsefulUtilities() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showColoredBackground(){
    return "colored";
  }
}
