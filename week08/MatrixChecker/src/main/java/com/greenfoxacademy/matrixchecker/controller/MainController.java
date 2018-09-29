package com.greenfoxacademy.matrixchecker.controller;

import com.greenfoxacademy.matrixchecker.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  private MatrixService matrixService;

  @Autowired
  public MainController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }


}
