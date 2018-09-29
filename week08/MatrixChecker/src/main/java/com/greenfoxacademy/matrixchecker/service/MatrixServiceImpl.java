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
    return matrixAsString.split("\\r?\\n");
  }

  @Override
  public boolean isMatrixSquare(String[] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      if (!(matrix[i].length() == matrix.length)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean isMatrixIncreasing(String[] matrix) {
    String matrixAsPureString = createPureString(matrix);
    for (int i = 0; i < matrixAsPureString.length() - 1; i++) {
      if (!((int) matrixAsPureString.charAt(i) <= (int) matrixAsPureString.charAt(i + 1))) {
        return false;
      }
    }
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

  public String createPureString(String[] matrix) {
    StringBuilder builder = new StringBuilder();
    for (String string : matrix) {
      builder.append(string);
    }
    return builder.toString();
  }
}
