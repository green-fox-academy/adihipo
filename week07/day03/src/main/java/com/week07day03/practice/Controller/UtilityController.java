package com.week07day03.practice.Controller;

import com.week07day03.practice.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

  UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String showUsefulUtilities() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showColoredBackground(Model model) {
    model.addAttribute("backgroundColor", utilityService.randomColor());
    return "colored";
  }
}
