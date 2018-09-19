package com.week07day03.practice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

  Printer printer;

  @Autowired
  public GreenColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("GREEEEEN");
  }
}
