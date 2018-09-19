package com.week07day03.practice;

import com.week07day03.practice.Service.MyColor;
import com.week07day03.practice.Service.Printer;
import com.week07day03.practice.Service.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

  private SpellChecker checker;
  private Printer printer;
  private MyColor mycolor;

  @Autowired
  public PracticeApplication(SpellChecker checker, Printer printer, MyColor greenColor) {
    this.checker = checker;
    this.printer = printer;
    this.mycolor = greenColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(PracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    checker.checkSpelling();
    printer.log("hellooooooooo!");
    mycolor.printColor();
  }

}
