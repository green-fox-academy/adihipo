package com.greenfoxacademy.listtodosh2.Contollers;

import com.greenfoxacademy.listtodosh2.Respository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

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
