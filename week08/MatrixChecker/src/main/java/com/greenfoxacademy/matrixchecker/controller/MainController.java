package com.greenfoxacademy.matrixchecker.controller;

import com.greenfoxacademy.matrixchecker.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private MatrixService matrixService;

  @Autowired
  public MainController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("validation", matrixService.getMessage());
    return "main";
  }

  @PostMapping("/matrix")
  public String receiveValidateSaveToDB(@ModelAttribute(value = "matrixAsString") String matrixAsString) {
    if (!(matrixService.isMatrixEmpty(matrixAsString))) {
      String[] matrix = matrixService.createMatrixFromString(matrixAsString);
      if (matrixService.isMatrixSquare(matrix)) {
        if (matrixService.isMatrixIncreasing(matrix)) {
          matrixService.saveMatrix(matrix);
        }
      }
    }
    return "redirect:/";
  }
}
