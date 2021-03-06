package com.greenfoxacademy.listtodosh2.Contollers;

import com.greenfoxacademy.listtodosh2.Respository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todoList", todoRepository.findAll());
    return "todolist";
  }

}
