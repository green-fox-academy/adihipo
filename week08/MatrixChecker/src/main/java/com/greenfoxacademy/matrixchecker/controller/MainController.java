package com.greenfoxacademy.matrixchecker.controller;

import com.greenfoxacademy.matrixchecker.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private MatrixService matrixService;

  @Autowired
  public MainController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String mainPage() {
    return "main";
  }

  @PostMapping("/matrix")
  public String receiveValidateSaveToDB(@ModelAttribute(value = "matrixAsString") String matrixAsString) {
    if (!matrixService.isMatrixEmpty(matrixAsString) && matrixService.isMatrixSquare(matrixAsString)) {
      String[] matrix = matrixService.createMatrixFromString(matrixAsString);
      if (matrixService.isMatrixIncreasing(matrix)) {
       matrixService.saveMatrix(matrix);
      }
    }
    return "redirect:/";
  }
}
