package com.greenfoxacademy.listtodosh2;

import com.greenfoxacademy.listtodosh2.Models.Todo;
import com.greenfoxacademy.listtodosh2.Respository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listtodosh2Application implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public Listtodosh2Application(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Listtodosh2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Do this exercise"));
    todoRepository.save(new Todo("Show this to András"));
    todoRepository.save(new Todo("Do some more exercises"));
  }

}
