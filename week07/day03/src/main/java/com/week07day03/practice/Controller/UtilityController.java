package com.week07day03.practice.Controller;

import com.week07day03.practice.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @GetMapping("/useful/email")
  public String showEmailValidation(@RequestParam(value = "email") String email, Model model) {
    model.addAttribute("validateEmail", utilityService.validateEmail(email));
    model.addAttribute("emailAddress", email);
    return "email";
  }

  @GetMapping("/useful/encode")
  public String showEncodedMessage(@RequestParam(value = "encode") String encode, @RequestParam(value = "number") int number, Model model) {
    model.addAttribute("caesarString", utilityService.caesar(encode, number));
    return "caesarencode";
  }

  @GetMapping("/useful/decode")
  public String showDecodedMessage(@RequestParam(value = "decode") String decode, @RequestParam(value = "number") int number, Model model) {
    model.addAttribute("caesarString", utilityService.caesar(decode, -number));
    return "caesardecode";
  }

}
