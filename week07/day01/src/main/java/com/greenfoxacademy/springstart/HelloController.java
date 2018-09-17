package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  HelloWorld hello = new HelloWorld();

  @GetMapping("/hello")
  @ResponseBody
  public String welcome() {
    return "Hello WORLD!";
  }
}