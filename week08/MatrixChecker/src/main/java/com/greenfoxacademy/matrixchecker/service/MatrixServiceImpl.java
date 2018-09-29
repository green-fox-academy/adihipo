package com.greenfoxacademy.matrixchecker.service;

import com.greenfoxacademy.matrixchecker.repository.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatrixServiceImpl implements MatrixService {

  private MatrixRepository matrixRepository;

  @Autowired
  public MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  @Override
  public boolean isMatrixEmpty(String matrixAsString) {
    return false;
  }

  @Override
  public int[][] createMatrixFromString(String matrixAsString) {
    return new int[0][];
  }

  @Override
  public boolean isMatrixSquare(int[][] matrix) {
    return false;
  }

  @Override
  public boolean isMatrixIncreasing(int[][] matrix) {
    return false;
  }
}
