package com.greenfoxacademy.connectionmysql.Controllers;

import com.greenfoxacademy.connectionmysql.Models.Todo;
import com.greenfoxacademy.connectionmysql.Reporitories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
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

  @GetMapping("/todo")
  public String showTodoForm() {
    return "todo";
  }

  @PostMapping("/todo")
  public String addTodo(@ModelAttribute(value = "title") String title) {
    todoRepository.save(new Todo(title));
    return "redirect:/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable(value = "id") Long id) {
    todoRepository.deleteById(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String showEditForm(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).orElse(null));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String submitEdit(@ModelAttribute(value = "todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/";
  }

}
