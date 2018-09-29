package com.greenfoxacademy.matrixchecker.service;

import com.greenfoxacademy.matrixchecker.model.Matrix;
import com.greenfoxacademy.matrixchecker.repository.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatrixServiceImpl implements MatrixService {

  private MatrixRepository matrixRepository;

  @Autowired
  public MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  @Override
  public boolean isMatrixEmpty(String matrixAsString) {
    if (matrixAsString == null) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String[] createMatrixFromString(String matrixAsString) {

    String[] matrix = matrixAsString.split("\\r?\\n");

    return matrix;
  }

  @Override
  public boolean isMatrixSquare(String matrixAsString) {
    return true;
  }

  @Override
  public boolean isMatrixIncreasing(String[] matrix) {
    return true;
  }

  @Override
  public void saveMatrix(String[] matrix) {
    matrixRepository.save(new Matrix(matrix));
  }

  @Override
  public List<Matrix> getAllValidMatricesFromDB() {
    return matrixRepository.findAll();
  }
}
