package com.greenfoxacademy.matrixchecker.controller;

import com.greenfoxacademy.matrixchecker.model.Matrix;
import com.greenfoxacademy.matrixchecker.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestMatrixController {

  private MatrixService matrixService;

  @Autowired
  public RestMatrixController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/api/matrices")
  public List<Matrix> showValidMatrices() {
    return matrixService.getAllValidMatricesFromDB();
  }

}
