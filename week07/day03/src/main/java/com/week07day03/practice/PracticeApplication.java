package com.week07day03.practice;

import com.week07day03.practice.Service.Printer;
import com.week07day03.practice.Service.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

  SpellChecker checker;
  Printer printer;

  @Autowired
  public PracticeApplication(SpellChecker checker, Printer printer) {
    this.checker = checker;
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(PracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    checker.checkSpelling();
    printer.log("hellooooooooo!");
  }
  
}
