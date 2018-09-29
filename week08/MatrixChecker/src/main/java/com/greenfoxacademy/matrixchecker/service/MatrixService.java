package com.greenfoxacademy.matrixchecker.service;

import com.greenfoxacademy.matrixchecker.model.Matrix;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatrixService {

  boolean isMatrixEmpty(String matrixAsString);

  boolean isMatrixSquare(String[] matrix);

  String[] createMatrixFromString(String matrixAsString);

  boolean isMatrixIncreasing(String[] matrix);

  void saveMatrix(String[] matrix);

  List<Matrix> getAllValidMatricesFromDB();

}
