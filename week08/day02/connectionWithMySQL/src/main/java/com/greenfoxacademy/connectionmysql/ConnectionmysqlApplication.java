package com.greenfoxacademy.connectionmysql;

import com.greenfoxacademy.connectionmysql.Models.Todo;
import com.greenfoxacademy.connectionmysql.Reporitories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionmysqlApplication implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public ConnectionmysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Use mySQL"));
    todoRepository.save(new Todo("Create databases", true, true));
    todoRepository.save(new Todo("Use Spring JPA", false, true));
    todoRepository.save(new Todo("Drink tea", true, false));
    todoRepository.save(new Todo("Create something", true, true));
    todoRepository.save(new Todo("Getting advices from András", true, true));
  }

}
