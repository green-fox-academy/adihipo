package com.week07day03.practice;

import com.week07day03.practice.Service.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

  SpellChecker checker;

  @Autowired
  public PracticeApplication(SpellChecker checker) {
    this.checker = checker;
  }

  public static void main(String[] args) {
    SpringApplication.run(PracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    checker.checkSpelling();
  }
}
