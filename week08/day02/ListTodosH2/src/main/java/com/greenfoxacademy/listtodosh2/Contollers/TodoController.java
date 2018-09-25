package com.greenfoxacademy.listtodosh2.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @GetMapping("/todo")
  public String showTodo(Model model) {
    return "todo";
  }

  @ResponseBody
  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    return "This is my first todo";
  }

}
