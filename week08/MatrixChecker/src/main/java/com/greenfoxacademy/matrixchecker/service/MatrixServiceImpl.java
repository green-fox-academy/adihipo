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

}
