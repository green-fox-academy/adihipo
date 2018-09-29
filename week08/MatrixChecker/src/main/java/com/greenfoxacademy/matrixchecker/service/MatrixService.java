package com.greenfoxacademy.matrixchecker.service;

import org.springframework.stereotype.Service;

@Service
public interface MatrixService {

  boolean isMatrixEmpty(String matrixAsString);
  int[][] createMatrixFromString(String matrixAsString);
  boolean isMatrixSquare(int[][] matrix);
  boolean isMatrixIncreasing(int[][] matrix);

}
