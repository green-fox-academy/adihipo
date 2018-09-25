package com.greenfoxacademy.connectionmysql.Controllers;

import com.greenfoxacademy.connectionmysql.Models.Todo;
import com.greenfoxacademy.connectionmysql.Reporitories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping("/todo")
  public String showTodoForm() {
    return "todo";
  }

  @PostMapping("/todo")
  public String addTodo(@ModelAttribute(value = "title") String title) {
    todoRepository.save(new Todo(title));
    return "redirect:/list";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) String active) {
    if (active == null || active.equals("false")) {
      model.addAttribute("todoList", todoRepository.findAll());
    } else {
      model.addAttribute("todoList", todoRepository.findAllByDoneFalse());
    }
    return "todolist";
  }

}
